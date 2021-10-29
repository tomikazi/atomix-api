# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/management/broker/v1/broker.proto](#atomix/management/broker/v1/broker.proto)
    - [LookupPrimitiveRequest](#atomix.management.broker.v1.LookupPrimitiveRequest)
    - [LookupPrimitiveResponse](#atomix.management.broker.v1.LookupPrimitiveResponse)
    - [PrimitiveAddress](#atomix.management.broker.v1.PrimitiveAddress)
    - [PrimitiveId](#atomix.management.broker.v1.PrimitiveId)
    - [RegisterPrimitiveRequest](#atomix.management.broker.v1.RegisterPrimitiveRequest)
    - [RegisterPrimitiveResponse](#atomix.management.broker.v1.RegisterPrimitiveResponse)
    - [UnregisterPrimitiveRequest](#atomix.management.broker.v1.UnregisterPrimitiveRequest)
    - [UnregisterPrimitiveResponse](#atomix.management.broker.v1.UnregisterPrimitiveResponse)
  
    - [Broker](#atomix.management.broker.v1.Broker)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/management/broker/v1/broker.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/broker/v1/broker.proto



<a name="atomix.management.broker.v1.LookupPrimitiveRequest"></a>

### LookupPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.management.broker.v1.PrimitiveId) |  |  |






<a name="atomix.management.broker.v1.LookupPrimitiveResponse"></a>

### LookupPrimitiveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address | [PrimitiveAddress](#atomix.management.broker.v1.PrimitiveAddress) |  |  |






<a name="atomix.management.broker.v1.PrimitiveAddress"></a>

### PrimitiveAddress



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.management.broker.v1.PrimitiveId"></a>

### PrimitiveId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="atomix.management.broker.v1.RegisterPrimitiveRequest"></a>

### RegisterPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.management.broker.v1.PrimitiveId) |  |  |
| address | [PrimitiveAddress](#atomix.management.broker.v1.PrimitiveAddress) |  |  |






<a name="atomix.management.broker.v1.RegisterPrimitiveResponse"></a>

### RegisterPrimitiveResponse







<a name="atomix.management.broker.v1.UnregisterPrimitiveRequest"></a>

### UnregisterPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.management.broker.v1.PrimitiveId) |  |  |






<a name="atomix.management.broker.v1.UnregisterPrimitiveResponse"></a>

### UnregisterPrimitiveResponse






 

 

 


<a name="atomix.management.broker.v1.Broker"></a>

### Broker


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| RegisterPrimitive | [RegisterPrimitiveRequest](#atomix.management.broker.v1.RegisterPrimitiveRequest) | [RegisterPrimitiveResponse](#atomix.management.broker.v1.RegisterPrimitiveResponse) |  |
| UnregisterPrimitive | [UnregisterPrimitiveRequest](#atomix.management.broker.v1.UnregisterPrimitiveRequest) | [UnregisterPrimitiveResponse](#atomix.management.broker.v1.UnregisterPrimitiveResponse) |  |
| LookupPrimitive | [LookupPrimitiveRequest](#atomix.management.broker.v1.LookupPrimitiveRequest) | [LookupPrimitiveResponse](#atomix.management.broker.v1.LookupPrimitiveResponse) |  |

 



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

