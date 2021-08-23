# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/indexedmap/indexedmap.proto
# plugin: python-betterproto
from dataclasses import dataclass
from datetime import timedelta
from typing import AsyncIterator, List, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    INSERT = 1
    UPDATE = 2
    REMOVE = 3
    REPLAY = 4


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
class Precondition(betterproto.Message):
    metadata: "_meta__.ObjectMeta" = betterproto.message_field(1, group="precondition")

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PutRequest(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PutResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetRequest(betterproto.Message):
    position: "Position" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class FirstEntryRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class FirstEntryResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class LastEntryRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class LastEntryResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PrevEntryRequest(betterproto.Message):
    index: int = betterproto.uint64_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PrevEntryResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class NextEntryRequest(betterproto.Message):
    index: int = betterproto.uint64_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class NextEntryResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class RemoveRequest(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class RemoveResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

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
class EntriesRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EntriesResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EventsRequest(betterproto.Message):
    pos: "Position" = betterproto.message_field(2)
    replay: bool = betterproto.bool_field(3)

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
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Position(betterproto.Message):
    index: int = betterproto.uint64_field(1)
    key: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Value(betterproto.Message):
    meta: "_meta__.ObjectMeta" = betterproto.message_field(1)
    value: bytes = betterproto.bytes_field(2)
    ttl: timedelta = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Entry(betterproto.Message):
    pos: "Position" = betterproto.message_field(1)
    value: "Value" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


class IndexedMapServiceStub(betterproto.ServiceStub):
    """IndexedMap service"""

    async def size(self) -> "SizeResponse":
        """Size returns the size of the map"""

        request = SizeRequest()

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/Size", request, SizeResponse
        )

    async def put(
        self,
        *,
        entry: "Entry" = None,
        preconditions: Optional[List["Precondition"]] = None,
    ) -> "PutResponse":
        """Put puts an entry into the map"""

        preconditions = preconditions or []

        request = PutRequest()
        if entry is not None:
            request.entry = entry
        if preconditions is not None:
            request.preconditions = preconditions

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/Put", request, PutResponse
        )

    async def get(self, *, position: "Position" = None) -> "GetResponse":
        """Get gets the entry for a key"""

        request = GetRequest()
        if position is not None:
            request.position = position

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/Get", request, GetResponse
        )

    async def first_entry(self) -> "FirstEntryResponse":
        """FirstEntry gets the first entry in the map"""

        request = FirstEntryRequest()

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/FirstEntry",
            request,
            FirstEntryResponse,
        )

    async def last_entry(self) -> "LastEntryResponse":
        """LastEntry gets the last entry in the map"""

        request = LastEntryRequest()

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/LastEntry",
            request,
            LastEntryResponse,
        )

    async def prev_entry(self, *, index: int = 0) -> "PrevEntryResponse":
        """PrevEntry gets the previous entry in the map"""

        request = PrevEntryRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/PrevEntry",
            request,
            PrevEntryResponse,
        )

    async def next_entry(self, *, index: int = 0) -> "NextEntryResponse":
        """NextEntry gets the next entry in the map"""

        request = NextEntryRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/NextEntry",
            request,
            NextEntryResponse,
        )

    async def remove(
        self,
        *,
        entry: "Entry" = None,
        preconditions: Optional[List["Precondition"]] = None,
    ) -> "RemoveResponse":
        """Remove removes an entry from the map"""

        preconditions = preconditions or []

        request = RemoveRequest()
        if entry is not None:
            request.entry = entry
        if preconditions is not None:
            request.preconditions = preconditions

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/Remove",
            request,
            RemoveResponse,
        )

    async def clear(self) -> "ClearResponse":
        """Clear removes all entries from the map"""

        request = ClearRequest()

        return await self._unary_unary(
            "/atomix.primitive.indexedmap.IndexedMapService/Clear",
            request,
            ClearResponse,
        )

    async def events(
        self, *, pos: "Position" = None, replay: bool = False
    ) -> AsyncIterator["EventsResponse"]:
        """Events listens for change events"""

        request = EventsRequest()
        if pos is not None:
            request.pos = pos
        request.replay = replay

        async for response in self._unary_stream(
            "/atomix.primitive.indexedmap.IndexedMapService/Events",
            request,
            EventsResponse,
        ):
            yield response

    async def entries(self) -> AsyncIterator["EntriesResponse"]:
        """Entries lists all entries in the map"""

        request = EntriesRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.indexedmap.IndexedMapService/Entries",
            request,
            EntriesResponse,
        ):
            yield response


from .. import meta as _meta__
