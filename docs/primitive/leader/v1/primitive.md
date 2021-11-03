# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/leader/v1/primitive.proto](#atomix/primitive/leader/v1/primitive.proto)
    - [Event](#atomix.primitive.leader.v1.Event)
    - [EventsRequest](#atomix.primitive.leader.v1.EventsRequest)
    - [EventsResponse](#atomix.primitive.leader.v1.EventsResponse)
    - [GetRequest](#atomix.primitive.leader.v1.GetRequest)
    - [GetResponse](#atomix.primitive.leader.v1.GetResponse)
    - [Latch](#atomix.primitive.leader.v1.Latch)
    - [LatchRequest](#atomix.primitive.leader.v1.LatchRequest)
    - [LatchResponse](#atomix.primitive.leader.v1.LatchResponse)
  
    - [Event.Type](#atomix.primitive.leader.v1.Event.Type)
  
    - [LeaderLatch](#atomix.primitive.leader.v1.LeaderLatch)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/leader/v1/primitive.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/leader/v1/primitive.proto



<a name="atomix.primitive.leader.v1.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.leader.v1.Event.Type) |  |  |
| latch | [Latch](#atomix.primitive.leader.v1.Latch) |  |  |






<a name="atomix.primitive.leader.v1.EventsRequest"></a>

### EventsRequest







<a name="atomix.primitive.leader.v1.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| event | [Event](#atomix.primitive.leader.v1.Event) |  |  |






<a name="atomix.primitive.leader.v1.GetRequest"></a>

### GetRequest







<a name="atomix.primitive.leader.v1.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latch | [Latch](#atomix.primitive.leader.v1.Latch) |  |  |






<a name="atomix.primitive.leader.v1.Latch"></a>

### Latch



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.v1.ObjectMeta](#atomix.primitive.meta.v1.ObjectMeta) |  |  |
| leader | [string](#string) |  |  |
| participants | [string](#string) | repeated |  |






<a name="atomix.primitive.leader.v1.LatchRequest"></a>

### LatchRequest







<a name="atomix.primitive.leader.v1.LatchResponse"></a>

### LatchResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| latch | [Latch](#atomix.primitive.leader.v1.Latch) |  |  |





 


<a name="atomix.primitive.leader.v1.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| CHANGE | 1 |  |


 

 


<a name="atomix.primitive.leader.v1.LeaderLatch"></a>

### LeaderLatch
LeaderLatch is a service for a leader latch primitive

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Latch | [LatchRequest](#atomix.primitive.leader.v1.LatchRequest) | [LatchResponse](#atomix.primitive.leader.v1.LatchResponse) | Latch attempts to acquire the leader latch |
| Get | [GetRequest](#atomix.primitive.leader.v1.GetRequest) | [GetResponse](#atomix.primitive.leader.v1.GetResponse) | Get gets the current leader |
| Events | [EventsRequest](#atomix.primitive.leader.v1.EventsRequest) | [EventsResponse](#atomix.primitive.leader.v1.EventsResponse) stream | Events listens for leader change events |

 



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

