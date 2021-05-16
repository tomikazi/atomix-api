package atomix.primitive.lock;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LockService implements a distributed lock
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/lock/lock.proto")
public final class LockServiceGrpc {

  private LockServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.lock.LockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.LockRequest,
      atomix.primitive.lock.LockOuterClass.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = atomix.primitive.lock.LockOuterClass.LockRequest.class,
      responseType = atomix.primitive.lock.LockOuterClass.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.LockRequest,
      atomix.primitive.lock.LockOuterClass.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.LockRequest, atomix.primitive.lock.LockOuterClass.LockResponse> getLockMethod;
    if ((getLockMethod = LockServiceGrpc.getLockMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getLockMethod = LockServiceGrpc.getLockMethod) == null) {
          LockServiceGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.LockOuterClass.LockRequest, atomix.primitive.lock.LockOuterClass.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.LockOuterClass.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.LockOuterClass.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.UnlockRequest,
      atomix.primitive.lock.LockOuterClass.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = atomix.primitive.lock.LockOuterClass.UnlockRequest.class,
      responseType = atomix.primitive.lock.LockOuterClass.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.UnlockRequest,
      atomix.primitive.lock.LockOuterClass.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.UnlockRequest, atomix.primitive.lock.LockOuterClass.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = LockServiceGrpc.getUnlockMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getUnlockMethod = LockServiceGrpc.getUnlockMethod) == null) {
          LockServiceGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.LockOuterClass.UnlockRequest, atomix.primitive.lock.LockOuterClass.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.LockOuterClass.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.LockOuterClass.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.GetLockRequest,
      atomix.primitive.lock.LockOuterClass.GetLockResponse> getGetLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLock",
      requestType = atomix.primitive.lock.LockOuterClass.GetLockRequest.class,
      responseType = atomix.primitive.lock.LockOuterClass.GetLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.GetLockRequest,
      atomix.primitive.lock.LockOuterClass.GetLockResponse> getGetLockMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.lock.LockOuterClass.GetLockRequest, atomix.primitive.lock.LockOuterClass.GetLockResponse> getGetLockMethod;
    if ((getGetLockMethod = LockServiceGrpc.getGetLockMethod) == null) {
      synchronized (LockServiceGrpc.class) {
        if ((getGetLockMethod = LockServiceGrpc.getGetLockMethod) == null) {
          LockServiceGrpc.getGetLockMethod = getGetLockMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.lock.LockOuterClass.GetLockRequest, atomix.primitive.lock.LockOuterClass.GetLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.LockOuterClass.GetLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.lock.LockOuterClass.GetLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LockServiceMethodDescriptorSupplier("GetLock"))
              .build();
        }
      }
    }
    return getGetLockMethod;
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
     * Lock attempts to acquire the lock
     * </pre>
     */
    public void lock(atomix.primitive.lock.LockOuterClass.LockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.LockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public void unlock(atomix.primitive.lock.LockOuterClass.UnlockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.UnlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public void getLock(atomix.primitive.lock.LockOuterClass.GetLockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.GetLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.LockOuterClass.LockRequest,
                atomix.primitive.lock.LockOuterClass.LockResponse>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.LockOuterClass.UnlockRequest,
                atomix.primitive.lock.LockOuterClass.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .addMethod(
            getGetLockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.lock.LockOuterClass.GetLockRequest,
                atomix.primitive.lock.LockOuterClass.GetLockResponse>(
                  this, METHODID_GET_LOCK)))
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
     * Lock attempts to acquire the lock
     * </pre>
     */
    public void lock(atomix.primitive.lock.LockOuterClass.LockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.LockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public void unlock(atomix.primitive.lock.LockOuterClass.UnlockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.UnlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public void getLock(atomix.primitive.lock.LockOuterClass.GetLockRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.GetLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLockMethod(), getCallOptions()), request, responseObserver);
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
     * Lock attempts to acquire the lock
     * </pre>
     */
    public atomix.primitive.lock.LockOuterClass.LockResponse lock(atomix.primitive.lock.LockOuterClass.LockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public atomix.primitive.lock.LockOuterClass.UnlockResponse unlock(atomix.primitive.lock.LockOuterClass.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public atomix.primitive.lock.LockOuterClass.GetLockResponse getLock(atomix.primitive.lock.LockOuterClass.GetLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLockMethod(), getCallOptions(), request);
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
     * Lock attempts to acquire the lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.LockOuterClass.LockResponse> lock(
        atomix.primitive.lock.LockOuterClass.LockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unlock releases the lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.LockOuterClass.UnlockResponse> unlock(
        atomix.primitive.lock.LockOuterClass.UnlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLock gets the lock state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.lock.LockOuterClass.GetLockResponse> getLock(
        atomix.primitive.lock.LockOuterClass.GetLockRequest request) {
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
        case METHODID_LOCK:
          serviceImpl.lock((atomix.primitive.lock.LockOuterClass.LockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((atomix.primitive.lock.LockOuterClass.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.UnlockResponse>) responseObserver);
          break;
        case METHODID_GET_LOCK:
          serviceImpl.getLock((atomix.primitive.lock.LockOuterClass.GetLockRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.lock.LockOuterClass.GetLockResponse>) responseObserver);
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
      return atomix.primitive.lock.LockOuterClass.getDescriptor();
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
