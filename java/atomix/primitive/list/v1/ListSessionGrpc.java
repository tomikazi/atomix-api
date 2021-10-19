package atomix.primitive.list.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ListSession is a service for managing list sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/list/v1/session.proto")
public final class ListSessionGrpc {

  private ListSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.list.v1.ListSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Session.OpenSessionRequest,
      atomix.primitive.list.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.list.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.list.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Session.OpenSessionRequest,
      atomix.primitive.list.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Session.OpenSessionRequest, atomix.primitive.list.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = ListSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (ListSessionGrpc.class) {
        if ((getOpenSessionMethod = ListSessionGrpc.getOpenSessionMethod) == null) {
          ListSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Session.OpenSessionRequest, atomix.primitive.list.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Session.CloseSessionRequest,
      atomix.primitive.list.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.list.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.list.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Session.CloseSessionRequest,
      atomix.primitive.list.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Session.CloseSessionRequest, atomix.primitive.list.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = ListSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (ListSessionGrpc.class) {
        if ((getCloseSessionMethod = ListSessionGrpc.getCloseSessionMethod) == null) {
          ListSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Session.CloseSessionRequest, atomix.primitive.list.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListSessionStub>() {
        @java.lang.Override
        public ListSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListSessionStub(channel, callOptions);
        }
      };
    return ListSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListSessionBlockingStub>() {
        @java.lang.Override
        public ListSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListSessionBlockingStub(channel, callOptions);
        }
      };
    return ListSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListSessionFutureStub>() {
        @java.lang.Override
        public ListSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListSessionFutureStub(channel, callOptions);
        }
      };
    return ListSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ListSession is a service for managing list sessions
   * </pre>
   */
  public static abstract class ListSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.list.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.list.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Session.OpenSessionRequest,
                atomix.primitive.list.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Session.CloseSessionRequest,
                atomix.primitive.list.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * ListSession is a service for managing list sessions
   * </pre>
   */
  public static final class ListSessionStub extends io.grpc.stub.AbstractAsyncStub<ListSessionStub> {
    private ListSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.list.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.list.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ListSession is a service for managing list sessions
   * </pre>
   */
  public static final class ListSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListSessionBlockingStub> {
    private ListSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.list.v1.Session.OpenSessionResponse openSession(atomix.primitive.list.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.list.v1.Session.CloseSessionResponse closeSession(atomix.primitive.list.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ListSession is a service for managing list sessions
   * </pre>
   */
  public static final class ListSessionFutureStub extends io.grpc.stub.AbstractFutureStub<ListSessionFutureStub> {
    private ListSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.list.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.list.v1.Session.CloseSessionRequest request) {
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
    private final ListSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.list.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.list.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class ListSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.list.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListSession");
    }
  }

  private static final class ListSessionFileDescriptorSupplier
      extends ListSessionBaseDescriptorSupplier {
    ListSessionFileDescriptorSupplier() {}
  }

  private static final class ListSessionMethodDescriptorSupplier
      extends ListSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
