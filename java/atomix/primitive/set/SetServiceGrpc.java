package atomix.primitive.set;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/set/set.proto")
public final class SetServiceGrpc {

  private SetServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.set.SetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.SizeRequest,
      atomix.primitive.set.Set.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.set.Set.SizeRequest.class,
      responseType = atomix.primitive.set.Set.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.SizeRequest,
      atomix.primitive.set.Set.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.SizeRequest, atomix.primitive.set.Set.SizeResponse> getSizeMethod;
    if ((getSizeMethod = SetServiceGrpc.getSizeMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getSizeMethod = SetServiceGrpc.getSizeMethod) == null) {
          SetServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.SizeRequest, atomix.primitive.set.Set.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.ContainsRequest,
      atomix.primitive.set.Set.ContainsResponse> getContainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Contains",
      requestType = atomix.primitive.set.Set.ContainsRequest.class,
      responseType = atomix.primitive.set.Set.ContainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.ContainsRequest,
      atomix.primitive.set.Set.ContainsResponse> getContainsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.ContainsRequest, atomix.primitive.set.Set.ContainsResponse> getContainsMethod;
    if ((getContainsMethod = SetServiceGrpc.getContainsMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getContainsMethod = SetServiceGrpc.getContainsMethod) == null) {
          SetServiceGrpc.getContainsMethod = getContainsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.ContainsRequest, atomix.primitive.set.Set.ContainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Contains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.ContainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.ContainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Contains"))
              .build();
        }
      }
    }
    return getContainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.AddRequest,
      atomix.primitive.set.Set.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = atomix.primitive.set.Set.AddRequest.class,
      responseType = atomix.primitive.set.Set.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.AddRequest,
      atomix.primitive.set.Set.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.AddRequest, atomix.primitive.set.Set.AddResponse> getAddMethod;
    if ((getAddMethod = SetServiceGrpc.getAddMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getAddMethod = SetServiceGrpc.getAddMethod) == null) {
          SetServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.AddRequest, atomix.primitive.set.Set.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.RemoveRequest,
      atomix.primitive.set.Set.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.set.Set.RemoveRequest.class,
      responseType = atomix.primitive.set.Set.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.RemoveRequest,
      atomix.primitive.set.Set.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.RemoveRequest, atomix.primitive.set.Set.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = SetServiceGrpc.getRemoveMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getRemoveMethod = SetServiceGrpc.getRemoveMethod) == null) {
          SetServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.RemoveRequest, atomix.primitive.set.Set.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.ClearRequest,
      atomix.primitive.set.Set.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.set.Set.ClearRequest.class,
      responseType = atomix.primitive.set.Set.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.ClearRequest,
      atomix.primitive.set.Set.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.ClearRequest, atomix.primitive.set.Set.ClearResponse> getClearMethod;
    if ((getClearMethod = SetServiceGrpc.getClearMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getClearMethod = SetServiceGrpc.getClearMethod) == null) {
          SetServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.ClearRequest, atomix.primitive.set.Set.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.EventsRequest,
      atomix.primitive.set.Set.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.set.Set.EventsRequest.class,
      responseType = atomix.primitive.set.Set.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.EventsRequest,
      atomix.primitive.set.Set.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.EventsRequest, atomix.primitive.set.Set.EventsResponse> getEventsMethod;
    if ((getEventsMethod = SetServiceGrpc.getEventsMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getEventsMethod = SetServiceGrpc.getEventsMethod) == null) {
          SetServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.EventsRequest, atomix.primitive.set.Set.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.Set.ElementsRequest,
      atomix.primitive.set.Set.ElementsResponse> getElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Elements",
      requestType = atomix.primitive.set.Set.ElementsRequest.class,
      responseType = atomix.primitive.set.Set.ElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.Set.ElementsRequest,
      atomix.primitive.set.Set.ElementsResponse> getElementsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.Set.ElementsRequest, atomix.primitive.set.Set.ElementsResponse> getElementsMethod;
    if ((getElementsMethod = SetServiceGrpc.getElementsMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getElementsMethod = SetServiceGrpc.getElementsMethod) == null) {
          SetServiceGrpc.getElementsMethod = getElementsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.Set.ElementsRequest, atomix.primitive.set.Set.ElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Elements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.ElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.Set.ElementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Elements"))
              .build();
        }
      }
    }
    return getElementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetServiceStub>() {
        @java.lang.Override
        public SetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetServiceStub(channel, callOptions);
        }
      };
    return SetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetServiceBlockingStub>() {
        @java.lang.Override
        public SetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetServiceBlockingStub(channel, callOptions);
        }
      };
    return SetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetServiceFutureStub>() {
        @java.lang.Override
        public SetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetServiceFutureStub(channel, callOptions);
        }
      };
    return SetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set service
   * </pre>
   */
  public static abstract class SetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public void size(atomix.primitive.set.Set.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public void contains(atomix.primitive.set.Set.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ContainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public void add(atomix.primitive.set.Set.AddRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.AddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public void remove(atomix.primitive.set.Set.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public void clear(atomix.primitive.set.Set.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public void events(atomix.primitive.set.Set.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Elements lists all elements in the set
     * </pre>
     */
    public void elements(atomix.primitive.set.Set.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ElementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getElementsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.Set.SizeRequest,
                atomix.primitive.set.Set.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getContainsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.Set.ContainsRequest,
                atomix.primitive.set.Set.ContainsResponse>(
                  this, METHODID_CONTAINS)))
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.Set.AddRequest,
                atomix.primitive.set.Set.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.Set.RemoveRequest,
                atomix.primitive.set.Set.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.Set.ClearRequest,
                atomix.primitive.set.Set.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.set.Set.EventsRequest,
                atomix.primitive.set.Set.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getElementsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.set.Set.ElementsRequest,
                atomix.primitive.set.Set.ElementsResponse>(
                  this, METHODID_ELEMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Set service
   * </pre>
   */
  public static final class SetServiceStub extends io.grpc.stub.AbstractAsyncStub<SetServiceStub> {
    private SetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public void size(atomix.primitive.set.Set.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public void contains(atomix.primitive.set.Set.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ContainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public void add(atomix.primitive.set.Set.AddRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.AddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public void remove(atomix.primitive.set.Set.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public void clear(atomix.primitive.set.Set.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public void events(atomix.primitive.set.Set.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Elements lists all elements in the set
     * </pre>
     */
    public void elements(atomix.primitive.set.Set.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ElementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getElementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set service
   * </pre>
   */
  public static final class SetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SetServiceBlockingStub> {
    private SetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public atomix.primitive.set.Set.SizeResponse size(atomix.primitive.set.Set.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public atomix.primitive.set.Set.ContainsResponse contains(atomix.primitive.set.Set.ContainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public atomix.primitive.set.Set.AddResponse add(atomix.primitive.set.Set.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public atomix.primitive.set.Set.RemoveResponse remove(atomix.primitive.set.Set.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public atomix.primitive.set.Set.ClearResponse clear(atomix.primitive.set.Set.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.set.Set.EventsResponse> events(
        atomix.primitive.set.Set.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Elements lists all elements in the set
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.set.Set.ElementsResponse> elements(
        atomix.primitive.set.Set.ElementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getElementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set service
   * </pre>
   */
  public static final class SetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SetServiceFutureStub> {
    private SetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.Set.SizeResponse> size(
        atomix.primitive.set.Set.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.Set.ContainsResponse> contains(
        atomix.primitive.set.Set.ContainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.Set.AddResponse> add(
        atomix.primitive.set.Set.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.Set.RemoveResponse> remove(
        atomix.primitive.set.Set.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.Set.ClearResponse> clear(
        atomix.primitive.set.Set.ClearRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIZE = 0;
  private static final int METHODID_CONTAINS = 1;
  private static final int METHODID_ADD = 2;
  private static final int METHODID_REMOVE = 3;
  private static final int METHODID_CLEAR = 4;
  private static final int METHODID_EVENTS = 5;
  private static final int METHODID_ELEMENTS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.set.Set.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.SizeResponse>) responseObserver);
          break;
        case METHODID_CONTAINS:
          serviceImpl.contains((atomix.primitive.set.Set.ContainsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ContainsResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((atomix.primitive.set.Set.AddRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.AddResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.set.Set.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.set.Set.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.set.Set.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.EventsResponse>) responseObserver);
          break;
        case METHODID_ELEMENTS:
          serviceImpl.elements((atomix.primitive.set.Set.ElementsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.Set.ElementsResponse>) responseObserver);
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

  private static abstract class SetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.set.Set.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SetService");
    }
  }

  private static final class SetServiceFileDescriptorSupplier
      extends SetServiceBaseDescriptorSupplier {
    SetServiceFileDescriptorSupplier() {}
  }

  private static final class SetServiceMethodDescriptorSupplier
      extends SetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SetServiceFileDescriptorSupplier())
              .addMethod(getSizeMethod())
              .addMethod(getContainsMethod())
              .addMethod(getAddMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getClearMethod())
              .addMethod(getEventsMethod())
              .addMethod(getElementsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
