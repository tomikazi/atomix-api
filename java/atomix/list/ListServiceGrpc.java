package atomix.list;

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
 * ListService implements a distributed list
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/list/list.proto")
public final class ListServiceGrpc {

  private ListServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.list.ListService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.list.List.CreateRequest,
      atomix.list.List.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.list.List.CreateRequest.class,
      responseType = atomix.list.List.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.CreateRequest,
      atomix.list.List.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.CreateRequest, atomix.list.List.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ListServiceGrpc.getCreateMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getCreateMethod = ListServiceGrpc.getCreateMethod) == null) {
          ListServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.CreateRequest, atomix.list.List.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.CloseRequest,
      atomix.list.List.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.list.List.CloseRequest.class,
      responseType = atomix.list.List.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.CloseRequest,
      atomix.list.List.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.CloseRequest, atomix.list.List.CloseResponse> getCloseMethod;
    if ((getCloseMethod = ListServiceGrpc.getCloseMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getCloseMethod = ListServiceGrpc.getCloseMethod) == null) {
          ListServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.CloseRequest, atomix.list.List.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.SizeRequest,
      atomix.list.List.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.list.List.SizeRequest.class,
      responseType = atomix.list.List.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.SizeRequest,
      atomix.list.List.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.SizeRequest, atomix.list.List.SizeResponse> getSizeMethod;
    if ((getSizeMethod = ListServiceGrpc.getSizeMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getSizeMethod = ListServiceGrpc.getSizeMethod) == null) {
          ListServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.SizeRequest, atomix.list.List.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.ContainsRequest,
      atomix.list.List.ContainsResponse> getContainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Contains",
      requestType = atomix.list.List.ContainsRequest.class,
      responseType = atomix.list.List.ContainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.ContainsRequest,
      atomix.list.List.ContainsResponse> getContainsMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.ContainsRequest, atomix.list.List.ContainsResponse> getContainsMethod;
    if ((getContainsMethod = ListServiceGrpc.getContainsMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getContainsMethod = ListServiceGrpc.getContainsMethod) == null) {
          ListServiceGrpc.getContainsMethod = getContainsMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.ContainsRequest, atomix.list.List.ContainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Contains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.ContainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.ContainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Contains"))
              .build();
        }
      }
    }
    return getContainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.AppendRequest,
      atomix.list.List.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = atomix.list.List.AppendRequest.class,
      responseType = atomix.list.List.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.AppendRequest,
      atomix.list.List.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.AppendRequest, atomix.list.List.AppendResponse> getAppendMethod;
    if ((getAppendMethod = ListServiceGrpc.getAppendMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getAppendMethod = ListServiceGrpc.getAppendMethod) == null) {
          ListServiceGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.AppendRequest, atomix.list.List.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.InsertRequest,
      atomix.list.List.InsertResponse> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Insert",
      requestType = atomix.list.List.InsertRequest.class,
      responseType = atomix.list.List.InsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.InsertRequest,
      atomix.list.List.InsertResponse> getInsertMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.InsertRequest, atomix.list.List.InsertResponse> getInsertMethod;
    if ((getInsertMethod = ListServiceGrpc.getInsertMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getInsertMethod = ListServiceGrpc.getInsertMethod) == null) {
          ListServiceGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.InsertRequest, atomix.list.List.InsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.InsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.InsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.GetRequest,
      atomix.list.List.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.list.List.GetRequest.class,
      responseType = atomix.list.List.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.GetRequest,
      atomix.list.List.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.GetRequest, atomix.list.List.GetResponse> getGetMethod;
    if ((getGetMethod = ListServiceGrpc.getGetMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getGetMethod = ListServiceGrpc.getGetMethod) == null) {
          ListServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.GetRequest, atomix.list.List.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.SetRequest,
      atomix.list.List.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = atomix.list.List.SetRequest.class,
      responseType = atomix.list.List.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.SetRequest,
      atomix.list.List.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.SetRequest, atomix.list.List.SetResponse> getSetMethod;
    if ((getSetMethod = ListServiceGrpc.getSetMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getSetMethod = ListServiceGrpc.getSetMethod) == null) {
          ListServiceGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.SetRequest, atomix.list.List.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.RemoveRequest,
      atomix.list.List.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.list.List.RemoveRequest.class,
      responseType = atomix.list.List.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.RemoveRequest,
      atomix.list.List.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.RemoveRequest, atomix.list.List.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = ListServiceGrpc.getRemoveMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getRemoveMethod = ListServiceGrpc.getRemoveMethod) == null) {
          ListServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.RemoveRequest, atomix.list.List.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.ClearRequest,
      atomix.list.List.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.list.List.ClearRequest.class,
      responseType = atomix.list.List.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.list.List.ClearRequest,
      atomix.list.List.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.ClearRequest, atomix.list.List.ClearResponse> getClearMethod;
    if ((getClearMethod = ListServiceGrpc.getClearMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getClearMethod = ListServiceGrpc.getClearMethod) == null) {
          ListServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.ClearRequest, atomix.list.List.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.EventRequest,
      atomix.list.List.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.list.List.EventRequest.class,
      responseType = atomix.list.List.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.list.List.EventRequest,
      atomix.list.List.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.EventRequest, atomix.list.List.EventResponse> getEventsMethod;
    if ((getEventsMethod = ListServiceGrpc.getEventsMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getEventsMethod = ListServiceGrpc.getEventsMethod) == null) {
          ListServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.EventRequest, atomix.list.List.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.list.List.IterateRequest,
      atomix.list.List.IterateResponse> getIterateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Iterate",
      requestType = atomix.list.List.IterateRequest.class,
      responseType = atomix.list.List.IterateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.list.List.IterateRequest,
      atomix.list.List.IterateResponse> getIterateMethod() {
    io.grpc.MethodDescriptor<atomix.list.List.IterateRequest, atomix.list.List.IterateResponse> getIterateMethod;
    if ((getIterateMethod = ListServiceGrpc.getIterateMethod) == null) {
      synchronized (ListServiceGrpc.class) {
        if ((getIterateMethod = ListServiceGrpc.getIterateMethod) == null) {
          ListServiceGrpc.getIterateMethod = getIterateMethod =
              io.grpc.MethodDescriptor.<atomix.list.List.IterateRequest, atomix.list.List.IterateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Iterate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.IterateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.list.List.IterateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ListServiceMethodDescriptorSupplier("Iterate"))
              .build();
        }
      }
    }
    return getIterateMethod;
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
     * Create creates a list session
     * </pre>
     */
    public void create(atomix.list.List.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a list
     * </pre>
     */
    public void close(atomix.list.List.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public void size(atomix.list.List.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.SizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the list contains a value
     * </pre>
     */
    public void contains(atomix.list.List.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.ContainsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public void append(atomix.list.List.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.AppendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public void insert(atomix.list.List.InsertRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.InsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public void get(atomix.list.List.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public void set(atomix.list.List.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.SetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public void remove(atomix.list.List.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.RemoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public void clear(atomix.list.List.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.ClearResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.list.List.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Iterate streams all values in the list
     * </pre>
     */
    public void iterate(atomix.list.List.IterateRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.IterateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIterateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.CreateRequest,
                atomix.list.List.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.CloseRequest,
                atomix.list.List.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.SizeRequest,
                atomix.list.List.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getContainsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.ContainsRequest,
                atomix.list.List.ContainsResponse>(
                  this, METHODID_CONTAINS)))
          .addMethod(
            getAppendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.AppendRequest,
                atomix.list.List.AppendResponse>(
                  this, METHODID_APPEND)))
          .addMethod(
            getInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.InsertRequest,
                atomix.list.List.InsertResponse>(
                  this, METHODID_INSERT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.GetRequest,
                atomix.list.List.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.SetRequest,
                atomix.list.List.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.RemoveRequest,
                atomix.list.List.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.list.List.ClearRequest,
                atomix.list.List.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.list.List.EventRequest,
                atomix.list.List.EventResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getIterateMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.list.List.IterateRequest,
                atomix.list.List.IterateResponse>(
                  this, METHODID_ITERATE)))
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
     * Create creates a list session
     * </pre>
     */
    public void create(atomix.list.List.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a list
     * </pre>
     */
    public void close(atomix.list.List.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public void size(atomix.list.List.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.SizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Contains returns whether the list contains a value
     * </pre>
     */
    public void contains(atomix.list.List.ContainsRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.ContainsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public void append(atomix.list.List.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.AppendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public void insert(atomix.list.List.InsertRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.InsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public void get(atomix.list.List.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public void set(atomix.list.List.SetRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.SetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public void remove(atomix.list.List.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.RemoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public void clear(atomix.list.List.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.ClearResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.list.List.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Iterate streams all values in the list
     * </pre>
     */
    public void iterate(atomix.list.List.IterateRequest request,
        io.grpc.stub.StreamObserver<atomix.list.List.IterateResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getIterateMethod(), getCallOptions()), request, responseObserver);
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
     * Create creates a list session
     * </pre>
     */
    public atomix.list.List.CreateResponse create(atomix.list.List.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a list
     * </pre>
     */
    public atomix.list.List.CloseResponse close(atomix.list.List.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public atomix.list.List.SizeResponse size(atomix.list.List.SizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Contains returns whether the list contains a value
     * </pre>
     */
    public atomix.list.List.ContainsResponse contains(atomix.list.List.ContainsRequest request) {
      return blockingUnaryCall(
          getChannel(), getContainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public atomix.list.List.AppendResponse append(atomix.list.List.AppendRequest request) {
      return blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public atomix.list.List.InsertResponse insert(atomix.list.List.InsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public atomix.list.List.GetResponse get(atomix.list.List.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public atomix.list.List.SetResponse set(atomix.list.List.SetRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public atomix.list.List.RemoveResponse remove(atomix.list.List.RemoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public atomix.list.List.ClearResponse clear(atomix.list.List.ClearRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.list.List.EventResponse> events(
        atomix.list.List.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Iterate streams all values in the list
     * </pre>
     */
    public java.util.Iterator<atomix.list.List.IterateResponse> iterate(
        atomix.list.List.IterateRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getIterateMethod(), getCallOptions(), request);
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
     * Create creates a list session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.CreateResponse> create(
        atomix.list.List.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.CloseResponse> close(
        atomix.list.List.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Size gets the number of elements in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.SizeResponse> size(
        atomix.list.List.SizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Contains returns whether the list contains a value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.ContainsResponse> contains(
        atomix.list.List.ContainsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getContainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Append appends a value to the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.AppendResponse> append(
        atomix.list.List.AppendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Insert inserts a value at a specific index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.InsertResponse> insert(
        atomix.list.List.InsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the value at an index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.GetResponse> get(
        atomix.list.List.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set sets the value at an index in the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.SetResponse> set(
        atomix.list.List.SetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an element from the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.RemoveResponse> remove(
        atomix.list.List.RemoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all elements from the list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.list.List.ClearResponse> clear(
        atomix.list.List.ClearRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SIZE = 2;
  private static final int METHODID_CONTAINS = 3;
  private static final int METHODID_APPEND = 4;
  private static final int METHODID_INSERT = 5;
  private static final int METHODID_GET = 6;
  private static final int METHODID_SET = 7;
  private static final int METHODID_REMOVE = 8;
  private static final int METHODID_CLEAR = 9;
  private static final int METHODID_EVENTS = 10;
  private static final int METHODID_ITERATE = 11;

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
        case METHODID_CREATE:
          serviceImpl.create((atomix.list.List.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.list.List.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.CloseResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((atomix.list.List.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.SizeResponse>) responseObserver);
          break;
        case METHODID_CONTAINS:
          serviceImpl.contains((atomix.list.List.ContainsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.ContainsResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((atomix.list.List.AppendRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.AppendResponse>) responseObserver);
          break;
        case METHODID_INSERT:
          serviceImpl.insert((atomix.list.List.InsertRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.InsertResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.list.List.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.GetResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((atomix.list.List.SetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.SetResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.list.List.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.list.List.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.list.List.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.EventResponse>) responseObserver);
          break;
        case METHODID_ITERATE:
          serviceImpl.iterate((atomix.list.List.IterateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.list.List.IterateResponse>) responseObserver);
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
      return atomix.list.List.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSizeMethod())
              .addMethod(getContainsMethod())
              .addMethod(getAppendMethod())
              .addMethod(getInsertMethod())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
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
