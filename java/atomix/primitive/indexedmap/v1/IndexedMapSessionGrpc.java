package atomix.primitive.indexedmap.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * IndexedMapSession is a service for managing indexed map sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/indexedmap/v1/session.proto")
public final class IndexedMapSessionGrpc {

  private IndexedMapSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.indexedmap.v1.IndexedMapSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Session.OpenSessionRequest,
      atomix.primitive.indexedmap.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.indexedmap.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Session.OpenSessionRequest,
      atomix.primitive.indexedmap.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Session.OpenSessionRequest, atomix.primitive.indexedmap.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = IndexedMapSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (IndexedMapSessionGrpc.class) {
        if ((getOpenSessionMethod = IndexedMapSessionGrpc.getOpenSessionMethod) == null) {
          IndexedMapSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Session.OpenSessionRequest, atomix.primitive.indexedmap.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Session.CloseSessionRequest,
      atomix.primitive.indexedmap.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.indexedmap.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.indexedmap.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Session.CloseSessionRequest,
      atomix.primitive.indexedmap.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.indexedmap.v1.Session.CloseSessionRequest, atomix.primitive.indexedmap.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = IndexedMapSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (IndexedMapSessionGrpc.class) {
        if ((getCloseSessionMethod = IndexedMapSessionGrpc.getCloseSessionMethod) == null) {
          IndexedMapSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.indexedmap.v1.Session.CloseSessionRequest, atomix.primitive.indexedmap.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.indexedmap.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexedMapSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapSessionStub>() {
        @java.lang.Override
        public IndexedMapSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapSessionStub(channel, callOptions);
        }
      };
    return IndexedMapSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexedMapSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapSessionBlockingStub>() {
        @java.lang.Override
        public IndexedMapSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapSessionBlockingStub(channel, callOptions);
        }
      };
    return IndexedMapSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexedMapSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapSessionFutureStub>() {
        @java.lang.Override
        public IndexedMapSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapSessionFutureStub(channel, callOptions);
        }
      };
    return IndexedMapSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IndexedMapSession is a service for managing indexed map sessions
   * </pre>
   */
  public static abstract class IndexedMapSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.indexedmap.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.indexedmap.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Session.OpenSessionRequest,
                atomix.primitive.indexedmap.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.indexedmap.v1.Session.CloseSessionRequest,
                atomix.primitive.indexedmap.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * IndexedMapSession is a service for managing indexed map sessions
   * </pre>
   */
  public static final class IndexedMapSessionStub extends io.grpc.stub.AbstractAsyncStub<IndexedMapSessionStub> {
    private IndexedMapSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.indexedmap.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.indexedmap.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IndexedMapSession is a service for managing indexed map sessions
   * </pre>
   */
  public static final class IndexedMapSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<IndexedMapSessionBlockingStub> {
    private IndexedMapSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.indexedmap.v1.Session.OpenSessionResponse openSession(atomix.primitive.indexedmap.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.indexedmap.v1.Session.CloseSessionResponse closeSession(atomix.primitive.indexedmap.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IndexedMapSession is a service for managing indexed map sessions
   * </pre>
   */
  public static final class IndexedMapSessionFutureStub extends io.grpc.stub.AbstractFutureStub<IndexedMapSessionFutureStub> {
    private IndexedMapSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.indexedmap.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.indexedmap.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.indexedmap.v1.Session.CloseSessionRequest request) {
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
    private final IndexedMapSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndexedMapSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.indexedmap.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.indexedmap.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.indexedmap.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class IndexedMapSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexedMapSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.indexedmap.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IndexedMapSession");
    }
  }

  private static final class IndexedMapSessionFileDescriptorSupplier
      extends IndexedMapSessionBaseDescriptorSupplier {
    IndexedMapSessionFileDescriptorSupplier() {}
  }

  private static final class IndexedMapSessionMethodDescriptorSupplier
      extends IndexedMapSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndexedMapSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (IndexedMapSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexedMapSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}