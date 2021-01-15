// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/primitive/meta/object.proto

package meta

import (
	fmt "fmt"
	_ "github.com/gogo/protobuf/gogoproto"
	proto "github.com/gogo/protobuf/proto"
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

type ObjectMeta_Type int32

const (
	ObjectMeta_OBJECT    ObjectMeta_Type = 0
	ObjectMeta_TOMBSTONE ObjectMeta_Type = 1
)

var ObjectMeta_Type_name = map[int32]string{
	0: "OBJECT",
	1: "TOMBSTONE",
}

var ObjectMeta_Type_value = map[string]int32{
	"OBJECT":    0,
	"TOMBSTONE": 1,
}

func (x ObjectMeta_Type) String() string {
	return proto.EnumName(ObjectMeta_Type_name, int32(x))
}

func (ObjectMeta_Type) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_5a6b6f53349a8ecc, []int{0, 0}
}

type ObjectMeta struct {
	Revision  *Revision       `protobuf:"bytes,1,opt,name=revision,proto3" json:"revision,omitempty"`
	Timestamp *Timestamp      `protobuf:"bytes,2,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
	Type      ObjectMeta_Type `protobuf:"varint,3,opt,name=type,proto3,enum=atomix.primitive.meta.ObjectMeta_Type" json:"type,omitempty"`
}

func (m *ObjectMeta) Reset()         { *m = ObjectMeta{} }
func (m *ObjectMeta) String() string { return proto.CompactTextString(m) }
func (*ObjectMeta) ProtoMessage()    {}
func (*ObjectMeta) Descriptor() ([]byte, []int) {
	return fileDescriptor_5a6b6f53349a8ecc, []int{0}
}
func (m *ObjectMeta) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *ObjectMeta) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_ObjectMeta.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *ObjectMeta) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ObjectMeta.Merge(m, src)
}
func (m *ObjectMeta) XXX_Size() int {
	return m.Size()
}
func (m *ObjectMeta) XXX_DiscardUnknown() {
	xxx_messageInfo_ObjectMeta.DiscardUnknown(m)
}

var xxx_messageInfo_ObjectMeta proto.InternalMessageInfo

func (m *ObjectMeta) GetRevision() *Revision {
	if m != nil {
		return m.Revision
	}
	return nil
}

func (m *ObjectMeta) GetTimestamp() *Timestamp {
	if m != nil {
		return m.Timestamp
	}
	return nil
}

func (m *ObjectMeta) GetType() ObjectMeta_Type {
	if m != nil {
		return m.Type
	}
	return ObjectMeta_OBJECT
}

type Revision struct {
	Num RevisionNum `protobuf:"varint,1,opt,name=num,proto3,casttype=RevisionNum" json:"num,omitempty"`
}

func (m *Revision) Reset()         { *m = Revision{} }
func (m *Revision) String() string { return proto.CompactTextString(m) }
func (*Revision) ProtoMessage()    {}
func (*Revision) Descriptor() ([]byte, []int) {
	return fileDescriptor_5a6b6f53349a8ecc, []int{1}
}
func (m *Revision) XXX_Unmarshal(b []byte) error {
	return m.Unmarshal(b)
}
func (m *Revision) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	if deterministic {
		return xxx_messageInfo_Revision.Marshal(b, m, deterministic)
	} else {
		b = b[:cap(b)]
		n, err := m.MarshalToSizedBuffer(b)
		if err != nil {
			return nil, err
		}
		return b[:n], nil
	}
}
func (m *Revision) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Revision.Merge(m, src)
}
func (m *Revision) XXX_Size() int {
	return m.Size()
}
func (m *Revision) XXX_DiscardUnknown() {
	xxx_messageInfo_Revision.DiscardUnknown(m)
}

var xxx_messageInfo_Revision proto.InternalMessageInfo

func (m *Revision) GetNum() RevisionNum {
	if m != nil {
		return m.Num
	}
	return 0
}

func init() {
	proto.RegisterEnum("atomix.primitive.meta.ObjectMeta_Type", ObjectMeta_Type_name, ObjectMeta_Type_value)
	proto.RegisterType((*ObjectMeta)(nil), "atomix.primitive.meta.ObjectMeta")
	proto.RegisterType((*Revision)(nil), "atomix.primitive.meta.Revision")
}

func init() { proto.RegisterFile("atomix/primitive/meta/object.proto", fileDescriptor_5a6b6f53349a8ecc) }

var fileDescriptor_5a6b6f53349a8ecc = []byte{
	// 284 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0x4a, 0x2c, 0xc9, 0xcf,
	0xcd, 0xac, 0xd0, 0x2f, 0x28, 0xca, 0xcc, 0xcd, 0x2c, 0xc9, 0x2c, 0x4b, 0xd5, 0xcf, 0x4d, 0x2d,
	0x49, 0xd4, 0xcf, 0x4f, 0xca, 0x4a, 0x4d, 0x2e, 0xd1, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x12,
	0x85, 0xa8, 0xd1, 0x83, 0xab, 0xd1, 0x03, 0xa9, 0x91, 0x52, 0xc5, 0xae, 0xb5, 0x24, 0x33, 0x37,
	0xb5, 0xb8, 0x24, 0x31, 0xb7, 0x00, 0xa2, 0x5b, 0x4a, 0x24, 0x3d, 0x3f, 0x3d, 0x1f, 0xcc, 0xd4,
	0x07, 0xb1, 0x20, 0xa2, 0x4a, 0x2f, 0x18, 0xb9, 0xb8, 0xfc, 0xc1, 0x96, 0xf8, 0xa6, 0x96, 0x24,
	0x0a, 0x59, 0x73, 0x71, 0x14, 0xa5, 0x96, 0x65, 0x16, 0x67, 0xe6, 0xe7, 0x49, 0x30, 0x2a, 0x30,
	0x6a, 0x70, 0x1b, 0xc9, 0xeb, 0x61, 0xb5, 0x55, 0x2f, 0x08, 0xaa, 0x2c, 0x08, 0xae, 0x41, 0xc8,
	0x8e, 0x8b, 0x13, 0x6e, 0xa9, 0x04, 0x13, 0x58, 0xb7, 0x02, 0x0e, 0xdd, 0x21, 0x30, 0x75, 0x41,
	0x08, 0x2d, 0x42, 0x56, 0x5c, 0x2c, 0x25, 0x95, 0x05, 0xa9, 0x12, 0xcc, 0x0a, 0x8c, 0x1a, 0x7c,
	0x46, 0x6a, 0x38, 0xb4, 0x22, 0x5c, 0xab, 0x17, 0x52, 0x59, 0x90, 0x1a, 0x04, 0xd6, 0xa3, 0xa4,
	0xc8, 0xc5, 0x02, 0xe2, 0x09, 0x71, 0x71, 0xb1, 0xf9, 0x3b, 0x79, 0xb9, 0x3a, 0x87, 0x08, 0x30,
	0x08, 0xf1, 0x72, 0x71, 0x86, 0xf8, 0xfb, 0x3a, 0x05, 0x87, 0xf8, 0xfb, 0xb9, 0x0a, 0x30, 0x2a,
	0xe9, 0x72, 0x71, 0xc0, 0x1c, 0x2d, 0xa4, 0xc8, 0xc5, 0x9c, 0x57, 0x9a, 0x0b, 0xf6, 0x22, 0x8b,
	0x13, 0xff, 0xaf, 0x7b, 0xf2, 0xdc, 0x30, 0x29, 0xbf, 0xd2, 0xdc, 0x20, 0x90, 0x9c, 0x93, 0xc4,
	0x89, 0x47, 0x72, 0x8c, 0x17, 0x1e, 0xc9, 0x31, 0x3e, 0x78, 0x24, 0xc7, 0x38, 0xe1, 0xb1, 0x1c,
	0xc3, 0x85, 0xc7, 0x72, 0x0c, 0x37, 0x1e, 0xcb, 0x31, 0x24, 0xb1, 0x81, 0x83, 0xce, 0x18, 0x10,
	0x00, 0x00, 0xff, 0xff, 0x91, 0x0b, 0xe5, 0x29, 0xb4, 0x01, 0x00, 0x00,
}

func (m *ObjectMeta) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *ObjectMeta) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *ObjectMeta) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.Type != 0 {
		i = encodeVarintObject(dAtA, i, uint64(m.Type))
		i--
		dAtA[i] = 0x18
	}
	if m.Timestamp != nil {
		{
			size, err := m.Timestamp.MarshalToSizedBuffer(dAtA[:i])
			if err != nil {
				return 0, err
			}
			i -= size
			i = encodeVarintObject(dAtA, i, uint64(size))
		}
		i--
		dAtA[i] = 0x12
	}
	if m.Revision != nil {
		{
			size, err := m.Revision.MarshalToSizedBuffer(dAtA[:i])
			if err != nil {
				return 0, err
			}
			i -= size
			i = encodeVarintObject(dAtA, i, uint64(size))
		}
		i--
		dAtA[i] = 0xa
	}
	return len(dAtA) - i, nil
}

func (m *Revision) Marshal() (dAtA []byte, err error) {
	size := m.Size()
	dAtA = make([]byte, size)
	n, err := m.MarshalToSizedBuffer(dAtA[:size])
	if err != nil {
		return nil, err
	}
	return dAtA[:n], nil
}

func (m *Revision) MarshalTo(dAtA []byte) (int, error) {
	size := m.Size()
	return m.MarshalToSizedBuffer(dAtA[:size])
}

func (m *Revision) MarshalToSizedBuffer(dAtA []byte) (int, error) {
	i := len(dAtA)
	_ = i
	var l int
	_ = l
	if m.Num != 0 {
		i = encodeVarintObject(dAtA, i, uint64(m.Num))
		i--
		dAtA[i] = 0x8
	}
	return len(dAtA) - i, nil
}

func encodeVarintObject(dAtA []byte, offset int, v uint64) int {
	offset -= sovObject(v)
	base := offset
	for v >= 1<<7 {
		dAtA[offset] = uint8(v&0x7f | 0x80)
		v >>= 7
		offset++
	}
	dAtA[offset] = uint8(v)
	return base
}
func (m *ObjectMeta) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.Revision != nil {
		l = m.Revision.Size()
		n += 1 + l + sovObject(uint64(l))
	}
	if m.Timestamp != nil {
		l = m.Timestamp.Size()
		n += 1 + l + sovObject(uint64(l))
	}
	if m.Type != 0 {
		n += 1 + sovObject(uint64(m.Type))
	}
	return n
}

func (m *Revision) Size() (n int) {
	if m == nil {
		return 0
	}
	var l int
	_ = l
	if m.Num != 0 {
		n += 1 + sovObject(uint64(m.Num))
	}
	return n
}

func sovObject(x uint64) (n int) {
	return (math_bits.Len64(x|1) + 6) / 7
}
func sozObject(x uint64) (n int) {
	return sovObject(uint64((x << 1) ^ uint64((int64(x) >> 63))))
}
func (m *ObjectMeta) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowObject
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
			return fmt.Errorf("proto: ObjectMeta: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: ObjectMeta: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Revision", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowObject
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
				return ErrInvalidLengthObject
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthObject
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if m.Revision == nil {
				m.Revision = &Revision{}
			}
			if err := m.Revision.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		case 2:
			if wireType != 2 {
				return fmt.Errorf("proto: wrong wireType = %d for field Timestamp", wireType)
			}
			var msglen int
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowObject
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
				return ErrInvalidLengthObject
			}
			postIndex := iNdEx + msglen
			if postIndex < 0 {
				return ErrInvalidLengthObject
			}
			if postIndex > l {
				return io.ErrUnexpectedEOF
			}
			if m.Timestamp == nil {
				m.Timestamp = &Timestamp{}
			}
			if err := m.Timestamp.Unmarshal(dAtA[iNdEx:postIndex]); err != nil {
				return err
			}
			iNdEx = postIndex
		case 3:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field Type", wireType)
			}
			m.Type = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowObject
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.Type |= ObjectMeta_Type(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		default:
			iNdEx = preIndex
			skippy, err := skipObject(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthObject
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthObject
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
func (m *Revision) Unmarshal(dAtA []byte) error {
	l := len(dAtA)
	iNdEx := 0
	for iNdEx < l {
		preIndex := iNdEx
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return ErrIntOverflowObject
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
			return fmt.Errorf("proto: Revision: wiretype end group for non-group")
		}
		if fieldNum <= 0 {
			return fmt.Errorf("proto: Revision: illegal tag %d (wire type %d)", fieldNum, wire)
		}
		switch fieldNum {
		case 1:
			if wireType != 0 {
				return fmt.Errorf("proto: wrong wireType = %d for field Num", wireType)
			}
			m.Num = 0
			for shift := uint(0); ; shift += 7 {
				if shift >= 64 {
					return ErrIntOverflowObject
				}
				if iNdEx >= l {
					return io.ErrUnexpectedEOF
				}
				b := dAtA[iNdEx]
				iNdEx++
				m.Num |= RevisionNum(b&0x7F) << shift
				if b < 0x80 {
					break
				}
			}
		default:
			iNdEx = preIndex
			skippy, err := skipObject(dAtA[iNdEx:])
			if err != nil {
				return err
			}
			if skippy < 0 {
				return ErrInvalidLengthObject
			}
			if (iNdEx + skippy) < 0 {
				return ErrInvalidLengthObject
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
func skipObject(dAtA []byte) (n int, err error) {
	l := len(dAtA)
	iNdEx := 0
	depth := 0
	for iNdEx < l {
		var wire uint64
		for shift := uint(0); ; shift += 7 {
			if shift >= 64 {
				return 0, ErrIntOverflowObject
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
					return 0, ErrIntOverflowObject
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
					return 0, ErrIntOverflowObject
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
				return 0, ErrInvalidLengthObject
			}
			iNdEx += length
		case 3:
			depth++
		case 4:
			if depth == 0 {
				return 0, ErrUnexpectedEndOfGroupObject
			}
			depth--
		case 5:
			iNdEx += 4
		default:
			return 0, fmt.Errorf("proto: illegal wireType %d", wireType)
		}
		if iNdEx < 0 {
			return 0, ErrInvalidLengthObject
		}
		if depth == 0 {
			return iNdEx, nil
		}
	}
	return 0, io.ErrUnexpectedEOF
}

var (
	ErrInvalidLengthObject        = fmt.Errorf("proto: negative length found during unmarshaling")
	ErrIntOverflowObject          = fmt.Errorf("proto: integer overflow")
	ErrUnexpectedEndOfGroupObject = fmt.Errorf("proto: unexpected end of group")
)
