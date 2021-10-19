//
//Copyright 2020-present Open Networking Foundation.
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.13.0
// source: atomix/primitive/primitive.proto

package primitive

import (
	meta "atomix/primitive/meta"
	context "context"
	_ "github.com/gogo/protobuf/gogoproto"
	descriptor "github.com/golang/protobuf/protoc-gen-go/descriptor"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Deprecated: Do not use.
type RequestHeaders struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PrimitiveId *PrimitiveId    `protobuf:"bytes,1,opt,name=primitive_id,json=primitiveId,proto3" json:"primitive_id,omitempty"`
	ClusterKey  string          `protobuf:"bytes,2,opt,name=cluster_key,json=clusterKey,proto3" json:"cluster_key,omitempty"`
	Timestamp   *meta.Timestamp `protobuf:"bytes,3,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
}

func (x *RequestHeaders) Reset() {
	*x = RequestHeaders{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RequestHeaders) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RequestHeaders) ProtoMessage() {}

func (x *RequestHeaders) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RequestHeaders.ProtoReflect.Descriptor instead.
func (*RequestHeaders) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{0}
}

func (x *RequestHeaders) GetPrimitiveId() *PrimitiveId {
	if x != nil {
		return x.PrimitiveId
	}
	return nil
}

func (x *RequestHeaders) GetClusterKey() string {
	if x != nil {
		return x.ClusterKey
	}
	return ""
}

func (x *RequestHeaders) GetTimestamp() *meta.Timestamp {
	if x != nil {
		return x.Timestamp
	}
	return nil
}

// Deprecated: Do not use.
type ResponseHeaders struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Timestamp *meta.Timestamp `protobuf:"bytes,1,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
}

func (x *ResponseHeaders) Reset() {
	*x = ResponseHeaders{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ResponseHeaders) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResponseHeaders) ProtoMessage() {}

func (x *ResponseHeaders) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResponseHeaders.ProtoReflect.Descriptor instead.
func (*ResponseHeaders) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{1}
}

func (x *ResponseHeaders) GetTimestamp() *meta.Timestamp {
	if x != nil {
		return x.Timestamp
	}
	return nil
}

// Deprecated: Do not use.
type CreateRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Headers *RequestHeaders `protobuf:"bytes,1,opt,name=headers,proto3" json:"headers,omitempty"`
}

func (x *CreateRequest) Reset() {
	*x = CreateRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateRequest) ProtoMessage() {}

func (x *CreateRequest) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateRequest.ProtoReflect.Descriptor instead.
func (*CreateRequest) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{2}
}

func (x *CreateRequest) GetHeaders() *RequestHeaders {
	if x != nil {
		return x.Headers
	}
	return nil
}

// Deprecated: Do not use.
type CreateResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Headers *ResponseHeaders `protobuf:"bytes,1,opt,name=headers,proto3" json:"headers,omitempty"`
}

func (x *CreateResponse) Reset() {
	*x = CreateResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateResponse) ProtoMessage() {}

func (x *CreateResponse) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateResponse.ProtoReflect.Descriptor instead.
func (*CreateResponse) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{3}
}

func (x *CreateResponse) GetHeaders() *ResponseHeaders {
	if x != nil {
		return x.Headers
	}
	return nil
}

// Deprecated: Do not use.
type CloseRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Headers *RequestHeaders `protobuf:"bytes,1,opt,name=headers,proto3" json:"headers,omitempty"`
}

func (x *CloseRequest) Reset() {
	*x = CloseRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CloseRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CloseRequest) ProtoMessage() {}

func (x *CloseRequest) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CloseRequest.ProtoReflect.Descriptor instead.
func (*CloseRequest) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{4}
}

func (x *CloseRequest) GetHeaders() *RequestHeaders {
	if x != nil {
		return x.Headers
	}
	return nil
}

// Deprecated: Do not use.
type CloseResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Headers *ResponseHeaders `protobuf:"bytes,1,opt,name=headers,proto3" json:"headers,omitempty"`
}

func (x *CloseResponse) Reset() {
	*x = CloseResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CloseResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CloseResponse) ProtoMessage() {}

func (x *CloseResponse) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CloseResponse.ProtoReflect.Descriptor instead.
func (*CloseResponse) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{5}
}

func (x *CloseResponse) GetHeaders() *ResponseHeaders {
	if x != nil {
		return x.Headers
	}
	return nil
}

