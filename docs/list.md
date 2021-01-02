# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [atomix/primitive/list/list.proto](#atomix/primitive/list/list.proto)
    - [AppendInput](#atomix.primitive.list.AppendInput)
    - [AppendOutput](#atomix.primitive.list.AppendOutput)
    - [AppendRequest](#atomix.primitive.list.AppendRequest)
    - [AppendResponse](#atomix.primitive.list.AppendResponse)
    - [ClearInput](#atomix.primitive.list.ClearInput)
    - [ClearOutput](#atomix.primitive.list.ClearOutput)
    - [ClearRequest](#atomix.primitive.list.ClearRequest)
    - [ClearResponse](#atomix.primitive.list.ClearResponse)
    - [ContainsInput](#atomix.primitive.list.ContainsInput)
    - [ContainsOutput](#atomix.primitive.list.ContainsOutput)
    - [ContainsRequest](#atomix.primitive.list.ContainsRequest)
    - [ContainsResponse](#atomix.primitive.list.ContainsResponse)
    - [ElementsInput](#atomix.primitive.list.ElementsInput)
    - [ElementsOutput](#atomix.primitive.list.ElementsOutput)
    - [ElementsRequest](#atomix.primitive.list.ElementsRequest)
    - [ElementsResponse](#atomix.primitive.list.ElementsResponse)
    - [EventInput](#atomix.primitive.list.EventInput)
    - [EventOutput](#atomix.primitive.list.EventOutput)
    - [EventRequest](#atomix.primitive.list.EventRequest)
    - [EventResponse](#atomix.primitive.list.EventResponse)
    - [GetInput](#atomix.primitive.list.GetInput)
    - [GetOutput](#atomix.primitive.list.GetOutput)
    - [GetRequest](#atomix.primitive.list.GetRequest)
    - [GetResponse](#atomix.primitive.list.GetResponse)
    - [InsertInput](#atomix.primitive.list.InsertInput)
    - [InsertOutput](#atomix.primitive.list.InsertOutput)
    - [InsertRequest](#atomix.primitive.list.InsertRequest)
    - [InsertResponse](#atomix.primitive.list.InsertResponse)
    - [RemoveInput](#atomix.primitive.list.RemoveInput)
    - [RemoveOutput](#atomix.primitive.list.RemoveOutput)
    - [RemoveRequest](#atomix.primitive.list.RemoveRequest)
    - [RemoveResponse](#atomix.primitive.list.RemoveResponse)
    - [SetInput](#atomix.primitive.list.SetInput)
    - [SetOutput](#atomix.primitive.list.SetOutput)
    - [SetRequest](#atomix.primitive.list.SetRequest)
    - [SetResponse](#atomix.primitive.list.SetResponse)
    - [SizeInput](#atomix.primitive.list.SizeInput)
    - [SizeOutput](#atomix.primitive.list.SizeOutput)
    - [SizeRequest](#atomix.primitive.list.SizeRequest)
    - [SizeResponse](#atomix.primitive.list.SizeResponse)
  
    - [EventOutput.Type](#atomix.primitive.list.EventOutput.Type)
  
  
    - [ListService](#atomix.primitive.list.ListService)
  

- [Scalar Value Types](#scalar-value-types)



<a name="atomix/primitive/list/list.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## atomix/primitive/list/list.proto



<a name="atomix.primitive.list.AppendInput"></a>

### AppendInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.AppendOutput"></a>

### AppendOutput







<a name="atomix.primitive.list.AppendRequest"></a>

### AppendRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [AppendInput](#atomix.primitive.list.AppendInput) |  |  |






<a name="atomix.primitive.list.AppendResponse"></a>

### AppendResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [AppendOutput](#atomix.primitive.list.AppendOutput) |  |  |






<a name="atomix.primitive.list.ClearInput"></a>

### ClearInput







<a name="atomix.primitive.list.ClearOutput"></a>

### ClearOutput







<a name="atomix.primitive.list.ClearRequest"></a>

### ClearRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ClearInput](#atomix.primitive.list.ClearInput) |  |  |






<a name="atomix.primitive.list.ClearResponse"></a>

### ClearResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ClearOutput](#atomix.primitive.list.ClearOutput) |  |  |






<a name="atomix.primitive.list.ContainsInput"></a>

### ContainsInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.ContainsOutput"></a>

### ContainsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contains | [bool](#bool) |  |  |






<a name="atomix.primitive.list.ContainsRequest"></a>

### ContainsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ContainsInput](#atomix.primitive.list.ContainsInput) |  |  |






<a name="atomix.primitive.list.ContainsResponse"></a>

### ContainsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ContainsOutput](#atomix.primitive.list.ContainsOutput) |  |  |






<a name="atomix.primitive.list.ElementsInput"></a>

### ElementsInput







<a name="atomix.primitive.list.ElementsOutput"></a>

### ElementsOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.ElementsRequest"></a>

### ElementsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [ElementsInput](#atomix.primitive.list.ElementsInput) |  |  |






<a name="atomix.primitive.list.ElementsResponse"></a>

### ElementsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [ElementsOutput](#atomix.primitive.list.ElementsOutput) |  |  |






<a name="atomix.primitive.list.EventInput"></a>

### EventInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| replay | [bool](#bool) |  |  |






<a name="atomix.primitive.list.EventOutput"></a>

### EventOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [EventOutput.Type](#atomix.primitive.list.EventOutput.Type) |  |  |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.EventRequest"></a>

### EventRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [EventInput](#atomix.primitive.list.EventInput) |  |  |






<a name="atomix.primitive.list.EventResponse"></a>

### EventResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [EventOutput](#atomix.primitive.list.EventOutput) |  |  |






<a name="atomix.primitive.list.GetInput"></a>

### GetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |






<a name="atomix.primitive.list.GetOutput"></a>

### GetOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.GetRequest"></a>

### GetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [GetInput](#atomix.primitive.list.GetInput) |  |  |






<a name="atomix.primitive.list.GetResponse"></a>

### GetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [GetOutput](#atomix.primitive.list.GetOutput) |  |  |






<a name="atomix.primitive.list.InsertInput"></a>

### InsertInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.InsertOutput"></a>

### InsertOutput







<a name="atomix.primitive.list.InsertRequest"></a>

### InsertRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [InsertInput](#atomix.primitive.list.InsertInput) |  |  |






<a name="atomix.primitive.list.InsertResponse"></a>

### InsertResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [InsertOutput](#atomix.primitive.list.InsertOutput) |  |  |






<a name="atomix.primitive.list.RemoveInput"></a>

### RemoveInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |






<a name="atomix.primitive.list.RemoveOutput"></a>

### RemoveOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.RemoveRequest"></a>

### RemoveRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [RemoveInput](#atomix.primitive.list.RemoveInput) |  |  |






<a name="atomix.primitive.list.RemoveResponse"></a>

### RemoveResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [RemoveOutput](#atomix.primitive.list.RemoveOutput) |  |  |






<a name="atomix.primitive.list.SetInput"></a>

### SetInput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| index | [uint32](#uint32) |  |  |
| value | [string](#string) |  |  |






<a name="atomix.primitive.list.SetOutput"></a>

### SetOutput







<a name="atomix.primitive.list.SetRequest"></a>

### SetRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [SetInput](#atomix.primitive.list.SetInput) |  |  |






<a name="atomix.primitive.list.SetResponse"></a>

### SetResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SetOutput](#atomix.primitive.list.SetOutput) |  |  |






<a name="atomix.primitive.list.SizeInput"></a>

### SizeInput







<a name="atomix.primitive.list.SizeOutput"></a>

### SizeOutput



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| size | [uint32](#uint32) |  |  |






<a name="atomix.primitive.list.SizeRequest"></a>

### SizeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.RequestHeader](#atomix.primitive.RequestHeader) |  |  |
| input | [SizeInput](#atomix.primitive.list.SizeInput) |  |  |






<a name="atomix.primitive.list.SizeResponse"></a>

### SizeResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| header | [atomix.primitive.ResponseHeader](#atomix.primitive.ResponseHeader) |  |  |
| output | [SizeOutput](#atomix.primitive.list.SizeOutput) |  |  |





 


<a name="atomix.primitive.list.EventOutput.Type"></a>

### EventOutput.Type


| Name | Number | Description |
| ---- | ------ | ----------- |
| NONE | 0 |  |
| ADDED | 1 |  |
| REMOVED | 2 |  |


 

 


<a name="atomix.primitive.list.ListService"></a>

### ListService
ListService implements a distributed list

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Size | [SizeRequest](#atomix.primitive.list.SizeRequest) | [SizeResponse](#atomix.primitive.list.SizeResponse) | Size gets the number of elements in the list |
| Contains | [ContainsRequest](#atomix.primitive.list.ContainsRequest) | [ContainsResponse](#atomix.primitive.list.ContainsResponse) | Contains returns whether the list contains a value |
| Append | [AppendRequest](#atomix.primitive.list.AppendRequest) | [AppendResponse](#atomix.primitive.list.AppendResponse) | Append appends a value to the list |
| Insert | [InsertRequest](#atomix.primitive.list.InsertRequest) | [InsertResponse](#atomix.primitive.list.InsertResponse) | Insert inserts a value at a specific index in the list |
| Get | [GetRequest](#atomix.primitive.list.GetRequest) | [GetResponse](#atomix.primitive.list.GetResponse) | Get gets the value at an index in the list |
| Set | [SetRequest](#atomix.primitive.list.SetRequest) | [SetResponse](#atomix.primitive.list.SetResponse) | Set sets the value at an index in the list |
| Remove | [RemoveRequest](#atomix.primitive.list.RemoveRequest) | [RemoveResponse](#atomix.primitive.list.RemoveResponse) | Remove removes an element from the list |
| Clear | [ClearRequest](#atomix.primitive.list.ClearRequest) | [ClearResponse](#atomix.primitive.list.ClearResponse) | Clear removes all elements from the list |
| Events | [EventRequest](#atomix.primitive.list.EventRequest) | [EventResponse](#atomix.primitive.list.EventResponse) stream | Events listens for change events |
| Elements | [ElementsRequest](#atomix.primitive.list.ElementsRequest) | [ElementsResponse](#atomix.primitive.list.ElementsResponse) stream | Elements streams all elements in the list |

 



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

