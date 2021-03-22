# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/management/coordinator/coordinator.proto](#atomix/management/coordinator/coordinator.proto)
    - [AddDriverRequest](#atomix.management.coordinator.AddDriverRequest)
    - [AddDriverResponse](#atomix.management.coordinator.AddDriverResponse)
    - [AddPrimitiveRequest](#atomix.management.coordinator.AddPrimitiveRequest)
    - [AddPrimitiveResponse](#atomix.management.coordinator.AddPrimitiveResponse)
    - [DriverConfig](#atomix.management.coordinator.DriverConfig)
    - [DriverId](#atomix.management.coordinator.DriverId)
    - [PrimitiveConfig](#atomix.management.coordinator.PrimitiveConfig)
    - [PrimitiveId](#atomix.management.coordinator.PrimitiveId)
    - [ProxyConfig](#atomix.management.coordinator.ProxyConfig)
    - [RemoveDriverRequest](#atomix.management.coordinator.RemoveDriverRequest)
    - [RemoveDriverResponse](#atomix.management.coordinator.RemoveDriverResponse)
    - [RemovePrimitiveRequest](#atomix.management.coordinator.RemovePrimitiveRequest)
    - [RemovePrimitiveResponse](#atomix.management.coordinator.RemovePrimitiveResponse)
    - [StorageConfig](#atomix.management.coordinator.StorageConfig)
  
  
  
    - [DriverManagementService](#atomix.management.coordinator.DriverManagementService)
    - [PrimitiveManagementService](#atomix.management.coordinator.PrimitiveManagementService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/management/coordinator/coordinator.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/coordinator/coordinator.proto



<a name="atomix.management.coordinator.AddDriverRequest"></a>

### AddDriverRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver | [DriverConfig](#atomix.management.coordinator.DriverConfig) |  |  |






<a name="atomix.management.coordinator.AddDriverResponse"></a>

### AddDriverResponse







<a name="atomix.management.coordinator.AddPrimitiveRequest"></a>

### AddPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveConfig](#atomix.management.coordinator.PrimitiveConfig) |  |  |






<a name="atomix.management.coordinator.AddPrimitiveResponse"></a>

### AddPrimitiveResponse







<a name="atomix.management.coordinator.DriverConfig"></a>

### DriverConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [DriverId](#atomix.management.coordinator.DriverId) |  |  |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |
| protocol | [atomix.protocol.ProtocolConfig](#atomix.protocol.ProtocolConfig) |  |  |






<a name="atomix.management.coordinator.DriverId"></a>

### DriverId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.management.coordinator.PrimitiveConfig"></a>

### PrimitiveConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [PrimitiveId](#atomix.management.coordinator.PrimitiveId) |  |  |
| driver | [DriverId](#atomix.management.coordinator.DriverId) |  |  |
| proxy | [ProxyConfig](#atomix.management.coordinator.ProxyConfig) |  |  |






<a name="atomix.management.coordinator.PrimitiveId"></a>

### PrimitiveId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.management.coordinator.ProxyConfig"></a>

### ProxyConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read | [bool](#bool) |  |  |
| write | [bool](#bool) |  |  |
| cache | [bool](#bool) |  |  |






<a name="atomix.management.coordinator.RemoveDriverRequest"></a>

### RemoveDriverRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| driver_id | [DriverId](#atomix.management.coordinator.DriverId) |  |  |






<a name="atomix.management.coordinator.RemoveDriverResponse"></a>

### RemoveDriverResponse







<a name="atomix.management.coordinator.RemovePrimitiveRequest"></a>

### RemovePrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.management.coordinator.PrimitiveId) |  |  |






<a name="atomix.management.coordinator.RemovePrimitiveResponse"></a>

### RemovePrimitiveResponse







<a name="atomix.management.coordinator.StorageConfig"></a>

### StorageConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |





 

 

 


<a name="atomix.management.coordinator.DriverManagementService"></a>

### DriverManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddDriver | [AddDriverRequest](#atomix.management.coordinator.AddDriverRequest) | [AddDriverResponse](#atomix.management.coordinator.AddDriverResponse) |  |
| RemoveDriver | [RemoveDriverRequest](#atomix.management.coordinator.RemoveDriverRequest) | [RemoveDriverResponse](#atomix.management.coordinator.RemoveDriverResponse) |  |


<a name="atomix.management.coordinator.PrimitiveManagementService"></a>

### PrimitiveManagementService


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddPrimitive | [AddPrimitiveRequest](#atomix.management.coordinator.AddPrimitiveRequest) | [AddPrimitiveResponse](#atomix.management.coordinator.AddPrimitiveResponse) |  |
| RemovePrimitive | [RemovePrimitiveRequest](#atomix.management.coordinator.RemovePrimitiveRequest) | [RemovePrimitiveResponse](#atomix.management.coordinator.RemovePrimitiveResponse) |  |

 



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

