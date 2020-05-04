#!/bin/sh

proto_imports="./proto:${GOPATH}/src/github.com/gogo/protobuf:${GOPATH}/src/github.com/gogo/protobuf/protobuf:${GOPATH}/src"

# Compile primitive proto files
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,protocol.md    --gogofaster_out=import_path=atomix/protocol,plugins=grpc:proto proto/atomix/protocol/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,primitive.md   --gogofaster_out=Matomix/protocol/protocol.proto=github.com/atomix/api/proto/atomix/protocol,import_path=atomix/primitive,plugins=grpc:proto proto/atomix/primitive/*.proto
protoc -I=$proto_imports --doc_out=docs  --doc_opt=markdown,cluster.md  --gogofaster_out=import_path=atomix/cluster,plugins=grpc:proto proto/atomix/cluster/*.proto

# Compile database primitive proto files
database_import_map="Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types,Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types,Matomix/primitive/primitive.proto=github.com/atomix/api/proto/atomix/primitive,Matomix/database/headers/headers.proto=github.com/atomix/api/proto/atomix/database/headers"
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,protocol.md   --gogofaster_out=import_path=atomix/database,plugins=grpc:proto proto/atomix/database/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,headers.md    --gogofaster_out=$database_import_map,import_path=atomix/database/headers,plugins=grpc:proto proto/atomix/database/headers/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,counter.md    --gogofaster_out=$database_import_map,import_path=atomix/database/counter,plugins=grpc:proto proto/atomix/database/counter/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,election.md   --gogofaster_out=$database_import_map,import_path=atomix/database/election,plugins=grpc:proto proto/atomix/database/election/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,indexmap.md   --gogofaster_out=$database_import_map,import_path=atomix/database/indexedmap,plugins=grpc:proto proto/atomix/database/indexedmap/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,leader.md     --gogofaster_out=$database_import_map,import_path=atomix/database/leader,plugins=grpc:proto proto/atomix/database/leader/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,list.md       --gogofaster_out=$database_import_map,import_path=atomix/database/list,plugins=grpc:proto proto/atomix/database/list/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,lock.md       --gogofaster_out=$database_import_map,import_path=atomix/database/lock,plugins=grpc:proto proto/atomix/database/lock/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,log.md        --gogofaster_out=$database_import_map,import_path=atomix/database/log,plugins=grpc:proto proto/atomix/database/log/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,map.md        --gogofaster_out=$database_import_map,import_path=atomix/database/map,plugins=grpc:proto proto/atomix/database/map/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,session.md    --gogofaster_out=$database_import_map,import_path=atomix/database/session,plugins=grpc:proto proto/atomix/database/session/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,set.md        --gogofaster_out=$database_import_map,import_path=atomix/database/set,plugins=grpc:proto proto/atomix/database/set/*.proto
protoc -I=$proto_imports --doc_out=docs/database  --doc_opt=markdown,value.md      --gogofaster_out=$database_import_map,import_path=atomix/database/value,plugins=grpc:proto proto/atomix/database/value/*.proto

# Compile gossip primitive proto files
gossip_import_map="Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types,Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types,Matomix/primitive/primitive.proto=github.com/atomix/api/proto/atomix/primitive,Matomix/protocol/protocol.proto=github.com/atomix/api/proto/atomix/protocol,Matomix/gossip/gossip.proto=github.com/atomix/api/proto/atomix/gossip,Matomix/gossip/headers/headers.proto=github.com/atomix/api/proto/atomix/gossip/headers"
protoc -I=$proto_imports --doc_out=docs/gossip  --doc_opt=markdown,protocol.md  --gogofaster_out=import_path=atomix/gossip,plugins=grpc:proto proto/atomix/gossip/*.proto
protoc -I=$proto_imports --doc_out=docs/gossip  --doc_opt=markdown,headers.md   --gogofaster_out=$gossip_import_map,import_path=atomix/gossip/headers,plugins=grpc:proto proto/atomix/gossip/headers/*.proto
protoc -I=$proto_imports --doc_out=docs/gossip  --doc_opt=markdown,map.md       --gogofaster_out=$gossip_import_map,import_path=atomix/gossip/map,plugins=grpc:proto proto/atomix/gossip/map/*.proto

# Compile primary-backup primitive proto files
pb_import_map="Mgoogle/protobuf/duration.proto=github.com/gogo/protobuf/types,Mgoogle/protobuf/timestamp.proto=github.com/gogo/protobuf/types,Matomix/primitive/primitive.proto=github.com/atomix/api/proto/atomix/primitive,Matomix/protocol/protocol.proto=github.com/atomix/api/proto/atomix/protocol,Matomix/pb/pb.proto=github.com/atomix/api/proto/atomix/pb,Matomix/pb/headers/headers.proto=github.com/atomix/api/proto/atomix/pb/headers"
protoc -I=$proto_imports --doc_out=docs/pb  --doc_opt=markdown,protocol.md  --gogofaster_out=import_path=atomix/pb,plugins=grpc:proto proto/atomix/pb/*.proto
protoc -I=$proto_imports --doc_out=docs/pb  --doc_opt=markdown,map.md       --gogofaster_out=$pb_import_map,import_path=atomix/pb/headers,plugins=grpc:proto proto/atomix/pb/headers/*.proto
protoc -I=$proto_imports --doc_out=docs/pb  --doc_opt=markdown,map.md       --gogofaster_out=$pb_import_map,import_path=atomix/pb/map,plugins=grpc:proto proto/atomix/pb/map/*.proto
