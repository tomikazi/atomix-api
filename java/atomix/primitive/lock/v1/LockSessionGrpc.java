package atomix.primitive.lock.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LockSession is a service for managing lock sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/lock/v1/session.proto")
public final class LockSessionGrpc {

  private LockSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.lock.v1.LockSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Session.OpenSessionRequest,
      atomix.primitive.lock.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.lock.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.lock.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Session.OpenSessionRequest,
      atomix.primitive.lock.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Session.OpenSessionRequest, atomix.primitive.lock.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = LockSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (LockSessionGrpc.class) {
        if ((getOpenSessionMethod = LockSessionGrpc.getOpenSessionMethod) == null) {
          LockSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.v1.Session.OpenSessionRequest, atomix.primitive.lock.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Session.CloseSessionRequest,
      atomix.primitive.lock.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.lock.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.lock.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Session.CloseSessionRequest,
      atomix.primitive.lock.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Session.CloseSessionRequest, atomix.primitive.lock.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = LockSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (LockSessionGrpc.class) {
        if ((getCloseSessionMethod = LockSessionGrpc.getCloseSessionMethod) == null) {
          LockSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.v1.Session.CloseSessionRequest, atomix.primitive.lock.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockSessionStub>() {
        @java.lang.Override
        public LockSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockSessionStub(channel, callOptions);
        }
      };
    return LockSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockSessionBlockingStub>() {
        @java.lang.Override
        public LockSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockSessionBlockingStub(channel, callOptions);
        }
      };
    return LockSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockSessionFutureStub>() {
        @java.lang.Override
        public LockSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockSessionFutureStub(channel, callOptions);
        }
      };
    return LockSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LockSession is a service for managing lock sessions
   * </pre>
   */
  public static abstract class LockSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.lock.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.lock.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.v1.Session.OpenSessionRequest,
                atomix.primitive.lock.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.v1.Session.CloseSessionRequest,
                atomix.primitive.lock.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * LockSession is a service for managing lock sessions
   * </pre>
   */
  public static final class LockSessionStub extends io.grpc.stub.AbstractAsyncStub<LockSessionStub> {
    private LockSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.lock.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.lock.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LockSession is a service for managing lock sessions
   * </pre>
   */
  public static final class LockSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<LockSessionBlockingStub> {
    private LockSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.lock.v1.Session.OpenSessionResponse openSession(atomix.primitive.lock.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.lock.v1.Session.CloseSessionResponse closeSession(atomix.primitive.lock.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LockSession is a service for managing lock sessions
   * </pre>
   */
  public static final class LockSessionFutureStub extends io.grpc.stub.AbstractFutureStub<LockSessionFutureStub> {
    private LockSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.lock.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.lock.v1.Session.CloseSessionRequest request) {
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
    private final LockSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.lock.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.lock.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class LockSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.lock.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LockSession");
    }
  }

  private static final class LockSessionFileDescriptorSupplier
      extends LockSessionBaseDescriptorSupplier {
    LockSessionFileDescriptorSupplier() {}
  }

  private static final class LockSessionMethodDescriptorSupplier
      extends LockSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
