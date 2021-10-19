package atomix.primitive;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Primitive is a service for managing primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/primitive.proto")
@java.lang.Deprecated
public final class PrimitiveGrpc {

  private PrimitiveGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.Primitive";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.CreateRequest,
      atomix.primitive.PrimitiveOuterClass.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.primitive.PrimitiveOuterClass.CreateRequest.class,
      responseType = atomix.primitive.PrimitiveOuterClass.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.CreateRequest,
      atomix.primitive.PrimitiveOuterClass.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.CreateRequest, atomix.primitive.PrimitiveOuterClass.CreateResponse> getCreateMethod;
    if ((getCreateMethod = PrimitiveGrpc.getCreateMethod) == null) {
      synchronized (PrimitiveGrpc.class) {
        if ((getCreateMethod = PrimitiveGrpc.getCreateMethod) == null) {
          PrimitiveGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.PrimitiveOuterClass.CreateRequest, atomix.primitive.PrimitiveOuterClass.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.PrimitiveOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.PrimitiveOuterClass.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.CloseRequest,
      atomix.primitive.PrimitiveOuterClass.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.primitive.PrimitiveOuterClass.CloseRequest.class,
      responseType = atomix.primitive.PrimitiveOuterClass.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.CloseRequest,
      atomix.primitive.PrimitiveOuterClass.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.CloseRequest, atomix.primitive.PrimitiveOuterClass.CloseResponse> getCloseMethod;
    if ((getCloseMethod = PrimitiveGrpc.getCloseMethod) == null) {
      synchronized (PrimitiveGrpc.class) {
        if ((getCloseMethod = PrimitiveGrpc.getCloseMethod) == null) {
          PrimitiveGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.PrimitiveOuterClass.CloseRequest, atomix.primitive.PrimitiveOuterClass.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.PrimitiveOuterClass.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.PrimitiveOuterClass.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.DeleteRequest,
      atomix.primitive.PrimitiveOuterClass.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = atomix.primitive.PrimitiveOuterClass.DeleteRequest.class,
      responseType = atomix.primitive.PrimitiveOuterClass.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.DeleteRequest,
      atomix.primitive.PrimitiveOuterClass.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.PrimitiveOuterClass.DeleteRequest, atomix.primitive.PrimitiveOuterClass.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = PrimitiveGrpc.getDeleteMethod) == null) {
      synchronized (PrimitiveGrpc.class) {
        if ((getDeleteMethod = PrimitiveGrpc.getDeleteMethod) == null) {
          PrimitiveGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.PrimitiveOuterClass.DeleteRequest, atomix.primitive.PrimitiveOuterClass.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.PrimitiveOuterClass.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.PrimitiveOuterClass.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimitiveStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimitiveStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimitiveStub>() {
        @java.lang.Override
        public PrimitiveStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimitiveStub(channel, callOptions);
        }
      };
    return PrimitiveStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimitiveBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimitiveBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimitiveBlockingStub>() {
        @java.lang.Override
        public PrimitiveBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimitiveBlockingStub(channel, callOptions);
        }
      };
    return PrimitiveBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimitiveFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimitiveFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimitiveFutureStub>() {
        @java.lang.Override
        public PrimitiveFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimitiveFutureStub(channel, callOptions);
        }
      };
    return PrimitiveFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Primitive is a service for managing primitive
   * </pre>
   */
  @java.lang.Deprecated
  public static abstract class PrimitiveImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a primitive
     * </pre>
     */
    public void create(atomix.primitive.PrimitiveOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.CreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a primitive
     * </pre>
     */
    public void close(atomix.primitive.PrimitiveOuterClass.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.CloseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a primitive
     * </pre>
     */
    public void delete(atomix.primitive.PrimitiveOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.PrimitiveOuterClass.CreateRequest,
                atomix.primitive.PrimitiveOuterClass.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.PrimitiveOuterClass.CloseRequest,
                atomix.primitive.PrimitiveOuterClass.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.PrimitiveOuterClass.DeleteRequest,
                atomix.primitive.PrimitiveOuterClass.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Primitive is a service for managing primitive
   * </pre>
   */
  @java.lang.Deprecated
  public static final class PrimitiveStub extends io.grpc.stub.AbstractAsyncStub<PrimitiveStub> {
    private PrimitiveStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimitiveStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimitiveStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a primitive
     * </pre>
     */
    public void create(atomix.primitive.PrimitiveOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.CreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a primitive
     * </pre>
     */
    public void close(atomix.primitive.PrimitiveOuterClass.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.CloseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes a primitive
     * </pre>
     */
    public void delete(atomix.primitive.PrimitiveOuterClass.DeleteRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Primitive is a service for managing primitive
   * </pre>
   */
  @java.lang.Deprecated
  public static final class PrimitiveBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrimitiveBlockingStub> {
    private PrimitiveBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimitiveBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimitiveBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a primitive
     * </pre>
     */
    public atomix.primitive.PrimitiveOuterClass.CreateResponse create(atomix.primitive.PrimitiveOuterClass.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a primitive
     * </pre>
     */
    public atomix.primitive.PrimitiveOuterClass.CloseResponse close(atomix.primitive.PrimitiveOuterClass.CloseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes a primitive
     * </pre>
     */
    public atomix.primitive.PrimitiveOuterClass.DeleteResponse delete(atomix.primitive.PrimitiveOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Primitive is a service for managing primitive
   * </pre>
   */
  @java.lang.Deprecated
  public static final class PrimitiveFutureStub extends io.grpc.stub.AbstractFutureStub<PrimitiveFutureStub> {
    private PrimitiveFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimitiveFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimitiveFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a primitive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.PrimitiveOuterClass.CreateResponse> create(
        atomix.primitive.PrimitiveOuterClass.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a primitive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.PrimitiveOuterClass.CloseResponse> close(
        atomix.primitive.PrimitiveOuterClass.CloseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes a primitive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.PrimitiveOuterClass.DeleteResponse> delete(
        atomix.primitive.PrimitiveOuterClass.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimitiveImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimitiveImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.primitive.PrimitiveOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.primitive.PrimitiveOuterClass.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.CloseResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((atomix.primitive.PrimitiveOuterClass.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.PrimitiveOuterClass.DeleteResponse>) responseObserver);
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

  private static abstract class PrimitiveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimitiveBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.PrimitiveOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Primitive");
    }
  }

  private static final class PrimitiveFileDescriptorSupplier
      extends PrimitiveBaseDescriptorSupplier {
    PrimitiveFileDescriptorSupplier() {}
  }

  private static final class PrimitiveMethodDescriptorSupplier
      extends PrimitiveBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimitiveMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimitiveGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimitiveFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
