// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: atomix/controller/membership.proto

package controller

import (
	context "context"
	fmt "fmt"
	_ "github.com/gogo/protobuf/gogoproto"
	proto "github.com/gogo/protobuf/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
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

type Membership struct {
	Members              []*Member `protobuf:"bytes,1,rep,name=members,proto3" json:"members,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *Membership) Reset()         { *m = Membership{} }
func (m *Membership) String() string { return proto.CompactTextString(m) }
func (*Membership) ProtoMessage()    {}
func (*Membership) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{0}
}
func (m *Membership) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Membership.Unmarshal(m, b)
}
func (m *Membership) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Membership.Marshal(b, m, deterministic)
}
func (m *Membership) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Membership.Merge(m, src)
}
func (m *Membership) XXX_Size() int {
	return xxx_messageInfo_Membership.Size(m)
}
func (m *Membership) XXX_DiscardUnknown() {
	xxx_messageInfo_Membership.DiscardUnknown(m)
}

var xxx_messageInfo_Membership proto.InternalMessageInfo

func (m *Membership) GetMembers() []*Member {
	if m != nil {
		return m.Members
	}
	return nil
}

// Membership group identifier
type MembershipGroupId struct {
	Name                 string   `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Namespace            string   `protobuf:"bytes,2,opt,name=namespace,proto3" json:"namespace,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *MembershipGroupId) Reset()         { *m = MembershipGroupId{} }
func (m *MembershipGroupId) String() string { return proto.CompactTextString(m) }
func (*MembershipGroupId) ProtoMessage()    {}
func (*MembershipGroupId) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{1}
}
func (m *MembershipGroupId) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MembershipGroupId.Unmarshal(m, b)
}
func (m *MembershipGroupId) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MembershipGroupId.Marshal(b, m, deterministic)
}
func (m *MembershipGroupId) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MembershipGroupId.Merge(m, src)
}
func (m *MembershipGroupId) XXX_Size() int {
	return xxx_messageInfo_MembershipGroupId.Size(m)
}
func (m *MembershipGroupId) XXX_DiscardUnknown() {
	xxx_messageInfo_MembershipGroupId.DiscardUnknown(m)
}

var xxx_messageInfo_MembershipGroupId proto.InternalMessageInfo

func (m *MembershipGroupId) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *MembershipGroupId) GetNamespace() string {
	if m != nil {
		return m.Namespace
	}
	return ""
}

// Cluster membership group
type MembershipGroup struct {
	ID                   *MembershipGroupId `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Term                 TermID             `protobuf:"varint,2,opt,name=term,proto3,casttype=TermID" json:"term,omitempty"`
	Leader               MemberID           `protobuf:"bytes,3,opt,name=leader,proto3,casttype=MemberID" json:"leader,omitempty"`
	Members              []*Member          `protobuf:"bytes,4,rep,name=members,proto3" json:"members,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *MembershipGroup) Reset()         { *m = MembershipGroup{} }
func (m *MembershipGroup) String() string { return proto.CompactTextString(m) }
func (*MembershipGroup) ProtoMessage()    {}
func (*MembershipGroup) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{2}
}
func (m *MembershipGroup) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MembershipGroup.Unmarshal(m, b)
}
func (m *MembershipGroup) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MembershipGroup.Marshal(b, m, deterministic)
}
func (m *MembershipGroup) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MembershipGroup.Merge(m, src)
}
func (m *MembershipGroup) XXX_Size() int {
	return xxx_messageInfo_MembershipGroup.Size(m)
}
func (m *MembershipGroup) XXX_DiscardUnknown() {
	xxx_messageInfo_MembershipGroup.DiscardUnknown(m)
}

var xxx_messageInfo_MembershipGroup proto.InternalMessageInfo

func (m *MembershipGroup) GetID() *MembershipGroupId {
	if m != nil {
		return m.ID
	}
	return nil
}

func (m *MembershipGroup) GetTerm() TermID {
	if m != nil {
		return m.Term
	}
	return 0
}

func (m *MembershipGroup) GetLeader() MemberID {
	if m != nil {
		return m.Leader
	}
	return ""
}

func (m *MembershipGroup) GetMembers() []*Member {
	if m != nil {
		return m.Members
	}
	return nil
}

// Member identifier
type MemberId struct {
	Name                 string   `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Namespace            string   `protobuf:"bytes,2,opt,name=namespace,proto3" json:"namespace,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *MemberId) Reset()         { *m = MemberId{} }
func (m *MemberId) String() string { return proto.CompactTextString(m) }
func (*MemberId) ProtoMessage()    {}
func (*MemberId) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{3}
}
func (m *MemberId) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MemberId.Unmarshal(m, b)
}
func (m *MemberId) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MemberId.Marshal(b, m, deterministic)
}
func (m *MemberId) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MemberId.Merge(m, src)
}
func (m *MemberId) XXX_Size() int {
	return xxx_messageInfo_MemberId.Size(m)
}
func (m *MemberId) XXX_DiscardUnknown() {
	xxx_messageInfo_MemberId.DiscardUnknown(m)
}

var xxx_messageInfo_MemberId proto.InternalMessageInfo

func (m *MemberId) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *MemberId) GetNamespace() string {
	if m != nil {
		return m.Namespace
	}
	return ""
}

// Member is a cluster member
type Member struct {
	ID                   *MemberId `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Host                 string    `protobuf:"bytes,2,opt,name=host,proto3" json:"host,omitempty"`
	Port                 int32     `protobuf:"varint,3,opt,name=port,proto3" json:"port,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *Member) Reset()         { *m = Member{} }
func (m *Member) String() string { return proto.CompactTextString(m) }
func (*Member) ProtoMessage()    {}
func (*Member) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{4}
}
func (m *Member) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Member.Unmarshal(m, b)
}
func (m *Member) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Member.Marshal(b, m, deterministic)
}
func (m *Member) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Member.Merge(m, src)
}
func (m *Member) XXX_Size() int {
	return xxx_messageInfo_Member.Size(m)
}
func (m *Member) XXX_DiscardUnknown() {
	xxx_messageInfo_Member.DiscardUnknown(m)
}

var xxx_messageInfo_Member proto.InternalMessageInfo

func (m *Member) GetID() *MemberId {
	if m != nil {
		return m.ID
	}
	return nil
}

func (m *Member) GetHost() string {
	if m != nil {
		return m.Host
	}
	return ""
}

func (m *Member) GetPort() int32 {
	if m != nil {
		return m.Port
	}
	return 0
}

// Partition group identifier
type PartitionGroupId struct {
	Name                 string   `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Namespace            string   `protobuf:"bytes,2,opt,name=namespace,proto3" json:"namespace,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PartitionGroupId) Reset()         { *m = PartitionGroupId{} }
func (m *PartitionGroupId) String() string { return proto.CompactTextString(m) }
func (*PartitionGroupId) ProtoMessage()    {}
func (*PartitionGroupId) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{5}
}
func (m *PartitionGroupId) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PartitionGroupId.Unmarshal(m, b)
}
func (m *PartitionGroupId) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PartitionGroupId.Marshal(b, m, deterministic)
}
func (m *PartitionGroupId) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PartitionGroupId.Merge(m, src)
}
func (m *PartitionGroupId) XXX_Size() int {
	return xxx_messageInfo_PartitionGroupId.Size(m)
}
func (m *PartitionGroupId) XXX_DiscardUnknown() {
	xxx_messageInfo_PartitionGroupId.DiscardUnknown(m)
}

var xxx_messageInfo_PartitionGroupId proto.InternalMessageInfo

func (m *PartitionGroupId) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *PartitionGroupId) GetNamespace() string {
	if m != nil {
		return m.Namespace
	}
	return ""
}

// Partition group state
type PartitionGroup struct {
	ID                   *PartitionGroupId  `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Partitions           []*MembershipGroup `protobuf:"bytes,2,rep,name=partitions,proto3" json:"partitions,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *PartitionGroup) Reset()         { *m = PartitionGroup{} }
func (m *PartitionGroup) String() string { return proto.CompactTextString(m) }
func (*PartitionGroup) ProtoMessage()    {}
func (*PartitionGroup) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{6}
}
func (m *PartitionGroup) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PartitionGroup.Unmarshal(m, b)
}
func (m *PartitionGroup) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PartitionGroup.Marshal(b, m, deterministic)
}
func (m *PartitionGroup) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PartitionGroup.Merge(m, src)
}
func (m *PartitionGroup) XXX_Size() int {
	return xxx_messageInfo_PartitionGroup.Size(m)
}
func (m *PartitionGroup) XXX_DiscardUnknown() {
	xxx_messageInfo_PartitionGroup.DiscardUnknown(m)
}

var xxx_messageInfo_PartitionGroup proto.InternalMessageInfo

func (m *PartitionGroup) GetID() *PartitionGroupId {
	if m != nil {
		return m.ID
	}
	return nil
}

func (m *PartitionGroup) GetPartitions() []*MembershipGroup {
	if m != nil {
		return m.Partitions
	}
	return nil
}

type JoinClusterRequest struct {
	Member               *Member  `protobuf:"bytes,1,opt,name=member,proto3" json:"member,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JoinClusterRequest) Reset()         { *m = JoinClusterRequest{} }
func (m *JoinClusterRequest) String() string { return proto.CompactTextString(m) }
func (*JoinClusterRequest) ProtoMessage()    {}
func (*JoinClusterRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{7}
}
func (m *JoinClusterRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinClusterRequest.Unmarshal(m, b)
}
func (m *JoinClusterRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinClusterRequest.Marshal(b, m, deterministic)
}
func (m *JoinClusterRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinClusterRequest.Merge(m, src)
}
func (m *JoinClusterRequest) XXX_Size() int {
	return xxx_messageInfo_JoinClusterRequest.Size(m)
}
func (m *JoinClusterRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinClusterRequest.DiscardUnknown(m)
}

var xxx_messageInfo_JoinClusterRequest proto.InternalMessageInfo

func (m *JoinClusterRequest) GetMember() *Member {
	if m != nil {
		return m.Member
	}
	return nil
}

type JoinClusterResponse struct {
	Membership           *Membership `protobuf:"bytes,1,opt,name=membership,proto3" json:"membership,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *JoinClusterResponse) Reset()         { *m = JoinClusterResponse{} }
func (m *JoinClusterResponse) String() string { return proto.CompactTextString(m) }
func (*JoinClusterResponse) ProtoMessage()    {}
func (*JoinClusterResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{8}
}
func (m *JoinClusterResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinClusterResponse.Unmarshal(m, b)
}
func (m *JoinClusterResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinClusterResponse.Marshal(b, m, deterministic)
}
func (m *JoinClusterResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinClusterResponse.Merge(m, src)
}
func (m *JoinClusterResponse) XXX_Size() int {
	return xxx_messageInfo_JoinClusterResponse.Size(m)
}
func (m *JoinClusterResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinClusterResponse.DiscardUnknown(m)
}

var xxx_messageInfo_JoinClusterResponse proto.InternalMessageInfo

func (m *JoinClusterResponse) GetMembership() *Membership {
	if m != nil {
		return m.Membership
	}
	return nil
}

type JoinPartitionGroupRequest struct {
	MemberID             *MemberId         `protobuf:"bytes,1,opt,name=member_id,json=memberId,proto3" json:"member_id,omitempty"`
	GroupID              *PartitionGroupId `protobuf:"bytes,2,opt,name=group_id,json=groupId,proto3" json:"group_id,omitempty"`
	Partitions           uint32            `protobuf:"varint,3,opt,name=partitions,proto3" json:"partitions,omitempty"`
	ReplicationFactor    uint32            `protobuf:"varint,4,opt,name=replication_factor,json=replicationFactor,proto3" json:"replication_factor,omitempty"`
	XXX_NoUnkeyedLiteral struct{}          `json:"-"`
	XXX_unrecognized     []byte            `json:"-"`
	XXX_sizecache        int32             `json:"-"`
}

func (m *JoinPartitionGroupRequest) Reset()         { *m = JoinPartitionGroupRequest{} }
func (m *JoinPartitionGroupRequest) String() string { return proto.CompactTextString(m) }
func (*JoinPartitionGroupRequest) ProtoMessage()    {}
func (*JoinPartitionGroupRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{9}
}
func (m *JoinPartitionGroupRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinPartitionGroupRequest.Unmarshal(m, b)
}
func (m *JoinPartitionGroupRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinPartitionGroupRequest.Marshal(b, m, deterministic)
}
func (m *JoinPartitionGroupRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinPartitionGroupRequest.Merge(m, src)
}
func (m *JoinPartitionGroupRequest) XXX_Size() int {
	return xxx_messageInfo_JoinPartitionGroupRequest.Size(m)
}
func (m *JoinPartitionGroupRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinPartitionGroupRequest.DiscardUnknown(m)
}

var xxx_messageInfo_JoinPartitionGroupRequest proto.InternalMessageInfo

func (m *JoinPartitionGroupRequest) GetMemberID() *MemberId {
	if m != nil {
		return m.MemberID
	}
	return nil
}

func (m *JoinPartitionGroupRequest) GetGroupID() *PartitionGroupId {
	if m != nil {
		return m.GroupID
	}
	return nil
}

func (m *JoinPartitionGroupRequest) GetPartitions() uint32 {
	if m != nil {
		return m.Partitions
	}
	return 0
}

func (m *JoinPartitionGroupRequest) GetReplicationFactor() uint32 {
	if m != nil {
		return m.ReplicationFactor
	}
	return 0
}

type JoinPartitionGroupResponse struct {
	Group                *PartitionGroup `protobuf:"bytes,1,opt,name=group,proto3" json:"group,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *JoinPartitionGroupResponse) Reset()         { *m = JoinPartitionGroupResponse{} }
func (m *JoinPartitionGroupResponse) String() string { return proto.CompactTextString(m) }
func (*JoinPartitionGroupResponse) ProtoMessage()    {}
func (*JoinPartitionGroupResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{10}
}
func (m *JoinPartitionGroupResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinPartitionGroupResponse.Unmarshal(m, b)
}
func (m *JoinPartitionGroupResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinPartitionGroupResponse.Marshal(b, m, deterministic)
}
func (m *JoinPartitionGroupResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinPartitionGroupResponse.Merge(m, src)
}
func (m *JoinPartitionGroupResponse) XXX_Size() int {
	return xxx_messageInfo_JoinPartitionGroupResponse.Size(m)
}
func (m *JoinPartitionGroupResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinPartitionGroupResponse.DiscardUnknown(m)
}

var xxx_messageInfo_JoinPartitionGroupResponse proto.InternalMessageInfo

func (m *JoinPartitionGroupResponse) GetGroup() *PartitionGroup {
	if m != nil {
		return m.Group
	}
	return nil
}

type JoinMembershipGroupRequest struct {
	MemberID             *MemberId          `protobuf:"bytes,1,opt,name=member_id,json=memberId,proto3" json:"member_id,omitempty"`
	GroupID              *MembershipGroupId `protobuf:"bytes,2,opt,name=group_id,json=groupId,proto3" json:"group_id,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *JoinMembershipGroupRequest) Reset()         { *m = JoinMembershipGroupRequest{} }
func (m *JoinMembershipGroupRequest) String() string { return proto.CompactTextString(m) }
func (*JoinMembershipGroupRequest) ProtoMessage()    {}
func (*JoinMembershipGroupRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{11}
}
func (m *JoinMembershipGroupRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinMembershipGroupRequest.Unmarshal(m, b)
}
func (m *JoinMembershipGroupRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinMembershipGroupRequest.Marshal(b, m, deterministic)
}
func (m *JoinMembershipGroupRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinMembershipGroupRequest.Merge(m, src)
}
func (m *JoinMembershipGroupRequest) XXX_Size() int {
	return xxx_messageInfo_JoinMembershipGroupRequest.Size(m)
}
func (m *JoinMembershipGroupRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinMembershipGroupRequest.DiscardUnknown(m)
}

var xxx_messageInfo_JoinMembershipGroupRequest proto.InternalMessageInfo

func (m *JoinMembershipGroupRequest) GetMemberID() *MemberId {
	if m != nil {
		return m.MemberID
	}
	return nil
}

func (m *JoinMembershipGroupRequest) GetGroupID() *MembershipGroupId {
	if m != nil {
		return m.GroupID
	}
	return nil
}

type JoinMembershipGroupResponse struct {
	Group                *MembershipGroup `protobuf:"bytes,1,opt,name=group,proto3" json:"group,omitempty"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *JoinMembershipGroupResponse) Reset()         { *m = JoinMembershipGroupResponse{} }
func (m *JoinMembershipGroupResponse) String() string { return proto.CompactTextString(m) }
func (*JoinMembershipGroupResponse) ProtoMessage()    {}
func (*JoinMembershipGroupResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_a404d041e576e302, []int{12}
}
func (m *JoinMembershipGroupResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinMembershipGroupResponse.Unmarshal(m, b)
}
func (m *JoinMembershipGroupResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinMembershipGroupResponse.Marshal(b, m, deterministic)
}
func (m *JoinMembershipGroupResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinMembershipGroupResponse.Merge(m, src)
}
func (m *JoinMembershipGroupResponse) XXX_Size() int {
	return xxx_messageInfo_JoinMembershipGroupResponse.Size(m)
}
func (m *JoinMembershipGroupResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinMembershipGroupResponse.DiscardUnknown(m)
}

var xxx_messageInfo_JoinMembershipGroupResponse proto.InternalMessageInfo

func (m *JoinMembershipGroupResponse) GetGroup() *MembershipGroup {
	if m != nil {
		return m.Group
	}
	return nil
}

func init() {
	proto.RegisterType((*Membership)(nil), "atomix.controller.Membership")
	proto.RegisterType((*MembershipGroupId)(nil), "atomix.controller.MembershipGroupId")
	proto.RegisterType((*MembershipGroup)(nil), "atomix.controller.MembershipGroup")
	proto.RegisterType((*MemberId)(nil), "atomix.controller.MemberId")
	proto.RegisterType((*Member)(nil), "atomix.controller.Member")
	proto.RegisterType((*PartitionGroupId)(nil), "atomix.controller.PartitionGroupId")
	proto.RegisterType((*PartitionGroup)(nil), "atomix.controller.PartitionGroup")
	proto.RegisterType((*JoinClusterRequest)(nil), "atomix.controller.JoinClusterRequest")
	proto.RegisterType((*JoinClusterResponse)(nil), "atomix.controller.JoinClusterResponse")
	proto.RegisterType((*JoinPartitionGroupRequest)(nil), "atomix.controller.JoinPartitionGroupRequest")
	proto.RegisterType((*JoinPartitionGroupResponse)(nil), "atomix.controller.JoinPartitionGroupResponse")
	proto.RegisterType((*JoinMembershipGroupRequest)(nil), "atomix.controller.JoinMembershipGroupRequest")
	proto.RegisterType((*JoinMembershipGroupResponse)(nil), "atomix.controller.JoinMembershipGroupResponse")
}

func init() { proto.RegisterFile("atomix/controller/membership.proto", fileDescriptor_a404d041e576e302) }

var fileDescriptor_a404d041e576e302 = []byte{
	// 631 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xac, 0x55, 0xcd, 0x6e, 0xd3, 0x4c,
	0x14, 0x95, 0x5d, 0xd7, 0x49, 0x6e, 0xfa, 0xf5, 0x23, 0xc3, 0x8f, 0xdc, 0x14, 0x9a, 0x32, 0x14,
	0xd4, 0x05, 0x4d, 0x20, 0x59, 0x80, 0x44, 0x59, 0x10, 0x42, 0xab, 0xf0, 0x23, 0x21, 0x53, 0xc4,
	0x8e, 0xca, 0x4d, 0x86, 0xd4, 0x52, 0x9c, 0x31, 0xe3, 0x49, 0xc5, 0x43, 0xb0, 0x80, 0x57, 0xe1,
	0x31, 0x78, 0x88, 0x2c, 0xf2, 0x18, 0xdd, 0x80, 0x3c, 0x33, 0x6e, 0x6c, 0xc7, 0x69, 0xac, 0x8a,
	0x95, 0xc7, 0x73, 0xcf, 0x9c, 0x7b, 0xe6, 0xdc, 0x7b, 0x6d, 0xc0, 0x0e, 0xa7, 0x9e, 0xfb, 0xad,
	0xd1, 0xa3, 0x23, 0xce, 0xe8, 0x70, 0x48, 0x58, 0xc3, 0x23, 0xde, 0x09, 0x61, 0xc1, 0xa9, 0xeb,
	0xd7, 0x7d, 0x46, 0x39, 0x45, 0x15, 0x89, 0xa9, 0xcf, 0x30, 0xd5, 0x1b, 0x03, 0x3a, 0xa0, 0x22,
	0xda, 0x08, 0x57, 0x12, 0x88, 0x5f, 0x00, 0xbc, 0xbb, 0x38, 0x8c, 0x5a, 0x50, 0x50, 0x54, 0x96,
	0xb6, 0xbd, 0xb2, 0x5b, 0x6e, 0x6e, 0xd4, 0xe7, 0x88, 0xea, 0x12, 0x6f, 0x47, 0x48, 0xfc, 0x0a,
	0x2a, 0x33, 0x8a, 0x43, 0x46, 0xc7, 0x7e, 0xb7, 0x8f, 0x10, 0x18, 0x23, 0xc7, 0x23, 0x96, 0xb6,
	0xad, 0xed, 0x96, 0x6c, 0xb1, 0x46, 0xb7, 0xa1, 0x14, 0x3e, 0x03, 0xdf, 0xe9, 0x11, 0x4b, 0x17,
	0x81, 0xd9, 0x06, 0xfe, 0xad, 0xc1, 0xff, 0x29, 0x1e, 0xb4, 0x0f, 0xba, 0xdb, 0x17, 0x1c, 0xe5,
	0xe6, 0xce, 0x42, 0x29, 0xb1, 0xbc, 0x6d, 0x73, 0x3a, 0xa9, 0xe9, 0xdd, 0x8e, 0xad, 0xbb, 0x7d,
	0xb4, 0x05, 0x06, 0x27, 0xcc, 0x13, 0xa9, 0x8c, 0x36, 0x9c, 0x4f, 0x6a, 0xe6, 0x11, 0x61, 0x5e,
	0xb7, 0x63, 0x8b, 0x7d, 0xb4, 0x03, 0xe6, 0x90, 0x38, 0x7d, 0xc2, 0xac, 0x95, 0x50, 0x4c, 0x7b,
	0xed, 0x7c, 0x52, 0x2b, 0x4a, 0xca, 0x6e, 0xc7, 0x56, 0xb1, 0xb8, 0x27, 0x46, 0x6e, 0x4f, 0xf6,
	0x21, 0x22, 0xba, 0x8a, 0x15, 0x04, 0x4c, 0x79, 0x1a, 0xb5, 0x62, 0x06, 0x6c, 0x2e, 0xcc, 0x9b,
	0xba, 0x37, 0x02, 0xe3, 0x94, 0x06, 0x5c, 0xf1, 0x8a, 0x75, 0xb8, 0xe7, 0x53, 0xc6, 0xc5, 0x4d,
	0x57, 0x6d, 0xb1, 0xc6, 0x1d, 0xb8, 0xf6, 0xde, 0x61, 0xdc, 0xe5, 0x2e, 0x1d, 0x5d, 0xbd, 0x6e,
	0x3f, 0x35, 0x58, 0x4f, 0xd2, 0xa0, 0x67, 0x31, 0xd5, 0xf7, 0x32, 0x54, 0xa7, 0xb3, 0x26, 0xd4,
	0xb7, 0x01, 0xfc, 0x28, 0x1e, 0x58, 0xba, 0xb0, 0x1c, 0x2f, 0xaf, 0xbd, 0x1d, 0x3b, 0x85, 0x0f,
	0x01, 0xbd, 0xa6, 0xee, 0xe8, 0xe5, 0x70, 0x1c, 0x70, 0xc2, 0x6c, 0xf2, 0x75, 0x4c, 0x02, 0x8e,
	0x1e, 0x83, 0x29, 0xeb, 0xa3, 0xa4, 0x5d, 0x52, 0x48, 0x05, 0xc4, 0x47, 0x70, 0x3d, 0x41, 0x14,
	0xf8, 0x74, 0x14, 0x10, 0xf4, 0x1c, 0x60, 0x36, 0x72, 0x8a, 0xed, 0xce, 0xa5, 0x1a, 0xed, 0xd8,
	0x01, 0xfc, 0x47, 0x83, 0x8d, 0x90, 0x36, 0xe9, 0x43, 0x24, 0xf3, 0x00, 0x4a, 0x12, 0x7b, 0x9c,
	0xaf, 0xf4, 0x6b, 0xd3, 0x78, 0xdb, 0x16, 0xbd, 0xa8, 0xef, 0xde, 0x40, 0x71, 0x10, 0xf2, 0x86,
	0x34, 0x7a, 0xfe, 0x5a, 0x94, 0xa7, 0x93, 0x5a, 0x41, 0xbe, 0x74, 0xec, 0xc2, 0x40, 0xf5, 0xc5,
	0x56, 0xa2, 0x2a, 0x61, 0x17, 0xfd, 0x17, 0x77, 0x1c, 0xed, 0x01, 0x62, 0xc4, 0x1f, 0xba, 0x3d,
	0x27, 0x7c, 0x3f, 0xfe, 0xe2, 0xf4, 0x38, 0x65, 0x96, 0x21, 0x70, 0x95, 0x58, 0xe4, 0x40, 0x04,
	0xf0, 0x47, 0xa8, 0x66, 0x19, 0xa0, 0xec, 0x7d, 0x02, 0xab, 0x22, 0xaf, 0xba, 0xfd, 0xdd, 0xa5,
	0xb2, 0x6d, 0x89, 0xc7, 0xbf, 0x34, 0xc9, 0x9b, 0xee, 0x8d, 0x7f, 0xec, 0xec, 0xdb, 0x39, 0x67,
	0xf3, 0x7d, 0x9c, 0x32, 0xad, 0xc5, 0x9f, 0x60, 0x33, 0x53, 0xb3, 0x32, 0xe3, 0x69, 0xd2, 0x8c,
	0x3c, 0xa3, 0x20, 0x0f, 0x34, 0x7d, 0x58, 0x57, 0x8d, 0xfb, 0x81, 0xb0, 0x33, 0xb7, 0x47, 0xd0,
	0x67, 0x28, 0xc7, 0xda, 0x19, 0xdd, 0xcf, 0xe0, 0x9a, 0x9f, 0x9b, 0xea, 0x83, 0x65, 0x30, 0xa9,
	0xf4, 0x91, 0xd6, 0xfc, 0xae, 0xc1, 0xcd, 0x64, 0x65, 0xa2, 0xcc, 0x81, 0x9c, 0xc8, 0xd4, 0x87,
	0xe2, 0xe1, 0x02, 0xe6, 0xcc, 0xc1, 0xa8, 0xee, 0xe5, 0x44, 0x5f, 0xc8, 0xf9, 0xa1, 0xc1, 0xad,
	0x94, 0x37, 0x91, 0x9e, 0x33, 0x39, 0xd8, 0xe9, 0x1f, 0xce, 0xa2, 0x14, 0xd9, 0x0d, 0x55, 0xad,
	0xe7, 0x85, 0x47, 0x92, 0x4e, 0x4c, 0xf1, 0xdb, 0x6d, 0xfd, 0x0d, 0x00, 0x00, 0xff, 0xff, 0x05,
	0xd7, 0xc0, 0x36, 0xc5, 0x07, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ClusterServiceClient is the client API for ClusterService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ClusterServiceClient interface {
	// Joins a member to the cluster
	JoinCluster(ctx context.Context, in *JoinClusterRequest, opts ...grpc.CallOption) (ClusterService_JoinClusterClient, error)
}

type clusterServiceClient struct {
	cc *grpc.ClientConn
}

func NewClusterServiceClient(cc *grpc.ClientConn) ClusterServiceClient {
	return &clusterServiceClient{cc}
}

func (c *clusterServiceClient) JoinCluster(ctx context.Context, in *JoinClusterRequest, opts ...grpc.CallOption) (ClusterService_JoinClusterClient, error) {
	stream, err := c.cc.NewStream(ctx, &_ClusterService_serviceDesc.Streams[0], "/atomix.controller.ClusterService/JoinCluster", opts...)
	if err != nil {
		return nil, err
	}
	x := &clusterServiceJoinClusterClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type ClusterService_JoinClusterClient interface {
	Recv() (*JoinClusterResponse, error)
	grpc.ClientStream
}

type clusterServiceJoinClusterClient struct {
	grpc.ClientStream
}

func (x *clusterServiceJoinClusterClient) Recv() (*JoinClusterResponse, error) {
	m := new(JoinClusterResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// ClusterServiceServer is the server API for ClusterService service.
type ClusterServiceServer interface {
	// Joins a member to the cluster
	JoinCluster(*JoinClusterRequest, ClusterService_JoinClusterServer) error
}

// UnimplementedClusterServiceServer can be embedded to have forward compatible implementations.
type UnimplementedClusterServiceServer struct {
}

func (*UnimplementedClusterServiceServer) JoinCluster(req *JoinClusterRequest, srv ClusterService_JoinClusterServer) error {
	return status.Errorf(codes.Unimplemented, "method JoinCluster not implemented")
}

func RegisterClusterServiceServer(s *grpc.Server, srv ClusterServiceServer) {
	s.RegisterService(&_ClusterService_serviceDesc, srv)
}

func _ClusterService_JoinCluster_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(JoinClusterRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(ClusterServiceServer).JoinCluster(m, &clusterServiceJoinClusterServer{stream})
}

type ClusterService_JoinClusterServer interface {
	Send(*JoinClusterResponse) error
	grpc.ServerStream
}

type clusterServiceJoinClusterServer struct {
	grpc.ServerStream
}

func (x *clusterServiceJoinClusterServer) Send(m *JoinClusterResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _ClusterService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.controller.ClusterService",
	HandlerType: (*ClusterServiceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "JoinCluster",
			Handler:       _ClusterService_JoinCluster_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "atomix/controller/membership.proto",
}

// PartitionGroupServiceClient is the client API for PartitionGroupService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type PartitionGroupServiceClient interface {
	// Joins a member to a partition group
	JoinPartitionGroup(ctx context.Context, in *JoinPartitionGroupRequest, opts ...grpc.CallOption) (PartitionGroupService_JoinPartitionGroupClient, error)
}

type partitionGroupServiceClient struct {
	cc *grpc.ClientConn
}

func NewPartitionGroupServiceClient(cc *grpc.ClientConn) PartitionGroupServiceClient {
	return &partitionGroupServiceClient{cc}
}

func (c *partitionGroupServiceClient) JoinPartitionGroup(ctx context.Context, in *JoinPartitionGroupRequest, opts ...grpc.CallOption) (PartitionGroupService_JoinPartitionGroupClient, error) {
	stream, err := c.cc.NewStream(ctx, &_PartitionGroupService_serviceDesc.Streams[0], "/atomix.controller.PartitionGroupService/JoinPartitionGroup", opts...)
	if err != nil {
		return nil, err
	}
	x := &partitionGroupServiceJoinPartitionGroupClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type PartitionGroupService_JoinPartitionGroupClient interface {
	Recv() (*JoinPartitionGroupResponse, error)
	grpc.ClientStream
}

type partitionGroupServiceJoinPartitionGroupClient struct {
	grpc.ClientStream
}

func (x *partitionGroupServiceJoinPartitionGroupClient) Recv() (*JoinPartitionGroupResponse, error) {
	m := new(JoinPartitionGroupResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// PartitionGroupServiceServer is the server API for PartitionGroupService service.
type PartitionGroupServiceServer interface {
	// Joins a member to a partition group
	JoinPartitionGroup(*JoinPartitionGroupRequest, PartitionGroupService_JoinPartitionGroupServer) error
}

// UnimplementedPartitionGroupServiceServer can be embedded to have forward compatible implementations.
type UnimplementedPartitionGroupServiceServer struct {
}

func (*UnimplementedPartitionGroupServiceServer) JoinPartitionGroup(req *JoinPartitionGroupRequest, srv PartitionGroupService_JoinPartitionGroupServer) error {
	return status.Errorf(codes.Unimplemented, "method JoinPartitionGroup not implemented")
}

func RegisterPartitionGroupServiceServer(s *grpc.Server, srv PartitionGroupServiceServer) {
	s.RegisterService(&_PartitionGroupService_serviceDesc, srv)
}

func _PartitionGroupService_JoinPartitionGroup_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(JoinPartitionGroupRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(PartitionGroupServiceServer).JoinPartitionGroup(m, &partitionGroupServiceJoinPartitionGroupServer{stream})
}

type PartitionGroupService_JoinPartitionGroupServer interface {
	Send(*JoinPartitionGroupResponse) error
	grpc.ServerStream
}

type partitionGroupServiceJoinPartitionGroupServer struct {
	grpc.ServerStream
}

func (x *partitionGroupServiceJoinPartitionGroupServer) Send(m *JoinPartitionGroupResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _PartitionGroupService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.controller.PartitionGroupService",
	HandlerType: (*PartitionGroupServiceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "JoinPartitionGroup",
			Handler:       _PartitionGroupService_JoinPartitionGroup_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "atomix/controller/membership.proto",
}

// MembershipGroupServiceClient is the client API for MembershipGroupService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type MembershipGroupServiceClient interface {
	// Joins a member to a membership group
	JoinMembershipGroup(ctx context.Context, in *JoinMembershipGroupRequest, opts ...grpc.CallOption) (MembershipGroupService_JoinMembershipGroupClient, error)
}

type membershipGroupServiceClient struct {
	cc *grpc.ClientConn
}

func NewMembershipGroupServiceClient(cc *grpc.ClientConn) MembershipGroupServiceClient {
	return &membershipGroupServiceClient{cc}
}

func (c *membershipGroupServiceClient) JoinMembershipGroup(ctx context.Context, in *JoinMembershipGroupRequest, opts ...grpc.CallOption) (MembershipGroupService_JoinMembershipGroupClient, error) {
	stream, err := c.cc.NewStream(ctx, &_MembershipGroupService_serviceDesc.Streams[0], "/atomix.controller.MembershipGroupService/JoinMembershipGroup", opts...)
	if err != nil {
		return nil, err
	}
	x := &membershipGroupServiceJoinMembershipGroupClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type MembershipGroupService_JoinMembershipGroupClient interface {
	Recv() (*JoinMembershipGroupResponse, error)
	grpc.ClientStream
}

type membershipGroupServiceJoinMembershipGroupClient struct {
	grpc.ClientStream
}

func (x *membershipGroupServiceJoinMembershipGroupClient) Recv() (*JoinMembershipGroupResponse, error) {
	m := new(JoinMembershipGroupResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// MembershipGroupServiceServer is the server API for MembershipGroupService service.
type MembershipGroupServiceServer interface {
	// Joins a member to a membership group
	JoinMembershipGroup(*JoinMembershipGroupRequest, MembershipGroupService_JoinMembershipGroupServer) error
}

// UnimplementedMembershipGroupServiceServer can be embedded to have forward compatible implementations.
type UnimplementedMembershipGroupServiceServer struct {
}

func (*UnimplementedMembershipGroupServiceServer) JoinMembershipGroup(req *JoinMembershipGroupRequest, srv MembershipGroupService_JoinMembershipGroupServer) error {
	return status.Errorf(codes.Unimplemented, "method JoinMembershipGroup not implemented")
}

func RegisterMembershipGroupServiceServer(s *grpc.Server, srv MembershipGroupServiceServer) {
	s.RegisterService(&_MembershipGroupService_serviceDesc, srv)
}

func _MembershipGroupService_JoinMembershipGroup_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(JoinMembershipGroupRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(MembershipGroupServiceServer).JoinMembershipGroup(m, &membershipGroupServiceJoinMembershipGroupServer{stream})
}

type MembershipGroupService_JoinMembershipGroupServer interface {
	Send(*JoinMembershipGroupResponse) error
	grpc.ServerStream
}

type membershipGroupServiceJoinMembershipGroupServer struct {
	grpc.ServerStream
}

func (x *membershipGroupServiceJoinMembershipGroupServer) Send(m *JoinMembershipGroupResponse) error {
	return x.ServerStream.SendMsg(m)
}

var _MembershipGroupService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "atomix.controller.MembershipGroupService",
	HandlerType: (*MembershipGroupServiceServer)(nil),
	Methods:     []grpc.MethodDesc{},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "JoinMembershipGroup",
			Handler:       _MembershipGroupService_JoinMembershipGroup_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "atomix/controller/membership.proto",
}
