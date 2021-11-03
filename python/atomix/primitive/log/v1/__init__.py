# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/log/v1/primitive.proto, atomix/primitive/log/v1/session.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    APPEND = 1
    REMOVE = 2
    REPLAY = 3


@dataclass(eq=False, repr=False)
class SizeRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SizeResponse(betterproto.Message):
    size: int = betterproto.int32_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AppendRequest(betterproto.Message):
    index: int = betterproto.uint64_field(2)
    value: bytes = betterproto.bytes_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AppendResponse(betterproto.Message):
    entry: "Entry" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetRequest(betterproto.Message):
    index: int = betterproto.uint64_field(2)

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
    replay: bool = betterproto.bool_field(2)
    index: int = betterproto.uint64_field(3)

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
class Entry(betterproto.Message):
    meta: "__meta_v1__.ObjectMeta" = betterproto.message_field(1)
    index: int = betterproto.uint64_field(2)
    value: bytes = betterproto.bytes_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionRequest(betterproto.Message):
    primitive_id: str = betterproto.string_field(1)
    options: "LogSessionOptions" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionResponse(betterproto.Message):
    session_id: int = betterproto.uint64_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class LogSessionOptions(betterproto.Message):
    pass

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


class LogStub(betterproto.ServiceStub):
    """Log is a service for a log primitive"""

    async def size(self) -> "SizeResponse":
        """Size returns the size of the log"""

        request = SizeRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Size", request, SizeResponse
        )

    async def append(self, *, index: int = 0, value: bytes = b"") -> "AppendResponse":
        """Appends appends an entry into the log"""

        request = AppendRequest()
        request.index = index
        request.value = value

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Append", request, AppendResponse
        )

    async def get(self, *, index: int = 0) -> "GetResponse":
        """Get gets the entry for an index"""

        request = GetRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Get", request, GetResponse
        )

    async def first_entry(self) -> "FirstEntryResponse":
        """FirstEntry gets the first entry in the log"""

        request = FirstEntryRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/FirstEntry", request, FirstEntryResponse
        )

    async def last_entry(self) -> "LastEntryResponse":
        """LastEntry gets the last entry in the log"""

        request = LastEntryRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/LastEntry", request, LastEntryResponse
        )

    async def prev_entry(self, *, index: int = 0) -> "PrevEntryResponse":
        """PrevEntry gets the previous entry in the log"""

        request = PrevEntryRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/PrevEntry", request, PrevEntryResponse
        )

    async def next_entry(self, *, index: int = 0) -> "NextEntryResponse":
        """NextEntry gets the next entry in the log"""

        request = NextEntryRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/NextEntry", request, NextEntryResponse
        )

    async def remove(self, *, entry: "Entry" = None) -> "RemoveResponse":
        """Remove removes an entry from the log"""

        request = RemoveRequest()
        if entry is not None:
            request.entry = entry

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Remove", request, RemoveResponse
        )

    async def clear(self) -> "ClearResponse":
        """Clear removes all entries from the log"""

        request = ClearRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Clear", request, ClearResponse
        )

    async def events(
        self, *, replay: bool = False, index: int = 0
    ) -> AsyncIterator["EventsResponse"]:
        """Events listens for change events"""

        request = EventsRequest()
        request.replay = replay
        request.index = index

        async for response in self._unary_stream(
            "/atomix.primitive.log.v1.Log/Events",
            request,
            EventsResponse,
        ):
            yield response

    async def entries(self) -> AsyncIterator["EntriesResponse"]:
        """Entries lists all entries in the log"""

        request = EntriesRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.log.v1.Log/Entries",
            request,
            EntriesResponse,
        ):
            yield response


class LogSessionStub(betterproto.ServiceStub):
    """Log is a service for a log primitive"""

    async def open_session(
        self, *, primitive_id: str = "", options: "LogSessionOptions" = None
    ) -> "OpenSessionResponse":
        """Size returns the size of the log"""

        request = OpenSessionRequest()
        request.primitive_id = primitive_id
        if options is not None:
            request.options = options

        return await self._unary_unary(
            "/atomix.primitive.log.v1.LogSession/OpenSession",
            request,
            OpenSessionResponse,
        )

    async def close_session(self, *, session_id: int = 0) -> "CloseSessionResponse":
        """Appends appends an entry into the log"""

        request = CloseSessionRequest()
        request.session_id = session_id

        return await self._unary_unary(
            "/atomix.primitive.log.v1.LogSession/CloseSession",
            request,
            CloseSessionResponse,
        )


from ...meta import v1 as __meta_v1__
