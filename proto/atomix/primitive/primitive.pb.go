// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/primitive/primitive.proto

package primitive

import (
	context "context"
	fmt "fmt"
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
const _ = proto.GoGoProtoPackageIsVersion2 // please upgrade the proto package

// Namespaced primitive name
type Name struct {
	Name      string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Namespace string `protobuf:"bytes,2,opt,name=namespace,proto3" json:"namespace,omitempty"`
}

func (m *Name) Reset()         { *m = Name{} }
func (m *Name) String() string { return proto.CompactTextString(m) }
func (*Name) ProtoMessage()    {}
func (*Name) Descriptor() ([]byte, []int) {
	return fileDescriptor_056a91a3aedc7ac7, []int{0}
}
func (m *Name) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *Name) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_Name.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *Name) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Name.Merge(m, src)
}
func (m *Name) XXX_Size() int {
	return m.Size()
}
func (m *Name) XXX_DiscardUnknown() {
	xxx_messageInfo_Name.DiscardUnknown(m)
}

var xxx_messageInfo_Name proto.InternalMessageInfo

func (m *Name) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *Name) GetNamespace() string {
	if m != nil {
		return m.Namespace
	}
	return ""
}

type GetPrimitivesRequest struct {
	Namespace string `protobuf:"bytes,1,opt,name=namespace,proto3" json:"namespace,omitempty"`
	Type      string `protobuf:"bytes,2,opt,name=type,proto3" json:"type,omitempty"`
}

func (m *GetPrimitivesRequest) Reset()         { *m = GetPrimitivesRequest{} }
func (m *GetPrimitivesRequest) String() string { return proto.CompactTextString(m) }
func (*GetPrimitivesRequest) ProtoMessage()    {}
func (*GetPrimitivesRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_056a91a3aedc7ac7, []int{1}
}
func (m *GetPrimitivesRequest) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *GetPrimitivesRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_GetPrimitivesRequest.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *GetPrimitivesRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrimitivesRequest.Merge(m, src)
}
func (m *GetPrimitivesRequest) XXX_Size() int {
	return m.Size()
}
func (m *GetPrimitivesRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrimitivesRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrimitivesRequest proto.InternalMessageInfo

func (m *GetPrimitivesRequest) GetNamespace() string {
	if m != nil {
		return m.Namespace
	}
	return ""
}

func (m *GetPrimitivesRequest) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

type GetPrimitivesResponse struct {
	Primitives []*PrimitiveInfo `protobuf:"bytes,1,rep,name=primitives,proto3" json:"primitives,omitempty"`
}

func (m *GetPrimitivesResponse) Reset()         { *m = GetPrimitivesResponse{} }
func (m *GetPrimitivesResponse) String() string { return proto.CompactTextString(m) }
func (*GetPrimitivesResponse) ProtoMessage()    {}
func (*GetPrimitivesResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_056a91a3aedc7ac7, []int{2}
}
func (m *GetPrimitivesResponse) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *GetPrimitivesResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_GetPrimitivesResponse.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *GetPrimitivesResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetPrimitivesResponse.Merge(m, src)
}
func (m *GetPrimitivesResponse) XXX_Size() int {
	return m.Size()
}
func (m *GetPrimitivesResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_GetPrimitivesResponse.DiscardUnknown(m)
}

var xxx_messageInfo_GetPrimitivesResponse proto.InternalMessageInfo

func (m *GetPrimitivesResponse) GetPrimitives() []*PrimitiveInfo {
	if m != nil {
		return m.Primitives
	}
	return nil
}

