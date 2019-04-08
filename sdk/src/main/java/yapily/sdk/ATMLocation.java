/*
 * Yapily API
 * To access endpoints that require authentication, use your Application key and secret created in the Dashboard (https://dashboard.yapily.com)
 *
 * OpenAPI spec version: 0.0.100
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
import yapily.sdk.ATMLocationOtherLocationCategory;
import yapily.sdk.ATMMapServiceLinks;
import yapily.sdk.ATMPostalAddress;
import yapily.sdk.ATMSite;

/**
 * Location of the ATM.
 */
@ApiModel(description = "Location of the ATM.")
@Data
public class ATMLocation {
  /**
   * Gets or Sets locationCategory
   */
  public enum LocationCategoryEnum {
    BRANCHEXTERNAL("BranchExternal"),
    
    BRANCHINTERNAL("BranchInternal"),
    
    BRANCHLOBBY("BranchLobby"),
    
    OTHER("Other"),
    
    RETAILEROUTLET("RetailerOutlet"),
    
    REMOTEUNIT("RemoteUnit");

    private String value;

    LocationCategoryEnum(String value) {
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
    public static LocationCategoryEnum fromValue(String text) {
      for (LocationCategoryEnum b : LocationCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("LocationCategory")
  private List<LocationCategoryEnum> locationCategory = null;

  @JsonProperty("OtherLocationCategory")
  private List<ATMLocationOtherLocationCategory> otherLocationCategory = null;

  @JsonProperty("PostalAddress")
  private ATMPostalAddress postalAddress = null;

  @JsonProperty("Site")
  private ATMSite site = null;

  @JsonProperty("mapServiceLinks")
  private ATMMapServiceLinks mapServiceLinks = null;

}

