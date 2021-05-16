package atomix.primitive.indexedmap;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * IndexedMap service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/indexedmap/indexedmap.proto")
public final class IndexedMapServiceGrpc {

  private IndexedMapServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.indexedmap.IndexedMapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.SizeRequest,
      atomix.primitive.indexedmap.Indexedmap.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.indexedmap.Indexedmap.SizeRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.SizeRequest,
      atomix.primitive.indexedmap.Indexedmap.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.SizeRequest, atomix.primitive.indexedmap.Indexedmap.SizeResponse> getSizeMethod;
    if ((getSizeMethod = IndexedMapServiceGrpc.getSizeMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getSizeMethod = IndexedMapServiceGrpc.getSizeMethod) == null) {
          IndexedMapServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.SizeRequest, atomix.primitive.indexedmap.Indexedmap.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.PutRequest,
      atomix.primitive.indexedmap.Indexedmap.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = atomix.primitive.indexedmap.Indexedmap.PutRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.PutRequest,
      atomix.primitive.indexedmap.Indexedmap.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.PutRequest, atomix.primitive.indexedmap.Indexedmap.PutResponse> getPutMethod;
    if ((getPutMethod = IndexedMapServiceGrpc.getPutMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getPutMethod = IndexedMapServiceGrpc.getPutMethod) == null) {
          IndexedMapServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.PutRequest, atomix.primitive.indexedmap.Indexedmap.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.GetRequest,
      atomix.primitive.indexedmap.Indexedmap.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.indexedmap.Indexedmap.GetRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.GetRequest,
      atomix.primitive.indexedmap.Indexedmap.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.GetRequest, atomix.primitive.indexedmap.Indexedmap.GetResponse> getGetMethod;
    if ((getGetMethod = IndexedMapServiceGrpc.getGetMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getGetMethod = IndexedMapServiceGrpc.getGetMethod) == null) {
          IndexedMapServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.GetRequest, atomix.primitive.indexedmap.Indexedmap.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse> getFirstEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FirstEntry",
      requestType = atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse> getFirstEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest, atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse> getFirstEntryMethod;
    if ((getFirstEntryMethod = IndexedMapServiceGrpc.getFirstEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getFirstEntryMethod = IndexedMapServiceGrpc.getFirstEntryMethod) == null) {
          IndexedMapServiceGrpc.getFirstEntryMethod = getFirstEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest, atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FirstEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("FirstEntry"))
              .build();
        }
      }
    }
    return getFirstEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.LastEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.LastEntryResponse> getLastEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEntry",
      requestType = atomix.primitive.indexedmap.Indexedmap.LastEntryRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.LastEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.LastEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.LastEntryResponse> getLastEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.LastEntryRequest, atomix.primitive.indexedmap.Indexedmap.LastEntryResponse> getLastEntryMethod;
    if ((getLastEntryMethod = IndexedMapServiceGrpc.getLastEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getLastEntryMethod = IndexedMapServiceGrpc.getLastEntryMethod) == null) {
          IndexedMapServiceGrpc.getLastEntryMethod = getLastEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.LastEntryRequest, atomix.primitive.indexedmap.Indexedmap.LastEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.LastEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.LastEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("LastEntry"))
              .build();
        }
      }
    }
    return getLastEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse> getPrevEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevEntry",
      requestType = atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse> getPrevEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest, atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse> getPrevEntryMethod;
    if ((getPrevEntryMethod = IndexedMapServiceGrpc.getPrevEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getPrevEntryMethod = IndexedMapServiceGrpc.getPrevEntryMethod) == null) {
          IndexedMapServiceGrpc.getPrevEntryMethod = getPrevEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest, atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("PrevEntry"))
              .build();
        }
      }
    }
    return getPrevEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.NextEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.NextEntryResponse> getNextEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextEntry",
      requestType = atomix.primitive.indexedmap.Indexedmap.NextEntryRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.NextEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.NextEntryRequest,
      atomix.primitive.indexedmap.Indexedmap.NextEntryResponse> getNextEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.NextEntryRequest, atomix.primitive.indexedmap.Indexedmap.NextEntryResponse> getNextEntryMethod;
    if ((getNextEntryMethod = IndexedMapServiceGrpc.getNextEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getNextEntryMethod = IndexedMapServiceGrpc.getNextEntryMethod) == null) {
          IndexedMapServiceGrpc.getNextEntryMethod = getNextEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.NextEntryRequest, atomix.primitive.indexedmap.Indexedmap.NextEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.NextEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.NextEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("NextEntry"))
              .build();
        }
      }
    }
    return getNextEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.RemoveRequest,
      atomix.primitive.indexedmap.Indexedmap.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.indexedmap.Indexedmap.RemoveRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.RemoveRequest,
      atomix.primitive.indexedmap.Indexedmap.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.RemoveRequest, atomix.primitive.indexedmap.Indexedmap.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = IndexedMapServiceGrpc.getRemoveMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getRemoveMethod = IndexedMapServiceGrpc.getRemoveMethod) == null) {
          IndexedMapServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.RemoveRequest, atomix.primitive.indexedmap.Indexedmap.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.ClearRequest,
      atomix.primitive.indexedmap.Indexedmap.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.indexedmap.Indexedmap.ClearRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.ClearRequest,
      atomix.primitive.indexedmap.Indexedmap.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.ClearRequest, atomix.primitive.indexedmap.Indexedmap.ClearResponse> getClearMethod;
    if ((getClearMethod = IndexedMapServiceGrpc.getClearMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getClearMethod = IndexedMapServiceGrpc.getClearMethod) == null) {
          IndexedMapServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.ClearRequest, atomix.primitive.indexedmap.Indexedmap.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.EventsRequest,
      atomix.primitive.indexedmap.Indexedmap.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.indexedmap.Indexedmap.EventsRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.EventsRequest,
      atomix.primitive.indexedmap.Indexedmap.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.EventsRequest, atomix.primitive.indexedmap.Indexedmap.EventsResponse> getEventsMethod;
    if ((getEventsMethod = IndexedMapServiceGrpc.getEventsMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getEventsMethod = IndexedMapServiceGrpc.getEventsMethod) == null) {
          IndexedMapServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.EventsRequest, atomix.primitive.indexedmap.Indexedmap.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.EntriesRequest,
      atomix.primitive.indexedmap.Indexedmap.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.primitive.indexedmap.Indexedmap.EntriesRequest.class,
      responseType = atomix.primitive.indexedmap.Indexedmap.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.EntriesRequest,
      atomix.primitive.indexedmap.Indexedmap.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.Indexedmap.EntriesRequest, atomix.primitive.indexedmap.Indexedmap.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = IndexedMapServiceGrpc.getEntriesMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getEntriesMethod = IndexedMapServiceGrpc.getEntriesMethod) == null) {
          IndexedMapServiceGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.Indexedmap.EntriesRequest, atomix.primitive.indexedmap.Indexedmap.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.Indexedmap.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexedMapServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceStub>() {
        @java.lang.Override
        public IndexedMapServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapServiceStub(channel, callOptions);
        }
      };
    return IndexedMapServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexedMapServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceBlockingStub>() {
        @java.lang.Override
        public IndexedMapServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapServiceBlockingStub(channel, callOptions);
        }
      };
    return IndexedMapServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexedMapServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceFutureStub>() {
        @java.lang.Override
        public IndexedMapServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapServiceFutureStub(channel, callOptions);
        }
      };
    return IndexedMapServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static abstract class IndexedMapServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.indexedmap.Indexedmap.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.indexedmap.Indexedmap.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.indexedmap.Indexedmap.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public void firstEntry(atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFirstEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public void lastEntry(atomix.primitive.indexedmap.Indexedmap.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.LastEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public void prevEntry(atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrevEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public void nextEntry(atomix.primitive.indexedmap.Indexedmap.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.NextEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.indexedmap.Indexedmap.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.indexedmap.Indexedmap.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.indexedmap.Indexedmap.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.indexedmap.Indexedmap.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.EntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.SizeRequest,
                atomix.primitive.indexedmap.Indexedmap.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.PutRequest,
                atomix.primitive.indexedmap.Indexedmap.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.GetRequest,
                atomix.primitive.indexedmap.Indexedmap.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getFirstEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest,
                atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse>(
                  this, METHODID_FIRST_ENTRY)))
          .addMethod(
            getLastEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.LastEntryRequest,
                atomix.primitive.indexedmap.Indexedmap.LastEntryResponse>(
                  this, METHODID_LAST_ENTRY)))
          .addMethod(
            getPrevEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest,
                atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse>(
                  this, METHODID_PREV_ENTRY)))
          .addMethod(
            getNextEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.NextEntryRequest,
                atomix.primitive.indexedmap.Indexedmap.NextEntryResponse>(
                  this, METHODID_NEXT_ENTRY)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.RemoveRequest,
                atomix.primitive.indexedmap.Indexedmap.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.ClearRequest,
                atomix.primitive.indexedmap.Indexedmap.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.EventsRequest,
                atomix.primitive.indexedmap.Indexedmap.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.Indexedmap.EntriesRequest,
                atomix.primitive.indexedmap.Indexedmap.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static final class IndexedMapServiceStub extends io.grpc.stub.AbstractAsyncStub<IndexedMapServiceStub> {
    private IndexedMapServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.primitive.indexedmap.Indexedmap.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.primitive.indexedmap.Indexedmap.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.primitive.indexedmap.Indexedmap.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public void firstEntry(atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public void lastEntry(atomix.primitive.indexedmap.Indexedmap.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.LastEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public void prevEntry(atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public void nextEntry(atomix.primitive.indexedmap.Indexedmap.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.NextEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.primitive.indexedmap.Indexedmap.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.primitive.indexedmap.Indexedmap.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.indexedmap.Indexedmap.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.primitive.indexedmap.Indexedmap.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.EntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static final class IndexedMapServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IndexedMapServiceBlockingStub> {
    private IndexedMapServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.SizeResponse size(atomix.primitive.indexedmap.Indexedmap.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.PutResponse put(atomix.primitive.indexedmap.Indexedmap.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.GetResponse get(atomix.primitive.indexedmap.Indexedmap.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse firstEntry(atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFirstEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.LastEntryResponse lastEntry(atomix.primitive.indexedmap.Indexedmap.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse prevEntry(atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrevEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.NextEntryResponse nextEntry(atomix.primitive.indexedmap.Indexedmap.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.RemoveResponse remove(atomix.primitive.indexedmap.Indexedmap.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public atomix.primitive.indexedmap.Indexedmap.ClearResponse clear(atomix.primitive.indexedmap.Indexedmap.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.indexedmap.Indexedmap.EventsResponse> events(
        atomix.primitive.indexedmap.Indexedmap.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.indexedmap.Indexedmap.EntriesResponse> entries(
        atomix.primitive.indexedmap.Indexedmap.EntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static final class IndexedMapServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IndexedMapServiceFutureStub> {
    private IndexedMapServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.SizeResponse> size(
        atomix.primitive.indexedmap.Indexedmap.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.PutResponse> put(
        atomix.primitive.indexedmap.Indexedmap.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.GetResponse> get(
        atomix.primitive.indexedmap.Indexedmap.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse> firstEntry(
        atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.LastEntryResponse> lastEntry(
        atomix.primitive.indexedmap.Indexedmap.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse> prevEntry(
        atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.NextEntryResponse> nextEntry(
        atomix.primitive.indexedmap.Indexedmap.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.RemoveResponse> remove(
        atomix.primitive.indexedmap.Indexedmap.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.Indexedmap.ClearResponse> clear(
        atomix.primitive.indexedmap.Indexedmap.ClearRequest request) {
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
    private final IndexedMapServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndexedMapServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.indexedmap.Indexedmap.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.SizeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((atomix.primitive.indexedmap.Indexedmap.PutRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.indexedmap.Indexedmap.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.GetResponse>) responseObserver);
          break;
        case METHODID_FIRST_ENTRY:
          serviceImpl.firstEntry((atomix.primitive.indexedmap.Indexedmap.FirstEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.FirstEntryResponse>) responseObserver);
          break;
        case METHODID_LAST_ENTRY:
          serviceImpl.lastEntry((atomix.primitive.indexedmap.Indexedmap.LastEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.LastEntryResponse>) responseObserver);
          break;
        case METHODID_PREV_ENTRY:
          serviceImpl.prevEntry((atomix.primitive.indexedmap.Indexedmap.PrevEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.PrevEntryResponse>) responseObserver);
          break;
        case METHODID_NEXT_ENTRY:
          serviceImpl.nextEntry((atomix.primitive.indexedmap.Indexedmap.NextEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.NextEntryResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.indexedmap.Indexedmap.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.indexedmap.Indexedmap.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.indexedmap.Indexedmap.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.EventsResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.primitive.indexedmap.Indexedmap.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.Indexedmap.EntriesResponse>) responseObserver);
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

  private static abstract class IndexedMapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexedMapServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.indexedmap.Indexedmap.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IndexedMapService");
    }
  }

  private static final class IndexedMapServiceFileDescriptorSupplier
      extends IndexedMapServiceBaseDescriptorSupplier {
    IndexedMapServiceFileDescriptorSupplier() {}
  }

  private static final class IndexedMapServiceMethodDescriptorSupplier
      extends IndexedMapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndexedMapServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IndexedMapServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexedMapServiceFileDescriptorSupplier())
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
