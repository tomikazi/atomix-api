# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/map/map.proto](#atomix/primitive/map/map.proto)
    - [ClearRequest](#atomix.primitive.map.ClearRequest)
    - [ClearResponse](#atomix.primitive.map.ClearResponse)
    - [EntriesInput](#atomix.primitive.map.EntriesInput)
    - [EntriesOutput](#atomix.primitive.map.EntriesOutput)
    - [EntriesRequest](#atomix.primitive.map.EntriesRequest)
    - [EntriesResponse](#atomix.primitive.map.EntriesResponse)
    - [Entry](#atomix.primitive.map.Entry)
    - [Event](#atomix.primitive.map.Event)
    - [EventsInput](#atomix.primitive.map.EventsInput)
    - [EventsOutput](#atomix.primitive.map.EventsOutput)
    - [EventsRequest](#atomix.primitive.map.EventsRequest)
    - [EventsResponse](#atomix.primitive.map.EventsResponse)
    - [GetInput](#atomix.primitive.map.GetInput)
    - [GetOutput](#atomix.primitive.map.GetOutput)
    - [GetRequest](#atomix.primitive.map.GetRequest)
    - [GetResponse](#atomix.primitive.map.GetResponse)
    - [Key](#atomix.primitive.map.Key)
    - [Precondition](#atomix.primitive.map.Precondition)
    - [PutInput](#atomix.primitive.map.PutInput)
    - [PutOutput](#atomix.primitive.map.PutOutput)
    - [PutRequest](#atomix.primitive.map.PutRequest)
    - [PutResponse](#atomix.primitive.map.PutResponse)
    - [RemoveInput](#atomix.primitive.map.RemoveInput)
    - [RemoveOutput](#atomix.primitive.map.RemoveOutput)
    - [RemoveRequest](#atomix.primitive.map.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.map.RemoveResponse)
    - [RestoreRequest](#atomix.primitive.map.RestoreRequest)
    - [RestoreResponse](#atomix.primitive.map.RestoreResponse)
    - [SizeOutput](#atomix.primitive.map.SizeOutput)
    - [SizeRequest](#atomix.primitive.map.SizeRequest)
    - [SizeResponse](#atomix.primitive.map.SizeResponse)
    - [SnapshotEntry](#atomix.primitive.map.SnapshotEntry)
    - [SnapshotRequest](#atomix.primitive.map.SnapshotRequest)
    - [SnapshotResponse](#atomix.primitive.map.SnapshotResponse)
    - [Value](#atomix.primitive.map.Value)
  
    - [Event.Type](#atomix.primitive.map.Event.Type)
  
  
    - [MapService](#atomix.primitive.map.MapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/map/map.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/map/map.proto



<a name="atomix.primitive.map.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.map.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.map.EntriesInput"></a>

### EntriesInput







<a name="atomix.primitive.map.EntriesOutput"></a>

### EntriesOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |






<a name="atomix.primitive.map.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EntriesInput](#atomix.primitive.map.EntriesInput) |  |  |






<a name="atomix.primitive.map.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EntriesOutput](#atomix.primitive.map.EntriesOutput) |  |  |






<a name="atomix.primitive.map.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [Key](#atomix.primitive.map.Key) |  |  |
| value | [Value](#atomix.primitive.map.Value) |  |  |






<a name="atomix.primitive.map.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.map.Event.Type) |  |  |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |






<a name="atomix.primitive.map.EventsInput"></a>

### EventsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.primitive.map.EventsOutput"></a>

### EventsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| event | [Event](#atomix.primitive.map.Event) |  |  |






<a name="atomix.primitive.map.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventsInput](#atomix.primitive.map.EventsInput) |  |  |






<a name="atomix.primitive.map.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventsOutput](#atomix.primitive.map.EventsOutput) |  |  |






<a name="atomix.primitive.map.GetInput"></a>

### GetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |






<a name="atomix.primitive.map.GetOutput"></a>

### GetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |






<a name="atomix.primitive.map.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetInput](#atomix.primitive.map.GetInput) |  |  |






<a name="atomix.primitive.map.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetOutput](#atomix.primitive.map.GetOutput) |  |  |






<a name="atomix.primitive.map.Key"></a>

### Key



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.primitive.map.Precondition"></a>

### Precondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| metadata | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |






<a name="atomix.primitive.map.PutInput"></a>

### PutInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |
| preconditions | [Precondition](#atomix.primitive.map.Precondition) | repeated |  |






<a name="atomix.primitive.map.PutOutput"></a>

### PutOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |






<a name="atomix.primitive.map.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [PutInput](#atomix.primitive.map.PutInput) |  |  |






<a name="atomix.primitive.map.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [PutOutput](#atomix.primitive.map.PutOutput) |  |  |






<a name="atomix.primitive.map.RemoveInput"></a>

### RemoveInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [Key](#atomix.primitive.map.Key) |  |  |
| preconditions | [Precondition](#atomix.primitive.map.Precondition) | repeated |  |






<a name="atomix.primitive.map.RemoveOutput"></a>

### RemoveOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |






<a name="atomix.primitive.map.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [RemoveInput](#atomix.primitive.map.RemoveInput) |  |  |






<a name="atomix.primitive.map.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [RemoveOutput](#atomix.primitive.map.RemoveOutput) |  |  |






<a name="atomix.primitive.map.RestoreRequest"></a>

### RestoreRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| entry | [SnapshotEntry](#atomix.primitive.map.SnapshotEntry) |  |  |






<a name="atomix.primitive.map.RestoreResponse"></a>

### RestoreResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.map.SizeOutput"></a>

### SizeOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [uint32](#uint32) |  |  |






<a name="atomix.primitive.map.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.map.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SizeOutput](#atomix.primitive.map.SizeOutput) |  |  |






<a name="atomix.primitive.map.SnapshotEntry"></a>

### SnapshotEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.map.Entry) |  |  |






<a name="atomix.primitive.map.SnapshotRequest"></a>

### SnapshotRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.map.SnapshotResponse"></a>

### SnapshotResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| entry | [SnapshotEntry](#atomix.primitive.map.SnapshotEntry) |  |  |






<a name="atomix.primitive.map.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bytes](#bytes) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |





 


<a name="atomix.primitive.map.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| INSERT | 1 |  |
| UPDATE | 2 |  |
| REMOVE | 3 |  |
| REPLAY | 4 |  |


 

 


<a name="atomix.primitive.map.MapService"></a>

### MapService
MapService implements a distributed map

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.map.SizeRequest) | [SizeResponse](#atomix.primitive.map.SizeResponse) | Size returns the size of the map |
| Put | [PutRequest](#atomix.primitive.map.PutRequest) | [PutResponse](#atomix.primitive.map.PutResponse) | Put puts an entry into the map |
| Get | [GetRequest](#atomix.primitive.map.GetRequest) | [GetResponse](#atomix.primitive.map.GetResponse) | Get gets the entry for a key |
| Remove | [RemoveRequest](#atomix.primitive.map.RemoveRequest) | [RemoveResponse](#atomix.primitive.map.RemoveResponse) | Remove removes an entry from the map |
| Clear | [ClearRequest](#atomix.primitive.map.ClearRequest) | [ClearResponse](#atomix.primitive.map.ClearResponse) | Clear removes all entries from the map |
| Events | [EventsRequest](#atomix.primitive.map.EventsRequest) | [EventsResponse](#atomix.primitive.map.EventsResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.primitive.map.EntriesRequest) | [EntriesResponse](#atomix.primitive.map.EntriesResponse) stream | Entries lists all entries in the map |
| Snapshot | [SnapshotRequest](#atomix.primitive.map.SnapshotRequest) | [SnapshotResponse](#atomix.primitive.map.SnapshotResponse) stream | Snapshot exports a snapshot of the primitive state |
| Restore | [RestoreRequest](#atomix.primitive.map.RestoreRequest) stream | [RestoreResponse](#atomix.primitive.map.RestoreResponse) | Restore imports a snapshot of the primitive state |

 



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

