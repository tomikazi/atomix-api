# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/protocol/protocol.proto](#atomix/protocol/protocol.proto)
    - [ProtocolConfig](#atomix.protocol.ProtocolConfig)
    - [ProtocolPartition](#atomix.protocol.ProtocolPartition)
    - [ProtocolReplica](#atomix.protocol.ProtocolReplica)
    - [ProtocolReplica.ExtraPortsEntry](#atomix.protocol.ProtocolReplica.ExtraPortsEntry)
    - [UpdateConfigRequest](#atomix.protocol.UpdateConfigRequest)
    - [UpdateConfigResponse](#atomix.protocol.UpdateConfigResponse)
  
    - [ProtocolConfigService](#atomix.protocol.ProtocolConfigService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/protocol/protocol.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/protocol/protocol.proto



<a name="atomix.protocol.ProtocolConfig"></a>

### ProtocolConfig
Protocol configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replicas | [ProtocolReplica](#atomix.protocol.ProtocolReplica) | repeated | nodes is a list of replicas |
| partitions | [ProtocolPartition](#atomix.protocol.ProtocolPartition) | repeated | partitions is a list of partitions owned by the replicas |






<a name="atomix.protocol.ProtocolPartition"></a>

### ProtocolPartition
Partition info


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition_id | [uint32](#uint32) |  |  |
| replicas | [string](#string) | repeated |  |






<a name="atomix.protocol.ProtocolReplica"></a>

### ProtocolReplica
Replica configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | id is the unique member identifier |
| node_id | [string](#string) |  | node_id is the ID of the node on which the replica is deployed |
| host | [string](#string) |  | host is the member host |
| api_port | [int32](#int32) |  | api_port is the port to use for the client API |
| extra_ports | [ProtocolReplica.ExtraPortsEntry](#atomix.protocol.ProtocolReplica.ExtraPortsEntry) | repeated | extra_ports is a set of named ports |
| read_only | [bool](#bool) |  | read_only indicates whether the replica is a read-only replica |






<a name="atomix.protocol.ProtocolReplica.ExtraPortsEntry"></a>

### ProtocolReplica.ExtraPortsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [int32](#int32) |  |  |






<a name="atomix.protocol.UpdateConfigRequest"></a>

### UpdateConfigRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [ProtocolConfig](#atomix.protocol.ProtocolConfig) |  |  |






<a name="atomix.protocol.UpdateConfigResponse"></a>

### UpdateConfigResponse






 

 

 


<a name="atomix.protocol.ProtocolConfigService"></a>

### ProtocolConfigService
Atomix protocol configuration service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| UpdateConfig | [UpdateConfigRequest](#atomix.protocol.UpdateConfigRequest) | [UpdateConfigResponse](#atomix.protocol.UpdateConfigResponse) | UpdateConfig updates the protocol configuration |

 



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

