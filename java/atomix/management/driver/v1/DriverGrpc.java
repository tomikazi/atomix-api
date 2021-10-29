package atomix.management.driver.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/management/driver/v1/driver.proto")
public final class DriverGrpc {

  private DriverGrpc() {}

  public static final String SERVICE_NAME = "atomix.management.driver.v1.Driver";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.StartAgentRequest,
      atomix.management.driver.v1.DriverOuterClass.StartAgentResponse> getStartAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartAgent",
      requestType = atomix.management.driver.v1.DriverOuterClass.StartAgentRequest.class,
      responseType = atomix.management.driver.v1.DriverOuterClass.StartAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.StartAgentRequest,
      atomix.management.driver.v1.DriverOuterClass.StartAgentResponse> getStartAgentMethod() {
    io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.StartAgentRequest, atomix.management.driver.v1.DriverOuterClass.StartAgentResponse> getStartAgentMethod;
    if ((getStartAgentMethod = DriverGrpc.getStartAgentMethod) == null) {
      synchronized (DriverGrpc.class) {
        if ((getStartAgentMethod = DriverGrpc.getStartAgentMethod) == null) {
          DriverGrpc.getStartAgentMethod = getStartAgentMethod =
              io.grpc.MethodDescriptor.<atomix.management.driver.v1.DriverOuterClass.StartAgentRequest, atomix.management.driver.v1.DriverOuterClass.StartAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.v1.DriverOuterClass.StartAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.v1.DriverOuterClass.StartAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriverMethodDescriptorSupplier("StartAgent"))
              .build();
        }
      }
    }
    return getStartAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest,
      atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse> getConfigureAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureAgent",
      requestType = atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest.class,
      responseType = atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest,
      atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse> getConfigureAgentMethod() {
    io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest, atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse> getConfigureAgentMethod;
    if ((getConfigureAgentMethod = DriverGrpc.getConfigureAgentMethod) == null) {
      synchronized (DriverGrpc.class) {
        if ((getConfigureAgentMethod = DriverGrpc.getConfigureAgentMethod) == null) {
          DriverGrpc.getConfigureAgentMethod = getConfigureAgentMethod =
              io.grpc.MethodDescriptor.<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest, atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriverMethodDescriptorSupplier("ConfigureAgent"))
              .build();
        }
      }
    }
    return getConfigureAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.StopAgentRequest,
      atomix.management.driver.v1.DriverOuterClass.StopAgentResponse> getStopAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAgent",
      requestType = atomix.management.driver.v1.DriverOuterClass.StopAgentRequest.class,
      responseType = atomix.management.driver.v1.DriverOuterClass.StopAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.StopAgentRequest,
      atomix.management.driver.v1.DriverOuterClass.StopAgentResponse> getStopAgentMethod() {
    io.grpc.MethodDescriptor<atomix.management.driver.v1.DriverOuterClass.StopAgentRequest, atomix.management.driver.v1.DriverOuterClass.StopAgentResponse> getStopAgentMethod;
    if ((getStopAgentMethod = DriverGrpc.getStopAgentMethod) == null) {
      synchronized (DriverGrpc.class) {
        if ((getStopAgentMethod = DriverGrpc.getStopAgentMethod) == null) {
          DriverGrpc.getStopAgentMethod = getStopAgentMethod =
              io.grpc.MethodDescriptor.<atomix.management.driver.v1.DriverOuterClass.StopAgentRequest, atomix.management.driver.v1.DriverOuterClass.StopAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.v1.DriverOuterClass.StopAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.management.driver.v1.DriverOuterClass.StopAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriverMethodDescriptorSupplier("StopAgent"))
              .build();
        }
      }
    }
    return getStopAgentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriverStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverStub>() {
        @java.lang.Override
        public DriverStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverStub(channel, callOptions);
        }
      };
    return DriverStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverBlockingStub>() {
        @java.lang.Override
        public DriverBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverBlockingStub(channel, callOptions);
        }
      };
    return DriverBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DriverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriverFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriverFutureStub>() {
        @java.lang.Override
        public DriverFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriverFutureStub(channel, callOptions);
        }
      };
    return DriverFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DriverImplBase implements io.grpc.BindableService {

    /**
     */
    public void startAgent(atomix.management.driver.v1.DriverOuterClass.StartAgentRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.StartAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartAgentMethod(), responseObserver);
    }

    /**
     */
    public void configureAgent(atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureAgentMethod(), responseObserver);
    }

    /**
     */
    public void stopAgent(atomix.management.driver.v1.DriverOuterClass.StopAgentRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.StopAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAgentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartAgentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.driver.v1.DriverOuterClass.StartAgentRequest,
                atomix.management.driver.v1.DriverOuterClass.StartAgentResponse>(
                  this, METHODID_START_AGENT)))
          .addMethod(
            getConfigureAgentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest,
                atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse>(
                  this, METHODID_CONFIGURE_AGENT)))
          .addMethod(
            getStopAgentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.management.driver.v1.DriverOuterClass.StopAgentRequest,
                atomix.management.driver.v1.DriverOuterClass.StopAgentResponse>(
                  this, METHODID_STOP_AGENT)))
          .build();
    }
  }

  /**
   */
  public static final class DriverStub extends io.grpc.stub.AbstractAsyncStub<DriverStub> {
    private DriverStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverStub(channel, callOptions);
    }

    /**
     */
    public void startAgent(atomix.management.driver.v1.DriverOuterClass.StartAgentRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.StartAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void configureAgent(atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopAgent(atomix.management.driver.v1.DriverOuterClass.StopAgentRequest request,
        io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.StopAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAgentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DriverBlockingStub extends io.grpc.stub.AbstractBlockingStub<DriverBlockingStub> {
    private DriverBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverBlockingStub(channel, callOptions);
    }

    /**
     */
    public atomix.management.driver.v1.DriverOuterClass.StartAgentResponse startAgent(atomix.management.driver.v1.DriverOuterClass.StartAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse configureAgent(atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public atomix.management.driver.v1.DriverOuterClass.StopAgentResponse stopAgent(atomix.management.driver.v1.DriverOuterClass.StopAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAgentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DriverFutureStub extends io.grpc.stub.AbstractFutureStub<DriverFutureStub> {
    private DriverFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriverFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.driver.v1.DriverOuterClass.StartAgentResponse> startAgent(
        atomix.management.driver.v1.DriverOuterClass.StartAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse> configureAgent(
        atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.management.driver.v1.DriverOuterClass.StopAgentResponse> stopAgent(
        atomix.management.driver.v1.DriverOuterClass.StopAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopAgentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_AGENT = 0;
  private static final int METHODID_CONFIGURE_AGENT = 1;
  private static final int METHODID_STOP_AGENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DriverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DriverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_AGENT:
          serviceImpl.startAgent((atomix.management.driver.v1.DriverOuterClass.StartAgentRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.StartAgentResponse>) responseObserver);
          break;
        case METHODID_CONFIGURE_AGENT:
          serviceImpl.configureAgent((atomix.management.driver.v1.DriverOuterClass.ConfigureAgentRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.ConfigureAgentResponse>) responseObserver);
          break;
        case METHODID_STOP_AGENT:
          serviceImpl.stopAgent((atomix.management.driver.v1.DriverOuterClass.StopAgentRequest) request,
              (io.grpc.stub.StreamObserver<atomix.management.driver.v1.DriverOuterClass.StopAgentResponse>) responseObserver);
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

  private static abstract class DriverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DriverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.management.driver.v1.DriverOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Driver");
    }
  }

  private static final class DriverFileDescriptorSupplier
      extends DriverBaseDescriptorSupplier {
    DriverFileDescriptorSupplier() {}
  }

  private static final class DriverMethodDescriptorSupplier
      extends DriverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DriverMethodDescriptorSupplier(String methodName) {
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
      synchronized (DriverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DriverFileDescriptorSupplier())
              .addMethod(getStartAgentMethod())
              .addMethod(getConfigureAgentMethod())
              .addMethod(getStopAgentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
