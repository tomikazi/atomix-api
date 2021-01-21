# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/lock/lock.proto](#atomix/primitive/lock/lock.proto)
    - [GetLockRequest](#atomix.primitive.lock.GetLockRequest)
    - [GetLockResponse](#atomix.primitive.lock.GetLockResponse)
    - [Lock](#atomix.primitive.lock.Lock)
    - [LockRequest](#atomix.primitive.lock.LockRequest)
    - [LockResponse](#atomix.primitive.lock.LockResponse)
    - [UnlockRequest](#atomix.primitive.lock.UnlockRequest)
    - [UnlockResponse](#atomix.primitive.lock.UnlockResponse)
  
    - [Lock.State](#atomix.primitive.lock.Lock.State)
  
  
    - [LockService](#atomix.primitive.lock.LockService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/lock/lock.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/lock/lock.proto



<a name="atomix.primitive.lock.GetLockRequest"></a>

### GetLockRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lock | [Lock](#atomix.primitive.lock.Lock) |  |  |






<a name="atomix.primitive.lock.GetLockResponse"></a>

### GetLockResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lock | [Lock](#atomix.primitive.lock.Lock) |  |  |






<a name="atomix.primitive.lock.Lock"></a>

### Lock



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| state | [Lock.State](#atomix.primitive.lock.Lock.State) |  |  |
| holder | [string](#string) |  |  |
| queue | [string](#string) | repeated |  |






<a name="atomix.primitive.lock.LockRequest"></a>

### LockRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| timeout | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.primitive.lock.LockResponse"></a>

### LockResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lock | [Lock](#atomix.primitive.lock.Lock) |  |  |






<a name="atomix.primitive.lock.UnlockRequest"></a>

### UnlockRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lock | [Lock](#atomix.primitive.lock.Lock) |  |  |






<a name="atomix.primitive.lock.UnlockResponse"></a>

### UnlockResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| lock | [Lock](#atomix.primitive.lock.Lock) |  |  |





 


<a name="atomix.primitive.lock.Lock.State"></a>

### Lock.State


| Name | Number | Description |
| ---- | ------ | ----------- |
| UNLOCKED | 0 |  |
| LOCKED | 1 |  |


 

 


<a name="atomix.primitive.lock.LockService"></a>

### LockService
LockService implements a distributed lock

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Lock | [LockRequest](#atomix.primitive.lock.LockRequest) | [LockResponse](#atomix.primitive.lock.LockResponse) | Lock attempts to acquire the lock |
| Unlock | [UnlockRequest](#atomix.primitive.lock.UnlockRequest) | [UnlockResponse](#atomix.primitive.lock.UnlockResponse) | Unlock releases the lock |
| GetLock | [GetLockRequest](#atomix.primitive.lock.GetLockRequest) | [GetLockResponse](#atomix.primitive.lock.GetLockResponse) | GetLock gets the lock state |

 



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

