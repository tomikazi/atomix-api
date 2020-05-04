# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/counter/counter.proto](#atomix/database/counter/counter.proto)
    - [CheckAndSetRequest](#atomix.database.counter.CheckAndSetRequest)
    - [CheckAndSetResponse](#atomix.database.counter.CheckAndSetResponse)
    - [CloseRequest](#atomix.database.counter.CloseRequest)
    - [CloseResponse](#atomix.database.counter.CloseResponse)
    - [CreateRequest](#atomix.database.counter.CreateRequest)
    - [CreateResponse](#atomix.database.counter.CreateResponse)
    - [DecrementRequest](#atomix.database.counter.DecrementRequest)
    - [DecrementResponse](#atomix.database.counter.DecrementResponse)
    - [GetRequest](#atomix.database.counter.GetRequest)
    - [GetResponse](#atomix.database.counter.GetResponse)
    - [IncrementRequest](#atomix.database.counter.IncrementRequest)
    - [IncrementResponse](#atomix.database.counter.IncrementResponse)
    - [SetRequest](#atomix.database.counter.SetRequest)
    - [SetResponse](#atomix.database.counter.SetResponse)
  
  
  
    - [CounterService](#atomix.database.counter.CounterService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/counter/counter.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/counter/counter.proto



<a name="atomix.database.counter.CheckAndSetRequest"></a>

### CheckAndSetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| expect | [int64](#int64) |  |  |
| update | [int64](#int64) |  |  |






<a name="atomix.database.counter.CheckAndSetResponse"></a>

### CheckAndSetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| succeeded | [bool](#bool) |  |  |






<a name="atomix.database.counter.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.counter.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.counter.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.counter.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.counter.DecrementRequest"></a>

### DecrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delta | [int64](#int64) |  |  |






<a name="atomix.database.counter.DecrementResponse"></a>

### DecrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| previous_value | [int64](#int64) |  |  |
| next_value | [int64](#int64) |  |  |






<a name="atomix.database.counter.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.counter.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.database.counter.IncrementRequest"></a>

### IncrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delta | [int64](#int64) |  |  |






<a name="atomix.database.counter.IncrementResponse"></a>

### IncrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| previous_value | [int64](#int64) |  |  |
| next_value | [int64](#int64) |  |  |






<a name="atomix.database.counter.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| value | [int64](#int64) |  |  |






<a name="atomix.database.counter.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| previous_value | [int64](#int64) |  |  |





 

 

 


<a name="atomix.database.counter.CounterService"></a>

### CounterService
CounterService implements a distributed counter

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.counter.CreateRequest) | [CreateResponse](#atomix.database.counter.CreateResponse) | Create creates a counter |
| Close | [CloseRequest](#atomix.database.counter.CloseRequest) | [CloseResponse](#atomix.database.counter.CloseResponse) | Close closes the counter |
| Set | [SetRequest](#atomix.database.counter.SetRequest) | [SetResponse](#atomix.database.counter.SetResponse) | Set sets the counter value |
| Get | [GetRequest](#atomix.database.counter.GetRequest) | [GetResponse](#atomix.database.counter.GetResponse) | Get gets the current counter value |
| Increment | [IncrementRequest](#atomix.database.counter.IncrementRequest) | [IncrementResponse](#atomix.database.counter.IncrementResponse) | Increment increments the counter value |
| Decrement | [DecrementRequest](#atomix.database.counter.DecrementRequest) | [DecrementResponse](#atomix.database.counter.DecrementResponse) | Decrement decrements the counter value |
| CheckAndSet | [CheckAndSetRequest](#atomix.database.counter.CheckAndSetRequest) | [CheckAndSetResponse](#atomix.database.counter.CheckAndSetResponse) | CheckAndSet performs a check-and-set operation on the counter value |

 



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

