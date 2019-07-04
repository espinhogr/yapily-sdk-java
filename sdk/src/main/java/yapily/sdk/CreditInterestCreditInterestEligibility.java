/*
 * Yapily API
 * To access endpoints that require authentication, use your application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.120
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
import yapily.sdk.OtherType;

/**
 * Eligibility for credit interest
 */
@ApiModel(description = "Eligibility for credit interest")
@Data
public class CreditInterestCreditInterestEligibility {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Indicator")
  private Boolean indicator = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Notes")
  private List<String> notes = null;

  @JsonProperty("OtherType")
  private OtherType otherType = null;

  /**
   * Gets or Sets period
   */
  public enum PeriodEnum {
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    ACADEMICTERM("AcademicTerm"),
    
    YEAR("Year");

    private String value;

    PeriodEnum(String value) {
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
    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Period")
  private PeriodEnum period = null;

  @JsonProperty("Textual")
  private String textual = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DIRECTDEBITS("DirectDebits"),
    
    EXISTINGCUSTOMERS("ExistingCustomers"),
    
    MINIMUMOPERATINGBALANCE("MinimumOperatingBalance"),
    
    MINIMUMDEPOSIT("MinimumDeposit"),
    
    NEWCUSTOMERSONLY("NewCustomersOnly"),
    
    PREVIOUSBANKRUPTCYALLOWED("PreviousBankruptcyAllowed"),
    
    OTHER("Other"),
    
    STUDENTSONLY("StudentsOnly"),
    
    SOLESTUDENTACCOUNT("SoleStudentAccount"),
    
    SOLEUKACCOUNT("SoleUkAccount"),
    
    SWITCHERSONLY("SwitchersOnly"),
    
    UCASFULLTIMETWOYEARS("UCASFulltimeTwoYears");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

}

