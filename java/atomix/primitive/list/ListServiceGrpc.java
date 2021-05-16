package atomix.primitive.list;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ListService implements a distributed list
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/list/list.proto")
public final class ListServiceGrpc {

  private ListServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.list.ListService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.SizeRequest,
      atomix.primitive.list.List.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.primitive.list.List.SizeRequest.class,
      responseType = atomix.primitive.list.List.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.SizeRequest,
      atomix.primitive.list.List.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.SizeRequest, atomix.primitive.list.List.SizeResponse> getSizeMethod;
    if ((getSizeMethod = ListServiceGrpc.getSizeMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getSizeMethod = ListServiceGrpc.getSizeMethod) == null) {
          ListServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.SizeRequest, atomix.primitive.list.List.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.AppendRequest,
      atomix.primitive.list.List.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = atomix.primitive.list.List.AppendRequest.class,
      responseType = atomix.primitive.list.List.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.AppendRequest,
      atomix.primitive.list.List.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.AppendRequest, atomix.primitive.list.List.AppendResponse> getAppendMethod;
    if ((getAppendMethod = ListServiceGrpc.getAppendMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getAppendMethod = ListServiceGrpc.getAppendMethod) == null) {
          ListServiceGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.AppendRequest, atomix.primitive.list.List.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.InsertRequest,
      atomix.primitive.list.List.InsertResponse> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Insert",
      requestType = atomix.primitive.list.List.InsertRequest.class,
      responseType = atomix.primitive.list.List.InsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.InsertRequest,
      atomix.primitive.list.List.InsertResponse> getInsertMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.InsertRequest, atomix.primitive.list.List.InsertResponse> getInsertMethod;
    if ((getInsertMethod = ListServiceGrpc.getInsertMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getInsertMethod = ListServiceGrpc.getInsertMethod) == null) {
          ListServiceGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.InsertRequest, atomix.primitive.list.List.InsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.InsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.InsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.GetRequest,
      atomix.primitive.list.List.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.primitive.list.List.GetRequest.class,
      responseType = atomix.primitive.list.List.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.GetRequest,
      atomix.primitive.list.List.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.GetRequest, atomix.primitive.list.List.GetResponse> getGetMethod;
    if ((getGetMethod = ListServiceGrpc.getGetMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getGetMethod = ListServiceGrpc.getGetMethod) == null) {
          ListServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.GetRequest, atomix.primitive.list.List.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.SetRequest,
      atomix.primitive.list.List.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.primitive.list.List.SetRequest.class,
      responseType = atomix.primitive.list.List.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.SetRequest,
      atomix.primitive.list.List.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.SetRequest, atomix.primitive.list.List.SetResponse> getSetMethod;
    if ((getSetMethod = ListServiceGrpc.getSetMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getSetMethod = ListServiceGrpc.getSetMethod) == null) {
          ListServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.SetRequest, atomix.primitive.list.List.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.RemoveRequest,
      atomix.primitive.list.List.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.primitive.list.List.RemoveRequest.class,
      responseType = atomix.primitive.list.List.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.RemoveRequest,
      atomix.primitive.list.List.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.RemoveRequest, atomix.primitive.list.List.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = ListServiceGrpc.getRemoveMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getRemoveMethod = ListServiceGrpc.getRemoveMethod) == null) {
          ListServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.RemoveRequest, atomix.primitive.list.List.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.ClearRequest,
      atomix.primitive.list.List.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.primitive.list.List.ClearRequest.class,
      responseType = atomix.primitive.list.List.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.ClearRequest,
      atomix.primitive.list.List.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.ClearRequest, atomix.primitive.list.List.ClearResponse> getClearMethod;
    if ((getClearMethod = ListServiceGrpc.getClearMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getClearMethod = ListServiceGrpc.getClearMethod) == null) {
          ListServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.ClearRequest, atomix.primitive.list.List.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.EventsRequest,
      atomix.primitive.list.List.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.list.List.EventsRequest.class,
      responseType = atomix.primitive.list.List.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.EventsRequest,
      atomix.primitive.list.List.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.EventsRequest, atomix.primitive.list.List.EventsResponse> getEventsMethod;
    if ((getEventsMethod = ListServiceGrpc.getEventsMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getEventsMethod = ListServiceGrpc.getEventsMethod) == null) {
          ListServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.EventsRequest, atomix.primitive.list.List.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.list.List.ElementsRequest,
      atomix.primitive.list.List.ElementsResponse> getElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Elements",
      requestType = atomix.primitive.list.List.ElementsRequest.class,
      responseType = atomix.primitive.list.List.ElementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.list.List.ElementsRequest,
      atomix.primitive.list.List.ElementsResponse> getElementsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.list.List.ElementsRequest, atomix.primitive.list.List.ElementsResponse> getElementsMethod;
    if ((getElementsMethod = ListServiceGrpc.getElementsMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getElementsMethod = ListServiceGrpc.getElementsMethod) == null) {
          ListServiceGrpc.getElementsMethod = getElementsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.list.List.ElementsRequest, atomix.primitive.list.List.ElementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Elements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.ElementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.list.List.ElementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Elements"))
              .build();
        }
      }
    }
    return getElementsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListServiceStub>() {
        @java.lang.Override
        public ListServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListServiceStub(channel, callOptions);
        }
      };
    return ListServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListServiceBlockingStub>() {
        @java.lang.Override
        public ListServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListServiceBlockingStub(channel, callOptions);
        }
      };
    return ListServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ListServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ListServiceFutureStub>() {
        @java.lang.Override
        public ListServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ListServiceFutureStub(channel, callOptions);
        }
      };
    return ListServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ListService implements a distributed list
   * </pre>
   */
  public static abstract class ListServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public void size(atomix.primitive.list.List.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.SizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public void append(atomix.primitive.list.List.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.AppendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public void insert(atomix.primitive.list.List.InsertRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.InsertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public void get(atomix.primitive.list.List.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public void set(atomix.primitive.list.List.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public void remove(atomix.primitive.list.List.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.RemoveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public void clear(atomix.primitive.list.List.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.ClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.list.List.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Elements streams all elements in the list
     * </pre>
     */
    public void elements(atomix.primitive.list.List.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.ElementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getElementsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.SizeRequest,
                atomix.primitive.list.List.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getAppendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.AppendRequest,
                atomix.primitive.list.List.AppendResponse>(
                  this, METHODID_APPEND)))
          .addMethod(
            getInsertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.InsertRequest,
                atomix.primitive.list.List.InsertResponse>(
                  this, METHODID_INSERT)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.GetRequest,
                atomix.primitive.list.List.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.SetRequest,
                atomix.primitive.list.List.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.RemoveRequest,
                atomix.primitive.list.List.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.list.List.ClearRequest,
                atomix.primitive.list.List.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.list.List.EventsRequest,
                atomix.primitive.list.List.EventsResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getElementsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.list.List.ElementsRequest,
                atomix.primitive.list.List.ElementsResponse>(
                  this, METHODID_ELEMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * ListService implements a distributed list
   * </pre>
   */
  public static final class ListServiceStub extends io.grpc.stub.AbstractAsyncStub<ListServiceStub> {
    private ListServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public void size(atomix.primitive.list.List.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.SizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public void append(atomix.primitive.list.List.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.AppendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public void insert(atomix.primitive.list.List.InsertRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.InsertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public void get(atomix.primitive.list.List.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public void set(atomix.primitive.list.List.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public void remove(atomix.primitive.list.List.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.RemoveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public void clear(atomix.primitive.list.List.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.ClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.primitive.list.List.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Elements streams all elements in the list
     * </pre>
     */
    public void elements(atomix.primitive.list.List.ElementsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.list.List.ElementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getElementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ListService implements a distributed list
   * </pre>
   */
  public static final class ListServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ListServiceBlockingStub> {
    private ListServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public atomix.primitive.list.List.SizeResponse size(atomix.primitive.list.List.SizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public atomix.primitive.list.List.AppendResponse append(atomix.primitive.list.List.AppendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public atomix.primitive.list.List.InsertResponse insert(atomix.primitive.list.List.InsertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public atomix.primitive.list.List.GetResponse get(atomix.primitive.list.List.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public atomix.primitive.list.List.SetResponse set(atomix.primitive.list.List.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public atomix.primitive.list.List.RemoveResponse remove(atomix.primitive.list.List.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public atomix.primitive.list.List.ClearResponse clear(atomix.primitive.list.List.ClearRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.list.List.EventsResponse> events(
        atomix.primitive.list.List.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Elements streams all elements in the list
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.list.List.ElementsResponse> elements(
        atomix.primitive.list.List.ElementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getElementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ListService implements a distributed list
   * </pre>
   */
  public static final class ListServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ListServiceFutureStub> {
    private ListServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ListServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.SizeResponse> size(
        atomix.primitive.list.List.SizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.AppendResponse> append(
        atomix.primitive.list.List.AppendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.InsertResponse> insert(
        atomix.primitive.list.List.InsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.GetResponse> get(
        atomix.primitive.list.List.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.SetResponse> set(
        atomix.primitive.list.List.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.RemoveResponse> remove(
        atomix.primitive.list.List.RemoveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.list.List.ClearResponse> clear(
        atomix.primitive.list.List.ClearRequest request) {
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
    private final ListServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIZE:
          serviceImpl.size((atomix.primitive.list.List.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.SizeResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((atomix.primitive.list.List.AppendRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.AppendResponse>) responseObserver);
          break;
        case METHODID_INSERT:
          serviceImpl.insert((atomix.primitive.list.List.InsertRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.InsertResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.primitive.list.List.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.GetResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((atomix.primitive.list.List.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.SetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.primitive.list.List.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.primitive.list.List.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.list.List.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.EventsResponse>) responseObserver);
          break;
        case METHODID_ELEMENTS:
          serviceImpl.elements((atomix.primitive.list.List.ElementsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.list.List.ElementsResponse>) responseObserver);
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

  private static abstract class ListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.list.List.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ListService");
    }
  }

  private static final class ListServiceFileDescriptorSupplier
      extends ListServiceBaseDescriptorSupplier {
    ListServiceFileDescriptorSupplier() {}
  }

  private static final class ListServiceMethodDescriptorSupplier
      extends ListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListServiceFileDescriptorSupplier())
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
