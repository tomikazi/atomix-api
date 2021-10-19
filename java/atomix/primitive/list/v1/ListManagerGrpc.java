package atomix.primitive.list.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ListManager is a service for managing list instances
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/list/v1/manager.proto")
public final class ListManagerGrpc {

  private ListManagerGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.list.v1.ListManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Manager.OpenSessionRequest,
      atomix.primitive.list.v1.Manager.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.list.v1.Manager.OpenSessionRequest.class,
      responseType = atomix.primitive.list.v1.Manager.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Manager.OpenSessionRequest,
      atomix.primitive.list.v1.Manager.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Manager.OpenSessionRequest, atomix.primitive.list.v1.Manager.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = ListManagerGrpc.getOpenSessionMethod) == null) {
      synchronized (ListManagerGrpc.class) {
        if ((getOpenSessionMethod = ListManagerGrpc.getOpenSessionMethod) == null) {
          ListManagerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Manager.OpenSessionRequest, atomix.primitive.list.v1.Manager.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Manager.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Manager.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListManagerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Manager.CloseSessionRequest,
      atomix.primitive.list.v1.Manager.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.list.v1.Manager.CloseSessionRequest.class,
      responseType = atomix.primitive.list.v1.Manager.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Manager.CloseSessionRequest,
      atomix.primitive.list.v1.Manager.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Manager.CloseSessionRequest, atomix.primitive.list.v1.Manager.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = ListManagerGrpc.getCloseSessionMethod) == null) {
      synchronized (ListManagerGrpc.class) {
        if ((getCloseSessionMethod = ListManagerGrpc.getCloseSessionMethod) == null) {
          ListManagerGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Manager.CloseSessionRequest, atomix.primitive.list.v1.Manager.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Manager.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Manager.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListManagerMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListManagerStub>() {
        @java.lang.Override
        public ListManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListManagerStub(channel, callOptions);
        }
      };
    return ListManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListManagerBlockingStub>() {
        @java.lang.Override
        public ListManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListManagerBlockingStub(channel, callOptions);
        }
      };
    return ListManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListManagerFutureStub>() {
        @java.lang.Override
        public ListManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListManagerFutureStub(channel, callOptions);
        }
      };
    return ListManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ListManager is a service for managing list instances
   * </pre>
   */
  public static abstract class ListManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.list.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.list.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Manager.OpenSessionRequest,
                atomix.primitive.list.v1.Manager.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Manager.CloseSessionRequest,
                atomix.primitive.list.v1.Manager.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * ListManager is a service for managing list instances
   * </pre>
   */
  public static final class ListManagerStub extends io.grpc.stub.AbstractAsyncStub<ListManagerStub> {
    private ListManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListManagerStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.list.v1.Manager.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Manager.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.list.v1.Manager.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Manager.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ListManager is a service for managing list instances
   * </pre>
   */
  public static final class ListManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListManagerBlockingStub> {
    private ListManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.list.v1.Manager.OpenSessionResponse openSession(atomix.primitive.list.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.list.v1.Manager.CloseSessionResponse closeSession(atomix.primitive.list.v1.Manager.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ListManager is a service for managing list instances
   * </pre>
   */
  public static final class ListManagerFutureStub extends io.grpc.stub.AbstractFutureStub<ListManagerFutureStub> {
    private ListManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Manager.OpenSessionResponse> openSession(
        atomix.primitive.list.v1.Manager.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Manager.CloseSessionResponse> closeSession(
        atomix.primitive.list.v1.Manager.CloseSessionRequest request) {
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
    private final ListManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.list.v1.Manager.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Manager.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.list.v1.Manager.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Manager.CloseSessionResponse>) responseObserver);
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

  private static abstract class ListManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.list.v1.Manager.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListManager");
    }
  }

  private static final class ListManagerFileDescriptorSupplier
      extends ListManagerBaseDescriptorSupplier {
    ListManagerFileDescriptorSupplier() {}
  }

  private static final class ListManagerMethodDescriptorSupplier
      extends ListManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListManagerFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
