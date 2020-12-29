package atomix.storage;

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
 * PrimitiveService is a service for providing partition/primitive metadata
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/metadata.proto")
public final class PrimitiveServiceGrpc {

  private PrimitiveServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.PrimitiveService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.Metadata.CreatePrimitiveRequest,
      atomix.storage.Metadata.CreatePrimitiveResponse> getCreatePrimitiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePrimitive",
      requestType = atomix.storage.Metadata.CreatePrimitiveRequest.class,
      responseType = atomix.storage.Metadata.CreatePrimitiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.Metadata.CreatePrimitiveRequest,
      atomix.storage.Metadata.CreatePrimitiveResponse> getCreatePrimitiveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.Metadata.CreatePrimitiveRequest, atomix.storage.Metadata.CreatePrimitiveResponse> getCreatePrimitiveMethod;
    if ((getCreatePrimitiveMethod = PrimitiveServiceGrpc.getCreatePrimitiveMethod) == null) {
      synchronized (PrimitiveServiceGrpc.class) {
        if ((getCreatePrimitiveMethod = PrimitiveServiceGrpc.getCreatePrimitiveMethod) == null) {
          PrimitiveServiceGrpc.getCreatePrimitiveMethod = getCreatePrimitiveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.Metadata.CreatePrimitiveRequest, atomix.storage.Metadata.CreatePrimitiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePrimitive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.CreatePrimitiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.CreatePrimitiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveServiceMethodDescriptorSupplier("CreatePrimitive"))
              .build();
        }
      }
    }
    return getCreatePrimitiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.Metadata.GetPrimitiveRequest,
      atomix.storage.Metadata.GetPrimitiveResponse> getGetPrimitiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrimitive",
      requestType = atomix.storage.Metadata.GetPrimitiveRequest.class,
      responseType = atomix.storage.Metadata.GetPrimitiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.Metadata.GetPrimitiveRequest,
      atomix.storage.Metadata.GetPrimitiveResponse> getGetPrimitiveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.Metadata.GetPrimitiveRequest, atomix.storage.Metadata.GetPrimitiveResponse> getGetPrimitiveMethod;
    if ((getGetPrimitiveMethod = PrimitiveServiceGrpc.getGetPrimitiveMethod) == null) {
      synchronized (PrimitiveServiceGrpc.class) {
        if ((getGetPrimitiveMethod = PrimitiveServiceGrpc.getGetPrimitiveMethod) == null) {
          PrimitiveServiceGrpc.getGetPrimitiveMethod = getGetPrimitiveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.Metadata.GetPrimitiveRequest, atomix.storage.Metadata.GetPrimitiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrimitive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.GetPrimitiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.GetPrimitiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveServiceMethodDescriptorSupplier("GetPrimitive"))
              .build();
        }
      }
    }
    return getGetPrimitiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.Metadata.GetPrimitivesRequest,
      atomix.storage.Metadata.GetPrimitivesResponse> getGetPrimitivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrimitives",
      requestType = atomix.storage.Metadata.GetPrimitivesRequest.class,
      responseType = atomix.storage.Metadata.GetPrimitivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.Metadata.GetPrimitivesRequest,
      atomix.storage.Metadata.GetPrimitivesResponse> getGetPrimitivesMethod() {
    io.grpc.MethodDescriptor<atomix.storage.Metadata.GetPrimitivesRequest, atomix.storage.Metadata.GetPrimitivesResponse> getGetPrimitivesMethod;
    if ((getGetPrimitivesMethod = PrimitiveServiceGrpc.getGetPrimitivesMethod) == null) {
      synchronized (PrimitiveServiceGrpc.class) {
        if ((getGetPrimitivesMethod = PrimitiveServiceGrpc.getGetPrimitivesMethod) == null) {
          PrimitiveServiceGrpc.getGetPrimitivesMethod = getGetPrimitivesMethod =
              io.grpc.MethodDescriptor.<atomix.storage.Metadata.GetPrimitivesRequest, atomix.storage.Metadata.GetPrimitivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrimitives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.GetPrimitivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.GetPrimitivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveServiceMethodDescriptorSupplier("GetPrimitives"))
              .build();
        }
      }
    }
    return getGetPrimitivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.Metadata.DeletePrimitiveRequest,
      atomix.storage.Metadata.DeletePrimitiveResponse> getDeletePrimitiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePrimitive",
      requestType = atomix.storage.Metadata.DeletePrimitiveRequest.class,
      responseType = atomix.storage.Metadata.DeletePrimitiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.Metadata.DeletePrimitiveRequest,
      atomix.storage.Metadata.DeletePrimitiveResponse> getDeletePrimitiveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.Metadata.DeletePrimitiveRequest, atomix.storage.Metadata.DeletePrimitiveResponse> getDeletePrimitiveMethod;
    if ((getDeletePrimitiveMethod = PrimitiveServiceGrpc.getDeletePrimitiveMethod) == null) {
      synchronized (PrimitiveServiceGrpc.class) {
        if ((getDeletePrimitiveMethod = PrimitiveServiceGrpc.getDeletePrimitiveMethod) == null) {
          PrimitiveServiceGrpc.getDeletePrimitiveMethod = getDeletePrimitiveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.Metadata.DeletePrimitiveRequest, atomix.storage.Metadata.DeletePrimitiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePrimitive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.DeletePrimitiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Metadata.DeletePrimitiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimitiveServiceMethodDescriptorSupplier("DeletePrimitive"))
              .build();
        }
      }
    }
    return getDeletePrimitiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimitiveServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimitiveServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimitiveServiceStub>() {
        @java.lang.Override
        public PrimitiveServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimitiveServiceStub(channel, callOptions);
        }
      };
    return PrimitiveServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimitiveServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimitiveServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimitiveServiceBlockingStub>() {
        @java.lang.Override
        public PrimitiveServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimitiveServiceBlockingStub(channel, callOptions);
        }
      };
    return PrimitiveServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimitiveServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimitiveServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimitiveServiceFutureStub>() {
        @java.lang.Override
        public PrimitiveServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimitiveServiceFutureStub(channel, callOptions);
        }
      };
    return PrimitiveServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PrimitiveService is a service for providing partition/primitive metadata
   * </pre>
   */
  public static abstract class PrimitiveServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreatePrimitive creates a new primitive
     * </pre>
     */
    public void createPrimitive(atomix.storage.Metadata.CreatePrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.CreatePrimitiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePrimitiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPrimitive returns a primitive in the system
     * </pre>
     */
    public void getPrimitive(atomix.storage.Metadata.GetPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.GetPrimitiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrimitiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPrimitives returns a list of primitives in the system
     * </pre>
     */
    public void getPrimitives(atomix.storage.Metadata.GetPrimitivesRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.GetPrimitivesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPrimitivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePrimitive deletes a primitive
     * </pre>
     */
    public void deletePrimitive(atomix.storage.Metadata.DeletePrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.DeletePrimitiveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePrimitiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePrimitiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.Metadata.CreatePrimitiveRequest,
                atomix.storage.Metadata.CreatePrimitiveResponse>(
                  this, METHODID_CREATE_PRIMITIVE)))
          .addMethod(
            getGetPrimitiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.Metadata.GetPrimitiveRequest,
                atomix.storage.Metadata.GetPrimitiveResponse>(
                  this, METHODID_GET_PRIMITIVE)))
          .addMethod(
            getGetPrimitivesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.Metadata.GetPrimitivesRequest,
                atomix.storage.Metadata.GetPrimitivesResponse>(
                  this, METHODID_GET_PRIMITIVES)))
          .addMethod(
            getDeletePrimitiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.Metadata.DeletePrimitiveRequest,
                atomix.storage.Metadata.DeletePrimitiveResponse>(
                  this, METHODID_DELETE_PRIMITIVE)))
          .build();
    }
  }

  /**
   * <pre>
   * PrimitiveService is a service for providing partition/primitive metadata
   * </pre>
   */
  public static final class PrimitiveServiceStub extends io.grpc.stub.AbstractAsyncStub<PrimitiveServiceStub> {
    private PrimitiveServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimitiveServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimitiveServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatePrimitive creates a new primitive
     * </pre>
     */
    public void createPrimitive(atomix.storage.Metadata.CreatePrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.CreatePrimitiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePrimitiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPrimitive returns a primitive in the system
     * </pre>
     */
    public void getPrimitive(atomix.storage.Metadata.GetPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.GetPrimitiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPrimitiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPrimitives returns a list of primitives in the system
     * </pre>
     */
    public void getPrimitives(atomix.storage.Metadata.GetPrimitivesRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.GetPrimitivesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPrimitivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePrimitive deletes a primitive
     * </pre>
     */
    public void deletePrimitive(atomix.storage.Metadata.DeletePrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Metadata.DeletePrimitiveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePrimitiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PrimitiveService is a service for providing partition/primitive metadata
   * </pre>
   */
  public static final class PrimitiveServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrimitiveServiceBlockingStub> {
    private PrimitiveServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimitiveServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimitiveServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatePrimitive creates a new primitive
     * </pre>
     */
    public atomix.storage.Metadata.CreatePrimitiveResponse createPrimitive(atomix.storage.Metadata.CreatePrimitiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePrimitiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPrimitive returns a primitive in the system
     * </pre>
     */
    public atomix.storage.Metadata.GetPrimitiveResponse getPrimitive(atomix.storage.Metadata.GetPrimitiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPrimitiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPrimitives returns a list of primitives in the system
     * </pre>
     */
    public atomix.storage.Metadata.GetPrimitivesResponse getPrimitives(atomix.storage.Metadata.GetPrimitivesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPrimitivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePrimitive deletes a primitive
     * </pre>
     */
    public atomix.storage.Metadata.DeletePrimitiveResponse deletePrimitive(atomix.storage.Metadata.DeletePrimitiveRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePrimitiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PrimitiveService is a service for providing partition/primitive metadata
   * </pre>
   */
  public static final class PrimitiveServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrimitiveServiceFutureStub> {
    private PrimitiveServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimitiveServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimitiveServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreatePrimitive creates a new primitive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.Metadata.CreatePrimitiveResponse> createPrimitive(
        atomix.storage.Metadata.CreatePrimitiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePrimitiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPrimitive returns a primitive in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.Metadata.GetPrimitiveResponse> getPrimitive(
        atomix.storage.Metadata.GetPrimitiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPrimitiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPrimitives returns a list of primitives in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.Metadata.GetPrimitivesResponse> getPrimitives(
        atomix.storage.Metadata.GetPrimitivesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPrimitivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePrimitive deletes a primitive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.Metadata.DeletePrimitiveResponse> deletePrimitive(
        atomix.storage.Metadata.DeletePrimitiveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePrimitiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRIMITIVE = 0;
  private static final int METHODID_GET_PRIMITIVE = 1;
  private static final int METHODID_GET_PRIMITIVES = 2;
  private static final int METHODID_DELETE_PRIMITIVE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimitiveServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimitiveServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRIMITIVE:
          serviceImpl.createPrimitive((atomix.storage.Metadata.CreatePrimitiveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.Metadata.CreatePrimitiveResponse>) responseObserver);
          break;
        case METHODID_GET_PRIMITIVE:
          serviceImpl.getPrimitive((atomix.storage.Metadata.GetPrimitiveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.Metadata.GetPrimitiveResponse>) responseObserver);
          break;
        case METHODID_GET_PRIMITIVES:
          serviceImpl.getPrimitives((atomix.storage.Metadata.GetPrimitivesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.Metadata.GetPrimitivesResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRIMITIVE:
          serviceImpl.deletePrimitive((atomix.storage.Metadata.DeletePrimitiveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.Metadata.DeletePrimitiveResponse>) responseObserver);
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

  private static abstract class PrimitiveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimitiveServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.storage.Metadata.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimitiveService");
    }
  }

  private static final class PrimitiveServiceFileDescriptorSupplier
      extends PrimitiveServiceBaseDescriptorSupplier {
    PrimitiveServiceFileDescriptorSupplier() {}
  }

  private static final class PrimitiveServiceMethodDescriptorSupplier
      extends PrimitiveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimitiveServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimitiveServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimitiveServiceFileDescriptorSupplier())
              .addMethod(getCreatePrimitiveMethod())
              .addMethod(getGetPrimitiveMethod())
              .addMethod(getGetPrimitivesMethod())
              .addMethod(getDeletePrimitiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
