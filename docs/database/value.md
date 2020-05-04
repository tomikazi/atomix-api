# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/database/value/value.proto](#atomix/database/value/value.proto)
    - [CloseRequest](#atomix.database.value.CloseRequest)
    - [CloseResponse](#atomix.database.value.CloseResponse)
    - [CreateRequest](#atomix.database.value.CreateRequest)
    - [CreateResponse](#atomix.database.value.CreateResponse)
    - [EventRequest](#atomix.database.value.EventRequest)
    - [EventResponse](#atomix.database.value.EventResponse)
    - [GetRequest](#atomix.database.value.GetRequest)
    - [GetResponse](#atomix.database.value.GetResponse)
    - [SetRequest](#atomix.database.value.SetRequest)
    - [SetResponse](#atomix.database.value.SetResponse)
  
    - [EventResponse.Type](#atomix.database.value.EventResponse.Type)
  
  
    - [ValueService](#atomix.database.value.ValueService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/database/value/value.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/database/value/value.proto



<a name="atomix.database.value.CloseRequest"></a>

### CloseRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| delete | [bool](#bool) |  |  |






<a name="atomix.database.value.CloseResponse"></a>

### CloseResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.value.CreateRequest"></a>

### CreateRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.value.CreateResponse"></a>

### CreateResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |






<a name="atomix.database.value.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.value.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| type | [EventResponse.Type](#atomix.database.value.EventResponse.Type) |  |  |
| previous_value | [bytes](#bytes) |  |  |
| previous_version | [uint64](#uint64) |  |  |
| new_value | [bytes](#bytes) |  |  |
| new_version | [uint64](#uint64) |  |  |






<a name="atomix.database.value.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |






<a name="atomix.database.value.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| value | [bytes](#bytes) |  |  |
| version | [uint64](#uint64) |  |  |






<a name="atomix.database.value.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.RequestHeader](#atomix.database.headers.RequestHeader) |  |  |
| expect_version | [uint64](#uint64) |  |  |
| expect_value | [bytes](#bytes) |  |  |
| value | [bytes](#bytes) |  |  |






<a name="atomix.database.value.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.database.headers.ResponseHeader](#atomix.database.headers.ResponseHeader) |  |  |
| version | [uint64](#uint64) |  |  |
| succeeded | [bool](#bool) |  |  |





 


<a name="atomix.database.value.EventResponse.Type"></a>

### EventResponse.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| UPDATED | 0 |  |


 

 


<a name="atomix.database.value.ValueService"></a>

### ValueService
ValueService implements a distributed atomic value

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Create | [CreateRequest](#atomix.database.value.CreateRequest) | [CreateResponse](#atomix.database.value.CreateResponse) | Create creates a new value session |
| Close | [CloseRequest](#atomix.database.value.CloseRequest) | [CloseResponse](#atomix.database.value.CloseResponse) | Close closes the value session |
| Set | [SetRequest](#atomix.database.value.SetRequest) | [SetResponse](#atomix.database.value.SetResponse) | Set sets the value |
| Get | [GetRequest](#atomix.database.value.GetRequest) | [GetResponse](#atomix.database.value.GetResponse) | Get gets the value |
| Events | [EventRequest](#atomix.database.value.EventRequest) | [EventResponse](#atomix.database.value.EventResponse) stream | Events listens for value change events |

 



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

