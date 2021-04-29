// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/management/driver/agent.proto

package driver

import (
	context "context"
	fmt "fmt"
	primitive "github.com/atomix/atomix-api/go/atomix/primitive"
	_ "github.com/gogo/protobuf/gogoproto"
	proto "github.com/gogo/protobuf/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	io "io"
	math "math"
	math_bits "math/bits"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.GoGoProtoPackageIsVersion3 // please upgrade the proto package

type ProxyId struct {
	primitive.PrimitiveId `protobuf:"bytes,1,opt,name=primitive_id,json=primitiveId,proto3,embedded=primitive_id" json:"primitive_id"`
}

func (m *ProxyId) Reset()         { *m = ProxyId{} }
func (m *ProxyId) String() string { return proto.CompactTextString(m) }
func (*ProxyId) ProtoMessage()    {}
func (*ProxyId) Descriptor() ([]byte, []int) {
	return fileDescriptor_f16d71f7899ca8d9, []int{0}
}
func (m *ProxyId) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *ProxyId) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_ProxyId.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *ProxyId) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ProxyId.Merge(m, src)
}
func (m *ProxyId) XXX_Size() int {
	return m.Size()
}
func (m *ProxyId) XXX_DiscardUnknown() {
	xxx_messageInfo_ProxyId.DiscardUnknown(m)
}

var xxx_messageInfo_ProxyId proto.InternalMessageInfo

type ProxyOptions struct {
	Read  bool `protobuf:"varint,1,opt,name=read,proto3" json:"read,omitempty"`
	Write bool `protobuf:"varint,2,opt,name=write,proto3" json:"write,omitempty"`
}

func (m *ProxyOptions) Reset()         { *m = ProxyOptions{} }
func (m *ProxyOptions) String() string { return proto.CompactTextString(m) }
func (*ProxyOptions) ProtoMessage()    {}
func (*ProxyOptions) Descriptor() ([]byte, []int) {
	return fileDescriptor_f16d71f7899ca8d9, []int{1}
}
func (m *ProxyOptions) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *ProxyOptions) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_ProxyOptions.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *ProxyOptions) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ProxyOptions.Merge(m, src)
}
func (m *ProxyOptions) XXX_Size() int {
	return m.Size()
}
func (m *ProxyOptions) XXX_DiscardUnknown() {
	xxx_messageInfo_ProxyOptions.DiscardUnknown(m)
}

var xxx_messageInfo_ProxyOptions proto.InternalMessageInfo

func (m *ProxyOptions) GetRead() bool {
	if m != nil {
		return m.Read
	}
	return false
}

func (m *ProxyOptions) GetWrite() bool {
	if m != nil {
		return m.Write
	}
	return false
}

type CreateProxyRequest struct {
	ProxyID ProxyId      `protobuf:"bytes,1,opt,name=proxy_id,json=proxyId,proto3" json:"proxy_id"`
	Options ProxyOptions `protobuf:"bytes,2,opt,name=options,proto3" json:"options"`
}

