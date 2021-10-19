package atomix.primitive.value.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ValueSession is a service for managing value sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/value/v1/session.proto")
public final class ValueSessionGrpc {

  private ValueSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.value.v1.ValueSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.v1.Session.OpenSessionRequest,
      atomix.primitive.value.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.value.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.value.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.v1.Session.OpenSessionRequest,
      atomix.primitive.value.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.v1.Session.OpenSessionRequest, atomix.primitive.value.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = ValueSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (ValueSessionGrpc.class) {
        if ((getOpenSessionMethod = ValueSessionGrpc.getOpenSessionMethod) == null) {
          ValueSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.v1.Session.OpenSessionRequest, atomix.primitive.value.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.v1.Session.CloseSessionRequest,
      atomix.primitive.value.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.value.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.value.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.v1.Session.CloseSessionRequest,
      atomix.primitive.value.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.v1.Session.CloseSessionRequest, atomix.primitive.value.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = ValueSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (ValueSessionGrpc.class) {
        if ((getCloseSessionMethod = ValueSessionGrpc.getCloseSessionMethod) == null) {
          ValueSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.v1.Session.CloseSessionRequest, atomix.primitive.value.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValueSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueSessionStub>() {
        @java.lang.Override
        public ValueSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueSessionStub(channel, callOptions);
        }
      };
    return ValueSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValueSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueSessionBlockingStub>() {
        @java.lang.Override
        public ValueSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueSessionBlockingStub(channel, callOptions);
        }
      };
    return ValueSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValueSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueSessionFutureStub>() {
        @java.lang.Override
        public ValueSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueSessionFutureStub(channel, callOptions);
        }
      };
    return ValueSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ValueSession is a service for managing value sessions
   * </pre>
   */
  public static abstract class ValueSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.value.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.value.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.value.v1.Session.OpenSessionRequest,
                atomix.primitive.value.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.value.v1.Session.CloseSessionRequest,
                atomix.primitive.value.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * ValueSession is a service for managing value sessions
   * </pre>
   */
  public static final class ValueSessionStub extends io.grpc.stub.AbstractAsyncStub<ValueSessionStub> {
    private ValueSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.value.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.value.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ValueSession is a service for managing value sessions
   * </pre>
   */
  public static final class ValueSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValueSessionBlockingStub> {
    private ValueSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.value.v1.Session.OpenSessionResponse openSession(atomix.primitive.value.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.value.v1.Session.CloseSessionResponse closeSession(atomix.primitive.value.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ValueSession is a service for managing value sessions
   * </pre>
   */
  public static final class ValueSessionFutureStub extends io.grpc.stub.AbstractFutureStub<ValueSessionFutureStub> {
    private ValueSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.value.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.value.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.value.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.value.v1.Session.CloseSessionRequest request) {
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
    private final ValueSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValueSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.value.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.value.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class ValueSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValueSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.value.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValueSession");
    }
  }

  private static final class ValueSessionFileDescriptorSupplier
      extends ValueSessionBaseDescriptorSupplier {
    ValueSessionFileDescriptorSupplier() {}
  }

  private static final class ValueSessionMethodDescriptorSupplier
      extends ValueSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValueSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValueSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValueSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