// Deprecated: Do not use.
type DeleteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Headers *RequestHeaders `protobuf:"bytes,1,opt,name=headers,proto3" json:"headers,omitempty"`
}

func (x *DeleteRequest) Reset() {
	*x = DeleteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteRequest) ProtoMessage() {}

func (x *DeleteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteRequest.ProtoReflect.Descriptor instead.
func (*DeleteRequest) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{6}
}

func (x *DeleteRequest) GetHeaders() *RequestHeaders {
	if x != nil {
		return x.Headers
	}
	return nil
}

// Deprecated: Do not use.
type DeleteResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Headers *ResponseHeaders `protobuf:"bytes,1,opt,name=headers,proto3" json:"headers,omitempty"`
}

func (x *DeleteResponse) Reset() {
	*x = DeleteResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteResponse) ProtoMessage() {}

func (x *DeleteResponse) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteResponse.ProtoReflect.Descriptor instead.
func (*DeleteResponse) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{7}
}

func (x *DeleteResponse) GetHeaders() *ResponseHeaders {
	if x != nil {
		return x.Headers
	}
	return nil
}

// Deprecated: Do not use.
type PrimitiveId struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Namespace string `protobuf:"bytes,1,opt,name=namespace,proto3" json:"namespace,omitempty"`
	Name      string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
	Type      string `protobuf:"bytes,3,opt,name=type,proto3" json:"type,omitempty"`
}

func (x *PrimitiveId) Reset() {
	*x = PrimitiveId{}
	if protoimpl.UnsafeEnabled {
		mi := &file_atomix_primitive_primitive_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PrimitiveId) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PrimitiveId) ProtoMessage() {}

func (x *PrimitiveId) ProtoReflect() protoreflect.Message {
	mi := &file_atomix_primitive_primitive_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PrimitiveId.ProtoReflect.Descriptor instead.
func (*PrimitiveId) Descriptor() ([]byte, []int) {
	return file_atomix_primitive_primitive_proto_rawDescGZIP(), []int{8}
}

func (x *PrimitiveId) GetNamespace() string {
	if x != nil {
		return x.Namespace
	}
	return ""
}

func (x *PrimitiveId) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *PrimitiveId) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

var file_atomix_primitive_primitive_proto_extTypes = []protoimpl.ExtensionInfo{
	{
		ExtendedType:  (*descriptor.ServiceOptions)(nil),
		ExtensionType: (*string)(nil),
		Field:         50000,
		Name:          "atomix.primitive.type",
		Tag:           "bytes,50000,opt,name=type",
		Filename:      "atomix/primitive/primitive.proto",
	},
	{
		ExtendedType:  (*descriptor.ServiceOptions)(nil),
		ExtensionType: (*bool)(nil),
		Field:         50001,
		Name:          "atomix.primitive.partitioned",
		Tag:           "varint,50001,opt,name=partitioned",
		Filename:      "atomix/primitive/primitive.proto",
	},
}

// Extension fields to descriptor.ServiceOptions.
var (
	// optional string type = 50000;
	E_Type = &file_atomix_primitive_primitive_proto_extTypes[0]
	// optional bool partitioned = 50001;
	E_Partitioned = &file_atomix_primitive_primitive_proto_extTypes[1]
)

var File_atomix_primitive_primitive_proto protoreflect.FileDescriptor

