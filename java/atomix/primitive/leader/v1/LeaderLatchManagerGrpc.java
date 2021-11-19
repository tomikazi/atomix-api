package atomix.primitive.leader.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderLatchManager is a service for managing leader latch sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/leader/v1/manager.proto")
public final class LeaderLatchManagerGrpc {

  private LeaderLatchManagerGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.leader.v1.LeaderLatchManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Manager.OpenSessionRequest,
      atomix.primitive.leader.v1.Manager.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.leader.v1.Manager.OpenSessionRequest.class,
      responseType = atomix.primitive.leader.v1.Manager.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Manager.OpenSessionRequest,
      atomix.primitive.leader.v1.Manager.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Manager.OpenSessionRequest, atomix.primitive.leader.v1.Manager.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = LeaderLatchManagerGrpc.getOpenSessionMethod) == null) {
      synchronized (LeaderLatchManagerGrpc.class) {
        if ((getOpenSessionMethod = LeaderLatchManagerGrpc.getOpenSessionMethod) == null) {
          LeaderLatchManagerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Manager.OpenSessionRequest, atomix.primitive.leader.v1.Manager.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Manager.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Manager.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchManagerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Manager.CloseSessionRequest,
      atomix.primitive.leader.v1.Manager.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.leader.v1.Manager.CloseSessionRequest.class,
      responseType = atomix.primitive.leader.v1.Manager.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Manager.CloseSessionRequest,
      atomix.primitive.leader.v1.Manager.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Manager.CloseSessionRequest, atomix.primitive.leader.v1.Manager.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = LeaderLatchManagerGrpc.getCloseSessionMethod) == null) {
      synchronized (LeaderLatchManagerGrpc.class) {
        if ((getCloseSessionMethod = LeaderLatchManagerGrpc.getCloseSessionMethod) == null) {
          LeaderLatchManagerGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Manager.CloseSessionRequest, atomix.primitive.leader.v1.Manager.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Manager.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Manager.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchManagerMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderLatchManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchManagerStub>() {
        @java.lang.Override
        public LeaderLatchManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchManagerStub(channel, callOptions);
        }
      };
    return LeaderLatchManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderLatchManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchManagerBlockingStub>() {
        @java.lang.Override
        public LeaderLatchManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchManagerBlockingStub(channel, callOptions);
        }
      };
    return LeaderLatchManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderLatchManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchManagerFutureStub>() {
        @java.lang.Override
        public LeaderLatchManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchManagerFutureStub(channel, callOptions);
        }
      };
    return LeaderLatchManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderLatchManager is a service for managing leader latch sessions
   * </pre>
   */
  public static abstract class LeaderLatchManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.leader.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.leader.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Manager.OpenSessionRequest,
                atomix.primitive.leader.v1.Manager.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Manager.CloseSessionRequest,
                atomix.primitive.leader.v1.Manager.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderLatchManager is a service for managing leader latch sessions
   * </pre>
   */
  public static final class LeaderLatchManagerStub extends io.grpc.stub.AbstractAsyncStub<LeaderLatchManagerStub> {
    private LeaderLatchManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchManagerStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.leader.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.leader.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderLatchManager is a service for managing leader latch sessions
   * </pre>
   */
  public static final class LeaderLatchManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderLatchManagerBlockingStub> {
    private LeaderLatchManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.leader.v1.Manager.OpenSessionResponse openSession(atomix.primitive.leader.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.leader.v1.Manager.CloseSessionResponse closeSession(atomix.primitive.leader.v1.Manager.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderLatchManager is a service for managing leader latch sessions
   * </pre>
   */
  public static final class LeaderLatchManagerFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderLatchManagerFutureStub> {
    private LeaderLatchManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.v1.Manager.OpenSessionResponse> openSession(
        atomix.primitive.leader.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.v1.Manager.CloseSessionResponse> closeSession(
        atomix.primitive.leader.v1.Manager.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_SESSION = 0;
  private static final int METHODID_CLOSE_SESSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LeaderLatchManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderLatchManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.leader.v1.Manager.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Manager.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.leader.v1.Manager.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Manager.CloseSessionResponse>) responseObserver);
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

  private static abstract class LeaderLatchManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderLatchManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.leader.v1.Manager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderLatchManager");
    }
  }

  private static final class LeaderLatchManagerFileDescriptorSupplier
      extends LeaderLatchManagerBaseDescriptorSupplier {
    LeaderLatchManagerFileDescriptorSupplier() {}
  }

  private static final class LeaderLatchManagerMethodDescriptorSupplier
      extends LeaderLatchManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderLatchManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderLatchManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderLatchManagerFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
