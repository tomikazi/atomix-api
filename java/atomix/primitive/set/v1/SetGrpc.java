package atomix.primitive.set.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Set is a service for a set primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/set/v1/primitive.proto")
public final class SetGrpc {

  private SetGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.set.v1.Set";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.SizeRequest,
      atomix.primitive.set.v1.Primitive.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.set.v1.Primitive.SizeRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.SizeRequest,
      atomix.primitive.set.v1.Primitive.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.SizeRequest, atomix.primitive.set.v1.Primitive.SizeResponse> getSizeMethod;
    if ((getSizeMethod = SetGrpc.getSizeMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getSizeMethod = SetGrpc.getSizeMethod) == null) {
          SetGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.SizeRequest, atomix.primitive.set.v1.Primitive.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ContainsRequest,
      atomix.primitive.set.v1.Primitive.ContainsResponse> getContainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Contains",
      requestType = atomix.primitive.set.v1.Primitive.ContainsRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.ContainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ContainsRequest,
      atomix.primitive.set.v1.Primitive.ContainsResponse> getContainsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ContainsRequest, atomix.primitive.set.v1.Primitive.ContainsResponse> getContainsMethod;
    if ((getContainsMethod = SetGrpc.getContainsMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getContainsMethod = SetGrpc.getContainsMethod) == null) {
          SetGrpc.getContainsMethod = getContainsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.ContainsRequest, atomix.primitive.set.v1.Primitive.ContainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Contains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.ContainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.ContainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Contains"))
              .build();
        }
      }
    }
    return getContainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.AddRequest,
      atomix.primitive.set.v1.Primitive.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = atomix.primitive.set.v1.Primitive.AddRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.AddRequest,
      atomix.primitive.set.v1.Primitive.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.AddRequest, atomix.primitive.set.v1.Primitive.AddResponse> getAddMethod;
    if ((getAddMethod = SetGrpc.getAddMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getAddMethod = SetGrpc.getAddMethod) == null) {
          SetGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.AddRequest, atomix.primitive.set.v1.Primitive.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.RemoveRequest,
      atomix.primitive.set.v1.Primitive.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.set.v1.Primitive.RemoveRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.RemoveRequest,
      atomix.primitive.set.v1.Primitive.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.RemoveRequest, atomix.primitive.set.v1.Primitive.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = SetGrpc.getRemoveMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getRemoveMethod = SetGrpc.getRemoveMethod) == null) {
          SetGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.RemoveRequest, atomix.primitive.set.v1.Primitive.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ClearRequest,
      atomix.primitive.set.v1.Primitive.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.set.v1.Primitive.ClearRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ClearRequest,
      atomix.primitive.set.v1.Primitive.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ClearRequest, atomix.primitive.set.v1.Primitive.ClearResponse> getClearMethod;
    if ((getClearMethod = SetGrpc.getClearMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getClearMethod = SetGrpc.getClearMethod) == null) {
          SetGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.ClearRequest, atomix.primitive.set.v1.Primitive.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.EventsRequest,
      atomix.primitive.set.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.set.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.EventsRequest,
      atomix.primitive.set.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.EventsRequest, atomix.primitive.set.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = SetGrpc.getEventsMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getEventsMethod = SetGrpc.getEventsMethod) == null) {
          SetGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.EventsRequest, atomix.primitive.set.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ElementsRequest,
      atomix.primitive.set.v1.Primitive.ElementsResponse> getElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Elements",
      requestType = atomix.primitive.set.v1.Primitive.ElementsRequest.class,
      responseType = atomix.primitive.set.v1.Primitive.ElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ElementsRequest,
      atomix.primitive.set.v1.Primitive.ElementsResponse> getElementsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.set.v1.Primitive.ElementsRequest, atomix.primitive.set.v1.Primitive.ElementsResponse> getElementsMethod;
    if ((getElementsMethod = SetGrpc.getElementsMethod) == null) {
      synchronized (SetGrpc.class) {
        if ((getElementsMethod = SetGrpc.getElementsMethod) == null) {
          SetGrpc.getElementsMethod = getElementsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.set.v1.Primitive.ElementsRequest, atomix.primitive.set.v1.Primitive.ElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Elements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.ElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.set.v1.Primitive.ElementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetMethodDescriptorSupplier("Elements"))
              .build();
        }
      }
    }
    return getElementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SetStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetStub>() {
        @java.lang.Override
        public SetStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetStub(channel, callOptions);
        }
      };
    return SetStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SetBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetBlockingStub>() {
        @java.lang.Override
        public SetBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetBlockingStub(channel, callOptions);
        }
      };
    return SetBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SetFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SetFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SetFutureStub>() {
        @java.lang.Override
        public SetFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SetFutureStub(channel, callOptions);
        }
      };
    return SetFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Set is a service for a set primitive
   * </pre>
   */
  public static abstract class SetImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public void size(atomix.primitive.set.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public void contains(atomix.primitive.set.v1.Primitive.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ContainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public void add(atomix.primitive.set.v1.Primitive.AddRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.AddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public void remove(atomix.primitive.set.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public void clear(atomix.primitive.set.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public void events(atomix.primitive.set.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Elements lists all elements in the set
     * </pre>
     */
    public void elements(atomix.primitive.set.v1.Primitive.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ElementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getElementsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.SizeRequest,
                atomix.primitive.set.v1.Primitive.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getContainsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.ContainsRequest,
                atomix.primitive.set.v1.Primitive.ContainsResponse>(
                  this, METHODID_CONTAINS)))
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.AddRequest,
                atomix.primitive.set.v1.Primitive.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.RemoveRequest,
                atomix.primitive.set.v1.Primitive.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.ClearRequest,
                atomix.primitive.set.v1.Primitive.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.EventsRequest,
                atomix.primitive.set.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getElementsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.set.v1.Primitive.ElementsRequest,
                atomix.primitive.set.v1.Primitive.ElementsResponse>(
                  this, METHODID_ELEMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Set is a service for a set primitive
   * </pre>
   */
  public static final class SetStub extends io.grpc.stub.AbstractAsyncStub<SetStub> {
    private SetStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public void size(atomix.primitive.set.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public void contains(atomix.primitive.set.v1.Primitive.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ContainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public void add(atomix.primitive.set.v1.Primitive.AddRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.AddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public void remove(atomix.primitive.set.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public void clear(atomix.primitive.set.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public void events(atomix.primitive.set.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Elements lists all elements in the set
     * </pre>
     */
    public void elements(atomix.primitive.set.v1.Primitive.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ElementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getElementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Set is a service for a set primitive
   * </pre>
   */
  public static final class SetBlockingStub extends io.grpc.stub.AbstractBlockingStub<SetBlockingStub> {
    private SetBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public atomix.primitive.set.v1.Primitive.SizeResponse size(atomix.primitive.set.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public atomix.primitive.set.v1.Primitive.ContainsResponse contains(atomix.primitive.set.v1.Primitive.ContainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public atomix.primitive.set.v1.Primitive.AddResponse add(atomix.primitive.set.v1.Primitive.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public atomix.primitive.set.v1.Primitive.RemoveResponse remove(atomix.primitive.set.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public atomix.primitive.set.v1.Primitive.ClearResponse clear(atomix.primitive.set.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.set.v1.Primitive.EventsResponse> events(
        atomix.primitive.set.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Elements lists all elements in the set
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.set.v1.Primitive.ElementsResponse> elements(
        atomix.primitive.set.v1.Primitive.ElementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getElementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Set is a service for a set primitive
   * </pre>
   */
  public static final class SetFutureStub extends io.grpc.stub.AbstractFutureStub<SetFutureStub> {
    private SetFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SetFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SetFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Primitive.SizeResponse> size(
        atomix.primitive.set.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Primitive.ContainsResponse> contains(
        atomix.primitive.set.v1.Primitive.ContainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Primitive.AddResponse> add(
        atomix.primitive.set.v1.Primitive.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Primitive.RemoveResponse> remove(
        atomix.primitive.set.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.set.v1.Primitive.ClearResponse> clear(
        atomix.primitive.set.v1.Primitive.ClearRequest request) {
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
    private final SetImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SetImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.set.v1.Primitive.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.SizeResponse>) responseObserver);
          break;
        case METHODID_CONTAINS:
          serviceImpl.contains((atomix.primitive.set.v1.Primitive.ContainsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ContainsResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((atomix.primitive.set.v1.Primitive.AddRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.AddResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.set.v1.Primitive.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.set.v1.Primitive.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.set.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.EventsResponse>) responseObserver);
          break;
        case METHODID_ELEMENTS:
          serviceImpl.elements((atomix.primitive.set.v1.Primitive.ElementsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.set.v1.Primitive.ElementsResponse>) responseObserver);
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

  private static abstract class SetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SetBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.set.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Set");
    }
  }

  private static final class SetFileDescriptorSupplier
      extends SetBaseDescriptorSupplier {
    SetFileDescriptorSupplier() {}
  }

  private static final class SetMethodDescriptorSupplier
      extends SetBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SetMethodDescriptorSupplier(String methodName) {
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
      synchronized (SetGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SetFileDescriptorSupplier())
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
