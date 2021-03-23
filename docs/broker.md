# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/management/broker/broker.proto](#atomix/management/broker/broker.proto)
    - [AddDriverRequest](#atomix.management.broker.AddDriverRequest)
    - [AddDriverResponse](#atomix.management.broker.AddDriverResponse)
    - [AddPrimitiveRequest](#atomix.management.broker.AddPrimitiveRequest)
    - [AddPrimitiveResponse](#atomix.management.broker.AddPrimitiveResponse)
    - [DriverConfig](#atomix.management.broker.DriverConfig)
    - [DriverId](#atomix.management.broker.DriverId)
    - [PrimitiveConfig](#atomix.management.broker.PrimitiveConfig)
    - [PrimitiveId](#atomix.management.broker.PrimitiveId)
    - [ProxyConfig](#atomix.management.broker.ProxyConfig)
    - [RemoveDriverRequest](#atomix.management.broker.RemoveDriverRequest)
    - [RemoveDriverResponse](#atomix.management.broker.RemoveDriverResponse)
    - [RemovePrimitiveRequest](#atomix.management.broker.RemovePrimitiveRequest)
    - [RemovePrimitiveResponse](#atomix.management.broker.RemovePrimitiveResponse)
    - [StorageConfig](#atomix.management.broker.StorageConfig)
    - [UpdateDriverRequest](#atomix.management.broker.UpdateDriverRequest)
    - [UpdateDriverResponse](#atomix.management.broker.UpdateDriverResponse)
  
  
  
    - [DriverManagementService](#atomix.management.broker.DriverManagementService)
    - [PrimitiveManagementService](#atomix.management.broker.PrimitiveManagementService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/management/broker/broker.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/broker/broker.proto



<a name="atomix.management.broker.AddDriverRequest"></a>

### AddDriverRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [DriverConfig](#atomix.management.broker.DriverConfig) |  |  |






<a name="atomix.management.broker.AddDriverResponse"></a>

### AddDriverResponse







<a name="atomix.management.broker.AddPrimitiveRequest"></a>

### AddPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveConfig](#atomix.management.broker.PrimitiveConfig) |  |  |






<a name="atomix.management.broker.AddPrimitiveResponse"></a>

### AddPrimitiveResponse







<a name="atomix.management.broker.DriverConfig"></a>

### DriverConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [DriverId](#atomix.management.broker.DriverId) |  |  |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |
| protocol | [atomix.protocol.ProtocolConfig](#atomix.protocol.ProtocolConfig) |  |  |






<a name="atomix.management.broker.DriverId"></a>

### DriverId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.management.broker.PrimitiveConfig"></a>

### PrimitiveConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [PrimitiveId](#atomix.management.broker.PrimitiveId) |  |  |
| driver | [DriverId](#atomix.management.broker.DriverId) |  |  |
| proxy | [ProxyConfig](#atomix.management.broker.ProxyConfig) |  |  |






<a name="atomix.management.broker.PrimitiveId"></a>

### PrimitiveId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.management.broker.ProxyConfig"></a>

### ProxyConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read | [bool](#bool) |  |  |
| write | [bool](#bool) |  |  |






<a name="atomix.management.broker.RemoveDriverRequest"></a>

### RemoveDriverRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver_id | [DriverId](#atomix.management.broker.DriverId) |  |  |






<a name="atomix.management.broker.RemoveDriverResponse"></a>

### RemoveDriverResponse







<a name="atomix.management.broker.RemovePrimitiveRequest"></a>

### RemovePrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.management.broker.PrimitiveId) |  |  |






<a name="atomix.management.broker.RemovePrimitiveResponse"></a>

### RemovePrimitiveResponse







<a name="atomix.management.broker.StorageConfig"></a>

### StorageConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.management.broker.UpdateDriverRequest"></a>

### UpdateDriverRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [DriverConfig](#atomix.management.broker.DriverConfig) |  |  |






<a name="atomix.management.broker.UpdateDriverResponse"></a>

### UpdateDriverResponse






 

 

 


<a name="atomix.management.broker.DriverManagementService"></a>

### DriverManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddDriver | [AddDriverRequest](#atomix.management.broker.AddDriverRequest) | [AddDriverResponse](#atomix.management.broker.AddDriverResponse) |  |
| UpdateDriver | [UpdateDriverRequest](#atomix.management.broker.UpdateDriverRequest) | [UpdateDriverResponse](#atomix.management.broker.UpdateDriverResponse) |  |
| RemoveDriver | [RemoveDriverRequest](#atomix.management.broker.RemoveDriverRequest) | [RemoveDriverResponse](#atomix.management.broker.RemoveDriverResponse) |  |


<a name="atomix.management.broker.PrimitiveManagementService"></a>

### PrimitiveManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddPrimitive | [AddPrimitiveRequest](#atomix.management.broker.AddPrimitiveRequest) | [AddPrimitiveResponse](#atomix.management.broker.AddPrimitiveResponse) |  |
| RemovePrimitive | [RemovePrimitiveRequest](#atomix.management.broker.RemovePrimitiveRequest) | [RemovePrimitiveResponse](#atomix.management.broker.RemovePrimitiveResponse) |  |

 



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

