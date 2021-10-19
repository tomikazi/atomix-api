package atomix.primitive.map.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Map is a service for a map primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/map/v1/primitive.proto")
public final class MapGrpc {

  private MapGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.map.v1.Map";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.SizeRequest,
      atomix.primitive.map.v1.Primitive.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.map.v1.Primitive.SizeRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.SizeRequest,
      atomix.primitive.map.v1.Primitive.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.SizeRequest, atomix.primitive.map.v1.Primitive.SizeResponse> getSizeMethod;
    if ((getSizeMethod = MapGrpc.getSizeMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getSizeMethod = MapGrpc.getSizeMethod) == null) {
          MapGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.SizeRequest, atomix.primitive.map.v1.Primitive.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.PutRequest,
      atomix.primitive.map.v1.Primitive.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = atomix.primitive.map.v1.Primitive.PutRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.PutRequest,
      atomix.primitive.map.v1.Primitive.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.PutRequest, atomix.primitive.map.v1.Primitive.PutResponse> getPutMethod;
    if ((getPutMethod = MapGrpc.getPutMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getPutMethod = MapGrpc.getPutMethod) == null) {
          MapGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.PutRequest, atomix.primitive.map.v1.Primitive.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.GetRequest,
      atomix.primitive.map.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.map.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.GetRequest,
      atomix.primitive.map.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.GetRequest, atomix.primitive.map.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = MapGrpc.getGetMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getGetMethod = MapGrpc.getGetMethod) == null) {
          MapGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.GetRequest, atomix.primitive.map.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.RemoveRequest,
      atomix.primitive.map.v1.Primitive.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.map.v1.Primitive.RemoveRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.RemoveRequest,
      atomix.primitive.map.v1.Primitive.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.RemoveRequest, atomix.primitive.map.v1.Primitive.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = MapGrpc.getRemoveMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getRemoveMethod = MapGrpc.getRemoveMethod) == null) {
          MapGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.RemoveRequest, atomix.primitive.map.v1.Primitive.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.ClearRequest,
      atomix.primitive.map.v1.Primitive.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.map.v1.Primitive.ClearRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.ClearRequest,
      atomix.primitive.map.v1.Primitive.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.ClearRequest, atomix.primitive.map.v1.Primitive.ClearResponse> getClearMethod;
    if ((getClearMethod = MapGrpc.getClearMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getClearMethod = MapGrpc.getClearMethod) == null) {
          MapGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.ClearRequest, atomix.primitive.map.v1.Primitive.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.EventsRequest,
      atomix.primitive.map.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.map.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.EventsRequest,
      atomix.primitive.map.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.EventsRequest, atomix.primitive.map.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = MapGrpc.getEventsMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getEventsMethod = MapGrpc.getEventsMethod) == null) {
          MapGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.EventsRequest, atomix.primitive.map.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.EntriesRequest,
      atomix.primitive.map.v1.Primitive.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.primitive.map.v1.Primitive.EntriesRequest.class,
      responseType = atomix.primitive.map.v1.Primitive.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.EntriesRequest,
      atomix.primitive.map.v1.Primitive.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Primitive.EntriesRequest, atomix.primitive.map.v1.Primitive.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = MapGrpc.getEntriesMethod) == null) {
      synchronized (MapGrpc.class) {
        if ((getEntriesMethod = MapGrpc.getEntriesMethod) == null) {
          MapGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Primitive.EntriesRequest, atomix.primitive.map.v1.Primitive.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Primitive.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapStub>() {
        @java.lang.Override
        public MapStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapStub(channel, callOptions);
        }
      };
    return MapStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapBlockingStub>() {
        @java.lang.Override
        public MapBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapBlockingStub(channel, callOptions);
        }
      };
    return MapBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapFutureStub>() {
        @java.lang.Override
        public MapFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapFutureStub(channel, callOptions);
        }
      };
    return MapFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Map is a service for a map primitive
   * </pre>
   */
  public static abstract class MapImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.map.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.map.v1.Primitive.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.map.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.map.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.map.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.map.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.map.v1.Primitive.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.EntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.SizeRequest,
                atomix.primitive.map.v1.Primitive.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.PutRequest,
                atomix.primitive.map.v1.Primitive.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.GetRequest,
                atomix.primitive.map.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.RemoveRequest,
                atomix.primitive.map.v1.Primitive.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.ClearRequest,
                atomix.primitive.map.v1.Primitive.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.EventsRequest,
                atomix.primitive.map.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Primitive.EntriesRequest,
                atomix.primitive.map.v1.Primitive.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Map is a service for a map primitive
   * </pre>
   */
  public static final class MapStub extends io.grpc.stub.AbstractAsyncStub<MapStub> {
    private MapStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.map.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.map.v1.Primitive.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.map.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.map.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.map.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.map.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.map.v1.Primitive.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.EntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Map is a service for a map primitive
   * </pre>
   */
  public static final class MapBlockingStub extends io.grpc.stub.AbstractBlockingStub<MapBlockingStub> {
    private MapBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public atomix.primitive.map.v1.Primitive.SizeResponse size(atomix.primitive.map.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public atomix.primitive.map.v1.Primitive.PutResponse put(atomix.primitive.map.v1.Primitive.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public atomix.primitive.map.v1.Primitive.GetResponse get(atomix.primitive.map.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public atomix.primitive.map.v1.Primitive.RemoveResponse remove(atomix.primitive.map.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public atomix.primitive.map.v1.Primitive.ClearResponse clear(atomix.primitive.map.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.map.v1.Primitive.EventsResponse> events(
        atomix.primitive.map.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.map.v1.Primitive.EntriesResponse> entries(
        atomix.primitive.map.v1.Primitive.EntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Map is a service for a map primitive
   * </pre>
   */
  public static final class MapFutureStub extends io.grpc.stub.AbstractFutureStub<MapFutureStub> {
    private MapFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Primitive.SizeResponse> size(
        atomix.primitive.map.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Primitive.PutResponse> put(
        atomix.primitive.map.v1.Primitive.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Primitive.GetResponse> get(
        atomix.primitive.map.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Primitive.RemoveResponse> remove(
        atomix.primitive.map.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Primitive.ClearResponse> clear(
        atomix.primitive.map.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIZE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_REMOVE = 3;
  private static final int METHODID_CLEAR = 4;
  private static final int METHODID_EVENTS = 5;
  private static final int METHODID_ENTRIES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.map.v1.Primitive.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.SizeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((atomix.primitive.map.v1.Primitive.PutRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.map.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.map.v1.Primitive.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.map.v1.Primitive.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.map.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.EventsResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.primitive.map.v1.Primitive.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Primitive.EntriesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.map.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Map");
    }
  }

  private static final class MapFileDescriptorSupplier
      extends MapBaseDescriptorSupplier {
    MapFileDescriptorSupplier() {}
  }

  private static final class MapMethodDescriptorSupplier
      extends MapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MapGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapFileDescriptorSupplier())
              .addMethod(getSizeMethod())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getClearMethod())
              .addMethod(getEventsMethod())
              .addMethod(getEntriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
