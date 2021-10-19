// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/primitive/lock/v1/manager.proto

package lock

import (
	context "context"
	fmt "fmt"
	_ "github.com/atomix/atomix-api/go/atomix/primitive"
	_ "github.com/atomix/atomix-api/go/atomix/primitive/extensions/manager"
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
	Options LockOptions `protobuf:"bytes,1,opt,name=options,proto3" json:"options"`
}

func (m *OpenSessionRequest) Reset()         { *m = OpenSessionRequest{} }
func (m *OpenSessionRequest) String() string { return proto.CompactTextString(m) }
func (*OpenSessionRequest) ProtoMessage()    {}
func (*OpenSessionRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_d8c6fdc2e1dcec5a, []int{0}
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

func (m *OpenSessionRequest) GetOptions() LockOptions {
	if m != nil {
		return m.Options
	}
	return LockOptions{}
}

type OpenSessionResponse struct {
	SessionId uint64 `protobuf:"varint,1,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
}

func (m *OpenSessionResponse) Reset()         { *m = OpenSessionResponse{} }
func (m *OpenSessionResponse) String() string { return proto.CompactTextString(m) }
func (*OpenSessionResponse) ProtoMessage()    {}
func (*OpenSessionResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_d8c6fdc2e1dcec5a, []int{1}
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

func (m *OpenSessionResponse) GetSessionId() uint64 {
	if m != nil {
		return m.SessionId
	}
	return 0
}

type LockOptions struct {
}

func (m *LockOptions) Reset()         { *m = LockOptions{} }
func (m *LockOptions) String() string { return proto.CompactTextString(m) }
func (*LockOptions) ProtoMessage()    {}
func (*LockOptions) Descriptor() ([]byte, []int) {
	return fileDescriptor_d8c6fdc2e1dcec5a, []int{2}
}
func (m *LockOptions) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *LockOptions) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_LockOptions.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *LockOptions) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LockOptions.Merge(m, src)
}
func (m *LockOptions) XXX_Size() int {
	return m.Size()
}
func (m *LockOptions) XXX_DiscardUnknown() {
	xxx_messageInfo_LockOptions.DiscardUnknown(m)
}

var xxx_messageInfo_LockOptions proto.InternalMessageInfo

type CloseSessionRequest struct {
	SessionId uint64 `protobuf:"varint,1,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
}

func (m *CloseSessionRequest) Reset()         { *m = CloseSessionRequest{} }
func (m *CloseSessionRequest) String() string { return proto.CompactTextString(m) }
func (*CloseSessionRequest) ProtoMessage()    {}
func (*CloseSessionRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_d8c6fdc2e1dcec5a, []int{3}
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

func (m *CloseSessionRequest) GetSessionId() uint64 {
	if m != nil {
		return m.SessionId
	}
	return 0
}

type CloseSessionResponse struct {
}

func (m *CloseSessionResponse) Reset()         { *m = CloseSessionResponse{} }
func (m *CloseSessionResponse) String() string { return proto.CompactTextString(m) }
func (*CloseSessionResponse) ProtoMessage()    {}
func (*CloseSessionResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_d8c6fdc2e1dcec5a, []int{4}
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
	proto.RegisterType((*OpenSessionRequest)(nil), "atomix.primitive.lock.v1.OpenSessionRequest")
	proto.RegisterType((*OpenSessionResponse)(nil), "atomix.primitive.lock.v1.OpenSessionResponse")
	proto.RegisterType((*LockOptions)(nil), "atomix.primitive.lock.v1.LockOptions")
	proto.RegisterType((*CloseSessionRequest)(nil), "atomix.primitive.lock.v1.CloseSessionRequest")
	proto.RegisterType((*CloseSessionResponse)(nil), "atomix.primitive.lock.v1.CloseSessionResponse")
}

func init() {
	proto.RegisterFile("atomix/primitive/lock/v1/manager.proto", fileDescriptor_d8c6fdc2e1dcec5a)
}

var fileDescriptor_d8c6fdc2e1dcec5a = []byte{
	// 322 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0x4b, 0x2c, 0xc9, 0xcf,
	0xcd, 0xac, 0xd0, 0x2f, 0x28, 0xca, 0xcc, 0xcd, 0x2c, 0xc9, 0x2c, 0x4b, 0xd5, 0xcf, 0xc9, 0x4f,
	0xce, 0xd6, 0x2f, 0x33, 0xd4, 0xcf, 0x4d, 0xcc, 0x4b, 0x4c, 0x4f, 0x2d, 0xd2, 0x2b, 0x28, 0xca,
	0x2f, 0xc9, 0x17, 0x92, 0x80, 0xa8, 0xd3, 0x83, 0xab, 0xd3, 0x03, 0xa9, 0xd3, 0x2b, 0x33, 0x94,
	0x52, 0xc0, 0x30, 0x01, 0xa1, 0x06, 0xac, 0x57, 0x4a, 0x0e, 0x43, 0x05, 0x8a, 0xd9, 0x52, 0x22,
	0xe9, 0xf9, 0xe9, 0xf9, 0x60, 0xa6, 0x3e, 0x88, 0x05, 0x11, 0x55, 0x8a, 0xe6, 0x12, 0xf2, 0x2f,
	0x48, 0xcd, 0x0b, 0x4e, 0x2d, 0x2e, 0xce, 0xcc, 0xcf, 0x0b, 0x4a, 0x2d, 0x2c, 0x4d, 0x2d, 0x2e,
	0x11, 0x72, 0xe5, 0x62, 0xcf, 0x2f, 0x28, 0xc9, 0xcc, 0xcf, 0x2b, 0x96, 0x60, 0x54, 0x60, 0xd4,
	0xe0, 0x36, 0x52, 0xd5, 0xc3, 0xe5, 0x32, 0x3d, 0x9f, 0xfc, 0xe4, 0x6c, 0x7f, 0x88, 0x62, 0x27,
	0x96, 0x13, 0xf7, 0xe4, 0x19, 0x82, 0x60, 0x7a, 0x95, 0x4c, 0xb8, 0x84, 0x51, 0x0c, 0x2f, 0x2e,
	0xc8, 0xcf, 0x2b, 0x4e, 0x15, 0x92, 0xe5, 0xe2, 0x2a, 0x86, 0x08, 0xc5, 0x67, 0xa6, 0x80, 0x2d,
	0x60, 0x09, 0xe2, 0x84, 0x8a, 0x78, 0xa6, 0x28, 0xf1, 0x72, 0x71, 0x23, 0x99, 0x09, 0x32, 0xc4,
	0x39, 0x27, 0xbf, 0x38, 0x15, 0xcd, 0x89, 0x04, 0x0c, 0x11, 0xe3, 0x12, 0x41, 0xd5, 0x05, 0xb1,
	0xdb, 0xa8, 0x89, 0x09, 0x62, 0xba, 0x2f, 0x24, 0x6c, 0x84, 0x0a, 0xb8, 0xb8, 0x91, 0x9c, 0x28,
	0xa4, 0x83, 0xdb, 0x9f, 0x98, 0xc1, 0x24, 0xa5, 0x4b, 0xa4, 0x6a, 0x88, 0xdd, 0x4a, 0x2c, 0x0d,
	0xd3, 0x95, 0x18, 0x84, 0x8a, 0xb9, 0x78, 0x90, 0x5d, 0x26, 0x84, 0xc7, 0x10, 0x2c, 0xfe, 0x96,
	0xd2, 0x23, 0x56, 0x39, 0x92, 0xa5, 0x8c, 0x52, 0x3c, 0x87, 0xae, 0x2a, 0xb1, 0x80, 0xfc, 0xdd,
	0xd0, 0xa1, 0xce, 0xe8, 0x24, 0x71, 0xe2, 0x91, 0x1c, 0xe3, 0x85, 0x47, 0x72, 0x8c, 0x0f, 0x1e,
	0xc9, 0x31, 0x4e, 0x78, 0x2c, 0xc7, 0x70, 0xe1, 0xb1, 0x1c, 0xc3, 0x8d, 0xc7, 0x72, 0x0c, 0x49,
	0x6c, 0xe0, 0x54, 0x61, 0x0c, 0x08, 0x00, 0x00, 0xff, 0xff, 0x95, 0x2e, 0x9a, 0xac, 0xb1, 0x02,
	0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// LockManagerClient is the client API for LockManager service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type LockManagerClient interface {
	OpenSession(ctx context.Context, in *OpenSessionRequest, opts ...grpc.CallOption) (*OpenSessionResponse, error)
	CloseSession(ctx context.Context, in *CloseSessionRequest, opts ...grpc.CallOption) (*CloseSessionResponse, error)
}

type lockManagerClient struct {
	cc *grpc.ClientConn
}

func NewLockManagerClient(cc *grpc.ClientConn) LockManagerClient {
	return &lockManagerClient{cc}
}

func (c *lockManagerClient) OpenSession(ctx context.Context, in *OpenSessionRequest, opts ...grpc.CallOption) (*OpenSessionResponse, error) {
	out := new(OpenSessionResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.lock.v1.LockManager/OpenSession", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *lockManagerClient) CloseSession(ctx context.Context, in *CloseSessionRequest, opts ...grpc.CallOption) (*CloseSessionResponse, error) {
	out := new(CloseSessionResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.lock.v1.LockManager/CloseSession", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// LockManagerServer is the server API for LockManager service.
type LockManagerServer interface {
	OpenSession(context.Context, *OpenSessionRequest) (*OpenSessionResponse, error)
	CloseSession(context.Context, *CloseSessionRequest) (*CloseSessionResponse, error)
}

// UnimplementedLockManagerServer can be embedded to have forward compatible implementations.
type UnimplementedLockManagerServer struct {
}

func (*UnimplementedLockManagerServer) OpenSession(ctx context.Context, req *OpenSessionRequest) (*OpenSessionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method OpenSession not implemented")
}
func (*UnimplementedLockManagerServer) CloseSession(ctx context.Context, req *CloseSessionRequest) (*CloseSessionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CloseSession not implemented")
}

func RegisterLockManagerServer(s *grpc.Server, srv LockManagerServer) {
	s.RegisterService(&_LockManager_serviceDesc, srv)
}

func _LockManager_OpenSession_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OpenSessionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LockManagerServer).OpenSession(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.lock.v1.LockManager/OpenSession",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LockManagerServer).OpenSession(ctx, req.(*OpenSessionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LockManager_CloseSession_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CloseSessionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LockManagerServer).CloseSession(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.lock.v1.LockManager/CloseSession",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LockManagerServer).CloseSession(ctx, req.(*CloseSessionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _LockManager_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.primitive.lock.v1.LockManager",
	HandlerType: (*LockManagerServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "OpenSession",
			Handler:    _LockManager_OpenSession_Handler,
		},
		{
			MethodName: "CloseSession",
			Handler:    _LockManager_CloseSession_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "atomix/primitive/lock/v1/manager.proto",
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
		i = encodeVarintManager(dAtA, i, uint64(size))
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
	if m.SessionId != 0 {
		i = encodeVarintManager(dAtA, i, uint64(m.SessionId))
		i--
		dAtA[i] = 0x8
	}
	return len(dAtA) - i, nil
}

func (m *LockOptions) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *LockOptions) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *LockOptions) MarshalToSizedBuffer(dAtA []byte) (int, error) {
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
	if m.SessionId != 0 {
		i = encodeVarintManager(dAtA, i, uint64(m.SessionId))
		i--
		dAtA[i] = 0x8
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

func encodeVarintManager(dAtA []byte, offset int, v uint64) int {
	offset -= sovManager(v)
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
	n += 1 + l + sovManager(uint64(l))
	return n
}

func (m *OpenSessionResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.SessionId != 0 {
		n += 1 + sovManager(uint64(m.SessionId))
	}
	return n
}

func (m *LockOptions) Size() (n int) {
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
	if m.SessionId != 0 {
		n += 1 + sovManager(uint64(m.SessionId))
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

func sovManager(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozManager(x uint64) (n int) {
	return sovManager(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *OpenSessionRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowManager
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
					return ErrIntOverflowManager
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
				return ErrInvalidLengthManager
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthManager
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
			skippy, err := skipManager(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthManager
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthManager
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
				return ErrIntOverflowManager
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
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field SessionId", wireType)
			}
			m.SessionId = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowManager
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.SessionId |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		default:
			iNdEx = preIndex
			skippy, err := skipManager(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthManager
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthManager
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
func (m *LockOptions) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowManager
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
			return fmt.Errorf("proto: LockOptions: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: LockOptions: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		default:
			iNdEx = preIndex
			skippy, err := skipManager(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthManager
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthManager
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
				return ErrIntOverflowManager
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
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field SessionId", wireType)
			}
			m.SessionId = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowManager
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.SessionId |= uint64(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		default:
			iNdEx = preIndex
			skippy, err := skipManager(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthManager
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthManager
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
				return ErrIntOverflowManager
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
			skippy, err := skipManager(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthManager
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthManager
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
func skipManager(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowManager
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
					return 0, ErrIntOverflowManager
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
					return 0, ErrIntOverflowManager
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
				return 0, ErrInvalidLengthManager
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupManager
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthManager
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthManager        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowManager          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupManager = fmt.Errorf("proto: unexpected end of group")
)
