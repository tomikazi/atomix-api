#!/bin/sh

proto_path="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,storage.md  proto/atomix/storage/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,counter.md    proto/atomix/storage/counter/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,election.md   proto/atomix/storage/election/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,indexmap.md   proto/atomix/storage/indexedmap/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,leader.md     proto/atomix/storage/leader/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,list.md       proto/atomix/storage/list/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,lock.md       proto/atomix/storage/lock/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,log.md        proto/atomix/storage/log/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,map.md        proto/atomix/storage/map/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,session.md    proto/atomix/storage/session/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,set.md        proto/atomix/storage/set/*.proto
protoc -I=$proto_path --doc_out=docs  --doc_opt=markdown,value.md      proto/atomix/storage/value/*.proto

go_import_paths="Mgoogle/protobuf/any.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/primitive,plugins=grpc:go  proto/atomix/storage/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/timestamp,plugins=grpc:go  proto/atomix/storage/timestamp/*.proto

go_import_paths="${go_import_paths},Matomix/storage/primitive.proto=github.com/atomix/api/go/atomix/storage"
go_import_paths="${go_import_paths},Matomix/storage/timestamp/timestamp.proto=github.com/atomix/api/go/atomix/storage/timestamp"

protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/counter,plugins=grpc:go    proto/atomix/storage/counter/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/election,plugins=grpc:go   proto/atomix/storage/election/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/indexedmap,plugins=grpc:go proto/atomix/storage/indexedmap/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/leader,plugins=grpc:go     proto/atomix/storage/leader/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/list,plugins=grpc:go       proto/atomix/storage/list/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/lock,plugins=grpc:go       proto/atomix/storage/lock/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/log,plugins=grpc:go        proto/atomix/storage/log/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/map,plugins=grpc:go        proto/atomix/storage/map/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/session,plugins=grpc:go    proto/atomix/storage/session/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/set,plugins=grpc:go        proto/atomix/storage/set/*.proto
protoc -I=$proto_path --gogofaster_out=$go_import_paths,import_path=atomix/value,plugins=grpc:go      proto/atomix/storage/value/*.proto

protoc --proto_path=$proto_path \
    --python_betterproto_out=./python \
    $(find proto -name "*.proto")

protoc --proto_path=$proto_path \
    --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java-1.34.1-osx-x86_64.exe \
    --grpc-java_out=./java \
    $(find proto -name "*.proto")
