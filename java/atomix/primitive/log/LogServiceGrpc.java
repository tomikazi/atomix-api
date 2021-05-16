package atomix.primitive.log;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LogService log service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/log/log.proto")
public final class LogServiceGrpc {

  private LogServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.log.LogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.SizeRequest,
      atomix.primitive.log.Log.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.log.Log.SizeRequest.class,
      responseType = atomix.primitive.log.Log.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.SizeRequest,
      atomix.primitive.log.Log.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.SizeRequest, atomix.primitive.log.Log.SizeResponse> getSizeMethod;
    if ((getSizeMethod = LogServiceGrpc.getSizeMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getSizeMethod = LogServiceGrpc.getSizeMethod) == null) {
          LogServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.SizeRequest, atomix.primitive.log.Log.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.AppendRequest,
      atomix.primitive.log.Log.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = atomix.primitive.log.Log.AppendRequest.class,
      responseType = atomix.primitive.log.Log.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.AppendRequest,
      atomix.primitive.log.Log.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.AppendRequest, atomix.primitive.log.Log.AppendResponse> getAppendMethod;
    if ((getAppendMethod = LogServiceGrpc.getAppendMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getAppendMethod = LogServiceGrpc.getAppendMethod) == null) {
          LogServiceGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.AppendRequest, atomix.primitive.log.Log.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.GetRequest,
      atomix.primitive.log.Log.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.log.Log.GetRequest.class,
      responseType = atomix.primitive.log.Log.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.GetRequest,
      atomix.primitive.log.Log.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.GetRequest, atomix.primitive.log.Log.GetResponse> getGetMethod;
    if ((getGetMethod = LogServiceGrpc.getGetMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getGetMethod = LogServiceGrpc.getGetMethod) == null) {
          LogServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.GetRequest, atomix.primitive.log.Log.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.FirstEntryRequest,
      atomix.primitive.log.Log.FirstEntryResponse> getFirstEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FirstEntry",
      requestType = atomix.primitive.log.Log.FirstEntryRequest.class,
      responseType = atomix.primitive.log.Log.FirstEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.FirstEntryRequest,
      atomix.primitive.log.Log.FirstEntryResponse> getFirstEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.FirstEntryRequest, atomix.primitive.log.Log.FirstEntryResponse> getFirstEntryMethod;
    if ((getFirstEntryMethod = LogServiceGrpc.getFirstEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getFirstEntryMethod = LogServiceGrpc.getFirstEntryMethod) == null) {
          LogServiceGrpc.getFirstEntryMethod = getFirstEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.FirstEntryRequest, atomix.primitive.log.Log.FirstEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FirstEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.FirstEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.FirstEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("FirstEntry"))
              .build();
        }
      }
    }
    return getFirstEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.LastEntryRequest,
      atomix.primitive.log.Log.LastEntryResponse> getLastEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEntry",
      requestType = atomix.primitive.log.Log.LastEntryRequest.class,
      responseType = atomix.primitive.log.Log.LastEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.LastEntryRequest,
      atomix.primitive.log.Log.LastEntryResponse> getLastEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.LastEntryRequest, atomix.primitive.log.Log.LastEntryResponse> getLastEntryMethod;
    if ((getLastEntryMethod = LogServiceGrpc.getLastEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLastEntryMethod = LogServiceGrpc.getLastEntryMethod) == null) {
          LogServiceGrpc.getLastEntryMethod = getLastEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.LastEntryRequest, atomix.primitive.log.Log.LastEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.LastEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.LastEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("LastEntry"))
              .build();
        }
      }
    }
    return getLastEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.PrevEntryRequest,
      atomix.primitive.log.Log.PrevEntryResponse> getPrevEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevEntry",
      requestType = atomix.primitive.log.Log.PrevEntryRequest.class,
      responseType = atomix.primitive.log.Log.PrevEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.PrevEntryRequest,
      atomix.primitive.log.Log.PrevEntryResponse> getPrevEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.PrevEntryRequest, atomix.primitive.log.Log.PrevEntryResponse> getPrevEntryMethod;
    if ((getPrevEntryMethod = LogServiceGrpc.getPrevEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getPrevEntryMethod = LogServiceGrpc.getPrevEntryMethod) == null) {
          LogServiceGrpc.getPrevEntryMethod = getPrevEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.PrevEntryRequest, atomix.primitive.log.Log.PrevEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.PrevEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.PrevEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("PrevEntry"))
              .build();
        }
      }
    }
    return getPrevEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.NextEntryRequest,
      atomix.primitive.log.Log.NextEntryResponse> getNextEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextEntry",
      requestType = atomix.primitive.log.Log.NextEntryRequest.class,
      responseType = atomix.primitive.log.Log.NextEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.NextEntryRequest,
      atomix.primitive.log.Log.NextEntryResponse> getNextEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.NextEntryRequest, atomix.primitive.log.Log.NextEntryResponse> getNextEntryMethod;
    if ((getNextEntryMethod = LogServiceGrpc.getNextEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getNextEntryMethod = LogServiceGrpc.getNextEntryMethod) == null) {
          LogServiceGrpc.getNextEntryMethod = getNextEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.NextEntryRequest, atomix.primitive.log.Log.NextEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.NextEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.NextEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("NextEntry"))
              .build();
        }
      }
    }
    return getNextEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.RemoveRequest,
      atomix.primitive.log.Log.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.log.Log.RemoveRequest.class,
      responseType = atomix.primitive.log.Log.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.RemoveRequest,
      atomix.primitive.log.Log.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.RemoveRequest, atomix.primitive.log.Log.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = LogServiceGrpc.getRemoveMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getRemoveMethod = LogServiceGrpc.getRemoveMethod) == null) {
          LogServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.RemoveRequest, atomix.primitive.log.Log.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.ClearRequest,
      atomix.primitive.log.Log.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.log.Log.ClearRequest.class,
      responseType = atomix.primitive.log.Log.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.ClearRequest,
      atomix.primitive.log.Log.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.ClearRequest, atomix.primitive.log.Log.ClearResponse> getClearMethod;
    if ((getClearMethod = LogServiceGrpc.getClearMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getClearMethod = LogServiceGrpc.getClearMethod) == null) {
          LogServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.ClearRequest, atomix.primitive.log.Log.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.EventsRequest,
      atomix.primitive.log.Log.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.log.Log.EventsRequest.class,
      responseType = atomix.primitive.log.Log.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.EventsRequest,
      atomix.primitive.log.Log.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.EventsRequest, atomix.primitive.log.Log.EventsResponse> getEventsMethod;
    if ((getEventsMethod = LogServiceGrpc.getEventsMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getEventsMethod = LogServiceGrpc.getEventsMethod) == null) {
          LogServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.EventsRequest, atomix.primitive.log.Log.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.Log.EntriesRequest,
      atomix.primitive.log.Log.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.primitive.log.Log.EntriesRequest.class,
      responseType = atomix.primitive.log.Log.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.Log.EntriesRequest,
      atomix.primitive.log.Log.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.Log.EntriesRequest, atomix.primitive.log.Log.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = LogServiceGrpc.getEntriesMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getEntriesMethod = LogServiceGrpc.getEntriesMethod) == null) {
          LogServiceGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.Log.EntriesRequest, atomix.primitive.log.Log.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.Log.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceStub>() {
        @java.lang.Override
        public LogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceStub(channel, callOptions);
        }
      };
    return LogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub>() {
        @java.lang.Override
        public LogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceBlockingStub(channel, callOptions);
        }
      };
    return LogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub>() {
        @java.lang.Override
        public LogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceFutureStub(channel, callOptions);
        }
      };
    return LogServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static abstract class LogServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public void size(atomix.primitive.log.Log.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public void append(atomix.primitive.log.Log.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.AppendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public void get(atomix.primitive.log.Log.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public void firstEntry(atomix.primitive.log.Log.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFirstEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public void lastEntry(atomix.primitive.log.Log.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.LastEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public void prevEntry(atomix.primitive.log.Log.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrevEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public void nextEntry(atomix.primitive.log.Log.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.NextEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public void remove(atomix.primitive.log.Log.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public void clear(atomix.primitive.log.Log.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.log.Log.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public void entries(atomix.primitive.log.Log.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.EntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.SizeRequest,
                atomix.primitive.log.Log.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getAppendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.AppendRequest,
                atomix.primitive.log.Log.AppendResponse>(
                  this, METHODID_APPEND)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.GetRequest,
                atomix.primitive.log.Log.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getFirstEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.FirstEntryRequest,
                atomix.primitive.log.Log.FirstEntryResponse>(
                  this, METHODID_FIRST_ENTRY)))
          .addMethod(
            getLastEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.LastEntryRequest,
                atomix.primitive.log.Log.LastEntryResponse>(
                  this, METHODID_LAST_ENTRY)))
          .addMethod(
            getPrevEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.PrevEntryRequest,
                atomix.primitive.log.Log.PrevEntryResponse>(
                  this, METHODID_PREV_ENTRY)))
          .addMethod(
            getNextEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.NextEntryRequest,
                atomix.primitive.log.Log.NextEntryResponse>(
                  this, METHODID_NEXT_ENTRY)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.RemoveRequest,
                atomix.primitive.log.Log.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.Log.ClearRequest,
                atomix.primitive.log.Log.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.log.Log.EventsRequest,
                atomix.primitive.log.Log.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.log.Log.EntriesRequest,
                atomix.primitive.log.Log.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static final class LogServiceStub extends io.grpc.stub.AbstractAsyncStub<LogServiceStub> {
    private LogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public void size(atomix.primitive.log.Log.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public void append(atomix.primitive.log.Log.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.AppendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public void get(atomix.primitive.log.Log.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public void firstEntry(atomix.primitive.log.Log.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public void lastEntry(atomix.primitive.log.Log.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.LastEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public void prevEntry(atomix.primitive.log.Log.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public void nextEntry(atomix.primitive.log.Log.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.NextEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public void remove(atomix.primitive.log.Log.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public void clear(atomix.primitive.log.Log.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.log.Log.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public void entries(atomix.primitive.log.Log.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.Log.EntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static final class LogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogServiceBlockingStub> {
    private LogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public atomix.primitive.log.Log.SizeResponse size(atomix.primitive.log.Log.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public atomix.primitive.log.Log.AppendResponse append(atomix.primitive.log.Log.AppendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public atomix.primitive.log.Log.GetResponse get(atomix.primitive.log.Log.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public atomix.primitive.log.Log.FirstEntryResponse firstEntry(atomix.primitive.log.Log.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFirstEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public atomix.primitive.log.Log.LastEntryResponse lastEntry(atomix.primitive.log.Log.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public atomix.primitive.log.Log.PrevEntryResponse prevEntry(atomix.primitive.log.Log.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrevEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public atomix.primitive.log.Log.NextEntryResponse nextEntry(atomix.primitive.log.Log.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public atomix.primitive.log.Log.RemoveResponse remove(atomix.primitive.log.Log.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public atomix.primitive.log.Log.ClearResponse clear(atomix.primitive.log.Log.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.log.Log.EventsResponse> events(
        atomix.primitive.log.Log.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.log.Log.EntriesResponse> entries(
        atomix.primitive.log.Log.EntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static final class LogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogServiceFutureStub> {
    private LogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.SizeResponse> size(
        atomix.primitive.log.Log.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.AppendResponse> append(
        atomix.primitive.log.Log.AppendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.GetResponse> get(
        atomix.primitive.log.Log.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.FirstEntryResponse> firstEntry(
        atomix.primitive.log.Log.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.LastEntryResponse> lastEntry(
        atomix.primitive.log.Log.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.PrevEntryResponse> prevEntry(
        atomix.primitive.log.Log.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.NextEntryResponse> nextEntry(
        atomix.primitive.log.Log.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.RemoveResponse> remove(
        atomix.primitive.log.Log.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.Log.ClearResponse> clear(
        atomix.primitive.log.Log.ClearRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIZE = 0;
  private static final int METHODID_APPEND = 1;
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
    private final LogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.log.Log.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.SizeResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((atomix.primitive.log.Log.AppendRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.AppendResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.log.Log.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.GetResponse>) responseObserver);
          break;
        case METHODID_FIRST_ENTRY:
          serviceImpl.firstEntry((atomix.primitive.log.Log.FirstEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.FirstEntryResponse>) responseObserver);
          break;
        case METHODID_LAST_ENTRY:
          serviceImpl.lastEntry((atomix.primitive.log.Log.LastEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.LastEntryResponse>) responseObserver);
          break;
        case METHODID_PREV_ENTRY:
          serviceImpl.prevEntry((atomix.primitive.log.Log.PrevEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.PrevEntryResponse>) responseObserver);
          break;
        case METHODID_NEXT_ENTRY:
          serviceImpl.nextEntry((atomix.primitive.log.Log.NextEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.NextEntryResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.log.Log.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.log.Log.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.log.Log.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.EventsResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.primitive.log.Log.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.Log.EntriesResponse>) responseObserver);
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

  private static abstract class LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.log.Log.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogService");
    }
  }

  private static final class LogServiceFileDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier {
    LogServiceFileDescriptorSupplier() {}
  }

  private static final class LogServiceMethodDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogServiceFileDescriptorSupplier())
              .addMethod(getSizeMethod())
              .addMethod(getAppendMethod())
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
