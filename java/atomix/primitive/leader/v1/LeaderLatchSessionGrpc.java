package atomix.primitive.leader.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderLatchSession is a service for managing leader latch sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/leader/v1/session.proto")
public final class LeaderLatchSessionGrpc {

  private LeaderLatchSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.leader.v1.LeaderLatchSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Session.OpenSessionRequest,
      atomix.primitive.leader.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.leader.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.leader.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Session.OpenSessionRequest,
      atomix.primitive.leader.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Session.OpenSessionRequest, atomix.primitive.leader.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = LeaderLatchSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (LeaderLatchSessionGrpc.class) {
        if ((getOpenSessionMethod = LeaderLatchSessionGrpc.getOpenSessionMethod) == null) {
          LeaderLatchSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Session.OpenSessionRequest, atomix.primitive.leader.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Session.CloseSessionRequest,
      atomix.primitive.leader.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.leader.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.leader.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Session.CloseSessionRequest,
      atomix.primitive.leader.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.leader.v1.Session.CloseSessionRequest, atomix.primitive.leader.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = LeaderLatchSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (LeaderLatchSessionGrpc.class) {
        if ((getCloseSessionMethod = LeaderLatchSessionGrpc.getCloseSessionMethod) == null) {
          LeaderLatchSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.leader.v1.Session.CloseSessionRequest, atomix.primitive.leader.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.leader.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderLatchSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchSessionStub>() {
        @java.lang.Override
        public LeaderLatchSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchSessionStub(channel, callOptions);
        }
      };
    return LeaderLatchSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderLatchSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchSessionBlockingStub>() {
        @java.lang.Override
        public LeaderLatchSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchSessionBlockingStub(channel, callOptions);
        }
      };
    return LeaderLatchSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderLatchSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchSessionFutureStub>() {
        @java.lang.Override
        public LeaderLatchSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchSessionFutureStub(channel, callOptions);
        }
      };
    return LeaderLatchSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderLatchSession is a service for managing leader latch sessions
   * </pre>
   */
  public static abstract class LeaderLatchSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.leader.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.leader.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Session.OpenSessionRequest,
                atomix.primitive.leader.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.leader.v1.Session.CloseSessionRequest,
                atomix.primitive.leader.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderLatchSession is a service for managing leader latch sessions
   * </pre>
   */
  public static final class LeaderLatchSessionStub extends io.grpc.stub.AbstractAsyncStub<LeaderLatchSessionStub> {
    private LeaderLatchSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.leader.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.leader.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderLatchSession is a service for managing leader latch sessions
   * </pre>
   */
  public static final class LeaderLatchSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderLatchSessionBlockingStub> {
    private LeaderLatchSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.leader.v1.Session.OpenSessionResponse openSession(atomix.primitive.leader.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.leader.v1.Session.CloseSessionResponse closeSession(atomix.primitive.leader.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderLatchSession is a service for managing leader latch sessions
   * </pre>
   */
  public static final class LeaderLatchSessionFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderLatchSessionFutureStub> {
    private LeaderLatchSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.leader.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.leader.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.leader.v1.Session.CloseSessionRequest request) {
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
    private final LeaderLatchSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderLatchSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.leader.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.leader.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.leader.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class LeaderLatchSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderLatchSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.leader.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderLatchSession");
    }
  }

  private static final class LeaderLatchSessionFileDescriptorSupplier
      extends LeaderLatchSessionBaseDescriptorSupplier {
    LeaderLatchSessionFileDescriptorSupplier() {}
  }

  private static final class LeaderLatchSessionMethodDescriptorSupplier
      extends LeaderLatchSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderLatchSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderLatchSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderLatchSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
