# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/proxy/proxy.proto](#atomix/proxy/proxy.proto)
    - [AddPrimitiveRequest](#atomix.proxy.AddPrimitiveRequest)
    - [AddPrimitiveResponse](#atomix.proxy.AddPrimitiveResponse)
    - [PrimitiveConfig](#atomix.proxy.PrimitiveConfig)
    - [PrimitiveConfig.OptionsEntry](#atomix.proxy.PrimitiveConfig.OptionsEntry)
    - [ProxyConfig](#atomix.proxy.ProxyConfig)
    - [ProxyMeta](#atomix.proxy.ProxyMeta)
    - [RemovePrimitiveRequest](#atomix.proxy.RemovePrimitiveRequest)
    - [RemovePrimitiveResponse](#atomix.proxy.RemovePrimitiveResponse)
    - [UpdateConfigRequest](#atomix.proxy.UpdateConfigRequest)
    - [UpdateConfigResponse](#atomix.proxy.UpdateConfigResponse)
  
  
  
    - [ProxyConfigService](#atomix.proxy.ProxyConfigService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/proxy/proxy.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/proxy/proxy.proto



<a name="atomix.proxy.AddPrimitiveRequest"></a>

### AddPrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| primitive | [PrimitiveConfig](#atomix.proxy.PrimitiveConfig) |  |  |






<a name="atomix.proxy.AddPrimitiveResponse"></a>

### AddPrimitiveResponse







<a name="atomix.proxy.PrimitiveConfig"></a>

### PrimitiveConfig
PrimitiveConfig is a primitive configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |
| type | [string](#string) |  |  |
| driver | [string](#string) |  |  |
| options | [PrimitiveConfig.OptionsEntry](#atomix.proxy.PrimitiveConfig.OptionsEntry) | repeated |  |






<a name="atomix.proxy.PrimitiveConfig.OptionsEntry"></a>

### PrimitiveConfig.OptionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.proxy.ProxyConfig"></a>

### ProxyConfig
Proxy configuration


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| protocol | [atomix.protocol.ProtocolConfig](#atomix.protocol.ProtocolConfig) |  |  |






<a name="atomix.proxy.ProxyMeta"></a>

### ProxyMeta
ProxyMeta is a proxy metadata


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| host | [string](#string) |  |  |
| port | [int32](#int32) |  |  |






<a name="atomix.proxy.RemovePrimitiveRequest"></a>

### RemovePrimitiveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  |  |






<a name="atomix.proxy.RemovePrimitiveResponse"></a>

### RemovePrimitiveResponse







<a name="atomix.proxy.UpdateConfigRequest"></a>

### UpdateConfigRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| config | [ProxyConfig](#atomix.proxy.ProxyConfig) |  |  |






<a name="atomix.proxy.UpdateConfigResponse"></a>

### UpdateConfigResponse






 

 

 


<a name="atomix.proxy.ProxyConfigService"></a>

### ProxyConfigService
Atomix proxy configuration service

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| UpdateConfig | [UpdateConfigRequest](#atomix.proxy.UpdateConfigRequest) | [UpdateConfigResponse](#atomix.proxy.UpdateConfigResponse) | UpdateConfig updates the storage configuration |

 



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

