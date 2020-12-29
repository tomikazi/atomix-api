package atomix.storage.set;

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
 * Set service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/set/set.proto")
public final class SetServiceGrpc {

  private SetServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.set.SetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.CreateRequest,
      atomix.storage.set.Set.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.storage.set.Set.CreateRequest.class,
      responseType = atomix.storage.set.Set.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.CreateRequest,
      atomix.storage.set.Set.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.CreateRequest, atomix.storage.set.Set.CreateResponse> getCreateMethod;
    if ((getCreateMethod = SetServiceGrpc.getCreateMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getCreateMethod = SetServiceGrpc.getCreateMethod) == null) {
          SetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.CreateRequest, atomix.storage.set.Set.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.CloseRequest,
      atomix.storage.set.Set.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.storage.set.Set.CloseRequest.class,
      responseType = atomix.storage.set.Set.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.CloseRequest,
      atomix.storage.set.Set.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.CloseRequest, atomix.storage.set.Set.CloseResponse> getCloseMethod;
    if ((getCloseMethod = SetServiceGrpc.getCloseMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getCloseMethod = SetServiceGrpc.getCloseMethod) == null) {
          SetServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.CloseRequest, atomix.storage.set.Set.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.SizeRequest,
      atomix.storage.set.Set.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.storage.set.Set.SizeRequest.class,
      responseType = atomix.storage.set.Set.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.SizeRequest,
      atomix.storage.set.Set.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.SizeRequest, atomix.storage.set.Set.SizeResponse> getSizeMethod;
    if ((getSizeMethod = SetServiceGrpc.getSizeMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getSizeMethod = SetServiceGrpc.getSizeMethod) == null) {
          SetServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.SizeRequest, atomix.storage.set.Set.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.ContainsRequest,
      atomix.storage.set.Set.ContainsResponse> getContainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Contains",
      requestType = atomix.storage.set.Set.ContainsRequest.class,
      responseType = atomix.storage.set.Set.ContainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.ContainsRequest,
      atomix.storage.set.Set.ContainsResponse> getContainsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.ContainsRequest, atomix.storage.set.Set.ContainsResponse> getContainsMethod;
    if ((getContainsMethod = SetServiceGrpc.getContainsMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getContainsMethod = SetServiceGrpc.getContainsMethod) == null) {
          SetServiceGrpc.getContainsMethod = getContainsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.ContainsRequest, atomix.storage.set.Set.ContainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Contains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.ContainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.ContainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Contains"))
              .build();
        }
      }
    }
    return getContainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.AddRequest,
      atomix.storage.set.Set.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = atomix.storage.set.Set.AddRequest.class,
      responseType = atomix.storage.set.Set.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.AddRequest,
      atomix.storage.set.Set.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.AddRequest, atomix.storage.set.Set.AddResponse> getAddMethod;
    if ((getAddMethod = SetServiceGrpc.getAddMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getAddMethod = SetServiceGrpc.getAddMethod) == null) {
          SetServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.AddRequest, atomix.storage.set.Set.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.RemoveRequest,
      atomix.storage.set.Set.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.storage.set.Set.RemoveRequest.class,
      responseType = atomix.storage.set.Set.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.RemoveRequest,
      atomix.storage.set.Set.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.RemoveRequest, atomix.storage.set.Set.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = SetServiceGrpc.getRemoveMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getRemoveMethod = SetServiceGrpc.getRemoveMethod) == null) {
          SetServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.RemoveRequest, atomix.storage.set.Set.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.ClearRequest,
      atomix.storage.set.Set.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.storage.set.Set.ClearRequest.class,
      responseType = atomix.storage.set.Set.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.ClearRequest,
      atomix.storage.set.Set.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.ClearRequest, atomix.storage.set.Set.ClearResponse> getClearMethod;
    if ((getClearMethod = SetServiceGrpc.getClearMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getClearMethod = SetServiceGrpc.getClearMethod) == null) {
          SetServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.ClearRequest, atomix.storage.set.Set.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.EventRequest,
      atomix.storage.set.Set.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.storage.set.Set.EventRequest.class,
      responseType = atomix.storage.set.Set.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.EventRequest,
      atomix.storage.set.Set.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.EventRequest, atomix.storage.set.Set.EventResponse> getEventsMethod;
    if ((getEventsMethod = SetServiceGrpc.getEventsMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getEventsMethod = SetServiceGrpc.getEventsMethod) == null) {
          SetServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.EventRequest, atomix.storage.set.Set.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.set.Set.IterateRequest,
      atomix.storage.set.Set.IterateResponse> getIterateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Iterate",
      requestType = atomix.storage.set.Set.IterateRequest.class,
      responseType = atomix.storage.set.Set.IterateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.set.Set.IterateRequest,
      atomix.storage.set.Set.IterateResponse> getIterateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.set.Set.IterateRequest, atomix.storage.set.Set.IterateResponse> getIterateMethod;
    if ((getIterateMethod = SetServiceGrpc.getIterateMethod) == null) {
      synchronized (SetServiceGrpc.class) {
        if ((getIterateMethod = SetServiceGrpc.getIterateMethod) == null) {
          SetServiceGrpc.getIterateMethod = getIterateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.set.Set.IterateRequest, atomix.storage.set.Set.IterateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Iterate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.IterateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.set.Set.IterateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SetServiceMethodDescriptorSupplier("Iterate"))
              .build();
        }
      }
    }
    return getIterateMethod;
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
     * Create creates a set session
     * </pre>
     */
    public void create(atomix.storage.set.Set.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a set
     * </pre>
     */
    public void close(atomix.storage.set.Set.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public void size(atomix.storage.set.Set.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.SizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public void contains(atomix.storage.set.Set.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.ContainsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public void add(atomix.storage.set.Set.AddRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.AddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public void remove(atomix.storage.set.Set.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.RemoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public void clear(atomix.storage.set.Set.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.ClearResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public void events(atomix.storage.set.Set.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Iterate iterates through all values in the set
     * </pre>
     */
    public void iterate(atomix.storage.set.Set.IterateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.IterateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIterateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.CreateRequest,
                atomix.storage.set.Set.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.CloseRequest,
                atomix.storage.set.Set.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.SizeRequest,
                atomix.storage.set.Set.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getContainsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.ContainsRequest,
                atomix.storage.set.Set.ContainsResponse>(
                  this, METHODID_CONTAINS)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.AddRequest,
                atomix.storage.set.Set.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.RemoveRequest,
                atomix.storage.set.Set.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.set.Set.ClearRequest,
                atomix.storage.set.Set.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.set.Set.EventRequest,
                atomix.storage.set.Set.EventResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getIterateMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.set.Set.IterateRequest,
                atomix.storage.set.Set.IterateResponse>(
                  this, METHODID_ITERATE)))
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
     * Create creates a set session
     * </pre>
     */
    public void create(atomix.storage.set.Set.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a set
     * </pre>
     */
    public void close(atomix.storage.set.Set.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public void size(atomix.storage.set.Set.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.SizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public void contains(atomix.storage.set.Set.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.ContainsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public void add(atomix.storage.set.Set.AddRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.AddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public void remove(atomix.storage.set.Set.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.RemoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public void clear(atomix.storage.set.Set.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.ClearResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public void events(atomix.storage.set.Set.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Iterate iterates through all values in the set
     * </pre>
     */
    public void iterate(atomix.storage.set.Set.IterateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.set.Set.IterateResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getIterateMethod(), getCallOptions()), request, responseObserver);
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
     * Create creates a set session
     * </pre>
     */
    public atomix.storage.set.Set.CreateResponse create(atomix.storage.set.Set.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a set
     * </pre>
     */
    public atomix.storage.set.Set.CloseResponse close(atomix.storage.set.Set.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public atomix.storage.set.Set.SizeResponse size(atomix.storage.set.Set.SizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public atomix.storage.set.Set.ContainsResponse contains(atomix.storage.set.Set.ContainsRequest request) {
      return blockingUnaryCall(
          getChannel(), getContainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public atomix.storage.set.Set.AddResponse add(atomix.storage.set.Set.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public atomix.storage.set.Set.RemoveResponse remove(atomix.storage.set.Set.RemoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public atomix.storage.set.Set.ClearResponse clear(atomix.storage.set.Set.ClearRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for set change events
     * </pre>
     */
    public java.util.Iterator<atomix.storage.set.Set.EventResponse> events(
        atomix.storage.set.Set.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Iterate iterates through all values in the set
     * </pre>
     */
    public java.util.Iterator<atomix.storage.set.Set.IterateResponse> iterate(
        atomix.storage.set.Set.IterateRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getIterateMethod(), getCallOptions(), request);
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
     * Create creates a set session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.CreateResponse> create(
        atomix.storage.set.Set.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.CloseResponse> close(
        atomix.storage.set.Set.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Size gets the number of elements in the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.SizeResponse> size(
        atomix.storage.set.Set.SizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Contains returns whether the set contains a value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.ContainsResponse> contains(
        atomix.storage.set.Set.ContainsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add adds a value to the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.AddResponse> add(
        atomix.storage.set.Set.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes a value from the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.RemoveResponse> remove(
        atomix.storage.set.Set.RemoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all values from the set
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.set.Set.ClearResponse> clear(
        atomix.storage.set.Set.ClearRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SIZE = 2;
  private static final int METHODID_CONTAINS = 3;
  private static final int METHODID_ADD = 4;
  private static final int METHODID_REMOVE = 5;
  private static final int METHODID_CLEAR = 6;
  private static final int METHODID_EVENTS = 7;
  private static final int METHODID_ITERATE = 8;

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
        case METHODID_CREATE:
          serviceImpl.create((atomix.storage.set.Set.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.storage.set.Set.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.CloseResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((atomix.storage.set.Set.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.SizeResponse>) responseObserver);
          break;
        case METHODID_CONTAINS:
          serviceImpl.contains((atomix.storage.set.Set.ContainsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.ContainsResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((atomix.storage.set.Set.AddRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.AddResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.storage.set.Set.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.storage.set.Set.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.storage.set.Set.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.EventResponse>) responseObserver);
          break;
        case METHODID_ITERATE:
          serviceImpl.iterate((atomix.storage.set.Set.IterateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.set.Set.IterateResponse>) responseObserver);
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
      return atomix.storage.set.Set.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSizeMethod())
              .addMethod(getContainsMethod())
              .addMethod(getAddMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getClearMethod())
              .addMethod(getEventsMethod())
              .addMethod(getIterateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
