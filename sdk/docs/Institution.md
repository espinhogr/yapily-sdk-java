
# Institution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**fullName** | **String** |  |  [optional]
**countries** | [**List&lt;Country&gt;**](Country.md) |  |  [optional]
**environmentType** | [**EnvironmentTypeEnum**](#EnvironmentTypeEnum) |  |  [optional]
**credentialsType** | [**CredentialsTypeEnum**](#CredentialsTypeEnum) |  |  [optional]
**media** | [**List&lt;Media&gt;**](Media.md) |  |  [optional]
**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) |  |  [optional]
**monitoring** | [**Map&lt;String, MonitoringFeatureStatus&gt;**](MonitoringFeatureStatus.md) |  |  [optional]


<a name="EnvironmentTypeEnum"></a>
## Enum: EnvironmentTypeEnum
Name | Value
---- | -----
SANDBOX | &quot;SANDBOX&quot;
MOCK | &quot;MOCK&quot;
LIVE | &quot;LIVE&quot;


<a name="CredentialsTypeEnum"></a>
## Enum: CredentialsTypeEnum
Name | Value
---- | -----
OAUTH1 | &quot;OAUTH1&quot;
OAUTH2 | &quot;OAUTH2&quot;
OAUTH2_NOSECRET | &quot;OAUTH2_NOSECRET&quot;
OPEN_BANKING | &quot;OPEN_BANKING&quot;
OPEN_BANKING_UK_MANUAL | &quot;OPEN_BANKING_UK_MANUAL&quot;
OPEN_BANKING_UK_AUTO | &quot;OPEN_BANKING_UK_AUTO&quot;
OPEN_BANKING_IBM | &quot;OPEN_BANKING_IBM&quot;
OPEN_BANKING_AUTO | &quot;OPEN_BANKING_AUTO&quot;
OPEN_BANKING_MANUAL | &quot;OPEN_BANKING_MANUAL&quot;
API_KEY | &quot;API_KEY&quot;


<a name="List<FeaturesEnum>"></a>
## Enum: List&lt;FeaturesEnum&gt;
Name | Value
---- | -----
INITIATE_ACCOUNT_REQUEST | &quot;INITIATE_ACCOUNT_REQUEST&quot;
ACCOUNT_REQUEST_DETAILS | &quot;ACCOUNT_REQUEST_DETAILS&quot;
ACCOUNTS | &quot;ACCOUNTS&quot;
ACCOUNT | &quot;ACCOUNT&quot;
ACCOUNT_TRANSACTIONS | &quot;ACCOUNT_TRANSACTIONS&quot;
ACCOUNT_STATEMENTS | &quot;ACCOUNT_STATEMENTS&quot;
ACCOUNT_STATEMENT | &quot;ACCOUNT_STATEMENT&quot;
ACCOUNT_STATEMENT_FILE | &quot;ACCOUNT_STATEMENT_FILE&quot;
ACCOUNT_TRANSACTIONS_WITH_MERCHANT | &quot;ACCOUNT_TRANSACTIONS_WITH_MERCHANT&quot;
IDENTITY | &quot;IDENTITY&quot;
INITIATE_SINGLE_PAYMENT_SORTCODE | &quot;INITIATE_SINGLE_PAYMENT_SORTCODE&quot;
EXISTING_PAYMENT_INITIATION_DETAILS | &quot;EXISTING_PAYMENT_INITIATION_DETAILS&quot;
CREATE_SINGLE_PAYMENT_SORTCODE | &quot;CREATE_SINGLE_PAYMENT_SORTCODE&quot;
EXISTING_PAYMENTS_DETAILS | &quot;EXISTING_PAYMENTS_DETAILS&quot;
INITIATE_PAYMENT | &quot;INITIATE_PAYMENT&quot;
CREATE_PAYMENT | &quot;CREATE_PAYMENT&quot;
TRANSFER | &quot;TRANSFER&quot;
OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS | &quot;OPEN_DATA_PERSONAL_CURRENT_ACCOUNTS&quot;
OPEN_DATA_ATMS | &quot;OPEN_DATA_ATMS&quot;



