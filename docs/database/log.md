# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/log/log.proto](#atomix/database/log/log.proto)
    - [AppendRequest](#atomix.database.log.AppendRequest)
    - [AppendResponse](#atomix.database.log.AppendResponse)
    - [ClearRequest](#atomix.database.log.ClearRequest)
    - [ClearResponse](#atomix.database.log.ClearResponse)
    - [CloseRequest](#atomix.database.log.CloseRequest)
    - [CloseResponse](#atomix.database.log.CloseResponse)
    - [CreateRequest](#atomix.database.log.CreateRequest)
    - [CreateResponse](#atomix.database.log.CreateResponse)
    - [EntriesRequest](#atomix.database.log.EntriesRequest)
    - [EntriesResponse](#atomix.database.log.EntriesResponse)
    - [EventRequest](#atomix.database.log.EventRequest)
    - [EventResponse](#atomix.database.log.EventResponse)
    - [ExistsRequest](#atomix.database.log.ExistsRequest)
    - [ExistsResponse](#atomix.database.log.ExistsResponse)
    - [FirstEntryRequest](#atomix.database.log.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.database.log.FirstEntryResponse)
    - [GetRequest](#atomix.database.log.GetRequest)
    - [GetResponse](#atomix.database.log.GetResponse)
    - [LastEntryRequest](#atomix.database.log.LastEntryRequest)
    - [LastEntryResponse](#atomix.database.log.LastEntryResponse)
    - [NextEntryRequest](#atomix.database.log.NextEntryRequest)
    - [NextEntryResponse](#atomix.database.log.NextEntryResponse)
    - [PrevEntryRequest](#atomix.database.log.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.database.log.PrevEntryResponse)
    - [RemoveRequest](#atomix.database.log.RemoveRequest)
    - [RemoveResponse](#atomix.database.log.RemoveResponse)
    - [SizeRequest](#atomix.database.log.SizeRequest)
    - [SizeResponse](#atomix.database.log.SizeResponse)
  
    - [EventResponse.Type](#atomix.database.log.EventResponse.Type)
    - [ResponseStatus](#atomix.database.log.ResponseStatus)
  
  
    - [LogService](#atomix.database.log.LogService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/log/log.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/log/log.proto



<a name="atomix.database.log.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.database.log.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.log.ResponseStatus) |  |  |
| index | [int64](#int64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.log.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.log.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.log.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.log.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.log.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.log.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.log.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.log.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.log.EventResponse.Type) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.database.log.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| contains_index | [bool](#bool) |  |  |






<a name="atomix.database.log.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.log.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.log.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.log.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.log.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |






<a name="atomix.database.log.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [int64](#int64) |  |  |
| value | [bytes](#bytes) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.log.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.log.ResponseStatus) |  |  |
| index | [int64](#int64) |  |  |
| previous_value | [bytes](#bytes) |  |  |






<a name="atomix.database.log.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.log.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.database.log.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| APPENDED | 1 |  |
| REMOVED | 2 |  |



<a name="atomix.database.log.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| PRECONDITION_FAILED | 3 |  |


 

 


<a name="atomix.database.log.LogService"></a>

### LogService
LogService log service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.log.CreateRequest) | [CreateResponse](#atomix.database.log.CreateResponse) | Create creates a log |
| Close | [CloseRequest](#atomix.database.log.CloseRequest) | [CloseResponse](#atomix.database.log.CloseResponse) | Close closes a log |
| Size | [SizeRequest](#atomix.database.log.SizeRequest) | [SizeResponse](#atomix.database.log.SizeResponse) | Size returns the size of the log |
| Exists | [ExistsRequest](#atomix.database.log.ExistsRequest) | [ExistsResponse](#atomix.database.log.ExistsResponse) | Exists checks whether an index exists in the log |
| Append | [AppendRequest](#atomix.database.log.AppendRequest) | [AppendResponse](#atomix.database.log.AppendResponse) | Appends appends an entry into the log |
| Get | [GetRequest](#atomix.database.log.GetRequest) | [GetResponse](#atomix.database.log.GetResponse) | Get gets the entry for an index |
| FirstEntry | [FirstEntryRequest](#atomix.database.log.FirstEntryRequest) | [FirstEntryResponse](#atomix.database.log.FirstEntryResponse) | FirstEntry gets the first entry in the log |
| LastEntry | [LastEntryRequest](#atomix.database.log.LastEntryRequest) | [LastEntryResponse](#atomix.database.log.LastEntryResponse) | LastEntry gets the last entry in the log |
| PrevEntry | [PrevEntryRequest](#atomix.database.log.PrevEntryRequest) | [PrevEntryResponse](#atomix.database.log.PrevEntryResponse) | PrevEntry gets the previous entry in the log |
| NextEntry | [NextEntryRequest](#atomix.database.log.NextEntryRequest) | [NextEntryResponse](#atomix.database.log.NextEntryResponse) | NextEntry gets the next entry in the log |
| Remove | [RemoveRequest](#atomix.database.log.RemoveRequest) | [RemoveResponse](#atomix.database.log.RemoveResponse) | Remove removes an entry from the log |
| Clear | [ClearRequest](#atomix.database.log.ClearRequest) | [ClearResponse](#atomix.database.log.ClearResponse) | Clear removes all entries from the log |
| Events | [EventRequest](#atomix.database.log.EventRequest) | [EventResponse](#atomix.database.log.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.database.log.EntriesRequest) | [EntriesResponse](#atomix.database.log.EntriesResponse) stream | Entries lists all entries in the log |

 



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

