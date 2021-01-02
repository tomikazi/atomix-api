# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/storage.proto](#atomix/storage/storage.proto)
    - [StorageConfig](#atomix.storage.StorageConfig)
    - [StorageId](#atomix.storage.StorageId)
    - [StoragePartition](#atomix.storage.StoragePartition)
    - [StorageReplica](#atomix.storage.StorageReplica)
    - [UpdateRequest](#atomix.storage.UpdateRequest)
    - [UpdateResponse](#atomix.storage.UpdateResponse)
  
  
  
    - [StorageService](#atomix.storage.StorageService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/storage.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/storage.proto



<a name="atomix.storage.StorageConfig"></a>

### StorageConfig
Storage configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replicas | [StorageReplica](#atomix.storage.StorageReplica) | repeated | nodes is a list of storage replicas |
| partitions | [StoragePartition](#atomix.storage.StoragePartition) | repeated | partitions is a list of partitions owned by the replicas |






<a name="atomix.storage.StorageId"></a>

### StorageId
Storage identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is the name of the storage |
| namespace | [string](#string) |  | namespace is the namespace to which the storage belongs |






<a name="atomix.storage.StoragePartition"></a>

### StoragePartition
Partition info


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition_id | [uint32](#uint32) |  |  |
| replicas | [string](#string) | repeated |  |






<a name="atomix.storage.StorageReplica"></a>

### StorageReplica
Replica configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | id is the unique member identifier |
| node_id | [string](#string) |  | node_id is the ID of the node on which the replica is deployed |
| host | [string](#string) |  | host is the member host |
| api_port | [int32](#int32) |  | api_port is the port to use for the client API |
| protocol_port | [int32](#int32) |  | protocol_port is the port to use for intra-cluster communication |






<a name="atomix.storage.UpdateRequest"></a>

### UpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [StorageConfig](#atomix.storage.StorageConfig) |  |  |






<a name="atomix.storage.UpdateResponse"></a>

### UpdateResponse






 

 

 


<a name="atomix.storage.StorageService"></a>

### StorageService
Atomix storage service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Update | [UpdateRequest](#atomix.storage.UpdateRequest) | [UpdateResponse](#atomix.storage.UpdateResponse) | Update updates the storage configuration |

 



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

