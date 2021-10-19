// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/primitive/log/v1/manager.proto

package log

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
	Options LogOptions `protobuf:"bytes,1,opt,name=options,proto3" json:"options"`
}

func (m *OpenSessionRequest) Reset()         { *m = OpenSessionRequest{} }
func (m *OpenSessionRequest) String() string { return proto.CompactTextString(m) }
func (*OpenSessionRequest) ProtoMessage()    {}
func (*OpenSessionRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_d2b9d521ef921e64, []int{0}
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

func (m *OpenSessionRequest) GetOptions() LogOptions {
	if m != nil {
		return m.Options
	}
	return LogOptions{}
}

type OpenSessionResponse struct {
	SessionId uint64 `protobuf:"varint,1,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
}

func (m *OpenSessionResponse) Reset()         { *m = OpenSessionResponse{} }
func (m *OpenSessionResponse) String() string { return proto.CompactTextString(m) }
func (*OpenSessionResponse) ProtoMessage()    {}
func (*OpenSessionResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_d2b9d521ef921e64, []int{1}
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

type LogOptions struct {
}

func (m *LogOptions) Reset()         { *m = LogOptions{} }
func (m *LogOptions) String() string { return proto.CompactTextString(m) }
func (*LogOptions) ProtoMessage()    {}
func (*LogOptions) Descriptor() ([]byte, []int) {
	return fileDescriptor_d2b9d521ef921e64, []int{2}
}
func (m *LogOptions) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *LogOptions) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_LogOptions.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *LogOptions) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LogOptions.Merge(m, src)
}
func (m *LogOptions) XXX_Size() int {
	return m.Size()
}
func (m *LogOptions) XXX_DiscardUnknown() {
	xxx_messageInfo_LogOptions.DiscardUnknown(m)
}

var xxx_messageInfo_LogOptions proto.InternalMessageInfo

type CloseSessionRequest struct {
	SessionId uint64 `protobuf:"varint,1,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
}

func (m *CloseSessionRequest) Reset()         { *m = CloseSessionRequest{} }
func (m *CloseSessionRequest) String() string { return proto.CompactTextString(m) }
func (*CloseSessionRequest) ProtoMessage()    {}
func (*CloseSessionRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_d2b9d521ef921e64, []int{3}
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
	return fileDescriptor_d2b9d521ef921e64, []int{4}
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
	proto.RegisterType((*OpenSessionRequest)(nil), "atomix.primitive.log.v1.OpenSessionRequest")
	proto.RegisterType((*OpenSessionResponse)(nil), "atomix.primitive.log.v1.OpenSessionResponse")
	proto.RegisterType((*LogOptions)(nil), "atomix.primitive.log.v1.LogOptions")
	proto.RegisterType((*CloseSessionRequest)(nil), "atomix.primitive.log.v1.CloseSessionRequest")
	proto.RegisterType((*CloseSessionResponse)(nil), "atomix.primitive.log.v1.CloseSessionResponse")
}

func init() {
	proto.RegisterFile("atomix/primitive/log/v1/manager.proto", fileDescriptor_d2b9d521ef921e64)
}

var fileDescriptor_d2b9d521ef921e64 = []byte{
	// 322 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0x4d, 0x2c, 0xc9, 0xcf,
	0xcd, 0xac, 0xd0, 0x2f, 0x28, 0xca, 0xcc, 0xcd, 0x2c, 0xc9, 0x2c, 0x4b, 0xd5, 0xcf, 0xc9, 0x4f,
	0xd7, 0x2f, 0x33, 0xd4, 0xcf, 0x4d, 0xcc, 0x4b, 0x4c, 0x4f, 0x2d, 0xd2, 0x2b, 0x28, 0xca, 0x2f,
	0xc9, 0x17, 0x12, 0x87, 0x28, 0xd3, 0x83, 0x2b, 0xd3, 0xcb, 0xc9, 0x4f, 0xd7, 0x2b, 0x33, 0x94,
	0x52, 0xc0, 0xd0, 0x8f, 0x50, 0x02, 0xd6, 0x2a, 0x25, 0x87, 0xa1, 0x02, 0xc5, 0x68, 0x29, 0x91,
	0xf4, 0xfc, 0xf4, 0x7c, 0x30, 0x53, 0x1f, 0xc4, 0x82, 0x88, 0x2a, 0x45, 0x72, 0x09, 0xf9, 0x17,
	0xa4, 0xe6, 0x05, 0xa7, 0x16, 0x17, 0x67, 0xe6, 0xe7, 0x05, 0xa5, 0x16, 0x96, 0xa6, 0x16, 0x97,
	0x08, 0x39, 0x73, 0xb1, 0xe7, 0x17, 0x94, 0x64, 0xe6, 0xe7, 0x15, 0x4b, 0x30, 0x2a, 0x30, 0x6a,
	0x70, 0x1b, 0x29, 0xeb, 0xe1, 0x70, 0x98, 0x9e, 0x4f, 0x7e, 0xba, 0x3f, 0x44, 0xa9, 0x13, 0xcb,
	0x89, 0x7b, 0xf2, 0x0c, 0x41, 0x30, 0x9d, 0x4a, 0x26, 0x5c, 0xc2, 0x28, 0x46, 0x17, 0x17, 0xe4,
	0xe7, 0x15, 0xa7, 0x0a, 0xc9, 0x72, 0x71, 0x15, 0x43, 0x84, 0xe2, 0x33, 0x53, 0xc0, 0xc6, 0xb3,
	0x04, 0x71, 0x42, 0x45, 0x3c, 0x53, 0x94, 0x78, 0xb8, 0xb8, 0x10, 0x46, 0x82, 0xcc, 0x70, 0xce,
	0xc9, 0x2f, 0x4e, 0x45, 0x73, 0x1f, 0x01, 0x33, 0xc4, 0xb8, 0x44, 0x50, 0x75, 0x41, 0xac, 0x36,
	0xfa, 0xc3, 0x08, 0x36, 0xdc, 0x17, 0x12, 0x2e, 0x42, 0x79, 0x5c, 0xdc, 0x48, 0x0e, 0x14, 0xd2,
	0xc6, 0xe9, 0x47, 0xcc, 0x10, 0x92, 0xd2, 0x21, 0x4e, 0x31, 0xc4, 0x62, 0x25, 0x96, 0x86, 0xe9,
	0x4a, 0x0c, 0x42, 0x85, 0x5c, 0x3c, 0xc8, 0xce, 0x12, 0xc2, 0x6d, 0x06, 0x16, 0x3f, 0x4b, 0xe9,
	0x12, 0xa9, 0x1a, 0xc9, 0x4a, 0x46, 0x29, 0xee, 0x43, 0x57, 0x95, 0x98, 0x7d, 0xf2, 0xd3, 0x1b,
	0x3a, 0xd4, 0x19, 0x9d, 0x24, 0x4e, 0x3c, 0x92, 0x63, 0xbc, 0xf0, 0x48, 0x8e, 0xf1, 0xc1, 0x23,
	0x39, 0xc6, 0x09, 0x8f, 0xe5, 0x18, 0x2e, 0x3c, 0x96, 0x63, 0xb8, 0xf1, 0x58, 0x8e, 0x21, 0x89,
	0x0d, 0x9c, 0x18, 0x8c, 0x01, 0x01, 0x00, 0x00, 0xff, 0xff, 0x85, 0x3b, 0xff, 0xe7, 0xa6, 0x02,
	0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// LogManagerClient is the client API for LogManager service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type LogManagerClient interface {
	OpenSession(ctx context.Context, in *OpenSessionRequest, opts ...grpc.CallOption) (*OpenSessionResponse, error)
	CloseSession(ctx context.Context, in *CloseSessionRequest, opts ...grpc.CallOption) (*CloseSessionResponse, error)
}

type logManagerClient struct {
	cc *grpc.ClientConn
}

func NewLogManagerClient(cc *grpc.ClientConn) LogManagerClient {
	return &logManagerClient{cc}
}

func (c *logManagerClient) OpenSession(ctx context.Context, in *OpenSessionRequest, opts ...grpc.CallOption) (*OpenSessionResponse, error) {
	out := new(OpenSessionResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.log.v1.LogManager/OpenSession", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *logManagerClient) CloseSession(ctx context.Context, in *CloseSessionRequest, opts ...grpc.CallOption) (*CloseSessionResponse, error) {
	out := new(CloseSessionResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.log.v1.LogManager/CloseSession", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// LogManagerServer is the server API for LogManager service.
type LogManagerServer interface {
	OpenSession(context.Context, *OpenSessionRequest) (*OpenSessionResponse, error)
	CloseSession(context.Context, *CloseSessionRequest) (*CloseSessionResponse, error)
}

// UnimplementedLogManagerServer can be embedded to have forward compatible implementations.
type UnimplementedLogManagerServer struct {
}

func (*UnimplementedLogManagerServer) OpenSession(ctx context.Context, req *OpenSessionRequest) (*OpenSessionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method OpenSession not implemented")
}
func (*UnimplementedLogManagerServer) CloseSession(ctx context.Context, req *CloseSessionRequest) (*CloseSessionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CloseSession not implemented")
}

func RegisterLogManagerServer(s *grpc.Server, srv LogManagerServer) {
	s.RegisterService(&_LogManager_serviceDesc, srv)
}

func _LogManager_OpenSession_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(OpenSessionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogManagerServer).OpenSession(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.log.v1.LogManager/OpenSession",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogManagerServer).OpenSession(ctx, req.(*OpenSessionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LogManager_CloseSession_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CloseSessionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LogManagerServer).CloseSession(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.log.v1.LogManager/CloseSession",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LogManagerServer).CloseSession(ctx, req.(*CloseSessionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _LogManager_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.primitive.log.v1.LogManager",
	HandlerType: (*LogManagerServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "OpenSession",
			Handler:    _LogManager_OpenSession_Handler,
		},
		{
			MethodName: "CloseSession",
			Handler:    _LogManager_CloseSession_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "atomix/primitive/log/v1/manager.proto",
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

func (m *LogOptions) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *LogOptions) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *LogOptions) MarshalToSizedBuffer(dAtA []byte) (int, error) {
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

func (m *LogOptions) Size() (n int) {
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
func (m *LogOptions) Unmarshal(dAtA []byte) error {
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
			return fmt.Errorf("proto: LogOptions: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: LogOptions: illegal tag %d (wire type %d)", fieldNum, wire)
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