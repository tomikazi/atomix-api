package atomix.storage.counter;

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
 * CounterService implements a distributed counter
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/counter/counter.proto")
public final class CounterServiceGrpc {

  private CounterServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.counter.CounterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CreateRequest,
      atomix.storage.counter.Counter.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.storage.counter.Counter.CreateRequest.class,
      responseType = atomix.storage.counter.Counter.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CreateRequest,
      atomix.storage.counter.Counter.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CreateRequest, atomix.storage.counter.Counter.CreateResponse> getCreateMethod;
    if ((getCreateMethod = CounterServiceGrpc.getCreateMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getCreateMethod = CounterServiceGrpc.getCreateMethod) == null) {
          CounterServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.CreateRequest, atomix.storage.counter.Counter.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CloseRequest,
      atomix.storage.counter.Counter.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.storage.counter.Counter.CloseRequest.class,
      responseType = atomix.storage.counter.Counter.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CloseRequest,
      atomix.storage.counter.Counter.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CloseRequest, atomix.storage.counter.Counter.CloseResponse> getCloseMethod;
    if ((getCloseMethod = CounterServiceGrpc.getCloseMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getCloseMethod = CounterServiceGrpc.getCloseMethod) == null) {
          CounterServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.CloseRequest, atomix.storage.counter.Counter.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.SetRequest,
      atomix.storage.counter.Counter.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.storage.counter.Counter.SetRequest.class,
      responseType = atomix.storage.counter.Counter.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.SetRequest,
      atomix.storage.counter.Counter.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.SetRequest, atomix.storage.counter.Counter.SetResponse> getSetMethod;
    if ((getSetMethod = CounterServiceGrpc.getSetMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getSetMethod = CounterServiceGrpc.getSetMethod) == null) {
          CounterServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.SetRequest, atomix.storage.counter.Counter.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.GetRequest,
      atomix.storage.counter.Counter.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.storage.counter.Counter.GetRequest.class,
      responseType = atomix.storage.counter.Counter.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.GetRequest,
      atomix.storage.counter.Counter.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.GetRequest, atomix.storage.counter.Counter.GetResponse> getGetMethod;
    if ((getGetMethod = CounterServiceGrpc.getGetMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getGetMethod = CounterServiceGrpc.getGetMethod) == null) {
          CounterServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.GetRequest, atomix.storage.counter.Counter.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.IncrementRequest,
      atomix.storage.counter.Counter.IncrementResponse> getIncrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Increment",
      requestType = atomix.storage.counter.Counter.IncrementRequest.class,
      responseType = atomix.storage.counter.Counter.IncrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.IncrementRequest,
      atomix.storage.counter.Counter.IncrementResponse> getIncrementMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.IncrementRequest, atomix.storage.counter.Counter.IncrementResponse> getIncrementMethod;
    if ((getIncrementMethod = CounterServiceGrpc.getIncrementMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getIncrementMethod = CounterServiceGrpc.getIncrementMethod) == null) {
          CounterServiceGrpc.getIncrementMethod = getIncrementMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.IncrementRequest, atomix.storage.counter.Counter.IncrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.IncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.IncrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Increment"))
              .build();
        }
      }
    }
    return getIncrementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.DecrementRequest,
      atomix.storage.counter.Counter.DecrementResponse> getDecrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrement",
      requestType = atomix.storage.counter.Counter.DecrementRequest.class,
      responseType = atomix.storage.counter.Counter.DecrementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.DecrementRequest,
      atomix.storage.counter.Counter.DecrementResponse> getDecrementMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.DecrementRequest, atomix.storage.counter.Counter.DecrementResponse> getDecrementMethod;
    if ((getDecrementMethod = CounterServiceGrpc.getDecrementMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getDecrementMethod = CounterServiceGrpc.getDecrementMethod) == null) {
          CounterServiceGrpc.getDecrementMethod = getDecrementMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.DecrementRequest, atomix.storage.counter.Counter.DecrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.DecrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.DecrementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("Decrement"))
              .build();
        }
      }
    }
    return getDecrementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CheckAndSetRequest,
      atomix.storage.counter.Counter.CheckAndSetResponse> getCheckAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckAndSet",
      requestType = atomix.storage.counter.Counter.CheckAndSetRequest.class,
      responseType = atomix.storage.counter.Counter.CheckAndSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CheckAndSetRequest,
      atomix.storage.counter.Counter.CheckAndSetResponse> getCheckAndSetMethod() {
    io.grpc.MethodDescriptor<atomix.storage.counter.Counter.CheckAndSetRequest, atomix.storage.counter.Counter.CheckAndSetResponse> getCheckAndSetMethod;
    if ((getCheckAndSetMethod = CounterServiceGrpc.getCheckAndSetMethod) == null) {
      synchronized (CounterServiceGrpc.class) {
        if ((getCheckAndSetMethod = CounterServiceGrpc.getCheckAndSetMethod) == null) {
          CounterServiceGrpc.getCheckAndSetMethod = getCheckAndSetMethod =
              io.grpc.MethodDescriptor.<atomix.storage.counter.Counter.CheckAndSetRequest, atomix.storage.counter.Counter.CheckAndSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckAndSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.CheckAndSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.counter.Counter.CheckAndSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CounterServiceMethodDescriptorSupplier("CheckAndSet"))
              .build();
        }
      }
    }
    return getCheckAndSetMethod;
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
     * Create creates a counter
     * </pre>
     */
    public void create(atomix.storage.counter.Counter.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes the counter
     * </pre>
     */
    public void close(atomix.storage.counter.Counter.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public void set(atomix.storage.counter.Counter.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.SetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public void get(atomix.storage.counter.Counter.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public void increment(atomix.storage.counter.Counter.IncrementRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.IncrementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public void decrement(atomix.storage.counter.Counter.DecrementRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.DecrementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecrementMethod(), responseObserver);
    }

    /**
     * <pre>
     * CheckAndSet performs a check-and-set operation on the counter value
     * </pre>
     */
    public void checkAndSet(atomix.storage.counter.Counter.CheckAndSetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CheckAndSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.CreateRequest,
                atomix.storage.counter.Counter.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.CloseRequest,
                atomix.storage.counter.Counter.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.SetRequest,
                atomix.storage.counter.Counter.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.GetRequest,
                atomix.storage.counter.Counter.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getIncrementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.IncrementRequest,
                atomix.storage.counter.Counter.IncrementResponse>(
                  this, METHODID_INCREMENT)))
          .addMethod(
            getDecrementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.DecrementRequest,
                atomix.storage.counter.Counter.DecrementResponse>(
                  this, METHODID_DECREMENT)))
          .addMethod(
            getCheckAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.counter.Counter.CheckAndSetRequest,
                atomix.storage.counter.Counter.CheckAndSetResponse>(
                  this, METHODID_CHECK_AND_SET)))
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
     * Create creates a counter
     * </pre>
     */
    public void create(atomix.storage.counter.Counter.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes the counter
     * </pre>
     */
    public void close(atomix.storage.counter.Counter.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public void set(atomix.storage.counter.Counter.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.SetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public void get(atomix.storage.counter.Counter.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public void increment(atomix.storage.counter.Counter.IncrementRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.IncrementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public void decrement(atomix.storage.counter.Counter.DecrementRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.DecrementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecrementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CheckAndSet performs a check-and-set operation on the counter value
     * </pre>
     */
    public void checkAndSet(atomix.storage.counter.Counter.CheckAndSetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CheckAndSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckAndSetMethod(), getCallOptions()), request, responseObserver);
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
     * Create creates a counter
     * </pre>
     */
    public atomix.storage.counter.Counter.CreateResponse create(atomix.storage.counter.Counter.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes the counter
     * </pre>
     */
    public atomix.storage.counter.Counter.CloseResponse close(atomix.storage.counter.Counter.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public atomix.storage.counter.Counter.SetResponse set(atomix.storage.counter.Counter.SetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public atomix.storage.counter.Counter.GetResponse get(atomix.storage.counter.Counter.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public atomix.storage.counter.Counter.IncrementResponse increment(atomix.storage.counter.Counter.IncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public atomix.storage.counter.Counter.DecrementResponse decrement(atomix.storage.counter.Counter.DecrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getDecrementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CheckAndSet performs a check-and-set operation on the counter value
     * </pre>
     */
    public atomix.storage.counter.Counter.CheckAndSetResponse checkAndSet(atomix.storage.counter.Counter.CheckAndSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckAndSetMethod(), getCallOptions(), request);
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
     * Create creates a counter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.CreateResponse> create(
        atomix.storage.counter.Counter.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes the counter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.CloseResponse> close(
        atomix.storage.counter.Counter.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set sets the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.SetResponse> set(
        atomix.storage.counter.Counter.SetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the current counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.GetResponse> get(
        atomix.storage.counter.Counter.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Increment increments the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.IncrementResponse> increment(
        atomix.storage.counter.Counter.IncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decrement decrements the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.DecrementResponse> decrement(
        atomix.storage.counter.Counter.DecrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDecrementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CheckAndSet performs a check-and-set operation on the counter value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.counter.Counter.CheckAndSetResponse> checkAndSet(
        atomix.storage.counter.Counter.CheckAndSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckAndSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SET = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_INCREMENT = 4;
  private static final int METHODID_DECREMENT = 5;
  private static final int METHODID_CHECK_AND_SET = 6;

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
        case METHODID_CREATE:
          serviceImpl.create((atomix.storage.counter.Counter.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.storage.counter.Counter.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CloseResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((atomix.storage.counter.Counter.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.SetResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.storage.counter.Counter.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.GetResponse>) responseObserver);
          break;
        case METHODID_INCREMENT:
          serviceImpl.increment((atomix.storage.counter.Counter.IncrementRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.IncrementResponse>) responseObserver);
          break;
        case METHODID_DECREMENT:
          serviceImpl.decrement((atomix.storage.counter.Counter.DecrementRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.DecrementResponse>) responseObserver);
          break;
        case METHODID_CHECK_AND_SET:
          serviceImpl.checkAndSet((atomix.storage.counter.Counter.CheckAndSetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.counter.Counter.CheckAndSetResponse>) responseObserver);
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
      return atomix.storage.counter.Counter.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSetMethod())
              .addMethod(getGetMethod())
              .addMethod(getIncrementMethod())
              .addMethod(getDecrementMethod())
              .addMethod(getCheckAndSetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
