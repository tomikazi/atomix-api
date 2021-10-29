#!/bin/sh

proto_path="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

mkdir -p docs
mkdir -p docs/management/broker/v1
mkdir -p docs/management/driver/v1
mkdir -p docs/protocol
mkdir -p docs/primitive
mkdir -p docs/primitive/counter/v1
mkdir -p docs/primitive/election/v1
mkdir -p docs/primitive/indexmap/v1
mkdir -p docs/primitive/leader/v1
mkdir -p docs/primitive/list/v1
mkdir -p docs/primitive/lock/v1
mkdir -p docs/primitive/log/v1
mkdir -p docs/primitive/map/v1
mkdir -p docs/primitive/set/v1
mkdir -p docs/primitive/value/v1

protoc -I=$proto_path --doc_out=docs/management/broker/v1 --doc_opt=markdown,broker.md    proto/atomix/management/broker/v1/*.proto
protoc -I=$proto_path --doc_out=docs/management/driver/v1 --doc_opt=markdown,driver.md    proto/atomix/management/driver/v1/*.proto

protoc -I=$proto_path --doc_out=docs/protocol --doc_opt=markdown,protocol.md  proto/atomix/protocol/*.proto

protoc -I=$proto_path --doc_out=docs/primitive             --doc_opt=markdown,primitive.md proto/atomix/primitive/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/counter/v1  --doc_opt=markdown,primitive.md proto/atomix/primitive/counter/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/counter/v1  --doc_opt=markdown,session.md   proto/atomix/primitive/counter/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/election/v1 --doc_opt=markdown,primitive.md proto/atomix/primitive/election/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/election/v1 --doc_opt=markdown,session.md   proto/atomix/primitive/election/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/indexmap/v1 --doc_opt=markdown,primitive.md proto/atomix/primitive/indexedmap/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/indexmap/v1 --doc_opt=markdown,session.md   proto/atomix/primitive/indexedmap/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/leader/v1   --doc_opt=markdown,primitive.md proto/atomix/primitive/leader/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/leader/v1   --doc_opt=markdown,session.md   proto/atomix/primitive/leader/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/list/v1     --doc_opt=markdown,primitive.md proto/atomix/primitive/list/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/list/v1     --doc_opt=markdown,session.md   proto/atomix/primitive/list/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/lock/v1     --doc_opt=markdown,primitive.md proto/atomix/primitive/lock/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/lock/v1     --doc_opt=markdown,session.md   proto/atomix/primitive/lock/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/log/v1      --doc_opt=markdown,primitive.md proto/atomix/primitive/log/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/log/v1      --doc_opt=markdown,session.md   proto/atomix/primitive/log/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/map/v1      --doc_opt=markdown,primitive.md proto/atomix/primitive/map/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/map/v1      --doc_opt=markdown,session.md   proto/atomix/primitive/map/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/set/v1      --doc_opt=markdown,primitive.md proto/atomix/primitive/set/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/set/v1      --doc_opt=markdown,session.md   proto/atomix/primitive/set/v1/session.proto
protoc -I=$proto_path --doc_out=docs/primitive/value/v1    --doc_opt=markdown,primitive.md proto/atomix/primitive/value/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/value/v1    --doc_opt=markdown,session.md   proto/atomix/primitive/value/v1/session.proto

go_import_paths="Mgoogle/protobuf/any.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/descriptor.proto=github.com/golang/protobuf/protoc-gen-go/descriptor"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/protocol,plugins=grpc:go       proto/atomix/protocol/*.proto

go_import_paths="${go_import_paths},Matomix/protocol/protocol.proto=github.com/atomix/atomix-api/go/atomix/protocol"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/meta,plugins=grpc:go proto/atomix/primitive/meta/*.proto

go_import_paths="${go_import_paths},Matomix/primitive/meta/timestamp.proto=github.com/atomix/atomix-api/go/atomix/primitive/meta"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive,plugins=grpc:go      proto/atomix/primitive/primitive.proto

go_import_paths="${go_import_paths},Matomix/primitive/primitive.proto=github.com/atomix/atomix-api/go/atomix/primitive"
go_import_paths="${go_import_paths},Matomix/primitive/meta/object.proto=github.com/atomix/atomix-api/go/atomix/primitive/meta"

protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/primitive,plugins=grpc:go proto/atomix/primitive/primitive.proto
mkdir -p go/atomix/primitive/extensions/primitive && mv go/atomix/primitive/primitive.pb.go go/atomix/primitive/extensions/primitive/primitive.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/operation,plugins=grpc:go proto/atomix/primitive/operation.proto
mkdir -p go/atomix/primitive/extensions/operation && mv go/atomix/primitive/operation.pb.go go/atomix/primitive/extensions/operation/operation.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/service,plugins=grpc:go proto/atomix/primitive/service.proto
mkdir -p go/atomix/primitive/extensions/service && mv go/atomix/primitive/service.pb.go go/atomix/primitive/extensions/service/service.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/session,plugins=grpc:go proto/atomix/primitive/session.proto
mkdir -p go/atomix/primitive/extensions/session && mv go/atomix/primitive/session.pb.go go/atomix/primitive/extensions/session/session.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/partition,plugins=grpc:go proto/atomix/primitive/partition.proto
mkdir -p go/atomix/primitive/extensions/partition && mv go/atomix/primitive/partition.pb.go go/atomix/primitive/extensions/partition/partition.pb.go

go_import_paths="${go_import_paths},Matomix/primitive/primitive.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/primitive"
go_import_paths="${go_import_paths},Matomix/primitive/operation.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/operation"
go_import_paths="${go_import_paths},Matomix/primitive/service.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/service"
go_import_paths="${go_import_paths},Matomix/primitive/session.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/session"
go_import_paths="${go_import_paths},Matomix/primitive/partition.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/partition"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/management/broker/v1,plugins=grpc:go proto/atomix/management/broker/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/management/driver/v1,plugins=grpc:go proto/atomix/management/driver/v1/*.proto

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/counter,plugins=grpc:go    proto/atomix/primitive/counter/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/election,plugins=grpc:go   proto/atomix/primitive/election/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/indexedmap,plugins=grpc:go proto/atomix/primitive/indexedmap/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/leader,plugins=grpc:go     proto/atomix/primitive/leader/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/list,plugins=grpc:go       proto/atomix/primitive/list/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/lock,plugins=grpc:go       proto/atomix/primitive/lock/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/log,plugins=grpc:go        proto/atomix/primitive/log/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/map,plugins=grpc:go        proto/atomix/primitive/map/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/set,plugins=grpc:go        proto/atomix/primitive/set/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/value,plugins=grpc:go      proto/atomix/primitive/value/v1/*.proto

protoc --proto_path=$proto_path \
    --python_betterproto_out=./python \
    $(find proto -name "*.proto")

protoc --proto_path=$proto_path \
    --grpc-java_out=./java \
    $(find proto -name "*.proto")
