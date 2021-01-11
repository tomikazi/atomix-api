# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/value/value.proto](#atomix/primitive/value/value.proto)
    - [EventsInput](#atomix.primitive.value.EventsInput)
    - [EventsOutput](#atomix.primitive.value.EventsOutput)
    - [EventsRequest](#atomix.primitive.value.EventsRequest)
    - [EventsResponse](#atomix.primitive.value.EventsResponse)
    - [GetInput](#atomix.primitive.value.GetInput)
    - [GetOutput](#atomix.primitive.value.GetOutput)
    - [GetRequest](#atomix.primitive.value.GetRequest)
    - [GetResponse](#atomix.primitive.value.GetResponse)
    - [RestoreRequest](#atomix.primitive.value.RestoreRequest)
    - [RestoreResponse](#atomix.primitive.value.RestoreResponse)
    - [SetInput](#atomix.primitive.value.SetInput)
    - [SetOutput](#atomix.primitive.value.SetOutput)
    - [SetRequest](#atomix.primitive.value.SetRequest)
    - [SetResponse](#atomix.primitive.value.SetResponse)
    - [Snapshot](#atomix.primitive.value.Snapshot)
    - [SnapshotRequest](#atomix.primitive.value.SnapshotRequest)
    - [SnapshotResponse](#atomix.primitive.value.SnapshotResponse)
    - [Value](#atomix.primitive.value.Value)
  
    - [EventsOutput.Type](#atomix.primitive.value.EventsOutput.Type)
  
  
    - [ValueService](#atomix.primitive.value.ValueService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/value/value.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/value/value.proto



<a name="atomix.primitive.value.EventsInput"></a>

### EventsInput







<a name="atomix.primitive.value.EventsOutput"></a>

### EventsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EventsOutput.Type](#atomix.primitive.value.EventsOutput.Type) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |
| new_value | [bytes](#bytes) |  |  |
| new_version | [uint64](#uint64) |  |  |






<a name="atomix.primitive.value.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventsInput](#atomix.primitive.value.EventsInput) |  |  |






<a name="atomix.primitive.value.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventsOutput](#atomix.primitive.value.EventsOutput) |  |  |






<a name="atomix.primitive.value.GetInput"></a>

### GetInput







<a name="atomix.primitive.value.GetOutput"></a>

### GetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |






<a name="atomix.primitive.value.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetInput](#atomix.primitive.value.GetInput) |  |  |






<a name="atomix.primitive.value.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetOutput](#atomix.primitive.value.GetOutput) |  |  |






<a name="atomix.primitive.value.RestoreRequest"></a>

### RestoreRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| snapshot | [Snapshot](#atomix.primitive.value.Snapshot) |  |  |






<a name="atomix.primitive.value.RestoreResponse"></a>

### RestoreResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.value.SetInput"></a>

### SetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| expect_version | [uint64](#uint64) |  |  |
| expect_value | [bytes](#bytes) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.value.SetOutput"></a>

### SetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| version | [uint64](#uint64) |  |  |






<a name="atomix.primitive.value.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [SetInput](#atomix.primitive.value.SetInput) |  |  |






<a name="atomix.primitive.value.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SetOutput](#atomix.primitive.value.SetOutput) |  |  |






<a name="atomix.primitive.value.Snapshot"></a>

### Snapshot



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [Value](#atomix.primitive.value.Value) |  |  |






<a name="atomix.primitive.value.SnapshotRequest"></a>

### SnapshotRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.value.SnapshotResponse"></a>

### SnapshotResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| snapshot | [Snapshot](#atomix.primitive.value.Snapshot) |  |  |






<a name="atomix.primitive.value.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| version | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| value | [bytes](#bytes) |  |  |





 


<a name="atomix.primitive.value.EventsOutput.Type"></a>

### EventsOutput.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| UPDATE | 1 |  |


 

 


<a name="atomix.primitive.value.ValueService"></a>

### ValueService
ValueService implements a distributed atomic value

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Set | [SetRequest](#atomix.primitive.value.SetRequest) | [SetResponse](#atomix.primitive.value.SetResponse) | Set sets the value |
| Get | [GetRequest](#atomix.primitive.value.GetRequest) | [GetResponse](#atomix.primitive.value.GetResponse) | Get gets the value |
| Events | [EventsRequest](#atomix.primitive.value.EventsRequest) | [EventsResponse](#atomix.primitive.value.EventsResponse) stream | Events listens for value change events |
| Snapshot | [SnapshotRequest](#atomix.primitive.value.SnapshotRequest) | [SnapshotResponse](#atomix.primitive.value.SnapshotResponse) | Snapshot exports a snapshot of the primitive state |
| Restore | [RestoreRequest](#atomix.primitive.value.RestoreRequest) | [RestoreResponse](#atomix.primitive.value.RestoreResponse) | Restore imports a snapshot of the primitive state |

 



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

