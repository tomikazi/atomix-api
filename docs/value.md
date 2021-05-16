# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/value/value.proto](#atomix/primitive/value/value.proto)
    - [Event](#atomix.primitive.value.Event)
    - [EventsRequest](#atomix.primitive.value.EventsRequest)
    - [EventsResponse](#atomix.primitive.value.EventsResponse)
    - [GetRequest](#atomix.primitive.value.GetRequest)
    - [GetResponse](#atomix.primitive.value.GetResponse)
    - [Precondition](#atomix.primitive.value.Precondition)
    - [SetRequest](#atomix.primitive.value.SetRequest)
    - [SetResponse](#atomix.primitive.value.SetResponse)
    - [Value](#atomix.primitive.value.Value)
  
    - [Event.Type](#atomix.primitive.value.Event.Type)
  
    - [ValueService](#atomix.primitive.value.ValueService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/value/value.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/value/value.proto



<a name="atomix.primitive.value.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.value.Event.Type) |  |  |
| value | [Value](#atomix.primitive.value.Value) |  |  |






<a name="atomix.primitive.value.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.value.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| event | [Event](#atomix.primitive.value.Event) |  |  |






<a name="atomix.primitive.value.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.value.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| value | [Value](#atomix.primitive.value.Value) |  |  |






<a name="atomix.primitive.value.Precondition"></a>

### Precondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| metadata | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |






<a name="atomix.primitive.value.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| value | [Value](#atomix.primitive.value.Value) |  |  |
| preconditions | [Precondition](#atomix.primitive.value.Precondition) | repeated |  |






<a name="atomix.primitive.value.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| value | [Value](#atomix.primitive.value.Value) |  |  |






<a name="atomix.primitive.value.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| value | [bytes](#bytes) |  |  |





 


<a name="atomix.primitive.value.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| UPDATE | 1 |  |


 

 


<a name="atomix.primitive.value.ValueService"></a>

### ValueService
ValueService implements a distributed atomic value

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Set | [SetRequest](#atomix.primitive.value.SetRequest) | [SetResponse](#atomix.primitive.value.SetResponse) | Set sets the value |
| Get | [GetRequest](#atomix.primitive.value.GetRequest) | [GetResponse](#atomix.primitive.value.GetResponse) | Get gets the value |
| Events | [EventsRequest](#atomix.primitive.value.EventsRequest) | [EventsResponse](#atomix.primitive.value.EventsResponse) stream | Events listens for value change events |

 



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

