# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/p2p_map/p2p_map.proto](#atomix/p2p_map/p2p_map.proto)
    - [CommandClose](#atomix.map.CommandClose)
    - [CommandRequest](#atomix.map.CommandRequest)
    - [CommandResponse](#atomix.map.CommandResponse)
    - [Entry](#atomix.map.Entry)
    - [GapCommitRequest](#atomix.map.GapCommitRequest)
    - [GapCommitResponse](#atomix.map.GapCommitResponse)
    - [Indexed](#atomix.map.Indexed)
    - [Message](#atomix.map.Message)
    - [Ping](#atomix.map.Ping)
    - [QueryClose](#atomix.map.QueryClose)
    - [QueryRequest](#atomix.map.QueryRequest)
    - [QueryResponse](#atomix.map.QueryResponse)
    - [Recover](#atomix.map.Recover)
    - [RecoverResponse](#atomix.map.RecoverResponse)
    - [SlotLookup](#atomix.map.SlotLookup)
    - [StartView](#atomix.map.StartView)
    - [SyncCommit](#atomix.map.SyncCommit)
    - [SyncPrepare](#atomix.map.SyncPrepare)
    - [SyncRepair](#atomix.map.SyncRepair)
    - [SyncRepairResponse](#atomix.map.SyncRepairResponse)
    - [SyncResponse](#atomix.map.SyncResponse)
    - [ViewChange](#atomix.map.ViewChange)
    - [ViewChangeRepair](#atomix.map.ViewChangeRepair)
    - [ViewChangeRepairResponse](#atomix.map.ViewChangeRepairResponse)
    - [ViewChangeRequest](#atomix.map.ViewChangeRequest)
    - [ViewId](#atomix.map.ViewId)
    - [ViewRepair](#atomix.map.ViewRepair)
    - [ViewRepairResponse](#atomix.map.ViewRepairResponse)
  
  
  
    - [P2PMapService](#atomix.map.P2PMapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/p2p_map/p2p_map.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/p2p_map/p2p_map.proto



<a name="atomix.map.CommandClose"></a>

### CommandClose



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [uint64](#uint64) |  |  |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |






<a name="atomix.map.CommandRequest"></a>

### CommandRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term_id | [uint64](#uint64) |  |  |
| message_id | [uint64](#uint64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.CommandResponse"></a>

### CommandResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [uint64](#uint64) |  |  |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| message_num | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.GapCommitRequest"></a>

### GapCommitRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.map.GapCommitResponse"></a>

### GapCommitResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.map.Indexed"></a>

### Indexed



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint64](#uint64) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.Message"></a>

### Message



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| target | [atomix.primitive.Name](#atomix.primitive.Name) |  |  |
| command | [CommandRequest](#atomix.map.CommandRequest) |  |  |
| command_response | [CommandResponse](#atomix.map.CommandResponse) |  |  |
| query | [QueryRequest](#atomix.map.QueryRequest) |  |  |
| query_response | [QueryResponse](#atomix.map.QueryResponse) |  |  |
| slot_lookup | [SlotLookup](#atomix.map.SlotLookup) |  |  |
| gap_commit | [GapCommitRequest](#atomix.map.GapCommitRequest) |  |  |
| gap_commit_response | [GapCommitResponse](#atomix.map.GapCommitResponse) |  |  |
| view_change_request | [ViewChangeRequest](#atomix.map.ViewChangeRequest) |  |  |
| view_change | [ViewChange](#atomix.map.ViewChange) |  |  |
| view_change_repair | [ViewChangeRepair](#atomix.map.ViewChangeRepair) |  |  |
| view_change_repair_response | [ViewChangeRepairResponse](#atomix.map.ViewChangeRepairResponse) |  |  |
| start_view | [StartView](#atomix.map.StartView) |  |  |
| view_repair | [ViewRepair](#atomix.map.ViewRepair) |  |  |
| view_repair_response | [ViewRepairResponse](#atomix.map.ViewRepairResponse) |  |  |
| sync_prepare | [SyncPrepare](#atomix.map.SyncPrepare) |  |  |
| sync_repair | [SyncRepair](#atomix.map.SyncRepair) |  |  |
| sync_repair_response | [SyncRepairResponse](#atomix.map.SyncRepairResponse) |  |  |
| sync_response | [SyncResponse](#atomix.map.SyncResponse) |  |  |
| sync_commit | [SyncCommit](#atomix.map.SyncCommit) |  |  |
| recover | [Recover](#atomix.map.Recover) |  |  |
| recover_response | [RecoverResponse](#atomix.map.RecoverResponse) |  |  |
| ping | [Ping](#atomix.map.Ping) |  |  |






<a name="atomix.map.Ping"></a>

### Ping



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |






<a name="atomix.map.QueryClose"></a>

### QueryClose



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [uint64](#uint64) |  |  |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |






<a name="atomix.map.QueryRequest"></a>

### QueryRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term_id | [uint64](#uint64) |  |  |
| message_id | [uint64](#uint64) |  |  |
| timestamp | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.QueryResponse"></a>

### QueryResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| message_id | [uint64](#uint64) |  |  |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.Recover"></a>

### Recover



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| recovery_id | [string](#string) |  |  |






<a name="atomix.map.RecoverResponse"></a>

### RecoverResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| recovery_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| checkpoint_index | [uint64](#uint64) |  |  |
| checkpoint | [bytes](#bytes) |  |  |
| log | [Entry](#atomix.map.Entry) | repeated |  |






<a name="atomix.map.SlotLookup"></a>

### SlotLookup



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |






<a name="atomix.map.StartView"></a>

### StartView



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| no_op_filter | [bytes](#bytes) |  |  |
| first_log_index | [uint64](#uint64) |  |  |
| last_log_index | [uint64](#uint64) |  |  |






<a name="atomix.map.SyncCommit"></a>

### SyncCommit



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| sync_point | [uint64](#uint64) |  |  |






<a name="atomix.map.SyncPrepare"></a>

### SyncPrepare



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| no_op_filter | [bytes](#bytes) |  |  |
| first_log_index | [uint64](#uint64) |  |  |
| last_log_index | [uint64](#uint64) |  |  |






<a name="atomix.map.SyncRepair"></a>

### SyncRepair



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| checkpoint | [uint64](#uint64) |  |  |
| indexs | [uint64](#uint64) | repeated |  |






<a name="atomix.map.SyncRepairResponse"></a>

### SyncRepairResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| checkpoint_index | [uint64](#uint64) |  |  |
| checkpoint | [bytes](#bytes) |  |  |
| entries | [Entry](#atomix.map.Entry) | repeated |  |






<a name="atomix.map.SyncResponse"></a>

### SyncResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| index | [uint64](#uint64) |  |  |






<a name="atomix.map.ViewChange"></a>

### ViewChange



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| last_normal | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| no_op_filter | [bytes](#bytes) |  |  |
| first_log_index | [uint64](#uint64) |  |  |
| last_log_index | [uint64](#uint64) |  |  |






<a name="atomix.map.ViewChangeRepair"></a>

### ViewChangeRepair



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| checkpoint | [uint64](#uint64) |  |  |
| indexs | [uint64](#uint64) | repeated |  |






<a name="atomix.map.ViewChangeRepairResponse"></a>

### ViewChangeRepairResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| checkpoint_index | [uint64](#uint64) |  |  |
| checkpoint | [bytes](#bytes) |  |  |
| indexs | [uint64](#uint64) | repeated |  |






<a name="atomix.map.ViewChangeRequest"></a>

### ViewChangeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |






<a name="atomix.map.ViewId"></a>

### ViewId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| leader_id | [string](#string) |  |  |
| term_id | [uint64](#uint64) |  |  |






<a name="atomix.map.ViewRepair"></a>

### ViewRepair



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| message_id | [uint64](#uint64) |  |  |
| checkpoint | [uint64](#uint64) |  |  |
| indexs | [uint64](#uint64) | repeated |  |






<a name="atomix.map.ViewRepairResponse"></a>

### ViewRepairResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| sender_id | [string](#string) |  |  |
| view_id | [ViewId](#atomix.map.ViewId) |  |  |
| checkpoint_index | [uint64](#uint64) |  |  |
| checkpoint | [bytes](#bytes) |  |  |
| entries | [Entry](#atomix.map.Entry) | repeated |  |





 

 

 


<a name="atomix.map.P2PMapService"></a>

### P2PMapService
P2PMapService implements a partitioned p2p map

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Connect | [Message](#atomix.map.Message) stream | [Message](#atomix.map.Message) stream | Connect connects to a peer |

 



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

