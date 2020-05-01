# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/gossip_map/gossip_map.proto](#atomix/gossip_map/gossip_map.proto)
    - [AntiEntropyAdvertisement](#atomix.map.AntiEntropyAdvertisement)
    - [AntiEntropyAdvertisement.DigestEntry](#atomix.map.AntiEntropyAdvertisement.DigestEntry)
    - [Digest](#atomix.map.Digest)
    - [MapValue](#atomix.map.MapValue)
    - [Message](#atomix.map.Message)
    - [Update](#atomix.map.Update)
    - [Update.UpdatesEntry](#atomix.map.Update.UpdatesEntry)
    - [UpdateEntry](#atomix.map.UpdateEntry)
    - [UpdateRequest](#atomix.map.UpdateRequest)
  
  
  
    - [GossipMapService](#atomix.map.GossipMapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/gossip_map/gossip_map.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/gossip_map/gossip_map.proto



<a name="atomix.map.AntiEntropyAdvertisement"></a>

### AntiEntropyAdvertisement



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| digest | [AntiEntropyAdvertisement.DigestEntry](#atomix.map.AntiEntropyAdvertisement.DigestEntry) | repeated |  |
| timestamp | [bytes](#bytes) |  |  |






<a name="atomix.map.AntiEntropyAdvertisement.DigestEntry"></a>

### AntiEntropyAdvertisement.DigestEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [Digest](#atomix.map.Digest) |  |  |






<a name="atomix.map.Digest"></a>

### Digest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| timestamp | [bytes](#bytes) |  |  |
| tombstone | [bool](#bool) |  |  |






<a name="atomix.map.MapValue"></a>

### MapValue



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| digest | [Digest](#atomix.map.Digest) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.map.Message"></a>

### Message



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| source | [string](#string) |  |  |
| target | [atomix.primitive.Name](#atomix.primitive.Name) |  |  |
| update | [Update](#atomix.map.Update) |  |  |
| update_request | [UpdateRequest](#atomix.map.UpdateRequest) |  |  |
| anti_entropy_advertisement | [AntiEntropyAdvertisement](#atomix.map.AntiEntropyAdvertisement) |  |  |






<a name="atomix.map.Update"></a>

### Update



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| updates | [Update.UpdatesEntry](#atomix.map.Update.UpdatesEntry) | repeated |  |
| timestamp | [bytes](#bytes) |  |  |






<a name="atomix.map.Update.UpdatesEntry"></a>

### Update.UpdatesEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [MapValue](#atomix.map.MapValue) |  |  |






<a name="atomix.map.UpdateEntry"></a>

### UpdateEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [MapValue](#atomix.map.MapValue) |  |  |






<a name="atomix.map.UpdateRequest"></a>

### UpdateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| keys | [string](#string) | repeated |  |
| timestamp | [bytes](#bytes) |  |  |





 

 

 


<a name="atomix.map.GossipMapService"></a>

### GossipMapService
GossipMapService implements a distributed map

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

