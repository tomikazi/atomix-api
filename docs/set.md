# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/set/set.proto](#atomix/primitive/set/set.proto)
    - [AddInput](#atomix.primitive.set.AddInput)
    - [AddOutput](#atomix.primitive.set.AddOutput)
    - [AddRequest](#atomix.primitive.set.AddRequest)
    - [AddResponse](#atomix.primitive.set.AddResponse)
    - [ClearRequest](#atomix.primitive.set.ClearRequest)
    - [ClearResponse](#atomix.primitive.set.ClearResponse)
    - [ContainsInput](#atomix.primitive.set.ContainsInput)
    - [ContainsOutput](#atomix.primitive.set.ContainsOutput)
    - [ContainsRequest](#atomix.primitive.set.ContainsRequest)
    - [ContainsResponse](#atomix.primitive.set.ContainsResponse)
    - [ElementsInput](#atomix.primitive.set.ElementsInput)
    - [ElementsOutput](#atomix.primitive.set.ElementsOutput)
    - [ElementsRequest](#atomix.primitive.set.ElementsRequest)
    - [ElementsResponse](#atomix.primitive.set.ElementsResponse)
    - [EventsInput](#atomix.primitive.set.EventsInput)
    - [EventsOutput](#atomix.primitive.set.EventsOutput)
    - [EventsRequest](#atomix.primitive.set.EventsRequest)
    - [EventsResponse](#atomix.primitive.set.EventsResponse)
    - [RemoveInput](#atomix.primitive.set.RemoveInput)
    - [RemoveOutput](#atomix.primitive.set.RemoveOutput)
    - [RemoveRequest](#atomix.primitive.set.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.set.RemoveResponse)
    - [RestoreRequest](#atomix.primitive.set.RestoreRequest)
    - [RestoreResponse](#atomix.primitive.set.RestoreResponse)
    - [SizeOutput](#atomix.primitive.set.SizeOutput)
    - [SizeRequest](#atomix.primitive.set.SizeRequest)
    - [SizeResponse](#atomix.primitive.set.SizeResponse)
    - [SnapshotEntry](#atomix.primitive.set.SnapshotEntry)
    - [SnapshotRequest](#atomix.primitive.set.SnapshotRequest)
    - [SnapshotResponse](#atomix.primitive.set.SnapshotResponse)
  
    - [EventsOutput.Type](#atomix.primitive.set.EventsOutput.Type)
  
  
    - [SetService](#atomix.primitive.set.SetService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/set/set.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/set/set.proto



<a name="atomix.primitive.set.AddInput"></a>

### AddInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.set.AddOutput"></a>

### AddOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| added | [bool](#bool) |  |  |






<a name="atomix.primitive.set.AddRequest"></a>

### AddRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [AddInput](#atomix.primitive.set.AddInput) |  |  |






<a name="atomix.primitive.set.AddResponse"></a>

### AddResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [AddOutput](#atomix.primitive.set.AddOutput) |  |  |






<a name="atomix.primitive.set.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.set.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.set.ContainsInput"></a>

### ContainsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.set.ContainsOutput"></a>

### ContainsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contains | [bool](#bool) |  |  |






<a name="atomix.primitive.set.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ContainsInput](#atomix.primitive.set.ContainsInput) |  |  |






<a name="atomix.primitive.set.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ContainsOutput](#atomix.primitive.set.ContainsOutput) |  |  |






<a name="atomix.primitive.set.ElementsInput"></a>

### ElementsInput







<a name="atomix.primitive.set.ElementsOutput"></a>

### ElementsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.set.ElementsRequest"></a>

### ElementsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ElementsInput](#atomix.primitive.set.ElementsInput) |  |  |






<a name="atomix.primitive.set.ElementsResponse"></a>

### ElementsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ElementsOutput](#atomix.primitive.set.ElementsOutput) |  |  |






<a name="atomix.primitive.set.EventsInput"></a>

### EventsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replay | [bool](#bool) |  |  |






<a name="atomix.primitive.set.EventsOutput"></a>

### EventsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EventsOutput.Type](#atomix.primitive.set.EventsOutput.Type) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.primitive.set.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventsInput](#atomix.primitive.set.EventsInput) |  |  |






<a name="atomix.primitive.set.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventsOutput](#atomix.primitive.set.EventsOutput) |  |  |






<a name="atomix.primitive.set.RemoveInput"></a>

### RemoveInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.set.RemoveOutput"></a>

### RemoveOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| removed | [bool](#bool) |  |  |






<a name="atomix.primitive.set.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [RemoveInput](#atomix.primitive.set.RemoveInput) |  |  |






<a name="atomix.primitive.set.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [RemoveOutput](#atomix.primitive.set.RemoveOutput) |  |  |






<a name="atomix.primitive.set.RestoreRequest"></a>

### RestoreRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| entry | [SnapshotEntry](#atomix.primitive.set.SnapshotEntry) |  |  |






<a name="atomix.primitive.set.RestoreResponse"></a>

### RestoreResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.set.SizeOutput"></a>

### SizeOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [uint32](#uint32) |  |  |






<a name="atomix.primitive.set.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.set.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SizeOutput](#atomix.primitive.set.SizeOutput) |  |  |






<a name="atomix.primitive.set.SnapshotEntry"></a>

### SnapshotEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.set.SnapshotRequest"></a>

### SnapshotRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.set.SnapshotResponse"></a>

### SnapshotResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| entry | [SnapshotEntry](#atomix.primitive.set.SnapshotEntry) |  |  |





 


<a name="atomix.primitive.set.EventsOutput.Type"></a>

### EventsOutput.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADD | 1 |  |
| REMOVE | 2 |  |
| REPLAY | 3 |  |


 

 


<a name="atomix.primitive.set.SetService"></a>

### SetService
Set service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.set.SizeRequest) | [SizeResponse](#atomix.primitive.set.SizeResponse) | Size gets the number of elements in the set |
| Contains | [ContainsRequest](#atomix.primitive.set.ContainsRequest) | [ContainsResponse](#atomix.primitive.set.ContainsResponse) | Contains returns whether the set contains a value |
| Add | [AddRequest](#atomix.primitive.set.AddRequest) | [AddResponse](#atomix.primitive.set.AddResponse) | Add adds a value to the set |
| Remove | [RemoveRequest](#atomix.primitive.set.RemoveRequest) | [RemoveResponse](#atomix.primitive.set.RemoveResponse) | Remove removes a value from the set |
| Clear | [ClearRequest](#atomix.primitive.set.ClearRequest) | [ClearResponse](#atomix.primitive.set.ClearResponse) | Clear removes all values from the set |
| Events | [EventsRequest](#atomix.primitive.set.EventsRequest) | [EventsResponse](#atomix.primitive.set.EventsResponse) stream | Events listens for set change events |
| Elements | [ElementsRequest](#atomix.primitive.set.ElementsRequest) | [ElementsResponse](#atomix.primitive.set.ElementsResponse) stream | Elements lists all elements in the set |
| Snapshot | [SnapshotRequest](#atomix.primitive.set.SnapshotRequest) | [SnapshotResponse](#atomix.primitive.set.SnapshotResponse) stream | Snapshot exports a snapshot of the primitive state |
| Restore | [RestoreRequest](#atomix.primitive.set.RestoreRequest) stream | [RestoreResponse](#atomix.primitive.set.RestoreResponse) | Restore imports a snapshot of the primitive state |

 



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

