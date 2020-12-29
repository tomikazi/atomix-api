# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/metadata.proto](#atomix/storage/metadata.proto)
    - [CreatePrimitiveRequest](#atomix.storage.CreatePrimitiveRequest)
    - [CreatePrimitiveResponse](#atomix.storage.CreatePrimitiveResponse)
    - [DeletePrimitiveRequest](#atomix.storage.DeletePrimitiveRequest)
    - [DeletePrimitiveResponse](#atomix.storage.DeletePrimitiveResponse)
    - [GetPrimitiveRequest](#atomix.storage.GetPrimitiveRequest)
    - [GetPrimitiveResponse](#atomix.storage.GetPrimitiveResponse)
    - [GetPrimitivesRequest](#atomix.storage.GetPrimitivesRequest)
    - [GetPrimitivesResponse](#atomix.storage.GetPrimitivesResponse)
    - [PrimitiveMetadata](#atomix.storage.PrimitiveMetadata)
  
  
  
    - [PrimitiveService](#atomix.storage.PrimitiveService)
  

- [atomix/storage/primitive.proto](#atomix/storage/primitive.proto)
    - [PrimitiveId](#atomix.storage.PrimitiveId)
    - [RequestHeader](#atomix.storage.RequestHeader)
    - [RequestState](#atomix.storage.RequestState)
    - [ResponseHeader](#atomix.storage.ResponseHeader)
    - [ResponseState](#atomix.storage.ResponseState)
    - [ResponseStatus](#atomix.storage.ResponseStatus)
    - [StreamState](#atomix.storage.StreamState)
  
    - [ResponseCode](#atomix.storage.ResponseCode)
    - [ResponseType](#atomix.storage.ResponseType)
  
  
  

- [atomix/storage/storage.proto](#atomix/storage/storage.proto)
    - [AddReplicaRequest](#atomix.storage.AddReplicaRequest)
    - [AddReplicaResponse](#atomix.storage.AddReplicaResponse)
    - [PartitionEndpoint](#atomix.storage.PartitionEndpoint)
    - [PartitionId](#atomix.storage.PartitionId)
    - [RemoveReplicaRequest](#atomix.storage.RemoveReplicaRequest)
    - [RemoveReplicaResponse](#atomix.storage.RemoveReplicaResponse)
    - [StorageConfig](#atomix.storage.StorageConfig)
    - [StorageId](#atomix.storage.StorageId)
    - [StoragePartition](#atomix.storage.StoragePartition)
    - [StorageReplica](#atomix.storage.StorageReplica)
  
  
  
    - [StorageService](#atomix.storage.StorageService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/metadata.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/metadata.proto



<a name="atomix.storage.CreatePrimitiveRequest"></a>

### CreatePrimitiveRequest
CreatePrimitiveRequest is a request to create a primitive


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| storage | [StorageId](#atomix.storage.StorageId) |  |  |
| primitive | [PrimitiveId](#atomix.storage.PrimitiveId) |  |  |






<a name="atomix.storage.CreatePrimitiveResponse"></a>

### CreatePrimitiveResponse
CreatePrimitiveResponse is a response for creating a primitive


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveMetadata](#atomix.storage.PrimitiveMetadata) |  |  |






<a name="atomix.storage.DeletePrimitiveRequest"></a>

### DeletePrimitiveRequest
DeletePrimitiveRequest is a request to delete a primitive


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| storage | [StorageId](#atomix.storage.StorageId) |  |  |
| primitive | [PrimitiveId](#atomix.storage.PrimitiveId) |  |  |






<a name="atomix.storage.DeletePrimitiveResponse"></a>

### DeletePrimitiveResponse
DeletePrimitiveResponse is a response for deleting a primitive


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveMetadata](#atomix.storage.PrimitiveMetadata) |  |  |






<a name="atomix.storage.GetPrimitiveRequest"></a>

### GetPrimitiveRequest
GetPrimitiveRequest is a request for primitive metadata


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| storage | [StorageId](#atomix.storage.StorageId) |  |  |
| primitive | [PrimitiveId](#atomix.storage.PrimitiveId) |  |  |






<a name="atomix.storage.GetPrimitiveResponse"></a>

### GetPrimitiveResponse
GetPrimitiveResponse is a response containing primitive metadata


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveMetadata](#atomix.storage.PrimitiveMetadata) |  |  |






<a name="atomix.storage.GetPrimitivesRequest"></a>

### GetPrimitivesRequest
GetPrimitivesRequest is a request for primitive metadata


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| storage | [StorageId](#atomix.storage.StorageId) |  |  |
| primitive | [PrimitiveId](#atomix.storage.PrimitiveId) |  |  |






<a name="atomix.storage.GetPrimitivesResponse"></a>

### GetPrimitivesResponse
GetPrimitivesResponse is a response containing primitive metadata


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitives | [PrimitiveMetadata](#atomix.storage.PrimitiveMetadata) | repeated |  |






<a name="atomix.storage.PrimitiveMetadata"></a>

### PrimitiveMetadata
PrimitiveMetadata indicates the type and name of a primitive


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| storage | [StorageId](#atomix.storage.StorageId) |  |  |
| primitive | [PrimitiveId](#atomix.storage.PrimitiveId) |  |  |





 

 

 


<a name="atomix.storage.PrimitiveService"></a>

### PrimitiveService
PrimitiveService is a service for providing partition/primitive metadata

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreatePrimitive | [CreatePrimitiveRequest](#atomix.storage.CreatePrimitiveRequest) | [CreatePrimitiveResponse](#atomix.storage.CreatePrimitiveResponse) | CreatePrimitive creates a new primitive |
| GetPrimitive | [GetPrimitiveRequest](#atomix.storage.GetPrimitiveRequest) | [GetPrimitiveResponse](#atomix.storage.GetPrimitiveResponse) | GetPrimitive returns a primitive in the system |
| GetPrimitives | [GetPrimitivesRequest](#atomix.storage.GetPrimitivesRequest) | [GetPrimitivesResponse](#atomix.storage.GetPrimitivesResponse) | GetPrimitives returns a list of primitives in the system |
| DeletePrimitive | [DeletePrimitiveRequest](#atomix.storage.DeletePrimitiveRequest) | [DeletePrimitiveResponse](#atomix.storage.DeletePrimitiveResponse) | DeletePrimitive deletes a primitive |

 



<a name="atomix/storage/primitive.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/primitive.proto



<a name="atomix.storage.PrimitiveId"></a>

### PrimitiveId
Namespaced primitive identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [string](#string) |  |  |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |






<a name="atomix.storage.RequestHeader"></a>

### RequestHeader
Request header


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveId](#atomix.storage.PrimitiveId) |  |  |
| state | [RequestState](#atomix.storage.RequestState) |  |  |






<a name="atomix.storage.RequestState"></a>

### RequestState
Request state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition | [uint32](#uint32) |  |  |
| session_id | [uint64](#uint64) |  |  |
| request_id | [uint64](#uint64) |  |  |
| index | [uint64](#uint64) |  |  |
| streams | [StreamState](#atomix.storage.StreamState) | repeated |  |






<a name="atomix.storage.ResponseHeader"></a>

### ResponseHeader
Response header


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [ResponseType](#atomix.storage.ResponseType) |  |  |
| status | [ResponseStatus](#atomix.storage.ResponseStatus) |  |  |
| state | [ResponseState](#atomix.storage.ResponseState) |  |  |






<a name="atomix.storage.ResponseState"></a>

### ResponseState
Response state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| session_id | [uint64](#uint64) |  |  |
| stream_id | [uint64](#uint64) |  |  |
| response_id | [uint64](#uint64) |  |  |
| index | [uint64](#uint64) |  |  |
| leader | [string](#string) |  |  |






<a name="atomix.storage.ResponseStatus"></a>

### ResponseStatus
Response status


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| code | [ResponseCode](#atomix.storage.ResponseCode) |  |  |
| message | [string](#string) |  |  |






<a name="atomix.storage.StreamState"></a>

### StreamState
Stream state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| stream_id | [uint64](#uint64) |  |  |
| response_id | [uint64](#uint64) |  |  |





 


<a name="atomix.storage.ResponseCode"></a>

### ResponseCode
Response code

| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| ERROR | 1 |  |
| NOT_LEADER | 2 |  |
| UNKNOWN | 3 |  |
| CANCELED | 4 |  |
| NOT_FOUND | 5 |  |
| ALREADY_EXISTS | 6 |  |
| UNAUTHORIZED | 7 |  |
| FORBIDDEN | 8 |  |
| CONFLICT | 9 |  |
| INVALID | 10 |  |
| UNAVAILABLE | 11 |  |
| NOT_SUPPORTED | 12 |  |
| TIMEOUT | 13 |  |
| INTERNAL | 14 |  |



<a name="atomix.storage.ResponseType"></a>

### ResponseType
Response type

| Name | Number | Description |
| ---- | ------ | ----------- |
| RESPONSE | 0 |  |
| OPEN_STREAM | 1 |  |
| CLOSE_STREAM | 2 |  |


 

 

 



<a name="atomix/storage/storage.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/storage.proto



<a name="atomix.storage.AddReplicaRequest"></a>

### AddReplicaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replica | [StorageReplica](#atomix.storage.StorageReplica) |  |  |






<a name="atomix.storage.AddReplicaResponse"></a>

### AddReplicaResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [ResponseStatus](#atomix.storage.ResponseStatus) |  |  |






<a name="atomix.storage.PartitionEndpoint"></a>

### PartitionEndpoint
Partition endpoint


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.storage.PartitionId"></a>

### PartitionId
Partition identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition | [int32](#int32) |  |  |






<a name="atomix.storage.RemoveReplicaRequest"></a>

### RemoveReplicaRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replica_id | [string](#string) |  |  |






<a name="atomix.storage.RemoveReplicaResponse"></a>

### RemoveReplicaResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [ResponseStatus](#atomix.storage.ResponseStatus) |  |  |






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
| partition_id | [PartitionId](#atomix.storage.PartitionId) |  |  |
| endpoints | [PartitionEndpoint](#atomix.storage.PartitionEndpoint) | repeated |  |






<a name="atomix.storage.StorageReplica"></a>

### StorageReplica
Replica configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | id is the unique member identifier |
| host | [string](#string) |  | host is the member host |
| api_port | [int32](#int32) |  | api_port is the port to use for the client API |
| protocol_port | [int32](#int32) |  | protocol_port is the port to use for intra-cluster communication |





 

 

 


<a name="atomix.storage.StorageService"></a>

### StorageService
Atomix storage service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| AddReplica | [AddReplicaRequest](#atomix.storage.AddReplicaRequest) | [AddReplicaResponse](#atomix.storage.AddReplicaResponse) | AddReplica adds a replica to the storage |
| RemoveReplica | [RemoveReplicaRequest](#atomix.storage.RemoveReplicaRequest) | [RemoveReplicaResponse](#atomix.storage.RemoveReplicaResponse) | RemoveReplica removes a replica from the storage |

 



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

