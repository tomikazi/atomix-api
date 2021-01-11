# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/election/election.proto](#atomix/primitive/election/election.proto)
    - [AnointInput](#atomix.primitive.election.AnointInput)
    - [AnointOutput](#atomix.primitive.election.AnointOutput)
    - [AnointRequest](#atomix.primitive.election.AnointRequest)
    - [AnointResponse](#atomix.primitive.election.AnointResponse)
    - [EnterInput](#atomix.primitive.election.EnterInput)
    - [EnterOutput](#atomix.primitive.election.EnterOutput)
    - [EnterRequest](#atomix.primitive.election.EnterRequest)
    - [EnterResponse](#atomix.primitive.election.EnterResponse)
    - [EventsInput](#atomix.primitive.election.EventsInput)
    - [EventsOutput](#atomix.primitive.election.EventsOutput)
    - [EventsRequest](#atomix.primitive.election.EventsRequest)
    - [EventsResponse](#atomix.primitive.election.EventsResponse)
    - [EvictInput](#atomix.primitive.election.EvictInput)
    - [EvictOutput](#atomix.primitive.election.EvictOutput)
    - [EvictRequest](#atomix.primitive.election.EvictRequest)
    - [EvictResponse](#atomix.primitive.election.EvictResponse)
    - [GetTermInput](#atomix.primitive.election.GetTermInput)
    - [GetTermOutput](#atomix.primitive.election.GetTermOutput)
    - [GetTermRequest](#atomix.primitive.election.GetTermRequest)
    - [GetTermResponse](#atomix.primitive.election.GetTermResponse)
    - [PromoteInput](#atomix.primitive.election.PromoteInput)
    - [PromoteOutput](#atomix.primitive.election.PromoteOutput)
    - [PromoteRequest](#atomix.primitive.election.PromoteRequest)
    - [PromoteResponse](#atomix.primitive.election.PromoteResponse)
    - [RestoreRequest](#atomix.primitive.election.RestoreRequest)
    - [RestoreResponse](#atomix.primitive.election.RestoreResponse)
    - [Snapshot](#atomix.primitive.election.Snapshot)
    - [SnapshotRequest](#atomix.primitive.election.SnapshotRequest)
    - [SnapshotResponse](#atomix.primitive.election.SnapshotResponse)
    - [Term](#atomix.primitive.election.Term)
    - [WithdrawInput](#atomix.primitive.election.WithdrawInput)
    - [WithdrawOutput](#atomix.primitive.election.WithdrawOutput)
    - [WithdrawRequest](#atomix.primitive.election.WithdrawRequest)
    - [WithdrawResponse](#atomix.primitive.election.WithdrawResponse)
  
    - [EventsOutput.Type](#atomix.primitive.election.EventsOutput.Type)
  
  
    - [LeaderElectionService](#atomix.primitive.election.LeaderElectionService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/election/election.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/election/election.proto



<a name="atomix.primitive.election.AnointInput"></a>

### AnointInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.AnointOutput"></a>

### AnointOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.AnointRequest"></a>

### AnointRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [AnointInput](#atomix.primitive.election.AnointInput) |  |  |






<a name="atomix.primitive.election.AnointResponse"></a>

### AnointResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [AnointOutput](#atomix.primitive.election.AnointOutput) |  |  |






<a name="atomix.primitive.election.EnterInput"></a>

### EnterInput







<a name="atomix.primitive.election.EnterOutput"></a>

### EnterOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.EnterRequest"></a>

### EnterRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EnterInput](#atomix.primitive.election.EnterInput) |  |  |






<a name="atomix.primitive.election.EnterResponse"></a>

### EnterResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EnterOutput](#atomix.primitive.election.EnterOutput) |  |  |






<a name="atomix.primitive.election.EventsInput"></a>

### EventsInput







<a name="atomix.primitive.election.EventsOutput"></a>

### EventsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EventsOutput.Type](#atomix.primitive.election.EventsOutput.Type) |  |  |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.EventsRequest"></a>

### EventsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventsInput](#atomix.primitive.election.EventsInput) |  |  |






<a name="atomix.primitive.election.EventsResponse"></a>

### EventsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventsOutput](#atomix.primitive.election.EventsOutput) |  |  |






<a name="atomix.primitive.election.EvictInput"></a>

### EvictInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.EvictOutput"></a>

### EvictOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.EvictRequest"></a>

### EvictRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EvictInput](#atomix.primitive.election.EvictInput) |  |  |






<a name="atomix.primitive.election.EvictResponse"></a>

### EvictResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EvictOutput](#atomix.primitive.election.EvictOutput) |  |  |






<a name="atomix.primitive.election.GetTermInput"></a>

### GetTermInput







<a name="atomix.primitive.election.GetTermOutput"></a>

### GetTermOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.GetTermRequest"></a>

### GetTermRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetTermInput](#atomix.primitive.election.GetTermInput) |  |  |






<a name="atomix.primitive.election.GetTermResponse"></a>

### GetTermResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetTermOutput](#atomix.primitive.election.GetTermOutput) |  |  |






<a name="atomix.primitive.election.PromoteInput"></a>

### PromoteInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| candidate_id | [string](#string) |  |  |






<a name="atomix.primitive.election.PromoteOutput"></a>

### PromoteOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.PromoteRequest"></a>

### PromoteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [PromoteInput](#atomix.primitive.election.PromoteInput) |  |  |






<a name="atomix.primitive.election.PromoteResponse"></a>

### PromoteResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [PromoteOutput](#atomix.primitive.election.PromoteOutput) |  |  |






<a name="atomix.primitive.election.RestoreRequest"></a>

### RestoreRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| snapshot | [Snapshot](#atomix.primitive.election.Snapshot) |  |  |






<a name="atomix.primitive.election.RestoreResponse"></a>

### RestoreResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |






<a name="atomix.primitive.election.Snapshot"></a>

### Snapshot



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.SnapshotRequest"></a>

### SnapshotRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |






<a name="atomix.primitive.election.SnapshotResponse"></a>

### SnapshotResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| snapshot | [Snapshot](#atomix.primitive.election.Snapshot) |  |  |






<a name="atomix.primitive.election.Term"></a>

### Term



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [atomix.primitive.meta.Epoch](#atomix.primitive.meta.Epoch) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| leader | [string](#string) |  |  |
| candidates | [string](#string) | repeated |  |






<a name="atomix.primitive.election.WithdrawInput"></a>

### WithdrawInput







<a name="atomix.primitive.election.WithdrawOutput"></a>

### WithdrawOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [Term](#atomix.primitive.election.Term) |  |  |






<a name="atomix.primitive.election.WithdrawRequest"></a>

### WithdrawRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [WithdrawInput](#atomix.primitive.election.WithdrawInput) |  |  |






<a name="atomix.primitive.election.WithdrawResponse"></a>

### WithdrawResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [WithdrawOutput](#atomix.primitive.election.WithdrawOutput) |  |  |





 


<a name="atomix.primitive.election.EventsOutput.Type"></a>

### EventsOutput.Type


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
| Snapshot | [SnapshotRequest](#atomix.primitive.election.SnapshotRequest) | [SnapshotResponse](#atomix.primitive.election.SnapshotResponse) | Snapshot exports a snapshot of the primitive state |
| Restore | [RestoreRequest](#atomix.primitive.election.RestoreRequest) | [RestoreResponse](#atomix.primitive.election.RestoreResponse) | Restore imports a snapshot of the primitive state |

 



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

