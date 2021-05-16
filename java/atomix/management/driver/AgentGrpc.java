package atomix.management.driver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/management/driver/agent.proto")
public final class AgentGrpc {

  private AgentGrpc() {}

  public static final String SERVICE_NAME = "atomix.management.driver.Agent";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.management.driver.AgentOuterClass.CreateProxyRequest,
      atomix.management.driver.AgentOuterClass.CreateProxyResponse> getCreateProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProxy",
      requestType = atomix.management.driver.AgentOuterClass.CreateProxyRequest.class,
      responseType = atomix.management.driver.AgentOuterClass.CreateProxyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.driver.AgentOuterClass.CreateProxyRequest,
      atomix.management.driver.AgentOuterClass.CreateProxyResponse> getCreateProxyMethod() {
    io.grpc.MethodDescriptor<atomix.management.driver.AgentOuterClass.CreateProxyRequest, atomix.management.driver.AgentOuterClass.CreateProxyResponse> getCreateProxyMethod;
    if ((getCreateProxyMethod = AgentGrpc.getCreateProxyMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getCreateProxyMethod = AgentGrpc.getCreateProxyMethod) == null) {
          AgentGrpc.getCreateProxyMethod = getCreateProxyMethod =
              io.grpc.MethodDescriptor.<atomix.management.driver.AgentOuterClass.CreateProxyRequest, atomix.management.driver.AgentOuterClass.CreateProxyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.AgentOuterClass.CreateProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.AgentOuterClass.CreateProxyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("CreateProxy"))
              .build();
        }
      }
    }
    return getCreateProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.management.driver.AgentOuterClass.DestroyProxyRequest,
      atomix.management.driver.AgentOuterClass.DestroyProxyResponse> getDestroyProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyProxy",
      requestType = atomix.management.driver.AgentOuterClass.DestroyProxyRequest.class,
      responseType = atomix.management.driver.AgentOuterClass.DestroyProxyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.driver.AgentOuterClass.DestroyProxyRequest,
      atomix.management.driver.AgentOuterClass.DestroyProxyResponse> getDestroyProxyMethod() {
    io.grpc.MethodDescriptor<atomix.management.driver.AgentOuterClass.DestroyProxyRequest, atomix.management.driver.AgentOuterClass.DestroyProxyResponse> getDestroyProxyMethod;
    if ((getDestroyProxyMethod = AgentGrpc.getDestroyProxyMethod) == null) {
      synchronized (AgentGrpc.class) {
        if ((getDestroyProxyMethod = AgentGrpc.getDestroyProxyMethod) == null) {
          AgentGrpc.getDestroyProxyMethod = getDestroyProxyMethod =
              io.grpc.MethodDescriptor.<atomix.management.driver.AgentOuterClass.DestroyProxyRequest, atomix.management.driver.AgentOuterClass.DestroyProxyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.AgentOuterClass.DestroyProxyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.AgentOuterClass.DestroyProxyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentMethodDescriptorSupplier("DestroyProxy"))
              .build();
        }
      }
    }
    return getDestroyProxyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentStub>() {
        @java.lang.Override
        public AgentStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentStub(channel, callOptions);
        }
      };
    return AgentStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentBlockingStub>() {
        @java.lang.Override
        public AgentBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentBlockingStub(channel, callOptions);
        }
      };
    return AgentBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentFutureStub>() {
        @java.lang.Override
        public AgentFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentFutureStub(channel, callOptions);
        }
      };
    return AgentFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AgentImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProxy(atomix.management.driver.AgentOuterClass.CreateProxyRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.AgentOuterClass.CreateProxyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProxyMethod(), responseObserver);
    }

    /**
     */
    public void destroyProxy(atomix.management.driver.AgentOuterClass.DestroyProxyRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.AgentOuterClass.DestroyProxyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyProxyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProxyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.driver.AgentOuterClass.CreateProxyRequest,
                atomix.management.driver.AgentOuterClass.CreateProxyResponse>(
                  this, METHODID_CREATE_PROXY)))
          .addMethod(
            getDestroyProxyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.driver.AgentOuterClass.DestroyProxyRequest,
                atomix.management.driver.AgentOuterClass.DestroyProxyResponse>(
                  this, METHODID_DESTROY_PROXY)))
          .build();
    }
  }

  /**
   */
  public static final class AgentStub extends io.grpc.stub.AbstractAsyncStub<AgentStub> {
    private AgentStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentStub(channel, callOptions);
    }

    /**
     */
    public void createProxy(atomix.management.driver.AgentOuterClass.CreateProxyRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.AgentOuterClass.CreateProxyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyProxy(atomix.management.driver.AgentOuterClass.DestroyProxyRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.AgentOuterClass.DestroyProxyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyProxyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AgentBlockingStub extends io.grpc.stub.AbstractBlockingStub<AgentBlockingStub> {
    private AgentBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.management.driver.AgentOuterClass.CreateProxyResponse createProxy(atomix.management.driver.AgentOuterClass.CreateProxyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProxyMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.management.driver.AgentOuterClass.DestroyProxyResponse destroyProxy(atomix.management.driver.AgentOuterClass.DestroyProxyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyProxyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AgentFutureStub extends io.grpc.stub.AbstractFutureStub<AgentFutureStub> {
    private AgentFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.driver.AgentOuterClass.CreateProxyResponse> createProxy(
        atomix.management.driver.AgentOuterClass.CreateProxyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProxyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.driver.AgentOuterClass.DestroyProxyResponse> destroyProxy(
        atomix.management.driver.AgentOuterClass.DestroyProxyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyProxyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROXY = 0;
  private static final int METHODID_DESTROY_PROXY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROXY:
          serviceImpl.createProxy((atomix.management.driver.AgentOuterClass.CreateProxyRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.driver.AgentOuterClass.CreateProxyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_PROXY:
          serviceImpl.destroyProxy((atomix.management.driver.AgentOuterClass.DestroyProxyRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.driver.AgentOuterClass.DestroyProxyResponse>) responseObserver);
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

  private static abstract class AgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.management.driver.AgentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Agent");
    }
  }

  private static final class AgentFileDescriptorSupplier
      extends AgentBaseDescriptorSupplier {
    AgentFileDescriptorSupplier() {}
  }

  private static final class AgentMethodDescriptorSupplier
      extends AgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentMethodDescriptorSupplier(String methodName) {
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
      synchronized (AgentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentFileDescriptorSupplier())
              .addMethod(getCreateProxyMethod())
              .addMethod(getDestroyProxyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
