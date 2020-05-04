# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/list/list.proto](#atomix/database/list/list.proto)
    - [AppendRequest](#atomix.database.list.AppendRequest)
    - [AppendResponse](#atomix.database.list.AppendResponse)
    - [ClearRequest](#atomix.database.list.ClearRequest)
    - [ClearResponse](#atomix.database.list.ClearResponse)
    - [CloseRequest](#atomix.database.list.CloseRequest)
    - [CloseResponse](#atomix.database.list.CloseResponse)
    - [ContainsRequest](#atomix.database.list.ContainsRequest)
    - [ContainsResponse](#atomix.database.list.ContainsResponse)
    - [CreateRequest](#atomix.database.list.CreateRequest)
    - [CreateResponse](#atomix.database.list.CreateResponse)
    - [EventRequest](#atomix.database.list.EventRequest)
    - [EventResponse](#atomix.database.list.EventResponse)
    - [GetRequest](#atomix.database.list.GetRequest)
    - [GetResponse](#atomix.database.list.GetResponse)
    - [InsertRequest](#atomix.database.list.InsertRequest)
    - [InsertResponse](#atomix.database.list.InsertResponse)
    - [IterateRequest](#atomix.database.list.IterateRequest)
    - [IterateResponse](#atomix.database.list.IterateResponse)
    - [RemoveRequest](#atomix.database.list.RemoveRequest)
    - [RemoveResponse](#atomix.database.list.RemoveResponse)
    - [SetRequest](#atomix.database.list.SetRequest)
    - [SetResponse](#atomix.database.list.SetResponse)
    - [SizeRequest](#atomix.database.list.SizeRequest)
    - [SizeResponse](#atomix.database.list.SizeResponse)
  
    - [EventResponse.Type](#atomix.database.list.EventResponse.Type)
    - [ResponseStatus](#atomix.database.list.ResponseStatus)
  
  
    - [ListService](#atomix.database.list.ListService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/list/list.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/list/list.proto



<a name="atomix.database.list.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.list.ResponseStatus) |  |  |






<a name="atomix.database.list.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.list.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.list.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.list.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.list.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| contains | [bool](#bool) |  |  |






<a name="atomix.database.list.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.list.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.list.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.database.list.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.list.EventResponse.Type) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |






<a name="atomix.database.list.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.list.ResponseStatus) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.InsertRequest"></a>

### InsertRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.InsertResponse"></a>

### InsertResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.list.ResponseStatus) |  |  |






<a name="atomix.database.list.IterateRequest"></a>

### IterateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.list.IterateResponse"></a>

### IterateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |






<a name="atomix.database.list.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.list.ResponseStatus) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.list.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.list.ResponseStatus) |  |  |






<a name="atomix.database.list.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.list.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.database.list.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADDED | 1 |  |
| REMOVED | 2 |  |



<a name="atomix.database.list.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| OUT_OF_BOUNDS | 3 |  |


 

 


<a name="atomix.database.list.ListService"></a>

### ListService
ListService implements a distributed list

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.list.CreateRequest) | [CreateResponse](#atomix.database.list.CreateResponse) | Create creates a list session |
| Close | [CloseRequest](#atomix.database.list.CloseRequest) | [CloseResponse](#atomix.database.list.CloseResponse) | Close closes a list |
| Size | [SizeRequest](#atomix.database.list.SizeRequest) | [SizeResponse](#atomix.database.list.SizeResponse) | Size gets the number of elements in the list |
| Contains | [ContainsRequest](#atomix.database.list.ContainsRequest) | [ContainsResponse](#atomix.database.list.ContainsResponse) | Contains returns whether the list contains a value |
| Append | [AppendRequest](#atomix.database.list.AppendRequest) | [AppendResponse](#atomix.database.list.AppendResponse) | Append appends a value to the list |
| Insert | [InsertRequest](#atomix.database.list.InsertRequest) | [InsertResponse](#atomix.database.list.InsertResponse) | Insert inserts a value at a specific index in the list |
| Get | [GetRequest](#atomix.database.list.GetRequest) | [GetResponse](#atomix.database.list.GetResponse) | Get gets the value at an index in the list |
| Set | [SetRequest](#atomix.database.list.SetRequest) | [SetResponse](#atomix.database.list.SetResponse) | Set sets the value at an index in the list |
| Remove | [RemoveRequest](#atomix.database.list.RemoveRequest) | [RemoveResponse](#atomix.database.list.RemoveResponse) | Remove removes an element from the list |
| Clear | [ClearRequest](#atomix.database.list.ClearRequest) | [ClearResponse](#atomix.database.list.ClearResponse) | Clear removes all elements from the list |
| Events | [EventRequest](#atomix.database.list.EventRequest) | [EventResponse](#atomix.database.list.EventResponse) stream | Events listens for change events |
| Iterate | [IterateRequest](#atomix.database.list.IterateRequest) | [IterateResponse](#atomix.database.list.IterateResponse) stream | Iterate streams all values in the list |

 



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

