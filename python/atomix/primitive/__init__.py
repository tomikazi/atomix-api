# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/service.proto, atomix/primitive/primitive.proto
# plugin: python-betterproto
from dataclasses import dataclass

import betterproto
import grpclib


@dataclass(eq=False, repr=False)
class CreateRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CreateResponse(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CloseRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CloseResponse(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


class PrimitiveStub(betterproto.ServiceStub):
    async def create(self) -> "CreateResponse":

        request = CreateRequest()

        return await self._unary_unary(
            "/atomix.primitive.Primitive/Create", request, CreateResponse
        )

    async def close(self) -> "CloseResponse":

        request = CloseRequest()

        return await self._unary_unary(
            "/atomix.primitive.Primitive/Close", request, CloseResponse
        )
