# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/indexedmap/indexedmap.proto](#atomix/database/indexedmap/indexedmap.proto)
    - [ClearRequest](#atomix.database.indexedmap.ClearRequest)
    - [ClearResponse](#atomix.database.indexedmap.ClearResponse)
    - [CloseRequest](#atomix.database.indexedmap.CloseRequest)
    - [CloseResponse](#atomix.database.indexedmap.CloseResponse)
    - [CreateRequest](#atomix.database.indexedmap.CreateRequest)
    - [CreateResponse](#atomix.database.indexedmap.CreateResponse)
    - [EntriesRequest](#atomix.database.indexedmap.EntriesRequest)
    - [EntriesResponse](#atomix.database.indexedmap.EntriesResponse)
    - [EventRequest](#atomix.database.indexedmap.EventRequest)
    - [EventResponse](#atomix.database.indexedmap.EventResponse)
    - [ExistsRequest](#atomix.database.indexedmap.ExistsRequest)
    - [ExistsResponse](#atomix.database.indexedmap.ExistsResponse)
    - [FirstEntryRequest](#atomix.database.indexedmap.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.database.indexedmap.FirstEntryResponse)
    - [GetRequest](#atomix.database.indexedmap.GetRequest)
    - [GetResponse](#atomix.database.indexedmap.GetResponse)
    - [LastEntryRequest](#atomix.database.indexedmap.LastEntryRequest)
    - [LastEntryResponse](#atomix.database.indexedmap.LastEntryResponse)
    - [NextEntryRequest](#atomix.database.indexedmap.NextEntryRequest)
    - [NextEntryResponse](#atomix.database.indexedmap.NextEntryResponse)
    - [PrevEntryRequest](#atomix.database.indexedmap.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.database.indexedmap.PrevEntryResponse)
    - [PutRequest](#atomix.database.indexedmap.PutRequest)
    - [PutResponse](#atomix.database.indexedmap.PutResponse)
    - [RemoveRequest](#atomix.database.indexedmap.RemoveRequest)
    - [RemoveResponse](#atomix.database.indexedmap.RemoveResponse)
    - [ReplaceRequest](#atomix.database.indexedmap.ReplaceRequest)
    - [ReplaceResponse](#atomix.database.indexedmap.ReplaceResponse)
    - [SizeRequest](#atomix.database.indexedmap.SizeRequest)
    - [SizeResponse](#atomix.database.indexedmap.SizeResponse)
  
    - [EventResponse.Type](#atomix.database.indexedmap.EventResponse.Type)
    - [ResponseStatus](#atomix.database.indexedmap.ResponseStatus)
  
  
    - [IndexedMapService](#atomix.database.indexedmap.IndexedMapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/indexedmap/indexedmap.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/indexedmap/indexedmap.proto



<a name="atomix.database.indexedmap.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.indexedmap.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.indexedmap.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.indexedmap.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.indexedmap.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.indexedmap.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.indexedmap.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.indexedmap.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| key | [string](#string) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |
| key | [string](#string) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.indexedmap.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.indexedmap.EventResponse.Type) |  |  |
| key | [string](#string) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.database.indexedmap.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| contains_key | [bool](#bool) |  |  |






<a name="atomix.database.indexedmap.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.indexedmap.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.database.indexedmap.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.indexedmap.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.indexedmap.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.indexedmap.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.database.indexedmap.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.indexedmap.ResponseStatus) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |






<a name="atomix.database.indexedmap.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.indexedmap.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.indexedmap.ResponseStatus) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |






<a name="atomix.database.indexedmap.ReplaceRequest"></a>

### ReplaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |
| new_value | [bytes](#bytes) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.database.indexedmap.ReplaceResponse"></a>

### ReplaceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.indexedmap.ResponseStatus) |  |  |
| index | [int64](#int64) |  |  |
| key | [string](#string) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |






<a name="atomix.database.indexedmap.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.indexedmap.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.database.indexedmap.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| INSERTED | 1 |  |
| UPDATED | 2 |  |
| REMOVED | 3 |  |



<a name="atomix.database.indexedmap.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| PRECONDITION_FAILED | 3 |  |


 

 


<a name="atomix.database.indexedmap.IndexedMapService"></a>

### IndexedMapService
IndexedMap service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.indexedmap.CreateRequest) | [CreateResponse](#atomix.database.indexedmap.CreateResponse) | Create creates an indexed map |
| Close | [CloseRequest](#atomix.database.indexedmap.CloseRequest) | [CloseResponse](#atomix.database.indexedmap.CloseResponse) | Close closes an indexed map |
| Size | [SizeRequest](#atomix.database.indexedmap.SizeRequest) | [SizeResponse](#atomix.database.indexedmap.SizeResponse) | Size returns the size of the map |
| Exists | [ExistsRequest](#atomix.database.indexedmap.ExistsRequest) | [ExistsResponse](#atomix.database.indexedmap.ExistsResponse) | Exists checks whether a key exists in the map |
| Put | [PutRequest](#atomix.database.indexedmap.PutRequest) | [PutResponse](#atomix.database.indexedmap.PutResponse) | Put puts an entry into the map |
| Replace | [ReplaceRequest](#atomix.database.indexedmap.ReplaceRequest) | [ReplaceResponse](#atomix.database.indexedmap.ReplaceResponse) | Replace performs a check-and-set operation on an entry in the map |
| Get | [GetRequest](#atomix.database.indexedmap.GetRequest) | [GetResponse](#atomix.database.indexedmap.GetResponse) | Get gets the entry for a key |
| FirstEntry | [FirstEntryRequest](#atomix.database.indexedmap.FirstEntryRequest) | [FirstEntryResponse](#atomix.database.indexedmap.FirstEntryResponse) | FirstEntry gets the first entry in the map |
| LastEntry | [LastEntryRequest](#atomix.database.indexedmap.LastEntryRequest) | [LastEntryResponse](#atomix.database.indexedmap.LastEntryResponse) | LastEntry gets the last entry in the map |
| PrevEntry | [PrevEntryRequest](#atomix.database.indexedmap.PrevEntryRequest) | [PrevEntryResponse](#atomix.database.indexedmap.PrevEntryResponse) | PrevEntry gets the previous entry in the map |
| NextEntry | [NextEntryRequest](#atomix.database.indexedmap.NextEntryRequest) | [NextEntryResponse](#atomix.database.indexedmap.NextEntryResponse) | NextEntry gets the next entry in the map |
| Remove | [RemoveRequest](#atomix.database.indexedmap.RemoveRequest) | [RemoveResponse](#atomix.database.indexedmap.RemoveResponse) | Remove removes an entry from the map |
| Clear | [ClearRequest](#atomix.database.indexedmap.ClearRequest) | [ClearResponse](#atomix.database.indexedmap.ClearResponse) | Clear removes all entries from the map |
| Events | [EventRequest](#atomix.database.indexedmap.EventRequest) | [EventResponse](#atomix.database.indexedmap.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.database.indexedmap.EntriesRequest) | [EntriesResponse](#atomix.database.indexedmap.EntriesResponse) stream | Entries lists all entries in the map |

 



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

