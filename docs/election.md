# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/election/election.proto](#atomix/storage/election/election.proto)
    - [AnointRequest](#atomix.storage.election.AnointRequest)
    - [AnointResponse](#atomix.storage.election.AnointResponse)
    - [CloseRequest](#atomix.storage.election.CloseRequest)
    - [CloseResponse](#atomix.storage.election.CloseResponse)
    - [CreateRequest](#atomix.storage.election.CreateRequest)
    - [CreateResponse](#atomix.storage.election.CreateResponse)
    - [EnterRequest](#atomix.storage.election.EnterRequest)
    - [EnterResponse](#atomix.storage.election.EnterResponse)
    - [EventRequest](#atomix.storage.election.EventRequest)
    - [EventResponse](#atomix.storage.election.EventResponse)
    - [EvictRequest](#atomix.storage.election.EvictRequest)
    - [EvictResponse](#atomix.storage.election.EvictResponse)
    - [GetTermRequest](#atomix.storage.election.GetTermRequest)
    - [GetTermResponse](#atomix.storage.election.GetTermResponse)
    - [PromoteRequest](#atomix.storage.election.PromoteRequest)
    - [PromoteResponse](#atomix.storage.election.PromoteResponse)
    - [Term](#atomix.storage.election.Term)
    - [WithdrawRequest](#atomix.storage.election.WithdrawRequest)
    - [WithdrawResponse](#atomix.storage.election.WithdrawResponse)
  
    - [EventResponse.Type](#atomix.storage.election.EventResponse.Type)
  
  
    - [LeaderElectionService](#atomix.storage.election.LeaderElectionService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/election/election.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/election/election.proto



<a name="atomix.storage.election.AnointRequest"></a>

### AnointRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.storage.election.AnointResponse"></a>

### AnointResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |






<a name="atomix.storage.election.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.election.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.election.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.election.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.election.EnterRequest"></a>

### EnterRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.storage.election.EnterResponse"></a>

### EnterResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |






<a name="atomix.storage.election.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.election.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.storage.election.EventResponse.Type) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |






<a name="atomix.storage.election.EvictRequest"></a>

### EvictRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.storage.election.EvictResponse"></a>

### EvictResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |






<a name="atomix.storage.election.GetTermRequest"></a>

### GetTermRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.election.GetTermResponse"></a>

### GetTermResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |






<a name="atomix.storage.election.PromoteRequest"></a>

### PromoteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.storage.election.PromoteResponse"></a>

### PromoteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |






<a name="atomix.storage.election.Term"></a>

### Term



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [uint64](#uint64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| leader | [string](#string) |  |  |
| candidates | [string](#string) | repeated |  |






<a name="atomix.storage.election.WithdrawRequest"></a>

### WithdrawRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| candidate_id | [string](#string) |  |  |






<a name="atomix.storage.election.WithdrawResponse"></a>

### WithdrawResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| term | [Term](#atomix.storage.election.Term) |  |  |





 


<a name="atomix.storage.election.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| CHANGED | 0 |  |


 

 


<a name="atomix.storage.election.LeaderElectionService"></a>

### LeaderElectionService
LeaderElectionService implements a distributed leader election

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.election.CreateRequest) | [CreateResponse](#atomix.storage.election.CreateResponse) | Create creates a LeaderElection instance |
| Close | [CloseRequest](#atomix.storage.election.CloseRequest) | [CloseResponse](#atomix.storage.election.CloseResponse) | Close closes a LeaderElection instance |
| Enter | [EnterRequest](#atomix.storage.election.EnterRequest) | [EnterResponse](#atomix.storage.election.EnterResponse) | Enter enters the leader election |
| Withdraw | [WithdrawRequest](#atomix.storage.election.WithdrawRequest) | [WithdrawResponse](#atomix.storage.election.WithdrawResponse) | Withdraw withdraws a candidate from the leader election |
| Anoint | [AnointRequest](#atomix.storage.election.AnointRequest) | [AnointResponse](#atomix.storage.election.AnointResponse) | Anoint anoints a candidate leader |
| Promote | [PromoteRequest](#atomix.storage.election.PromoteRequest) | [PromoteResponse](#atomix.storage.election.PromoteResponse) | Promote promotes a candidate |
| Evict | [EvictRequest](#atomix.storage.election.EvictRequest) | [EvictResponse](#atomix.storage.election.EvictResponse) | Evict evicts a candidate from the election |
| GetTerm | [GetTermRequest](#atomix.storage.election.GetTermRequest) | [GetTermResponse](#atomix.storage.election.GetTermResponse) | GetTerm gets the current leadership term |
| Events | [EventRequest](#atomix.storage.election.EventRequest) | [EventResponse](#atomix.storage.election.EventResponse) stream | Events listens for leadership events |

 



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

