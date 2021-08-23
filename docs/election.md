# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/election/election.proto](#atomix/primitive/election/election.proto)
    - [AnointRequest](#atomix.primitive.election.AnointRequest)
    - [AnointResponse](#atomix.primitive.election.AnointResponse)
    - [EnterRequest](#atomix.primitive.election.EnterRequest)
    - [EnterResponse](#atomix.primitive.election.EnterResponse)
    - [Event](#atomix.primitive.election.Event)
    - [EventsRequest](#atomix.primitive.election.EventsRequest)
    - [EventsResponse](#atomix.primitive.election.EventsResponse)
    - [EvictRequest](#atomix.primitive.election.EvictRequest)
    - [EvictResponse](#atomix.primitive.election.EvictResponse)
    - [GetTermRequest](#atomix.primitive.election.GetTermRequest)
    - [GetTermResponse](#atomix.primitive.election.GetTermResponse)
    - [PromoteRequest](#atomix.primitive.election.PromoteRequest)
    - [PromoteResponse](#atomix.primitive.election.PromoteResponse)
    - [Term](#atomix.primitive.election.Term)
    - [WithdrawRequest](#atomix.primitive.election.WithdrawRequest)
    - [WithdrawResponse](#atomix.primitive.election.WithdrawResponse)
  
    - [Event.Type](#atomix.primitive.election.Event.Type)
  
    - [LeaderElectionService](#atomix.primitive.election.LeaderElectionService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/election/election.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/election/election.proto



<a name="atomix.primitive.election.AnointRequest"></a>

### AnointRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.AnointResponse"></a>

### AnointResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.EnterRequest"></a>

### EnterRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.EnterResponse"></a>

### EnterResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.Event"></a>

### Event



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [Event.Type](#atomix.primitive.election.Event.Type) |  |  |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.EventsRequest"></a>

### EventsRequest







<a name="atomix.primitive.election.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| event | [Event](#atomix.primitive.election.Event) |  |  |






<a name="atomix.primitive.election.EvictRequest"></a>

### EvictRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.EvictResponse"></a>

### EvictResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.GetTermRequest"></a>

### GetTermRequest







<a name="atomix.primitive.election.GetTermResponse"></a>

### GetTermResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.PromoteRequest"></a>

### PromoteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.PromoteResponse"></a>

### PromoteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.Term"></a>

### Term



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| meta | [atomix.primitive.meta.ObjectMeta](#atomix.primitive.meta.ObjectMeta) |  |  |
| leader | [string](#string) |  |  |
| candidates | [string](#string) | repeated |  |






<a name="atomix.primitive.election.WithdrawRequest"></a>

### WithdrawRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.WithdrawResponse"></a>

### WithdrawResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |





 


<a name="atomix.primitive.election.Event.Type"></a>

### Event.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| CHANGED | 1 |  |


 

 


<a name="atomix.primitive.election.LeaderElectionService"></a>

### LeaderElectionService
LeaderElectionService implements a distributed leader election

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Enter | [EnterRequest](#atomix.primitive.election.EnterRequest) | [EnterResponse](#atomix.primitive.election.EnterResponse) | Enter enters the leader election |
| Withdraw | [WithdrawRequest](#atomix.primitive.election.WithdrawRequest) | [WithdrawResponse](#atomix.primitive.election.WithdrawResponse) | Withdraw withdraws a candidate from the leader election |
| Anoint | [AnointRequest](#atomix.primitive.election.AnointRequest) | [AnointResponse](#atomix.primitive.election.AnointResponse) | Anoint anoints a candidate leader |
| Promote | [PromoteRequest](#atomix.primitive.election.PromoteRequest) | [PromoteResponse](#atomix.primitive.election.PromoteResponse) | Promote promotes a candidate |
| Evict | [EvictRequest](#atomix.primitive.election.EvictRequest) | [EvictResponse](#atomix.primitive.election.EvictResponse) | Evict evicts a candidate from the election |
| GetTerm | [GetTermRequest](#atomix.primitive.election.GetTermRequest) | [GetTermResponse](#atomix.primitive.election.GetTermResponse) | GetTerm gets the current leadership term |
| Events | [EventsRequest](#atomix.primitive.election.EventsRequest) | [EventsResponse](#atomix.primitive.election.EventsResponse) stream | Events listens for leadership events |

 



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

