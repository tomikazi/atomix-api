# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/counter/counter.proto](#atomix/primitive/counter/counter.proto)
    - [CheckAndSetInput](#atomix.primitive.counter.CheckAndSetInput)
    - [CheckAndSetOutput](#atomix.primitive.counter.CheckAndSetOutput)
    - [CheckAndSetRequest](#atomix.primitive.counter.CheckAndSetRequest)
    - [CheckAndSetResponse](#atomix.primitive.counter.CheckAndSetResponse)
    - [DecrementInput](#atomix.primitive.counter.DecrementInput)
    - [DecrementOutput](#atomix.primitive.counter.DecrementOutput)
    - [DecrementRequest](#atomix.primitive.counter.DecrementRequest)
    - [DecrementResponse](#atomix.primitive.counter.DecrementResponse)
    - [GetInput](#atomix.primitive.counter.GetInput)
    - [GetOutput](#atomix.primitive.counter.GetOutput)
    - [GetRequest](#atomix.primitive.counter.GetRequest)
    - [GetResponse](#atomix.primitive.counter.GetResponse)
    - [IncrementInput](#atomix.primitive.counter.IncrementInput)
    - [IncrementOutput](#atomix.primitive.counter.IncrementOutput)
    - [IncrementRequest](#atomix.primitive.counter.IncrementRequest)
    - [IncrementResponse](#atomix.primitive.counter.IncrementResponse)
    - [RestoreRequest](#atomix.primitive.counter.RestoreRequest)
    - [RestoreResponse](#atomix.primitive.counter.RestoreResponse)
    - [SetInput](#atomix.primitive.counter.SetInput)
    - [SetOutput](#atomix.primitive.counter.SetOutput)
    - [SetRequest](#atomix.primitive.counter.SetRequest)
    - [SetResponse](#atomix.primitive.counter.SetResponse)
    - [Snapshot](#atomix.primitive.counter.Snapshot)
    - [SnapshotRequest](#atomix.primitive.counter.SnapshotRequest)
    - [SnapshotResponse](#atomix.primitive.counter.SnapshotResponse)
  
  
  
    - [CounterService](#atomix.primitive.counter.CounterService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/counter/counter.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/counter/counter.proto



<a name="atomix.primitive.counter.CheckAndSetInput"></a>

### CheckAndSetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| expect | [int64](#int64) |  |  |
| update | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.CheckAndSetOutput"></a>

### CheckAndSetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| succeeded | [bool](#bool) |  |  |






<a name="atomix.primitive.counter.CheckAndSetRequest"></a>

### CheckAndSetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [CheckAndSetInput](#atomix.primitive.counter.CheckAndSetInput) |  |  |






<a name="atomix.primitive.counter.CheckAndSetResponse"></a>

### CheckAndSetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [CheckAndSetOutput](#atomix.primitive.counter.CheckAndSetOutput) |  |  |






<a name="atomix.primitive.counter.DecrementInput"></a>

### DecrementInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| delta | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.DecrementOutput"></a>

### DecrementOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| previous_value | [int64](#int64) |  |  |
| next_value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.DecrementRequest"></a>

### DecrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [DecrementInput](#atomix.primitive.counter.DecrementInput) |  |  |






<a name="atomix.primitive.counter.DecrementResponse"></a>

### DecrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [DecrementOutput](#atomix.primitive.counter.DecrementOutput) |  |  |






<a name="atomix.primitive.counter.GetInput"></a>

### GetInput







<a name="atomix.primitive.counter.GetOutput"></a>

### GetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetInput](#atomix.primitive.counter.GetInput) |  |  |






<a name="atomix.primitive.counter.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetOutput](#atomix.primitive.counter.GetOutput) |  |  |






<a name="atomix.primitive.counter.IncrementInput"></a>

### IncrementInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| delta | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.IncrementOutput"></a>

### IncrementOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| previous_value | [int64](#int64) |  |  |
| next_value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.IncrementRequest"></a>

### IncrementRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [IncrementInput](#atomix.primitive.counter.IncrementInput) |  |  |






<a name="atomix.primitive.counter.IncrementResponse"></a>

### IncrementResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [IncrementOutput](#atomix.primitive.counter.IncrementOutput) |  |  |






<a name="atomix.primitive.counter.RestoreRequest"></a>

### RestoreRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| snapshot | [Snapshot](#atomix.primitive.counter.Snapshot) |  |  |






<a name="atomix.primitive.counter.RestoreResponse"></a>

### RestoreResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.counter.SetInput"></a>

### SetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.SetOutput"></a>

### SetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| previous_value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [SetInput](#atomix.primitive.counter.SetInput) |  |  |






<a name="atomix.primitive.counter.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SetOutput](#atomix.primitive.counter.SetOutput) |  |  |






<a name="atomix.primitive.counter.Snapshot"></a>

### Snapshot



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [int64](#int64) |  |  |






<a name="atomix.primitive.counter.SnapshotRequest"></a>

### SnapshotRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.counter.SnapshotResponse"></a>

### SnapshotResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| snapshot | [Snapshot](#atomix.primitive.counter.Snapshot) |  |  |





 

 

 


<a name="atomix.primitive.counter.CounterService"></a>

### CounterService
CounterService implements a distributed counter

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Set | [SetRequest](#atomix.primitive.counter.SetRequest) | [SetResponse](#atomix.primitive.counter.SetResponse) | Set sets the counter value |
| Get | [GetRequest](#atomix.primitive.counter.GetRequest) | [GetResponse](#atomix.primitive.counter.GetResponse) | Get gets the current counter value |
| Increment | [IncrementRequest](#atomix.primitive.counter.IncrementRequest) | [IncrementResponse](#atomix.primitive.counter.IncrementResponse) | Increment increments the counter value |
| Decrement | [DecrementRequest](#atomix.primitive.counter.DecrementRequest) | [DecrementResponse](#atomix.primitive.counter.DecrementResponse) | Decrement decrements the counter value |
| CheckAndSet | [CheckAndSetRequest](#atomix.primitive.counter.CheckAndSetRequest) | [CheckAndSetResponse](#atomix.primitive.counter.CheckAndSetResponse) | CheckAndSet performs a check-and-set operation on the counter value |
| Snapshot | [SnapshotRequest](#atomix.primitive.counter.SnapshotRequest) | [SnapshotResponse](#atomix.primitive.counter.SnapshotResponse) | Snapshot exports a snapshot of the primitive state |
| Restore | [RestoreRequest](#atomix.primitive.counter.RestoreRequest) | [RestoreResponse](#atomix.primitive.counter.RestoreResponse) | Restore imports a snapshot of the primitive state |

 



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

