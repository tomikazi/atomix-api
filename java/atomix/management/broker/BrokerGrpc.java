package atomix.management.broker;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/management/broker/broker.proto")
public final class BrokerGrpc {

  private BrokerGrpc() {}

  public static final String SERVICE_NAME = "atomix.management.broker.Broker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest,
      atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse> getRegisterPrimitiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPrimitive",
      requestType = atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest.class,
      responseType = atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest,
      atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse> getRegisterPrimitiveMethod() {
    io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest, atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse> getRegisterPrimitiveMethod;
    if ((getRegisterPrimitiveMethod = BrokerGrpc.getRegisterPrimitiveMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getRegisterPrimitiveMethod = BrokerGrpc.getRegisterPrimitiveMethod) == null) {
          BrokerGrpc.getRegisterPrimitiveMethod = getRegisterPrimitiveMethod =
              io.grpc.MethodDescriptor.<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest, atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPrimitive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("RegisterPrimitive"))
              .build();
        }
      }
    }
    return getRegisterPrimitiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest,
      atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse> getUnregisterPrimitiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterPrimitive",
      requestType = atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest.class,
      responseType = atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest,
      atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse> getUnregisterPrimitiveMethod() {
    io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest, atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse> getUnregisterPrimitiveMethod;
    if ((getUnregisterPrimitiveMethod = BrokerGrpc.getUnregisterPrimitiveMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getUnregisterPrimitiveMethod = BrokerGrpc.getUnregisterPrimitiveMethod) == null) {
          BrokerGrpc.getUnregisterPrimitiveMethod = getUnregisterPrimitiveMethod =
              io.grpc.MethodDescriptor.<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest, atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterPrimitive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("UnregisterPrimitive"))
              .build();
        }
      }
    }
    return getUnregisterPrimitiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest,
      atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse> getLookupPrimitiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupPrimitive",
      requestType = atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest.class,
      responseType = atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest,
      atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse> getLookupPrimitiveMethod() {
    io.grpc.MethodDescriptor<atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest, atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse> getLookupPrimitiveMethod;
    if ((getLookupPrimitiveMethod = BrokerGrpc.getLookupPrimitiveMethod) == null) {
      synchronized (BrokerGrpc.class) {
        if ((getLookupPrimitiveMethod = BrokerGrpc.getLookupPrimitiveMethod) == null) {
          BrokerGrpc.getLookupPrimitiveMethod = getLookupPrimitiveMethod =
              io.grpc.MethodDescriptor.<atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest, atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupPrimitive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BrokerMethodDescriptorSupplier("LookupPrimitive"))
              .build();
        }
      }
    }
    return getLookupPrimitiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerStub>() {
        @java.lang.Override
        public BrokerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerStub(channel, callOptions);
        }
      };
    return BrokerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerBlockingStub>() {
        @java.lang.Override
        public BrokerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerBlockingStub(channel, callOptions);
        }
      };
    return BrokerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BrokerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BrokerFutureStub>() {
        @java.lang.Override
        public BrokerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BrokerFutureStub(channel, callOptions);
        }
      };
    return BrokerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BrokerImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerPrimitive(atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPrimitiveMethod(), responseObserver);
    }

    /**
     */
    public void unregisterPrimitive(atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterPrimitiveMethod(), responseObserver);
    }

    /**
     */
    public void lookupPrimitive(atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupPrimitiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterPrimitiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest,
                atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse>(
                  this, METHODID_REGISTER_PRIMITIVE)))
          .addMethod(
            getUnregisterPrimitiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest,
                atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse>(
                  this, METHODID_UNREGISTER_PRIMITIVE)))
          .addMethod(
            getLookupPrimitiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest,
                atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse>(
                  this, METHODID_LOOKUP_PRIMITIVE)))
          .build();
    }
  }

  /**
   */
  public static final class BrokerStub extends io.grpc.stub.AbstractAsyncStub<BrokerStub> {
    private BrokerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerStub(channel, callOptions);
    }

    /**
     */
    public void registerPrimitive(atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPrimitiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterPrimitive(atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterPrimitiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookupPrimitive(atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest request,
        io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupPrimitiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BrokerBlockingStub extends io.grpc.stub.AbstractBlockingStub<BrokerBlockingStub> {
    private BrokerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse registerPrimitive(atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPrimitiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse unregisterPrimitive(atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterPrimitiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse lookupPrimitive(atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupPrimitiveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BrokerFutureStub extends io.grpc.stub.AbstractFutureStub<BrokerFutureStub> {
    private BrokerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BrokerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse> registerPrimitive(
        atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPrimitiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse> unregisterPrimitive(
        atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterPrimitiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse> lookupPrimitive(
        atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupPrimitiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PRIMITIVE = 0;
  private static final int METHODID_UNREGISTER_PRIMITIVE = 1;
  private static final int METHODID_LOOKUP_PRIMITIVE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PRIMITIVE:
          serviceImpl.registerPrimitive((atomix.management.broker.BrokerOuterClass.RegisterPrimitiveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.RegisterPrimitiveResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_PRIMITIVE:
          serviceImpl.unregisterPrimitive((atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.UnregisterPrimitiveResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_PRIMITIVE:
          serviceImpl.lookupPrimitive((atomix.management.broker.BrokerOuterClass.LookupPrimitiveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.broker.BrokerOuterClass.LookupPrimitiveResponse>) responseObserver);
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

  private static abstract class BrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BrokerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.management.broker.BrokerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Broker");
    }
  }

  private static final class BrokerFileDescriptorSupplier
      extends BrokerBaseDescriptorSupplier {
    BrokerFileDescriptorSupplier() {}
  }

  private static final class BrokerMethodDescriptorSupplier
      extends BrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BrokerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BrokerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerFileDescriptorSupplier())
              .addMethod(getRegisterPrimitiveMethod())
              .addMethod(getUnregisterPrimitiveMethod())
              .addMethod(getLookupPrimitiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
