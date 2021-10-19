package atomix.primitive.lock.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Lock is a service for a lock primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/lock/v1/primitive.proto")
public final class LockGrpc {

  private LockGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.lock.v1.Lock";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.LockRequest,
      atomix.primitive.lock.v1.Primitive.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = atomix.primitive.lock.v1.Primitive.LockRequest.class,
      responseType = atomix.primitive.lock.v1.Primitive.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.LockRequest,
      atomix.primitive.lock.v1.Primitive.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.LockRequest, atomix.primitive.lock.v1.Primitive.LockResponse> getLockMethod;
    if ((getLockMethod = LockGrpc.getLockMethod) == null) {
      synchronized (LockGrpc.class) {
        if ((getLockMethod = LockGrpc.getLockMethod) == null) {
          LockGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.v1.Primitive.LockRequest, atomix.primitive.lock.v1.Primitive.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Primitive.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Primitive.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.UnlockRequest,
      atomix.primitive.lock.v1.Primitive.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = atomix.primitive.lock.v1.Primitive.UnlockRequest.class,
      responseType = atomix.primitive.lock.v1.Primitive.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.UnlockRequest,
      atomix.primitive.lock.v1.Primitive.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.UnlockRequest, atomix.primitive.lock.v1.Primitive.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = LockGrpc.getUnlockMethod) == null) {
      synchronized (LockGrpc.class) {
        if ((getUnlockMethod = LockGrpc.getUnlockMethod) == null) {
          LockGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.v1.Primitive.UnlockRequest, atomix.primitive.lock.v1.Primitive.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Primitive.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Primitive.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.GetLockRequest,
      atomix.primitive.lock.v1.Primitive.GetLockResponse> getGetLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLock",
      requestType = atomix.primitive.lock.v1.Primitive.GetLockRequest.class,
      responseType = atomix.primitive.lock.v1.Primitive.GetLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.GetLockRequest,
      atomix.primitive.lock.v1.Primitive.GetLockResponse> getGetLockMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.v1.Primitive.GetLockRequest, atomix.primitive.lock.v1.Primitive.GetLockResponse> getGetLockMethod;
    if ((getGetLockMethod = LockGrpc.getGetLockMethod) == null) {
      synchronized (LockGrpc.class) {
        if ((getGetLockMethod = LockGrpc.getGetLockMethod) == null) {
          LockGrpc.getGetLockMethod = getGetLockMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.v1.Primitive.GetLockRequest, atomix.primitive.lock.v1.Primitive.GetLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Primitive.GetLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.v1.Primitive.GetLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockMethodDescriptorSupplier("GetLock"))
              .build();
        }
      }
    }
    return getGetLockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LockStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockStub>() {
        @java.lang.Override
        public LockStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockStub(channel, callOptions);
        }
      };
    return LockStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockBlockingStub>() {
        @java.lang.Override
        public LockBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockBlockingStub(channel, callOptions);
        }
      };
    return LockBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LockFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LockFutureStub>() {
        @java.lang.Override
        public LockFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LockFutureStub(channel, callOptions);
        }
      };
    return LockFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Lock is a service for a lock primitive
   * </pre>
   */
  public static abstract class LockImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public void lock(atomix.primitive.lock.v1.Primitive.LockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.LockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public void unlock(atomix.primitive.lock.v1.Primitive.UnlockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.UnlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public void getLock(atomix.primitive.lock.v1.Primitive.GetLockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.GetLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.v1.Primitive.LockRequest,
                atomix.primitive.lock.v1.Primitive.LockResponse>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.v1.Primitive.UnlockRequest,
                atomix.primitive.lock.v1.Primitive.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .addMethod(
            getGetLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.v1.Primitive.GetLockRequest,
                atomix.primitive.lock.v1.Primitive.GetLockResponse>(
                  this, METHODID_GET_LOCK)))
          .build();
    }
  }

  /**
   * <pre>
   * Lock is a service for a lock primitive
   * </pre>
   */
  public static final class LockStub extends io.grpc.stub.AbstractAsyncStub<LockStub> {
    private LockStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public void lock(atomix.primitive.lock.v1.Primitive.LockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.LockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public void unlock(atomix.primitive.lock.v1.Primitive.UnlockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.UnlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public void getLock(atomix.primitive.lock.v1.Primitive.GetLockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.GetLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Lock is a service for a lock primitive
   * </pre>
   */
  public static final class LockBlockingStub extends io.grpc.stub.AbstractBlockingStub<LockBlockingStub> {
    private LockBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public atomix.primitive.lock.v1.Primitive.LockResponse lock(atomix.primitive.lock.v1.Primitive.LockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public atomix.primitive.lock.v1.Primitive.UnlockResponse unlock(atomix.primitive.lock.v1.Primitive.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public atomix.primitive.lock.v1.Primitive.GetLockResponse getLock(atomix.primitive.lock.v1.Primitive.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLockMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Lock is a service for a lock primitive
   * </pre>
   */
  public static final class LockFutureStub extends io.grpc.stub.AbstractFutureStub<LockFutureStub> {
    private LockFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LockFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LockFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lock attempts to acquire the lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.v1.Primitive.LockResponse> lock(
        atomix.primitive.lock.v1.Primitive.LockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.v1.Primitive.UnlockResponse> unlock(
        atomix.primitive.lock.v1.Primitive.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.v1.Primitive.GetLockResponse> getLock(
        atomix.primitive.lock.v1.Primitive.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOCK = 0;
  private static final int METHODID_UNLOCK = 1;
  private static final int METHODID_GET_LOCK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LockImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LockImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOCK:
          serviceImpl.lock((atomix.primitive.lock.v1.Primitive.LockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((atomix.primitive.lock.v1.Primitive.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.UnlockResponse>) responseObserver);
          break;
        case METHODID_GET_LOCK:
          serviceImpl.getLock((atomix.primitive.lock.v1.Primitive.GetLockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.v1.Primitive.GetLockResponse>) responseObserver);
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

  private static abstract class LockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.lock.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lock");
    }
  }

  private static final class LockFileDescriptorSupplier
      extends LockBaseDescriptorSupplier {
    LockFileDescriptorSupplier() {}
  }

  private static final class LockMethodDescriptorSupplier
      extends LockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LockMethodDescriptorSupplier(String methodName) {
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
      synchronized (LockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LockFileDescriptorSupplier())
              .addMethod(getLockMethod())
              .addMethod(getUnlockMethod())
              .addMethod(getGetLockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
