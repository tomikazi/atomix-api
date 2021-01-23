# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/log/log.proto](#atomix/primitive/log/log.proto)
    - [AppendRequest](#atomix.primitive.log.AppendRequest)
    - [AppendResponse](#atomix.primitive.log.AppendResponse)
    - [ClearRequest](#atomix.primitive.log.ClearRequest)
    - [ClearResponse](#atomix.primitive.log.ClearResponse)
    - [EntriesRequest](#atomix.primitive.log.EntriesRequest)
    - [EntriesResponse](#atomix.primitive.log.EntriesResponse)
    - [Entry](#atomix.primitive.log.Entry)
    - [Event](#atomix.primitive.log.Event)
    - [EventsRequest](#atomix.primitive.log.EventsRequest)
    - [EventsResponse](#atomix.primitive.log.EventsResponse)
    - [FirstEntryRequest](#atomix.primitive.log.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.primitive.log.FirstEntryResponse)
    - [GetRequest](#atomix.primitive.log.GetRequest)
    - [GetResponse](#atomix.primitive.log.GetResponse)
    - [LastEntryRequest](#atomix.primitive.log.LastEntryRequest)
    - [LastEntryResponse](#atomix.primitive.log.LastEntryResponse)
    - [NextEntryRequest](#atomix.primitive.log.NextEntryRequest)
    - [NextEntryResponse](#atomix.primitive.log.NextEntryResponse)
    - [PrevEntryRequest](#atomix.primitive.log.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.primitive.log.PrevEntryResponse)
    - [RemoveRequest](#atomix.primitive.log.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.log.RemoveResponse)
    - [SizeRequest](#atomix.primitive.log.SizeRequest)
    - [SizeResponse](#atomix.primitive.log.SizeResponse)
  
    - [Event.Type](#atomix.primitive.log.Event.Type)
  
  
    - [LogService](#atomix.primitive.log.LogService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/log/log.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/log/log.proto



<a name="atomix.primitive.log.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.log.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |






<a name="atomix.primitive.log.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.log.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.log.Event.Type) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| replay | [bool](#bool) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| event | [Event](#atomix.primitive.log.Event) |  |  |






<a name="atomix.primitive.log.FirstEntryRequest"></a>

### FirstEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.log.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.LastEntryRequest"></a>

### LastEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.log.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| entry | [Entry](#atomix.primitive.log.Entry) |  |  |






<a name="atomix.primitive.log.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.log.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.primitive.log.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| APPEND | 1 |  |
| REMOVE | 2 |  |
| REPLAY | 3 |  |


 

 


<a name="atomix.primitive.log.LogService"></a>

### LogService
LogService log service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.log.SizeRequest) | [SizeResponse](#atomix.primitive.log.SizeResponse) | Size returns the size of the log |
| Append | [AppendRequest](#atomix.primitive.log.AppendRequest) | [AppendResponse](#atomix.primitive.log.AppendResponse) | Appends appends an entry into the log |
| Get | [GetRequest](#atomix.primitive.log.GetRequest) | [GetResponse](#atomix.primitive.log.GetResponse) | Get gets the entry for an index |
| FirstEntry | [FirstEntryRequest](#atomix.primitive.log.FirstEntryRequest) | [FirstEntryResponse](#atomix.primitive.log.FirstEntryResponse) | FirstEntry gets the first entry in the log |
| LastEntry | [LastEntryRequest](#atomix.primitive.log.LastEntryRequest) | [LastEntryResponse](#atomix.primitive.log.LastEntryResponse) | LastEntry gets the last entry in the log |
| PrevEntry | [PrevEntryRequest](#atomix.primitive.log.PrevEntryRequest) | [PrevEntryResponse](#atomix.primitive.log.PrevEntryResponse) | PrevEntry gets the previous entry in the log |
| NextEntry | [NextEntryRequest](#atomix.primitive.log.NextEntryRequest) | [NextEntryResponse](#atomix.primitive.log.NextEntryResponse) | NextEntry gets the next entry in the log |
| Remove | [RemoveRequest](#atomix.primitive.log.RemoveRequest) | [RemoveResponse](#atomix.primitive.log.RemoveResponse) | Remove removes an entry from the log |
| Clear | [ClearRequest](#atomix.primitive.log.ClearRequest) | [ClearResponse](#atomix.primitive.log.ClearResponse) | Clear removes all entries from the log |
| Events | [EventsRequest](#atomix.primitive.log.EventsRequest) | [EventsResponse](#atomix.primitive.log.EventsResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.primitive.log.EntriesRequest) | [EntriesResponse](#atomix.primitive.log.EntriesResponse) stream | Entries lists all entries in the log |

 



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

