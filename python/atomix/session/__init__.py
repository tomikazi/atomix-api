# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: atomix/primitive/session.proto
# plugin: python-betterproto
from dataclasses import dataclass

import betterproto


class OperationType(betterproto.Enum):
    """OperationType is an enum for specifying the type of operation"""

    OPEN = 0
    CLOSE = 1
