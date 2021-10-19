package atomix.primitive.value.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Value is a service for a value primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/value/v1/primitive.proto")
public final class ValueGrpc {

  private ValueGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.value.v1.Value";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.SetRequest,
      atomix.primitive.value.v1.Primitive.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.primitive.value.v1.Primitive.SetRequest.class,
      responseType = atomix.primitive.value.v1.Primitive.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.SetRequest,
      atomix.primitive.value.v1.Primitive.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.SetRequest, atomix.primitive.value.v1.Primitive.SetResponse> getSetMethod;
    if ((getSetMethod = ValueGrpc.getSetMethod) == null) {
      synchronized (ValueGrpc.class) {
        if ((getSetMethod = ValueGrpc.getSetMethod) == null) {
          ValueGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.v1.Primitive.SetRequest, atomix.primitive.value.v1.Primitive.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Primitive.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Primitive.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.GetRequest,
      atomix.primitive.value.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.value.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.value.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.GetRequest,
      atomix.primitive.value.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.GetRequest, atomix.primitive.value.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = ValueGrpc.getGetMethod) == null) {
      synchronized (ValueGrpc.class) {
        if ((getGetMethod = ValueGrpc.getGetMethod) == null) {
          ValueGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.v1.Primitive.GetRequest, atomix.primitive.value.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.EventsRequest,
      atomix.primitive.value.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.value.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.value.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.EventsRequest,
      atomix.primitive.value.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.v1.Primitive.EventsRequest, atomix.primitive.value.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = ValueGrpc.getEventsMethod) == null) {
      synchronized (ValueGrpc.class) {
        if ((getEventsMethod = ValueGrpc.getEventsMethod) == null) {
          ValueGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.v1.Primitive.EventsRequest, atomix.primitive.value.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValueStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueStub>() {
        @java.lang.Override
        public ValueStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueStub(channel, callOptions);
        }
      };
    return ValueStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValueBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueBlockingStub>() {
        @java.lang.Override
        public ValueBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueBlockingStub(channel, callOptions);
        }
      };
    return ValueBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValueFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValueFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValueFutureStub>() {
        @java.lang.Override
        public ValueFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValueFutureStub(channel, callOptions);
        }
      };
    return ValueFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Value is a service for a value primitive
   * </pre>
   */
  public static abstract class ValueImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public void set(atomix.primitive.value.v1.Primitive.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public void get(atomix.primitive.value.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public void events(atomix.primitive.value.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.value.v1.Primitive.SetRequest,
                atomix.primitive.value.v1.Primitive.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.value.v1.Primitive.GetRequest,
                atomix.primitive.value.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.value.v1.Primitive.EventsRequest,
                atomix.primitive.value.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Value is a service for a value primitive
   * </pre>
   */
  public static final class ValueStub extends io.grpc.stub.AbstractAsyncStub<ValueStub> {
    private ValueStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public void set(atomix.primitive.value.v1.Primitive.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public void get(atomix.primitive.value.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public void events(atomix.primitive.value.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Value is a service for a value primitive
   * </pre>
   */
  public static final class ValueBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValueBlockingStub> {
    private ValueBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public atomix.primitive.value.v1.Primitive.SetResponse set(atomix.primitive.value.v1.Primitive.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public atomix.primitive.value.v1.Primitive.GetResponse get(atomix.primitive.value.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.value.v1.Primitive.EventsResponse> events(
        atomix.primitive.value.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Value is a service for a value primitive
   * </pre>
   */
  public static final class ValueFutureStub extends io.grpc.stub.AbstractFutureStub<ValueFutureStub> {
    private ValueFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValueFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValueFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set sets the value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.value.v1.Primitive.SetResponse> set(
        atomix.primitive.value.v1.Primitive.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.value.v1.Primitive.GetResponse> get(
        atomix.primitive.value.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_EVENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValueImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValueImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET:
          serviceImpl.set((atomix.primitive.value.v1.Primitive.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.SetResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.value.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.value.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.v1.Primitive.EventsResponse>) responseObserver);
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

  private static abstract class ValueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValueBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.value.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Value");
    }
  }

  private static final class ValueFileDescriptorSupplier
      extends ValueBaseDescriptorSupplier {
    ValueFileDescriptorSupplier() {}
  }

  private static final class ValueMethodDescriptorSupplier
      extends ValueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValueMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValueGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValueFileDescriptorSupplier())
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
