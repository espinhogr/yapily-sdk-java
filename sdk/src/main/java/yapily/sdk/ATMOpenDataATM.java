/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.106
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
import java.util.ArrayList;
import java.util.List;
import yapily.sdk.ATMBranch;
import yapily.sdk.ATMLocation;
import yapily.sdk.ATMOpenDataOtherATMServices;
import yapily.sdk.ATMOpenDataOtherAccessibility;

/**
 * ATM information.
 */
@ApiModel(description = "ATM information.")
@Data
public class ATMOpenDataATM {
  @JsonProperty("Access24HoursIndicator")
  private Boolean access24HoursIndicator = null;

  /**
   * Gets or Sets accessibility
   */
  public enum AccessibilityEnum {
    AUDIOCASHMACHINE("AudioCashMachine"),
    
    AUTOMATICDOORS("AutomaticDoors"),
    
    EXTERNALRAMP("ExternalRamp"),
    
    INDUCTIONLOOP("InductionLoop"),
    
    INTERNALRAMP("InternalRamp"),
    
    LEVELACCESS("LevelAccess"),
    
    LOWERLEVELCOUNTER("LowerLevelCounter"),
    
    OTHER("Other"),
    
    WHEELCHAIRACCESS("WheelchairAccess");

    private String value;

    AccessibilityEnum(String value) {
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
    public static AccessibilityEnum fromValue(String text) {
      for (AccessibilityEnum b : AccessibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Accessibility")
  private List<AccessibilityEnum> accessibility = null;

  @JsonProperty("Branch")
  private ATMBranch branch = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("Location")
  private ATMLocation location = null;

  @JsonProperty("MinimumPossibleAmount")
  private String minimumPossibleAmount = null;

  @JsonProperty("Note")
  private String note = null;

  @JsonProperty("OtherATMServices")
  private List<ATMOpenDataOtherATMServices> otherATMServices = null;

  @JsonProperty("OtherAccessibility")
  private List<ATMOpenDataOtherAccessibility> otherAccessibility = null;

  /**
   * Gets or Sets services
   */
  public enum ServicesEnum {
    BALANCE("Balance"),
    
    BILLPAYMENTS("BillPayments"),
    
    CASHDEPOSITS("CashDeposits"),
    
    CHARITYDONATION("CharityDonation"),
    
    CHEQUEDEPOSITS("ChequeDeposits"),
    
    CASHWITHDRAWAL("CashWithdrawal"),
    
    ENVELOPEDEPOSIT("EnvelopeDeposit"),
    
    FASTCASH("FastCash"),
    
    MOBILEBANKINGREGISTRATION("MobileBankingRegistration"),
    
    MOBILEPAYMENTREGISTRATION("MobilePaymentRegistration"),
    
    MOBILEPHONETOPUP("MobilePhoneTopUp"),
    
    ORDERSTATEMENT("OrderStatement"),
    
    OTHER("Other"),
    
    PINACTIVATION("PINActivation"),
    
    PINCHANGE("PINChange"),
    
    PINUNBLOCK("PINUnblock"),
    
    MINISTATEMENT("MiniStatement");

    private String value;

    ServicesEnum(String value) {
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
    public static ServicesEnum fromValue(String text) {
      for (ServicesEnum b : ServicesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Services")
  private List<ServicesEnum> services = null;

  @JsonProperty("SupportedCurrencies")
  private List<String> supportedCurrencies = null;

  @JsonProperty("SupportedLanguages")
  private List<String> supportedLanguages = null;

}

