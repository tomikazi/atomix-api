package atomix.primitive.election.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderElectionSession is a service for managing leader election sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/election/v1/session.proto")
public final class LeaderElectionSessionGrpc {

  private LeaderElectionSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.election.v1.LeaderElectionSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Session.OpenSessionRequest,
      atomix.primitive.election.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.election.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.election.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Session.OpenSessionRequest,
      atomix.primitive.election.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Session.OpenSessionRequest, atomix.primitive.election.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = LeaderElectionSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (LeaderElectionSessionGrpc.class) {
        if ((getOpenSessionMethod = LeaderElectionSessionGrpc.getOpenSessionMethod) == null) {
          LeaderElectionSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Session.OpenSessionRequest, atomix.primitive.election.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Session.CloseSessionRequest,
      atomix.primitive.election.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.election.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.election.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Session.CloseSessionRequest,
      atomix.primitive.election.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Session.CloseSessionRequest, atomix.primitive.election.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = LeaderElectionSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (LeaderElectionSessionGrpc.class) {
        if ((getCloseSessionMethod = LeaderElectionSessionGrpc.getCloseSessionMethod) == null) {
          LeaderElectionSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Session.CloseSessionRequest, atomix.primitive.election.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderElectionSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionSessionStub>() {
        @java.lang.Override
        public LeaderElectionSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionSessionStub(channel, callOptions);
        }
      };
    return LeaderElectionSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderElectionSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionSessionBlockingStub>() {
        @java.lang.Override
        public LeaderElectionSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionSessionBlockingStub(channel, callOptions);
        }
      };
    return LeaderElectionSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderElectionSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionSessionFutureStub>() {
        @java.lang.Override
        public LeaderElectionSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionSessionFutureStub(channel, callOptions);
        }
      };
    return LeaderElectionSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderElectionSession is a service for managing leader election sessions
   * </pre>
   */
  public static abstract class LeaderElectionSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.election.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.election.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Session.OpenSessionRequest,
                atomix.primitive.election.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Session.CloseSessionRequest,
                atomix.primitive.election.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderElectionSession is a service for managing leader election sessions
   * </pre>
   */
  public static final class LeaderElectionSessionStub extends io.grpc.stub.AbstractAsyncStub<LeaderElectionSessionStub> {
    private LeaderElectionSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.election.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.election.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderElectionSession is a service for managing leader election sessions
   * </pre>
   */
  public static final class LeaderElectionSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderElectionSessionBlockingStub> {
    private LeaderElectionSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.election.v1.Session.OpenSessionResponse openSession(atomix.primitive.election.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.election.v1.Session.CloseSessionResponse closeSession(atomix.primitive.election.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderElectionSession is a service for managing leader election sessions
   * </pre>
   */
  public static final class LeaderElectionSessionFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderElectionSessionFutureStub> {
    private LeaderElectionSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.election.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.election.v1.Session.CloseSessionRequest request) {
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
    private final LeaderElectionSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderElectionSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.election.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.election.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class LeaderElectionSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderElectionSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.election.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderElectionSession");
    }
  }

  private static final class LeaderElectionSessionFileDescriptorSupplier
      extends LeaderElectionSessionBaseDescriptorSupplier {
    LeaderElectionSessionFileDescriptorSupplier() {}
  }

  private static final class LeaderElectionSessionMethodDescriptorSupplier
      extends LeaderElectionSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderElectionSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderElectionSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderElectionSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
