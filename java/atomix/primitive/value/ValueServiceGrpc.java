package atomix.primitive.value;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ValueService implements a distributed atomic value
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/value/value.proto")
public final class ValueServiceGrpc {

  private ValueServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.value.ValueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.SetRequest,
      atomix.primitive.value.ValueOuterClass.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.primitive.value.ValueOuterClass.SetRequest.class,
      responseType = atomix.primitive.value.ValueOuterClass.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.SetRequest,
      atomix.primitive.value.ValueOuterClass.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.SetRequest, atomix.primitive.value.ValueOuterClass.SetResponse> getSetMethod;
    if ((getSetMethod = ValueServiceGrpc.getSetMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getSetMethod = ValueServiceGrpc.getSetMethod) == null) {
          ValueServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.ValueOuterClass.SetRequest, atomix.primitive.value.ValueOuterClass.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.ValueOuterClass.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.ValueOuterClass.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.GetRequest,
      atomix.primitive.value.ValueOuterClass.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.value.ValueOuterClass.GetRequest.class,
      responseType = atomix.primitive.value.ValueOuterClass.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.GetRequest,
      atomix.primitive.value.ValueOuterClass.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.GetRequest, atomix.primitive.value.ValueOuterClass.GetResponse> getGetMethod;
    if ((getGetMethod = ValueServiceGrpc.getGetMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getGetMethod = ValueServiceGrpc.getGetMethod) == null) {
          ValueServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.ValueOuterClass.GetRequest, atomix.primitive.value.ValueOuterClass.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.ValueOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.ValueOuterClass.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ValueServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.EventsRequest,
      atomix.primitive.value.ValueOuterClass.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.value.ValueOuterClass.EventsRequest.class,
      responseType = atomix.primitive.value.ValueOuterClass.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.EventsRequest,
      atomix.primitive.value.ValueOuterClass.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.value.ValueOuterClass.EventsRequest, atomix.primitive.value.ValueOuterClass.EventsResponse> getEventsMethod;
    if ((getEventsMethod = ValueServiceGrpc.getEventsMethod) == null) {
      synchronized (ValueServiceGrpc.class) {
        if ((getEventsMethod = ValueServiceGrpc.getEventsMethod) == null) {
          ValueServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.value.ValueOuterClass.EventsRequest, atomix.primitive.value.ValueOuterClass.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.ValueOuterClass.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.value.ValueOuterClass.EventsResponse.getDefaultInstance()))
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
     * Set sets the value
     * </pre>
     */
    public void set(atomix.primitive.value.ValueOuterClass.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public void get(atomix.primitive.value.ValueOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public void events(atomix.primitive.value.ValueOuterClass.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.value.ValueOuterClass.SetRequest,
                atomix.primitive.value.ValueOuterClass.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.value.ValueOuterClass.GetRequest,
                atomix.primitive.value.ValueOuterClass.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.value.ValueOuterClass.EventsRequest,
                atomix.primitive.value.ValueOuterClass.EventsResponse>(
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
     * Set sets the value
     * </pre>
     */
    public void set(atomix.primitive.value.ValueOuterClass.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public void get(atomix.primitive.value.ValueOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public void events(atomix.primitive.value.ValueOuterClass.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
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
     * Set sets the value
     * </pre>
     */
    public atomix.primitive.value.ValueOuterClass.SetResponse set(atomix.primitive.value.ValueOuterClass.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public atomix.primitive.value.ValueOuterClass.GetResponse get(atomix.primitive.value.ValueOuterClass.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for value change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.value.ValueOuterClass.EventsResponse> events(
        atomix.primitive.value.ValueOuterClass.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
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
     * Set sets the value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.value.ValueOuterClass.SetResponse> set(
        atomix.primitive.value.ValueOuterClass.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.value.ValueOuterClass.GetResponse> get(
        atomix.primitive.value.ValueOuterClass.GetRequest request) {
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
        case METHODID_SET:
          serviceImpl.set((atomix.primitive.value.ValueOuterClass.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.SetResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.value.ValueOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.GetResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.value.ValueOuterClass.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.value.ValueOuterClass.EventsResponse>) responseObserver);
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
      return atomix.primitive.value.ValueOuterClass.getDescriptor();
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
