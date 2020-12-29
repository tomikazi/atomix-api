package atomix.leader;

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
 * Leader latch service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/leader/latch.proto")
public final class LeaderLatchServiceGrpc {

  private LeaderLatchServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.leader.LeaderLatchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.CreateRequest,
      atomix.leader.LatchOuterClass.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.leader.LatchOuterClass.CreateRequest.class,
      responseType = atomix.leader.LatchOuterClass.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.CreateRequest,
      atomix.leader.LatchOuterClass.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.CreateRequest, atomix.leader.LatchOuterClass.CreateResponse> getCreateMethod;
    if ((getCreateMethod = LeaderLatchServiceGrpc.getCreateMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getCreateMethod = LeaderLatchServiceGrpc.getCreateMethod) == null) {
          LeaderLatchServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.leader.LatchOuterClass.CreateRequest, atomix.leader.LatchOuterClass.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.CloseRequest,
      atomix.leader.LatchOuterClass.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.leader.LatchOuterClass.CloseRequest.class,
      responseType = atomix.leader.LatchOuterClass.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.CloseRequest,
      atomix.leader.LatchOuterClass.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.CloseRequest, atomix.leader.LatchOuterClass.CloseResponse> getCloseMethod;
    if ((getCloseMethod = LeaderLatchServiceGrpc.getCloseMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getCloseMethod = LeaderLatchServiceGrpc.getCloseMethod) == null) {
          LeaderLatchServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.leader.LatchOuterClass.CloseRequest, atomix.leader.LatchOuterClass.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.LatchRequest,
      atomix.leader.LatchOuterClass.LatchResponse> getLatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Latch",
      requestType = atomix.leader.LatchOuterClass.LatchRequest.class,
      responseType = atomix.leader.LatchOuterClass.LatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.LatchRequest,
      atomix.leader.LatchOuterClass.LatchResponse> getLatchMethod() {
    io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.LatchRequest, atomix.leader.LatchOuterClass.LatchResponse> getLatchMethod;
    if ((getLatchMethod = LeaderLatchServiceGrpc.getLatchMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getLatchMethod = LeaderLatchServiceGrpc.getLatchMethod) == null) {
          LeaderLatchServiceGrpc.getLatchMethod = getLatchMethod =
              io.grpc.MethodDescriptor.<atomix.leader.LatchOuterClass.LatchRequest, atomix.leader.LatchOuterClass.LatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Latch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.LatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.LatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Latch"))
              .build();
        }
      }
    }
    return getLatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.GetRequest,
      atomix.leader.LatchOuterClass.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.leader.LatchOuterClass.GetRequest.class,
      responseType = atomix.leader.LatchOuterClass.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.GetRequest,
      atomix.leader.LatchOuterClass.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.GetRequest, atomix.leader.LatchOuterClass.GetResponse> getGetMethod;
    if ((getGetMethod = LeaderLatchServiceGrpc.getGetMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getGetMethod = LeaderLatchServiceGrpc.getGetMethod) == null) {
          LeaderLatchServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.leader.LatchOuterClass.GetRequest, atomix.leader.LatchOuterClass.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.EventRequest,
      atomix.leader.LatchOuterClass.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.leader.LatchOuterClass.EventRequest.class,
      responseType = atomix.leader.LatchOuterClass.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.EventRequest,
      atomix.leader.LatchOuterClass.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.leader.LatchOuterClass.EventRequest, atomix.leader.LatchOuterClass.EventResponse> getEventsMethod;
    if ((getEventsMethod = LeaderLatchServiceGrpc.getEventsMethod) == null) {
      synchronized (LeaderLatchServiceGrpc.class) {
        if ((getEventsMethod = LeaderLatchServiceGrpc.getEventsMethod) == null) {
          LeaderLatchServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.leader.LatchOuterClass.EventRequest, atomix.leader.LatchOuterClass.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.leader.LatchOuterClass.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderLatchServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderLatchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceStub>() {
        @java.lang.Override
        public LeaderLatchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchServiceStub(channel, callOptions);
        }
      };
    return LeaderLatchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderLatchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceBlockingStub>() {
        @java.lang.Override
        public LeaderLatchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchServiceBlockingStub(channel, callOptions);
        }
      };
    return LeaderLatchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderLatchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderLatchServiceFutureStub>() {
        @java.lang.Override
        public LeaderLatchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderLatchServiceFutureStub(channel, callOptions);
        }
      };
    return LeaderLatchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static abstract class LeaderLatchServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a leader latch
     * </pre>
     */
    public void create(atomix.leader.LatchOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a leader latch
     * </pre>
     */
    public void close(atomix.leader.LatchOuterClass.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public void latch(atomix.leader.LatchOuterClass.LatchRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.LatchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public void get(atomix.leader.LatchOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public void events(atomix.leader.LatchOuterClass.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.leader.LatchOuterClass.CreateRequest,
                atomix.leader.LatchOuterClass.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.leader.LatchOuterClass.CloseRequest,
                atomix.leader.LatchOuterClass.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getLatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.leader.LatchOuterClass.LatchRequest,
                atomix.leader.LatchOuterClass.LatchResponse>(
                  this, METHODID_LATCH)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.leader.LatchOuterClass.GetRequest,
                atomix.leader.LatchOuterClass.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.leader.LatchOuterClass.EventRequest,
                atomix.leader.LatchOuterClass.EventResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static final class LeaderLatchServiceStub extends io.grpc.stub.AbstractAsyncStub<LeaderLatchServiceStub> {
    private LeaderLatchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a leader latch
     * </pre>
     */
    public void create(atomix.leader.LatchOuterClass.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a leader latch
     * </pre>
     */
    public void close(atomix.leader.LatchOuterClass.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public void latch(atomix.leader.LatchOuterClass.LatchRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.LatchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public void get(atomix.leader.LatchOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public void events(atomix.leader.LatchOuterClass.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static final class LeaderLatchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderLatchServiceBlockingStub> {
    private LeaderLatchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a leader latch
     * </pre>
     */
    public atomix.leader.LatchOuterClass.CreateResponse create(atomix.leader.LatchOuterClass.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a leader latch
     * </pre>
     */
    public atomix.leader.LatchOuterClass.CloseResponse close(atomix.leader.LatchOuterClass.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public atomix.leader.LatchOuterClass.LatchResponse latch(atomix.leader.LatchOuterClass.LatchRequest request) {
      return blockingUnaryCall(
          getChannel(), getLatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public atomix.leader.LatchOuterClass.GetResponse get(atomix.leader.LatchOuterClass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for leader change events
     * </pre>
     */
    public java.util.Iterator<atomix.leader.LatchOuterClass.EventResponse> events(
        atomix.leader.LatchOuterClass.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Leader latch service
   * </pre>
   */
  public static final class LeaderLatchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderLatchServiceFutureStub> {
    private LeaderLatchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderLatchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderLatchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a leader latch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.leader.LatchOuterClass.CreateResponse> create(
        atomix.leader.LatchOuterClass.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a leader latch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.leader.LatchOuterClass.CloseResponse> close(
        atomix.leader.LatchOuterClass.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Latch attempts to acquire the leader latch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.leader.LatchOuterClass.LatchResponse> latch(
        atomix.leader.LatchOuterClass.LatchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the current leader
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.leader.LatchOuterClass.GetResponse> get(
        atomix.leader.LatchOuterClass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_LATCH = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_EVENTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LeaderLatchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderLatchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.leader.LatchOuterClass.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.leader.LatchOuterClass.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.CloseResponse>) responseObserver);
          break;
        case METHODID_LATCH:
          serviceImpl.latch((atomix.leader.LatchOuterClass.LatchRequest) request,
              (io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.LatchResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.leader.LatchOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.GetResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.leader.LatchOuterClass.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.leader.LatchOuterClass.EventResponse>) responseObserver);
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

  private static abstract class LeaderLatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderLatchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.leader.LatchOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderLatchService");
    }
  }

  private static final class LeaderLatchServiceFileDescriptorSupplier
      extends LeaderLatchServiceBaseDescriptorSupplier {
    LeaderLatchServiceFileDescriptorSupplier() {}
  }

  private static final class LeaderLatchServiceMethodDescriptorSupplier
      extends LeaderLatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderLatchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderLatchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderLatchServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getLatchMethod())
              .addMethod(getGetMethod())
              .addMethod(getEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
