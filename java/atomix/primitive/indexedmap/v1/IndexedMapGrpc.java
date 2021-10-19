package atomix.primitive.indexedmap.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * IndexedMap is a service for a sorted/indexed map primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/indexedmap/v1/primitive.proto")
public final class IndexedMapGrpc {

  private IndexedMapGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.indexedmap.v1.IndexedMap";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.SizeRequest,
      atomix.primitive.indexedmap.v1.Primitive.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.indexedmap.v1.Primitive.SizeRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.SizeRequest,
      atomix.primitive.indexedmap.v1.Primitive.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.SizeRequest, atomix.primitive.indexedmap.v1.Primitive.SizeResponse> getSizeMethod;
    if ((getSizeMethod = IndexedMapGrpc.getSizeMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getSizeMethod = IndexedMapGrpc.getSizeMethod) == null) {
          IndexedMapGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.SizeRequest, atomix.primitive.indexedmap.v1.Primitive.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.PutRequest,
      atomix.primitive.indexedmap.v1.Primitive.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = atomix.primitive.indexedmap.v1.Primitive.PutRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.PutRequest,
      atomix.primitive.indexedmap.v1.Primitive.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.PutRequest, atomix.primitive.indexedmap.v1.Primitive.PutResponse> getPutMethod;
    if ((getPutMethod = IndexedMapGrpc.getPutMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getPutMethod = IndexedMapGrpc.getPutMethod) == null) {
          IndexedMapGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.PutRequest, atomix.primitive.indexedmap.v1.Primitive.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.GetRequest,
      atomix.primitive.indexedmap.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.indexedmap.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.GetRequest,
      atomix.primitive.indexedmap.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.GetRequest, atomix.primitive.indexedmap.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = IndexedMapGrpc.getGetMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getGetMethod = IndexedMapGrpc.getGetMethod) == null) {
          IndexedMapGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.GetRequest, atomix.primitive.indexedmap.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse> getFirstEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FirstEntry",
      requestType = atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse> getFirstEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest, atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse> getFirstEntryMethod;
    if ((getFirstEntryMethod = IndexedMapGrpc.getFirstEntryMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getFirstEntryMethod = IndexedMapGrpc.getFirstEntryMethod) == null) {
          IndexedMapGrpc.getFirstEntryMethod = getFirstEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest, atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FirstEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("FirstEntry"))
              .build();
        }
      }
    }
    return getFirstEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse> getLastEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEntry",
      requestType = atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse> getLastEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest, atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse> getLastEntryMethod;
    if ((getLastEntryMethod = IndexedMapGrpc.getLastEntryMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getLastEntryMethod = IndexedMapGrpc.getLastEntryMethod) == null) {
          IndexedMapGrpc.getLastEntryMethod = getLastEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest, atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("LastEntry"))
              .build();
        }
      }
    }
    return getLastEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse> getPrevEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevEntry",
      requestType = atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse> getPrevEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest, atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse> getPrevEntryMethod;
    if ((getPrevEntryMethod = IndexedMapGrpc.getPrevEntryMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getPrevEntryMethod = IndexedMapGrpc.getPrevEntryMethod) == null) {
          IndexedMapGrpc.getPrevEntryMethod = getPrevEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest, atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("PrevEntry"))
              .build();
        }
      }
    }
    return getPrevEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse> getNextEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextEntry",
      requestType = atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest,
      atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse> getNextEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest, atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse> getNextEntryMethod;
    if ((getNextEntryMethod = IndexedMapGrpc.getNextEntryMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getNextEntryMethod = IndexedMapGrpc.getNextEntryMethod) == null) {
          IndexedMapGrpc.getNextEntryMethod = getNextEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest, atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("NextEntry"))
              .build();
        }
      }
    }
    return getNextEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.RemoveRequest,
      atomix.primitive.indexedmap.v1.Primitive.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.indexedmap.v1.Primitive.RemoveRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.RemoveRequest,
      atomix.primitive.indexedmap.v1.Primitive.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.RemoveRequest, atomix.primitive.indexedmap.v1.Primitive.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = IndexedMapGrpc.getRemoveMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getRemoveMethod = IndexedMapGrpc.getRemoveMethod) == null) {
          IndexedMapGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.RemoveRequest, atomix.primitive.indexedmap.v1.Primitive.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.ClearRequest,
      atomix.primitive.indexedmap.v1.Primitive.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.indexedmap.v1.Primitive.ClearRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.ClearRequest,
      atomix.primitive.indexedmap.v1.Primitive.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.ClearRequest, atomix.primitive.indexedmap.v1.Primitive.ClearResponse> getClearMethod;
    if ((getClearMethod = IndexedMapGrpc.getClearMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getClearMethod = IndexedMapGrpc.getClearMethod) == null) {
          IndexedMapGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.ClearRequest, atomix.primitive.indexedmap.v1.Primitive.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.EventsRequest,
      atomix.primitive.indexedmap.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.indexedmap.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.EventsRequest,
      atomix.primitive.indexedmap.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.EventsRequest, atomix.primitive.indexedmap.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = IndexedMapGrpc.getEventsMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getEventsMethod = IndexedMapGrpc.getEventsMethod) == null) {
          IndexedMapGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.EventsRequest, atomix.primitive.indexedmap.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.EntriesRequest,
      atomix.primitive.indexedmap.v1.Primitive.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.primitive.indexedmap.v1.Primitive.EntriesRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Primitive.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.EntriesRequest,
      atomix.primitive.indexedmap.v1.Primitive.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Primitive.EntriesRequest, atomix.primitive.indexedmap.v1.Primitive.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = IndexedMapGrpc.getEntriesMethod) == null) {
      synchronized (IndexedMapGrpc.class) {
        if ((getEntriesMethod = IndexedMapGrpc.getEntriesMethod) == null) {
          IndexedMapGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Primitive.EntriesRequest, atomix.primitive.indexedmap.v1.Primitive.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Primitive.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexedMapStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapStub>() {
        @java.lang.Override
        public IndexedMapStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapStub(channel, callOptions);
        }
      };
    return IndexedMapStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexedMapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapBlockingStub>() {
        @java.lang.Override
        public IndexedMapBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapBlockingStub(channel, callOptions);
        }
      };
    return IndexedMapBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexedMapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapFutureStub>() {
        @java.lang.Override
        public IndexedMapFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapFutureStub(channel, callOptions);
        }
      };
    return IndexedMapFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IndexedMap is a service for a sorted/indexed map primitive
   * </pre>
   */
  public static abstract class IndexedMapImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.indexedmap.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.indexedmap.v1.Primitive.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.indexedmap.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public void firstEntry(atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFirstEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public void lastEntry(atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public void prevEntry(atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrevEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public void nextEntry(atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.indexedmap.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.indexedmap.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.indexedmap.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.indexedmap.v1.Primitive.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.EntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.SizeRequest,
                atomix.primitive.indexedmap.v1.Primitive.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.PutRequest,
                atomix.primitive.indexedmap.v1.Primitive.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.GetRequest,
                atomix.primitive.indexedmap.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getFirstEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest,
                atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse>(
                  this, METHODID_FIRST_ENTRY)))
          .addMethod(
            getLastEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest,
                atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse>(
                  this, METHODID_LAST_ENTRY)))
          .addMethod(
            getPrevEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest,
                atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse>(
                  this, METHODID_PREV_ENTRY)))
          .addMethod(
            getNextEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest,
                atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse>(
                  this, METHODID_NEXT_ENTRY)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.RemoveRequest,
                atomix.primitive.indexedmap.v1.Primitive.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.ClearRequest,
                atomix.primitive.indexedmap.v1.Primitive.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.EventsRequest,
                atomix.primitive.indexedmap.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Primitive.EntriesRequest,
                atomix.primitive.indexedmap.v1.Primitive.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * IndexedMap is a service for a sorted/indexed map primitive
   * </pre>
   */
  public static final class IndexedMapStub extends io.grpc.stub.AbstractAsyncStub<IndexedMapStub> {
    private IndexedMapStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.indexedmap.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.indexedmap.v1.Primitive.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.indexedmap.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public void firstEntry(atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public void lastEntry(atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public void prevEntry(atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public void nextEntry(atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.indexedmap.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.indexedmap.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.indexedmap.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.indexedmap.v1.Primitive.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.EntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IndexedMap is a service for a sorted/indexed map primitive
   * </pre>
   */
  public static final class IndexedMapBlockingStub extends io.grpc.stub.AbstractBlockingStub<IndexedMapBlockingStub> {
    private IndexedMapBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.SizeResponse size(atomix.primitive.indexedmap.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.PutResponse put(atomix.primitive.indexedmap.v1.Primitive.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.GetResponse get(atomix.primitive.indexedmap.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse firstEntry(atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFirstEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse lastEntry(atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse prevEntry(atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrevEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse nextEntry(atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.RemoveResponse remove(atomix.primitive.indexedmap.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public atomix.primitive.indexedmap.v1.Primitive.ClearResponse clear(atomix.primitive.indexedmap.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.indexedmap.v1.Primitive.EventsResponse> events(
        atomix.primitive.indexedmap.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.indexedmap.v1.Primitive.EntriesResponse> entries(
        atomix.primitive.indexedmap.v1.Primitive.EntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IndexedMap is a service for a sorted/indexed map primitive
   * </pre>
   */
  public static final class IndexedMapFutureStub extends io.grpc.stub.AbstractFutureStub<IndexedMapFutureStub> {
    private IndexedMapFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.SizeResponse> size(
        atomix.primitive.indexedmap.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.PutResponse> put(
        atomix.primitive.indexedmap.v1.Primitive.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.GetResponse> get(
        atomix.primitive.indexedmap.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse> firstEntry(
        atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse> lastEntry(
        atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse> prevEntry(
        atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse> nextEntry(
        atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.RemoveResponse> remove(
        atomix.primitive.indexedmap.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Primitive.ClearResponse> clear(
        atomix.primitive.indexedmap.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIZE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_FIRST_ENTRY = 3;
  private static final int METHODID_LAST_ENTRY = 4;
  private static final int METHODID_PREV_ENTRY = 5;
  private static final int METHODID_NEXT_ENTRY = 6;
  private static final int METHODID_REMOVE = 7;
  private static final int METHODID_CLEAR = 8;
  private static final int METHODID_EVENTS = 9;
  private static final int METHODID_ENTRIES = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IndexedMapImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndexedMapImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.indexedmap.v1.Primitive.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.SizeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((atomix.primitive.indexedmap.v1.Primitive.PutRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.indexedmap.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_FIRST_ENTRY:
          serviceImpl.firstEntry((atomix.primitive.indexedmap.v1.Primitive.FirstEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.FirstEntryResponse>) responseObserver);
          break;
        case METHODID_LAST_ENTRY:
          serviceImpl.lastEntry((atomix.primitive.indexedmap.v1.Primitive.LastEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.LastEntryResponse>) responseObserver);
          break;
        case METHODID_PREV_ENTRY:
          serviceImpl.prevEntry((atomix.primitive.indexedmap.v1.Primitive.PrevEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.PrevEntryResponse>) responseObserver);
          break;
        case METHODID_NEXT_ENTRY:
          serviceImpl.nextEntry((atomix.primitive.indexedmap.v1.Primitive.NextEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.NextEntryResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.indexedmap.v1.Primitive.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.indexedmap.v1.Primitive.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.indexedmap.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.EventsResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.primitive.indexedmap.v1.Primitive.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Primitive.EntriesResponse>) responseObserver);
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

  private static abstract class IndexedMapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexedMapBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.indexedmap.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IndexedMap");
    }
  }

  private static final class IndexedMapFileDescriptorSupplier
      extends IndexedMapBaseDescriptorSupplier {
    IndexedMapFileDescriptorSupplier() {}
  }

  private static final class IndexedMapMethodDescriptorSupplier
      extends IndexedMapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndexedMapMethodDescriptorSupplier(String methodName) {
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
      synchronized (IndexedMapGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexedMapFileDescriptorSupplier())
              .addMethod(getSizeMethod())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getFirstEntryMethod())
              .addMethod(getLastEntryMethod())
              .addMethod(getPrevEntryMethod())
              .addMethod(getNextEntryMethod())
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
