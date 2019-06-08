# Atomix Protobuf API

This project provides a [Protobuf] API for [Atomix] 4.

The Protobuf API defines the primary interface through which Atomix clients
communicate with Atomix partition servers. The API is separated into
two parts:
* Controller API - The `atomix.controller` package defines services
to be implemented by Atomix cluster controllers. Controller services aid
clients in locating and managing partition groups.
* Primitive API - Remaining `atomix.*` packages define messages and services
to be implemented by Atomix partition servers. Primitive services define
APIs for creating, managing, and operating on various types of
distributed primitives.

Protobuf: https://developers.google.com/protocol-buffers/
Atomix: https://atomix.io
