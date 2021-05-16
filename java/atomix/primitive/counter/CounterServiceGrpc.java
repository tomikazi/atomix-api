package atomix.primitive.counter;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CounterService implements a distributed counter
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/counter/counter.proto")
public final class CounterServiceGrpc {

  private CounterServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.counter.CounterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.SetRequest,
      atomix.primitive.counter.Counter.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.primitive.counter.Counter.SetRequest.class,
      responseType = atomix.primitive.counter.Counter.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.SetRequest,
      atomix.primitive.counter.Counter.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.SetRequest, atomix.primitive.counter.Counter.SetResponse> getSetMethod;
    if ((getSetMethod = CounterServiceGrpc.getSetMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getSetMethod = CounterServiceGrpc.getSetMethod) == null) {
          CounterServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.Counter.SetRequest, atomix.primitive.counter.Counter.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.GetRequest,
      atomix.primitive.counter.Counter.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.counter.Counter.GetRequest.class,
      responseType = atomix.primitive.counter.Counter.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.GetRequest,
      atomix.primitive.counter.Counter.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.GetRequest, atomix.primitive.counter.Counter.GetResponse> getGetMethod;
    if ((getGetMethod = CounterServiceGrpc.getGetMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getGetMethod = CounterServiceGrpc.getGetMethod) == null) {
          CounterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.Counter.GetRequest, atomix.primitive.counter.Counter.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.IncrementRequest,
      atomix.primitive.counter.Counter.IncrementResponse> getIncrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Increment",
      requestType = atomix.primitive.counter.Counter.IncrementRequest.class,
      responseType = atomix.primitive.counter.Counter.IncrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.IncrementRequest,
      atomix.primitive.counter.Counter.IncrementResponse> getIncrementMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.IncrementRequest, atomix.primitive.counter.Counter.IncrementResponse> getIncrementMethod;
    if ((getIncrementMethod = CounterServiceGrpc.getIncrementMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getIncrementMethod = CounterServiceGrpc.getIncrementMethod) == null) {
          CounterServiceGrpc.getIncrementMethod = getIncrementMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.Counter.IncrementRequest, atomix.primitive.counter.Counter.IncrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.IncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.IncrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Increment"))
              .build();
        }
      }
    }
    return getIncrementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.DecrementRequest,
      atomix.primitive.counter.Counter.DecrementResponse> getDecrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrement",
      requestType = atomix.primitive.counter.Counter.DecrementRequest.class,
      responseType = atomix.primitive.counter.Counter.DecrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.DecrementRequest,
      atomix.primitive.counter.Counter.DecrementResponse> getDecrementMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.Counter.DecrementRequest, atomix.primitive.counter.Counter.DecrementResponse> getDecrementMethod;
    if ((getDecrementMethod = CounterServiceGrpc.getDecrementMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getDecrementMethod = CounterServiceGrpc.getDecrementMethod) == null) {
          CounterServiceGrpc.getDecrementMethod = getDecrementMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.Counter.DecrementRequest, atomix.primitive.counter.Counter.DecrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.DecrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.Counter.DecrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Decrement"))
              .build();
        }
      }
    }
    return getDecrementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterServiceStub>() {
        @java.lang.Override
        public CounterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterServiceStub(channel, callOptions);
        }
      };
    return CounterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterServiceBlockingStub>() {
        @java.lang.Override
        public CounterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterServiceBlockingStub(channel, callOptions);
        }
      };
    return CounterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterServiceFutureStub>() {
        @java.lang.Override
        public CounterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterServiceFutureStub(channel, callOptions);
        }
      };
    return CounterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CounterService implements a distributed counter
   * </pre>
   */
  public static abstract class CounterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public void set(atomix.primitive.counter.Counter.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public void get(atomix.primitive.counter.Counter.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public void increment(atomix.primitive.counter.Counter.IncrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.IncrementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncrementMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public void decrement(atomix.primitive.counter.Counter.DecrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.DecrementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecrementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.Counter.SetRequest,
                atomix.primitive.counter.Counter.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.Counter.GetRequest,
                atomix.primitive.counter.Counter.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getIncrementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.Counter.IncrementRequest,
                atomix.primitive.counter.Counter.IncrementResponse>(
                  this, METHODID_INCREMENT)))
          .addMethod(
            getDecrementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.Counter.DecrementRequest,
                atomix.primitive.counter.Counter.DecrementResponse>(
                  this, METHODID_DECREMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * CounterService implements a distributed counter
   * </pre>
   */
  public static final class CounterServiceStub extends io.grpc.stub.AbstractAsyncStub<CounterServiceStub> {
    private CounterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public void set(atomix.primitive.counter.Counter.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public void get(atomix.primitive.counter.Counter.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public void increment(atomix.primitive.counter.Counter.IncrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.IncrementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public void decrement(atomix.primitive.counter.Counter.DecrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.DecrementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecrementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * CounterService implements a distributed counter
   * </pre>
   */
  public static final class CounterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CounterServiceBlockingStub> {
    private CounterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public atomix.primitive.counter.Counter.SetResponse set(atomix.primitive.counter.Counter.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public atomix.primitive.counter.Counter.GetResponse get(atomix.primitive.counter.Counter.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public atomix.primitive.counter.Counter.IncrementResponse increment(atomix.primitive.counter.Counter.IncrementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncrementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public atomix.primitive.counter.Counter.DecrementResponse decrement(atomix.primitive.counter.Counter.DecrementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecrementMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * CounterService implements a distributed counter
   * </pre>
   */
  public static final class CounterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CounterServiceFutureStub> {
    private CounterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.Counter.SetResponse> set(
        atomix.primitive.counter.Counter.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.Counter.GetResponse> get(
        atomix.primitive.counter.Counter.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.Counter.IncrementResponse> increment(
        atomix.primitive.counter.Counter.IncrementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.Counter.DecrementResponse> decrement(
        atomix.primitive.counter.Counter.DecrementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecrementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_INCREMENT = 2;
  private static final int METHODID_DECREMENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CounterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CounterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET:
          serviceImpl.set((atomix.primitive.counter.Counter.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.SetResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.counter.Counter.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.GetResponse>) responseObserver);
          break;
        case METHODID_INCREMENT:
          serviceImpl.increment((atomix.primitive.counter.Counter.IncrementRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.IncrementResponse>) responseObserver);
          break;
        case METHODID_DECREMENT:
          serviceImpl.decrement((atomix.primitive.counter.Counter.DecrementRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.Counter.DecrementResponse>) responseObserver);
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

  private static abstract class CounterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.counter.Counter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CounterService");
    }
  }

  private static final class CounterServiceFileDescriptorSupplier
      extends CounterServiceBaseDescriptorSupplier {
    CounterServiceFileDescriptorSupplier() {}
  }

  private static final class CounterServiceMethodDescriptorSupplier
      extends CounterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CounterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CounterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounterServiceFileDescriptorSupplier())
              .addMethod(getSetMethod())
              .addMethod(getGetMethod())
              .addMethod(getIncrementMethod())
              .addMethod(getDecrementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
