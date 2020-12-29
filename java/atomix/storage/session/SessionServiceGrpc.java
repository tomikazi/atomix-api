package atomix.storage.session;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Session service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/session/session.proto")
public final class SessionServiceGrpc {

  private SessionServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.session.SessionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.session.Session.OpenSessionRequest,
      atomix.storage.session.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.storage.session.Session.OpenSessionRequest.class,
      responseType = atomix.storage.session.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.session.Session.OpenSessionRequest,
      atomix.storage.session.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.storage.session.Session.OpenSessionRequest, atomix.storage.session.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = SessionServiceGrpc.getOpenSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getOpenSessionMethod = SessionServiceGrpc.getOpenSessionMethod) == null) {
          SessionServiceGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.storage.session.Session.OpenSessionRequest, atomix.storage.session.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.session.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.session.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.session.Session.KeepAliveRequest,
      atomix.storage.session.Session.KeepAliveResponse> getKeepAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeepAlive",
      requestType = atomix.storage.session.Session.KeepAliveRequest.class,
      responseType = atomix.storage.session.Session.KeepAliveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.session.Session.KeepAliveRequest,
      atomix.storage.session.Session.KeepAliveResponse> getKeepAliveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.session.Session.KeepAliveRequest, atomix.storage.session.Session.KeepAliveResponse> getKeepAliveMethod;
    if ((getKeepAliveMethod = SessionServiceGrpc.getKeepAliveMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getKeepAliveMethod = SessionServiceGrpc.getKeepAliveMethod) == null) {
          SessionServiceGrpc.getKeepAliveMethod = getKeepAliveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.session.Session.KeepAliveRequest, atomix.storage.session.Session.KeepAliveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeepAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.session.Session.KeepAliveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.session.Session.KeepAliveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("KeepAlive"))
              .build();
        }
      }
    }
    return getKeepAliveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.session.Session.CloseSessionRequest,
      atomix.storage.session.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.storage.session.Session.CloseSessionRequest.class,
      responseType = atomix.storage.session.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.session.Session.CloseSessionRequest,
      atomix.storage.session.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.storage.session.Session.CloseSessionRequest, atomix.storage.session.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = SessionServiceGrpc.getCloseSessionMethod) == null) {
      synchronized (SessionServiceGrpc.class) {
        if ((getCloseSessionMethod = SessionServiceGrpc.getCloseSessionMethod) == null) {
          SessionServiceGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.storage.session.Session.CloseSessionRequest, atomix.storage.session.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.session.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.session.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionServiceMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceStub>() {
        @java.lang.Override
        public SessionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceStub(channel, callOptions);
        }
      };
    return SessionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceBlockingStub>() {
        @java.lang.Override
        public SessionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceBlockingStub(channel, callOptions);
        }
      };
    return SessionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionServiceFutureStub>() {
        @java.lang.Override
        public SessionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionServiceFutureStub(channel, callOptions);
        }
      };
    return SessionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Session service
   * </pre>
   */
  public static abstract class SessionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * OpenSession opens a new session
     * </pre>
     */
    public void openSession(atomix.storage.session.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.session.Session.OpenSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * KeepAlive keeps a session alive
     * </pre>
     */
    public void keepAlive(atomix.storage.session.Session.KeepAliveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.session.Session.KeepAliveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKeepAliveMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloseSession closes a session
     * </pre>
     */
    public void closeSession(atomix.storage.session.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.session.Session.CloseSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.session.Session.OpenSessionRequest,
                atomix.storage.session.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getKeepAliveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.session.Session.KeepAliveRequest,
                atomix.storage.session.Session.KeepAliveResponse>(
                  this, METHODID_KEEP_ALIVE)))
          .addMethod(
            getCloseSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.session.Session.CloseSessionRequest,
                atomix.storage.session.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Session service
   * </pre>
   */
  public static final class SessionServiceStub extends io.grpc.stub.AbstractAsyncStub<SessionServiceStub> {
    private SessionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * OpenSession opens a new session
     * </pre>
     */
    public void openSession(atomix.storage.session.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.session.Session.OpenSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * KeepAlive keeps a session alive
     * </pre>
     */
    public void keepAlive(atomix.storage.session.Session.KeepAliveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.session.Session.KeepAliveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeepAliveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloseSession closes a session
     * </pre>
     */
    public void closeSession(atomix.storage.session.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.session.Session.CloseSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Session service
   * </pre>
   */
  public static final class SessionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SessionServiceBlockingStub> {
    private SessionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * OpenSession opens a new session
     * </pre>
     */
    public atomix.storage.session.Session.OpenSessionResponse openSession(atomix.storage.session.Session.OpenSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * KeepAlive keeps a session alive
     * </pre>
     */
    public atomix.storage.session.Session.KeepAliveResponse keepAlive(atomix.storage.session.Session.KeepAliveRequest request) {
      return blockingUnaryCall(
          getChannel(), getKeepAliveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloseSession closes a session
     * </pre>
     */
    public atomix.storage.session.Session.CloseSessionResponse closeSession(atomix.storage.session.Session.CloseSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Session service
   * </pre>
   */
  public static final class SessionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SessionServiceFutureStub> {
    private SessionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * OpenSession opens a new session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.session.Session.OpenSessionResponse> openSession(
        atomix.storage.session.Session.OpenSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * KeepAlive keeps a session alive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.session.Session.KeepAliveResponse> keepAlive(
        atomix.storage.session.Session.KeepAliveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKeepAliveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloseSession closes a session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.session.Session.CloseSessionResponse> closeSession(
        atomix.storage.session.Session.CloseSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_SESSION = 0;
  private static final int METHODID_KEEP_ALIVE = 1;
  private static final int METHODID_CLOSE_SESSION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.storage.session.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.session.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_KEEP_ALIVE:
          serviceImpl.keepAlive((atomix.storage.session.Session.KeepAliveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.session.Session.KeepAliveResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.storage.session.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.session.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.storage.session.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SessionService");
    }
  }

  private static final class SessionServiceFileDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier {
    SessionServiceFileDescriptorSupplier() {}
  }

  private static final class SessionServiceMethodDescriptorSupplier
      extends SessionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SessionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionServiceFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getKeepAliveMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
