# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/set/set.proto](#atomix/database/set/set.proto)
    - [AddRequest](#atomix.database.set.AddRequest)
    - [AddResponse](#atomix.database.set.AddResponse)
    - [ClearRequest](#atomix.database.set.ClearRequest)
    - [ClearResponse](#atomix.database.set.ClearResponse)
    - [CloseRequest](#atomix.database.set.CloseRequest)
    - [CloseResponse](#atomix.database.set.CloseResponse)
    - [ContainsRequest](#atomix.database.set.ContainsRequest)
    - [ContainsResponse](#atomix.database.set.ContainsResponse)
    - [CreateRequest](#atomix.database.set.CreateRequest)
    - [CreateResponse](#atomix.database.set.CreateResponse)
    - [EventRequest](#atomix.database.set.EventRequest)
    - [EventResponse](#atomix.database.set.EventResponse)
    - [IterateRequest](#atomix.database.set.IterateRequest)
    - [IterateResponse](#atomix.database.set.IterateResponse)
    - [RemoveRequest](#atomix.database.set.RemoveRequest)
    - [RemoveResponse](#atomix.database.set.RemoveResponse)
    - [SizeRequest](#atomix.database.set.SizeRequest)
    - [SizeResponse](#atomix.database.set.SizeResponse)
  
    - [EventResponse.Type](#atomix.database.set.EventResponse.Type)
    - [ResponseStatus](#atomix.database.set.ResponseStatus)
  
  
    - [SetService](#atomix.database.set.SetService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/set/set.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/set/set.proto



<a name="atomix.database.set.AddRequest"></a>

### AddRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.set.AddResponse"></a>

### AddResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.set.ResponseStatus) |  |  |
| added | [bool](#bool) |  |  |






<a name="atomix.database.set.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.set.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.set.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.set.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.set.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.set.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| contains | [bool](#bool) |  |  |






<a name="atomix.database.set.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.set.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.set.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.database.set.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.set.EventResponse.Type) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.set.IterateRequest"></a>

### IterateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.set.IterateResponse"></a>

### IterateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.set.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.database.set.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.set.ResponseStatus) |  |  |
| removed | [bool](#bool) |  |  |






<a name="atomix.database.set.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.set.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.database.set.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADDED | 1 |  |
| REMOVED | 2 |  |



<a name="atomix.database.set.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |


 

 


<a name="atomix.database.set.SetService"></a>

### SetService
Set service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.set.CreateRequest) | [CreateResponse](#atomix.database.set.CreateResponse) | Create creates a set session |
| Close | [CloseRequest](#atomix.database.set.CloseRequest) | [CloseResponse](#atomix.database.set.CloseResponse) | Close closes a set |
| Size | [SizeRequest](#atomix.database.set.SizeRequest) | [SizeResponse](#atomix.database.set.SizeResponse) | Size gets the number of elements in the set |
| Contains | [ContainsRequest](#atomix.database.set.ContainsRequest) | [ContainsResponse](#atomix.database.set.ContainsResponse) | Contains returns whether the set contains a value |
| Add | [AddRequest](#atomix.database.set.AddRequest) | [AddResponse](#atomix.database.set.AddResponse) | Add adds a value to the set |
| Remove | [RemoveRequest](#atomix.database.set.RemoveRequest) | [RemoveResponse](#atomix.database.set.RemoveResponse) | Remove removes a value from the set |
| Clear | [ClearRequest](#atomix.database.set.ClearRequest) | [ClearResponse](#atomix.database.set.ClearResponse) | Clear removes all values from the set |
| Events | [EventRequest](#atomix.database.set.EventRequest) | [EventResponse](#atomix.database.set.EventResponse) stream | Events listens for set change events |
| Iterate | [IterateRequest](#atomix.database.set.IterateRequest) | [IterateResponse](#atomix.database.set.IterateResponse) stream | Iterate iterates through all values in the set |

 



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

