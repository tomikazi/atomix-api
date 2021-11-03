# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/value/v1/primitive.proto, atomix/primitive/value/v1/session.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, List, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    UPDATE = 1


class ValueCacheStrategy(betterproto.Enum):
    NEAR = 0
    READ_THROUGH = 1
    WRITE_THROUGH = 2
    READ_THROUGH_WRITE_THROUGH = 3


@dataclass(eq=False, repr=False)
class GetRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetResponse(betterproto.Message):
    value: "Object" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Precondition(betterproto.Message):
    metadata: "__meta_v1__.ObjectMeta" = betterproto.message_field(
        1, group="precondition"
    )

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetRequest(betterproto.Message):
    value: "Object" = betterproto.message_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetResponse(betterproto.Message):
    value: "Object" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EventsRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EventsResponse(betterproto.Message):
    event: "Event" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Event(betterproto.Message):
    type: "EventType" = betterproto.enum_field(1)
    value: "Object" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Object(betterproto.Message):
    meta: "__meta_v1__.ObjectMeta" = betterproto.message_field(1)
    value: bytes = betterproto.bytes_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionRequest(betterproto.Message):
    primitive_id: str = betterproto.string_field(1)
    options: "ValueSessionOptions" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionResponse(betterproto.Message):
    session_id: int = betterproto.uint64_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ValueSessionOptions(betterproto.Message):
    cache: "ValueCacheOptions" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ValueCacheOptions(betterproto.Message):
    enabled: bool = betterproto.bool_field(1)
    strategy: "ValueCacheStrategy" = betterproto.enum_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CloseSessionRequest(betterproto.Message):
    session_id: int = betterproto.uint64_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class CloseSessionResponse(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


class ValueStub(betterproto.ServiceStub):
    """Value is a service for a value primitive"""

    async def set(
        self,
        *,
        value: "Object" = None,
        preconditions: Optional[List["Precondition"]] = None,
    ) -> "SetResponse":
        """Set sets the value"""

        preconditions = preconditions or []

        request = SetRequest()
        if value is not None:
            request.value = value
        if preconditions is not None:
            request.preconditions = preconditions

        return await self._unary_unary(
            "/atomix.primitive.value.v1.Value/Set", request, SetResponse
        )

    async def get(self) -> "GetResponse":
        """Get gets the value"""

        request = GetRequest()

        return await self._unary_unary(
            "/atomix.primitive.value.v1.Value/Get", request, GetResponse
        )

    async def events(self) -> AsyncIterator["EventsResponse"]:
        """Events listens for value change events"""

        request = EventsRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.value.v1.Value/Events",
            request,
            EventsResponse,
        ):
            yield response


class ValueSessionStub(betterproto.ServiceStub):
    """Value is a service for a value primitive"""

    async def open_session(
        self, *, primitive_id: str = "", options: "ValueSessionOptions" = None
    ) -> "OpenSessionResponse":
        """Set sets the value"""

        request = OpenSessionRequest()
        request.primitive_id = primitive_id
        if options is not None:
            request.options = options

        return await self._unary_unary(
            "/atomix.primitive.value.v1.ValueSession/OpenSession",
            request,
            OpenSessionResponse,
        )

    async def close_session(self, *, session_id: int = 0) -> "CloseSessionResponse":
        """Get gets the value"""

        request = CloseSessionRequest()
        request.session_id = session_id

        return await self._unary_unary(
            "/atomix.primitive.value.v1.ValueSession/CloseSession",
            request,
            CloseSessionResponse,
        )


from ...meta import v1 as __meta_v1__
