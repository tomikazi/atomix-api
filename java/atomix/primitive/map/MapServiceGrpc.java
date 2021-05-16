package atomix.primitive.map;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MapService implements a distributed map
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/map/map.proto")
public final class MapServiceGrpc {

  private MapServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.map.MapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.SizeRequest,
      atomix.primitive.map.Map.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.map.Map.SizeRequest.class,
      responseType = atomix.primitive.map.Map.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.SizeRequest,
      atomix.primitive.map.Map.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.SizeRequest, atomix.primitive.map.Map.SizeResponse> getSizeMethod;
    if ((getSizeMethod = MapServiceGrpc.getSizeMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getSizeMethod = MapServiceGrpc.getSizeMethod) == null) {
          MapServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.SizeRequest, atomix.primitive.map.Map.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.PutRequest,
      atomix.primitive.map.Map.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = atomix.primitive.map.Map.PutRequest.class,
      responseType = atomix.primitive.map.Map.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.PutRequest,
      atomix.primitive.map.Map.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.PutRequest, atomix.primitive.map.Map.PutResponse> getPutMethod;
    if ((getPutMethod = MapServiceGrpc.getPutMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getPutMethod = MapServiceGrpc.getPutMethod) == null) {
          MapServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.PutRequest, atomix.primitive.map.Map.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.GetRequest,
      atomix.primitive.map.Map.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.map.Map.GetRequest.class,
      responseType = atomix.primitive.map.Map.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.GetRequest,
      atomix.primitive.map.Map.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.GetRequest, atomix.primitive.map.Map.GetResponse> getGetMethod;
    if ((getGetMethod = MapServiceGrpc.getGetMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getGetMethod = MapServiceGrpc.getGetMethod) == null) {
          MapServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.GetRequest, atomix.primitive.map.Map.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.RemoveRequest,
      atomix.primitive.map.Map.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.map.Map.RemoveRequest.class,
      responseType = atomix.primitive.map.Map.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.RemoveRequest,
      atomix.primitive.map.Map.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.RemoveRequest, atomix.primitive.map.Map.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = MapServiceGrpc.getRemoveMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getRemoveMethod = MapServiceGrpc.getRemoveMethod) == null) {
          MapServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.RemoveRequest, atomix.primitive.map.Map.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.ClearRequest,
      atomix.primitive.map.Map.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.map.Map.ClearRequest.class,
      responseType = atomix.primitive.map.Map.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.ClearRequest,
      atomix.primitive.map.Map.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.ClearRequest, atomix.primitive.map.Map.ClearResponse> getClearMethod;
    if ((getClearMethod = MapServiceGrpc.getClearMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getClearMethod = MapServiceGrpc.getClearMethod) == null) {
          MapServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.ClearRequest, atomix.primitive.map.Map.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.EventsRequest,
      atomix.primitive.map.Map.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.map.Map.EventsRequest.class,
      responseType = atomix.primitive.map.Map.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.EventsRequest,
      atomix.primitive.map.Map.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.EventsRequest, atomix.primitive.map.Map.EventsResponse> getEventsMethod;
    if ((getEventsMethod = MapServiceGrpc.getEventsMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getEventsMethod = MapServiceGrpc.getEventsMethod) == null) {
          MapServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.EventsRequest, atomix.primitive.map.Map.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.Map.EntriesRequest,
      atomix.primitive.map.Map.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.primitive.map.Map.EntriesRequest.class,
      responseType = atomix.primitive.map.Map.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.Map.EntriesRequest,
      atomix.primitive.map.Map.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.Map.EntriesRequest, atomix.primitive.map.Map.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = MapServiceGrpc.getEntriesMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getEntriesMethod = MapServiceGrpc.getEntriesMethod) == null) {
          MapServiceGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.Map.EntriesRequest, atomix.primitive.map.Map.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.Map.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapServiceStub>() {
        @java.lang.Override
        public MapServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapServiceStub(channel, callOptions);
        }
      };
    return MapServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapServiceBlockingStub>() {
        @java.lang.Override
        public MapServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapServiceBlockingStub(channel, callOptions);
        }
      };
    return MapServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapServiceFutureStub>() {
        @java.lang.Override
        public MapServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapServiceFutureStub(channel, callOptions);
        }
      };
    return MapServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MapService implements a distributed map
   * </pre>
   */
  public static abstract class MapServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.map.Map.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.map.Map.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.map.Map.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.map.Map.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.map.Map.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.map.Map.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.map.Map.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.EntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.Map.SizeRequest,
                atomix.primitive.map.Map.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.Map.PutRequest,
                atomix.primitive.map.Map.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.Map.GetRequest,
                atomix.primitive.map.Map.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.Map.RemoveRequest,
                atomix.primitive.map.Map.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.Map.ClearRequest,
                atomix.primitive.map.Map.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.map.Map.EventsRequest,
                atomix.primitive.map.Map.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.map.Map.EntriesRequest,
                atomix.primitive.map.Map.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * MapService implements a distributed map
   * </pre>
   */
  public static final class MapServiceStub extends io.grpc.stub.AbstractAsyncStub<MapServiceStub> {
    private MapServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.map.Map.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.map.Map.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.map.Map.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.map.Map.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.map.Map.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.map.Map.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.map.Map.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.Map.EntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MapService implements a distributed map
   * </pre>
   */
  public static final class MapServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MapServiceBlockingStub> {
    private MapServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public atomix.primitive.map.Map.SizeResponse size(atomix.primitive.map.Map.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public atomix.primitive.map.Map.PutResponse put(atomix.primitive.map.Map.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public atomix.primitive.map.Map.GetResponse get(atomix.primitive.map.Map.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public atomix.primitive.map.Map.RemoveResponse remove(atomix.primitive.map.Map.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public atomix.primitive.map.Map.ClearResponse clear(atomix.primitive.map.Map.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.map.Map.EventsResponse> events(
        atomix.primitive.map.Map.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.map.Map.EntriesResponse> entries(
        atomix.primitive.map.Map.EntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MapService implements a distributed map
   * </pre>
   */
  public static final class MapServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MapServiceFutureStub> {
    private MapServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.Map.SizeResponse> size(
        atomix.primitive.map.Map.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.Map.PutResponse> put(
        atomix.primitive.map.Map.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.Map.GetResponse> get(
        atomix.primitive.map.Map.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.Map.RemoveResponse> remove(
        atomix.primitive.map.Map.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.Map.ClearResponse> clear(
        atomix.primitive.map.Map.ClearRequest request) {
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
    private final MapServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.map.Map.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.SizeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((atomix.primitive.map.Map.PutRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.map.Map.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.GetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.map.Map.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.map.Map.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.map.Map.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.EventsResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.primitive.map.Map.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.Map.EntriesResponse>) responseObserver);
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

  private static abstract class MapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.map.Map.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MapService");
    }
  }

  private static final class MapServiceFileDescriptorSupplier
      extends MapServiceBaseDescriptorSupplier {
    MapServiceFileDescriptorSupplier() {}
  }

  private static final class MapServiceMethodDescriptorSupplier
      extends MapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MapServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapServiceFileDescriptorSupplier())
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
