# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/primitive.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Optional

import betterproto
import grpclib


class ServiceType(betterproto.Enum):
    PRIMITIVE = 0
    SESSION = 1


@dataclass(eq=False, repr=False)
class RequestHeaders(betterproto.Message):
    primitive_id: "PrimitiveId" = betterproto.message_field(1)
    cluster_key: str = betterproto.string_field(2)
    timestamp: "meta.Timestamp" = betterproto.message_field(3)

    def __post_init__(self) -> None:
        warnings.warn("RequestHeaders is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ResponseHeaders(betterproto.Message):
    timestamp: "meta.Timestamp" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("ResponseHeaders is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CreateRequest(betterproto.Message):
    headers: "RequestHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("CreateRequest is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CreateResponse(betterproto.Message):
    headers: "ResponseHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("CreateResponse is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CloseRequest(betterproto.Message):
    headers: "RequestHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("CloseRequest is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CloseResponse(betterproto.Message):
    headers: "ResponseHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("CloseResponse is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class DeleteRequest(betterproto.Message):
    headers: "RequestHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("DeleteRequest is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class DeleteResponse(betterproto.Message):
    headers: "ResponseHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        warnings.warn("DeleteResponse is deprecated", DeprecationWarning)
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PrimitiveId(betterproto.Message):
    namespace: str = betterproto.string_field(1)
    name: str = betterproto.string_field(2)
    type: str = betterproto.string_field(3)

    def __post_init__(self) -> None:
        warnings.warn("PrimitiveId is deprecated", DeprecationWarning)
        super().__post_init__()


class PrimitiveStub(betterproto.ServiceStub):
    """Primitive is a service for managing primitive"""

    async def create(self, *, headers: "RequestHeaders" = None) -> "CreateResponse":
        """Create creates a primitive"""

        request = CreateRequest()
        if headers is not None:
            request.headers = headers

        return await self._unary_unary(
            "/atomix.primitive.Primitive/Create", request, CreateResponse
        )

    async def close(self, *, headers: "RequestHeaders" = None) -> "CloseResponse":
        """Close closes a primitive"""

        request = CloseRequest()
        if headers is not None:
            request.headers = headers

        return await self._unary_unary(
            "/atomix.primitive.Primitive/Close", request, CloseResponse
        )

    async def delete(self, *, headers: "RequestHeaders" = None) -> "DeleteResponse":
        """Delete deletes a primitive"""

        request = DeleteRequest()
        if headers is not None:
            request.headers = headers

        return await self._unary_unary(
            "/atomix.primitive.Primitive/Delete", request, DeleteResponse
        )


from . import meta
