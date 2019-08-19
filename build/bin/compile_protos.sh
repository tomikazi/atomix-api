#!/bin/sh

proto_imports="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

protoc -I=$proto_imports --gogofaster_out=import_path=atomix/protocols/raft:proto proto/atomix/protocols/raft/*.proto
protoc -I=$proto_imports --gogofaster_out=import_path=atomix/protocols/log:proto proto/atomix/protocols/log/*.proto

protoc -I=$proto_imports --gogofaster_out=import_path=atomix/primitive,plugins=grpc:proto proto/atomix/primitive/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/primitive/primitive.proto=github.com/atomix/atomix-api/proto/atomix/primitive,import_path=atomix/headers,plugins=grpc:proto proto/atomix/headers/*.proto
protoc -I=$proto_imports --gogofaster_out=import_path=atomix/controller,plugins=grpc:proto proto/atomix/controller/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/partition/partition.proto=github.com/atomix/atomix-api/proto/atomix/partition,import_path=atomix/controller,plugins=grpc:proto proto/atomix/controller/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/counter,plugins=grpc:proto proto/atomix/counter/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/election,plugins=grpc:proto proto/atomix/election/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/list,plugins=grpc:proto proto/atomix/list/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/lock,plugins=grpc:proto proto/atomix/lock/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/log,plugins=grpc:proto proto/atomix/log/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/map,plugins=grpc:proto proto/atomix/map/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/set,plugins=grpc:proto proto/atomix/set/*.proto
protoc -I=$proto_imports --gogofaster_out=Matomix/headers/headers.proto=github.com/atomix/atomix-api/proto/atomix/headers,import_path=atomix/value,plugins=grpc:proto proto/atomix/value/*.proto