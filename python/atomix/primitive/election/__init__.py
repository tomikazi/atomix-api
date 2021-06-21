# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/election/election.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, List, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    CHANGED = 1


@dataclass(eq=False, repr=False)
class EnterRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EnterResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class WithdrawRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class WithdrawResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AnointRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AnointResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PromoteRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PromoteResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EvictRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EvictResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetTermRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetTermResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EventsRequest(betterproto.Message):
    headers: "__primitive__.RequestHeaders" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EventsResponse(betterproto.Message):
    headers: "__primitive__.ResponseHeaders" = betterproto.message_field(1)
    event: "Event" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Event(betterproto.Message):
    type: "EventType" = betterproto.enum_field(1)
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Term(betterproto.Message):
    meta: "_meta__.ObjectMeta" = betterproto.message_field(1)
    leader: str = betterproto.string_field(2)
    candidates: List[str] = betterproto.string_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


class LeaderElectionServiceStub(betterproto.ServiceStub):
    """LeaderElectionService implements a distributed leader election"""

    async def enter(
        self, *, headers: "__primitive__.RequestHeaders" = None, candidate_id: str = ""
    ) -> "EnterResponse":
        """Enter enters the leader election"""

        request = EnterRequest()
        if headers is not None:
            request.headers = headers
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.LeaderElectionService/Enter",
            request,
            EnterResponse,
        )

    async def withdraw(
        self, *, headers: "__primitive__.RequestHeaders" = None, candidate_id: str = ""
    ) -> "WithdrawResponse":
        """Withdraw withdraws a candidate from the leader election"""

        request = WithdrawRequest()
        if headers is not None:
            request.headers = headers
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.LeaderElectionService/Withdraw",
            request,
            WithdrawResponse,
        )

    async def anoint(
        self, *, headers: "__primitive__.RequestHeaders" = None, candidate_id: str = ""
    ) -> "AnointResponse":
        """Anoint anoints a candidate leader"""

        request = AnointRequest()
        if headers is not None:
            request.headers = headers
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.LeaderElectionService/Anoint",
            request,
            AnointResponse,
        )

    async def promote(
        self, *, headers: "__primitive__.RequestHeaders" = None, candidate_id: str = ""
    ) -> "PromoteResponse":
        """Promote promotes a candidate"""

        request = PromoteRequest()
        if headers is not None:
            request.headers = headers
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.LeaderElectionService/Promote",
            request,
            PromoteResponse,
        )

    async def evict(
        self, *, headers: "__primitive__.RequestHeaders" = None, candidate_id: str = ""
    ) -> "EvictResponse":
        """Evict evicts a candidate from the election"""

        request = EvictRequest()
        if headers is not None:
            request.headers = headers
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.LeaderElectionService/Evict",
            request,
            EvictResponse,
        )

    async def get_term(
        self, *, headers: "__primitive__.RequestHeaders" = None
    ) -> "GetTermResponse":
        """GetTerm gets the current leadership term"""

        request = GetTermRequest()
        if headers is not None:
            request.headers = headers

        return await self._unary_unary(
            "/atomix.primitive.election.LeaderElectionService/GetTerm",
            request,
            GetTermResponse,
        )

    async def events(
        self, *, headers: "__primitive__.RequestHeaders" = None
    ) -> AsyncIterator["EventsResponse"]:
        """Events listens for leadership events"""

        request = EventsRequest()
        if headers is not None:
            request.headers = headers

        async for response in self._unary_stream(
            "/atomix.primitive.election.LeaderElectionService/Events",
            request,
            EventsResponse,
        ):
            yield response


from .. import meta as _meta__
from ... import primitive as __primitive__