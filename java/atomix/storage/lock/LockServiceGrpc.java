package atomix.storage.lock;

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
 * LockService implements a distributed lock
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/lock/lock.proto")
public final class LockServiceGrpc {

  private LockServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.lock.LockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.lock.Lock.CreateRequest,
      atomix.storage.lock.Lock.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.storage.lock.Lock.CreateRequest.class,
      responseType = atomix.storage.lock.Lock.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.lock.Lock.CreateRequest,
      atomix.storage.lock.Lock.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.lock.Lock.CreateRequest, atomix.storage.lock.Lock.CreateResponse> getCreateMethod;
    if ((getCreateMethod = LockServiceGrpc.getCreateMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getCreateMethod = LockServiceGrpc.getCreateMethod) == null) {
          LockServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.lock.Lock.CreateRequest, atomix.storage.lock.Lock.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.lock.Lock.CloseRequest,
      atomix.storage.lock.Lock.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.storage.lock.Lock.CloseRequest.class,
      responseType = atomix.storage.lock.Lock.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.lock.Lock.CloseRequest,
      atomix.storage.lock.Lock.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.storage.lock.Lock.CloseRequest, atomix.storage.lock.Lock.CloseResponse> getCloseMethod;
    if ((getCloseMethod = LockServiceGrpc.getCloseMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getCloseMethod = LockServiceGrpc.getCloseMethod) == null) {
          LockServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.storage.lock.Lock.CloseRequest, atomix.storage.lock.Lock.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.lock.Lock.LockRequest,
      atomix.storage.lock.Lock.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = atomix.storage.lock.Lock.LockRequest.class,
      responseType = atomix.storage.lock.Lock.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.lock.Lock.LockRequest,
      atomix.storage.lock.Lock.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<atomix.storage.lock.Lock.LockRequest, atomix.storage.lock.Lock.LockResponse> getLockMethod;
    if ((getLockMethod = LockServiceGrpc.getLockMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getLockMethod = LockServiceGrpc.getLockMethod) == null) {
          LockServiceGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<atomix.storage.lock.Lock.LockRequest, atomix.storage.lock.Lock.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.lock.Lock.UnlockRequest,
      atomix.storage.lock.Lock.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = atomix.storage.lock.Lock.UnlockRequest.class,
      responseType = atomix.storage.lock.Lock.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.lock.Lock.UnlockRequest,
      atomix.storage.lock.Lock.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<atomix.storage.lock.Lock.UnlockRequest, atomix.storage.lock.Lock.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = LockServiceGrpc.getUnlockMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getUnlockMethod = LockServiceGrpc.getUnlockMethod) == null) {
          LockServiceGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<atomix.storage.lock.Lock.UnlockRequest, atomix.storage.lock.Lock.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.lock.Lock.IsLockedRequest,
      atomix.storage.lock.Lock.IsLockedResponse> getIsLockedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsLocked",
      requestType = atomix.storage.lock.Lock.IsLockedRequest.class,
      responseType = atomix.storage.lock.Lock.IsLockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.lock.Lock.IsLockedRequest,
      atomix.storage.lock.Lock.IsLockedResponse> getIsLockedMethod() {
    io.grpc.MethodDescriptor<atomix.storage.lock.Lock.IsLockedRequest, atomix.storage.lock.Lock.IsLockedResponse> getIsLockedMethod;
    if ((getIsLockedMethod = LockServiceGrpc.getIsLockedMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getIsLockedMethod = LockServiceGrpc.getIsLockedMethod) == null) {
          LockServiceGrpc.getIsLockedMethod = getIsLockedMethod =
              io.grpc.MethodDescriptor.<atomix.storage.lock.Lock.IsLockedRequest, atomix.storage.lock.Lock.IsLockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsLocked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.IsLockedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.lock.Lock.IsLockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("IsLocked"))
              .build();
        }
      }
    }
    return getIsLockedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceStub>() {
        @java.lang.Override
        public LockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceStub(channel, callOptions);
        }
      };
    return LockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceBlockingStub>() {
        @java.lang.Override
        public LockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceBlockingStub(channel, callOptions);
        }
      };
    return LockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockServiceFutureStub>() {
        @java.lang.Override
        public LockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockServiceFutureStub(channel, callOptions);
        }
      };
    return LockServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LockService implements a distributed lock
   * </pre>
   */
  public static abstract class LockServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a lock
     * </pre>
     */
    public void create(atomix.storage.lock.Lock.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a lock
     * </pre>
     */
    public void close(atomix.storage.lock.Lock.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public void lock(atomix.storage.lock.Lock.LockRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.LockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public void unlock(atomix.storage.lock.Lock.UnlockRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.UnlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsLocked checks whether the lock is held
     * </pre>
     */
    public void isLocked(atomix.storage.lock.Lock.IsLockedRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.IsLockedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsLockedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.lock.Lock.CreateRequest,
                atomix.storage.lock.Lock.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.lock.Lock.CloseRequest,
                atomix.storage.lock.Lock.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.lock.Lock.LockRequest,
                atomix.storage.lock.Lock.LockResponse>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.lock.Lock.UnlockRequest,
                atomix.storage.lock.Lock.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .addMethod(
            getIsLockedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.lock.Lock.IsLockedRequest,
                atomix.storage.lock.Lock.IsLockedResponse>(
                  this, METHODID_IS_LOCKED)))
          .build();
    }
  }

  /**
   * <pre>
   * LockService implements a distributed lock
   * </pre>
   */
  public static final class LockServiceStub extends io.grpc.stub.AbstractAsyncStub<LockServiceStub> {
    private LockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a lock
     * </pre>
     */
    public void create(atomix.storage.lock.Lock.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a lock
     * </pre>
     */
    public void close(atomix.storage.lock.Lock.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public void lock(atomix.storage.lock.Lock.LockRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.LockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public void unlock(atomix.storage.lock.Lock.UnlockRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.UnlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsLocked checks whether the lock is held
     * </pre>
     */
    public void isLocked(atomix.storage.lock.Lock.IsLockedRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.IsLockedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsLockedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LockService implements a distributed lock
   * </pre>
   */
  public static final class LockServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LockServiceBlockingStub> {
    private LockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a lock
     * </pre>
     */
    public atomix.storage.lock.Lock.CreateResponse create(atomix.storage.lock.Lock.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a lock
     * </pre>
     */
    public atomix.storage.lock.Lock.CloseResponse close(atomix.storage.lock.Lock.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public atomix.storage.lock.Lock.LockResponse lock(atomix.storage.lock.Lock.LockRequest request) {
      return blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public atomix.storage.lock.Lock.UnlockResponse unlock(atomix.storage.lock.Lock.UnlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsLocked checks whether the lock is held
     * </pre>
     */
    public atomix.storage.lock.Lock.IsLockedResponse isLocked(atomix.storage.lock.Lock.IsLockedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsLockedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LockService implements a distributed lock
   * </pre>
   */
  public static final class LockServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LockServiceFutureStub> {
    private LockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.lock.Lock.CreateResponse> create(
        atomix.storage.lock.Lock.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.lock.Lock.CloseResponse> close(
        atomix.storage.lock.Lock.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.lock.Lock.LockResponse> lock(
        atomix.storage.lock.Lock.LockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.lock.Lock.UnlockResponse> unlock(
        atomix.storage.lock.Lock.UnlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsLocked checks whether the lock is held
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.lock.Lock.IsLockedResponse> isLocked(
        atomix.storage.lock.Lock.IsLockedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsLockedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_LOCK = 2;
  private static final int METHODID_UNLOCK = 3;
  private static final int METHODID_IS_LOCKED = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.storage.lock.Lock.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.storage.lock.Lock.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.CloseResponse>) responseObserver);
          break;
        case METHODID_LOCK:
          serviceImpl.lock((atomix.storage.lock.Lock.LockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((atomix.storage.lock.Lock.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.UnlockResponse>) responseObserver);
          break;
        case METHODID_IS_LOCKED:
          serviceImpl.isLocked((atomix.storage.lock.Lock.IsLockedRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.lock.Lock.IsLockedResponse>) responseObserver);
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

  private static abstract class LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.storage.lock.Lock.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LockService");
    }
  }

  private static final class LockServiceFileDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier {
    LockServiceFileDescriptorSupplier() {}
  }

  private static final class LockServiceMethodDescriptorSupplier
      extends LockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getLockMethod())
              .addMethod(getUnlockMethod())
              .addMethod(getIsLockedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
