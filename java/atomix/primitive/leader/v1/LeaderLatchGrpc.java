package atomix.primitive.leader.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderLatch is a service for a leader latch primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/leader/v1/primitive.proto")
public final class LeaderLatchGrpc {

  private LeaderLatchGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.leader.v1.LeaderLatch";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.LatchRequest,
      atomix.primitive.leader.v1.Primitive.LatchResponse> getLatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Latch",
      requestType = atomix.primitive.leader.v1.Primitive.LatchRequest.class,
      responseType = atomix.primitive.leader.v1.Primitive.LatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.LatchRequest,
      atomix.primitive.leader.v1.Primitive.LatchResponse> getLatchMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.LatchRequest, atomix.primitive.leader.v1.Primitive.LatchResponse> getLatchMethod;
    if ((getLatchMethod = LeaderLatchGrpc.getLatchMethod) == null) {
      synchronized (LeaderLatchGrpc.class) {
        if ((getLatchMethod = LeaderLatchGrpc.getLatchMethod) == null) {
          LeaderLatchGrpc.getLatchMethod = getLatchMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Primitive.LatchRequest, atomix.primitive.leader.v1.Primitive.LatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Latch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Primitive.LatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Primitive.LatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchMethodDescriptorSupplier("Latch"))
              .build();
        }
      }
    }
    return getLatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.GetRequest,
      atomix.primitive.leader.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.leader.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.leader.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.GetRequest,
      atomix.primitive.leader.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.GetRequest, atomix.primitive.leader.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = LeaderLatchGrpc.getGetMethod) == null) {
      synchronized (LeaderLatchGrpc.class) {
        if ((getGetMethod = LeaderLatchGrpc.getGetMethod) == null) {
          LeaderLatchGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Primitive.GetRequest, atomix.primitive.leader.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.EventsRequest,
      atomix.primitive.leader.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.leader.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.leader.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.EventsRequest,
      atomix.primitive.leader.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Primitive.EventsRequest, atomix.primitive.leader.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = LeaderLatchGrpc.getEventsMethod) == null) {
      synchronized (LeaderLatchGrpc.class) {
        if ((getEventsMethod = LeaderLatchGrpc.getEventsMethod) == null) {
          LeaderLatchGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Primitive.EventsRequest, atomix.primitive.leader.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderLatchStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchStub>() {
        @java.lang.Override
        public LeaderLatchStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchStub(channel, callOptions);
        }
      };
    return LeaderLatchStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderLatchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchBlockingStub>() {
        @java.lang.Override
        public LeaderLatchBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchBlockingStub(channel, callOptions);
        }
      };
    return LeaderLatchBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderLatchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchFutureStub>() {
        @java.lang.Override
        public LeaderLatchFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchFutureStub(channel, callOptions);
        }
      };
    return LeaderLatchFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderLatch is a service for a leader latch primitive
   * </pre>
   */
  public static abstract class LeaderLatchImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public void latch(atomix.primitive.leader.v1.Primitive.LatchRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.LatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public void get(atomix.primitive.leader.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public void events(atomix.primitive.leader.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Primitive.LatchRequest,
                atomix.primitive.leader.v1.Primitive.LatchResponse>(
                  this, METHODID_LATCH)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Primitive.GetRequest,
                atomix.primitive.leader.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Primitive.EventsRequest,
                atomix.primitive.leader.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderLatch is a service for a leader latch primitive
   * </pre>
   */
  public static final class LeaderLatchStub extends io.grpc.stub.AbstractAsyncStub<LeaderLatchStub> {
    private LeaderLatchStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public void latch(atomix.primitive.leader.v1.Primitive.LatchRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.LatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public void get(atomix.primitive.leader.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public void events(atomix.primitive.leader.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderLatch is a service for a leader latch primitive
   * </pre>
   */
  public static final class LeaderLatchBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderLatchBlockingStub> {
    private LeaderLatchBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public atomix.primitive.leader.v1.Primitive.LatchResponse latch(atomix.primitive.leader.v1.Primitive.LatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public atomix.primitive.leader.v1.Primitive.GetResponse get(atomix.primitive.leader.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.leader.v1.Primitive.EventsResponse> events(
        atomix.primitive.leader.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderLatch is a service for a leader latch primitive
   * </pre>
   */
  public static final class LeaderLatchFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderLatchFutureStub> {
    private LeaderLatchFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.v1.Primitive.LatchResponse> latch(
        atomix.primitive.leader.v1.Primitive.LatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.v1.Primitive.GetResponse> get(
        atomix.primitive.leader.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LATCH = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_EVENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LeaderLatchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderLatchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LATCH:
          serviceImpl.latch((atomix.primitive.leader.v1.Primitive.LatchRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.LatchResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.leader.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.leader.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Primitive.EventsResponse>) responseObserver);
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

  private static abstract class LeaderLatchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderLatchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.leader.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderLatch");
    }
  }

  private static final class LeaderLatchFileDescriptorSupplier
      extends LeaderLatchBaseDescriptorSupplier {
    LeaderLatchFileDescriptorSupplier() {}
  }

  private static final class LeaderLatchMethodDescriptorSupplier
      extends LeaderLatchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderLatchMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderLatchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderLatchFileDescriptorSupplier())
              .addMethod(getLatchMethod())
              .addMethod(getGetMethod())
              .addMethod(getEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
