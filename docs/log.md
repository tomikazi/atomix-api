# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/log/log.proto](#atomix/primitive/log/log.proto)
    - [AppendInput](#atomix.primitive.log.AppendInput)
    - [AppendOutput](#atomix.primitive.log.AppendOutput)
    - [AppendRequest](#atomix.primitive.log.AppendRequest)
    - [AppendResponse](#atomix.primitive.log.AppendResponse)
    - [ClearInput](#atomix.primitive.log.ClearInput)
    - [ClearOutput](#atomix.primitive.log.ClearOutput)
    - [ClearRequest](#atomix.primitive.log.ClearRequest)
    - [ClearResponse](#atomix.primitive.log.ClearResponse)
    - [EntriesInput](#atomix.primitive.log.EntriesInput)
    - [EntriesOutput](#atomix.primitive.log.EntriesOutput)
    - [EntriesRequest](#atomix.primitive.log.EntriesRequest)
    - [EntriesResponse](#atomix.primitive.log.EntriesResponse)
    - [Entry](#atomix.primitive.log.Entry)
    - [EventInput](#atomix.primitive.log.EventInput)
    - [EventOutput](#atomix.primitive.log.EventOutput)
    - [EventRequest](#atomix.primitive.log.EventRequest)
    - [EventResponse](#atomix.primitive.log.EventResponse)
    - [ExistsInput](#atomix.primitive.log.ExistsInput)
    - [ExistsOutput](#atomix.primitive.log.ExistsOutput)
    - [ExistsRequest](#atomix.primitive.log.ExistsRequest)
    - [ExistsResponse](#atomix.primitive.log.ExistsResponse)
    - [FirstEntryInput](#atomix.primitive.log.FirstEntryInput)
    - [FirstEntryOutput](#atomix.primitive.log.FirstEntryOutput)
    - [FirstEntryRequest](#atomix.primitive.log.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.primitive.log.FirstEntryResponse)
    - [GetInput](#atomix.primitive.log.GetInput)
    - [GetOutput](#atomix.primitive.log.GetOutput)
    - [GetRequest](#atomix.primitive.log.GetRequest)
    - [GetResponse](#atomix.primitive.log.GetResponse)
    - [LastEntryInput](#atomix.primitive.log.LastEntryInput)
    - [LastEntryOutput](#atomix.primitive.log.LastEntryOutput)
    - [LastEntryRequest](#atomix.primitive.log.LastEntryRequest)
    - [LastEntryResponse](#atomix.primitive.log.LastEntryResponse)
    - [NextEntryInput](#atomix.primitive.log.NextEntryInput)
    - [NextEntryOutput](#atomix.primitive.log.NextEntryOutput)
    - [NextEntryRequest](#atomix.primitive.log.NextEntryRequest)
    - [NextEntryResponse](#atomix.primitive.log.NextEntryResponse)
    - [PrevEntryInput](#atomix.primitive.log.PrevEntryInput)
    - [PrevEntryOutput](#atomix.primitive.log.PrevEntryOutput)
    - [PrevEntryRequest](#atomix.primitive.log.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.primitive.log.PrevEntryResponse)
    - [RemoveInput](#atomix.primitive.log.RemoveInput)
    - [RemoveOutput](#atomix.primitive.log.RemoveOutput)
    - [RemoveRequest](#atomix.primitive.log.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.log.RemoveResponse)
    - [RestoreRequest](#atomix.primitive.log.RestoreRequest)
    - [RestoreResponse](#atomix.primitive.log.RestoreResponse)
    - [SizeInput](#atomix.primitive.log.SizeInput)
    - [SizeOutput](#atomix.primitive.log.SizeOutput)
    - [SizeRequest](#atomix.primitive.log.SizeRequest)
    - [SizeResponse](#atomix.primitive.log.SizeResponse)
    - [SnapshotEntry](#atomix.primitive.log.SnapshotEntry)
    - [SnapshotRequest](#atomix.primitive.log.SnapshotRequest)
    - [SnapshotResponse](#atomix.primitive.log.SnapshotResponse)
  
    - [EventOutput.Type](#atomix.primitive.log.EventOutput.Type)
  
  
    - [LogService](#atomix.primitive.log.LogService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/log/log.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/log/log.proto



<a name="atomix.primitive.log.AppendInput"></a>

### AppendInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.AppendOutput"></a>

### AppendOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [AppendInput](#atomix.primitive.log.AppendInput) |  |  |






<a name="atomix.primitive.log.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [AppendOutput](#atomix.primitive.log.AppendOutput) |  |  |






<a name="atomix.primitive.log.ClearInput"></a>

### ClearInput







<a name="atomix.primitive.log.ClearOutput"></a>

### ClearOutput







<a name="atomix.primitive.log.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ClearInput](#atomix.primitive.log.ClearInput) |  |  |






<a name="atomix.primitive.log.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ClearOutput](#atomix.primitive.log.ClearOutput) |  |  |






<a name="atomix.primitive.log.EntriesInput"></a>

### EntriesInput







<a name="atomix.primitive.log.EntriesOutput"></a>

### EntriesOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EntriesInput](#atomix.primitive.log.EntriesInput) |  |  |






<a name="atomix.primitive.log.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EntriesOutput](#atomix.primitive.log.EntriesOutput) |  |  |






<a name="atomix.primitive.log.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.EventInput"></a>

### EventInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replay | [bool](#bool) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.EventOutput"></a>

### EventOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EventOutput.Type](#atomix.primitive.log.EventOutput.Type) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventInput](#atomix.primitive.log.EventInput) |  |  |






<a name="atomix.primitive.log.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventOutput](#atomix.primitive.log.EventOutput) |  |  |






<a name="atomix.primitive.log.ExistsInput"></a>

### ExistsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.ExistsOutput"></a>

### ExistsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contains_index | [bool](#bool) |  |  |






<a name="atomix.primitive.log.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ExistsInput](#atomix.primitive.log.ExistsInput) |  |  |






<a name="atomix.primitive.log.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ExistsOutput](#atomix.primitive.log.ExistsOutput) |  |  |






<a name="atomix.primitive.log.FirstEntryInput"></a>

### FirstEntryInput







<a name="atomix.primitive.log.FirstEntryOutput"></a>

### FirstEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [FirstEntryInput](#atomix.primitive.log.FirstEntryInput) |  |  |






<a name="atomix.primitive.log.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [FirstEntryOutput](#atomix.primitive.log.FirstEntryOutput) |  |  |






<a name="atomix.primitive.log.GetInput"></a>

### GetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.GetOutput"></a>

### GetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetInput](#atomix.primitive.log.GetInput) |  |  |






<a name="atomix.primitive.log.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetOutput](#atomix.primitive.log.GetOutput) |  |  |






<a name="atomix.primitive.log.LastEntryInput"></a>

### LastEntryInput







<a name="atomix.primitive.log.LastEntryOutput"></a>

### LastEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [LastEntryInput](#atomix.primitive.log.LastEntryInput) |  |  |






<a name="atomix.primitive.log.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [LastEntryOutput](#atomix.primitive.log.LastEntryOutput) |  |  |






<a name="atomix.primitive.log.NextEntryInput"></a>

### NextEntryInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.NextEntryOutput"></a>

### NextEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [NextEntryInput](#atomix.primitive.log.NextEntryInput) |  |  |






<a name="atomix.primitive.log.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [NextEntryOutput](#atomix.primitive.log.NextEntryOutput) |  |  |






<a name="atomix.primitive.log.PrevEntryInput"></a>

### PrevEntryInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.PrevEntryOutput"></a>

### PrevEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [PrevEntryInput](#atomix.primitive.log.PrevEntryInput) |  |  |






<a name="atomix.primitive.log.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [PrevEntryOutput](#atomix.primitive.log.PrevEntryOutput) |  |  |






<a name="atomix.primitive.log.RemoveInput"></a>

### RemoveInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.log.RemoveOutput"></a>

### RemoveOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| previous_value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [RemoveInput](#atomix.primitive.log.RemoveInput) |  |  |






<a name="atomix.primitive.log.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [RemoveOutput](#atomix.primitive.log.RemoveOutput) |  |  |






<a name="atomix.primitive.log.RestoreRequest"></a>

### RestoreRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| entry | [SnapshotEntry](#atomix.primitive.log.SnapshotEntry) |  |  |






<a name="atomix.primitive.log.RestoreResponse"></a>

### RestoreResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.log.SizeInput"></a>

### SizeInput







<a name="atomix.primitive.log.SizeOutput"></a>

### SizeOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [int32](#int32) |  |  |






<a name="atomix.primitive.log.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [SizeInput](#atomix.primitive.log.SizeInput) |  |  |






<a name="atomix.primitive.log.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SizeOutput](#atomix.primitive.log.SizeOutput) |  |  |






<a name="atomix.primitive.log.SnapshotEntry"></a>

### SnapshotEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.SnapshotRequest"></a>

### SnapshotRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.log.SnapshotResponse"></a>

### SnapshotResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| entry | [SnapshotEntry](#atomix.primitive.log.SnapshotEntry) |  |  |





 


<a name="atomix.primitive.log.EventOutput.Type"></a>

### EventOutput.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| APPENDED | 1 |  |
| REMOVED | 2 |  |


 

 


<a name="atomix.primitive.log.LogService"></a>

### LogService
LogService log service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.log.SizeRequest) | [SizeResponse](#atomix.primitive.log.SizeResponse) | Size returns the size of the log |
| Exists | [ExistsRequest](#atomix.primitive.log.ExistsRequest) | [ExistsResponse](#atomix.primitive.log.ExistsResponse) | Exists checks whether an index exists in the log |
| Append | [AppendRequest](#atomix.primitive.log.AppendRequest) | [AppendResponse](#atomix.primitive.log.AppendResponse) | Appends appends an entry into the log |
| Get | [GetRequest](#atomix.primitive.log.GetRequest) | [GetResponse](#atomix.primitive.log.GetResponse) | Get gets the entry for an index |
| FirstEntry | [FirstEntryRequest](#atomix.primitive.log.FirstEntryRequest) | [FirstEntryResponse](#atomix.primitive.log.FirstEntryResponse) | FirstEntry gets the first entry in the log |
| LastEntry | [LastEntryRequest](#atomix.primitive.log.LastEntryRequest) | [LastEntryResponse](#atomix.primitive.log.LastEntryResponse) | LastEntry gets the last entry in the log |
| PrevEntry | [PrevEntryRequest](#atomix.primitive.log.PrevEntryRequest) | [PrevEntryResponse](#atomix.primitive.log.PrevEntryResponse) | PrevEntry gets the previous entry in the log |
| NextEntry | [NextEntryRequest](#atomix.primitive.log.NextEntryRequest) | [NextEntryResponse](#atomix.primitive.log.NextEntryResponse) | NextEntry gets the next entry in the log |
| Remove | [RemoveRequest](#atomix.primitive.log.RemoveRequest) | [RemoveResponse](#atomix.primitive.log.RemoveResponse) | Remove removes an entry from the log |
| Clear | [ClearRequest](#atomix.primitive.log.ClearRequest) | [ClearResponse](#atomix.primitive.log.ClearResponse) | Clear removes all entries from the log |
| Events | [EventRequest](#atomix.primitive.log.EventRequest) | [EventResponse](#atomix.primitive.log.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.primitive.log.EntriesRequest) | [EntriesResponse](#atomix.primitive.log.EntriesResponse) stream | Entries lists all entries in the log |
| Snapshot | [SnapshotRequest](#atomix.primitive.log.SnapshotRequest) | [SnapshotResponse](#atomix.primitive.log.SnapshotResponse) stream | Snapshot exports a snapshot of the primitive state |
| Restore | [RestoreRequest](#atomix.primitive.log.RestoreRequest) stream | [RestoreResponse](#atomix.primitive.log.RestoreResponse) | Restore imports a snapshot of the primitive state |

 



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

