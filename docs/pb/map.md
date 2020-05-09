# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/pb/map/map.proto](#atomix/pb/map/map.proto)
    - [BackupRequest](#atomix.pb.map.BackupRequest)
    - [BackupResponse](#atomix.pb.map.BackupResponse)
    - [Digest](#atomix.pb.map.Digest)
    - [Entry](#atomix.pb.map.Entry)
    - [GetRequest](#atomix.pb.map.GetRequest)
    - [GetResponse](#atomix.pb.map.GetResponse)
    - [PutRequest](#atomix.pb.map.PutRequest)
    - [PutResponse](#atomix.pb.map.PutResponse)
    - [RemoveRequest](#atomix.pb.map.RemoveRequest)
    - [RemoveResponse](#atomix.pb.map.RemoveResponse)
    - [Value](#atomix.pb.map.Value)
  
  
  
    - [MapService](#atomix.pb.map.MapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/pb/map/map.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/pb/map/map.proto



<a name="atomix.pb.map.BackupRequest"></a>

### BackupRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.RequestHeader](#atomix.pb.headers.RequestHeader) |  |  |
| entries | [Entry](#atomix.pb.map.Entry) | repeated |  |






<a name="atomix.pb.map.BackupResponse"></a>

### BackupResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.ResponseHeader](#atomix.pb.headers.ResponseHeader) |  |  |






<a name="atomix.pb.map.Digest"></a>

### Digest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| term | [uint64](#uint64) |  |  |
| timestamp | [uint64](#uint64) |  |  |






<a name="atomix.pb.map.Entry"></a>

### Entry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [Value](#atomix.pb.map.Value) |  |  |
| digest | [Digest](#atomix.pb.map.Digest) |  |  |






<a name="atomix.pb.map.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.RequestHeader](#atomix.pb.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.pb.map.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.ResponseHeader](#atomix.pb.headers.ResponseHeader) |  |  |
| value | [Value](#atomix.pb.map.Value) |  |  |






<a name="atomix.pb.map.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.RequestHeader](#atomix.pb.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| value | [Value](#atomix.pb.map.Value) |  |  |






<a name="atomix.pb.map.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.ResponseHeader](#atomix.pb.headers.ResponseHeader) |  |  |
| version | [uint64](#uint64) |  |  |






<a name="atomix.pb.map.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.RequestHeader](#atomix.pb.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| value | [Value](#atomix.pb.map.Value) |  |  |






<a name="atomix.pb.map.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.pb.headers.ResponseHeader](#atomix.pb.headers.ResponseHeader) |  |  |
| value | [Value](#atomix.pb.map.Value) |  |  |






<a name="atomix.pb.map.Value"></a>

### Value



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |





 

 

 


<a name="atomix.pb.map.MapService"></a>

### MapService
MapService implements a partitioned primary-backup map

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Put | [PutRequest](#atomix.pb.map.PutRequest) | [PutResponse](#atomix.pb.map.PutResponse) | Puts a key/value in the map |
| Get | [GetRequest](#atomix.pb.map.GetRequest) | [GetResponse](#atomix.pb.map.GetResponse) | Gets a key from the map |
| Remove | [RemoveRequest](#atomix.pb.map.RemoveRequest) | [RemoveResponse](#atomix.pb.map.RemoveResponse) | Removes a key from the map |
| Backup | [BackupRequest](#atomix.pb.map.BackupRequest) stream | [BackupResponse](#atomix.pb.map.BackupResponse) stream | Backs up changes to a replica |

 



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

