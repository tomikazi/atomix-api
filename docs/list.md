# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/list/list.proto](#atomix/storage/list/list.proto)
    - [AppendRequest](#atomix.storage.list.AppendRequest)
    - [AppendResponse](#atomix.storage.list.AppendResponse)
    - [ClearRequest](#atomix.storage.list.ClearRequest)
    - [ClearResponse](#atomix.storage.list.ClearResponse)
    - [CloseRequest](#atomix.storage.list.CloseRequest)
    - [CloseResponse](#atomix.storage.list.CloseResponse)
    - [ContainsRequest](#atomix.storage.list.ContainsRequest)
    - [ContainsResponse](#atomix.storage.list.ContainsResponse)
    - [CreateRequest](#atomix.storage.list.CreateRequest)
    - [CreateResponse](#atomix.storage.list.CreateResponse)
    - [EventRequest](#atomix.storage.list.EventRequest)
    - [EventResponse](#atomix.storage.list.EventResponse)
    - [GetRequest](#atomix.storage.list.GetRequest)
    - [GetResponse](#atomix.storage.list.GetResponse)
    - [InsertRequest](#atomix.storage.list.InsertRequest)
    - [InsertResponse](#atomix.storage.list.InsertResponse)
    - [IterateRequest](#atomix.storage.list.IterateRequest)
    - [IterateResponse](#atomix.storage.list.IterateResponse)
    - [RemoveRequest](#atomix.storage.list.RemoveRequest)
    - [RemoveResponse](#atomix.storage.list.RemoveResponse)
    - [SetRequest](#atomix.storage.list.SetRequest)
    - [SetResponse](#atomix.storage.list.SetResponse)
    - [SizeRequest](#atomix.storage.list.SizeRequest)
    - [SizeResponse](#atomix.storage.list.SizeResponse)
  
    - [EventResponse.Type](#atomix.storage.list.EventResponse.Type)
    - [ResponseStatus](#atomix.storage.list.ResponseStatus)
  
  
    - [ListService](#atomix.storage.list.ListService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/list/list.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/list/list.proto



<a name="atomix.storage.list.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.list.ResponseStatus) |  |  |






<a name="atomix.storage.list.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.list.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.list.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.list.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.list.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| contains | [bool](#bool) |  |  |






<a name="atomix.storage.list.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.list.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.list.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.storage.list.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.storage.list.EventResponse.Type) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |






<a name="atomix.storage.list.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.list.ResponseStatus) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.InsertRequest"></a>

### InsertRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.InsertResponse"></a>

### InsertResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.list.ResponseStatus) |  |  |






<a name="atomix.storage.list.IterateRequest"></a>

### IterateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.list.IterateResponse"></a>

### IterateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |






<a name="atomix.storage.list.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.list.ResponseStatus) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.list.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.list.ResponseStatus) |  |  |






<a name="atomix.storage.list.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.list.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| size | [uint32](#uint32) |  |  |





 


<a name="atomix.storage.list.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADDED | 1 |  |
| REMOVED | 2 |  |



<a name="atomix.storage.list.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| OUT_OF_BOUNDS | 3 |  |


 

 


<a name="atomix.storage.list.ListService"></a>

### ListService
ListService implements a distributed list

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.list.CreateRequest) | [CreateResponse](#atomix.storage.list.CreateResponse) | Create creates a list session |
| Close | [CloseRequest](#atomix.storage.list.CloseRequest) | [CloseResponse](#atomix.storage.list.CloseResponse) | Close closes a list |
| Size | [SizeRequest](#atomix.storage.list.SizeRequest) | [SizeResponse](#atomix.storage.list.SizeResponse) | Size gets the number of elements in the list |
| Contains | [ContainsRequest](#atomix.storage.list.ContainsRequest) | [ContainsResponse](#atomix.storage.list.ContainsResponse) | Contains returns whether the list contains a value |
| Append | [AppendRequest](#atomix.storage.list.AppendRequest) | [AppendResponse](#atomix.storage.list.AppendResponse) | Append appends a value to the list |
| Insert | [InsertRequest](#atomix.storage.list.InsertRequest) | [InsertResponse](#atomix.storage.list.InsertResponse) | Insert inserts a value at a specific index in the list |
| Get | [GetRequest](#atomix.storage.list.GetRequest) | [GetResponse](#atomix.storage.list.GetResponse) | Get gets the value at an index in the list |
| Set | [SetRequest](#atomix.storage.list.SetRequest) | [SetResponse](#atomix.storage.list.SetResponse) | Set sets the value at an index in the list |
| Remove | [RemoveRequest](#atomix.storage.list.RemoveRequest) | [RemoveResponse](#atomix.storage.list.RemoveResponse) | Remove removes an element from the list |
| Clear | [ClearRequest](#atomix.storage.list.ClearRequest) | [ClearResponse](#atomix.storage.list.ClearResponse) | Clear removes all elements from the list |
| Events | [EventRequest](#atomix.storage.list.EventRequest) | [EventResponse](#atomix.storage.list.EventResponse) stream | Events listens for change events |
| Iterate | [IterateRequest](#atomix.storage.list.IterateRequest) | [IterateResponse](#atomix.storage.list.IterateResponse) stream | Iterate streams all values in the list |

 



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

