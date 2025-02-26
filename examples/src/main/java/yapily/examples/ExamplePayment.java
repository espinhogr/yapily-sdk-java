package yapily.examples;

import java.awt.Desktop;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import yapily.ApiClient;
import yapily.auth.OAuth;
import yapily.sdk.ApiResponseOfAuthorisationRequestResponse;
import yapily.sdk.ApiResponseOfPaymentResponse;
import yapily.sdk.ApplicationUser;
import yapily.sdk.ApplicationUsersApi;
import yapily.sdk.Consent;
import yapily.sdk.ConsentsApi;
import yapily.sdk.NewApplicationUser;
import yapily.sdk.PaymentResponse;
import yapily.sdk.PaymentsApi;
import yapily.sdk.SortCodePaymentAuthRequest;
import yapily.sdk.SortCodePaymentRequest;

public class ExamplePayment {

    private static final String INSTITUTION_ID = "forgerock-sandbox";

    public static void main(String[] args) throws Exception {
        // Set access credentials
        ApiClient defaultClient = new ApiClient();

        OAuth oAuth = (OAuth) defaultClient.getAuthentication("tokenAuth");
        oAuth.setAccessToken(AuthorizationUtils.createAccessToken());

        System.out.println("Configured application credentials for API: " + defaultClient.getBasePath());

        final ApplicationUsersApi usersApi = new ApplicationUsersApi();

        NewApplicationUser user = new NewApplicationUser();
        /**
         * Add a unique identifier for your user
         */
        user.setReferenceId("bojack123");
        usersApi.addUserUsingPOST(user);

        System.out.println("Adding new user [Bojack] with POST /users");
        final ApplicationUser applicationUser = usersApi.addUserUsingPOST(user);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("Created user:");
        System.out.println(gson.toJson(applicationUser));

        // Set user variable
        String userUuid = applicationUser.getUuid();

        PaymentsApi paymentsApi = new PaymentsApi();

        SortCodePaymentAuthRequest authRequest = sortCodePaymentRequest(userUuid,INSTITUTION_ID);
        SortCodePaymentRequest sortCodePaymentRequest = authRequest.getPaymentRequest();

        ApiResponseOfAuthorisationRequestResponse authorizationResponse = paymentsApi.createPaymentInitiationUsingPOST(authRequest);

        URI url = new URI(authorizationResponse.getData().getAuthorisationUrl());

        if (Desktop.isDesktopSupported()) {
            try {
                System.out.println("Opening browser with auth url.");
                Desktop.getDesktop().browse(url);

                // After authentication, you should be redirected to a static page that can be closed
                System.out.println("After completing authentication, press Enter to continue: [enter]");
                System.in.read();

                // Get user consents
                final ConsentsApi consentsApi = new ConsentsApi();

                System.out.println("Reading user consents filtered by institution [" + INSTITUTION_ID +
                                       "] with GET /users/{userUuid}/consents?institutionId={institutionId}");
                Consent consent = consentsApi.getUserConsentsUsingGET(userUuid, INSTITUTION_ID)
                                             .stream()
                                             .findFirst()
                                             .orElseThrow(() -> new RuntimeException(String.format("No consent token present for user %s", userUuid)));

                final String consentToken = consent.getConsentToken();

                ApiResponseOfPaymentResponse response = paymentsApi.createPaymentUsingPOST(consentToken,sortCodePaymentRequest);

                System.out.println("Payment submitted");

                PaymentResponse.StatusEnum status = response.getData().getStatus();

                while (status == PaymentResponse.StatusEnum.PENDING) {
                    ApiResponseOfPaymentResponse apiResponseOfPaymentResponse = paymentsApi.getPaymentStatusUsingGET(response.getData().getId(), consentToken);
                    status = apiResponseOfPaymentResponse.getData().getStatus();
                    Thread.sleep(1000);
                }

                System.out.println("Payment was executed with status: "+status);

            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static SortCodePaymentAuthRequest sortCodePaymentRequest(String userUUID,String institutionId) {
        SortCodePaymentAuthRequest sortCodePaymentAuthRequest = new SortCodePaymentAuthRequest();
        sortCodePaymentAuthRequest.setInstitutionId(institutionId);
        sortCodePaymentAuthRequest.setUserUuid(userUUID);
        sortCodePaymentAuthRequest.setPaymentRequest(sortCodePaymentRequest());
        return sortCodePaymentAuthRequest;
    }

    private static SortCodePaymentRequest sortCodePaymentRequest() {
        SortCodePaymentRequest sortCodePaymentRequest = new SortCodePaymentRequest();
        sortCodePaymentRequest.setName("name");
        sortCodePaymentRequest.setAmount(new BigDecimal("2.9"));
        sortCodePaymentRequest.setReference("Up to 35 characters");
        sortCodePaymentRequest.setCountry("GB");
        sortCodePaymentRequest.setCurrency("GBP");
        sortCodePaymentRequest.setAccountNumber("accountNumber");
        sortCodePaymentRequest.setSortCode("123456");
        return sortCodePaymentRequest;
    }

}
