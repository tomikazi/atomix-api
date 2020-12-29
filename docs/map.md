# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/storage/map/map.proto](#atomix/storage/map/map.proto)
    - [ClearRequest](#atomix.storage.map.ClearRequest)
    - [ClearResponse](#atomix.storage.map.ClearResponse)
    - [CloseRequest](#atomix.storage.map.CloseRequest)
    - [CloseResponse](#atomix.storage.map.CloseResponse)
    - [CreateRequest](#atomix.storage.map.CreateRequest)
    - [CreateResponse](#atomix.storage.map.CreateResponse)
    - [EntriesRequest](#atomix.storage.map.EntriesRequest)
    - [EntriesResponse](#atomix.storage.map.EntriesResponse)
    - [EventRequest](#atomix.storage.map.EventRequest)
    - [EventResponse](#atomix.storage.map.EventResponse)
    - [ExistsRequest](#atomix.storage.map.ExistsRequest)
    - [ExistsResponse](#atomix.storage.map.ExistsResponse)
    - [GetRequest](#atomix.storage.map.GetRequest)
    - [GetResponse](#atomix.storage.map.GetResponse)
    - [PutRequest](#atomix.storage.map.PutRequest)
    - [PutResponse](#atomix.storage.map.PutResponse)
    - [RemoveRequest](#atomix.storage.map.RemoveRequest)
    - [RemoveResponse](#atomix.storage.map.RemoveResponse)
    - [ReplaceRequest](#atomix.storage.map.ReplaceRequest)
    - [ReplaceResponse](#atomix.storage.map.ReplaceResponse)
    - [SizeRequest](#atomix.storage.map.SizeRequest)
    - [SizeResponse](#atomix.storage.map.SizeResponse)
  
    - [EventResponse.Type](#atomix.storage.map.EventResponse.Type)
    - [ResponseStatus](#atomix.storage.map.ResponseStatus)
  
  
    - [MapService](#atomix.storage.map.MapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/storage/map/map.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/storage/map/map.proto



<a name="atomix.storage.map.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.map.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.map.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.storage.map.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.map.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.map.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |






<a name="atomix.storage.map.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.map.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.map.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.storage.map.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.storage.map.EventResponse.Type) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.map.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.storage.map.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| contains_key | [bool](#bool) |  |  |






<a name="atomix.storage.map.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.storage.map.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.map.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| if_empty | [bool](#bool) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.storage.map.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.map.ResponseStatus) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |






<a name="atomix.storage.map.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.storage.map.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.map.ResponseStatus) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |






<a name="atomix.storage.map.ReplaceRequest"></a>

### ReplaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |
| new_value | [bytes](#bytes) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.storage.map.ReplaceResponse"></a>

### ReplaceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.storage.map.ResponseStatus) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |






<a name="atomix.storage.map.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.RequestHeader](#atomix.storage.RequestHeader) |  |  |






<a name="atomix.storage.map.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.storage.ResponseHeader](#atomix.storage.ResponseHeader) |  |  |
| size | [uint32](#uint32) |  |  |





 


<a name="atomix.storage.map.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| INSERTED | 1 |  |
| UPDATED | 2 |  |
| REMOVED | 3 |  |



<a name="atomix.storage.map.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| PRECONDITION_FAILED | 3 |  |


 

 


<a name="atomix.storage.map.MapService"></a>

### MapService
MapService implements a distributed map

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.storage.map.CreateRequest) | [CreateResponse](#atomix.storage.map.CreateResponse) | Create creates an indexed map |
| Close | [CloseRequest](#atomix.storage.map.CloseRequest) | [CloseResponse](#atomix.storage.map.CloseResponse) | Close closes an indexed map |
| Size | [SizeRequest](#atomix.storage.map.SizeRequest) | [SizeResponse](#atomix.storage.map.SizeResponse) | Size returns the size of the map |
| Exists | [ExistsRequest](#atomix.storage.map.ExistsRequest) | [ExistsResponse](#atomix.storage.map.ExistsResponse) | Exists checks whether a key exists in the map |
| Put | [PutRequest](#atomix.storage.map.PutRequest) | [PutResponse](#atomix.storage.map.PutResponse) | Put puts an entry into the map |
| Replace | [ReplaceRequest](#atomix.storage.map.ReplaceRequest) | [ReplaceResponse](#atomix.storage.map.ReplaceResponse) | Replace performs a check-and-set operation on an entry in the map |
| Get | [GetRequest](#atomix.storage.map.GetRequest) | [GetResponse](#atomix.storage.map.GetResponse) | Get gets the entry for a key |
| Remove | [RemoveRequest](#atomix.storage.map.RemoveRequest) | [RemoveResponse](#atomix.storage.map.RemoveResponse) | Remove removes an entry from the map |
| Clear | [ClearRequest](#atomix.storage.map.ClearRequest) | [ClearResponse](#atomix.storage.map.ClearResponse) | Clear removes all entries from the map |
| Events | [EventRequest](#atomix.storage.map.EventRequest) | [EventResponse](#atomix.storage.map.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.storage.map.EntriesRequest) | [EntriesResponse](#atomix.storage.map.EntriesResponse) stream | Entries lists all entries in the map |

 



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

