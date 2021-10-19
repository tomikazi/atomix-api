package atomix.primitive.counter.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Counter is a service for a counter primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/counter/v1/primitive.proto")
public final class CounterGrpc {

  private CounterGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.counter.v1.Counter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.SetRequest,
      atomix.primitive.counter.v1.Primitive.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.primitive.counter.v1.Primitive.SetRequest.class,
      responseType = atomix.primitive.counter.v1.Primitive.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.SetRequest,
      atomix.primitive.counter.v1.Primitive.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.SetRequest, atomix.primitive.counter.v1.Primitive.SetResponse> getSetMethod;
    if ((getSetMethod = CounterGrpc.getSetMethod) == null) {
      synchronized (CounterGrpc.class) {
        if ((getSetMethod = CounterGrpc.getSetMethod) == null) {
          CounterGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Primitive.SetRequest, atomix.primitive.counter.v1.Primitive.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.GetRequest,
      atomix.primitive.counter.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.counter.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.counter.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.GetRequest,
      atomix.primitive.counter.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.GetRequest, atomix.primitive.counter.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = CounterGrpc.getGetMethod) == null) {
      synchronized (CounterGrpc.class) {
        if ((getGetMethod = CounterGrpc.getGetMethod) == null) {
          CounterGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Primitive.GetRequest, atomix.primitive.counter.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.IncrementRequest,
      atomix.primitive.counter.v1.Primitive.IncrementResponse> getIncrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Increment",
      requestType = atomix.primitive.counter.v1.Primitive.IncrementRequest.class,
      responseType = atomix.primitive.counter.v1.Primitive.IncrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.IncrementRequest,
      atomix.primitive.counter.v1.Primitive.IncrementResponse> getIncrementMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.IncrementRequest, atomix.primitive.counter.v1.Primitive.IncrementResponse> getIncrementMethod;
    if ((getIncrementMethod = CounterGrpc.getIncrementMethod) == null) {
      synchronized (CounterGrpc.class) {
        if ((getIncrementMethod = CounterGrpc.getIncrementMethod) == null) {
          CounterGrpc.getIncrementMethod = getIncrementMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Primitive.IncrementRequest, atomix.primitive.counter.v1.Primitive.IncrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.IncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.IncrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterMethodDescriptorSupplier("Increment"))
              .build();
        }
      }
    }
    return getIncrementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.DecrementRequest,
      atomix.primitive.counter.v1.Primitive.DecrementResponse> getDecrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrement",
      requestType = atomix.primitive.counter.v1.Primitive.DecrementRequest.class,
      responseType = atomix.primitive.counter.v1.Primitive.DecrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.DecrementRequest,
      atomix.primitive.counter.v1.Primitive.DecrementResponse> getDecrementMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.counter.v1.Primitive.DecrementRequest, atomix.primitive.counter.v1.Primitive.DecrementResponse> getDecrementMethod;
    if ((getDecrementMethod = CounterGrpc.getDecrementMethod) == null) {
      synchronized (CounterGrpc.class) {
        if ((getDecrementMethod = CounterGrpc.getDecrementMethod) == null) {
          CounterGrpc.getDecrementMethod = getDecrementMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.counter.v1.Primitive.DecrementRequest, atomix.primitive.counter.v1.Primitive.DecrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.DecrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.counter.v1.Primitive.DecrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterMethodDescriptorSupplier("Decrement"))
              .build();
        }
      }
    }
    return getDecrementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterStub>() {
        @java.lang.Override
        public CounterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterStub(channel, callOptions);
        }
      };
    return CounterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterBlockingStub>() {
        @java.lang.Override
        public CounterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterBlockingStub(channel, callOptions);
        }
      };
    return CounterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CounterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CounterFutureStub>() {
        @java.lang.Override
        public CounterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CounterFutureStub(channel, callOptions);
        }
      };
    return CounterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Counter is a service for a counter primitive
   * </pre>
   */
  public static abstract class CounterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public void set(atomix.primitive.counter.v1.Primitive.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public void get(atomix.primitive.counter.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public void increment(atomix.primitive.counter.v1.Primitive.IncrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.IncrementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncrementMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public void decrement(atomix.primitive.counter.v1.Primitive.DecrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.DecrementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecrementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Primitive.SetRequest,
                atomix.primitive.counter.v1.Primitive.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Primitive.GetRequest,
                atomix.primitive.counter.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getIncrementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Primitive.IncrementRequest,
                atomix.primitive.counter.v1.Primitive.IncrementResponse>(
                  this, METHODID_INCREMENT)))
          .addMethod(
            getDecrementMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.counter.v1.Primitive.DecrementRequest,
                atomix.primitive.counter.v1.Primitive.DecrementResponse>(
                  this, METHODID_DECREMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Counter is a service for a counter primitive
   * </pre>
   */
  public static final class CounterStub extends io.grpc.stub.AbstractAsyncStub<CounterStub> {
    private CounterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public void set(atomix.primitive.counter.v1.Primitive.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public void get(atomix.primitive.counter.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public void increment(atomix.primitive.counter.v1.Primitive.IncrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.IncrementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public void decrement(atomix.primitive.counter.v1.Primitive.DecrementRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.DecrementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecrementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Counter is a service for a counter primitive
   * </pre>
   */
  public static final class CounterBlockingStub extends io.grpc.stub.AbstractBlockingStub<CounterBlockingStub> {
    private CounterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public atomix.primitive.counter.v1.Primitive.SetResponse set(atomix.primitive.counter.v1.Primitive.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public atomix.primitive.counter.v1.Primitive.GetResponse get(atomix.primitive.counter.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public atomix.primitive.counter.v1.Primitive.IncrementResponse increment(atomix.primitive.counter.v1.Primitive.IncrementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncrementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public atomix.primitive.counter.v1.Primitive.DecrementResponse decrement(atomix.primitive.counter.v1.Primitive.DecrementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecrementMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Counter is a service for a counter primitive
   * </pre>
   */
  public static final class CounterFutureStub extends io.grpc.stub.AbstractFutureStub<CounterFutureStub> {
    private CounterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CounterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Primitive.SetResponse> set(
        atomix.primitive.counter.v1.Primitive.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Primitive.GetResponse> get(
        atomix.primitive.counter.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Primitive.IncrementResponse> increment(
        atomix.primitive.counter.v1.Primitive.IncrementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.counter.v1.Primitive.DecrementResponse> decrement(
        atomix.primitive.counter.v1.Primitive.DecrementRequest request) {
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
    private final CounterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CounterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET:
          serviceImpl.set((atomix.primitive.counter.v1.Primitive.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.SetResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.counter.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_INCREMENT:
          serviceImpl.increment((atomix.primitive.counter.v1.Primitive.IncrementRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.IncrementResponse>) responseObserver);
          break;
        case METHODID_DECREMENT:
          serviceImpl.decrement((atomix.primitive.counter.v1.Primitive.DecrementRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.counter.v1.Primitive.DecrementResponse>) responseObserver);
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

  private static abstract class CounterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CounterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.counter.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Counter");
    }
  }

  private static final class CounterFileDescriptorSupplier
      extends CounterBaseDescriptorSupplier {
    CounterFileDescriptorSupplier() {}
  }

  private static final class CounterMethodDescriptorSupplier
      extends CounterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CounterMethodDescriptorSupplier(String methodName) {
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
      synchronized (CounterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CounterFileDescriptorSupplier())
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
