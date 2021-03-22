# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/management/driver/driver.proto](#atomix/management/driver/driver.proto)
    - [AddProxyRequest](#atomix.management.driver.AddProxyRequest)
    - [AddProxyResponse](#atomix.management.driver.AddProxyResponse)
    - [ConfigureDriverRequest](#atomix.management.driver.ConfigureDriverRequest)
    - [ConfigureDriverResponse](#atomix.management.driver.ConfigureDriverResponse)
    - [DriverConfig](#atomix.management.driver.DriverConfig)
    - [ProxyConfig](#atomix.management.driver.ProxyConfig)
    - [ProxyId](#atomix.management.driver.ProxyId)
    - [RemoveProxyRequest](#atomix.management.driver.RemoveProxyRequest)
    - [RemoveProxyResponse](#atomix.management.driver.RemoveProxyResponse)
  
  
  
    - [DriverManagementService](#atomix.management.driver.DriverManagementService)
    - [ProxyManagementService](#atomix.management.driver.ProxyManagementService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/management/driver/driver.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/driver/driver.proto



<a name="atomix.management.driver.AddProxyRequest"></a>

### AddProxyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| proxy | [ProxyConfig](#atomix.management.driver.ProxyConfig) |  |  |






<a name="atomix.management.driver.AddProxyResponse"></a>

### AddProxyResponse







<a name="atomix.management.driver.ConfigureDriverRequest"></a>

### ConfigureDriverRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [DriverConfig](#atomix.management.driver.DriverConfig) |  |  |






<a name="atomix.management.driver.ConfigureDriverResponse"></a>

### ConfigureDriverResponse







<a name="atomix.management.driver.DriverConfig"></a>

### DriverConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| protocol | [atomix.protocol.ProtocolConfig](#atomix.protocol.ProtocolConfig) |  |  |






<a name="atomix.management.driver.ProxyConfig"></a>

### ProxyConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [ProxyId](#atomix.management.driver.ProxyId) |  |  |
| read | [bool](#bool) |  |  |
| write | [bool](#bool) |  |  |
| cache | [bool](#bool) |  |  |






<a name="atomix.management.driver.ProxyId"></a>

### ProxyId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.management.driver.RemoveProxyRequest"></a>

### RemoveProxyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| proxy_id | [ProxyId](#atomix.management.driver.ProxyId) |  |  |






<a name="atomix.management.driver.RemoveProxyResponse"></a>

### RemoveProxyResponse






 

 

 


<a name="atomix.management.driver.DriverManagementService"></a>

### DriverManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| ConfigureDriver | [ConfigureDriverRequest](#atomix.management.driver.ConfigureDriverRequest) | [ConfigureDriverResponse](#atomix.management.driver.ConfigureDriverResponse) |  |


<a name="atomix.management.driver.ProxyManagementService"></a>

### ProxyManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddProxy | [AddProxyRequest](#atomix.management.driver.AddProxyRequest) | [AddProxyResponse](#atomix.management.driver.AddProxyResponse) |  |
| RemoveProxy | [RemoveProxyRequest](#atomix.management.driver.RemoveProxyRequest) | [RemoveProxyResponse](#atomix.management.driver.RemoveProxyResponse) |  |

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

