# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/value/value.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, List, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    UPDATE = 1


@dataclass(eq=False, repr=False)
class GetRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetResponse(betterproto.Message):
    value: "Value" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Precondition(betterproto.Message):
    metadata: "_meta__.ObjectMeta" = betterproto.message_field(1, group="precondition")

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetRequest(betterproto.Message):
    value: "Value" = betterproto.message_field(2)
    preconditions: List["Precondition"] = betterproto.message_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class SetResponse(betterproto.Message):
    value: "Value" = betterproto.message_field(2)

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
    value: "Value" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Value(betterproto.Message):
    meta: "_meta__.ObjectMeta" = betterproto.message_field(1)
    value: bytes = betterproto.bytes_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


class ValueServiceStub(betterproto.ServiceStub):
    """ValueService implements a distributed atomic value"""

    async def set(
        self,
        *,
        value: "Value" = None,
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
            "/atomix.primitive.value.ValueService/Set", request, SetResponse
        )

    async def get(self) -> "GetResponse":
        """Get gets the value"""

        request = GetRequest()

        return await self._unary_unary(
            "/atomix.primitive.value.ValueService/Get", request, GetResponse
        )

    async def events(self) -> AsyncIterator["EventsResponse"]:
        """Events listens for value change events"""

        request = EventsRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.value.ValueService/Events",
            request,
            EventsResponse,
        ):
            yield response


from .. import meta as _meta__
