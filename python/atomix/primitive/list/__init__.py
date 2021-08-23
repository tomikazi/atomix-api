# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/list/list.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, List, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    ADD = 1
    REMOVE = 2
    REPLAY = 3


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
    value: "Value" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ContainsResponse(betterproto.Message):
    contains: bool = betterproto.bool_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Precondition(betterproto.Message):
    metadata: "_meta__.ObjectMeta" = betterproto.message_field(1, group="precondition")

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AppendRequest(betterproto.Message):
    value: "Value" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AppendResponse(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetRequest(betterproto.Message):
    index: int = betterproto.uint32_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetResponse(betterproto.Message):
    item: "Item" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetRequest(betterproto.Message):
    item: "Item" = betterproto.message_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetResponse(betterproto.Message):
    item: "Item" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class InsertRequest(betterproto.Message):
    item: "Item" = betterproto.message_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class InsertResponse(betterproto.Message):
    item: "Item" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class RemoveRequest(betterproto.Message):
    index: int = betterproto.uint32_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class RemoveResponse(betterproto.Message):
    item: "Item" = betterproto.message_field(2)

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
    item: "Item" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ElementsRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class ElementsResponse(betterproto.Message):
    item: "Item" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Item(betterproto.Message):
    index: int = betterproto.uint32_field(1)
    value: "Value" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Value(betterproto.Message):
    meta: "_meta__.ObjectMeta" = betterproto.message_field(1)
    value: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


class ListServiceStub(betterproto.ServiceStub):
    """ListService implements a distributed list"""

    async def size(self) -> "SizeResponse":
        """Size gets the number of elements in the list"""

        request = SizeRequest()

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Size", request, SizeResponse
        )

    async def append(self, *, value: "Value" = None) -> "AppendResponse":
        """Append appends a value to the list"""

        request = AppendRequest()
        if value is not None:
            request.value = value

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Append", request, AppendResponse
        )

    async def insert(
        self,
        *,
        item: "Item" = None,
        preconditions: Optional[List["Precondition"]] = None,
    ) -> "InsertResponse":
        """Insert inserts a value at a specific index in the list"""

        preconditions = preconditions or []

        request = InsertRequest()
        if item is not None:
            request.item = item
        if preconditions is not None:
            request.preconditions = preconditions

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Insert", request, InsertResponse
        )

    async def get(self, *, index: int = 0) -> "GetResponse":
        """Get gets the value at an index in the list"""

        request = GetRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Get", request, GetResponse
        )

    async def set(
        self,
        *,
        item: "Item" = None,
        preconditions: Optional[List["Precondition"]] = None,
    ) -> "SetResponse":
        """Set sets the value at an index in the list"""

        preconditions = preconditions or []

        request = SetRequest()
        if item is not None:
            request.item = item
        if preconditions is not None:
            request.preconditions = preconditions

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Set", request, SetResponse
        )

    async def remove(
        self, *, index: int = 0, preconditions: Optional[List["Precondition"]] = None
    ) -> "RemoveResponse":
        """Remove removes an element from the list"""

        preconditions = preconditions or []

        request = RemoveRequest()
        request.index = index
        if preconditions is not None:
            request.preconditions = preconditions

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Remove", request, RemoveResponse
        )

    async def clear(self) -> "ClearResponse":
        """Clear removes all elements from the list"""

        request = ClearRequest()

        return await self._unary_unary(
            "/atomix.primitive.list.ListService/Clear", request, ClearResponse
        )

    async def events(self, *, replay: bool = False) -> AsyncIterator["EventsResponse"]:
        """Events listens for change events"""

        request = EventsRequest()
        request.replay = replay

        async for response in self._unary_stream(
            "/atomix.primitive.list.ListService/Events",
            request,
            EventsResponse,
        ):
            yield response

    async def elements(self) -> AsyncIterator["ElementsResponse"]:
        """Elements streams all elements in the list"""

        request = ElementsRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.list.ListService/Elements",
            request,
            ElementsResponse,
        ):
            yield response


from .. import meta as _meta__
