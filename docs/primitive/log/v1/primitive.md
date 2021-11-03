# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/log/v1/primitive.proto](#atomix/primitive/log/v1/primitive.proto)
    - [AppendRequest](#atomix.primitive.log.v1.AppendRequest)
    - [AppendResponse](#atomix.primitive.log.v1.AppendResponse)
    - [ClearRequest](#atomix.primitive.log.v1.ClearRequest)
    - [ClearResponse](#atomix.primitive.log.v1.ClearResponse)
    - [EntriesRequest](#atomix.primitive.log.v1.EntriesRequest)
    - [EntriesResponse](#atomix.primitive.log.v1.EntriesResponse)
    - [Entry](#atomix.primitive.log.v1.Entry)
    - [Event](#atomix.primitive.log.v1.Event)
    - [EventsRequest](#atomix.primitive.log.v1.EventsRequest)
    - [EventsResponse](#atomix.primitive.log.v1.EventsResponse)
    - [FirstEntryRequest](#atomix.primitive.log.v1.FirstEntryRequest)
    - [FirstEntryResponse](#atomix.primitive.log.v1.FirstEntryResponse)
    - [GetRequest](#atomix.primitive.log.v1.GetRequest)
    - [GetResponse](#atomix.primitive.log.v1.GetResponse)
    - [LastEntryRequest](#atomix.primitive.log.v1.LastEntryRequest)
    - [LastEntryResponse](#atomix.primitive.log.v1.LastEntryResponse)
    - [NextEntryRequest](#atomix.primitive.log.v1.NextEntryRequest)
    - [NextEntryResponse](#atomix.primitive.log.v1.NextEntryResponse)
    - [PrevEntryRequest](#atomix.primitive.log.v1.PrevEntryRequest)
    - [PrevEntryResponse](#atomix.primitive.log.v1.PrevEntryResponse)
    - [RemoveRequest](#atomix.primitive.log.v1.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.log.v1.RemoveResponse)
    - [SizeRequest](#atomix.primitive.log.v1.SizeRequest)
    - [SizeResponse](#atomix.primitive.log.v1.SizeResponse)
  
    - [Event.Type](#atomix.primitive.log.v1.Event.Type)
  
    - [Log](#atomix.primitive.log.v1.Log)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/log/v1/primitive.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/log/v1/primitive.proto



<a name="atomix.primitive.log.v1.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.v1.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.ClearRequest"></a>

### ClearRequest







<a name="atomix.primitive.log.v1.ClearResponse"></a>

### ClearResponse







<a name="atomix.primitive.log.v1.EntriesRequest"></a>

### EntriesRequest







<a name="atomix.primitive.log.v1.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.v1.ObjectMeta](#atomix.primitive.meta.v1.ObjectMeta) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.primitive.log.v1.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.log.v1.Event.Type) |  |  |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replay | [bool](#bool) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.v1.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| event | [Event](#atomix.primitive.log.v1.Event) |  |  |






<a name="atomix.primitive.log.v1.FirstEntryRequest"></a>

### FirstEntryRequest







<a name="atomix.primitive.log.v1.FirstEntryResponse"></a>

### FirstEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.v1.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.LastEntryRequest"></a>

### LastEntryRequest







<a name="atomix.primitive.log.v1.LastEntryResponse"></a>

### LastEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.NextEntryRequest"></a>

### NextEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.v1.NextEntryResponse"></a>

### NextEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.PrevEntryRequest"></a>

### PrevEntryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |






<a name="atomix.primitive.log.v1.PrevEntryResponse"></a>

### PrevEntryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| entry | [Entry](#atomix.primitive.log.v1.Entry) |  |  |






<a name="atomix.primitive.log.v1.SizeRequest"></a>

### SizeRequest







<a name="atomix.primitive.log.v1.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [int32](#int32) |  |  |





 


<a name="atomix.primitive.log.v1.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| APPEND | 1 |  |
| REMOVE | 2 |  |
| REPLAY | 3 |  |


 

 


<a name="atomix.primitive.log.v1.Log"></a>

### Log
Log is a service for a log primitive

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.log.v1.SizeRequest) | [SizeResponse](#atomix.primitive.log.v1.SizeResponse) | Size returns the size of the log |
| Append | [AppendRequest](#atomix.primitive.log.v1.AppendRequest) | [AppendResponse](#atomix.primitive.log.v1.AppendResponse) | Appends appends an entry into the log |
| Get | [GetRequest](#atomix.primitive.log.v1.GetRequest) | [GetResponse](#atomix.primitive.log.v1.GetResponse) | Get gets the entry for an index |
| FirstEntry | [FirstEntryRequest](#atomix.primitive.log.v1.FirstEntryRequest) | [FirstEntryResponse](#atomix.primitive.log.v1.FirstEntryResponse) | FirstEntry gets the first entry in the log |
| LastEntry | [LastEntryRequest](#atomix.primitive.log.v1.LastEntryRequest) | [LastEntryResponse](#atomix.primitive.log.v1.LastEntryResponse) | LastEntry gets the last entry in the log |
| PrevEntry | [PrevEntryRequest](#atomix.primitive.log.v1.PrevEntryRequest) | [PrevEntryResponse](#atomix.primitive.log.v1.PrevEntryResponse) | PrevEntry gets the previous entry in the log |
| NextEntry | [NextEntryRequest](#atomix.primitive.log.v1.NextEntryRequest) | [NextEntryResponse](#atomix.primitive.log.v1.NextEntryResponse) | NextEntry gets the next entry in the log |
| Remove | [RemoveRequest](#atomix.primitive.log.v1.RemoveRequest) | [RemoveResponse](#atomix.primitive.log.v1.RemoveResponse) | Remove removes an entry from the log |
| Clear | [ClearRequest](#atomix.primitive.log.v1.ClearRequest) | [ClearResponse](#atomix.primitive.log.v1.ClearResponse) | Clear removes all entries from the log |
| Events | [EventsRequest](#atomix.primitive.log.v1.EventsRequest) | [EventsResponse](#atomix.primitive.log.v1.EventsResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.primitive.log.v1.EntriesRequest) | [EntriesResponse](#atomix.primitive.log.v1.EntriesResponse) stream | Entries lists all entries in the log |

 



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

