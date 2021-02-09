#!/bin/sh

proto_path="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,driver.md     proto/atomix/driver/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,proxy.md      proto/atomix/proxy/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,protocol.md   proto/atomix/protocol/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,primitive.md  proto/atomix/primitive/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,counter.md    proto/atomix/primitive/counter/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,election.md   proto/atomix/primitive/election/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,indexmap.md   proto/atomix/primitive/indexedmap/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,leader.md     proto/atomix/primitive/leader/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,list.md       proto/atomix/primitive/list/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,lock.md       proto/atomix/primitive/lock/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,log.md        proto/atomix/primitive/log/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,map.md        proto/atomix/primitive/map/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,set.md        proto/atomix/primitive/set/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,value.md      proto/atomix/primitive/value/*.proto

go_import_paths="Mgoogle/protobuf/any.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/descriptor.proto=github.com/golang/protobuf/protoc-gen-go/descriptor"

protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/extensions/service,plugins=grpc:go proto/atomix/primitive/service.proto
mkdir -p go/atomix/primitive/extensions/service && mv go/atomix/primitive/service.pb.go go/atomix/primitive/extensions/service/service.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/extensions/operation,plugins=grpc:go proto/atomix/primitive/operation.proto
mkdir -p go/atomix/primitive/extensions/operation && mv go/atomix/primitive/operation.pb.go go/atomix/primitive/extensions/operation/operation.pb.go
protoc -I=$proto_path --go_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/extensions/partition,plugins=grpc:go proto/atomix/primitive/partition.proto
mkdir -p go/atomix/primitive/extensions/partition && mv go/atomix/primitive/partition.pb.go go/atomix/primitive/extensions/partition/partition.pb.go

go_import_paths="${go_import_paths},Matomix/primitive/service.proto=github.com/atomix/api/go/atomix/primitive/extensions/service"
go_import_paths="${go_import_paths},Matomix/primitive/operation.proto=github.com/atomix/api/go/atomix/primitive/extensions/operation"
go_import_paths="${go_import_paths},Matomix/primitive/partition.proto=github.com/atomix/api/go/atomix/primitive/extensions/partition"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/protocol,plugins=grpc:go       proto/atomix/protocol/*.proto

go_import_paths="${go_import_paths},Matomix/protocol/protocol.proto=github.com/atomix/api/go/atomix/protocol"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/meta,plugins=grpc:go proto/atomix/primitive/meta/*.proto

go_import_paths="${go_import_paths},Matomix/primitive/meta/timestamp.proto=github.com/atomix/api/go/atomix/primitive/meta"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/proxy,plugins=grpc:go proto/atomix/proxy/*.proto

go_import_paths="${go_import_paths},Matomix/proxy/proxy.proto=github.com/atomix/api/go/atomix/proxy"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive,plugins=grpc:go      proto/atomix/primitive/primitive.proto

go_import_paths="${go_import_paths},Matomix/primitive/primitive.proto=github.com/atomix/api/go/atomix/primitive"
go_import_paths="${go_import_paths},Matomix/primitive/meta/object.proto=github.com/atomix/api/go/atomix/primitive/meta"
go_import_paths="${go_import_paths},Matomix/primitive/meta/timestamp.proto=github.com/atomix/api/go/atomix/primitive/meta"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/driver,plugins=grpc:go proto/atomix/driver/*.proto

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/counter,plugins=grpc:go    proto/atomix/primitive/counter/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/election,plugins=grpc:go   proto/atomix/primitive/election/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/indexedmap,plugins=grpc:go proto/atomix/primitive/indexedmap/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/leader,plugins=grpc:go     proto/atomix/primitive/leader/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/list,plugins=grpc:go       proto/atomix/primitive/list/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/lock,plugins=grpc:go       proto/atomix/primitive/lock/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/log,plugins=grpc:go        proto/atomix/primitive/log/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/map,plugins=grpc:go        proto/atomix/primitive/map/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/set,plugins=grpc:go        proto/atomix/primitive/set/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=github.com/atomix/api/go/atomix/primitive/value,plugins=grpc:go      proto/atomix/primitive/value/*.proto

protoc --proto_path=$proto_path \
    --python_betterproto_out=./python \
    $(find proto -name "*.proto")

protoc --proto_path=$proto_path \
    --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java-1.34.1-osx-x86_64.exe \
    --grpc-java_out=./java \
    $(find proto -name "*.proto")
