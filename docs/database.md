# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/database.proto](#atomix/database/database.proto)
    - [Database](#atomix.database.Database)
    - [DatabaseConfig](#atomix.database.DatabaseConfig)
    - [DatabaseId](#atomix.database.DatabaseId)
    - [GetDatabasesRequest](#atomix.database.GetDatabasesRequest)
    - [GetDatabasesResponse](#atomix.database.GetDatabasesResponse)
    - [Partition](#atomix.database.Partition)
    - [PartitionEndpoint](#atomix.database.PartitionEndpoint)
    - [PartitionId](#atomix.database.PartitionId)
    - [ReplicaConfig](#atomix.database.ReplicaConfig)
  
  
  
    - [DatabaseService](#atomix.database.DatabaseService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/database.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/database.proto



<a name="atomix.database.Database"></a>

### Database
Database configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [DatabaseId](#atomix.database.DatabaseId) |  | id is the database identifier |
| partitions | [Partition](#atomix.database.Partition) | repeated | partitions is a list of partitions in the cluster |






<a name="atomix.database.DatabaseConfig"></a>

### DatabaseConfig
Database configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replicas | [ReplicaConfig](#atomix.database.ReplicaConfig) | repeated | nodes is a list of database replicas |
| partitions | [PartitionId](#atomix.database.PartitionId) | repeated | partitions is a list of partitions owned by the replicas |






<a name="atomix.database.DatabaseId"></a>

### DatabaseId
Database identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is the name of the database |
| namespace | [string](#string) |  | namespace is the namespace to which the database belongs |






<a name="atomix.database.GetDatabasesRequest"></a>

### GetDatabasesRequest
Gets a list of databases in a namespace


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [DatabaseId](#atomix.database.DatabaseId) |  |  |






<a name="atomix.database.GetDatabasesResponse"></a>

### GetDatabasesResponse
Returns a list of databases in a namespace


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| databases | [Database](#atomix.database.Database) | repeated |  |






<a name="atomix.database.Partition"></a>

### Partition
Partition info


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition_id | [PartitionId](#atomix.database.PartitionId) |  |  |
| endpoints | [PartitionEndpoint](#atomix.database.PartitionEndpoint) | repeated |  |






<a name="atomix.database.PartitionEndpoint"></a>

### PartitionEndpoint
Partition endpoint


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.database.PartitionId"></a>

### PartitionId
Partition identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition | [int32](#int32) |  |  |






<a name="atomix.database.ReplicaConfig"></a>

### ReplicaConfig
Replica configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | id is the unique member identifier |
| host | [string](#string) |  | host is the member host |
| api_port | [int32](#int32) |  | api_port is the port to use for the client API |
| protocol_port | [int32](#int32) |  | protocol_port is the port to use for intra-cluster communication |





 

 

 


<a name="atomix.database.DatabaseService"></a>

### DatabaseService
Atomix database service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetDatabases | [GetDatabasesRequest](#atomix.database.GetDatabasesRequest) | [GetDatabasesResponse](#atomix.database.GetDatabasesResponse) | GetDatabases gets a list of databases controlled by the controller |

 



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

