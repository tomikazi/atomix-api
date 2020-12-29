# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/set/set.proto](#atomix/storage/set/set.proto)
    - [AddRequest](#atomix.storage.set.AddRequest)
    - [AddResponse](#atomix.storage.set.AddResponse)
    - [ClearRequest](#atomix.storage.set.ClearRequest)
    - [ClearResponse](#atomix.storage.set.ClearResponse)
    - [CloseRequest](#atomix.storage.set.CloseRequest)
    - [CloseResponse](#atomix.storage.set.CloseResponse)
    - [ContainsRequest](#atomix.storage.set.ContainsRequest)
    - [ContainsResponse](#atomix.storage.set.ContainsResponse)
    - [CreateRequest](#atomix.storage.set.CreateRequest)
    - [CreateResponse](#atomix.storage.set.CreateResponse)
    - [EventRequest](#atomix.storage.set.EventRequest)
    - [EventResponse](#atomix.storage.set.EventResponse)
    - [IterateRequest](#atomix.storage.set.IterateRequest)
    - [IterateResponse](#atomix.storage.set.IterateResponse)
    - [RemoveRequest](#atomix.storage.set.RemoveRequest)
    - [RemoveResponse](#atomix.storage.set.RemoveResponse)
    - [SizeRequest](#atomix.storage.set.SizeRequest)
    - [SizeResponse](#atomix.storage.set.SizeResponse)
  
    - [EventResponse.Type](#atomix.storage.set.EventResponse.Type)
    - [ResponseStatus](#atomix.storage.set.ResponseStatus)
  
  
    - [SetService](#atomix.storage.set.SetService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/set/set.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/set/set.proto



<a name="atomix.storage.set.AddRequest"></a>

### AddRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.set.AddResponse"></a>

### AddResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.set.ResponseStatus) |  |  |
| added | [bool](#bool) |  |  |






<a name="atomix.storage.set.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.set.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.set.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.set.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.set.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.set.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| contains | [bool](#bool) |  |  |






<a name="atomix.storage.set.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.set.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.set.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |






<a name="atomix.storage.set.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.storage.set.EventResponse.Type) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.set.IterateRequest"></a>

### IterateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.set.IterateResponse"></a>

### IterateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.set.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.storage.set.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.set.ResponseStatus) |  |  |
| removed | [bool](#bool) |  |  |






<a name="atomix.storage.set.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.set.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| size | [uint32](#uint32) |  |  |





 


<a name="atomix.storage.set.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADDED | 1 |  |
| REMOVED | 2 |  |



<a name="atomix.storage.set.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |


 

 


<a name="atomix.storage.set.SetService"></a>

### SetService
Set service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.set.CreateRequest) | [CreateResponse](#atomix.storage.set.CreateResponse) | Create creates a set session |
| Close | [CloseRequest](#atomix.storage.set.CloseRequest) | [CloseResponse](#atomix.storage.set.CloseResponse) | Close closes a set |
| Size | [SizeRequest](#atomix.storage.set.SizeRequest) | [SizeResponse](#atomix.storage.set.SizeResponse) | Size gets the number of elements in the set |
| Contains | [ContainsRequest](#atomix.storage.set.ContainsRequest) | [ContainsResponse](#atomix.storage.set.ContainsResponse) | Contains returns whether the set contains a value |
| Add | [AddRequest](#atomix.storage.set.AddRequest) | [AddResponse](#atomix.storage.set.AddResponse) | Add adds a value to the set |
| Remove | [RemoveRequest](#atomix.storage.set.RemoveRequest) | [RemoveResponse](#atomix.storage.set.RemoveResponse) | Remove removes a value from the set |
| Clear | [ClearRequest](#atomix.storage.set.ClearRequest) | [ClearResponse](#atomix.storage.set.ClearResponse) | Clear removes all values from the set |
| Events | [EventRequest](#atomix.storage.set.EventRequest) | [EventResponse](#atomix.storage.set.EventResponse) stream | Events listens for set change events |
| Iterate | [IterateRequest](#atomix.storage.set.IterateRequest) | [IterateResponse](#atomix.storage.set.IterateResponse) stream | Iterate iterates through all values in the set |

 



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

