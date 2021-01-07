# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/descriptor.proto](#atomix/primitive/descriptor.proto)
  
    - [AggregateStrategy](#atomix.primitive.AggregateStrategy)
    - [OperationType](#atomix.primitive.OperationType)
    - [PartitionStrategy](#atomix.primitive.PartitionStrategy)
  
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
    - [File-level Extensions](#atomix/primitive/descriptor.proto-extensions)
  
  

- [atomix/primitive/primitive.proto](#atomix/primitive/primitive.proto)
    - [CloseRequest](#atomix.primitive.CloseRequest)
    - [CloseResponse](#atomix.primitive.CloseResponse)
    - [OpenRequest](#atomix.primitive.OpenRequest)
    - [OpenResponse](#atomix.primitive.OpenResponse)
    - [PrimitiveId](#atomix.primitive.PrimitiveId)
    - [RequestHeader](#atomix.primitive.RequestHeader)
    - [ResponseHeader](#atomix.primitive.ResponseHeader)
  
    - [RequestType](#atomix.primitive.RequestType)
    - [ResponseType](#atomix.primitive.ResponseType)
  
  
    - [PrimitiveService](#atomix.primitive.PrimitiveService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/descriptor.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/descriptor.proto


 


<a name="atomix.primitive.AggregateStrategy"></a>

### AggregateStrategy
AggregateStrategy is an enum for indicating the strategy used to aggregate a field

| Name | Number | Description |
| ---- | ------ | ----------- |
| CHOOSE_FIRST | 0 |  |
| APPEND | 1 |  |
| SUM | 2 |  |



<a name="atomix.primitive.OperationType"></a>

### OperationType
OperationType is an enum for specifying the type of operation

| Name | Number | Description |
| ---- | ------ | ----------- |
| COMMAND | 0 |  |
| QUERY | 1 |  |
| SNAPSHOT | 2 |  |
| RESTORE | 3 |  |



<a name="atomix.primitive.PartitionStrategy"></a>

### PartitionStrategy
PartitionStrategy is an enum for indicating the strategy used to partition a primitive

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| HASH | 1 |  |
| RANGE | 2 |  |
| RANDOM | 3 |  |
| ROUND_ROBIN | 4 |  |


 


<a name="atomix/primitive/descriptor.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| aggregate | AggregateStrategy | .google.protobuf.FieldOptions | 52005 |  |
| header | bool | .google.protobuf.FieldOptions | 52000 |  |
| input | bool | .google.protobuf.FieldOptions | 52001 |  |
| output | bool | .google.protobuf.FieldOptions | 52002 |  |
| partitionkey | bool | .google.protobuf.FieldOptions | 52003 |  |
| partitionrange | bool | .google.protobuf.FieldOptions | 52004 |  |
| async | bool | .google.protobuf.MethodOptions | 51003 |  |
| opname | string | .google.protobuf.MethodOptions | 51000 |  |
| optype | OperationType | .google.protobuf.MethodOptions | 51001 |  |
| partitionby | PartitionStrategy | .google.protobuf.MethodOptions | 51002 |  |
| partition | bool | .google.protobuf.ServiceOptions | 50001 |  |
| type | string | .google.protobuf.ServiceOptions | 50000 |  |

 

 



<a name="atomix/primitive/primitive.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/primitive.proto



<a name="atomix.primitive.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.primitive.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.OpenRequest"></a>

### OpenRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.OpenResponse"></a>

### OpenResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.PrimitiveId"></a>

### PrimitiveId
Namespaced primitive identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="atomix.primitive.RequestHeader"></a>

### RequestHeader
Request header


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| client_id | [string](#string) |  |  |
| primitive_id | [PrimitiveId](#atomix.primitive.PrimitiveId) |  |  |
| request_id | [uint64](#uint64) |  |  |
| request_type | [RequestType](#atomix.primitive.RequestType) |  |  |






<a name="atomix.primitive.ResponseHeader"></a>

### ResponseHeader
Response header


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| response_type | [ResponseType](#atomix.primitive.ResponseType) |  |  |





 


<a name="atomix.primitive.RequestType"></a>

### RequestType
Request type

| Name | Number | Description |
| ---- | ------ | ----------- |
| REQUEST | 0 |  |
| REQUEST_STREAM | 1 |  |



<a name="atomix.primitive.ResponseType"></a>

### ResponseType
Response type

| Name | Number | Description |
| ---- | ------ | ----------- |
| RESPONSE | 0 |  |
| RESPONSE_STREAM | 1 |  |


 

 


<a name="atomix.primitive.PrimitiveService"></a>

### PrimitiveService
PrimitiveService is a service for managing primitive

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Open | [OpenRequest](#atomix.primitive.OpenRequest) | [OpenResponse](#atomix.primitive.OpenResponse) | Open opens a primitive |
| Close | [CloseRequest](#atomix.primitive.CloseRequest) | [CloseResponse](#atomix.primitive.CloseResponse) | Close closes a primitive |

 



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

