# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/management/driver/agent.proto](#atomix/management/driver/agent.proto)
    - [CreateProxyRequest](#atomix.management.driver.CreateProxyRequest)
    - [CreateProxyResponse](#atomix.management.driver.CreateProxyResponse)
    - [DestroyProxyRequest](#atomix.management.driver.DestroyProxyRequest)
    - [DestroyProxyResponse](#atomix.management.driver.DestroyProxyResponse)
    - [ProxyId](#atomix.management.driver.ProxyId)
    - [ProxyOptions](#atomix.management.driver.ProxyOptions)
  
    - [Agent](#atomix.management.driver.Agent)
  
- [atomix/management/driver/driver.proto](#atomix/management/driver/driver.proto)
    - [AgentAddress](#atomix.management.driver.AgentAddress)
    - [AgentConfig](#atomix.management.driver.AgentConfig)
    - [AgentId](#atomix.management.driver.AgentId)
    - [ConfigureAgentRequest](#atomix.management.driver.ConfigureAgentRequest)
    - [ConfigureAgentResponse](#atomix.management.driver.ConfigureAgentResponse)
    - [StartAgentRequest](#atomix.management.driver.StartAgentRequest)
    - [StartAgentResponse](#atomix.management.driver.StartAgentResponse)
    - [StopAgentRequest](#atomix.management.driver.StopAgentRequest)
    - [StopAgentResponse](#atomix.management.driver.StopAgentResponse)
  
    - [Driver](#atomix.management.driver.Driver)
  
- [Scalar Value Types](#scalar-value-types)



<a name="atomix/management/driver/agent.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/driver/agent.proto



<a name="atomix.management.driver.CreateProxyRequest"></a>

### CreateProxyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| proxy_id | [ProxyId](#atomix.management.driver.ProxyId) |  |  |
| options | [ProxyOptions](#atomix.management.driver.ProxyOptions) |  |  |






<a name="atomix.management.driver.CreateProxyResponse"></a>

### CreateProxyResponse







<a name="atomix.management.driver.DestroyProxyRequest"></a>

### DestroyProxyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| proxy_id | [ProxyId](#atomix.management.driver.ProxyId) |  |  |






<a name="atomix.management.driver.DestroyProxyResponse"></a>

### DestroyProxyResponse







<a name="atomix.management.driver.ProxyId"></a>

### ProxyId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive_id | [atomix.primitive.PrimitiveId](#atomix.primitive.PrimitiveId) |  |  |






<a name="atomix.management.driver.ProxyOptions"></a>

### ProxyOptions



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| read | [bool](#bool) |  |  |
| write | [bool](#bool) |  |  |





 

 

 


<a name="atomix.management.driver.Agent"></a>

### Agent


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateProxy | [CreateProxyRequest](#atomix.management.driver.CreateProxyRequest) | [CreateProxyResponse](#atomix.management.driver.CreateProxyResponse) |  |
| DestroyProxy | [DestroyProxyRequest](#atomix.management.driver.DestroyProxyRequest) | [DestroyProxyResponse](#atomix.management.driver.DestroyProxyResponse) |  |

 



<a name="atomix/management/driver/driver.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/management/driver/driver.proto



<a name="atomix.management.driver.AgentAddress"></a>

### AgentAddress



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.management.driver.AgentConfig"></a>

### AgentConfig



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| protocol | [atomix.protocol.ProtocolConfig](#atomix.protocol.ProtocolConfig) |  |  |






<a name="atomix.management.driver.AgentId"></a>

### AgentId



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| namespace | [string](#string) |  |  |
| name | [string](#string) |  |  |






<a name="atomix.management.driver.ConfigureAgentRequest"></a>

### ConfigureAgentRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agent_id | [AgentId](#atomix.management.driver.AgentId) |  |  |
| config | [AgentConfig](#atomix.management.driver.AgentConfig) |  |  |






<a name="atomix.management.driver.ConfigureAgentResponse"></a>

### ConfigureAgentResponse







<a name="atomix.management.driver.StartAgentRequest"></a>

### StartAgentRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agent_id | [AgentId](#atomix.management.driver.AgentId) |  |  |
| address | [AgentAddress](#atomix.management.driver.AgentAddress) |  |  |
| config | [AgentConfig](#atomix.management.driver.AgentConfig) |  |  |






<a name="atomix.management.driver.StartAgentResponse"></a>

### StartAgentResponse







<a name="atomix.management.driver.StopAgentRequest"></a>

### StopAgentRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agent_id | [AgentId](#atomix.management.driver.AgentId) |  |  |






<a name="atomix.management.driver.StopAgentResponse"></a>

### StopAgentResponse






 

 

 


<a name="atomix.management.driver.Driver"></a>

### Driver


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| StartAgent | [StartAgentRequest](#atomix.management.driver.StartAgentRequest) | [StartAgentResponse](#atomix.management.driver.StartAgentResponse) |  |
| ConfigureAgent | [ConfigureAgentRequest](#atomix.management.driver.ConfigureAgentRequest) | [ConfigureAgentResponse](#atomix.management.driver.ConfigureAgentResponse) |  |
| StopAgent | [StopAgentRequest](#atomix.management.driver.StopAgentRequest) | [StopAgentResponse](#atomix.management.driver.StopAgentResponse) |  |

 



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

