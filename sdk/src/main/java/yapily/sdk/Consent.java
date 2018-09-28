/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.35
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package yapily.sdk;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Consent
 */
@Data
public class Consent {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("userUuid")
  private String userUuid = null;

  @JsonProperty("institutionId")
  private String institutionId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AWAITING_AUTHORIZATION("AWAITING_AUTHORIZATION"),
    
    AUTHORIZED("AUTHORIZED"),
    
    REJECTED("REJECTED"),
    
    REVOKED("REVOKED"),
    
    FAILED("FAILED"),
    
    EXPIRED("EXPIRED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("timeToExpireInMillis")
  private Long timeToExpireInMillis = null;

  /**
   * Gets or Sets featureScope
   */
  public enum FeatureScopeEnum {
    INITIATE_ACCOUNT_REQUEST("INITIATE_ACCOUNT_REQUEST"),
    
    ACCOUNT_REQUEST_DETAILS("ACCOUNT_REQUEST_DETAILS"),
    
    ACCOUNTS("ACCOUNTS"),
    
    ACCOUNT("ACCOUNT"),
    
    ACCOUNT_TRANSACTIONS("ACCOUNT_TRANSACTIONS"),
    
    ACCOUNT_TRANSACTIONS_WITH_MERCHANT("ACCOUNT_TRANSACTIONS_WITH_MERCHANT"),
    
    IDENTITY("IDENTITY"),
    
    INITIATE_SINGLE_PAYMENT_SORTCODE("INITIATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENT_INITIATION_DETAILS("EXISTING_PAYMENT_INITIATION_DETAILS"),
    
    CREATE_SINGLE_PAYMENT_SORTCODE("CREATE_SINGLE_PAYMENT_SORTCODE"),
    
    EXISTING_PAYMENTS_DETAILS("EXISTING_PAYMENTS_DETAILS"),
    
    TRANSFER("TRANSFER"),
    
    OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS("OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS"),
    
    OPEN_DATA_ATMS("OPEN_DATA_ATMS");

    private String value;

    FeatureScopeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeatureScopeEnum fromValue(String text) {
      for (FeatureScopeEnum b : FeatureScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("featureScope")
  private List<FeatureScopeEnum> featureScope = null;

  @JsonProperty("consentToken")
  private String consentToken = null;

}

