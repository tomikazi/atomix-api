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
 * Atomix storage service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/storage.proto")
public final class StorageServiceGrpc {

  private StorageServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.StorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.Storage.AddReplicaRequest,
      atomix.storage.Storage.AddReplicaResponse> getAddReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddReplica",
      requestType = atomix.storage.Storage.AddReplicaRequest.class,
      responseType = atomix.storage.Storage.AddReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.Storage.AddReplicaRequest,
      atomix.storage.Storage.AddReplicaResponse> getAddReplicaMethod() {
    io.grpc.MethodDescriptor<atomix.storage.Storage.AddReplicaRequest, atomix.storage.Storage.AddReplicaResponse> getAddReplicaMethod;
    if ((getAddReplicaMethod = StorageServiceGrpc.getAddReplicaMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getAddReplicaMethod = StorageServiceGrpc.getAddReplicaMethod) == null) {
          StorageServiceGrpc.getAddReplicaMethod = getAddReplicaMethod =
              io.grpc.MethodDescriptor.<atomix.storage.Storage.AddReplicaRequest, atomix.storage.Storage.AddReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Storage.AddReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Storage.AddReplicaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("AddReplica"))
              .build();
        }
      }
    }
    return getAddReplicaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.Storage.RemoveReplicaRequest,
      atomix.storage.Storage.RemoveReplicaResponse> getRemoveReplicaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveReplica",
      requestType = atomix.storage.Storage.RemoveReplicaRequest.class,
      responseType = atomix.storage.Storage.RemoveReplicaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.Storage.RemoveReplicaRequest,
      atomix.storage.Storage.RemoveReplicaResponse> getRemoveReplicaMethod() {
    io.grpc.MethodDescriptor<atomix.storage.Storage.RemoveReplicaRequest, atomix.storage.Storage.RemoveReplicaResponse> getRemoveReplicaMethod;
    if ((getRemoveReplicaMethod = StorageServiceGrpc.getRemoveReplicaMethod) == null) {
      synchronized (StorageServiceGrpc.class) {
        if ((getRemoveReplicaMethod = StorageServiceGrpc.getRemoveReplicaMethod) == null) {
          StorageServiceGrpc.getRemoveReplicaMethod = getRemoveReplicaMethod =
              io.grpc.MethodDescriptor.<atomix.storage.Storage.RemoveReplicaRequest, atomix.storage.Storage.RemoveReplicaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveReplica"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Storage.RemoveReplicaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.Storage.RemoveReplicaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorageServiceMethodDescriptorSupplier("RemoveReplica"))
              .build();
        }
      }
    }
    return getRemoveReplicaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceStub>() {
        @java.lang.Override
        public StorageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceStub(channel, callOptions);
        }
      };
    return StorageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceBlockingStub>() {
        @java.lang.Override
        public StorageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceBlockingStub(channel, callOptions);
        }
      };
    return StorageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorageServiceFutureStub>() {
        @java.lang.Override
        public StorageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorageServiceFutureStub(channel, callOptions);
        }
      };
    return StorageServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Atomix storage service
   * </pre>
   */
  public static abstract class StorageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * AddReplica adds a replica to the storage
     * </pre>
     */
    public void addReplica(atomix.storage.Storage.AddReplicaRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Storage.AddReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddReplicaMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveReplica removes a replica from the storage
     * </pre>
     */
    public void removeReplica(atomix.storage.Storage.RemoveReplicaRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Storage.RemoveReplicaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveReplicaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.Storage.AddReplicaRequest,
                atomix.storage.Storage.AddReplicaResponse>(
                  this, METHODID_ADD_REPLICA)))
          .addMethod(
            getRemoveReplicaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.Storage.RemoveReplicaRequest,
                atomix.storage.Storage.RemoveReplicaResponse>(
                  this, METHODID_REMOVE_REPLICA)))
          .build();
    }
  }

  /**
   * <pre>
   * Atomix storage service
   * </pre>
   */
  public static final class StorageServiceStub extends io.grpc.stub.AbstractAsyncStub<StorageServiceStub> {
    private StorageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddReplica adds a replica to the storage
     * </pre>
     */
    public void addReplica(atomix.storage.Storage.AddReplicaRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Storage.AddReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddReplicaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveReplica removes a replica from the storage
     * </pre>
     */
    public void removeReplica(atomix.storage.Storage.RemoveReplicaRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.Storage.RemoveReplicaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveReplicaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Atomix storage service
   * </pre>
   */
  public static final class StorageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StorageServiceBlockingStub> {
    private StorageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddReplica adds a replica to the storage
     * </pre>
     */
    public atomix.storage.Storage.AddReplicaResponse addReplica(atomix.storage.Storage.AddReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddReplicaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveReplica removes a replica from the storage
     * </pre>
     */
    public atomix.storage.Storage.RemoveReplicaResponse removeReplica(atomix.storage.Storage.RemoveReplicaRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveReplicaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Atomix storage service
   * </pre>
   */
  public static final class StorageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StorageServiceFutureStub> {
    private StorageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AddReplica adds a replica to the storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.Storage.AddReplicaResponse> addReplica(
        atomix.storage.Storage.AddReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddReplicaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveReplica removes a replica from the storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.Storage.RemoveReplicaResponse> removeReplica(
        atomix.storage.Storage.RemoveReplicaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveReplicaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_REPLICA = 0;
  private static final int METHODID_REMOVE_REPLICA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_REPLICA:
          serviceImpl.addReplica((atomix.storage.Storage.AddReplicaRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.Storage.AddReplicaResponse>) responseObserver);
          break;
        case METHODID_REMOVE_REPLICA:
          serviceImpl.removeReplica((atomix.storage.Storage.RemoveReplicaRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.Storage.RemoveReplicaResponse>) responseObserver);
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

  private static abstract class StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.storage.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageService");
    }
  }

  private static final class StorageServiceFileDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier {
    StorageServiceFileDescriptorSupplier() {}
  }

  private static final class StorageServiceMethodDescriptorSupplier
      extends StorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageServiceFileDescriptorSupplier())
              .addMethod(getAddReplicaMethod())
              .addMethod(getRemoveReplicaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
