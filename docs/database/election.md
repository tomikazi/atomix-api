# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/election/election.proto](#atomix/database/election/election.proto)
    - [AnointRequest](#atomix.database.election.AnointRequest)
    - [AnointResponse](#atomix.database.election.AnointResponse)
    - [CloseRequest](#atomix.database.election.CloseRequest)
    - [CloseResponse](#atomix.database.election.CloseResponse)
    - [CreateRequest](#atomix.database.election.CreateRequest)
    - [CreateResponse](#atomix.database.election.CreateResponse)
    - [EnterRequest](#atomix.database.election.EnterRequest)
    - [EnterResponse](#atomix.database.election.EnterResponse)
    - [EventRequest](#atomix.database.election.EventRequest)
    - [EventResponse](#atomix.database.election.EventResponse)
    - [EvictRequest](#atomix.database.election.EvictRequest)
    - [EvictResponse](#atomix.database.election.EvictResponse)
    - [GetTermRequest](#atomix.database.election.GetTermRequest)
    - [GetTermResponse](#atomix.database.election.GetTermResponse)
    - [PromoteRequest](#atomix.database.election.PromoteRequest)
    - [PromoteResponse](#atomix.database.election.PromoteResponse)
    - [Term](#atomix.database.election.Term)
    - [WithdrawRequest](#atomix.database.election.WithdrawRequest)
    - [WithdrawResponse](#atomix.database.election.WithdrawResponse)
  
    - [EventResponse.Type](#atomix.database.election.EventResponse.Type)
  
  
    - [LeaderElectionService](#atomix.database.election.LeaderElectionService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/election/election.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/election/election.proto



<a name="atomix.database.election.AnointRequest"></a>

### AnointRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.database.election.AnointResponse"></a>

### AnointResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |






<a name="atomix.database.election.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.election.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.election.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.election.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.election.EnterRequest"></a>

### EnterRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.database.election.EnterResponse"></a>

### EnterResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |






<a name="atomix.database.election.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.election.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.election.EventResponse.Type) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |






<a name="atomix.database.election.EvictRequest"></a>

### EvictRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.database.election.EvictResponse"></a>

### EvictResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |






<a name="atomix.database.election.GetTermRequest"></a>

### GetTermRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.election.GetTermResponse"></a>

### GetTermResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |






<a name="atomix.database.election.PromoteRequest"></a>

### PromoteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.database.election.PromoteResponse"></a>

### PromoteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |






<a name="atomix.database.election.Term"></a>

### Term



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [uint64](#uint64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| leader | [string](#string) |  |  |
| candidates | [string](#string) | repeated |  |






<a name="atomix.database.election.WithdrawRequest"></a>

### WithdrawRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.database.election.WithdrawResponse"></a>

### WithdrawResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| term | [Term](#atomix.database.election.Term) |  |  |





 


<a name="atomix.database.election.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| CHANGED | 0 |  |


 

 


<a name="atomix.database.election.LeaderElectionService"></a>

### LeaderElectionService
LeaderElectionService implements a distributed leader election

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.election.CreateRequest) | [CreateResponse](#atomix.database.election.CreateResponse) | Create creates a LeaderElection instance |
| Close | [CloseRequest](#atomix.database.election.CloseRequest) | [CloseResponse](#atomix.database.election.CloseResponse) | Close closes a LeaderElection instance |
| Enter | [EnterRequest](#atomix.database.election.EnterRequest) | [EnterResponse](#atomix.database.election.EnterResponse) | Enter enters the leader election |
| Withdraw | [WithdrawRequest](#atomix.database.election.WithdrawRequest) | [WithdrawResponse](#atomix.database.election.WithdrawResponse) | Withdraw withdraws a candidate from the leader election |
| Anoint | [AnointRequest](#atomix.database.election.AnointRequest) | [AnointResponse](#atomix.database.election.AnointResponse) | Anoint anoints a candidate leader |
| Promote | [PromoteRequest](#atomix.database.election.PromoteRequest) | [PromoteResponse](#atomix.database.election.PromoteResponse) | Promote promotes a candidate |
| Evict | [EvictRequest](#atomix.database.election.EvictRequest) | [EvictResponse](#atomix.database.election.EvictResponse) | Evict evicts a candidate from the election |
| GetTerm | [GetTermRequest](#atomix.database.election.GetTermRequest) | [GetTermResponse](#atomix.database.election.GetTermResponse) | GetTerm gets the current leadership term |
| Events | [EventRequest](#atomix.database.election.EventRequest) | [EventResponse](#atomix.database.election.EventResponse) stream | Events listens for leadership events |

 



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