var file_atomix_primitive_primitive_proto_rawDesc = []byte{
	0x0a, 0x20, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2f, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69,
	0x76, 0x65, 0x2f, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x10, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69,
	0x74, 0x69, 0x76, 0x65, 0x1a, 0x25, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2f, 0x70, 0x72, 0x69,
	0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2f, 0x6d, 0x65, 0x74, 0x61, 0x2f, 0x74, 0x69, 0x6d, 0x65,
	0x73, 0x74, 0x61, 0x6d, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x14, 0x67, 0x6f, 0x67,
	0x6f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x67, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x20, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2f, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0xcc, 0x01, 0x0a, 0x0e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x48,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x12, 0x55, 0x0a, 0x0c, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74,
	0x69, 0x76, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x61,
	0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e,
	0x50, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x49, 0x64, 0x42, 0x13, 0xe2, 0xde, 0x1f,
	0x0b, 0x50, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x49, 0x44, 0xc8, 0xde, 0x1f, 0x00,
	0x52, 0x0b, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x49, 0x64, 0x12, 0x1f, 0x0a,
	0x0b, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f, 0x6b, 0x65, 0x79, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0a, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x4b, 0x65, 0x79, 0x12, 0x3e,
	0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x20, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69,
	0x74, 0x69, 0x76, 0x65, 0x2e, 0x6d, 0x65, 0x74, 0x61, 0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74,
	0x61, 0x6d, 0x70, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x3a, 0x02,
	0x18, 0x01, 0x22, 0x55, 0x0a, 0x0f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x48, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x73, 0x12, 0x3e, 0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61,
	0x6d, 0x70, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69,
	0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x6d, 0x65, 0x74, 0x61,
	0x2e, 0x54, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65,
	0x73, 0x74, 0x61, 0x6d, 0x70, 0x3a, 0x02, 0x18, 0x01, 0x22, 0x55, 0x0a, 0x0d, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x40, 0x0a, 0x07, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x61, 0x74,
	0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x42, 0x04, 0xc8,
	0xde, 0x1f, 0x00, 0x52, 0x07, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x3a, 0x02, 0x18, 0x01,
	0x22, 0x57, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x41, 0x0a, 0x07, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69,
	0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x48,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x42, 0x04, 0xc8, 0xde, 0x1f, 0x00, 0x52, 0x07, 0x68, 0x65,
	0x61, 0x64, 0x65, 0x72, 0x73, 0x3a, 0x02, 0x18, 0x01, 0x22, 0x54, 0x0a, 0x0c, 0x43, 0x6c, 0x6f,
	0x73, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x40, 0x0a, 0x07, 0x68, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x61, 0x74, 0x6f,
	0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x42, 0x04, 0xc8, 0xde,
	0x1f, 0x00, 0x52, 0x07, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x3a, 0x02, 0x18, 0x01, 0x22,
	0x56, 0x0a, 0x0d, 0x43, 0x6c, 0x6f, 0x73, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x41, 0x0a, 0x07, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x21, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69,
	0x74, 0x69, 0x76, 0x65, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x48, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x73, 0x42, 0x04, 0xc8, 0xde, 0x1f, 0x00, 0x52, 0x07, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x73, 0x3a, 0x02, 0x18, 0x01, 0x22, 0x55, 0x0a, 0x0d, 0x44, 0x65, 0x6c, 0x65, 0x74,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x40, 0x0a, 0x07, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x61, 0x74, 0x6f, 0x6d,
	0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x42, 0x04, 0xc8, 0xde, 0x1f,
	0x00, 0x52, 0x07, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x3a, 0x02, 0x18, 0x01, 0x22, 0x57,
	0x0a, 0x0e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x41, 0x0a, 0x07, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x21, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69,
	0x74, 0x69, 0x76, 0x65, 0x2e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x48, 0x65, 0x61,
	0x64, 0x65, 0x72, 0x73, 0x42, 0x04, 0xc8, 0xde, 0x1f, 0x00, 0x52, 0x07, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x73, 0x3a, 0x02, 0x18, 0x01, 0x22, 0x57, 0x0a, 0x0b, 0x50, 0x72, 0x69, 0x6d, 0x69,
	0x74, 0x69, 0x76, 0x65, 0x49, 0x64, 0x12, 0x1c, 0x0a, 0x09, 0x6e, 0x61, 0x6d, 0x65, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x6e, 0x61, 0x6d, 0x65, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x3a, 0x02, 0x18, 0x01,
	0x32, 0xf4, 0x01, 0x0a, 0x09, 0x50, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x12, 0x4b,
	0x0a, 0x06, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x12, 0x1f, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69,
	0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x20, 0x2e, 0x61, 0x74, 0x6f, 0x6d,
	0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x48, 0x0a, 0x05, 0x43,
	0x6c, 0x6f, 0x73, 0x65, 0x12, 0x1e, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72,
	0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x73, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x1f, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72,
	0x69, 0x6d, 0x69, 0x74, 0x69, 0x76, 0x65, 0x2e, 0x43, 0x6c, 0x6f, 0x73, 0x65, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x4b, 0x0a, 0x06, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x12,
	0x1f, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74, 0x69,
	0x76, 0x65, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x20, 0x2e, 0x61, 0x74, 0x6f, 0x6d, 0x69, 0x78, 0x2e, 0x70, 0x72, 0x69, 0x6d, 0x69, 0x74,
	0x69, 0x76, 0x65, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x1a, 0x03, 0x88, 0x02, 0x01, 0x3a, 0x35, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12,
	0x1f, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x18, 0xd0, 0x86, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x3a, 0x43,
	0x0a, 0x0b, 0x70, 0x61, 0x72, 0x74, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x65, 0x64, 0x12, 0x1f, 0x2e,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x4f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0xd1,
	0x86, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0b, 0x70, 0x61, 0x72, 0x74, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x65, 0x64, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_atomix_primitive_primitive_proto_rawDescOnce sync.Once
	file_atomix_primitive_primitive_proto_rawDescData = file_atomix_primitive_primitive_proto_rawDesc
)

