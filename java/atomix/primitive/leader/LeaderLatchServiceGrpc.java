package atomix.primitive.leader;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Leader latch service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/leader/latch.proto")
public final class LeaderLatchServiceGrpc {

  private LeaderLatchServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.leader.LeaderLatchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.LatchRequest,
      atomix.primitive.leader.LatchOuterClass.LatchResponse> getLatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Latch",
      requestType = atomix.primitive.leader.LatchOuterClass.LatchRequest.class,
      responseType = atomix.primitive.leader.LatchOuterClass.LatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.LatchRequest,
      atomix.primitive.leader.LatchOuterClass.LatchResponse> getLatchMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.LatchRequest, atomix.primitive.leader.LatchOuterClass.LatchResponse> getLatchMethod;
    if ((getLatchMethod = LeaderLatchServiceGrpc.getLatchMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getLatchMethod = LeaderLatchServiceGrpc.getLatchMethod) == null) {
          LeaderLatchServiceGrpc.getLatchMethod = getLatchMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.LatchOuterClass.LatchRequest, atomix.primitive.leader.LatchOuterClass.LatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Latch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.LatchOuterClass.LatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.LatchOuterClass.LatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Latch"))
              .build();
        }
      }
    }
    return getLatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.GetRequest,
      atomix.primitive.leader.LatchOuterClass.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.leader.LatchOuterClass.GetRequest.class,
      responseType = atomix.primitive.leader.LatchOuterClass.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.GetRequest,
      atomix.primitive.leader.LatchOuterClass.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.GetRequest, atomix.primitive.leader.LatchOuterClass.GetResponse> getGetMethod;
    if ((getGetMethod = LeaderLatchServiceGrpc.getGetMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getGetMethod = LeaderLatchServiceGrpc.getGetMethod) == null) {
          LeaderLatchServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.LatchOuterClass.GetRequest, atomix.primitive.leader.LatchOuterClass.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.LatchOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.LatchOuterClass.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.EventsRequest,
      atomix.primitive.leader.LatchOuterClass.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.leader.LatchOuterClass.EventsRequest.class,
      responseType = atomix.primitive.leader.LatchOuterClass.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.EventsRequest,
      atomix.primitive.leader.LatchOuterClass.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.LatchOuterClass.EventsRequest, atomix.primitive.leader.LatchOuterClass.EventsResponse> getEventsMethod;
    if ((getEventsMethod = LeaderLatchServiceGrpc.getEventsMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getEventsMethod = LeaderLatchServiceGrpc.getEventsMethod) == null) {
          LeaderLatchServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.LatchOuterClass.EventsRequest, atomix.primitive.leader.LatchOuterClass.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.LatchOuterClass.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.LatchOuterClass.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderLatchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceStub>() {
        @java.lang.Override
        public LeaderLatchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchServiceStub(channel, callOptions);
        }
      };
    return LeaderLatchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderLatchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceBlockingStub>() {
        @java.lang.Override
        public LeaderLatchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchServiceBlockingStub(channel, callOptions);
        }
      };
    return LeaderLatchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderLatchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceFutureStub>() {
        @java.lang.Override
        public LeaderLatchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchServiceFutureStub(channel, callOptions);
        }
      };
    return LeaderLatchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static abstract class LeaderLatchServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public void latch(atomix.primitive.leader.LatchOuterClass.LatchRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.LatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public void get(atomix.primitive.leader.LatchOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public void events(atomix.primitive.leader.LatchOuterClass.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.LatchOuterClass.LatchRequest,
                atomix.primitive.leader.LatchOuterClass.LatchResponse>(
                  this, METHODID_LATCH)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.LatchOuterClass.GetRequest,
                atomix.primitive.leader.LatchOuterClass.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.leader.LatchOuterClass.EventsRequest,
                atomix.primitive.leader.LatchOuterClass.EventsResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static final class LeaderLatchServiceStub extends io.grpc.stub.AbstractAsyncStub<LeaderLatchServiceStub> {
    private LeaderLatchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public void latch(atomix.primitive.leader.LatchOuterClass.LatchRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.LatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public void get(atomix.primitive.leader.LatchOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public void events(atomix.primitive.leader.LatchOuterClass.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static final class LeaderLatchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderLatchServiceBlockingStub> {
    private LeaderLatchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public atomix.primitive.leader.LatchOuterClass.LatchResponse latch(atomix.primitive.leader.LatchOuterClass.LatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public atomix.primitive.leader.LatchOuterClass.GetResponse get(atomix.primitive.leader.LatchOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.leader.LatchOuterClass.EventsResponse> events(
        atomix.primitive.leader.LatchOuterClass.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static final class LeaderLatchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderLatchServiceFutureStub> {
    private LeaderLatchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.LatchOuterClass.LatchResponse> latch(
        atomix.primitive.leader.LatchOuterClass.LatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.LatchOuterClass.GetResponse> get(
        atomix.primitive.leader.LatchOuterClass.GetRequest request) {
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
    private final LeaderLatchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderLatchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LATCH:
          serviceImpl.latch((atomix.primitive.leader.LatchOuterClass.LatchRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.LatchResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.leader.LatchOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.GetResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.leader.LatchOuterClass.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.LatchOuterClass.EventsResponse>) responseObserver);
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

  private static abstract class LeaderLatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderLatchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.leader.LatchOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderLatchService");
    }
  }

  private static final class LeaderLatchServiceFileDescriptorSupplier
      extends LeaderLatchServiceBaseDescriptorSupplier {
    LeaderLatchServiceFileDescriptorSupplier() {}
  }

  private static final class LeaderLatchServiceMethodDescriptorSupplier
      extends LeaderLatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderLatchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderLatchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderLatchServiceFileDescriptorSupplier())
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
