# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/list/list.proto](#atomix/primitive/list/list.proto)
    - [AppendRequest](#atomix.primitive.list.AppendRequest)
    - [AppendResponse](#atomix.primitive.list.AppendResponse)
    - [ClearRequest](#atomix.primitive.list.ClearRequest)
    - [ClearResponse](#atomix.primitive.list.ClearResponse)
    - [ContainsRequest](#atomix.primitive.list.ContainsRequest)
    - [ContainsResponse](#atomix.primitive.list.ContainsResponse)
    - [ElementsRequest](#atomix.primitive.list.ElementsRequest)
    - [ElementsResponse](#atomix.primitive.list.ElementsResponse)
    - [Event](#atomix.primitive.list.Event)
    - [EventsRequest](#atomix.primitive.list.EventsRequest)
    - [EventsResponse](#atomix.primitive.list.EventsResponse)
    - [GetRequest](#atomix.primitive.list.GetRequest)
    - [GetResponse](#atomix.primitive.list.GetResponse)
    - [InsertRequest](#atomix.primitive.list.InsertRequest)
    - [InsertResponse](#atomix.primitive.list.InsertResponse)
    - [Item](#atomix.primitive.list.Item)
    - [Precondition](#atomix.primitive.list.Precondition)
    - [RemoveRequest](#atomix.primitive.list.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.list.RemoveResponse)
    - [SetRequest](#atomix.primitive.list.SetRequest)
    - [SetResponse](#atomix.primitive.list.SetResponse)
    - [SizeRequest](#atomix.primitive.list.SizeRequest)
    - [SizeResponse](#atomix.primitive.list.SizeResponse)
    - [Value](#atomix.primitive.list.Value)
  
    - [Event.Type](#atomix.primitive.list.Event.Type)
  
  
    - [ListService](#atomix.primitive.list.ListService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/list/list.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/list/list.proto



<a name="atomix.primitive.list.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| value | [Value](#atomix.primitive.list.Value) |  |  |






<a name="atomix.primitive.list.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |






<a name="atomix.primitive.list.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.list.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |






<a name="atomix.primitive.list.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| value | [Value](#atomix.primitive.list.Value) |  |  |






<a name="atomix.primitive.list.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| contains | [bool](#bool) |  |  |






<a name="atomix.primitive.list.ElementsRequest"></a>

### ElementsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.list.ElementsResponse"></a>

### ElementsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |






<a name="atomix.primitive.list.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.list.Event.Type) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |






<a name="atomix.primitive.list.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.primitive.list.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| event | [Event](#atomix.primitive.list.Event) |  |  |






<a name="atomix.primitive.list.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| index | [uint32](#uint32) |  |  |






<a name="atomix.primitive.list.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |






<a name="atomix.primitive.list.InsertRequest"></a>

### InsertRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |
| preconditions | [Precondition](#atomix.primitive.list.Precondition) | repeated |  |






<a name="atomix.primitive.list.InsertResponse"></a>

### InsertResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |






<a name="atomix.primitive.list.Item"></a>

### Item



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |
| value | [Value](#atomix.primitive.list.Value) |  |  |






<a name="atomix.primitive.list.Precondition"></a>

### Precondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| metadata | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |






<a name="atomix.primitive.list.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| index | [uint32](#uint32) |  |  |
| preconditions | [Precondition](#atomix.primitive.list.Precondition) | repeated |  |






<a name="atomix.primitive.list.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |






<a name="atomix.primitive.list.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |
| preconditions | [Precondition](#atomix.primitive.list.Precondition) | repeated |  |






<a name="atomix.primitive.list.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| item | [Item](#atomix.primitive.list.Item) |  |  |






<a name="atomix.primitive.list.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.list.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| size | [uint32](#uint32) |  |  |






<a name="atomix.primitive.list.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| value | [string](#string) |  |  |





 


<a name="atomix.primitive.list.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADD | 1 |  |
| REMOVE | 2 |  |
| REPLAY | 3 |  |


 

 


<a name="atomix.primitive.list.ListService"></a>

### ListService
ListService implements a distributed list

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.list.SizeRequest) | [SizeResponse](#atomix.primitive.list.SizeResponse) | Size gets the number of elements in the list |
| Append | [AppendRequest](#atomix.primitive.list.AppendRequest) | [AppendResponse](#atomix.primitive.list.AppendResponse) | Append appends a value to the list |
| Insert | [InsertRequest](#atomix.primitive.list.InsertRequest) | [InsertResponse](#atomix.primitive.list.InsertResponse) | Insert inserts a value at a specific index in the list |
| Get | [GetRequest](#atomix.primitive.list.GetRequest) | [GetResponse](#atomix.primitive.list.GetResponse) | Get gets the value at an index in the list |
| Set | [SetRequest](#atomix.primitive.list.SetRequest) | [SetResponse](#atomix.primitive.list.SetResponse) | Set sets the value at an index in the list |
| Remove | [RemoveRequest](#atomix.primitive.list.RemoveRequest) | [RemoveResponse](#atomix.primitive.list.RemoveResponse) | Remove removes an element from the list |
| Clear | [ClearRequest](#atomix.primitive.list.ClearRequest) | [ClearResponse](#atomix.primitive.list.ClearResponse) | Clear removes all elements from the list |
| Events | [EventsRequest](#atomix.primitive.list.EventsRequest) | [EventsResponse](#atomix.primitive.list.EventsResponse) stream | Events listens for change events |
| Elements | [ElementsRequest](#atomix.primitive.list.ElementsRequest) | [ElementsResponse](#atomix.primitive.list.ElementsResponse) stream | Elements streams all elements in the list |

 



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

