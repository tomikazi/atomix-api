package atomix.primitive.log.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Log is a service for a log primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/log/v1/primitive.proto")
public final class LogGrpc {

  private LogGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.log.v1.Log";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.SizeRequest,
      atomix.primitive.log.v1.Primitive.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.log.v1.Primitive.SizeRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.SizeRequest,
      atomix.primitive.log.v1.Primitive.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.SizeRequest, atomix.primitive.log.v1.Primitive.SizeResponse> getSizeMethod;
    if ((getSizeMethod = LogGrpc.getSizeMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getSizeMethod = LogGrpc.getSizeMethod) == null) {
          LogGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.SizeRequest, atomix.primitive.log.v1.Primitive.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.AppendRequest,
      atomix.primitive.log.v1.Primitive.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = atomix.primitive.log.v1.Primitive.AppendRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.AppendRequest,
      atomix.primitive.log.v1.Primitive.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.AppendRequest, atomix.primitive.log.v1.Primitive.AppendResponse> getAppendMethod;
    if ((getAppendMethod = LogGrpc.getAppendMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getAppendMethod = LogGrpc.getAppendMethod) == null) {
          LogGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.AppendRequest, atomix.primitive.log.v1.Primitive.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.GetRequest,
      atomix.primitive.log.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.log.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.GetRequest,
      atomix.primitive.log.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.GetRequest, atomix.primitive.log.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = LogGrpc.getGetMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getGetMethod = LogGrpc.getGetMethod) == null) {
          LogGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.GetRequest, atomix.primitive.log.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.FirstEntryRequest,
      atomix.primitive.log.v1.Primitive.FirstEntryResponse> getFirstEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FirstEntry",
      requestType = atomix.primitive.log.v1.Primitive.FirstEntryRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.FirstEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.FirstEntryRequest,
      atomix.primitive.log.v1.Primitive.FirstEntryResponse> getFirstEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.FirstEntryRequest, atomix.primitive.log.v1.Primitive.FirstEntryResponse> getFirstEntryMethod;
    if ((getFirstEntryMethod = LogGrpc.getFirstEntryMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getFirstEntryMethod = LogGrpc.getFirstEntryMethod) == null) {
          LogGrpc.getFirstEntryMethod = getFirstEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.FirstEntryRequest, atomix.primitive.log.v1.Primitive.FirstEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FirstEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.FirstEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.FirstEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("FirstEntry"))
              .build();
        }
      }
    }
    return getFirstEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.LastEntryRequest,
      atomix.primitive.log.v1.Primitive.LastEntryResponse> getLastEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEntry",
      requestType = atomix.primitive.log.v1.Primitive.LastEntryRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.LastEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.LastEntryRequest,
      atomix.primitive.log.v1.Primitive.LastEntryResponse> getLastEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.LastEntryRequest, atomix.primitive.log.v1.Primitive.LastEntryResponse> getLastEntryMethod;
    if ((getLastEntryMethod = LogGrpc.getLastEntryMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getLastEntryMethod = LogGrpc.getLastEntryMethod) == null) {
          LogGrpc.getLastEntryMethod = getLastEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.LastEntryRequest, atomix.primitive.log.v1.Primitive.LastEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.LastEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.LastEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("LastEntry"))
              .build();
        }
      }
    }
    return getLastEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.PrevEntryRequest,
      atomix.primitive.log.v1.Primitive.PrevEntryResponse> getPrevEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevEntry",
      requestType = atomix.primitive.log.v1.Primitive.PrevEntryRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.PrevEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.PrevEntryRequest,
      atomix.primitive.log.v1.Primitive.PrevEntryResponse> getPrevEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.PrevEntryRequest, atomix.primitive.log.v1.Primitive.PrevEntryResponse> getPrevEntryMethod;
    if ((getPrevEntryMethod = LogGrpc.getPrevEntryMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getPrevEntryMethod = LogGrpc.getPrevEntryMethod) == null) {
          LogGrpc.getPrevEntryMethod = getPrevEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.PrevEntryRequest, atomix.primitive.log.v1.Primitive.PrevEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.PrevEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.PrevEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("PrevEntry"))
              .build();
        }
      }
    }
    return getPrevEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.NextEntryRequest,
      atomix.primitive.log.v1.Primitive.NextEntryResponse> getNextEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextEntry",
      requestType = atomix.primitive.log.v1.Primitive.NextEntryRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.NextEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.NextEntryRequest,
      atomix.primitive.log.v1.Primitive.NextEntryResponse> getNextEntryMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.NextEntryRequest, atomix.primitive.log.v1.Primitive.NextEntryResponse> getNextEntryMethod;
    if ((getNextEntryMethod = LogGrpc.getNextEntryMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getNextEntryMethod = LogGrpc.getNextEntryMethod) == null) {
          LogGrpc.getNextEntryMethod = getNextEntryMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.NextEntryRequest, atomix.primitive.log.v1.Primitive.NextEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.NextEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.NextEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("NextEntry"))
              .build();
        }
      }
    }
    return getNextEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.RemoveRequest,
      atomix.primitive.log.v1.Primitive.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.log.v1.Primitive.RemoveRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.RemoveRequest,
      atomix.primitive.log.v1.Primitive.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.RemoveRequest, atomix.primitive.log.v1.Primitive.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = LogGrpc.getRemoveMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getRemoveMethod = LogGrpc.getRemoveMethod) == null) {
          LogGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.RemoveRequest, atomix.primitive.log.v1.Primitive.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.ClearRequest,
      atomix.primitive.log.v1.Primitive.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.log.v1.Primitive.ClearRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.ClearRequest,
      atomix.primitive.log.v1.Primitive.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.ClearRequest, atomix.primitive.log.v1.Primitive.ClearResponse> getClearMethod;
    if ((getClearMethod = LogGrpc.getClearMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getClearMethod = LogGrpc.getClearMethod) == null) {
          LogGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.ClearRequest, atomix.primitive.log.v1.Primitive.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.EventsRequest,
      atomix.primitive.log.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.log.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.EventsRequest,
      atomix.primitive.log.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.EventsRequest, atomix.primitive.log.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = LogGrpc.getEventsMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getEventsMethod = LogGrpc.getEventsMethod) == null) {
          LogGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.EventsRequest, atomix.primitive.log.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.EntriesRequest,
      atomix.primitive.log.v1.Primitive.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.primitive.log.v1.Primitive.EntriesRequest.class,
      responseType = atomix.primitive.log.v1.Primitive.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.EntriesRequest,
      atomix.primitive.log.v1.Primitive.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Primitive.EntriesRequest, atomix.primitive.log.v1.Primitive.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = LogGrpc.getEntriesMethod) == null) {
      synchronized (LogGrpc.class) {
        if ((getEntriesMethod = LogGrpc.getEntriesMethod) == null) {
          LogGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Primitive.EntriesRequest, atomix.primitive.log.v1.Primitive.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Primitive.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStub>() {
        @java.lang.Override
        public LogStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStub(channel, callOptions);
        }
      };
    return LogStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogBlockingStub>() {
        @java.lang.Override
        public LogBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogBlockingStub(channel, callOptions);
        }
      };
    return LogBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogFutureStub>() {
        @java.lang.Override
        public LogFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogFutureStub(channel, callOptions);
        }
      };
    return LogFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Log is a service for a log primitive
   * </pre>
   */
  public static abstract class LogImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public void size(atomix.primitive.log.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public void append(atomix.primitive.log.v1.Primitive.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.AppendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public void get(atomix.primitive.log.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public void firstEntry(atomix.primitive.log.v1.Primitive.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFirstEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public void lastEntry(atomix.primitive.log.v1.Primitive.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.LastEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public void prevEntry(atomix.primitive.log.v1.Primitive.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrevEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public void nextEntry(atomix.primitive.log.v1.Primitive.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.NextEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public void remove(atomix.primitive.log.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public void clear(atomix.primitive.log.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.log.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public void entries(atomix.primitive.log.v1.Primitive.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.EntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.SizeRequest,
                atomix.primitive.log.v1.Primitive.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getAppendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.AppendRequest,
                atomix.primitive.log.v1.Primitive.AppendResponse>(
                  this, METHODID_APPEND)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.GetRequest,
                atomix.primitive.log.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getFirstEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.FirstEntryRequest,
                atomix.primitive.log.v1.Primitive.FirstEntryResponse>(
                  this, METHODID_FIRST_ENTRY)))
          .addMethod(
            getLastEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.LastEntryRequest,
                atomix.primitive.log.v1.Primitive.LastEntryResponse>(
                  this, METHODID_LAST_ENTRY)))
          .addMethod(
            getPrevEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.PrevEntryRequest,
                atomix.primitive.log.v1.Primitive.PrevEntryResponse>(
                  this, METHODID_PREV_ENTRY)))
          .addMethod(
            getNextEntryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.NextEntryRequest,
                atomix.primitive.log.v1.Primitive.NextEntryResponse>(
                  this, METHODID_NEXT_ENTRY)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.RemoveRequest,
                atomix.primitive.log.v1.Primitive.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.ClearRequest,
                atomix.primitive.log.v1.Primitive.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.EventsRequest,
                atomix.primitive.log.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Primitive.EntriesRequest,
                atomix.primitive.log.v1.Primitive.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Log is a service for a log primitive
   * </pre>
   */
  public static final class LogStub extends io.grpc.stub.AbstractAsyncStub<LogStub> {
    private LogStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public void size(atomix.primitive.log.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public void append(atomix.primitive.log.v1.Primitive.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.AppendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public void get(atomix.primitive.log.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public void firstEntry(atomix.primitive.log.v1.Primitive.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.FirstEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public void lastEntry(atomix.primitive.log.v1.Primitive.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.LastEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public void prevEntry(atomix.primitive.log.v1.Primitive.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.PrevEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public void nextEntry(atomix.primitive.log.v1.Primitive.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.NextEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public void remove(atomix.primitive.log.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public void clear(atomix.primitive.log.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.log.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public void entries(atomix.primitive.log.v1.Primitive.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.EntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Log is a service for a log primitive
   * </pre>
   */
  public static final class LogBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogBlockingStub> {
    private LogBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.SizeResponse size(atomix.primitive.log.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.AppendResponse append(atomix.primitive.log.v1.Primitive.AppendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.GetResponse get(atomix.primitive.log.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.FirstEntryResponse firstEntry(atomix.primitive.log.v1.Primitive.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFirstEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.LastEntryResponse lastEntry(atomix.primitive.log.v1.Primitive.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.PrevEntryResponse prevEntry(atomix.primitive.log.v1.Primitive.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrevEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.NextEntryResponse nextEntry(atomix.primitive.log.v1.Primitive.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.RemoveResponse remove(atomix.primitive.log.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public atomix.primitive.log.v1.Primitive.ClearResponse clear(atomix.primitive.log.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.log.v1.Primitive.EventsResponse> events(
        atomix.primitive.log.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.log.v1.Primitive.EntriesResponse> entries(
        atomix.primitive.log.v1.Primitive.EntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Log is a service for a log primitive
   * </pre>
   */
  public static final class LogFutureStub extends io.grpc.stub.AbstractFutureStub<LogFutureStub> {
    private LogFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.SizeResponse> size(
        atomix.primitive.log.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.AppendResponse> append(
        atomix.primitive.log.v1.Primitive.AppendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.GetResponse> get(
        atomix.primitive.log.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.FirstEntryResponse> firstEntry(
        atomix.primitive.log.v1.Primitive.FirstEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.LastEntryResponse> lastEntry(
        atomix.primitive.log.v1.Primitive.LastEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.PrevEntryResponse> prevEntry(
        atomix.primitive.log.v1.Primitive.PrevEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.NextEntryResponse> nextEntry(
        atomix.primitive.log.v1.Primitive.NextEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.RemoveResponse> remove(
        atomix.primitive.log.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Primitive.ClearResponse> clear(
        atomix.primitive.log.v1.Primitive.ClearRequest request) {
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
    private final LogImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.log.v1.Primitive.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.SizeResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((atomix.primitive.log.v1.Primitive.AppendRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.AppendResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.log.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_FIRST_ENTRY:
          serviceImpl.firstEntry((atomix.primitive.log.v1.Primitive.FirstEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.FirstEntryResponse>) responseObserver);
          break;
        case METHODID_LAST_ENTRY:
          serviceImpl.lastEntry((atomix.primitive.log.v1.Primitive.LastEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.LastEntryResponse>) responseObserver);
          break;
        case METHODID_PREV_ENTRY:
          serviceImpl.prevEntry((atomix.primitive.log.v1.Primitive.PrevEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.PrevEntryResponse>) responseObserver);
          break;
        case METHODID_NEXT_ENTRY:
          serviceImpl.nextEntry((atomix.primitive.log.v1.Primitive.NextEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.NextEntryResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.log.v1.Primitive.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.log.v1.Primitive.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.log.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.EventsResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.primitive.log.v1.Primitive.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Primitive.EntriesResponse>) responseObserver);
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

  private static abstract class LogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.log.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Log");
    }
  }

  private static final class LogFileDescriptorSupplier
      extends LogBaseDescriptorSupplier {
    LogFileDescriptorSupplier() {}
  }

  private static final class LogMethodDescriptorSupplier
      extends LogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogFileDescriptorSupplier())
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
