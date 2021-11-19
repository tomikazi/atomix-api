package atomix.primitive.election.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderElectionManager is a service for managing leader election sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/election/v1/manager.proto")
public final class LeaderElectionManagerGrpc {

  private LeaderElectionManagerGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.election.v1.LeaderElectionManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Manager.OpenSessionRequest,
      atomix.primitive.election.v1.Manager.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.election.v1.Manager.OpenSessionRequest.class,
      responseType = atomix.primitive.election.v1.Manager.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Manager.OpenSessionRequest,
      atomix.primitive.election.v1.Manager.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Manager.OpenSessionRequest, atomix.primitive.election.v1.Manager.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = LeaderElectionManagerGrpc.getOpenSessionMethod) == null) {
      synchronized (LeaderElectionManagerGrpc.class) {
        if ((getOpenSessionMethod = LeaderElectionManagerGrpc.getOpenSessionMethod) == null) {
          LeaderElectionManagerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Manager.OpenSessionRequest, atomix.primitive.election.v1.Manager.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Manager.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Manager.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionManagerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Manager.CloseSessionRequest,
      atomix.primitive.election.v1.Manager.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.election.v1.Manager.CloseSessionRequest.class,
      responseType = atomix.primitive.election.v1.Manager.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Manager.CloseSessionRequest,
      atomix.primitive.election.v1.Manager.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Manager.CloseSessionRequest, atomix.primitive.election.v1.Manager.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = LeaderElectionManagerGrpc.getCloseSessionMethod) == null) {
      synchronized (LeaderElectionManagerGrpc.class) {
        if ((getCloseSessionMethod = LeaderElectionManagerGrpc.getCloseSessionMethod) == null) {
          LeaderElectionManagerGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Manager.CloseSessionRequest, atomix.primitive.election.v1.Manager.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Manager.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Manager.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionManagerMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderElectionManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionManagerStub>() {
        @java.lang.Override
        public LeaderElectionManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionManagerStub(channel, callOptions);
        }
      };
    return LeaderElectionManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderElectionManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionManagerBlockingStub>() {
        @java.lang.Override
        public LeaderElectionManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionManagerBlockingStub(channel, callOptions);
        }
      };
    return LeaderElectionManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderElectionManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionManagerFutureStub>() {
        @java.lang.Override
        public LeaderElectionManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionManagerFutureStub(channel, callOptions);
        }
      };
    return LeaderElectionManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderElectionManager is a service for managing leader election sessions
   * </pre>
   */
  public static abstract class LeaderElectionManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.election.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.election.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Manager.OpenSessionRequest,
                atomix.primitive.election.v1.Manager.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Manager.CloseSessionRequest,
                atomix.primitive.election.v1.Manager.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderElectionManager is a service for managing leader election sessions
   * </pre>
   */
  public static final class LeaderElectionManagerStub extends io.grpc.stub.AbstractAsyncStub<LeaderElectionManagerStub> {
    private LeaderElectionManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionManagerStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.election.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.election.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderElectionManager is a service for managing leader election sessions
   * </pre>
   */
  public static final class LeaderElectionManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderElectionManagerBlockingStub> {
    private LeaderElectionManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.election.v1.Manager.OpenSessionResponse openSession(atomix.primitive.election.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.election.v1.Manager.CloseSessionResponse closeSession(atomix.primitive.election.v1.Manager.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderElectionManager is a service for managing leader election sessions
   * </pre>
   */
  public static final class LeaderElectionManagerFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderElectionManagerFutureStub> {
    private LeaderElectionManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Manager.OpenSessionResponse> openSession(
        atomix.primitive.election.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Manager.CloseSessionResponse> closeSession(
        atomix.primitive.election.v1.Manager.CloseSessionRequest request) {
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
    private final LeaderElectionManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderElectionManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.election.v1.Manager.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Manager.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.election.v1.Manager.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Manager.CloseSessionResponse>) responseObserver);
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

  private static abstract class LeaderElectionManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderElectionManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.election.v1.Manager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderElectionManager");
    }
  }

  private static final class LeaderElectionManagerFileDescriptorSupplier
      extends LeaderElectionManagerBaseDescriptorSupplier {
    LeaderElectionManagerFileDescriptorSupplier() {}
  }

  private static final class LeaderElectionManagerMethodDescriptorSupplier
      extends LeaderElectionManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderElectionManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderElectionManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderElectionManagerFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
