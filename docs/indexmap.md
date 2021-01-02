# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/indexedmap/indexedmap.proto](#atomix/primitive/indexedmap/indexedmap.proto)
    - [ClearInput](#atomix.primitive.indexedmap.ClearInput)
    - [ClearOutput](#atomix.primitive.indexedmap.ClearOutput)
    - [ClearRequest](#atomix.primitive.indexedmap.ClearRequest)
    - [ClearResponse](#atomix.primitive.indexedmap.ClearResponse)
    - [EntriesInput](#atomix.primitive.indexedmap.EntriesInput)
    - [EntriesOutput](#atomix.primitive.indexedmap.EntriesOutput)
    - [EntriesRequest](#atomix.primitive.indexedmap.EntriesRequest)
    - [EntriesResponse](#atomix.primitive.indexedmap.EntriesResponse)
    - [Entry](#atomix.primitive.indexedmap.Entry)
    - [EventsInput](#atomix.primitive.indexedmap.EventsInput)
    - [EventsOutput](#atomix.primitive.indexedmap.EventsOutput)
    - [EventsRequest](#atomix.primitive.indexedmap.EventsRequest)
    - [EventsResponse](#atomix.primitive.indexedmap.EventsResponse)
    - [ExistsInput](#atomix.primitive.indexedmap.ExistsInput)
    - [ExistsOutput](#atomix.primitive.indexedmap.ExistsOutput)
    - [ExistsRequest](#atomix.primitive.indexedmap.ExistsRequest)
    - [ExistsResponse](#atomix.primitive.indexedmap.ExistsResponse)
    - [FirstEntryInput](#atomix.primitive.indexedmap.FirstEntryInput)
    - [FirstEntryOutput](#atomix.primitive.indexedmap.FirstEntryOutput)
    - [FirstEntryRequest](#atomix.primitive.indexedmap.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.primitive.indexedmap.FirstEntryResponse)
    - [GetInput](#atomix.primitive.indexedmap.GetInput)
    - [GetOutput](#atomix.primitive.indexedmap.GetOutput)
    - [GetRequest](#atomix.primitive.indexedmap.GetRequest)
    - [GetResponse](#atomix.primitive.indexedmap.GetResponse)
    - [IndexedMapInput](#atomix.primitive.indexedmap.IndexedMapInput)
    - [IndexedMapOutput](#atomix.primitive.indexedmap.IndexedMapOutput)
    - [IndexedMapRequest](#atomix.primitive.indexedmap.IndexedMapRequest)
    - [IndexedMapResponse](#atomix.primitive.indexedmap.IndexedMapResponse)
    - [LastEntryInput](#atomix.primitive.indexedmap.LastEntryInput)
    - [LastEntryOutput](#atomix.primitive.indexedmap.LastEntryOutput)
    - [LastEntryRequest](#atomix.primitive.indexedmap.LastEntryRequest)
    - [LastEntryResponse](#atomix.primitive.indexedmap.LastEntryResponse)
    - [NextEntryInput](#atomix.primitive.indexedmap.NextEntryInput)
    - [NextEntryOutput](#atomix.primitive.indexedmap.NextEntryOutput)
    - [NextEntryRequest](#atomix.primitive.indexedmap.NextEntryRequest)
    - [NextEntryResponse](#atomix.primitive.indexedmap.NextEntryResponse)
    - [Position](#atomix.primitive.indexedmap.Position)
    - [PrevEntryInput](#atomix.primitive.indexedmap.PrevEntryInput)
    - [PrevEntryOutput](#atomix.primitive.indexedmap.PrevEntryOutput)
    - [PrevEntryRequest](#atomix.primitive.indexedmap.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.primitive.indexedmap.PrevEntryResponse)
    - [PutInput](#atomix.primitive.indexedmap.PutInput)
    - [PutOutput](#atomix.primitive.indexedmap.PutOutput)
    - [PutRequest](#atomix.primitive.indexedmap.PutRequest)
    - [PutResponse](#atomix.primitive.indexedmap.PutResponse)
    - [RemoveInput](#atomix.primitive.indexedmap.RemoveInput)
    - [RemoveOutput](#atomix.primitive.indexedmap.RemoveOutput)
    - [RemoveRequest](#atomix.primitive.indexedmap.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.indexedmap.RemoveResponse)
    - [SizeInput](#atomix.primitive.indexedmap.SizeInput)
    - [SizeOutput](#atomix.primitive.indexedmap.SizeOutput)
    - [SizeRequest](#atomix.primitive.indexedmap.SizeRequest)
    - [SizeResponse](#atomix.primitive.indexedmap.SizeResponse)
    - [Value](#atomix.primitive.indexedmap.Value)
  
    - [EventsOutput.Type](#atomix.primitive.indexedmap.EventsOutput.Type)
  
  
    - [IndexedMapService](#atomix.primitive.indexedmap.IndexedMapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/indexedmap/indexedmap.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/indexedmap/indexedmap.proto



<a name="atomix.primitive.indexedmap.ClearInput"></a>

### ClearInput







<a name="atomix.primitive.indexedmap.ClearOutput"></a>

### ClearOutput







<a name="atomix.primitive.indexedmap.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ClearInput](#atomix.primitive.indexedmap.ClearInput) |  |  |






<a name="atomix.primitive.indexedmap.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ClearOutput](#atomix.primitive.indexedmap.ClearOutput) |  |  |






<a name="atomix.primitive.indexedmap.EntriesInput"></a>

### EntriesInput







<a name="atomix.primitive.indexedmap.EntriesOutput"></a>

### EntriesOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EntriesInput](#atomix.primitive.indexedmap.EntriesInput) |  |  |






<a name="atomix.primitive.indexedmap.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EntriesOutput](#atomix.primitive.indexedmap.EntriesOutput) |  |  |






<a name="atomix.primitive.indexedmap.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pos | [Position](#atomix.primitive.indexedmap.Position) |  |  |
| value | [Value](#atomix.primitive.indexedmap.Value) |  |  |






<a name="atomix.primitive.indexedmap.EventsInput"></a>

### EventsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pos | [Position](#atomix.primitive.indexedmap.Position) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.primitive.indexedmap.EventsOutput"></a>

### EventsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EventsOutput.Type](#atomix.primitive.indexedmap.EventsOutput.Type) |  |  |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventsInput](#atomix.primitive.indexedmap.EventsInput) |  |  |






<a name="atomix.primitive.indexedmap.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventsOutput](#atomix.primitive.indexedmap.EventsOutput) |  |  |






<a name="atomix.primitive.indexedmap.ExistsInput"></a>

### ExistsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |






<a name="atomix.primitive.indexedmap.ExistsOutput"></a>

### ExistsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contains_key | [bool](#bool) |  |  |






<a name="atomix.primitive.indexedmap.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ExistsInput](#atomix.primitive.indexedmap.ExistsInput) |  |  |






<a name="atomix.primitive.indexedmap.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ExistsOutput](#atomix.primitive.indexedmap.ExistsOutput) |  |  |






<a name="atomix.primitive.indexedmap.FirstEntryInput"></a>

### FirstEntryInput







<a name="atomix.primitive.indexedmap.FirstEntryOutput"></a>

### FirstEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [FirstEntryInput](#atomix.primitive.indexedmap.FirstEntryInput) |  |  |






<a name="atomix.primitive.indexedmap.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [FirstEntryOutput](#atomix.primitive.indexedmap.FirstEntryOutput) |  |  |






<a name="atomix.primitive.indexedmap.GetInput"></a>

### GetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.primitive.indexedmap.GetOutput"></a>

### GetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetInput](#atomix.primitive.indexedmap.GetInput) |  |  |






<a name="atomix.primitive.indexedmap.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetOutput](#atomix.primitive.indexedmap.GetOutput) |  |  |






<a name="atomix.primitive.indexedmap.IndexedMapInput"></a>

### IndexedMapInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [SizeInput](#atomix.primitive.indexedmap.SizeInput) |  |  |
| exists | [ExistsInput](#atomix.primitive.indexedmap.ExistsInput) |  |  |
| put | [PutInput](#atomix.primitive.indexedmap.PutInput) |  |  |
| get | [GetInput](#atomix.primitive.indexedmap.GetInput) |  |  |
| first_entry | [FirstEntryInput](#atomix.primitive.indexedmap.FirstEntryInput) |  |  |
| last_entry | [LastEntryInput](#atomix.primitive.indexedmap.LastEntryInput) |  |  |
| prev_entry | [PrevEntryInput](#atomix.primitive.indexedmap.PrevEntryInput) |  |  |
| next_entry | [NextEntryInput](#atomix.primitive.indexedmap.NextEntryInput) |  |  |
| remove | [RemoveInput](#atomix.primitive.indexedmap.RemoveInput) |  |  |
| clear | [ClearInput](#atomix.primitive.indexedmap.ClearInput) |  |  |
| events | [EventsInput](#atomix.primitive.indexedmap.EventsInput) |  |  |
| entries | [EntriesInput](#atomix.primitive.indexedmap.EntriesInput) |  |  |






<a name="atomix.primitive.indexedmap.IndexedMapOutput"></a>

### IndexedMapOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [SizeOutput](#atomix.primitive.indexedmap.SizeOutput) |  |  |
| exists | [ExistsOutput](#atomix.primitive.indexedmap.ExistsOutput) |  |  |
| put | [PutOutput](#atomix.primitive.indexedmap.PutOutput) |  |  |
| get | [GetOutput](#atomix.primitive.indexedmap.GetOutput) |  |  |
| first_entry | [FirstEntryOutput](#atomix.primitive.indexedmap.FirstEntryOutput) |  |  |
| last_entry | [LastEntryOutput](#atomix.primitive.indexedmap.LastEntryOutput) |  |  |
| prev_entry | [PrevEntryOutput](#atomix.primitive.indexedmap.PrevEntryOutput) |  |  |
| next_entry | [NextEntryOutput](#atomix.primitive.indexedmap.NextEntryOutput) |  |  |
| remove | [RemoveOutput](#atomix.primitive.indexedmap.RemoveOutput) |  |  |
| clear | [ClearOutput](#atomix.primitive.indexedmap.ClearOutput) |  |  |
| events | [EventsOutput](#atomix.primitive.indexedmap.EventsOutput) |  |  |
| entries | [EntriesOutput](#atomix.primitive.indexedmap.EntriesOutput) |  |  |






<a name="atomix.primitive.indexedmap.IndexedMapRequest"></a>

### IndexedMapRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [IndexedMapInput](#atomix.primitive.indexedmap.IndexedMapInput) |  |  |






<a name="atomix.primitive.indexedmap.IndexedMapResponse"></a>

### IndexedMapResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [IndexedMapOutput](#atomix.primitive.indexedmap.IndexedMapOutput) |  |  |






<a name="atomix.primitive.indexedmap.LastEntryInput"></a>

### LastEntryInput







<a name="atomix.primitive.indexedmap.LastEntryOutput"></a>

### LastEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [LastEntryInput](#atomix.primitive.indexedmap.LastEntryInput) |  |  |






<a name="atomix.primitive.indexedmap.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [LastEntryOutput](#atomix.primitive.indexedmap.LastEntryOutput) |  |  |






<a name="atomix.primitive.indexedmap.NextEntryInput"></a>

### NextEntryInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.indexedmap.NextEntryOutput"></a>

### NextEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [NextEntryInput](#atomix.primitive.indexedmap.NextEntryInput) |  |  |






<a name="atomix.primitive.indexedmap.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [NextEntryOutput](#atomix.primitive.indexedmap.NextEntryOutput) |  |  |






<a name="atomix.primitive.indexedmap.Position"></a>

### Position



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.primitive.indexedmap.PrevEntryInput"></a>

### PrevEntryInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.indexedmap.PrevEntryOutput"></a>

### PrevEntryOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [PrevEntryInput](#atomix.primitive.indexedmap.PrevEntryInput) |  |  |






<a name="atomix.primitive.indexedmap.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [PrevEntryOutput](#atomix.primitive.indexedmap.PrevEntryOutput) |  |  |






<a name="atomix.primitive.indexedmap.PutInput"></a>

### PutInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |
| if_empty | [bool](#bool) |  |  |






<a name="atomix.primitive.indexedmap.PutOutput"></a>

### PutOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [PutInput](#atomix.primitive.indexedmap.PutInput) |  |  |






<a name="atomix.primitive.indexedmap.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [PutOutput](#atomix.primitive.indexedmap.PutOutput) |  |  |






<a name="atomix.primitive.indexedmap.RemoveInput"></a>

### RemoveInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |






<a name="atomix.primitive.indexedmap.RemoveOutput"></a>

### RemoveOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.indexedmap.Entry) |  |  |






<a name="atomix.primitive.indexedmap.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [RemoveInput](#atomix.primitive.indexedmap.RemoveInput) |  |  |






<a name="atomix.primitive.indexedmap.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [RemoveOutput](#atomix.primitive.indexedmap.RemoveOutput) |  |  |






<a name="atomix.primitive.indexedmap.SizeInput"></a>

### SizeInput







<a name="atomix.primitive.indexedmap.SizeOutput"></a>

### SizeOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [uint32](#uint32) |  |  |






<a name="atomix.primitive.indexedmap.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [SizeInput](#atomix.primitive.indexedmap.SizeInput) |  |  |






<a name="atomix.primitive.indexedmap.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SizeOutput](#atomix.primitive.indexedmap.SizeOutput) |  |  |






<a name="atomix.primitive.indexedmap.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bytes](#bytes) |  |  |
| timestamp | [atomix.primitive.meta.Timestamp](#atomix.primitive.meta.Timestamp) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |





 


<a name="atomix.primitive.indexedmap.EventsOutput.Type"></a>

### EventsOutput.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| INSERTED | 1 |  |
| UPDATED | 2 |  |
| REMOVED | 3 |  |


 

 


<a name="atomix.primitive.indexedmap.IndexedMapService"></a>

### IndexedMapService
IndexedMap service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.indexedmap.SizeRequest) | [SizeResponse](#atomix.primitive.indexedmap.SizeResponse) | Size returns the size of the map |
| Exists | [ExistsRequest](#atomix.primitive.indexedmap.ExistsRequest) | [ExistsResponse](#atomix.primitive.indexedmap.ExistsResponse) | Exists checks whether a key exists in the map |
| Put | [PutRequest](#atomix.primitive.indexedmap.PutRequest) | [PutResponse](#atomix.primitive.indexedmap.PutResponse) | Put puts an entry into the map |
| Get | [GetRequest](#atomix.primitive.indexedmap.GetRequest) | [GetResponse](#atomix.primitive.indexedmap.GetResponse) | Get gets the entry for a key |
| FirstEntry | [FirstEntryRequest](#atomix.primitive.indexedmap.FirstEntryRequest) | [FirstEntryResponse](#atomix.primitive.indexedmap.FirstEntryResponse) | FirstEntry gets the first entry in the map |
| LastEntry | [LastEntryRequest](#atomix.primitive.indexedmap.LastEntryRequest) | [LastEntryResponse](#atomix.primitive.indexedmap.LastEntryResponse) | LastEntry gets the last entry in the map |
| PrevEntry | [PrevEntryRequest](#atomix.primitive.indexedmap.PrevEntryRequest) | [PrevEntryResponse](#atomix.primitive.indexedmap.PrevEntryResponse) | PrevEntry gets the previous entry in the map |
| NextEntry | [NextEntryRequest](#atomix.primitive.indexedmap.NextEntryRequest) | [NextEntryResponse](#atomix.primitive.indexedmap.NextEntryResponse) | NextEntry gets the next entry in the map |
| Remove | [RemoveRequest](#atomix.primitive.indexedmap.RemoveRequest) | [RemoveResponse](#atomix.primitive.indexedmap.RemoveResponse) | Remove removes an entry from the map |
| Clear | [ClearRequest](#atomix.primitive.indexedmap.ClearRequest) | [ClearResponse](#atomix.primitive.indexedmap.ClearResponse) | Clear removes all entries from the map |
| Events | [EventsRequest](#atomix.primitive.indexedmap.EventsRequest) | [EventsResponse](#atomix.primitive.indexedmap.EventsResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.primitive.indexedmap.EntriesRequest) | [EntriesResponse](#atomix.primitive.indexedmap.EntriesResponse) stream | Entries lists all entries in the map |

 



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

