# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/counter/counter.proto](#atomix/primitive/counter/counter.proto)
    - [DecrementRequest](#atomix.primitive.counter.DecrementRequest)
    - [DecrementResponse](#atomix.primitive.counter.DecrementResponse)
    - [GetRequest](#atomix.primitive.counter.GetRequest)
    - [GetResponse](#atomix.primitive.counter.GetResponse)
    - [IncrementRequest](#atomix.primitive.counter.IncrementRequest)
    - [IncrementResponse](#atomix.primitive.counter.IncrementResponse)
    - [Precondition](#atomix.primitive.counter.Precondition)
    - [SetRequest](#atomix.primitive.counter.SetRequest)
    - [SetResponse](#atomix.primitive.counter.SetResponse)
    - [Value](#atomix.primitive.counter.Value)
  
    - [CounterService](#atomix.primitive.counter.CounterService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/counter/counter.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/counter/counter.proto



<a name="atomix.primitive.counter.DecrementRequest"></a>

### DecrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| delta | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.DecrementResponse"></a>

### DecrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |






<a name="atomix.primitive.counter.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.IncrementRequest"></a>

### IncrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| delta | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.IncrementResponse"></a>

### IncrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.Precondition"></a>

### Precondition



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.RequestHeaders](#atomix.primitive.RequestHeaders) |  |  |
| value | [int64](#int64) |  |  |
| preconditions | [Precondition](#atomix.primitive.counter.Precondition) | repeated |  |






<a name="atomix.primitive.counter.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| headers | [atomix.primitive.ResponseHeaders](#atomix.primitive.ResponseHeaders) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [int64](#int64) |  |  |





 

 

 


<a name="atomix.primitive.counter.CounterService"></a>

### CounterService
CounterService implements a distributed counter

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Set | [SetRequest](#atomix.primitive.counter.SetRequest) | [SetResponse](#atomix.primitive.counter.SetResponse) | Set sets the counter value |
| Get | [GetRequest](#atomix.primitive.counter.GetRequest) | [GetResponse](#atomix.primitive.counter.GetResponse) | Get gets the current counter value |
| Increment | [IncrementRequest](#atomix.primitive.counter.IncrementRequest) | [IncrementResponse](#atomix.primitive.counter.IncrementResponse) | Increment increments the counter value |
| Decrement | [DecrementRequest](#atomix.primitive.counter.DecrementRequest) | [DecrementResponse](#atomix.primitive.counter.DecrementResponse) | Decrement decrements the counter value |

 



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

