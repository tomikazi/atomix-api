# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/set/v1/primitive.proto, atomix/primitive/set/v1/session.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    ADD = 1
    REMOVE = 2
    REPLAY = 3


class SetCacheStrategy(betterproto.Enum):
    NEAR = 0
    READ_THROUGH = 1
    WRITE_THROUGH = 2
    READ_THROUGH_WRITE_THROUGH = 3


@dataclass(eq=False, repr=False)
class SizeRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SizeResponse(betterproto.Message):
    size: int = betterproto.uint32_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ContainsRequest(betterproto.Message):
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ContainsResponse(betterproto.Message):
    contains: bool = betterproto.bool_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AddRequest(betterproto.Message):
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AddResponse(betterproto.Message):
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class RemoveRequest(betterproto.Message):
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class RemoveResponse(betterproto.Message):
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ClearRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ClearResponse(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EventsRequest(betterproto.Message):
    replay: bool = betterproto.bool_field(2)

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
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ElementsRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ElementsResponse(betterproto.Message):
    element: "Element" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Element(betterproto.Message):
    meta: "__meta_v1__.ObjectMeta" = betterproto.message_field(1)
    value: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionRequest(betterproto.Message):
    primitive_id: str = betterproto.string_field(1)
    options: "SetSessionOptions" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionResponse(betterproto.Message):
    session_id: int = betterproto.uint64_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetSessionOptions(betterproto.Message):
    cache: "SetCacheOptions" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetCacheOptions(betterproto.Message):
    enabled: bool = betterproto.bool_field(1)
    strategy: "SetCacheStrategy" = betterproto.enum_field(2)

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


class SetStub(betterproto.ServiceStub):
    """Set is a service for a set primitive"""

    async def size(self) -> "SizeResponse":
        """Size gets the number of elements in the set"""

        request = SizeRequest()

        return await self._unary_unary(
            "/atomix.primitive.set.v1.Set/Size", request, SizeResponse
        )

    async def contains(self, *, element: "Element" = None) -> "ContainsResponse":
        """Contains returns whether the set contains a value"""

        request = ContainsRequest()
        if element is not None:
            request.element = element

        return await self._unary_unary(
            "/atomix.primitive.set.v1.Set/Contains", request, ContainsResponse
        )

    async def add(self, *, element: "Element" = None) -> "AddResponse":
        """Add adds a value to the set"""

        request = AddRequest()
        if element is not None:
            request.element = element

        return await self._unary_unary(
            "/atomix.primitive.set.v1.Set/Add", request, AddResponse
        )

    async def remove(self, *, element: "Element" = None) -> "RemoveResponse":
        """Remove removes a value from the set"""

        request = RemoveRequest()
        if element is not None:
            request.element = element

        return await self._unary_unary(
            "/atomix.primitive.set.v1.Set/Remove", request, RemoveResponse
        )

    async def clear(self) -> "ClearResponse":
        """Clear removes all values from the set"""

        request = ClearRequest()

        return await self._unary_unary(
            "/atomix.primitive.set.v1.Set/Clear", request, ClearResponse
        )

    async def events(self, *, replay: bool = False) -> AsyncIterator["EventsResponse"]:
        """Events listens for set change events"""

        request = EventsRequest()
        request.replay = replay

        async for response in self._unary_stream(
            "/atomix.primitive.set.v1.Set/Events",
            request,
            EventsResponse,
        ):
            yield response

    async def elements(self) -> AsyncIterator["ElementsResponse"]:
        """Elements lists all elements in the set"""

        request = ElementsRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.set.v1.Set/Elements",
            request,
            ElementsResponse,
        ):
            yield response


class SetSessionStub(betterproto.ServiceStub):
    """Set is a service for a set primitive"""

    async def open_session(
        self, *, primitive_id: str = "", options: "SetSessionOptions" = None
    ) -> "OpenSessionResponse":
        """Size gets the number of elements in the set"""

        request = OpenSessionRequest()
        request.primitive_id = primitive_id
        if options is not None:
            request.options = options

        return await self._unary_unary(
            "/atomix.primitive.set.v1.SetSession/OpenSession",
            request,
            OpenSessionResponse,
        )

    async def close_session(self, *, session_id: int = 0) -> "CloseSessionResponse":
        """Contains returns whether the set contains a value"""

        request = CloseSessionRequest()
        request.session_id = session_id

        return await self._unary_unary(
            "/atomix.primitive.set.v1.SetSession/CloseSession",
            request,
            CloseSessionResponse,
        )


from ...meta import v1 as __meta_v1__
