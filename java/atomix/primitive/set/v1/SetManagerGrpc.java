package atomix.primitive.set.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SetManager is a service for managing set sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/set/v1/manager.proto")
public final class SetManagerGrpc {

  private SetManagerGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.set.v1.SetManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Manager.OpenSessionRequest,
      atomix.primitive.set.v1.Manager.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.set.v1.Manager.OpenSessionRequest.class,
      responseType = atomix.primitive.set.v1.Manager.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Manager.OpenSessionRequest,
      atomix.primitive.set.v1.Manager.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Manager.OpenSessionRequest, atomix.primitive.set.v1.Manager.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = SetManagerGrpc.getOpenSessionMethod) == null) {
      synchronized (SetManagerGrpc.class) {
        if ((getOpenSessionMethod = SetManagerGrpc.getOpenSessionMethod) == null) {
          SetManagerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Manager.OpenSessionRequest, atomix.primitive.set.v1.Manager.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Manager.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Manager.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetManagerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Manager.CloseSessionRequest,
      atomix.primitive.set.v1.Manager.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.set.v1.Manager.CloseSessionRequest.class,
      responseType = atomix.primitive.set.v1.Manager.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Manager.CloseSessionRequest,
      atomix.primitive.set.v1.Manager.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Manager.CloseSessionRequest, atomix.primitive.set.v1.Manager.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = SetManagerGrpc.getCloseSessionMethod) == null) {
      synchronized (SetManagerGrpc.class) {
        if ((getCloseSessionMethod = SetManagerGrpc.getCloseSessionMethod) == null) {
          SetManagerGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Manager.CloseSessionRequest, atomix.primitive.set.v1.Manager.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Manager.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Manager.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetManagerMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetManagerStub>() {
        @java.lang.Override
        public SetManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetManagerStub(channel, callOptions);
        }
      };
    return SetManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetManagerBlockingStub>() {
        @java.lang.Override
        public SetManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetManagerBlockingStub(channel, callOptions);
        }
      };
    return SetManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetManagerFutureStub>() {
        @java.lang.Override
        public SetManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetManagerFutureStub(channel, callOptions);
        }
      };
    return SetManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SetManager is a service for managing set sessions
   * </pre>
   */
  public static abstract class SetManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.set.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.set.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Manager.OpenSessionRequest,
                atomix.primitive.set.v1.Manager.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Manager.CloseSessionRequest,
                atomix.primitive.set.v1.Manager.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * SetManager is a service for managing set sessions
   * </pre>
   */
  public static final class SetManagerStub extends io.grpc.stub.AbstractAsyncStub<SetManagerStub> {
    private SetManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetManagerStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.set.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.set.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SetManager is a service for managing set sessions
   * </pre>
   */
  public static final class SetManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SetManagerBlockingStub> {
    private SetManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.set.v1.Manager.OpenSessionResponse openSession(atomix.primitive.set.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.set.v1.Manager.CloseSessionResponse closeSession(atomix.primitive.set.v1.Manager.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SetManager is a service for managing set sessions
   * </pre>
   */
  public static final class SetManagerFutureStub extends io.grpc.stub.AbstractFutureStub<SetManagerFutureStub> {
    private SetManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Manager.OpenSessionResponse> openSession(
        atomix.primitive.set.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Manager.CloseSessionResponse> closeSession(
        atomix.primitive.set.v1.Manager.CloseSessionRequest request) {
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
    private final SetManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SetManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.set.v1.Manager.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Manager.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.set.v1.Manager.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Manager.CloseSessionResponse>) responseObserver);
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

  private static abstract class SetManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SetManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.set.v1.Manager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SetManager");
    }
  }

  private static final class SetManagerFileDescriptorSupplier
      extends SetManagerBaseDescriptorSupplier {
    SetManagerFileDescriptorSupplier() {}
  }

  private static final class SetManagerMethodDescriptorSupplier
      extends SetManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SetManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SetManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SetManagerFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
