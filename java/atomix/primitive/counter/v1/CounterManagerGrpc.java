package atomix.primitive.counter.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CounterManager is a service for managing counter sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/counter/v1/manager.proto")
public final class CounterManagerGrpc {

  private CounterManagerGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.counter.v1.CounterManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Manager.OpenSessionRequest,
      atomix.primitive.counter.v1.Manager.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.counter.v1.Manager.OpenSessionRequest.class,
      responseType = atomix.primitive.counter.v1.Manager.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Manager.OpenSessionRequest,
      atomix.primitive.counter.v1.Manager.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Manager.OpenSessionRequest, atomix.primitive.counter.v1.Manager.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = CounterManagerGrpc.getOpenSessionMethod) == null) {
      synchronized (CounterManagerGrpc.class) {
        if ((getOpenSessionMethod = CounterManagerGrpc.getOpenSessionMethod) == null) {
          CounterManagerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Manager.OpenSessionRequest, atomix.primitive.counter.v1.Manager.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Manager.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Manager.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterManagerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Manager.CloseSessionRequest,
      atomix.primitive.counter.v1.Manager.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.counter.v1.Manager.CloseSessionRequest.class,
      responseType = atomix.primitive.counter.v1.Manager.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Manager.CloseSessionRequest,
      atomix.primitive.counter.v1.Manager.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Manager.CloseSessionRequest, atomix.primitive.counter.v1.Manager.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = CounterManagerGrpc.getCloseSessionMethod) == null) {
      synchronized (CounterManagerGrpc.class) {
        if ((getCloseSessionMethod = CounterManagerGrpc.getCloseSessionMethod) == null) {
          CounterManagerGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Manager.CloseSessionRequest, atomix.primitive.counter.v1.Manager.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Manager.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Manager.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterManagerMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounterManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterManagerStub>() {
        @java.lang.Override
        public CounterManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterManagerStub(channel, callOptions);
        }
      };
    return CounterManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounterManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterManagerBlockingStub>() {
        @java.lang.Override
        public CounterManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterManagerBlockingStub(channel, callOptions);
        }
      };
    return CounterManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounterManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterManagerFutureStub>() {
        @java.lang.Override
        public CounterManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterManagerFutureStub(channel, callOptions);
        }
      };
    return CounterManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CounterManager is a service for managing counter sessions
   * </pre>
   */
  public static abstract class CounterManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.counter.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.counter.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Manager.OpenSessionRequest,
                atomix.primitive.counter.v1.Manager.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Manager.CloseSessionRequest,
                atomix.primitive.counter.v1.Manager.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * CounterManager is a service for managing counter sessions
   * </pre>
   */
  public static final class CounterManagerStub extends io.grpc.stub.AbstractAsyncStub<CounterManagerStub> {
    private CounterManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterManagerStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.counter.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.counter.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * CounterManager is a service for managing counter sessions
   * </pre>
   */
  public static final class CounterManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<CounterManagerBlockingStub> {
    private CounterManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.counter.v1.Manager.OpenSessionResponse openSession(atomix.primitive.counter.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.counter.v1.Manager.CloseSessionResponse closeSession(atomix.primitive.counter.v1.Manager.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * CounterManager is a service for managing counter sessions
   * </pre>
   */
  public static final class CounterManagerFutureStub extends io.grpc.stub.AbstractFutureStub<CounterManagerFutureStub> {
    private CounterManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Manager.OpenSessionResponse> openSession(
        atomix.primitive.counter.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Manager.CloseSessionResponse> closeSession(
        atomix.primitive.counter.v1.Manager.CloseSessionRequest request) {
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
    private final CounterManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CounterManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.counter.v1.Manager.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Manager.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.counter.v1.Manager.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Manager.CloseSessionResponse>) responseObserver);
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

  private static abstract class CounterManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounterManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.counter.v1.Manager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CounterManager");
    }
  }

  private static final class CounterManagerFileDescriptorSupplier
      extends CounterManagerBaseDescriptorSupplier {
    CounterManagerFileDescriptorSupplier() {}
  }

  private static final class CounterManagerMethodDescriptorSupplier
      extends CounterManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CounterManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (CounterManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounterManagerFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
