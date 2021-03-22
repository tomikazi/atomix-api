# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/management/driver/driver.proto](#atomix/management/driver/driver.proto)
    - [AddPrimitiveRequest](#atomix.management.driver.AddPrimitiveRequest)
    - [AddPrimitiveResponse](#atomix.management.driver.AddPrimitiveResponse)
    - [ConfigureDriverRequest](#atomix.management.driver.ConfigureDriverRequest)
    - [ConfigureDriverResponse](#atomix.management.driver.ConfigureDriverResponse)
    - [DriverConfig](#atomix.management.driver.DriverConfig)
    - [PrimitiveConfig](#atomix.management.driver.PrimitiveConfig)
    - [PrimitiveId](#atomix.management.driver.PrimitiveId)
    - [ProxyConfig](#atomix.management.driver.ProxyConfig)
    - [RemovePrimitiveRequest](#atomix.management.driver.RemovePrimitiveRequest)
    - [RemovePrimitiveResponse](#atomix.management.driver.RemovePrimitiveResponse)
  
  
  
    - [DriverManagementService](#atomix.management.driver.DriverManagementService)
    - [PrimitiveManagementService](#atomix.management.driver.PrimitiveManagementService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/management/driver/driver.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/driver/driver.proto



<a name="atomix.management.driver.AddPrimitiveRequest"></a>

### AddPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveConfig](#atomix.management.driver.PrimitiveConfig) |  |  |






<a name="atomix.management.driver.AddPrimitiveResponse"></a>

### AddPrimitiveResponse







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






<a name="atomix.management.driver.PrimitiveConfig"></a>

### PrimitiveConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [PrimitiveId](#atomix.management.driver.PrimitiveId) |  |  |
| proxy | [ProxyConfig](#atomix.management.driver.ProxyConfig) |  |  |






<a name="atomix.management.driver.PrimitiveId"></a>

### PrimitiveId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.management.driver.ProxyConfig"></a>

### ProxyConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read | [bool](#bool) |  |  |
| write | [bool](#bool) |  |  |
| cache | [bool](#bool) |  |  |






<a name="atomix.management.driver.RemovePrimitiveRequest"></a>

### RemovePrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.management.driver.PrimitiveId) |  |  |






<a name="atomix.management.driver.RemovePrimitiveResponse"></a>

### RemovePrimitiveResponse






 

 

 


<a name="atomix.management.driver.DriverManagementService"></a>

### DriverManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| ConfigureDriver | [ConfigureDriverRequest](#atomix.management.driver.ConfigureDriverRequest) | [ConfigureDriverResponse](#atomix.management.driver.ConfigureDriverResponse) |  |


<a name="atomix.management.driver.PrimitiveManagementService"></a>

### PrimitiveManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddPrimitive | [AddPrimitiveRequest](#atomix.management.driver.AddPrimitiveRequest) | [AddPrimitiveResponse](#atomix.management.driver.AddPrimitiveResponse) |  |
| RemovePrimitive | [RemovePrimitiveRequest](#atomix.management.driver.RemovePrimitiveRequest) | [RemovePrimitiveResponse](#atomix.management.driver.RemovePrimitiveResponse) |  |

 



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

