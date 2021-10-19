# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/log/v1/manager.proto, atomix/primitive/log/v1/primitive.proto
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
class OpenSessionRequest(betterproto.Message):
    options: "LogOptions" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionResponse(betterproto.Message):
    session_id: int = betterproto.uint64_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class LogOptions(betterproto.Message):
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
    meta: "__meta__.ObjectMeta" = betterproto.message_field(1)
    index: int = betterproto.uint64_field(2)
    value: bytes = betterproto.bytes_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


class LogManagerStub(betterproto.ServiceStub):
    """LogManager is a service for managing log instances"""

    async def open_session(
        self, *, options: "LogOptions" = None
    ) -> "OpenSessionResponse":

        request = OpenSessionRequest()
        if options is not None:
            request.options = options

        return await self._unary_unary(
            "/atomix.primitive.log.v1.LogManager/OpenSession",
            request,
            OpenSessionResponse,
        )

    async def close_session(self, *, session_id: int = 0) -> "CloseSessionResponse":

        request = CloseSessionRequest()
        request.session_id = session_id

        return await self._unary_unary(
            "/atomix.primitive.log.v1.LogManager/CloseSession",
            request,
            CloseSessionResponse,
        )


class LogStub(betterproto.ServiceStub):
    """LogManager is a service for managing log instances"""

    async def size(self) -> "SizeResponse":

        request = SizeRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Size", request, SizeResponse
        )

    async def append(self, *, index: int = 0, value: bytes = b"") -> "AppendResponse":

        request = AppendRequest()
        request.index = index
        request.value = value

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Append", request, AppendResponse
        )

    async def get(self, *, index: int = 0) -> "GetResponse":

        request = GetRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Get", request, GetResponse
        )

    async def first_entry(self) -> "FirstEntryResponse":

        request = FirstEntryRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/FirstEntry", request, FirstEntryResponse
        )

    async def last_entry(self) -> "LastEntryResponse":

        request = LastEntryRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/LastEntry", request, LastEntryResponse
        )

    async def prev_entry(self, *, index: int = 0) -> "PrevEntryResponse":

        request = PrevEntryRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/PrevEntry", request, PrevEntryResponse
        )

    async def next_entry(self, *, index: int = 0) -> "NextEntryResponse":

        request = NextEntryRequest()
        request.index = index

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/NextEntry", request, NextEntryResponse
        )

    async def remove(self, *, entry: "Entry" = None) -> "RemoveResponse":

        request = RemoveRequest()
        if entry is not None:
            request.entry = entry

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Remove", request, RemoveResponse
        )

    async def clear(self) -> "ClearResponse":

        request = ClearRequest()

        return await self._unary_unary(
            "/atomix.primitive.log.v1.Log/Clear", request, ClearResponse
        )

    async def events(
        self, *, replay: bool = False, index: int = 0
    ) -> AsyncIterator["EventsResponse"]:

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

        request = EntriesRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.log.v1.Log/Entries",
            request,
            EntriesResponse,
        ):
            yield response


from ... import meta as __meta__