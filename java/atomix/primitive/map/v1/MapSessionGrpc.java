package atomix.primitive.map.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MapSession is a service for managing map sessions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/map/v1/session.proto")
public final class MapSessionGrpc {

  private MapSessionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.map.v1.MapSession";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Session.OpenSessionRequest,
      atomix.primitive.map.v1.Session.OpenSessionResponse> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = atomix.primitive.map.v1.Session.OpenSessionRequest.class,
      responseType = atomix.primitive.map.v1.Session.OpenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Session.OpenSessionRequest,
      atomix.primitive.map.v1.Session.OpenSessionResponse> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Session.OpenSessionRequest, atomix.primitive.map.v1.Session.OpenSessionResponse> getOpenSessionMethod;
    if ((getOpenSessionMethod = MapSessionGrpc.getOpenSessionMethod) == null) {
      synchronized (MapSessionGrpc.class) {
        if ((getOpenSessionMethod = MapSessionGrpc.getOpenSessionMethod) == null) {
          MapSessionGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Session.OpenSessionRequest, atomix.primitive.map.v1.Session.OpenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Session.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Session.OpenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapSessionMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.map.v1.Session.CloseSessionRequest,
      atomix.primitive.map.v1.Session.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = atomix.primitive.map.v1.Session.CloseSessionRequest.class,
      responseType = atomix.primitive.map.v1.Session.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.map.v1.Session.CloseSessionRequest,
      atomix.primitive.map.v1.Session.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.map.v1.Session.CloseSessionRequest, atomix.primitive.map.v1.Session.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = MapSessionGrpc.getCloseSessionMethod) == null) {
      synchronized (MapSessionGrpc.class) {
        if ((getCloseSessionMethod = MapSessionGrpc.getCloseSessionMethod) == null) {
          MapSessionGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.map.v1.Session.CloseSessionRequest, atomix.primitive.map.v1.Session.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Session.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.map.v1.Session.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MapSessionMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapSessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapSessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapSessionStub>() {
        @java.lang.Override
        public MapSessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapSessionStub(channel, callOptions);
        }
      };
    return MapSessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapSessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapSessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapSessionBlockingStub>() {
        @java.lang.Override
        public MapSessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapSessionBlockingStub(channel, callOptions);
        }
      };
    return MapSessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapSessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MapSessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MapSessionFutureStub>() {
        @java.lang.Override
        public MapSessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MapSessionFutureStub(channel, callOptions);
        }
      };
    return MapSessionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MapSession is a service for managing map sessions
   * </pre>
   */
  public static abstract class MapSessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void openSession(atomix.primitive.map.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.map.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOpenSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Session.OpenSessionRequest,
                atomix.primitive.map.v1.Session.OpenSessionResponse>(
                  this, METHODID_OPEN_SESSION)))
          .addMethod(
            getCloseSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.map.v1.Session.CloseSessionRequest,
                atomix.primitive.map.v1.Session.CloseSessionResponse>(
                  this, METHODID_CLOSE_SESSION)))
          .build();
    }
  }

  /**
   * <pre>
   * MapSession is a service for managing map sessions
   * </pre>
   */
  public static final class MapSessionStub extends io.grpc.stub.AbstractAsyncStub<MapSessionStub> {
    private MapSessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapSessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapSessionStub(channel, callOptions);
    }

    /**
     */
    public void openSession(atomix.primitive.map.v1.Session.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Session.OpenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeSession(atomix.primitive.map.v1.Session.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Session.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MapSession is a service for managing map sessions
   * </pre>
   */
  public static final class MapSessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<MapSessionBlockingStub> {
    private MapSessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapSessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapSessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.primitive.map.v1.Session.OpenSessionResponse openSession(atomix.primitive.map.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.primitive.map.v1.Session.CloseSessionResponse closeSession(atomix.primitive.map.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MapSession is a service for managing map sessions
   * </pre>
   */
  public static final class MapSessionFutureStub extends io.grpc.stub.AbstractFutureStub<MapSessionFutureStub> {
    private MapSessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapSessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MapSessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Session.OpenSessionResponse> openSession(
        atomix.primitive.map.v1.Session.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.map.v1.Session.CloseSessionResponse> closeSession(
        atomix.primitive.map.v1.Session.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_SESSION = 0;
  private static final int METHODID_CLOSE_SESSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapSessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapSessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((atomix.primitive.map.v1.Session.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Session.OpenSessionResponse>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((atomix.primitive.map.v1.Session.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.map.v1.Session.CloseSessionResponse>) responseObserver);
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

  private static abstract class MapSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapSessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.map.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MapSession");
    }
  }

  private static final class MapSessionFileDescriptorSupplier
      extends MapSessionBaseDescriptorSupplier {
    MapSessionFileDescriptorSupplier() {}
  }

  private static final class MapSessionMethodDescriptorSupplier
      extends MapSessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapSessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (MapSessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapSessionFileDescriptorSupplier())
              .addMethod(getOpenSessionMethod())
              .addMethod(getCloseSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
