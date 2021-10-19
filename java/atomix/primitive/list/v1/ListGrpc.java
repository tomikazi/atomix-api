package atomix.primitive.list.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * List is a service for a list primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/list/v1/primitive.proto")
public final class ListGrpc {

  private ListGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.list.v1.List";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.SizeRequest,
      atomix.primitive.list.v1.Primitive.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.list.v1.Primitive.SizeRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.SizeRequest,
      atomix.primitive.list.v1.Primitive.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.SizeRequest, atomix.primitive.list.v1.Primitive.SizeResponse> getSizeMethod;
    if ((getSizeMethod = ListGrpc.getSizeMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getSizeMethod = ListGrpc.getSizeMethod) == null) {
          ListGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.SizeRequest, atomix.primitive.list.v1.Primitive.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.AppendRequest,
      atomix.primitive.list.v1.Primitive.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = atomix.primitive.list.v1.Primitive.AppendRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.AppendRequest,
      atomix.primitive.list.v1.Primitive.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.AppendRequest, atomix.primitive.list.v1.Primitive.AppendResponse> getAppendMethod;
    if ((getAppendMethod = ListGrpc.getAppendMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getAppendMethod = ListGrpc.getAppendMethod) == null) {
          ListGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.AppendRequest, atomix.primitive.list.v1.Primitive.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.InsertRequest,
      atomix.primitive.list.v1.Primitive.InsertResponse> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Insert",
      requestType = atomix.primitive.list.v1.Primitive.InsertRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.InsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.InsertRequest,
      atomix.primitive.list.v1.Primitive.InsertResponse> getInsertMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.InsertRequest, atomix.primitive.list.v1.Primitive.InsertResponse> getInsertMethod;
    if ((getInsertMethod = ListGrpc.getInsertMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getInsertMethod = ListGrpc.getInsertMethod) == null) {
          ListGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.InsertRequest, atomix.primitive.list.v1.Primitive.InsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.InsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.InsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.GetRequest,
      atomix.primitive.list.v1.Primitive.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.list.v1.Primitive.GetRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.GetRequest,
      atomix.primitive.list.v1.Primitive.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.GetRequest, atomix.primitive.list.v1.Primitive.GetResponse> getGetMethod;
    if ((getGetMethod = ListGrpc.getGetMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getGetMethod = ListGrpc.getGetMethod) == null) {
          ListGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.GetRequest, atomix.primitive.list.v1.Primitive.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.SetRequest,
      atomix.primitive.list.v1.Primitive.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.primitive.list.v1.Primitive.SetRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.SetRequest,
      atomix.primitive.list.v1.Primitive.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.SetRequest, atomix.primitive.list.v1.Primitive.SetResponse> getSetMethod;
    if ((getSetMethod = ListGrpc.getSetMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getSetMethod = ListGrpc.getSetMethod) == null) {
          ListGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.SetRequest, atomix.primitive.list.v1.Primitive.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.RemoveRequest,
      atomix.primitive.list.v1.Primitive.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.list.v1.Primitive.RemoveRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.RemoveRequest,
      atomix.primitive.list.v1.Primitive.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.RemoveRequest, atomix.primitive.list.v1.Primitive.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = ListGrpc.getRemoveMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getRemoveMethod = ListGrpc.getRemoveMethod) == null) {
          ListGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.RemoveRequest, atomix.primitive.list.v1.Primitive.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.ClearRequest,
      atomix.primitive.list.v1.Primitive.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.list.v1.Primitive.ClearRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.ClearRequest,
      atomix.primitive.list.v1.Primitive.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.ClearRequest, atomix.primitive.list.v1.Primitive.ClearResponse> getClearMethod;
    if ((getClearMethod = ListGrpc.getClearMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getClearMethod = ListGrpc.getClearMethod) == null) {
          ListGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.ClearRequest, atomix.primitive.list.v1.Primitive.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.EventsRequest,
      atomix.primitive.list.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.list.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.EventsRequest,
      atomix.primitive.list.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.EventsRequest, atomix.primitive.list.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = ListGrpc.getEventsMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getEventsMethod = ListGrpc.getEventsMethod) == null) {
          ListGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.EventsRequest, atomix.primitive.list.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.ElementsRequest,
      atomix.primitive.list.v1.Primitive.ElementsResponse> getElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Elements",
      requestType = atomix.primitive.list.v1.Primitive.ElementsRequest.class,
      responseType = atomix.primitive.list.v1.Primitive.ElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.ElementsRequest,
      atomix.primitive.list.v1.Primitive.ElementsResponse> getElementsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.v1.Primitive.ElementsRequest, atomix.primitive.list.v1.Primitive.ElementsResponse> getElementsMethod;
    if ((getElementsMethod = ListGrpc.getElementsMethod) == null) {
      synchronized (ListGrpc.class) {
        if ((getElementsMethod = ListGrpc.getElementsMethod) == null) {
          ListGrpc.getElementsMethod = getElementsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.v1.Primitive.ElementsRequest, atomix.primitive.list.v1.Primitive.ElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Elements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.ElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.v1.Primitive.ElementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListMethodDescriptorSupplier("Elements"))
              .build();
        }
      }
    }
    return getElementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListStub>() {
        @java.lang.Override
        public ListStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListStub(channel, callOptions);
        }
      };
    return ListStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListBlockingStub>() {
        @java.lang.Override
        public ListBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListBlockingStub(channel, callOptions);
        }
      };
    return ListBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListFutureStub>() {
        @java.lang.Override
        public ListFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListFutureStub(channel, callOptions);
        }
      };
    return ListFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * List is a service for a list primitive
   * </pre>
   */
  public static abstract class ListImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public void size(atomix.primitive.list.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public void append(atomix.primitive.list.v1.Primitive.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.AppendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public void insert(atomix.primitive.list.v1.Primitive.InsertRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.InsertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public void get(atomix.primitive.list.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public void set(atomix.primitive.list.v1.Primitive.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public void remove(atomix.primitive.list.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public void clear(atomix.primitive.list.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.list.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Elements streams all elements in the list
     * </pre>
     */
    public void elements(atomix.primitive.list.v1.Primitive.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.ElementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getElementsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.SizeRequest,
                atomix.primitive.list.v1.Primitive.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getAppendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.AppendRequest,
                atomix.primitive.list.v1.Primitive.AppendResponse>(
                  this, METHODID_APPEND)))
          .addMethod(
            getInsertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.InsertRequest,
                atomix.primitive.list.v1.Primitive.InsertResponse>(
                  this, METHODID_INSERT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.GetRequest,
                atomix.primitive.list.v1.Primitive.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.SetRequest,
                atomix.primitive.list.v1.Primitive.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.RemoveRequest,
                atomix.primitive.list.v1.Primitive.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.ClearRequest,
                atomix.primitive.list.v1.Primitive.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.EventsRequest,
                atomix.primitive.list.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getElementsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.list.v1.Primitive.ElementsRequest,
                atomix.primitive.list.v1.Primitive.ElementsResponse>(
                  this, METHODID_ELEMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * List is a service for a list primitive
   * </pre>
   */
  public static final class ListStub extends io.grpc.stub.AbstractAsyncStub<ListStub> {
    private ListStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public void size(atomix.primitive.list.v1.Primitive.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public void append(atomix.primitive.list.v1.Primitive.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.AppendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public void insert(atomix.primitive.list.v1.Primitive.InsertRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.InsertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public void get(atomix.primitive.list.v1.Primitive.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public void set(atomix.primitive.list.v1.Primitive.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public void remove(atomix.primitive.list.v1.Primitive.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public void clear(atomix.primitive.list.v1.Primitive.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.list.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Elements streams all elements in the list
     * </pre>
     */
    public void elements(atomix.primitive.list.v1.Primitive.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.ElementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getElementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * List is a service for a list primitive
   * </pre>
   */
  public static final class ListBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListBlockingStub> {
    private ListBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.SizeResponse size(atomix.primitive.list.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.AppendResponse append(atomix.primitive.list.v1.Primitive.AppendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.InsertResponse insert(atomix.primitive.list.v1.Primitive.InsertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.GetResponse get(atomix.primitive.list.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.SetResponse set(atomix.primitive.list.v1.Primitive.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.RemoveResponse remove(atomix.primitive.list.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public atomix.primitive.list.v1.Primitive.ClearResponse clear(atomix.primitive.list.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.list.v1.Primitive.EventsResponse> events(
        atomix.primitive.list.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Elements streams all elements in the list
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.list.v1.Primitive.ElementsResponse> elements(
        atomix.primitive.list.v1.Primitive.ElementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getElementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * List is a service for a list primitive
   * </pre>
   */
  public static final class ListFutureStub extends io.grpc.stub.AbstractFutureStub<ListFutureStub> {
    private ListFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.SizeResponse> size(
        atomix.primitive.list.v1.Primitive.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.AppendResponse> append(
        atomix.primitive.list.v1.Primitive.AppendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.InsertResponse> insert(
        atomix.primitive.list.v1.Primitive.InsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.GetResponse> get(
        atomix.primitive.list.v1.Primitive.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.SetResponse> set(
        atomix.primitive.list.v1.Primitive.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.RemoveResponse> remove(
        atomix.primitive.list.v1.Primitive.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.v1.Primitive.ClearResponse> clear(
        atomix.primitive.list.v1.Primitive.ClearRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIZE = 0;
  private static final int METHODID_APPEND = 1;
  private static final int METHODID_INSERT = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_SET = 4;
  private static final int METHODID_REMOVE = 5;
  private static final int METHODID_CLEAR = 6;
  private static final int METHODID_EVENTS = 7;
  private static final int METHODID_ELEMENTS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ListImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.list.v1.Primitive.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.SizeResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((atomix.primitive.list.v1.Primitive.AppendRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.AppendResponse>) responseObserver);
          break;
        case METHODID_INSERT:
          serviceImpl.insert((atomix.primitive.list.v1.Primitive.InsertRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.InsertResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.list.v1.Primitive.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.GetResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((atomix.primitive.list.v1.Primitive.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.SetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.list.v1.Primitive.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.list.v1.Primitive.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.list.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.EventsResponse>) responseObserver);
          break;
        case METHODID_ELEMENTS:
          serviceImpl.elements((atomix.primitive.list.v1.Primitive.ElementsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.v1.Primitive.ElementsResponse>) responseObserver);
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

  private static abstract class ListBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.list.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("List");
    }
  }

  private static final class ListFileDescriptorSupplier
      extends ListBaseDescriptorSupplier {
    ListFileDescriptorSupplier() {}
  }

  private static final class ListMethodDescriptorSupplier
      extends ListBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListFileDescriptorSupplier())
              .addMethod(getSizeMethod())
              .addMethod(getAppendMethod())
              .addMethod(getInsertMethod())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
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
