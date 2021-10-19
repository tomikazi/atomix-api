package atomix.primitive.counter.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CounterSession is a service for managing counter sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/counter/v1/session.proto")
public final class CounterSessionGrpc {

  private CounterSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.counter.v1.CounterSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Session.OpenSessionRequest,
      atomix.primitive.counter.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.counter.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.counter.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Session.OpenSessionRequest,
      atomix.primitive.counter.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Session.OpenSessionRequest, atomix.primitive.counter.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = CounterSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (CounterSessionGrpc.class) {
        if ((getOpenSessionMethod = CounterSessionGrpc.getOpenSessionMethod) == null) {
          CounterSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Session.OpenSessionRequest, atomix.primitive.counter.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Session.CloseSessionRequest,
      atomix.primitive.counter.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.counter.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.counter.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Session.CloseSessionRequest,
      atomix.primitive.counter.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Session.CloseSessionRequest, atomix.primitive.counter.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = CounterSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (CounterSessionGrpc.class) {
        if ((getCloseSessionMethod = CounterSessionGrpc.getCloseSessionMethod) == null) {
          CounterSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Session.CloseSessionRequest, atomix.primitive.counter.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounterSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterSessionStub>() {
        @java.lang.Override
        public CounterSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterSessionStub(channel, callOptions);
        }
      };
    return CounterSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounterSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterSessionBlockingStub>() {
        @java.lang.Override
        public CounterSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterSessionBlockingStub(channel, callOptions);
        }
      };
    return CounterSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounterSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterSessionFutureStub>() {
        @java.lang.Override
        public CounterSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterSessionFutureStub(channel, callOptions);
        }
      };
    return CounterSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CounterSession is a service for managing counter sessions
   * </pre>
   */
  public static abstract class CounterSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.counter.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.counter.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Session.OpenSessionRequest,
                atomix.primitive.counter.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Session.CloseSessionRequest,
                atomix.primitive.counter.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * CounterSession is a service for managing counter sessions
   * </pre>
   */
  public static final class CounterSessionStub extends io.grpc.stub.AbstractAsyncStub<CounterSessionStub> {
    private CounterSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.counter.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.counter.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * CounterSession is a service for managing counter sessions
   * </pre>
   */
  public static final class CounterSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<CounterSessionBlockingStub> {
    private CounterSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.counter.v1.Session.OpenSessionResponse openSession(atomix.primitive.counter.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.counter.v1.Session.CloseSessionResponse closeSession(atomix.primitive.counter.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * CounterSession is a service for managing counter sessions
   * </pre>
   */
  public static final class CounterSessionFutureStub extends io.grpc.stub.AbstractFutureStub<CounterSessionFutureStub> {
    private CounterSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.counter.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.counter.v1.Session.CloseSessionRequest request) {
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
    private final CounterSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CounterSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.counter.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.counter.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class CounterSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounterSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.counter.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CounterSession");
    }
  }

  private static final class CounterSessionFileDescriptorSupplier
      extends CounterSessionBaseDescriptorSupplier {
    CounterSessionFileDescriptorSupplier() {}
  }

  private static final class CounterSessionMethodDescriptorSupplier
      extends CounterSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CounterSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (CounterSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounterSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