func file_atomix_primitive_primitive_proto_rawDescGZIP() []byte {
	file_atomix_primitive_primitive_proto_rawDescOnce.Do(func() {
		file_atomix_primitive_primitive_proto_rawDescData = protoimpl.X.CompressGZIP(file_atomix_primitive_primitive_proto_rawDescData)
	})
	return file_atomix_primitive_primitive_proto_rawDescData
}

var file_atomix_primitive_primitive_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_atomix_primitive_primitive_proto_goTypes = []interface{}{
	(*RequestHeaders)(nil),            // 0: atomix.primitive.RequestHeaders
	(*ResponseHeaders)(nil),           // 1: atomix.primitive.ResponseHeaders
	(*CreateRequest)(nil),             // 2: atomix.primitive.CreateRequest
	(*CreateResponse)(nil),            // 3: atomix.primitive.CreateResponse
	(*CloseRequest)(nil),              // 4: atomix.primitive.CloseRequest
	(*CloseResponse)(nil),             // 5: atomix.primitive.CloseResponse
	(*DeleteRequest)(nil),             // 6: atomix.primitive.DeleteRequest
	(*DeleteResponse)(nil),            // 7: atomix.primitive.DeleteResponse
	(*PrimitiveId)(nil),               // 8: atomix.primitive.PrimitiveId
	(*meta.Timestamp)(nil),            // 9: atomix.primitive.meta.Timestamp
	(*descriptor.ServiceOptions)(nil), // 10: google.protobuf.ServiceOptions
}
var file_atomix_primitive_primitive_proto_depIdxs = []int32{
	8,  // 0: atomix.primitive.RequestHeaders.primitive_id:type_name -> atomix.primitive.PrimitiveId
	9,  // 1: atomix.primitive.RequestHeaders.timestamp:type_name -> atomix.primitive.meta.Timestamp
	9,  // 2: atomix.primitive.ResponseHeaders.timestamp:type_name -> atomix.primitive.meta.Timestamp
	0,  // 3: atomix.primitive.CreateRequest.headers:type_name -> atomix.primitive.RequestHeaders
	1,  // 4: atomix.primitive.CreateResponse.headers:type_name -> atomix.primitive.ResponseHeaders
	0,  // 5: atomix.primitive.CloseRequest.headers:type_name -> atomix.primitive.RequestHeaders
	1,  // 6: atomix.primitive.CloseResponse.headers:type_name -> atomix.primitive.ResponseHeaders
	0,  // 7: atomix.primitive.DeleteRequest.headers:type_name -> atomix.primitive.RequestHeaders
	1,  // 8: atomix.primitive.DeleteResponse.headers:type_name -> atomix.primitive.ResponseHeaders
	10, // 9: atomix.primitive.type:extendee -> google.protobuf.ServiceOptions
	10, // 10: atomix.primitive.partitioned:extendee -> google.protobuf.ServiceOptions
	2,  // 11: atomix.primitive.Primitive.Create:input_type -> atomix.primitive.CreateRequest
	4,  // 12: atomix.primitive.Primitive.Close:input_type -> atomix.primitive.CloseRequest
	6,  // 13: atomix.primitive.Primitive.Delete:input_type -> atomix.primitive.DeleteRequest
	3,  // 14: atomix.primitive.Primitive.Create:output_type -> atomix.primitive.CreateResponse
	5,  // 15: atomix.primitive.Primitive.Close:output_type -> atomix.primitive.CloseResponse
	7,  // 16: atomix.primitive.Primitive.Delete:output_type -> atomix.primitive.DeleteResponse
	14, // [14:17] is the sub-list for method output_type
	11, // [11:14] is the sub-list for method input_type
	11, // [11:11] is the sub-list for extension type_name
	9,  // [9:11] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_atomix_primitive_primitive_proto_init() }
func file_atomix_primitive_primitive_proto_init() {
	if File_atomix_primitive_primitive_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_atomix_primitive_primitive_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RequestHeaders); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ResponseHeaders); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CloseRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CloseResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_atomix_primitive_primitive_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PrimitiveId); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_atomix_primitive_primitive_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 2,
			NumServices:   1,
		},
		GoTypes:           file_atomix_primitive_primitive_proto_goTypes,
		DependencyIndexes: file_atomix_primitive_primitive_proto_depIdxs,
		MessageInfos:      file_atomix_primitive_primitive_proto_msgTypes,
		ExtensionInfos:    file_atomix_primitive_primitive_proto_extTypes,
	}.Build()
	File_atomix_primitive_primitive_proto = out.File
	file_atomix_primitive_primitive_proto_rawDesc = nil
	file_atomix_primitive_primitive_proto_goTypes = nil
	file_atomix_primitive_primitive_proto_depIdxs = nil
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// PrimitiveClient is the client API for Primitive service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
//
// Deprecated: Do not use.
type PrimitiveClient interface {
	// Create creates a primitive
	Create(ctx context.Context, in *CreateRequest, opts ...grpc.CallOption) (*CreateResponse, error)
	// Close closes a primitive
	Close(ctx context.Context, in *CloseRequest, opts ...grpc.CallOption) (*CloseResponse, error)
	// Delete deletes a primitive
	Delete(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*DeleteResponse, error)
}

