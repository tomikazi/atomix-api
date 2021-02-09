# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/operation.proto](#atomix/primitive/operation.proto)
  
    - [AggregateStrategy](#atomix.primitive.operation.AggregateStrategy)
    - [OperationType](#atomix.primitive.operation.OperationType)
  
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
    - [AddPrimitiveRequest](#atomix.primitive.AddPrimitiveRequest)
    - [AddPrimitiveResponse](#atomix.primitive.AddPrimitiveResponse)
    - [CloseRequest](#atomix.primitive.CloseRequest)
    - [CloseResponse](#atomix.primitive.CloseResponse)
    - [CreateRequest](#atomix.primitive.CreateRequest)
    - [CreateResponse](#atomix.primitive.CreateResponse)
    - [DeleteRequest](#atomix.primitive.DeleteRequest)
    - [DeleteResponse](#atomix.primitive.DeleteResponse)
    - [GetPrimitiveRequest](#atomix.primitive.GetPrimitiveRequest)
    - [GetPrimitiveResponse](#atomix.primitive.GetPrimitiveResponse)
    - [ListPrimitivesRequest](#atomix.primitive.ListPrimitivesRequest)
    - [ListPrimitivesResponse](#atomix.primitive.ListPrimitivesResponse)
    - [LookupPrimitiveRequest](#atomix.primitive.LookupPrimitiveRequest)
    - [LookupPrimitiveResponse](#atomix.primitive.LookupPrimitiveResponse)
    - [PrimitiveMeta](#atomix.primitive.PrimitiveMeta)
    - [PrimitiveMeta.OptionsEntry](#atomix.primitive.PrimitiveMeta.OptionsEntry)
    - [RemovePrimitiveRequest](#atomix.primitive.RemovePrimitiveRequest)
    - [RemovePrimitiveResponse](#atomix.primitive.RemovePrimitiveResponse)
    - [RequestHeaders](#atomix.primitive.RequestHeaders)
    - [ResponseHeaders](#atomix.primitive.ResponseHeaders)
  
  
  
    - [PrimitiveManagementService](#atomix.primitive.PrimitiveManagementService)
    - [PrimitiveRegistryService](#atomix.primitive.PrimitiveRegistryService)
    - [PrimitiveService](#atomix.primitive.PrimitiveService)
  

- [atomix/primitive/service.proto](#atomix/primitive/service.proto)
  
  
    - [File-level Extensions](#atomix/primitive/service.proto-extensions)
    - [File-level Extensions](#atomix/primitive/service.proto-extensions)
  
  

- [Scalar Value Types](#scalar-value-types)



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


 


<a name="atomix/primitive/operation.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| aggregate | AggregateStrategy | .google.protobuf.FieldOptions | 62001 |  |
| headers | bool | .google.protobuf.FieldOptions | 62000 |  |
| async | bool | .google.protobuf.MethodOptions | 61002 |  |
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



<a name="atomix.primitive.AddPrimitiveRequest"></a>

### AddPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveMeta](#atomix.primitive.PrimitiveMeta) |  |  |






<a name="atomix.primitive.AddPrimitiveResponse"></a>

### AddPrimitiveResponse







<a name="atomix.primitive.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="atomix.primitive.CloseResponse"></a>

### CloseResponse







<a name="atomix.primitive.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="atomix.primitive.CreateResponse"></a>

### CreateResponse







<a name="atomix.primitive.DeleteRequest"></a>

### DeleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="atomix.primitive.DeleteResponse"></a>

### DeleteResponse







<a name="atomix.primitive.GetPrimitiveRequest"></a>

### GetPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="atomix.primitive.GetPrimitiveResponse"></a>

### GetPrimitiveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveMeta](#atomix.primitive.PrimitiveMeta) |  |  |






<a name="atomix.primitive.ListPrimitivesRequest"></a>

### ListPrimitivesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="atomix.primitive.ListPrimitivesResponse"></a>

### ListPrimitivesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitives | [PrimitiveMeta](#atomix.primitive.PrimitiveMeta) | repeated |  |






<a name="atomix.primitive.LookupPrimitiveRequest"></a>

### LookupPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="atomix.primitive.LookupPrimitiveResponse"></a>

### LookupPrimitiveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| proxy | [atomix.proxy.ProxyMeta](#atomix.proxy.ProxyMeta) |  |  |






<a name="atomix.primitive.PrimitiveMeta"></a>

### PrimitiveMeta
PrimitiveMeta is a primitive metadata


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |
| driver | [string](#string) |  |  |
| options | [PrimitiveMeta.OptionsEntry](#atomix.primitive.PrimitiveMeta.OptionsEntry) | repeated |  |






<a name="atomix.primitive.PrimitiveMeta.OptionsEntry"></a>

### PrimitiveMeta.OptionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.primitive.RemovePrimitiveRequest"></a>

### RemovePrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="atomix.primitive.RemovePrimitiveResponse"></a>

### RemovePrimitiveResponse







<a name="atomix.primitive.RequestHeaders"></a>

### RequestHeaders



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [string](#string) |  |  |
| timestamp | [meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.ResponseHeaders"></a>

### ResponseHeaders



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| timestamp | [meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |





 

 

 


<a name="atomix.primitive.PrimitiveManagementService"></a>

### PrimitiveManagementService
Atomix primitive management service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddPrimitive | [AddPrimitiveRequest](#atomix.primitive.AddPrimitiveRequest) | [AddPrimitiveResponse](#atomix.primitive.AddPrimitiveResponse) |  |
| RemovePrimitive | [RemovePrimitiveRequest](#atomix.primitive.RemovePrimitiveRequest) | [RemovePrimitiveResponse](#atomix.primitive.RemovePrimitiveResponse) |  |


<a name="atomix.primitive.PrimitiveRegistryService"></a>

### PrimitiveRegistryService
Atomix primitive registry service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetPrimitive | [GetPrimitiveRequest](#atomix.primitive.GetPrimitiveRequest) | [GetPrimitiveResponse](#atomix.primitive.GetPrimitiveResponse) |  |
| ListPrimitives | [ListPrimitivesRequest](#atomix.primitive.ListPrimitivesRequest) | [ListPrimitivesResponse](#atomix.primitive.ListPrimitivesResponse) |  |
| LookupPrimitive | [LookupPrimitiveRequest](#atomix.primitive.LookupPrimitiveRequest) | [LookupPrimitiveResponse](#atomix.primitive.LookupPrimitiveResponse) |  |


<a name="atomix.primitive.PrimitiveService"></a>

### PrimitiveService
PrimitiveService is a service for managing primitive

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.primitive.CreateRequest) | [CreateResponse](#atomix.primitive.CreateResponse) | Create creates a primitive |
| Close | [CloseRequest](#atomix.primitive.CloseRequest) | [CloseResponse](#atomix.primitive.CloseResponse) | Close closes a primitive |
| Delete | [DeleteRequest](#atomix.primitive.DeleteRequest) | [DeleteResponse](#atomix.primitive.DeleteResponse) | Delete deletes a primitive |

 



<a name="atomix/primitive/service.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/service.proto


 

 


<a name="atomix/primitive/service.proto-extensions"></a>

### File-level Extensions
| Extension | Type | Base | Number | Description |
| --------- | ---- | ---- | ------ | ----------- |
| partitioned | bool | .google.protobuf.ServiceOptions | 50001 |  |
| type | string | .google.protobuf.ServiceOptions | 50000 |  |

 

 



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

