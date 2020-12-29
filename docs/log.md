# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/log/log.proto](#atomix/storage/log/log.proto)
    - [AppendRequest](#atomix.storage.log.AppendRequest)
    - [AppendResponse](#atomix.storage.log.AppendResponse)
    - [ClearRequest](#atomix.storage.log.ClearRequest)
    - [ClearResponse](#atomix.storage.log.ClearResponse)
    - [CloseRequest](#atomix.storage.log.CloseRequest)
    - [CloseResponse](#atomix.storage.log.CloseResponse)
    - [CreateRequest](#atomix.storage.log.CreateRequest)
    - [CreateResponse](#atomix.storage.log.CreateResponse)
    - [EntriesRequest](#atomix.storage.log.EntriesRequest)
    - [EntriesResponse](#atomix.storage.log.EntriesResponse)
    - [EventRequest](#atomix.storage.log.EventRequest)
    - [EventResponse](#atomix.storage.log.EventResponse)
    - [ExistsRequest](#atomix.storage.log.ExistsRequest)
    - [ExistsResponse](#atomix.storage.log.ExistsResponse)
    - [FirstEntryRequest](#atomix.storage.log.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.storage.log.FirstEntryResponse)
    - [GetRequest](#atomix.storage.log.GetRequest)
    - [GetResponse](#atomix.storage.log.GetResponse)
    - [LastEntryRequest](#atomix.storage.log.LastEntryRequest)
    - [LastEntryResponse](#atomix.storage.log.LastEntryResponse)
    - [NextEntryRequest](#atomix.storage.log.NextEntryRequest)
    - [NextEntryResponse](#atomix.storage.log.NextEntryResponse)
    - [PrevEntryRequest](#atomix.storage.log.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.storage.log.PrevEntryResponse)
    - [RemoveRequest](#atomix.storage.log.RemoveRequest)
    - [RemoveResponse](#atomix.storage.log.RemoveResponse)
    - [SizeRequest](#atomix.storage.log.SizeRequest)
    - [SizeResponse](#atomix.storage.log.SizeResponse)
  
    - [EventResponse.Type](#atomix.storage.log.EventResponse.Type)
    - [ResponseStatus](#atomix.storage.log.ResponseStatus)
  
  
    - [LogService](#atomix.storage.log.LogService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/log/log.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/log/log.proto



<a name="atomix.storage.log.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.storage.log.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.log.ResponseStatus) |  |  |
| index | [uint64](#uint64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.log.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.log.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.log.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.log.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.log.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.log.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.log.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.log.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.storage.log.EventResponse.Type) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.log.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| contains_index | [bool](#bool) |  |  |






<a name="atomix.storage.log.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.log.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.log.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.log.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.log.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.storage.log.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.log.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.log.ResponseStatus) |  |  |
| index | [uint64](#uint64) |  |  |
| previous_value | [bytes](#bytes) |  |  |






<a name="atomix.storage.log.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.log.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.storage.log.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| APPENDED | 1 |  |
| REMOVED | 2 |  |



<a name="atomix.storage.log.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| PRECONDITION_FAILED | 3 |  |


 

 


<a name="atomix.storage.log.LogService"></a>

### LogService
LogService log service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.log.CreateRequest) | [CreateResponse](#atomix.storage.log.CreateResponse) | Create creates a log |
| Close | [CloseRequest](#atomix.storage.log.CloseRequest) | [CloseResponse](#atomix.storage.log.CloseResponse) | Close closes a log |
| Size | [SizeRequest](#atomix.storage.log.SizeRequest) | [SizeResponse](#atomix.storage.log.SizeResponse) | Size returns the size of the log |
| Exists | [ExistsRequest](#atomix.storage.log.ExistsRequest) | [ExistsResponse](#atomix.storage.log.ExistsResponse) | Exists checks whether an index exists in the log |
| Append | [AppendRequest](#atomix.storage.log.AppendRequest) | [AppendResponse](#atomix.storage.log.AppendResponse) | Appends appends an entry into the log |
| Get | [GetRequest](#atomix.storage.log.GetRequest) | [GetResponse](#atomix.storage.log.GetResponse) | Get gets the entry for an index |
| FirstEntry | [FirstEntryRequest](#atomix.storage.log.FirstEntryRequest) | [FirstEntryResponse](#atomix.storage.log.FirstEntryResponse) | FirstEntry gets the first entry in the log |
| LastEntry | [LastEntryRequest](#atomix.storage.log.LastEntryRequest) | [LastEntryResponse](#atomix.storage.log.LastEntryResponse) | LastEntry gets the last entry in the log |
| PrevEntry | [PrevEntryRequest](#atomix.storage.log.PrevEntryRequest) | [PrevEntryResponse](#atomix.storage.log.PrevEntryResponse) | PrevEntry gets the previous entry in the log |
| NextEntry | [NextEntryRequest](#atomix.storage.log.NextEntryRequest) | [NextEntryResponse](#atomix.storage.log.NextEntryResponse) | NextEntry gets the next entry in the log |
| Remove | [RemoveRequest](#atomix.storage.log.RemoveRequest) | [RemoveResponse](#atomix.storage.log.RemoveResponse) | Remove removes an entry from the log |
| Clear | [ClearRequest](#atomix.storage.log.ClearRequest) | [ClearResponse](#atomix.storage.log.ClearResponse) | Clear removes all entries from the log |
| Events | [EventRequest](#atomix.storage.log.EventRequest) | [EventResponse](#atomix.storage.log.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.storage.log.EntriesRequest) | [EntriesResponse](#atomix.storage.log.EntriesResponse) stream | Entries lists all entries in the log |

 



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

