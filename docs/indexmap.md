# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/indexedmap/indexedmap.proto](#atomix/storage/indexedmap/indexedmap.proto)
    - [ClearRequest](#atomix.storage.indexedmap.ClearRequest)
    - [ClearResponse](#atomix.storage.indexedmap.ClearResponse)
    - [CloseRequest](#atomix.storage.indexedmap.CloseRequest)
    - [CloseResponse](#atomix.storage.indexedmap.CloseResponse)
    - [CreateRequest](#atomix.storage.indexedmap.CreateRequest)
    - [CreateResponse](#atomix.storage.indexedmap.CreateResponse)
    - [EntriesRequest](#atomix.storage.indexedmap.EntriesRequest)
    - [EntriesResponse](#atomix.storage.indexedmap.EntriesResponse)
    - [EventRequest](#atomix.storage.indexedmap.EventRequest)
    - [EventResponse](#atomix.storage.indexedmap.EventResponse)
    - [ExistsRequest](#atomix.storage.indexedmap.ExistsRequest)
    - [ExistsResponse](#atomix.storage.indexedmap.ExistsResponse)
    - [FirstEntryRequest](#atomix.storage.indexedmap.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.storage.indexedmap.FirstEntryResponse)
    - [GetRequest](#atomix.storage.indexedmap.GetRequest)
    - [GetResponse](#atomix.storage.indexedmap.GetResponse)
    - [LastEntryRequest](#atomix.storage.indexedmap.LastEntryRequest)
    - [LastEntryResponse](#atomix.storage.indexedmap.LastEntryResponse)
    - [NextEntryRequest](#atomix.storage.indexedmap.NextEntryRequest)
    - [NextEntryResponse](#atomix.storage.indexedmap.NextEntryResponse)
    - [PrevEntryRequest](#atomix.storage.indexedmap.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.storage.indexedmap.PrevEntryResponse)
    - [PutRequest](#atomix.storage.indexedmap.PutRequest)
    - [PutResponse](#atomix.storage.indexedmap.PutResponse)
    - [RemoveRequest](#atomix.storage.indexedmap.RemoveRequest)
    - [RemoveResponse](#atomix.storage.indexedmap.RemoveResponse)
    - [ReplaceRequest](#atomix.storage.indexedmap.ReplaceRequest)
    - [ReplaceResponse](#atomix.storage.indexedmap.ReplaceResponse)
    - [SizeRequest](#atomix.storage.indexedmap.SizeRequest)
    - [SizeResponse](#atomix.storage.indexedmap.SizeResponse)
  
    - [EventResponse.Type](#atomix.storage.indexedmap.EventResponse.Type)
    - [ResponseStatus](#atomix.storage.indexedmap.ResponseStatus)
  
  
    - [IndexedMapService](#atomix.storage.indexedmap.IndexedMapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/indexedmap/indexedmap.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/indexedmap/indexedmap.proto



<a name="atomix.storage.indexedmap.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.indexedmap.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.indexedmap.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.indexedmap.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.indexedmap.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.indexedmap.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.indexedmap.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.indexedmap.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| key | [string](#string) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |
| key | [string](#string) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.indexedmap.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.storage.indexedmap.EventResponse.Type) |  |  |
| key | [string](#string) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.storage.indexedmap.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| contains_key | [bool](#bool) |  |  |






<a name="atomix.storage.indexedmap.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.indexedmap.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.storage.indexedmap.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.indexedmap.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.indexedmap.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.indexedmap.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| if_empty | [bool](#bool) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.storage.indexedmap.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.indexedmap.ResponseStatus) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |






<a name="atomix.storage.indexedmap.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.indexedmap.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.indexedmap.ResponseStatus) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |






<a name="atomix.storage.indexedmap.ReplaceRequest"></a>

### ReplaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |
| new_value | [bytes](#bytes) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.storage.indexedmap.ReplaceResponse"></a>

### ReplaceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.indexedmap.ResponseStatus) |  |  |
| index | [uint64](#uint64) |  |  |
| key | [string](#string) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |






<a name="atomix.storage.indexedmap.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.indexedmap.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| size | [uint32](#uint32) |  |  |





 


<a name="atomix.storage.indexedmap.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| INSERTED | 1 |  |
| UPDATED | 2 |  |
| REMOVED | 3 |  |



<a name="atomix.storage.indexedmap.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| PRECONDITION_FAILED | 3 |  |


 

 


<a name="atomix.storage.indexedmap.IndexedMapService"></a>

### IndexedMapService
IndexedMap service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.indexedmap.CreateRequest) | [CreateResponse](#atomix.storage.indexedmap.CreateResponse) | Create creates an indexed map |
| Close | [CloseRequest](#atomix.storage.indexedmap.CloseRequest) | [CloseResponse](#atomix.storage.indexedmap.CloseResponse) | Close closes an indexed map |
| Size | [SizeRequest](#atomix.storage.indexedmap.SizeRequest) | [SizeResponse](#atomix.storage.indexedmap.SizeResponse) | Size returns the size of the map |
| Exists | [ExistsRequest](#atomix.storage.indexedmap.ExistsRequest) | [ExistsResponse](#atomix.storage.indexedmap.ExistsResponse) | Exists checks whether a key exists in the map |
| Put | [PutRequest](#atomix.storage.indexedmap.PutRequest) | [PutResponse](#atomix.storage.indexedmap.PutResponse) | Put puts an entry into the map |
| Replace | [ReplaceRequest](#atomix.storage.indexedmap.ReplaceRequest) | [ReplaceResponse](#atomix.storage.indexedmap.ReplaceResponse) | Replace performs a check-and-set operation on an entry in the map |
| Get | [GetRequest](#atomix.storage.indexedmap.GetRequest) | [GetResponse](#atomix.storage.indexedmap.GetResponse) | Get gets the entry for a key |
| FirstEntry | [FirstEntryRequest](#atomix.storage.indexedmap.FirstEntryRequest) | [FirstEntryResponse](#atomix.storage.indexedmap.FirstEntryResponse) | FirstEntry gets the first entry in the map |
| LastEntry | [LastEntryRequest](#atomix.storage.indexedmap.LastEntryRequest) | [LastEntryResponse](#atomix.storage.indexedmap.LastEntryResponse) | LastEntry gets the last entry in the map |
| PrevEntry | [PrevEntryRequest](#atomix.storage.indexedmap.PrevEntryRequest) | [PrevEntryResponse](#atomix.storage.indexedmap.PrevEntryResponse) | PrevEntry gets the previous entry in the map |
| NextEntry | [NextEntryRequest](#atomix.storage.indexedmap.NextEntryRequest) | [NextEntryResponse](#atomix.storage.indexedmap.NextEntryResponse) | NextEntry gets the next entry in the map |
| Remove | [RemoveRequest](#atomix.storage.indexedmap.RemoveRequest) | [RemoveResponse](#atomix.storage.indexedmap.RemoveResponse) | Remove removes an entry from the map |
| Clear | [ClearRequest](#atomix.storage.indexedmap.ClearRequest) | [ClearResponse](#atomix.storage.indexedmap.ClearResponse) | Clear removes all entries from the map |
| Events | [EventRequest](#atomix.storage.indexedmap.EventRequest) | [EventResponse](#atomix.storage.indexedmap.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.storage.indexedmap.EntriesRequest) | [EntriesResponse](#atomix.storage.indexedmap.EntriesResponse) stream | Entries lists all entries in the map |

 



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

