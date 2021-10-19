# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/manager.proto](#atomix/primitive/manager.proto)
    - [OperationType](#atomix.primitive.manager.OperationType)
  
    - [File-level Extensions](#atomix/primitive/manager.proto-extensions)
    - [File-level Extensions](#atomix/primitive/manager.proto-extensions)
  
- [atomix/primitive/operation.proto](#atomix/primitive/operation.proto)
    - [AggregateStrategy](#atomix.primitive.operation.AggregateStrategy)
    - [OperationType](#atomix.primitive.operation.OperationType)
  
    - [File-level Extensions](#atomix/primitive/operation.proto-extensions)
    - [File-level Extensions](#atomix/primitive/operation.proto-extensions)
    - [File-level Extensions](#atomix/primitive/operation.proto-extensions)
    - [File-level Extensions](#atomix/primitive/operation.proto-extensions)
    - [File-level Extensions](#atomix/primitive/operation.proto-extensions)
    - [File-level Extensions](#atomix/primitive/operation.proto-extensions)
  
- [atomix/primitive/partition.proto](#atomix/primitive/partition.proto)
    - [PartitionStrategy](#atomix.primitive.partition.PartitionStrategy)
  
    - [File-level Extensions](#atomix/primitive/partition.proto-extensions)
    - [File-level Extensions](#atomix/primitive/partition.proto-extensions)
    - [File-level Extensions](#atomix/primitive/partition.proto-extensions)
  
- [atomix/primitive/primitive.proto](#atomix/primitive/primitive.proto)
    - [CloseRequest](#atomix.primitive.CloseRequest)
    - [CloseResponse](#atomix.primitive.CloseResponse)
    - [CreateRequest](#atomix.primitive.CreateRequest)
    - [CreateResponse](#atomix.primitive.CreateResponse)
    - [DeleteRequest](#atomix.primitive.DeleteRequest)
    - [DeleteResponse](#atomix.primitive.DeleteResponse)
    - [PrimitiveId](#atomix.primitive.PrimitiveId)
    - [RequestHeaders](#atomix.primitive.RequestHeaders)
    - [ResponseHeaders](#atomix.primitive.ResponseHeaders)
  
    - [ServiceType](#atomix.primitive.ServiceType)
  
    - [File-level Extensions](#atomix/primitive/primitive.proto-extensions)
    - [File-level Extensions](#atomix/primitive/primitive.proto-extensions)
    - [File-level Extensions](#atomix/primitive/primitive.proto-extensions)
  
    - [Primitive](#atomix.primitive.Primitive)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/manager.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/manager.proto


 


<a name="atomix.primitive.manager.OperationType"></a>

### OperationType
OperationType is an enum for specifying the type of operation

| Name | Number | Description |
| ---- | ------ | ----------- |
| OPEN | 0 |  |
| CLOSE | 1 |  |


 


<a name="atomix/primitive/manager.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| operation | OperationType | .google.protobuf.MethodOptions | 70000 |  |
| primitive_type | string | .google.protobuf.ServiceOptions | 71000 |  |

 

 



<a name="atomix/primitive/operation.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/operation.proto


 


<a name="atomix.primitive.operation.AggregateStrategy"></a>

### AggregateStrategy
AggregateStrategy is an enum for indicating the strategy used to aggregate a field

| Name | Number | Description |
| ---- | ------ | ----------- |
| CHOOSE_FIRST | 0 |  |
| APPEND | 1 |  |
| SUM | 2 |  |



<a name="atomix.primitive.operation.OperationType"></a>

### OperationType
OperationType is an enum for specifying the type of operation

| Name | Number | Description |
| ---- | ------ | ----------- |
| COMMAND | 0 |  |
| QUERY | 1 |  |
| CREATE | 2 |  |
| CLOSE | 3 |  |


 


<a name="atomix/primitive/operation.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| aggregate | AggregateStrategy | .google.protobuf.FieldOptions | 62001 |  |
| headers | bool | .google.protobuf.FieldOptions | 62000 |  |
| async | bool | .google.protobuf.MethodOptions | 61002 |  |
| id | uint32 | .google.protobuf.MethodOptions | 61003 |  |
| name | string | .google.protobuf.MethodOptions | 61000 |  |
| type | OperationType | .google.protobuf.MethodOptions | 61001 |  |

 

 



<a name="atomix/primitive/partition.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/partition.proto


 


<a name="atomix.primitive.partition.PartitionStrategy"></a>

### PartitionStrategy
PartitionStrategy is an enum for indicating the strategy used to partition a primitive

| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| HASH | 1 |  |
| RANGE | 2 |  |
| RANDOM | 3 |  |
| ROUND_ROBIN | 4 |  |


 


<a name="atomix/primitive/partition.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| key | bool | .google.protobuf.FieldOptions | 72000 |  |
| range | bool | .google.protobuf.FieldOptions | 72001 |  |
| strategy | PartitionStrategy | .google.protobuf.MethodOptions | 71000 |  |

 

 



<a name="atomix/primitive/primitive.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/primitive.proto



<a name="atomix.primitive.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |






<a name="atomix.primitive.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |






<a name="atomix.primitive.DeleteRequest"></a>

### DeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.DeleteResponse"></a>

### DeleteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |






<a name="atomix.primitive.PrimitiveId"></a>

### PrimitiveId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |






<a name="atomix.primitive.RequestHeaders"></a>

### RequestHeaders



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [PrimitiveId](#atomix.primitive.PrimitiveId) |  |  |
| cluster_key | [string](#string) |  |  |
| timestamp | [meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.ResponseHeaders"></a>

### ResponseHeaders



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| timestamp | [meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |





 


<a name="atomix.primitive.ServiceType"></a>

### ServiceType


| Name | Number | Description |
| ---- | ------ | ----------- |
| PRIMITIVE | 0 |  |
| MANAGER | 1 |  |


 


<a name="atomix/primitive/primitive.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| partitioned | bool | .google.protobuf.ServiceOptions | 50001 |  |
| service_type | ServiceType | .google.protobuf.ServiceOptions | 80000 |  |
| type | string | .google.protobuf.ServiceOptions | 50000 |  |

 


<a name="atomix.primitive.Primitive"></a>

### Primitive
Primitive is a service for managing primitive

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.primitive.CreateRequest) | [CreateResponse](#atomix.primitive.CreateResponse) | Create creates a primitive |
| Close | [CloseRequest](#atomix.primitive.CloseRequest) | [CloseResponse](#atomix.primitive.CloseResponse) | Close closes a primitive |
| Delete | [DeleteRequest](#atomix.primitive.DeleteRequest) | [DeleteResponse](#atomix.primitive.DeleteResponse) | Delete deletes a primitive |

 



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

