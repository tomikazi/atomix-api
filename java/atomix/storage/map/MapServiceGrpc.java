package atomix.storage.map;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * MapService implements a distributed map
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/map/map.proto")
public final class MapServiceGrpc {

  private MapServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.map.MapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.CreateRequest,
      atomix.storage.map.Map.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.storage.map.Map.CreateRequest.class,
      responseType = atomix.storage.map.Map.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.CreateRequest,
      atomix.storage.map.Map.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.CreateRequest, atomix.storage.map.Map.CreateResponse> getCreateMethod;
    if ((getCreateMethod = MapServiceGrpc.getCreateMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getCreateMethod = MapServiceGrpc.getCreateMethod) == null) {
          MapServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.CreateRequest, atomix.storage.map.Map.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.CloseRequest,
      atomix.storage.map.Map.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.storage.map.Map.CloseRequest.class,
      responseType = atomix.storage.map.Map.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.CloseRequest,
      atomix.storage.map.Map.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.CloseRequest, atomix.storage.map.Map.CloseResponse> getCloseMethod;
    if ((getCloseMethod = MapServiceGrpc.getCloseMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getCloseMethod = MapServiceGrpc.getCloseMethod) == null) {
          MapServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.CloseRequest, atomix.storage.map.Map.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.SizeRequest,
      atomix.storage.map.Map.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.storage.map.Map.SizeRequest.class,
      responseType = atomix.storage.map.Map.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.SizeRequest,
      atomix.storage.map.Map.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.SizeRequest, atomix.storage.map.Map.SizeResponse> getSizeMethod;
    if ((getSizeMethod = MapServiceGrpc.getSizeMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getSizeMethod = MapServiceGrpc.getSizeMethod) == null) {
          MapServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.SizeRequest, atomix.storage.map.Map.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.ExistsRequest,
      atomix.storage.map.Map.ExistsResponse> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = atomix.storage.map.Map.ExistsRequest.class,
      responseType = atomix.storage.map.Map.ExistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.ExistsRequest,
      atomix.storage.map.Map.ExistsResponse> getExistsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.ExistsRequest, atomix.storage.map.Map.ExistsResponse> getExistsMethod;
    if ((getExistsMethod = MapServiceGrpc.getExistsMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getExistsMethod = MapServiceGrpc.getExistsMethod) == null) {
          MapServiceGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.ExistsRequest, atomix.storage.map.Map.ExistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.ExistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.ExistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.PutRequest,
      atomix.storage.map.Map.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = atomix.storage.map.Map.PutRequest.class,
      responseType = atomix.storage.map.Map.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.PutRequest,
      atomix.storage.map.Map.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.PutRequest, atomix.storage.map.Map.PutResponse> getPutMethod;
    if ((getPutMethod = MapServiceGrpc.getPutMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getPutMethod = MapServiceGrpc.getPutMethod) == null) {
          MapServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.PutRequest, atomix.storage.map.Map.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.ReplaceRequest,
      atomix.storage.map.Map.ReplaceResponse> getReplaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Replace",
      requestType = atomix.storage.map.Map.ReplaceRequest.class,
      responseType = atomix.storage.map.Map.ReplaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.ReplaceRequest,
      atomix.storage.map.Map.ReplaceResponse> getReplaceMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.ReplaceRequest, atomix.storage.map.Map.ReplaceResponse> getReplaceMethod;
    if ((getReplaceMethod = MapServiceGrpc.getReplaceMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getReplaceMethod = MapServiceGrpc.getReplaceMethod) == null) {
          MapServiceGrpc.getReplaceMethod = getReplaceMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.ReplaceRequest, atomix.storage.map.Map.ReplaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Replace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.ReplaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.ReplaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Replace"))
              .build();
        }
      }
    }
    return getReplaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.GetRequest,
      atomix.storage.map.Map.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.storage.map.Map.GetRequest.class,
      responseType = atomix.storage.map.Map.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.GetRequest,
      atomix.storage.map.Map.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.GetRequest, atomix.storage.map.Map.GetResponse> getGetMethod;
    if ((getGetMethod = MapServiceGrpc.getGetMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getGetMethod = MapServiceGrpc.getGetMethod) == null) {
          MapServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.GetRequest, atomix.storage.map.Map.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.RemoveRequest,
      atomix.storage.map.Map.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.storage.map.Map.RemoveRequest.class,
      responseType = atomix.storage.map.Map.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.RemoveRequest,
      atomix.storage.map.Map.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.RemoveRequest, atomix.storage.map.Map.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = MapServiceGrpc.getRemoveMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getRemoveMethod = MapServiceGrpc.getRemoveMethod) == null) {
          MapServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.RemoveRequest, atomix.storage.map.Map.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.ClearRequest,
      atomix.storage.map.Map.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.storage.map.Map.ClearRequest.class,
      responseType = atomix.storage.map.Map.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.ClearRequest,
      atomix.storage.map.Map.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.ClearRequest, atomix.storage.map.Map.ClearResponse> getClearMethod;
    if ((getClearMethod = MapServiceGrpc.getClearMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getClearMethod = MapServiceGrpc.getClearMethod) == null) {
          MapServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.ClearRequest, atomix.storage.map.Map.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.EventRequest,
      atomix.storage.map.Map.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.storage.map.Map.EventRequest.class,
      responseType = atomix.storage.map.Map.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.EventRequest,
      atomix.storage.map.Map.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.EventRequest, atomix.storage.map.Map.EventResponse> getEventsMethod;
    if ((getEventsMethod = MapServiceGrpc.getEventsMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getEventsMethod = MapServiceGrpc.getEventsMethod) == null) {
          MapServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.EventRequest, atomix.storage.map.Map.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.map.Map.EntriesRequest,
      atomix.storage.map.Map.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.storage.map.Map.EntriesRequest.class,
      responseType = atomix.storage.map.Map.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.map.Map.EntriesRequest,
      atomix.storage.map.Map.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.storage.map.Map.EntriesRequest, atomix.storage.map.Map.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = MapServiceGrpc.getEntriesMethod) == null) {
      synchronized (MapServiceGrpc.class) {
        if ((getEntriesMethod = MapServiceGrpc.getEntriesMethod) == null) {
          MapServiceGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.storage.map.Map.EntriesRequest, atomix.storage.map.Map.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.map.Map.EntriesResponse.getDefaultInstance()))
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
     * Create creates an indexed map
     * </pre>
     */
    public void create(atomix.storage.map.Map.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public void close(atomix.storage.map.Map.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.storage.map.Map.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.SizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public void exists(atomix.storage.map.Map.ExistsRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.ExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.storage.map.Map.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public void replace(atomix.storage.map.Map.ReplaceRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.ReplaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReplaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.storage.map.Map.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.storage.map.Map.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.RemoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.storage.map.Map.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.ClearResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.storage.map.Map.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.storage.map.Map.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.EntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.CreateRequest,
                atomix.storage.map.Map.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.CloseRequest,
                atomix.storage.map.Map.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.SizeRequest,
                atomix.storage.map.Map.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getExistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.ExistsRequest,
                atomix.storage.map.Map.ExistsResponse>(
                  this, METHODID_EXISTS)))
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.PutRequest,
                atomix.storage.map.Map.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getReplaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.ReplaceRequest,
                atomix.storage.map.Map.ReplaceResponse>(
                  this, METHODID_REPLACE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.GetRequest,
                atomix.storage.map.Map.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.RemoveRequest,
                atomix.storage.map.Map.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.map.Map.ClearRequest,
                atomix.storage.map.Map.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.map.Map.EventRequest,
                atomix.storage.map.Map.EventResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.map.Map.EntriesRequest,
                atomix.storage.map.Map.EntriesResponse>(
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
     * Create creates an indexed map
     * </pre>
     */
    public void create(atomix.storage.map.Map.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public void close(atomix.storage.map.Map.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.storage.map.Map.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.SizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public void exists(atomix.storage.map.Map.ExistsRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.ExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.storage.map.Map.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public void replace(atomix.storage.map.Map.ReplaceRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.ReplaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReplaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.storage.map.Map.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.storage.map.Map.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.RemoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.storage.map.Map.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.ClearResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.storage.map.Map.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.storage.map.Map.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.map.Map.EntriesResponse> responseObserver) {
      asyncServerStreamingCall(
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
     * Create creates an indexed map
     * </pre>
     */
    public atomix.storage.map.Map.CreateResponse create(atomix.storage.map.Map.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public atomix.storage.map.Map.CloseResponse close(atomix.storage.map.Map.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public atomix.storage.map.Map.SizeResponse size(atomix.storage.map.Map.SizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public atomix.storage.map.Map.ExistsResponse exists(atomix.storage.map.Map.ExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public atomix.storage.map.Map.PutResponse put(atomix.storage.map.Map.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public atomix.storage.map.Map.ReplaceResponse replace(atomix.storage.map.Map.ReplaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getReplaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public atomix.storage.map.Map.GetResponse get(atomix.storage.map.Map.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public atomix.storage.map.Map.RemoveResponse remove(atomix.storage.map.Map.RemoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public atomix.storage.map.Map.ClearResponse clear(atomix.storage.map.Map.ClearRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.storage.map.Map.EventResponse> events(
        atomix.storage.map.Map.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public java.util.Iterator<atomix.storage.map.Map.EntriesResponse> entries(
        atomix.storage.map.Map.EntriesRequest request) {
      return blockingServerStreamingCall(
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
     * Create creates an indexed map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.CreateResponse> create(
        atomix.storage.map.Map.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.CloseResponse> close(
        atomix.storage.map.Map.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.SizeResponse> size(
        atomix.storage.map.Map.SizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.ExistsResponse> exists(
        atomix.storage.map.Map.ExistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.PutResponse> put(
        atomix.storage.map.Map.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.ReplaceResponse> replace(
        atomix.storage.map.Map.ReplaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReplaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.GetResponse> get(
        atomix.storage.map.Map.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.RemoveResponse> remove(
        atomix.storage.map.Map.RemoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.map.Map.ClearResponse> clear(
        atomix.storage.map.Map.ClearRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SIZE = 2;
  private static final int METHODID_EXISTS = 3;
  private static final int METHODID_PUT = 4;
  private static final int METHODID_REPLACE = 5;
  private static final int METHODID_GET = 6;
  private static final int METHODID_REMOVE = 7;
  private static final int METHODID_CLEAR = 8;
  private static final int METHODID_EVENTS = 9;
  private static final int METHODID_ENTRIES = 10;

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
        case METHODID_CREATE:
          serviceImpl.create((atomix.storage.map.Map.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.storage.map.Map.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.CloseResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((atomix.storage.map.Map.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.SizeResponse>) responseObserver);
          break;
        case METHODID_EXISTS:
          serviceImpl.exists((atomix.storage.map.Map.ExistsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.ExistsResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((atomix.storage.map.Map.PutRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.PutResponse>) responseObserver);
          break;
        case METHODID_REPLACE:
          serviceImpl.replace((atomix.storage.map.Map.ReplaceRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.ReplaceResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.storage.map.Map.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.GetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.storage.map.Map.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.storage.map.Map.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.storage.map.Map.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.EventResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.storage.map.Map.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.map.Map.EntriesResponse>) responseObserver);
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
      return atomix.storage.map.Map.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSizeMethod())
              .addMethod(getExistsMethod())
              .addMethod(getPutMethod())
              .addMethod(getReplaceMethod())
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
