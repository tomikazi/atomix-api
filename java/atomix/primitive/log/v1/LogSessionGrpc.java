package atomix.primitive.log.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LogSession is a service for managing log sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/log/v1/session.proto")
public final class LogSessionGrpc {

  private LogSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.log.v1.LogSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Session.OpenSessionRequest,
      atomix.primitive.log.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.log.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.log.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Session.OpenSessionRequest,
      atomix.primitive.log.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Session.OpenSessionRequest, atomix.primitive.log.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = LogSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (LogSessionGrpc.class) {
        if ((getOpenSessionMethod = LogSessionGrpc.getOpenSessionMethod) == null) {
          LogSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Session.OpenSessionRequest, atomix.primitive.log.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.log.v1.Session.CloseSessionRequest,
      atomix.primitive.log.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.log.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.log.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.log.v1.Session.CloseSessionRequest,
      atomix.primitive.log.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.log.v1.Session.CloseSessionRequest, atomix.primitive.log.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = LogSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (LogSessionGrpc.class) {
        if ((getCloseSessionMethod = LogSessionGrpc.getCloseSessionMethod) == null) {
          LogSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.log.v1.Session.CloseSessionRequest, atomix.primitive.log.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.log.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogSessionStub>() {
        @java.lang.Override
        public LogSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogSessionStub(channel, callOptions);
        }
      };
    return LogSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogSessionBlockingStub>() {
        @java.lang.Override
        public LogSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogSessionBlockingStub(channel, callOptions);
        }
      };
    return LogSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogSessionFutureStub>() {
        @java.lang.Override
        public LogSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogSessionFutureStub(channel, callOptions);
        }
      };
    return LogSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LogSession is a service for managing log sessions
   * </pre>
   */
  public static abstract class LogSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.log.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.log.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Session.OpenSessionRequest,
                atomix.primitive.log.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.log.v1.Session.CloseSessionRequest,
                atomix.primitive.log.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * LogSession is a service for managing log sessions
   * </pre>
   */
  public static final class LogSessionStub extends io.grpc.stub.AbstractAsyncStub<LogSessionStub> {
    private LogSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.log.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.log.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LogSession is a service for managing log sessions
   * </pre>
   */
  public static final class LogSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogSessionBlockingStub> {
    private LogSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.log.v1.Session.OpenSessionResponse openSession(atomix.primitive.log.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.log.v1.Session.CloseSessionResponse closeSession(atomix.primitive.log.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LogSession is a service for managing log sessions
   * </pre>
   */
  public static final class LogSessionFutureStub extends io.grpc.stub.AbstractFutureStub<LogSessionFutureStub> {
    private LogSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.log.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.log.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.log.v1.Session.CloseSessionRequest request) {
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
    private final LogSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.log.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.log.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.log.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class LogSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.log.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogSession");
    }
  }

  private static final class LogSessionFileDescriptorSupplier
      extends LogSessionBaseDescriptorSupplier {
    LogSessionFileDescriptorSupplier() {}
  }

  private static final class LogSessionMethodDescriptorSupplier
      extends LogSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
