# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/counter/counter.proto](#atomix/storage/counter/counter.proto)
    - [CheckAndSetRequest](#atomix.storage.counter.CheckAndSetRequest)
    - [CheckAndSetResponse](#atomix.storage.counter.CheckAndSetResponse)
    - [CloseRequest](#atomix.storage.counter.CloseRequest)
    - [CloseResponse](#atomix.storage.counter.CloseResponse)
    - [CreateRequest](#atomix.storage.counter.CreateRequest)
    - [CreateResponse](#atomix.storage.counter.CreateResponse)
    - [DecrementRequest](#atomix.storage.counter.DecrementRequest)
    - [DecrementResponse](#atomix.storage.counter.DecrementResponse)
    - [GetRequest](#atomix.storage.counter.GetRequest)
    - [GetResponse](#atomix.storage.counter.GetResponse)
    - [IncrementRequest](#atomix.storage.counter.IncrementRequest)
    - [IncrementResponse](#atomix.storage.counter.IncrementResponse)
    - [SetRequest](#atomix.storage.counter.SetRequest)
    - [SetResponse](#atomix.storage.counter.SetResponse)
  
  
  
    - [CounterService](#atomix.storage.counter.CounterService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/counter/counter.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/counter/counter.proto



<a name="atomix.storage.counter.CheckAndSetRequest"></a>

### CheckAndSetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| expect | [int64](#int64) |  |  |
| update | [int64](#int64) |  |  |






<a name="atomix.storage.counter.CheckAndSetResponse"></a>

### CheckAndSetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| succeeded | [bool](#bool) |  |  |






<a name="atomix.storage.counter.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.counter.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.counter.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.counter.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.counter.DecrementRequest"></a>

### DecrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delta | [int64](#int64) |  |  |






<a name="atomix.storage.counter.DecrementResponse"></a>

### DecrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| previous_value | [int64](#int64) |  |  |
| next_value | [int64](#int64) |  |  |






<a name="atomix.storage.counter.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.counter.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.storage.counter.IncrementRequest"></a>

### IncrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delta | [int64](#int64) |  |  |






<a name="atomix.storage.counter.IncrementResponse"></a>

### IncrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| previous_value | [int64](#int64) |  |  |
| next_value | [int64](#int64) |  |  |






<a name="atomix.storage.counter.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.storage.counter.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| previous_value | [int64](#int64) |  |  |





 

 

 


<a name="atomix.storage.counter.CounterService"></a>

### CounterService
CounterService implements a distributed counter

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.counter.CreateRequest) | [CreateResponse](#atomix.storage.counter.CreateResponse) | Create creates a counter |
| Close | [CloseRequest](#atomix.storage.counter.CloseRequest) | [CloseResponse](#atomix.storage.counter.CloseResponse) | Close closes the counter |
| Set | [SetRequest](#atomix.storage.counter.SetRequest) | [SetResponse](#atomix.storage.counter.SetResponse) | Set sets the counter value |
| Get | [GetRequest](#atomix.storage.counter.GetRequest) | [GetResponse](#atomix.storage.counter.GetResponse) | Get gets the current counter value |
| Increment | [IncrementRequest](#atomix.storage.counter.IncrementRequest) | [IncrementResponse](#atomix.storage.counter.IncrementResponse) | Increment increments the counter value |
| Decrement | [DecrementRequest](#atomix.storage.counter.DecrementRequest) | [DecrementResponse](#atomix.storage.counter.DecrementResponse) | Decrement decrements the counter value |
| CheckAndSet | [CheckAndSetRequest](#atomix.storage.counter.CheckAndSetRequest) | [CheckAndSetResponse](#atomix.storage.counter.CheckAndSetResponse) | CheckAndSet performs a check-and-set operation on the counter value |

 



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

