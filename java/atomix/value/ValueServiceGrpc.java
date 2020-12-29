package atomix.value;

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
 * ValueService implements a distributed atomic value
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/value/value.proto")
public final class ValueServiceGrpc {

  private ValueServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.value.ValueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.value.Value.CreateRequest,
      atomix.value.Value.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.value.Value.CreateRequest.class,
      responseType = atomix.value.Value.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.value.Value.CreateRequest,
      atomix.value.Value.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.value.Value.CreateRequest, atomix.value.Value.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ValueServiceGrpc.getCreateMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getCreateMethod = ValueServiceGrpc.getCreateMethod) == null) {
          ValueServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.value.Value.CreateRequest, atomix.value.Value.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.value.Value.CloseRequest,
      atomix.value.Value.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.value.Value.CloseRequest.class,
      responseType = atomix.value.Value.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.value.Value.CloseRequest,
      atomix.value.Value.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.value.Value.CloseRequest, atomix.value.Value.CloseResponse> getCloseMethod;
    if ((getCloseMethod = ValueServiceGrpc.getCloseMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getCloseMethod = ValueServiceGrpc.getCloseMethod) == null) {
          ValueServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.value.Value.CloseRequest, atomix.value.Value.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.value.Value.SetRequest,
      atomix.value.Value.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.value.Value.SetRequest.class,
      responseType = atomix.value.Value.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.value.Value.SetRequest,
      atomix.value.Value.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.value.Value.SetRequest, atomix.value.Value.SetResponse> getSetMethod;
    if ((getSetMethod = ValueServiceGrpc.getSetMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getSetMethod = ValueServiceGrpc.getSetMethod) == null) {
          ValueServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.value.Value.SetRequest, atomix.value.Value.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.value.Value.GetRequest,
      atomix.value.Value.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.value.Value.GetRequest.class,
      responseType = atomix.value.Value.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.value.Value.GetRequest,
      atomix.value.Value.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.value.Value.GetRequest, atomix.value.Value.GetResponse> getGetMethod;
    if ((getGetMethod = ValueServiceGrpc.getGetMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getGetMethod = ValueServiceGrpc.getGetMethod) == null) {
          ValueServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.value.Value.GetRequest, atomix.value.Value.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.value.Value.EventRequest,
      atomix.value.Value.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.value.Value.EventRequest.class,
      responseType = atomix.value.Value.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.value.Value.EventRequest,
      atomix.value.Value.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.value.Value.EventRequest, atomix.value.Value.EventResponse> getEventsMethod;
    if ((getEventsMethod = ValueServiceGrpc.getEventsMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getEventsMethod = ValueServiceGrpc.getEventsMethod) == null) {
          ValueServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.value.Value.EventRequest, atomix.value.Value.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.value.Value.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueServiceStub>() {
        @java.lang.Override
        public ValueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueServiceStub(channel, callOptions);
        }
      };
    return ValueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueServiceBlockingStub>() {
        @java.lang.Override
        public ValueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueServiceBlockingStub(channel, callOptions);
        }
      };
    return ValueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueServiceFutureStub>() {
        @java.lang.Override
        public ValueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueServiceFutureStub(channel, callOptions);
        }
      };
    return ValueServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ValueService implements a distributed atomic value
   * </pre>
   */
  public static abstract class ValueServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a new value session
     * </pre>
     */
    public void create(atomix.value.Value.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes the value session
     * </pre>
     */
    public void close(atomix.value.Value.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public void set(atomix.value.Value.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.SetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public void get(atomix.value.Value.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public void events(atomix.value.Value.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.value.Value.CreateRequest,
                atomix.value.Value.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.value.Value.CloseRequest,
                atomix.value.Value.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.value.Value.SetRequest,
                atomix.value.Value.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.value.Value.GetRequest,
                atomix.value.Value.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.value.Value.EventRequest,
                atomix.value.Value.EventResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * ValueService implements a distributed atomic value
   * </pre>
   */
  public static final class ValueServiceStub extends io.grpc.stub.AbstractAsyncStub<ValueServiceStub> {
    private ValueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new value session
     * </pre>
     */
    public void create(atomix.value.Value.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes the value session
     * </pre>
     */
    public void close(atomix.value.Value.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public void set(atomix.value.Value.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.SetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public void get(atomix.value.Value.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public void events(atomix.value.Value.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.value.Value.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ValueService implements a distributed atomic value
   * </pre>
   */
  public static final class ValueServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValueServiceBlockingStub> {
    private ValueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new value session
     * </pre>
     */
    public atomix.value.Value.CreateResponse create(atomix.value.Value.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes the value session
     * </pre>
     */
    public atomix.value.Value.CloseResponse close(atomix.value.Value.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public atomix.value.Value.SetResponse set(atomix.value.Value.SetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public atomix.value.Value.GetResponse get(atomix.value.Value.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public java.util.Iterator<atomix.value.Value.EventResponse> events(
        atomix.value.Value.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ValueService implements a distributed atomic value
   * </pre>
   */
  public static final class ValueServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ValueServiceFutureStub> {
    private ValueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a new value session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.value.Value.CreateResponse> create(
        atomix.value.Value.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes the value session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.value.Value.CloseResponse> close(
        atomix.value.Value.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.value.Value.SetResponse> set(
        atomix.value.Value.SetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.value.Value.GetResponse> get(
        atomix.value.Value.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SET = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_EVENTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.value.Value.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.value.Value.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.value.Value.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.value.Value.CloseResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((atomix.value.Value.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.value.Value.SetResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.value.Value.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.value.Value.GetResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.value.Value.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.value.Value.EventResponse>) responseObserver);
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

  private static abstract class ValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.value.Value.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValueService");
    }
  }

  private static final class ValueServiceFileDescriptorSupplier
      extends ValueServiceBaseDescriptorSupplier {
    ValueServiceFileDescriptorSupplier() {}
  }

  private static final class ValueServiceMethodDescriptorSupplier
      extends ValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValueServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSetMethod())
              .addMethod(getGetMethod())
              .addMethod(getEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
