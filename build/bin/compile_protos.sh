#!/bin/sh

proto_imports="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,primitive.md  proto/atomix/primitive/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,headers.md    proto/atomix/headers/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,database.md   proto/atomix/database/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,membership.md proto/atomix/membership/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,counter.md    proto/atomix/counter/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,election.md   proto/atomix/election/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,indexmap.md   proto/atomix/indexedmap/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,leader.md     proto/atomix/leader/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,list.md       proto/atomix/list/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,lock.md       proto/atomix/lock/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,log.md        proto/atomix/log/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,map.md        proto/atomix/map/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,session.md    proto/atomix/session/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,set.md        proto/atomix/set/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,value.md      proto/atomix/value/*.proto

go_import_paths="Mgoogle/protobuf/any.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types"
go_import_paths="${go_import_paths},Matomix/database/database.proto=github.com/atomix/api/go/atomix/database"
go_import_paths="${go_import_paths},Matomix/headers/headers.proto=github.com/atomix/api/go/atomix/headers"

protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/primitive,plugins=grpc:go  proto/atomix/primitive/*.proto

go_import_paths="${go_import_paths},Matomix/primitive/primitive.proto=github.com/atomix/api/go/atomix/primitive"

protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/headers,plugins=grpc:go    proto/atomix/headers/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/database,plugins=grpc:go   proto/atomix/database/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/membership,plugins=grpc:go proto/atomix/membership/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/counter,plugins=grpc:go    proto/atomix/counter/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/election,plugins=grpc:go   proto/atomix/election/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/indexedmap,plugins=grpc:go proto/atomix/indexedmap/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/leader,plugins=grpc:go     proto/atomix/leader/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/list,plugins=grpc:go       proto/atomix/list/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/lock,plugins=grpc:go       proto/atomix/lock/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/log,plugins=grpc:go        proto/atomix/log/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/map,plugins=grpc:go        proto/atomix/map/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/session,plugins=grpc:go    proto/atomix/session/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/set,plugins=grpc:go        proto/atomix/set/*.proto
protoc -I=$proto_imports --gogofaster_out=$go_import_paths,import_path=atomix/value,plugins=grpc:go      proto/atomix/value/*.proto
