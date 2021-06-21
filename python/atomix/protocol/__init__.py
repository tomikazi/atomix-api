# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/protocol/protocol.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict, List, Optional

import betterproto
import grpclib


@dataclass(eq=False, repr=False)
class ProtocolConfig(betterproto.Message):
    """Protocol configuration"""

    # nodes is a list of replicas
    replicas: List["ProtocolReplica"] = betterproto.message_field(1)
    # partitions is a list of partitions owned by the replicas
    partitions: List["ProtocolPartition"] = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ProtocolReplica(betterproto.Message):
    """Replica configuration"""

    # id is the unique member identifier
    id: str = betterproto.string_field(1)
    # node_id is the ID of the node on which the replica is deployed
    node_id: str = betterproto.string_field(2)
    # host is the member host
    host: str = betterproto.string_field(3)
    # api_port is the port to use for the client API
    api_port: int = betterproto.int32_field(4)
    # extra_ports is a set of named ports
    extra_ports: Dict[str, int] = betterproto.map_field(
        5, betterproto.TYPE_STRING, betterproto.TYPE_INT32
    )
    # read_only indicates whether the replica is a read-only replica
    read_only: bool = betterproto.bool_field(6)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ProtocolPartition(betterproto.Message):
    """Partition info"""

    partition_id: int = betterproto.uint32_field(1)
    replicas: List[str] = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class UpdateConfigRequest(betterproto.Message):
    config: "ProtocolConfig" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class UpdateConfigResponse(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


class ProtocolConfigServiceStub(betterproto.ServiceStub):
    """Atomix protocol configuration service"""

    async def update_config(
        self, *, config: "ProtocolConfig" = None
    ) -> "UpdateConfigResponse":
        """UpdateConfig updates the protocol configuration"""

        request = UpdateConfigRequest()
        if config is not None:
            request.config = config

        return await self._unary_unary(
            "/atomix.protocol.ProtocolConfigService/UpdateConfig",
            request,
            UpdateConfigResponse,
        )