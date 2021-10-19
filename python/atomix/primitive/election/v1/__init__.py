# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/election/v1/manager.proto, atomix/primitive/election/v1/primitive.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import AsyncIterator, List, Optional

import betterproto
import grpclib


class EventType(betterproto.Enum):
    NONE = 0
    CHANGED = 1


@dataclass(eq=False, repr=False)
class OpenSessionRequest(betterproto.Message):
    options: "LeaderElectionOptions" = betterproto.message_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class OpenSessionResponse(betterproto.Message):
    session_id: int = betterproto.uint64_field(1)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class LeaderElectionOptions(betterproto.Message):
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
class EnterRequest(betterproto.Message):
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EnterResponse(betterproto.Message):
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class WithdrawRequest(betterproto.Message):
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class WithdrawResponse(betterproto.Message):
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AnointRequest(betterproto.Message):
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class AnointResponse(betterproto.Message):
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PromoteRequest(betterproto.Message):
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class PromoteResponse(betterproto.Message):
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EvictRequest(betterproto.Message):
    candidate_id: str = betterproto.string_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class EvictResponse(betterproto.Message):
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetTermRequest(betterproto.Message):
    pass

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class GetTermResponse(betterproto.Message):
    term: "Term" = betterproto.message_field(2)

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
    term: "Term" = betterproto.message_field(2)

    def __post_init__(self) -> None:
        super().__post_init__()


@dataclass(eq=False, repr=False)
class Term(betterproto.Message):
    meta: "__meta__.ObjectMeta" = betterproto.message_field(1)
    leader: str = betterproto.string_field(2)
    candidates: List[str] = betterproto.string_field(3)

    def __post_init__(self) -> None:
        super().__post_init__()


class LeaderElectionManagerStub(betterproto.ServiceStub):
    """
    LeaderElectionManager is a service for managing leader election instances
    """

    async def open_session(
        self, *, options: "LeaderElectionOptions" = None
    ) -> "OpenSessionResponse":

        request = OpenSessionRequest()
        if options is not None:
            request.options = options

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElectionManager/OpenSession",
            request,
            OpenSessionResponse,
        )

    async def close_session(self, *, session_id: int = 0) -> "CloseSessionResponse":

        request = CloseSessionRequest()
        request.session_id = session_id

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElectionManager/CloseSession",
            request,
            CloseSessionResponse,
        )


class LeaderElectionStub(betterproto.ServiceStub):
    """
    LeaderElectionManager is a service for managing leader election instances
    """

    async def enter(self, *, candidate_id: str = "") -> "EnterResponse":

        request = EnterRequest()
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElection/Enter", request, EnterResponse
        )

    async def withdraw(self, *, candidate_id: str = "") -> "WithdrawResponse":

        request = WithdrawRequest()
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElection/Withdraw",
            request,
            WithdrawResponse,
        )

    async def anoint(self, *, candidate_id: str = "") -> "AnointResponse":

        request = AnointRequest()
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElection/Anoint",
            request,
            AnointResponse,
        )

    async def promote(self, *, candidate_id: str = "") -> "PromoteResponse":

        request = PromoteRequest()
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElection/Promote",
            request,
            PromoteResponse,
        )

    async def evict(self, *, candidate_id: str = "") -> "EvictResponse":

        request = EvictRequest()
        request.candidate_id = candidate_id

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElection/Evict", request, EvictResponse
        )

    async def get_term(self) -> "GetTermResponse":

        request = GetTermRequest()

        return await self._unary_unary(
            "/atomix.primitive.election.v1.LeaderElection/GetTerm",
            request,
            GetTermResponse,
        )

    async def events(self) -> AsyncIterator["EventsResponse"]:

        request = EventsRequest()

        async for response in self._unary_stream(
            "/atomix.primitive.election.v1.LeaderElection/Events",
            request,
            EventsResponse,
        ):
            yield response


from ... import meta as __meta__
