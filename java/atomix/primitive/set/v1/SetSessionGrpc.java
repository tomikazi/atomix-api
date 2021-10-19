package atomix.primitive.set.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SetSession is a service for managing set sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/set/v1/session.proto")
public final class SetSessionGrpc {

  private SetSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.set.v1.SetSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Session.OpenSessionRequest,
      atomix.primitive.set.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.set.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.set.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Session.OpenSessionRequest,
      atomix.primitive.set.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Session.OpenSessionRequest, atomix.primitive.set.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = SetSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (SetSessionGrpc.class) {
        if ((getOpenSessionMethod = SetSessionGrpc.getOpenSessionMethod) == null) {
          SetSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Session.OpenSessionRequest, atomix.primitive.set.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Session.CloseSessionRequest,
      atomix.primitive.set.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.set.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.set.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Session.CloseSessionRequest,
      atomix.primitive.set.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Session.CloseSessionRequest, atomix.primitive.set.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = SetSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (SetSessionGrpc.class) {
        if ((getCloseSessionMethod = SetSessionGrpc.getCloseSessionMethod) == null) {
          SetSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Session.CloseSessionRequest, atomix.primitive.set.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetSessionStub>() {
        @java.lang.Override
        public SetSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetSessionStub(channel, callOptions);
        }
      };
    return SetSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetSessionBlockingStub>() {
        @java.lang.Override
        public SetSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetSessionBlockingStub(channel, callOptions);
        }
      };
    return SetSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetSessionFutureStub>() {
        @java.lang.Override
        public SetSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetSessionFutureStub(channel, callOptions);
        }
      };
    return SetSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SetSession is a service for managing set sessions
   * </pre>
   */
  public static abstract class SetSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.set.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.set.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Session.OpenSessionRequest,
                atomix.primitive.set.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Session.CloseSessionRequest,
                atomix.primitive.set.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * SetSession is a service for managing set sessions
   * </pre>
   */
  public static final class SetSessionStub extends io.grpc.stub.AbstractAsyncStub<SetSessionStub> {
    private SetSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.set.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.set.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SetSession is a service for managing set sessions
   * </pre>
   */
  public static final class SetSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<SetSessionBlockingStub> {
    private SetSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.set.v1.Session.OpenSessionResponse openSession(atomix.primitive.set.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.set.v1.Session.CloseSessionResponse closeSession(atomix.primitive.set.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SetSession is a service for managing set sessions
   * </pre>
   */
  public static final class SetSessionFutureStub extends io.grpc.stub.AbstractFutureStub<SetSessionFutureStub> {
    private SetSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.set.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.set.v1.Session.CloseSessionRequest request) {
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
    private final SetSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SetSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.set.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.set.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class SetSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SetSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.set.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SetSession");
    }
  }

  private static final class SetSessionFileDescriptorSupplier
      extends SetSessionBaseDescriptorSupplier {
    SetSessionFileDescriptorSupplier() {}
  }

  private static final class SetSessionMethodDescriptorSupplier
      extends SetSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SetSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (SetSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SetSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
