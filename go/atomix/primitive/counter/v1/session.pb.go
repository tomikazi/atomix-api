// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/primitive/counter/v1/session.proto

package counter

import (
	context "context"
	fmt "fmt"
	_ "github.com/atomix/atomix-api/go/atomix/primitive"
	_ "github.com/atomix/atomix-api/go/atomix/primitive/extensions/session"
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

type OpenSessionRequest struct {
	Options CounterSessionOptions `protobuf:"bytes,1,opt,name=options,proto3" json:"options"`
}

func (m *OpenSessionRequest) Reset()         { *m = OpenSessionRequest{} }
func (m *OpenSessionRequest) String() string { return proto.CompactTextString(m) }
func (*OpenSessionRequest) ProtoMessage()    {}
func (*OpenSessionRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_93799bf0becedaf2, []int{0}
}
func (m *OpenSessionRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *OpenSessionRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_OpenSessionRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *OpenSessionRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OpenSessionRequest.Merge(m, src)
}
func (m *OpenSessionRequest) XXX_Size() int {
	return m.Size()
}
func (m *OpenSessionRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_OpenSessionRequest.DiscardUnknown(m)
}

var xxx_messageInfo_OpenSessionRequest proto.InternalMessageInfo

func (m *OpenSessionRequest) GetOptions() CounterSessionOptions {
	if m != nil {
		return m.Options
	}
	return CounterSessionOptions{}
}

type OpenSessionResponse struct {
	SessionID string `protobuf:"bytes,1,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
}

func (m *OpenSessionResponse) Reset()         { *m = OpenSessionResponse{} }
func (m *OpenSessionResponse) String() string { return proto.CompactTextString(m) }
func (*OpenSessionResponse) ProtoMessage()    {}
func (*OpenSessionResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_93799bf0becedaf2, []int{1}
}
func (m *OpenSessionResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *OpenSessionResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_OpenSessionResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *OpenSessionResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OpenSessionResponse.Merge(m, src)
}
func (m *OpenSessionResponse) XXX_Size() int {
	return m.Size()
}
func (m *OpenSessionResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_OpenSessionResponse.DiscardUnknown(m)
}

var xxx_messageInfo_OpenSessionResponse proto.InternalMessageInfo

func (m *OpenSessionResponse) GetSessionID() string {
	if m != nil {
		return m.SessionID
	}
	return ""
}

type CounterSessionOptions struct {
}

func (m *CounterSessionOptions) Reset()         { *m = CounterSessionOptions{} }
func (m *CounterSessionOptions) String() string { return proto.CompactTextString(m) }
func (*CounterSessionOptions) ProtoMessage()    {}
func (*CounterSessionOptions) Descriptor() ([]byte, []int) {
	return fileDescriptor_93799bf0becedaf2, []int{2}
}
func (m *CounterSessionOptions) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *CounterSessionOptions) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_CounterSessionOptions.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *CounterSessionOptions) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CounterSessionOptions.Merge(m, src)
}
func (m *CounterSessionOptions) XXX_Size() int {
	return m.Size()
}
func (m *CounterSessionOptions) XXX_DiscardUnknown() {
	xxx_messageInfo_CounterSessionOptions.DiscardUnknown(m)
}

var xxx_messageInfo_CounterSessionOptions proto.InternalMessageInfo

type CloseSessionRequest struct {
	SessionID string `protobuf:"bytes,1,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
}

func (m *CloseSessionRequest) Reset()         { *m = CloseSessionRequest{} }
func (m *CloseSessionRequest) String() string { return proto.CompactTextString(m) }
func (*CloseSessionRequest) ProtoMessage()    {}
func (*CloseSessionRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_93799bf0becedaf2, []int{3}
}
func (m *CloseSessionRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *CloseSessionRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_CloseSessionRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *CloseSessionRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CloseSessionRequest.Merge(m, src)
}
func (m *CloseSessionRequest) XXX_Size() int {
	return m.Size()
}
func (m *CloseSessionRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CloseSessionRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CloseSessionRequest proto.InternalMessageInfo

func (m *CloseSessionRequest) GetSessionID() string {
	if m != nil {
		return m.SessionID
	}
	return ""
}

type CloseSessionResponse struct {
}

func (m *CloseSessionResponse) Reset()         { *m = CloseSessionResponse{} }
func (m *CloseSessionResponse) String() string { return proto.CompactTextString(m) }
func (*CloseSessionResponse) ProtoMessage()    {}
func (*CloseSessionResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_93799bf0becedaf2, []int{4}
}
func (m *CloseSessionResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *CloseSessionResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_CloseSessionResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *CloseSessionResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CloseSessionResponse.Merge(m, src)
}
func (m *CloseSessionResponse) XXX_Size() int {
	return m.Size()
}
func (m *CloseSessionResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_CloseSessionResponse.DiscardUnknown(m)
}

var xxx_messageInfo_CloseSessionResponse proto.InternalMessageInfo

func init() {
	proto.RegisterType((*OpenSessionRequest)(nil), "atomix.primitive.counter.v1.OpenSessionRequest")
	proto.RegisterType((*OpenSessionResponse)(nil), "atomix.primitive.counter.v1.OpenSessionResponse")
	proto.RegisterType((*CounterSessionOptions)(nil), "atomix.primitive.counter.v1.CounterSessionOptions")
	proto.RegisterType((*CloseSessionRequest)(nil), "atomix.primitive.counter.v1.CloseSessionRequest")
	proto.RegisterType((*CloseSessionResponse)(nil), "atomix.primitive.counter.v1.CloseSessionResponse")
}

func init() {
	proto.RegisterFile("atomix/primitive/counter/v1/session.proto", fileDescriptor_93799bf0becedaf2)
}

var fileDescriptor_93799bf0becedaf2 = []byte{
	// 332 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xd2, 0x4c, 0x2c, 0xc9, 0xcf,
	0xcd, 0xac, 0xd0, 0x2f, 0x28, 0xca, 0xcc, 0xcd, 0x2c, 0xc9, 0x2c, 0x4b, 0xd5, 0x4f, 0xce, 0x2f,
	0xcd, 0x2b, 0x49, 0x2d, 0xd2, 0x2f, 0x33, 0xd4, 0x2f, 0x4e, 0x2d, 0x2e, 0xce, 0xcc, 0xcf, 0xd3,
	0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x92, 0x86, 0x28, 0xd5, 0x83, 0x2b, 0xd5, 0x83, 0x2a, 0xd5,
	0x2b, 0x33, 0x94, 0x52, 0xc0, 0x30, 0x07, 0xa1, 0x0c, 0xac, 0x5d, 0x4a, 0x0e, 0x43, 0x05, 0x8a,
	0xf1, 0x52, 0x22, 0xe9, 0xf9, 0xe9, 0xf9, 0x60, 0xa6, 0x3e, 0x88, 0x05, 0x11, 0x55, 0xca, 0xe0,
	0x12, 0xf2, 0x2f, 0x48, 0xcd, 0x0b, 0x86, 0x28, 0x0d, 0x4a, 0x2d, 0x2c, 0x4d, 0x2d, 0x2e, 0x11,
	0x0a, 0xe2, 0x62, 0xcf, 0x2f, 0x28, 0xc9, 0xcc, 0xcf, 0x2b, 0x96, 0x60, 0x54, 0x60, 0xd4, 0xe0,
	0x36, 0x32, 0xd2, 0xc3, 0xe3, 0x38, 0x3d, 0x67, 0x08, 0x13, 0x6a, 0x88, 0x3f, 0x44, 0xa7, 0x13,
	0xcb, 0x89, 0x7b, 0xf2, 0x0c, 0x41, 0x30, 0x83, 0x94, 0x9c, 0xb9, 0x84, 0x51, 0x6c, 0x2a, 0x2e,
	0xc8, 0xcf, 0x2b, 0x4e, 0x15, 0xd2, 0xe1, 0xe2, 0x82, 0xba, 0x33, 0x3e, 0x33, 0x05, 0x6c, 0x1b,
	0xa7, 0x13, 0xef, 0xa3, 0x7b, 0xf2, 0x9c, 0x50, 0x85, 0x9e, 0x2e, 0x41, 0x9c, 0x50, 0x05, 0x9e,
	0x29, 0x4a, 0xe2, 0x5c, 0xa2, 0x58, 0x2d, 0x03, 0x99, 0xee, 0x9c, 0x93, 0x5f, 0x9c, 0x8a, 0xe6,
	0x11, 0xd2, 0x4c, 0x17, 0xe3, 0x12, 0x41, 0x35, 0x04, 0xe2, 0x46, 0xa3, 0x29, 0x4c, 0x5c, 0x7c,
	0xa8, 0xd6, 0x0a, 0x95, 0x71, 0x71, 0x23, 0xf9, 0x46, 0x48, 0x1f, 0x6f, 0xf8, 0x60, 0x86, 0xb0,
	0x94, 0x01, 0xf1, 0x1a, 0x20, 0x8e, 0x50, 0x62, 0x69, 0x98, 0xae, 0xc4, 0x20, 0x54, 0xc9, 0xc5,
	0x83, 0xec, 0x44, 0x21, 0xfc, 0xe6, 0x60, 0x09, 0x12, 0x29, 0x43, 0x12, 0x74, 0x20, 0x59, 0xcd,
	0x28, 0xc5, 0x7f, 0xe8, 0xaa, 0x12, 0x3b, 0x34, 0x18, 0x1a, 0x3a, 0xd4, 0x19, 0x9d, 0x24, 0x4e,
	0x3c, 0x92, 0x63, 0xbc, 0xf0, 0x48, 0x8e, 0xf1, 0xc1, 0x23, 0x39, 0xc6, 0x09, 0x8f, 0xe5, 0x18,
	0x2e, 0x3c, 0x96, 0x63, 0xb8, 0xf1, 0x58, 0x8e, 0x21, 0x89, 0x0d, 0x9c, 0xb8, 0x8c, 0x01, 0x01,
	0x00, 0x00, 0xff, 0xff, 0xd7, 0x36, 0x4a, 0xe0, 0xfe, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// CounterSessionClient is the client API for CounterSession service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type CounterSessionClient interface {
	OpenSession(ctx context.Context, in *OpenSessionRequest, opts ...grpc.CallOption) (*OpenSessionResponse, error)
	CloseSession(ctx context.Context, in *CloseSessionRequest, opts ...grpc.CallOption) (*CloseSessionResponse, error)
}

type counterSessionClient struct {
	cc *grpc.ClientConn
}

func NewCounterSessionClient(cc *grpc.ClientConn) CounterSessionClient {
	return &counterSessionClient{cc}
}

func (c *counterSessionClient) OpenSession(ctx context.Context, in *OpenSessionRequest, opts ...grpc.CallOption) (*OpenSessionResponse, error) {
	out := new(OpenSessionResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.counter.v1.CounterSession/OpenSession", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *counterSessionClient) CloseSession(ctx context.Context, in *CloseSessionRequest, opts ...grpc.CallOption) (*CloseSessionResponse, error) {
	out := new(CloseSessionResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.counter.v1.CounterSession/CloseSession", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// CounterSessionServer is the server API for CounterSession service.
type CounterSessionServer interface {
	OpenSession(context.Context, *OpenSessionRequest) (*OpenSessionResponse, error)
	CloseSession(context.Context, *CloseSessionRequest) (*CloseSessionResponse, error)
}

// UnimplementedCounterSessionServer can be embedded to have forward compatible implementations.
type UnimplementedCounterSessionServer struct {
}

func (*UnimplementedCounterSessionServer) OpenSession(ctx context.Context, req *OpenSessionRequest) (*OpenSessionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method OpenSession not implemented")
}
func (*UnimplementedCounterSessionServer) CloseSession(ctx context.Context, req *CloseSessionRequest) (*CloseSessionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CloseSession not implemented")
}

func RegisterCounterSessionServer(s *grpc.Server, srv CounterSessionServer) {
	s.RegisterService(&_CounterSession_serviceDesc, srv)
}

func _CounterSession_OpenSession_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OpenSessionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CounterSessionServer).OpenSession(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.counter.v1.CounterSession/OpenSession",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CounterSessionServer).OpenSession(ctx, req.(*OpenSessionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _CounterSession_CloseSession_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CloseSessionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CounterSessionServer).CloseSession(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.counter.v1.CounterSession/CloseSession",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CounterSessionServer).CloseSession(ctx, req.(*CloseSessionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _CounterSession_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.primitive.counter.v1.CounterSession",
	HandlerType: (*CounterSessionServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "OpenSession",
			Handler:    _CounterSession_OpenSession_Handler,
		},
		{
			MethodName: "CloseSession",
			Handler:    _CounterSession_CloseSession_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "atomix/primitive/counter/v1/session.proto",
}

func (m *OpenSessionRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *OpenSessionRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *OpenSessionRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
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
		i = encodeVarintSession(dAtA, i, uint64(size))
	}
	i--
	dAtA[i] = 0xa
	return len(dAtA) - i, nil
}

func (m *OpenSessionResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *OpenSessionResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *OpenSessionResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.SessionID) > 0 {
		i -= len(m.SessionID)
		copy(dAtA[i:], m.SessionID)
		i = encodeVarintSession(dAtA, i, uint64(len(m.SessionID)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *CounterSessionOptions) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *CounterSessionOptions) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *CounterSessionOptions) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	return len(dAtA) - i, nil
}

func (m *CloseSessionRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *CloseSessionRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *CloseSessionRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.SessionID) > 0 {
		i -= len(m.SessionID)
		copy(dAtA[i:], m.SessionID)
		i = encodeVarintSession(dAtA, i, uint64(len(m.SessionID)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *CloseSessionResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *CloseSessionResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *CloseSessionResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	return len(dAtA) - i, nil
}

func encodeVarintSession(dAtA []byte, offset int, v uint64) int {
	offset -= sovSession(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *OpenSessionRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = m.Options.Size()
	n += 1 + l + sovSession(uint64(l))
	return n
}

func (m *OpenSessionResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.SessionID)
	if l > 0 {
		n += 1 + l + sovSession(uint64(l))
	}
	return n
}

func (m *CounterSessionOptions) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	return n
}

func (m *CloseSessionRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.SessionID)
	if l > 0 {
		n += 1 + l + sovSession(uint64(l))
	}
	return n
}

func (m *CloseSessionResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	return n
}

func sovSession(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozSession(x uint64) (n int) {
	return sovSession(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *OpenSessionRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowSession
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
			return fmt.Errorf("proto: OpenSessionRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: OpenSessionRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Options", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowSession
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
				return ErrInvalidLengthSession
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthSession
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
			skippy, err := skipSession(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthSession
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthSession
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
func (m *OpenSessionResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowSession
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
			return fmt.Errorf("proto: OpenSessionResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: OpenSessionResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field SessionID", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowSession
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthSession
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthSession
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.SessionID = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipSession(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthSession
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthSession
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
func (m *CounterSessionOptions) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowSession
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
			return fmt.Errorf("proto: CounterSessionOptions: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: CounterSessionOptions: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipSession(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthSession
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthSession
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
func (m *CloseSessionRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowSession
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
			return fmt.Errorf("proto: CloseSessionRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: CloseSessionRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field SessionID", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowSession
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				stringLen |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
			intStringLen := int(stringLen)
			if intStringLen < 0 {
				return ErrInvalidLengthSession
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthSession
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.SessionID = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipSession(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthSession
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthSession
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
func (m *CloseSessionResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowSession
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
			return fmt.Errorf("proto: CloseSessionResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: CloseSessionResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipSession(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthSession
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthSession
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
func skipSession(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowSession
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
					return 0, ErrIntOverflowSession
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
					return 0, ErrIntOverflowSession
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
				return 0, ErrInvalidLengthSession
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupSession
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthSession
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthSession        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowSession          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupSession = fmt.Errorf("proto: unexpected end of group")
)