func (m *CreateProxyRequest) Reset()         { *m = CreateProxyRequest{} }
func (m *CreateProxyRequest) String() string { return proto.CompactTextString(m) }
func (*CreateProxyRequest) ProtoMessage()    {}
func (*CreateProxyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_f16d71f7899ca8d9, []int{2}
}
func (m *CreateProxyRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *CreateProxyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_CreateProxyRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *CreateProxyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateProxyRequest.Merge(m, src)
}
func (m *CreateProxyRequest) XXX_Size() int {
	return m.Size()
}
func (m *CreateProxyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateProxyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateProxyRequest proto.InternalMessageInfo

func (m *CreateProxyRequest) GetProxyID() ProxyId {
	if m != nil {
		return m.ProxyID
	}
	return ProxyId{}
}

func (m *CreateProxyRequest) GetOptions() ProxyOptions {
	if m != nil {
		return m.Options
	}
	return ProxyOptions{}
}

type CreateProxyResponse struct {
}

func (m *CreateProxyResponse) Reset()         { *m = CreateProxyResponse{} }
func (m *CreateProxyResponse) String() string { return proto.CompactTextString(m) }
func (*CreateProxyResponse) ProtoMessage()    {}
func (*CreateProxyResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_f16d71f7899ca8d9, []int{3}
}
func (m *CreateProxyResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *CreateProxyResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_CreateProxyResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *CreateProxyResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateProxyResponse.Merge(m, src)
}
func (m *CreateProxyResponse) XXX_Size() int {
	return m.Size()
}
func (m *CreateProxyResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateProxyResponse.DiscardUnknown(m)
}

var xxx_messageInfo_CreateProxyResponse proto.InternalMessageInfo

type DestroyProxyRequest struct {
	ProxyID ProxyId `protobuf:"bytes,1,opt,name=proxy_id,json=proxyId,proto3" json:"proxy_id"`
}

func (m *DestroyProxyRequest) Reset()         { *m = DestroyProxyRequest{} }
func (m *DestroyProxyRequest) String() string { return proto.CompactTextString(m) }
func (*DestroyProxyRequest) ProtoMessage()    {}
func (*DestroyProxyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_f16d71f7899ca8d9, []int{4}
}
func (m *DestroyProxyRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *DestroyProxyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_DestroyProxyRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *DestroyProxyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DestroyProxyRequest.Merge(m, src)
}
func (m *DestroyProxyRequest) XXX_Size() int {
	return m.Size()
}
func (m *DestroyProxyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DestroyProxyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DestroyProxyRequest proto.InternalMessageInfo

func (m *DestroyProxyRequest) GetProxyID() ProxyId {
	if m != nil {
		return m.ProxyID
	}
	return ProxyId{}
}

type DestroyProxyResponse struct {
}

func (m *DestroyProxyResponse) Reset()         { *m = DestroyProxyResponse{} }
func (m *DestroyProxyResponse) String() string { return proto.CompactTextString(m) }
func (*DestroyProxyResponse) ProtoMessage()    {}
func (*DestroyProxyResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_f16d71f7899ca8d9, []int{5}
}
func (m *DestroyProxyResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *DestroyProxyResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_DestroyProxyResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *DestroyProxyResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DestroyProxyResponse.Merge(m, src)
}
func (m *DestroyProxyResponse) XXX_Size() int {
	return m.Size()
}
func (m *DestroyProxyResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_DestroyProxyResponse.DiscardUnknown(m)
}

var xxx_messageInfo_DestroyProxyResponse proto.InternalMessageInfo

func init() {
	proto.RegisterType((*ProxyId)(nil), "atomix.management.driver.ProxyId")
	proto.RegisterType((*ProxyOptions)(nil), "atomix.management.driver.ProxyOptions")
	proto.RegisterType((*CreateProxyRequest)(nil), "atomix.management.driver.CreateProxyRequest")
	proto.RegisterType((*CreateProxyResponse)(nil), "atomix.management.driver.CreateProxyResponse")
	proto.RegisterType((*DestroyProxyRequest)(nil), "atomix.management.driver.DestroyProxyRequest")
	proto.RegisterType((*DestroyProxyResponse)(nil), "atomix.management.driver.DestroyProxyResponse")
}

func init() {
	proto.RegisterFile("atomix/management/driver/agent.proto", fileDescriptor_f16d71f7899ca8d9)
}

var fileDescriptor_f16d71f7899ca8d9 = []byte{
	// 373 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xb4, 0x52, 0xcf, 0x4a, 0xc3, 0x30,
	0x18, 0x6f, 0x64, 0x73, 0xe3, 0xeb, 0x40, 0xc8, 0xa6, 0x94, 0x82, 0xdd, 0x2c, 0x22, 0x1e, 0xb4,
	0x85, 0x79, 0xf1, 0x6a, 0x1d, 0xc2, 0x04, 0x71, 0x14, 0x3c, 0x4b, 0xa5, 0xa1, 0x44, 0x68, 0x53,
	0xd3, 0x38, 0xb7, 0xb7, 0xf0, 0x3d, 0x7c, 0x91, 0x1d, 0x77, 0xf4, 0x34, 0xa4, 0x7b, 0x11, 0x69,
	0xd3, 0xd9, 0x0d, 0x9d, 0xee, 0xe2, 0xed, 0xcb, 0xc7, 0xef, 0xef, 0x47, 0xe0, 0xd0, 0x13, 0x2c,
	0xa4, 0x23, 0x3b, 0xf4, 0x22, 0x2f, 0x20, 0x21, 0x89, 0x84, 0xed, 0x73, 0x3a, 0x24, 0xdc, 0xf6,
	0x02, 0x12, 0x09, 0x2b, 0xe6, 0x4c, 0x30, 0xac, 0x49, 0x94, 0x55, 0xa2, 0x2c, 0x89, 0xd2, 0x3b,
	0x05, 0x3f, 0xe6, 0x34, 0xa4, 0x82, 0x0e, 0x49, 0x39, 0x49, 0xae, 0xde, 0x0a, 0x58, 0xc0, 0xf2,
	0xd1, 0xce, 0x26, 0xb9, 0x35, 0xef, 0xa0, 0x36, 0xe0, 0x6c, 0x34, 0xee, 0xfb, 0xf8, 0x1a, 0x1a,
	0x5f, 0x9c, 0x7b, 0xea, 0x6b, 0xa8, 0x83, 0x8e, 0xd5, 0xee, 0xbe, 0x55, 0x78, 0x96, 0x7a, 0x83,
	0xc5, 0xd4, 0xf7, 0x9d, 0xfa, 0x64, 0xd6, 0x56, 0xa6, 0xb3, 0x36, 0x72, 0xd5, 0xb8, 0x5c, 0x9b,
	0xe7, 0xd0, 0xc8, 0x65, 0x6f, 0x63, 0x41, 0x59, 0x94, 0x60, 0x0c, 0x15, 0x4e, 0x3c, 0xa9, 0x59,
	0x77, 0xf3, 0x19, 0xb7, 0xa0, 0xfa, 0xc2, 0xa9, 0x20, 0xda, 0x56, 0xbe, 0x94, 0x0f, 0xf3, 0x0d,
	0x01, 0xbe, 0xe4, 0xc4, 0x13, 0x24, 0x17, 0x70, 0xc9, 0xd3, 0x33, 0x49, 0x04, 0xbe, 0x81, 0x7a,
	0x9c, 0xbd, 0xcb, 0x60, 0x07, 0xd6, 0xba, 0x63, 0x58, 0x45, 0x23, 0x67, 0x27, 0x0b, 0x97, 0xce,
	0xda, 0x45, 0xc5, 0x9e, 0x5b, 0x8b, 0x8b, 0xae, 0x57, 0x50, 0x63, 0x32, 0x5a, 0xee, 0xae, 0x76,
	0x8f, 0xfe, 0x50, 0x2b, 0x8a, 0x38, 0x95, 0x4c, 0xd2, 0x5d, 0x90, 0xcd, 0x5d, 0x68, 0xae, 0x84,
	0x4d, 0x62, 0x16, 0x25, 0xc4, 0xf4, 0xa1, 0xd9, 0x23, 0x89, 0xe0, 0x6c, 0xfc, 0x8f, 0x25, 0xcc,
	0x3d, 0x68, 0xad, 0xba, 0x48, 0xf7, 0x6e, 0x8a, 0xa0, 0x7a, 0x91, 0xfd, 0x1a, 0xfc, 0x08, 0xea,
	0x52, 0x3c, 0x7c, 0xb2, 0xde, 0xed, 0xfb, 0xc9, 0xf5, 0xd3, 0x0d, 0xd1, 0xd2, 0x15, 0x87, 0xd0,
	0x58, 0x4e, 0x83, 0x7f, 0xa1, 0xff, 0x70, 0x1b, 0xdd, 0xda, 0x14, 0x2e, 0xed, 0x1c, 0x6d, 0x92,
	0x1a, 0x68, 0x9a, 0x1a, 0xe8, 0x23, 0x35, 0xd0, 0xeb, 0xdc, 0x50, 0xa6, 0x73, 0x43, 0x79, 0x9f,
	0x1b, 0xca, 0xc3, 0x76, 0xfe, 0xb3, 0xcf, 0x3e, 0x03, 0x00, 0x00, 0xff, 0xff, 0x3f, 0x95, 0x00,
	0x22, 0x53, 0x03, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// AgentClient is the client API for Agent service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type AgentClient interface {
	CreateProxy(ctx context.Context, in *CreateProxyRequest, opts ...grpc.CallOption) (*CreateProxyResponse, error)
	DestroyProxy(ctx context.Context, in *DestroyProxyRequest, opts ...grpc.CallOption) (*DestroyProxyResponse, error)
}

type agentClient struct {
	cc *grpc.ClientConn
}

func NewAgentClient(cc *grpc.ClientConn) AgentClient {
	return &agentClient{cc}
}

func (c *agentClient) CreateProxy(ctx context.Context, in *CreateProxyRequest, opts ...grpc.CallOption) (*CreateProxyResponse, error) {
	out := new(CreateProxyResponse)
	err := c.cc.Invoke(ctx, "/atomix.management.driver.Agent/CreateProxy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *agentClient) DestroyProxy(ctx context.Context, in *DestroyProxyRequest, opts ...grpc.CallOption) (*DestroyProxyResponse, error) {
	out := new(DestroyProxyResponse)
	err := c.cc.Invoke(ctx, "/atomix.management.driver.Agent/DestroyProxy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AgentServer is the server API for Agent service.
type AgentServer interface {
	CreateProxy(context.Context, *CreateProxyRequest) (*CreateProxyResponse, error)
	DestroyProxy(context.Context, *DestroyProxyRequest) (*DestroyProxyResponse, error)
}

// UnimplementedAgentServer can be embedded to have forward compatible implementations.
type UnimplementedAgentServer struct {
}

func (*UnimplementedAgentServer) CreateProxy(ctx context.Context, req *CreateProxyRequest) (*CreateProxyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateProxy not implemented")
}
func (*UnimplementedAgentServer) DestroyProxy(ctx context.Context, req *DestroyProxyRequest) (*DestroyProxyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DestroyProxy not implemented")
}

func RegisterAgentServer(s *grpc.Server, srv AgentServer) {
	s.RegisterService(&_Agent_serviceDesc, srv)
}

func _Agent_CreateProxy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateProxyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AgentServer).CreateProxy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.management.driver.Agent/CreateProxy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AgentServer).CreateProxy(ctx, req.(*CreateProxyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Agent_DestroyProxy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DestroyProxyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AgentServer).DestroyProxy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.management.driver.Agent/DestroyProxy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AgentServer).DestroyProxy(ctx, req.(*DestroyProxyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Agent_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.management.driver.Agent",
	HandlerType: (*AgentServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateProxy",
			Handler:    _Agent_CreateProxy_Handler,
		},
		{
			MethodName: "DestroyProxy",
			Handler:    _Agent_DestroyProxy_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "atomix/management/driver/agent.proto",
}

func (m *ProxyId) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *ProxyId) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *ProxyId) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	{
		size, err := m.PrimitiveId.MarshalToSizedBuffer(dAtA[:i])
		if err != nil {
			return 0, err
		}
		i -= size
		i = encodeVarintAgent(dAtA, i, uint64(size))
	}
	i--
	dAtA[i] = 0xa
	return len(dAtA) - i, nil
}

func (m *ProxyOptions) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *ProxyOptions) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *ProxyOptions) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.Write {
		i--
		if m.Write {
			dAtA[i] = 1
		} else {
			dAtA[i] = 0
		}
		i--
		dAtA[i] = 0x10
	}
	if m.Read {
		i--
		if m.Read {
			dAtA[i] = 1
		} else {
			dAtA[i] = 0
		}
		i--
		dAtA[i] = 0x8
	}
	return len(dAtA) - i, nil
}

