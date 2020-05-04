# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/leader/latch.proto](#atomix/database/leader/latch.proto)
    - [CloseRequest](#atomix.database.leader.CloseRequest)
    - [CloseResponse](#atomix.database.leader.CloseResponse)
    - [CreateRequest](#atomix.database.leader.CreateRequest)
    - [CreateResponse](#atomix.database.leader.CreateResponse)
    - [EventRequest](#atomix.database.leader.EventRequest)
    - [EventResponse](#atomix.database.leader.EventResponse)
    - [GetRequest](#atomix.database.leader.GetRequest)
    - [GetResponse](#atomix.database.leader.GetResponse)
    - [Latch](#atomix.database.leader.Latch)
    - [LatchRequest](#atomix.database.leader.LatchRequest)
    - [LatchResponse](#atomix.database.leader.LatchResponse)
  
    - [EventResponse.Type](#atomix.database.leader.EventResponse.Type)
  
  
    - [LeaderLatchService](#atomix.database.leader.LeaderLatchService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/leader/latch.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/leader/latch.proto



<a name="atomix.database.leader.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.leader.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.leader.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.leader.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.leader.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.leader.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.leader.EventResponse.Type) |  |  |
| latch | [Latch](#atomix.database.leader.Latch) |  |  |






<a name="atomix.database.leader.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.leader.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| latch | [Latch](#atomix.database.leader.Latch) |  |  |






<a name="atomix.database.leader.Latch"></a>

### Latch



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [uint64](#uint64) |  |  |
| leader | [string](#string) |  |  |
| participants | [string](#string) | repeated |  |






<a name="atomix.database.leader.LatchRequest"></a>

### LatchRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| participant_id | [string](#string) |  |  |






<a name="atomix.database.leader.LatchResponse"></a>

### LatchResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| latch | [Latch](#atomix.database.leader.Latch) |  |  |





 


<a name="atomix.database.leader.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| CHANGED | 0 |  |


 

 


<a name="atomix.database.leader.LeaderLatchService"></a>

### LeaderLatchService
Leader latch service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.leader.CreateRequest) | [CreateResponse](#atomix.database.leader.CreateResponse) | Create creates a leader latch |
| Close | [CloseRequest](#atomix.database.leader.CloseRequest) | [CloseResponse](#atomix.database.leader.CloseResponse) | Close closes a leader latch |
| Latch | [LatchRequest](#atomix.database.leader.LatchRequest) | [LatchResponse](#atomix.database.leader.LatchResponse) | Latch attempts to acquire the leader latch |
| Get | [GetRequest](#atomix.database.leader.GetRequest) | [GetResponse](#atomix.database.leader.GetResponse) | Get gets the current leader |
| Events | [EventRequest](#atomix.database.leader.EventRequest) | [EventResponse](#atomix.database.leader.EventResponse) stream | Events listens for leader change events |

 



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