type primitiveClient struct {
	cc grpc.ClientConnInterface
}

// Deprecated: Do not use.
func NewPrimitiveClient(cc grpc.ClientConnInterface) PrimitiveClient {
	return &primitiveClient{cc}
}

func (c *primitiveClient) Create(ctx context.Context, in *CreateRequest, opts ...grpc.CallOption) (*CreateResponse, error) {
	out := new(CreateResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.Primitive/Create", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *primitiveClient) Close(ctx context.Context, in *CloseRequest, opts ...grpc.CallOption) (*CloseResponse, error) {
	out := new(CloseResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.Primitive/Close", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *primitiveClient) Delete(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*DeleteResponse, error) {
	out := new(DeleteResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.Primitive/Delete", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// PrimitiveServer is the server API for Primitive service.
//
// Deprecated: Do not use.
type PrimitiveServer interface {
	// Create creates a primitive
	Create(context.Context, *CreateRequest) (*CreateResponse, error)
	// Close closes a primitive
	Close(context.Context, *CloseRequest) (*CloseResponse, error)
	// Delete deletes a primitive
	Delete(context.Context, *DeleteRequest) (*DeleteResponse, error)
}

// UnimplementedPrimitiveServer can be embedded to have forward compatible implementations.
type UnimplementedPrimitiveServer struct {
}

func (*UnimplementedPrimitiveServer) Create(context.Context, *CreateRequest) (*CreateResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Create not implemented")
}
func (*UnimplementedPrimitiveServer) Close(context.Context, *CloseRequest) (*CloseResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Close not implemented")
}
func (*UnimplementedPrimitiveServer) Delete(context.Context, *DeleteRequest) (*DeleteResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Delete not implemented")
}

// Deprecated: Do not use.
func RegisterPrimitiveServer(s *grpc.Server, srv PrimitiveServer) {
	s.RegisterService(&_Primitive_serviceDesc, srv)
}

func _Primitive_Create_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PrimitiveServer).Create(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.Primitive/Create",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PrimitiveServer).Create(ctx, req.(*CreateRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Primitive_Close_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CloseRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PrimitiveServer).Close(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.Primitive/Close",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PrimitiveServer).Close(ctx, req.(*CloseRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Primitive_Delete_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PrimitiveServer).Delete(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.Primitive/Delete",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PrimitiveServer).Delete(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Primitive_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.primitive.Primitive",
	HandlerType: (*PrimitiveServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Create",
			Handler:    _Primitive_Create_Handler,
		},
		{
			MethodName: "Close",
			Handler:    _Primitive_Close_Handler,
		},
		{
			MethodName: "Delete",
			Handler:    _Primitive_Delete_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "atomix/primitive/primitive.proto",
}