type PrimitiveInfo struct {
	Type string `protobuf:"bytes,1,opt,name=type,proto3" json:"type,omitempty"`
	Name *Name  `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
}

func (m *PrimitiveInfo) Reset()         { *m = PrimitiveInfo{} }
func (m *PrimitiveInfo) String() string { return proto.CompactTextString(m) }
func (*PrimitiveInfo) ProtoMessage()    {}
func (*PrimitiveInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_056a91a3aedc7ac7, []int{3}
}
func (m *PrimitiveInfo) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *PrimitiveInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_PrimitiveInfo.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *PrimitiveInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PrimitiveInfo.Merge(m, src)
}
func (m *PrimitiveInfo) XXX_Size() int {
	return m.Size()
}
func (m *PrimitiveInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_PrimitiveInfo.DiscardUnknown(m)
}

var xxx_messageInfo_PrimitiveInfo proto.InternalMessageInfo

func (m *PrimitiveInfo) GetType() string {
	if m != nil {
		return m.Type
	}
	return ""
}

func (m *PrimitiveInfo) GetName() *Name {
	if m != nil {
		return m.Name
	}
	return nil
}

func init() {
	proto.RegisterType((*Name)(nil), "atomix.primitive.Name")
	proto.RegisterType((*GetPrimitivesRequest)(nil), "atomix.primitive.GetPrimitivesRequest")
	proto.RegisterType((*GetPrimitivesResponse)(nil), "atomix.primitive.GetPrimitivesResponse")
	proto.RegisterType((*PrimitiveInfo)(nil), "atomix.primitive.PrimitiveInfo")
}

func init() { proto.RegisterFile("atomix/primitive/primitive.proto", fileDescriptor_056a91a3aedc7ac7) }

var fileDescriptor_056a91a3aedc7ac7 = []byte{
	// 267 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0x48, 0x2c, 0xc9, 0xcf,
	0xcd, 0xac, 0xd0, 0x2f, 0x28, 0xca, 0xcc, 0xcd, 0x2c, 0xc9, 0x2c, 0x4b, 0x45, 0xb0, 0xf4, 0x0a,
	0x8a, 0xf2, 0x4b, 0xf2, 0x85, 0x04, 0x20, 0x2a, 0xf4, 0xe0, 0xe2, 0x4a, 0x16, 0x5c, 0x2c, 0x7e,
	0x89, 0xb9, 0xa9, 0x42, 0x42, 0x5c, 0x2c, 0x79, 0x89, 0xb9, 0xa9, 0x12, 0x8c, 0x0a, 0x8c, 0x1a,
	0x9c, 0x41, 0x60, 0xb6, 0x90, 0x0c, 0x17, 0x27, 0x88, 0x2e, 0x2e, 0x48, 0x4c, 0x4e, 0x95, 0x60,
	0x02, 0x4b, 0x20, 0x04, 0x94, 0x3c, 0xb8, 0x44, 0xdc, 0x53, 0x4b, 0x02, 0x60, 0x26, 0x15, 0x07,
	0xa5, 0x16, 0x96, 0xa6, 0x16, 0x97, 0xa0, 0xea, 0x62, 0x44, 0xd3, 0x05, 0xb2, 0xa7, 0xa4, 0xb2,
	0x00, 0x66, 0x1c, 0x98, 0xad, 0x14, 0xc1, 0x25, 0x8a, 0x66, 0x52, 0x71, 0x41, 0x7e, 0x5e, 0x71,
	0xaa, 0x90, 0x3d, 0x17, 0x17, 0xdc, 0xa5, 0xc5, 0x12, 0x8c, 0x0a, 0xcc, 0x1a, 0xdc, 0x46, 0xf2,
	0x7a, 0xe8, 0x7e, 0xd0, 0x83, 0xeb, 0xf4, 0xcc, 0x4b, 0xcb, 0x0f, 0x42, 0xd2, 0xa2, 0xe4, 0xcf,
	0xc5, 0x8b, 0x22, 0x09, 0xb7, 0x9e, 0x11, 0x61, 0xbd, 0x90, 0x16, 0xd4, 0xeb, 0x20, 0x27, 0x71,
	0x1b, 0x89, 0x61, 0x9a, 0x0f, 0x0a, 0x20, 0x48, 0x90, 0x18, 0x95, 0x71, 0x09, 0xc0, 0x0d, 0x0c,
	0x4e, 0x2d, 0x2a, 0xcb, 0x4c, 0x4e, 0x15, 0x4a, 0xe2, 0xe2, 0x45, 0x71, 0xbe, 0x90, 0x1a, 0xa6,
	0x11, 0xd8, 0x42, 0x4a, 0x4a, 0x9d, 0xa0, 0x3a, 0x48, 0x38, 0x28, 0x31, 0x38, 0x49, 0x9c, 0x78,
	0x24, 0xc7, 0x78, 0xe1, 0x91, 0x1c, 0xe3, 0x83, 0x47, 0x72, 0x8c, 0x13, 0x1e, 0xcb, 0x31, 0x5c,
	0x78, 0x2c, 0xc7, 0x70, 0xe3, 0xb1, 0x1c, 0x43, 0x12, 0x1b, 0x38, 0x66, 0x8d, 0x01, 0x01, 0x00,
	0x00, 0xff, 0xff, 0x95, 0xa3, 0x1b, 0xe7, 0xfd, 0x01, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// PrimitiveServiceClient is the client API for PrimitiveService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type PrimitiveServiceClient interface {
	// GetPrimitives returns a list of primitives
	GetPrimitives(ctx context.Context, in *GetPrimitivesRequest, opts ...grpc.CallOption) (*GetPrimitivesResponse, error)
}

type primitiveServiceClient struct {
	cc *grpc.ClientConn
}

func NewPrimitiveServiceClient(cc *grpc.ClientConn) PrimitiveServiceClient {
	return &primitiveServiceClient{cc}
}

func (c *primitiveServiceClient) GetPrimitives(ctx context.Context, in *GetPrimitivesRequest, opts ...grpc.CallOption) (*GetPrimitivesResponse, error) {
	out := new(GetPrimitivesResponse)
	err := c.cc.Invoke(ctx, "/atomix.primitive.PrimitiveService/GetPrimitives", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// PrimitiveServiceServer is the server API for PrimitiveService service.
type PrimitiveServiceServer interface {
	// GetPrimitives returns a list of primitives
	GetPrimitives(context.Context, *GetPrimitivesRequest) (*GetPrimitivesResponse, error)
}

// UnimplementedPrimitiveServiceServer can be embedded to have forward compatible implementations.
type UnimplementedPrimitiveServiceServer struct {
}

func (*UnimplementedPrimitiveServiceServer) GetPrimitives(ctx context.Context, req *GetPrimitivesRequest) (*GetPrimitivesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetPrimitives not implemented")
}

func RegisterPrimitiveServiceServer(s *grpc.Server, srv PrimitiveServiceServer) {
	s.RegisterService(&_PrimitiveService_serviceDesc, srv)
}

func _PrimitiveService_GetPrimitives_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetPrimitivesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PrimitiveServiceServer).GetPrimitives(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/atomix.primitive.PrimitiveService/GetPrimitives",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PrimitiveServiceServer).GetPrimitives(ctx, req.(*GetPrimitivesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _PrimitiveService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.primitive.PrimitiveService",
	HandlerType: (*PrimitiveServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetPrimitives",
			Handler:    _PrimitiveService_GetPrimitives_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "atomix/primitive/primitive.proto",
}

func (m *Name) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *Name) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *Name) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Namespace) > 0 {
		i -= len(m.Namespace)
		copy(dAtA[i:], m.Namespace)
		i = encodeVarintPrimitive(dAtA, i, uint64(len(m.Namespace)))
		i--
		dAtA[i] = 0x12
	}
	if len(m.Name) > 0 {
		i -= len(m.Name)
		copy(dAtA[i:], m.Name)
		i = encodeVarintPrimitive(dAtA, i, uint64(len(m.Name)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *GetPrimitivesRequest) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *GetPrimitivesRequest) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *GetPrimitivesRequest) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Type) > 0 {
		i -= len(m.Type)
		copy(dAtA[i:], m.Type)
		i = encodeVarintPrimitive(dAtA, i, uint64(len(m.Type)))
		i--
		dAtA[i] = 0x12
	}
	if len(m.Namespace) > 0 {
		i -= len(m.Namespace)
		copy(dAtA[i:], m.Namespace)
		i = encodeVarintPrimitive(dAtA, i, uint64(len(m.Namespace)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *GetPrimitivesResponse) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *GetPrimitivesResponse) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *GetPrimitivesResponse) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if len(m.Primitives) > 0 {
		for iNdEx := len(m.Primitives) - 1; iNdEx >= 0; iNdEx-- {
			{
				size, err := m.Primitives[iNdEx].MarshalToSizedBuffer(dAtA[:i])
				if err != nil {
					return 0, err
				}
				i -= size
				i = encodeVarintPrimitive(dAtA, i, uint64(size))
			}
			i--
			dAtA[i] = 0xa
		}
	}
	return len(dAtA) - i, nil
}

func (m *PrimitiveInfo) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *PrimitiveInfo) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *PrimitiveInfo) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.Name != nil {
		{
			size, err := m.Name.MarshalToSizedBuffer(dAtA[:i])
			if err != nil {
				return 0, err
			}
			i -= size
			i = encodeVarintPrimitive(dAtA, i, uint64(size))
		}
		i--
		dAtA[i] = 0x12
	}
	if len(m.Type) > 0 {
		i -= len(m.Type)
		copy(dAtA[i:], m.Type)
		i = encodeVarintPrimitive(dAtA, i, uint64(len(m.Type)))
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func encodeVarintPrimitive(dAtA []byte, offset int, v uint64) int {
	offset -= sovPrimitive(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *Name) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Name)
	if l > 0 {
		n += 1 + l + sovPrimitive(uint64(l))
	}
	l = len(m.Namespace)
	if l > 0 {
		n += 1 + l + sovPrimitive(uint64(l))
	}
	return n
}

func (m *GetPrimitivesRequest) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Namespace)
	if l > 0 {
		n += 1 + l + sovPrimitive(uint64(l))
	}
	l = len(m.Type)
	if l > 0 {
		n += 1 + l + sovPrimitive(uint64(l))
	}
	return n
}

func (m *GetPrimitivesResponse) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if len(m.Primitives) > 0 {
		for _, e := range m.Primitives {
			l = e.Size()
			n += 1 + l + sovPrimitive(uint64(l))
		}
	}
	return n
}

func (m *PrimitiveInfo) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	l = len(m.Type)
	if l > 0 {
		n += 1 + l + sovPrimitive(uint64(l))
	}
	if m.Name != nil {
		l = m.Name.Size()
		n += 1 + l + sovPrimitive(uint64(l))
	}
	return n
}

func sovPrimitive(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozPrimitive(x uint64) (n int) {
	return sovPrimitive(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *Name) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowPrimitive
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
			return fmt.Errorf("proto: Name: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: Name: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Name", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Name = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Namespace", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Namespace = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipPrimitive(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthPrimitive
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthPrimitive
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
func (m *GetPrimitivesRequest) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowPrimitive
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
			return fmt.Errorf("proto: GetPrimitivesRequest: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: GetPrimitivesRequest: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Namespace", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Namespace = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Type", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Type = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipPrimitive(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthPrimitive
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthPrimitive
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
func (m *GetPrimitivesResponse) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowPrimitive
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
			return fmt.Errorf("proto: GetPrimitivesResponse: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: GetPrimitivesResponse: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Primitives", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Primitives = append(m.Primitives, &PrimitiveInfo{})
			if err := m.Primitives[len(m.Primitives)-1].Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipPrimitive(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthPrimitive
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthPrimitive
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
func (m *PrimitiveInfo) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowPrimitive
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
			return fmt.Errorf("proto: PrimitiveInfo: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: PrimitiveInfo: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Type", wireType)
			}
			var stringLen uint64
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + intStringLen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			m.Type = string(dAtA[iNdEx:postIndex])
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Name", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowPrimitive
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
				return ErrInvalidLengthPrimitive
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthPrimitive
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if m.Name == nil {
				m.Name = &Name{}
			}
			if err := m.Name.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		default:
			iNdEx = preIndex
			skippy, err := skipPrimitive(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthPrimitive
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthPrimitive
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
func skipPrimitive(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowPrimitive
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
					return 0, ErrIntOverflowPrimitive
				}
				if iNdEx >= l {
					return 0, io.ErrUnexpectedEOF
				}
				iNdEx++
				if dAtA[iNdEx-1] < 0x80 {
					break
				}
			}
			return iNdEx, nil
		case 1:
			iNdEx += 8
			return iNdEx, nil
		case 2:
			var length int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return 0, ErrIntOverflowPrimitive
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
				return 0, ErrInvalidLengthPrimitive
			}
			iNdEx += length
			if iNdEx < 0 {
				return 0, ErrInvalidLengthPrimitive
			}
			return iNdEx, nil
		case 3:
			for {
				var innerWire uint64
				var start int = iNdEx
				for shift := uint(0); ; shift += 7 {
					if shift >= 64 {
						return 0, ErrIntOverflowPrimitive
					}
					if iNdEx >= l {
						return 0, io.ErrUnexpectedEOF
					}
					b := dAtA[iNdEx]
					iNdEx++
					innerWire |= (uint64(b) & 0x7F) << shift
					if b < 0x80 {
						break
					}
				}
				innerWireType := int(innerWire & 0x7)
				if innerWireType == 4 {
					break
				}
				next, err := skipPrimitive(dAtA[start:])
				if err != nil {
					return 0, err
				}
				iNdEx = start + next
				if iNdEx < 0 {
					return 0, ErrInvalidLengthPrimitive
				}
			}
			return iNdEx, nil
		case 4:
			return iNdEx, nil
		case 5:
			iNdEx += 4
			return iNdEx, nil
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
	}
	panic("unreachable")
}

var (
	ErrInvalidLengthPrimitive = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowPrimitive   = fmt.Errorf("proto: integer overflow")
)