func (m *CreateProxyRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *CreateProxyRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *CreateProxyRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	{
		size, err := m.Options.MarshalToSizedBuffer(dAtA[:i])
		if err != nil {
			return 0, err
		}
		i -= size
		i = encodeVarintAgent(dAtA, i, uint64(size))
	}
	i--
	dAtA[i] = 0x12
	{
		size, err := m.ProxyID.MarshalToSizedBuffer(dAtA[:i])
		if err != nil {
			return 0, err
		}
		i -= size
		i = encodeVarintAgent(dAtA, i, uint64(size))
	}
	i--
	dAtA[i] = 0xa
	return len(dAtA) - i, nil
}

func (m *CreateProxyResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *CreateProxyResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *CreateProxyResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	return len(dAtA) - i, nil
}

func (m *DestroyProxyRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *DestroyProxyRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *DestroyProxyRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	{
		size, err := m.ProxyID.MarshalToSizedBuffer(dAtA[:i])
		if err != nil {
			return 0, err
		}
		i -= size
		i = encodeVarintAgent(dAtA, i, uint64(size))
	}
	i--
	dAtA[i] = 0xa
	return len(dAtA) - i, nil
}

func (m *DestroyProxyResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *DestroyProxyResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *DestroyProxyResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	return len(dAtA) - i, nil
}

