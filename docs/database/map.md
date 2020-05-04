# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/map/map.proto](#atomix/database/map/map.proto)
    - [ClearRequest](#atomix.database.map.ClearRequest)
    - [ClearResponse](#atomix.database.map.ClearResponse)
    - [CloseRequest](#atomix.database.map.CloseRequest)
    - [CloseResponse](#atomix.database.map.CloseResponse)
    - [CreateRequest](#atomix.database.map.CreateRequest)
    - [CreateResponse](#atomix.database.map.CreateResponse)
    - [EntriesRequest](#atomix.database.map.EntriesRequest)
    - [EntriesResponse](#atomix.database.map.EntriesResponse)
    - [EventRequest](#atomix.database.map.EventRequest)
    - [EventResponse](#atomix.database.map.EventResponse)
    - [ExistsRequest](#atomix.database.map.ExistsRequest)
    - [ExistsResponse](#atomix.database.map.ExistsResponse)
    - [GetRequest](#atomix.database.map.GetRequest)
    - [GetResponse](#atomix.database.map.GetResponse)
    - [PutRequest](#atomix.database.map.PutRequest)
    - [PutResponse](#atomix.database.map.PutResponse)
    - [RemoveRequest](#atomix.database.map.RemoveRequest)
    - [RemoveResponse](#atomix.database.map.RemoveResponse)
    - [ReplaceRequest](#atomix.database.map.ReplaceRequest)
    - [ReplaceResponse](#atomix.database.map.ReplaceResponse)
    - [SizeRequest](#atomix.database.map.SizeRequest)
    - [SizeResponse](#atomix.database.map.SizeResponse)
  
    - [EventResponse.Type](#atomix.database.map.EventResponse.Type)
    - [ResponseStatus](#atomix.database.map.ResponseStatus)
  
  
    - [MapService](#atomix.database.map.MapService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/map/map.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/map/map.proto



<a name="atomix.database.map.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.map.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.map.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.map.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.map.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.map.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.map.EntriesRequest"></a>

### EntriesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.map.EntriesResponse"></a>

### EntriesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.map.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| replay | [bool](#bool) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.database.map.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.map.EventResponse.Type) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.map.ExistsRequest"></a>

### ExistsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.database.map.ExistsResponse"></a>

### ExistsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| contains_key | [bool](#bool) |  |  |






<a name="atomix.database.map.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |






<a name="atomix.database.map.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.map.PutRequest"></a>

### PutRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.database.map.PutResponse"></a>

### PutResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.map.ResponseStatus) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |






<a name="atomix.database.map.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [int64](#int64) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |






<a name="atomix.database.map.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.map.ResponseStatus) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |






<a name="atomix.database.map.ReplaceRequest"></a>

### ReplaceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| key | [string](#string) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |
| new_value | [bytes](#bytes) |  |  |
| ttl | [google.protobuf.Duration](#google.protobuf.Duration) |  |  |






<a name="atomix.database.map.ReplaceResponse"></a>

### ReplaceResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| status | [ResponseStatus](#atomix.database.map.ResponseStatus) |  |  |
| created | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| updated | [google.protobuf.Timestamp](#google.protobuf.Timestamp) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [int64](#int64) |  |  |






<a name="atomix.database.map.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.map.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| size | [int32](#int32) |  |  |





 


<a name="atomix.database.map.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| INSERTED | 1 |  |
| UPDATED | 2 |  |
| REMOVED | 3 |  |



<a name="atomix.database.map.ResponseStatus"></a>

### ResponseStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| OK | 0 |  |
| NOOP | 1 |  |
| WRITE_LOCK | 2 |  |
| PRECONDITION_FAILED | 3 |  |


 

 


<a name="atomix.database.map.MapService"></a>

### MapService
MapService implements a distributed map

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.map.CreateRequest) | [CreateResponse](#atomix.database.map.CreateResponse) | Create creates an indexed map |
| Close | [CloseRequest](#atomix.database.map.CloseRequest) | [CloseResponse](#atomix.database.map.CloseResponse) | Close closes an indexed map |
| Size | [SizeRequest](#atomix.database.map.SizeRequest) | [SizeResponse](#atomix.database.map.SizeResponse) | Size returns the size of the map |
| Exists | [ExistsRequest](#atomix.database.map.ExistsRequest) | [ExistsResponse](#atomix.database.map.ExistsResponse) | Exists checks whether a key exists in the map |
| Put | [PutRequest](#atomix.database.map.PutRequest) | [PutResponse](#atomix.database.map.PutResponse) | Put puts an entry into the map |
| Replace | [ReplaceRequest](#atomix.database.map.ReplaceRequest) | [ReplaceResponse](#atomix.database.map.ReplaceResponse) | Replace performs a check-and-set operation on an entry in the map |
| Get | [GetRequest](#atomix.database.map.GetRequest) | [GetResponse](#atomix.database.map.GetResponse) | Get gets the entry for a key |
| Remove | [RemoveRequest](#atomix.database.map.RemoveRequest) | [RemoveResponse](#atomix.database.map.RemoveResponse) | Remove removes an entry from the map |
| Clear | [ClearRequest](#atomix.database.map.ClearRequest) | [ClearResponse](#atomix.database.map.ClearResponse) | Clear removes all entries from the map |
| Events | [EventRequest](#atomix.database.map.EventRequest) | [EventResponse](#atomix.database.map.EventResponse) stream | Events listens for change events |
| Entries | [EntriesRequest](#atomix.database.map.EntriesRequest) | [EntriesResponse](#atomix.database.map.EntriesResponse) stream | Entries lists all entries in the map |

 



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

