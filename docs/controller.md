# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/controller/controller.proto](#atomix/controller/controller.proto)
    - [GetDatabasesRequest](#atomix.controller.GetDatabasesRequest)
    - [GetDatabasesResponse](#atomix.controller.GetDatabasesResponse)
  
  
  
    - [ControllerService](#atomix.controller.ControllerService)
  

- [atomix/controller/database.proto](#atomix/controller/database.proto)
    - [Cluster](#atomix.controller.Cluster)
    - [ClusterConfig](#atomix.controller.ClusterConfig)
    - [ClusterId](#atomix.controller.ClusterId)
    - [Database](#atomix.controller.Database)
    - [DatabaseId](#atomix.controller.DatabaseId)
    - [MemberConfig](#atomix.controller.MemberConfig)
    - [NodeConfig](#atomix.controller.NodeConfig)
    - [Partition](#atomix.controller.Partition)
    - [PartitionEndpoint](#atomix.controller.PartitionEndpoint)
    - [PartitionId](#atomix.controller.PartitionId)
  
  
  
  

- [atomix/controller/membership.proto](#atomix/controller/membership.proto)
    - [JoinClusterRequest](#atomix.controller.JoinClusterRequest)
    - [JoinClusterResponse](#atomix.controller.JoinClusterResponse)
    - [JoinMembershipGroupRequest](#atomix.controller.JoinMembershipGroupRequest)
    - [JoinMembershipGroupResponse](#atomix.controller.JoinMembershipGroupResponse)
    - [JoinPartitionGroupRequest](#atomix.controller.JoinPartitionGroupRequest)
    - [JoinPartitionGroupResponse](#atomix.controller.JoinPartitionGroupResponse)
    - [Member](#atomix.controller.Member)
    - [MemberId](#atomix.controller.MemberId)
    - [Membership](#atomix.controller.Membership)
    - [MembershipGroup](#atomix.controller.MembershipGroup)
    - [MembershipGroupId](#atomix.controller.MembershipGroupId)
    - [PartitionGroup](#atomix.controller.PartitionGroup)
    - [PartitionGroupId](#atomix.controller.PartitionGroupId)
  
  
  
    - [ClusterService](#atomix.controller.ClusterService)
    - [MembershipGroupService](#atomix.controller.MembershipGroupService)
    - [PartitionGroupService](#atomix.controller.PartitionGroupService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/controller/controller.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/controller/controller.proto



<a name="atomix.controller.GetDatabasesRequest"></a>

### GetDatabasesRequest
Gets a list of databases in a namespace


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [DatabaseId](#atomix.controller.DatabaseId) |  |  |






<a name="atomix.controller.GetDatabasesResponse"></a>

### GetDatabasesResponse
Returns a list of databases in a namespace


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| databases | [Database](#atomix.controller.Database) | repeated |  |





 

 

 


<a name="atomix.controller.ControllerService"></a>

### ControllerService
Atomix controller service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetDatabases | [GetDatabasesRequest](#atomix.controller.GetDatabasesRequest) | [GetDatabasesResponse](#atomix.controller.GetDatabasesResponse) | GetDatabases gets a list of databases controlled by the controller |

 



<a name="atomix/controller/database.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/controller/database.proto



<a name="atomix.controller.Cluster"></a>

### Cluster
Cluster configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [ClusterId](#atomix.controller.ClusterId) |  | id is the cluster identifier |
| partitions | [PartitionId](#atomix.controller.PartitionId) | repeated | partitions is a list of partitions in the cluster |






<a name="atomix.controller.ClusterConfig"></a>

### ClusterConfig
Cluster configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| members | [MemberConfig](#atomix.controller.MemberConfig) | repeated | members is a list of cluster members |
| partitions | [PartitionId](#atomix.controller.PartitionId) | repeated | partitions is a list of partitions owned by the cluster |






<a name="atomix.controller.ClusterId"></a>

### ClusterId
Cluster identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [int32](#int32) |  | id is the unique numeric identifier for the cluster |
| database_id | [DatabaseId](#atomix.controller.DatabaseId) |  | database_id is the identifier for the database to which the cluster belonds |






<a name="atomix.controller.Database"></a>

### Database
Database configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [DatabaseId](#atomix.controller.DatabaseId) |  | id is the database identifier |
| partitions | [Partition](#atomix.controller.Partition) | repeated | partitions is a list of partitions in the cluster |






<a name="atomix.controller.DatabaseId"></a>

### DatabaseId
Database identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | name is the name of the database |
| namespace | [string](#string) |  | namespace is the namespace to which the database belongs |






<a name="atomix.controller.MemberConfig"></a>

### MemberConfig
Member configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | id is the unique member identifier |
| host | [string](#string) |  | host is the member host |
| api_port | [int32](#int32) |  | api_port is the port to use for the client API |
| protocol_port | [int32](#int32) |  | protocol_port is the port to use for intra-cluster communication |






<a name="atomix.controller.NodeConfig"></a>

### NodeConfig
Node configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |
| api_port | [int32](#int32) |  |  |
| protocol_port | [int32](#int32) |  |  |






<a name="atomix.controller.Partition"></a>

### Partition
Partition info


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition_id | [int32](#int32) |  |  |
| endpoints | [PartitionEndpoint](#atomix.controller.PartitionEndpoint) | repeated |  |






<a name="atomix.controller.PartitionEndpoint"></a>

### PartitionEndpoint
Partition endpoint


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.controller.PartitionId"></a>

### PartitionId
Partition identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| partition | [int32](#int32) |  |  |
| cluster | [ClusterId](#atomix.controller.ClusterId) |  |  |





 

 

 

 



<a name="atomix/controller/membership.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/controller/membership.proto



<a name="atomix.controller.JoinClusterRequest"></a>

### JoinClusterRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member | [Member](#atomix.controller.Member) |  |  |
| group_id | [MembershipGroupId](#atomix.controller.MembershipGroupId) |  |  |






<a name="atomix.controller.JoinClusterResponse"></a>

### JoinClusterResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group_id | [MembershipGroupId](#atomix.controller.MembershipGroupId) |  |  |
| membership | [Membership](#atomix.controller.Membership) |  |  |






<a name="atomix.controller.JoinMembershipGroupRequest"></a>

### JoinMembershipGroupRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member_id | [MemberId](#atomix.controller.MemberId) |  |  |
| group_id | [MembershipGroupId](#atomix.controller.MembershipGroupId) |  |  |






<a name="atomix.controller.JoinMembershipGroupResponse"></a>

### JoinMembershipGroupResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [MembershipGroup](#atomix.controller.MembershipGroup) |  |  |






<a name="atomix.controller.JoinPartitionGroupRequest"></a>

### JoinPartitionGroupRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| member_id | [MemberId](#atomix.controller.MemberId) |  |  |
| group_id | [PartitionGroupId](#atomix.controller.PartitionGroupId) |  |  |
| partitions | [uint32](#uint32) |  |  |
| replication_factor | [uint32](#uint32) |  |  |






<a name="atomix.controller.JoinPartitionGroupResponse"></a>

### JoinPartitionGroupResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| group | [PartitionGroup](#atomix.controller.PartitionGroup) |  |  |






<a name="atomix.controller.Member"></a>

### Member
Member is a cluster member


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [MemberId](#atomix.controller.MemberId) |  |  |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.controller.MemberId"></a>

### MemberId
Member identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |






<a name="atomix.controller.Membership"></a>

### Membership



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| members | [Member](#atomix.controller.Member) | repeated |  |






<a name="atomix.controller.MembershipGroup"></a>

### MembershipGroup
Cluster membership group


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [MembershipGroupId](#atomix.controller.MembershipGroupId) |  |  |
| term | [uint64](#uint64) |  |  |
| leader | [MemberId](#atomix.controller.MemberId) |  |  |
| members | [Member](#atomix.controller.Member) | repeated |  |






<a name="atomix.controller.MembershipGroupId"></a>

### MembershipGroupId
Membership group identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |






<a name="atomix.controller.PartitionGroup"></a>

### PartitionGroup
Partition group state


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [PartitionGroupId](#atomix.controller.PartitionGroupId) |  |  |
| partitions | [MembershipGroup](#atomix.controller.MembershipGroup) | repeated |  |






<a name="atomix.controller.PartitionGroupId"></a>

### PartitionGroupId
Partition group identifier


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| namespace | [string](#string) |  |  |





 

 

 


<a name="atomix.controller.ClusterService"></a>

### ClusterService
Atomix cluster service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| JoinCluster | [JoinClusterRequest](#atomix.controller.JoinClusterRequest) | [JoinClusterResponse](#atomix.controller.JoinClusterResponse) stream | Joins a member to the cluster |


<a name="atomix.controller.MembershipGroupService"></a>

### MembershipGroupService
Atomix membership group service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| JoinMembershipGroup | [JoinMembershipGroupRequest](#atomix.controller.JoinMembershipGroupRequest) | [JoinMembershipGroupResponse](#atomix.controller.JoinMembershipGroupResponse) stream | Joins a member to a membership group |


<a name="atomix.controller.PartitionGroupService"></a>

### PartitionGroupService
Atomix partition group service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| JoinPartitionGroup | [JoinPartitionGroupRequest](#atomix.controller.JoinPartitionGroupRequest) | [JoinPartitionGroupResponse](#atomix.controller.JoinPartitionGroupResponse) stream | Joins a member to a partition group |

 



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