func encodeVarintAgent(dAtA []byte, offset int, v uint64) int {
	offset -= sovAgent(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *ProxyId) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = m.PrimitiveId.Size()
	n += 1 + l + sovAgent(uint64(l))
	return n
}

func (m *ProxyOptions) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.Read {
		n += 2
	}
	if m.Write {
		n += 2
	}
	return n
}

func (m *CreateProxyRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = m.ProxyID.Size()
	n += 1 + l + sovAgent(uint64(l))
	l = m.Options.Size()
	n += 1 + l + sovAgent(uint64(l))
	return n
}

func (m *CreateProxyResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	return n
}

func (m *DestroyProxyRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = m.ProxyID.Size()
	n += 1 + l + sovAgent(uint64(l))
	return n
}

func (m *DestroyProxyResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	return n
}

func sovAgent(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozAgent(x uint64) (n int) {
	return sovAgent(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *ProxyId) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: ProxyId: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: ProxyId: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field PrimitiveId", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				msglen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if msglen < 0 {
				return ErrInvalidLengthAgent
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthAgent
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if err := m.PrimitiveId.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipAgent(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *ProxyOptions) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: ProxyOptions: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: ProxyOptions: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field Read", wireType)
			}
			var v int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				v |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			m.Read = bool(v != 0)
		case 2:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field Write", wireType)
			}
			var v int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				v |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			m.Write = bool(v != 0)
		default:
			iNdEx = preIndex
			skippy, err := skipAgent(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *CreateProxyRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: CreateProxyRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: CreateProxyRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field ProxyID", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				msglen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if msglen < 0 {
				return ErrInvalidLengthAgent
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthAgent
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if err := m.ProxyID.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Options", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				msglen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if msglen < 0 {
				return ErrInvalidLengthAgent
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthAgent
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if err := m.Options.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipAgent(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *CreateProxyResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: CreateProxyResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: CreateProxyResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipAgent(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *DestroyProxyRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: DestroyProxyRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: DestroyProxyRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field ProxyID", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				msglen |= int(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if msglen < 0 {
				return ErrInvalidLengthAgent
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthAgent
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if err := m.ProxyID.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipAgent(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func (m *DestroyProxyResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= uint64(b&0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		fieldNum := int32(wire >> 3)
		wireType := int(wire & 0x7)
		if wireType == 4 {
			return fmt.Errorf("proto: DestroyProxyResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: DestroyProxyResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipAgent(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthAgent
			}
			if (iNdEx + skippy) > l {
				return io.ErrUnexpectedEOF
			}
			iNdEx += skippy
		}
	}

	if iNdEx > l {
		return io.ErrUnexpectedEOF
	}
	return nil
}
func skipAgent(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowAgent
			}
			if iNdEx >= l {
				return 0, io.ErrUnexpectedEOF
			}
			b := dAtA[iNdEx]
			iNdEx++
			wire |= (uint64(b) & 0x7F) << shift
			if b < 0x80 {
				break
			}
		}
		wireType := int(wire & 0x7)
		switch wireType {
		case 0:
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				iNdEx++
				if dAtA[iNdEx-1] < 0x80 {
					break
				}
			}
		case 1:
			iNdEx += 8
		case 2:
			var length int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowAgent
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				length |= (int(b) & 0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			if length < 0 {
				return 0, ErrInvalidLengthAgent
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupAgent
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthAgent
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthAgent        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowAgent          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupAgent = fmt.Errorf("proto: unexpected end of group")
)
