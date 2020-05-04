# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/partition/partition.proto](#atomix/partition/partition.proto)
    - [JoinPartitionGroupRequest](#atomix.partition.JoinPartitionGroupRequest)
    - [JoinPartitionGroupResponse](#atomix.partition.JoinPartitionGroupResponse)
    - [Member](#atomix.partition.Member)
    - [MemberId](#atomix.partition.MemberId)
    - [Partition](#atomix.partition.Partition)
    - [PartitionGroup](#atomix.partition.PartitionGroup)
    - [PartitionGroupId](#atomix.partition.PartitionGroupId)
    - [PartitionId](#atomix.partition.PartitionId)
  
  
  
    - [PartitionService](#atomix.partition.PartitionService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/partition/partition.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/partition/partition.proto



<a name="atomix.partition.JoinPartitionGroupRequest"></a>

### JoinPartitionGroupRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replica_id | [MemberId](#atomix.partition.MemberId) |  |  |
| group_id | [PartitionGroupId](#atomix.partition.PartitionGroupId) |  |  |
| partitions | [uint32](#uint32) |  |  |
| replication_factor | [uint32](#uint32) |  |  |






<a name="atomix.partition.JoinPartitionGroupResponse"></a>

### JoinPartitionGroupResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [PartitionGroup](#atomix.partition.PartitionGroup) |  |  |






<a name="atomix.partition.Member"></a>

### Member
Member is a partition member


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [MemberId](#atomix.partition.MemberId) |  |  |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.partition.MemberId"></a>

### MemberId
Member identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |






<a name="atomix.partition.Partition"></a>

### Partition
Partition


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [PartitionId](#atomix.partition.PartitionId) |  |  |
| term | [uint64](#uint64) |  |  |
| leader | [MemberId](#atomix.partition.MemberId) |  |  |
| members | [Member](#atomix.partition.Member) | repeated |  |






<a name="atomix.partition.PartitionGroup"></a>

### PartitionGroup
Partition group state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [PartitionGroupId](#atomix.partition.PartitionGroupId) |  |  |
| partitions | [Partition](#atomix.partition.Partition) | repeated |  |






<a name="atomix.partition.PartitionGroupId"></a>

### PartitionGroupId
Partition identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |






<a name="atomix.partition.PartitionId"></a>

### PartitionId
Partition identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |
| index | [uint32](#uint32) |  |  |





 

 

 


<a name="atomix.partition.PartitionService"></a>

### PartitionService
Atomix partition service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| JoinPartitionGroup | [JoinPartitionGroupRequest](#atomix.partition.JoinPartitionGroupRequest) | [JoinPartitionGroupResponse](#atomix.partition.JoinPartitionGroupResponse) stream | Joins a member to a partition group |

 



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

