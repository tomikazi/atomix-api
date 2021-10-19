#!/bin/sh

proto_path="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

mkdir -p docs
mkdir -p docs/management/broker
mkdir -p docs/management/driver
mkdir -p docs/protocol
mkdir -p docs/primitive
mkdir -p docs/primitive/counter/v0
mkdir -p docs/primitive/counter/v1
mkdir -p docs/primitive/election/v0
mkdir -p docs/primitive/election/v1
mkdir -p docs/primitive/indexmap/v0
mkdir -p docs/primitive/indexmap/v1
mkdir -p docs/primitive/leader/v0
mkdir -p docs/primitive/leader/v1
mkdir -p docs/primitive/list/v0
mkdir -p docs/primitive/list/v1
mkdir -p docs/primitive/lock/v0
mkdir -p docs/primitive/lock/v1
mkdir -p docs/primitive/log/v0
mkdir -p docs/primitive/log/v1
mkdir -p docs/primitive/map/v0
mkdir -p docs/primitive/map/v1
mkdir -p docs/primitive/set/v0
mkdir -p docs/primitive/set/v1
mkdir -p docs/primitive/value/v0
mkdir -p docs/primitive/value/v1

protoc -I=$proto_path --doc_out=docs/management/broker --doc_opt=markdown,broker.md    proto/atomix/management/broker/*.proto
protoc -I=$proto_path --doc_out=docs/management/driver --doc_opt=markdown,driver.md    proto/atomix/management/driver/*.proto

protoc -I=$proto_path --doc_out=docs/protocol --doc_opt=markdown,protocol.md  proto/atomix/protocol/*.proto

protoc -I=$proto_path --doc_out=docs/primitive             --doc_opt=markdown,primitive.md proto/atomix/primitive/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/counter     --doc_opt=markdown,counter.md   proto/atomix/primitive/counter/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/counter/v1  --doc_opt=markdown,primitive.md proto/atomix/primitive/counter/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/counter/v1  --doc_opt=markdown,manager.md   proto/atomix/primitive/counter/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/election    --doc_opt=markdown,election.md  proto/atomix/primitive/election/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/election/v1 --doc_opt=markdown,election.md  proto/atomix/primitive/election/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/election/v1 --doc_opt=markdown,election.md  proto/atomix/primitive/election/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/indexmap    --doc_opt=markdown,indexmap.md  proto/atomix/primitive/indexedmap/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/indexmap/v1 --doc_opt=markdown,indexmap.md  proto/atomix/primitive/indexedmap/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/indexmap/v1 --doc_opt=markdown,indexmap.md  proto/atomix/primitive/indexedmap/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/leader      --doc_opt=markdown,leader.md    proto/atomix/primitive/leader/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/leader/v1   --doc_opt=markdown,leader.md    proto/atomix/primitive/leader/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/leader/v1   --doc_opt=markdown,leader.md    proto/atomix/primitive/leader/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/list        --doc_opt=markdown,list.md      proto/atomix/primitive/list/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/list/v1     --doc_opt=markdown,list.md      proto/atomix/primitive/list/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/list/v1     --doc_opt=markdown,list.md      proto/atomix/primitive/list/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/lock        --doc_opt=markdown,lock.md      proto/atomix/primitive/lock/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/lock/v1     --doc_opt=markdown,lock.md      proto/atomix/primitive/lock/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/lock/v1     --doc_opt=markdown,lock.md      proto/atomix/primitive/lock/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/log         --doc_opt=markdown,log.md       proto/atomix/primitive/log/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/log/v1      --doc_opt=markdown,log.md       proto/atomix/primitive/log/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/log/v1      --doc_opt=markdown,log.md       proto/atomix/primitive/log/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/map         --doc_opt=markdown,map.md       proto/atomix/primitive/map/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/map/v1      --doc_opt=markdown,map.md       proto/atomix/primitive/map/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/map/v1      --doc_opt=markdown,map.md       proto/atomix/primitive/map/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/set         --doc_opt=markdown,set.md       proto/atomix/primitive/set/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/set/v1      --doc_opt=markdown,set.md       proto/atomix/primitive/set/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/set/v1      --doc_opt=markdown,set.md       proto/atomix/primitive/set/v1/manager.proto
protoc -I=$proto_path --doc_out=docs/primitive/value       --doc_opt=markdown,value.md     proto/atomix/primitive/value/*.proto
protoc -I=$proto_path --doc_out=docs/primitive/value/v1    --doc_opt=markdown,value.md     proto/atomix/primitive/value/v1/primitive.proto
protoc -I=$proto_path --doc_out=docs/primitive/value/v1    --doc_opt=markdown,value.md     proto/atomix/primitive/value/v1/manager.proto

go_import_paths="Mgoogle/protobuf/any.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/descriptor.proto=github.com/golang/protobuf/protoc-gen-go/descriptor"

protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/primitive,plugins=grpc:go proto/atomix/primitive/primitive.proto
mkdir -p go/atomix/primitive/extensions/primitive && mv go/atomix/primitive/primitive.pb.go go/atomix/primitive/extensions/primitive/primitive.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/operation,plugins=grpc:go proto/atomix/primitive/operation.proto
mkdir -p go/atomix/primitive/extensions/operation && mv go/atomix/primitive/operation.pb.go go/atomix/primitive/extensions/operation/operation.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/manager,plugins=grpc:go proto/atomix/primitive/manager.proto
mkdir -p go/atomix/primitive/extensions/manager && mv go/atomix/primitive/manager.pb.go go/atomix/primitive/extensions/manager/manager.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/extensions/partition,plugins=grpc:go proto/atomix/primitive/partition.proto
mkdir -p go/atomix/primitive/extensions/partition && mv go/atomix/primitive/partition.pb.go go/atomix/primitive/extensions/partition/partition.pb.go

go_import_paths="${go_import_paths},Matomix/primitive/primitive.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/primitive"
go_import_paths="${go_import_paths},Matomix/primitive/operation.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/operation"
go_import_paths="${go_import_paths},Matomix/primitive/manager.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/manager"
go_import_paths="${go_import_paths},Matomix/primitive/partition.proto=github.com/atomix/atomix-api/go/atomix/primitive/extensions/partition"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/protocol,plugins=grpc:go       proto/atomix/protocol/*.proto

go_import_paths="${go_import_paths},Matomix/protocol/protocol.proto=github.com/atomix/atomix-api/go/atomix/protocol"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/meta,plugins=grpc:go proto/atomix/primitive/meta/*.proto

go_import_paths="${go_import_paths},Matomix/primitive/meta/timestamp.proto=github.com/atomix/atomix-api/go/atomix/primitive/meta"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive,plugins=grpc:go      proto/atomix/primitive/primitive.proto

go_import_paths="${go_import_paths},Matomix/primitive/primitive.proto=github.com/atomix/atomix-api/go/atomix/primitive"
go_import_paths="${go_import_paths},Matomix/primitive/meta/object.proto=github.com/atomix/atomix-api/go/atomix/primitive/meta"
go_import_paths="${go_import_paths},Matomix/primitive/meta/timestamp.proto=github.com/atomix/atomix-api/go/atomix/primitive/meta"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/management/broker,plugins=grpc:go proto/atomix/management/broker/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/management/driver,plugins=grpc:go proto/atomix/management/driver/*.proto

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/counter,plugins=grpc:go       proto/atomix/primitive/counter/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/counter,plugins=grpc:go    proto/atomix/primitive/counter/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/election,plugins=grpc:go      proto/atomix/primitive/election/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/election,plugins=grpc:go   proto/atomix/primitive/election/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/indexedmap,plugins=grpc:go    proto/atomix/primitive/indexedmap/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/indexedmap,plugins=grpc:go proto/atomix/primitive/indexedmap/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/leader,plugins=grpc:go        proto/atomix/primitive/leader/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/leader,plugins=grpc:go     proto/atomix/primitive/leader/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/list,plugins=grpc:go          proto/atomix/primitive/list/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/list,plugins=grpc:go       proto/atomix/primitive/list/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/lock,plugins=grpc:go          proto/atomix/primitive/lock/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/lock,plugins=grpc:go       proto/atomix/primitive/lock/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/log,plugins=grpc:go           proto/atomix/primitive/log/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/log,plugins=grpc:go        proto/atomix/primitive/log/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/map,plugins=grpc:go           proto/atomix/primitive/map/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/map,plugins=grpc:go        proto/atomix/primitive/map/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/set,plugins=grpc:go           proto/atomix/primitive/set/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/set,plugins=grpc:go        proto/atomix/primitive/set/v1/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/value,plugins=grpc:go         proto/atomix/primitive/value/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/atomix-api/go/atomix/primitive/v1/value,plugins=grpc:go      proto/atomix/primitive/value/v1/*.proto

protoc --proto_path=$proto_path \
    --python_betterproto_out=./python \
    $(find proto -name "*.proto")

protoc --proto_path=$proto_path \
    --grpc-java_out=./java \
    $(find proto -name "*.proto")
