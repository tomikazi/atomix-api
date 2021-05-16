package atomix.protocol;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Atomix protocol configuration service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/protocol/protocol.proto")
public final class ProtocolConfigServiceGrpc {

  private ProtocolConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.protocol.ProtocolConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.protocol.Protocol.UpdateConfigRequest,
      atomix.protocol.Protocol.UpdateConfigResponse> getUpdateConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConfig",
      requestType = atomix.protocol.Protocol.UpdateConfigRequest.class,
      responseType = atomix.protocol.Protocol.UpdateConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.protocol.Protocol.UpdateConfigRequest,
      atomix.protocol.Protocol.UpdateConfigResponse> getUpdateConfigMethod() {
    io.grpc.MethodDescriptor<atomix.protocol.Protocol.UpdateConfigRequest, atomix.protocol.Protocol.UpdateConfigResponse> getUpdateConfigMethod;
    if ((getUpdateConfigMethod = ProtocolConfigServiceGrpc.getUpdateConfigMethod) == null) {
      synchronized (ProtocolConfigServiceGrpc.class) {
        if ((getUpdateConfigMethod = ProtocolConfigServiceGrpc.getUpdateConfigMethod) == null) {
          ProtocolConfigServiceGrpc.getUpdateConfigMethod = getUpdateConfigMethod =
              io.grpc.MethodDescriptor.<atomix.protocol.Protocol.UpdateConfigRequest, atomix.protocol.Protocol.UpdateConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.protocol.Protocol.UpdateConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.protocol.Protocol.UpdateConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProtocolConfigServiceMethodDescriptorSupplier("UpdateConfig"))
              .build();
        }
      }
    }
    return getUpdateConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProtocolConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtocolConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtocolConfigServiceStub>() {
        @java.lang.Override
        public ProtocolConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtocolConfigServiceStub(channel, callOptions);
        }
      };
    return ProtocolConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProtocolConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtocolConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtocolConfigServiceBlockingStub>() {
        @java.lang.Override
        public ProtocolConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtocolConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return ProtocolConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProtocolConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProtocolConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProtocolConfigServiceFutureStub>() {
        @java.lang.Override
        public ProtocolConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProtocolConfigServiceFutureStub(channel, callOptions);
        }
      };
    return ProtocolConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Atomix protocol configuration service
   * </pre>
   */
  public static abstract class ProtocolConfigServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * UpdateConfig updates the protocol configuration
     * </pre>
     */
    public void updateConfig(atomix.protocol.Protocol.UpdateConfigRequest request,
        io.grpc.stub.StreamObserver<atomix.protocol.Protocol.UpdateConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.protocol.Protocol.UpdateConfigRequest,
                atomix.protocol.Protocol.UpdateConfigResponse>(
                  this, METHODID_UPDATE_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * Atomix protocol configuration service
   * </pre>
   */
  public static final class ProtocolConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<ProtocolConfigServiceStub> {
    private ProtocolConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtocolConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtocolConfigServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * UpdateConfig updates the protocol configuration
     * </pre>
     */
    public void updateConfig(atomix.protocol.Protocol.UpdateConfigRequest request,
        io.grpc.stub.StreamObserver<atomix.protocol.Protocol.UpdateConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Atomix protocol configuration service
   * </pre>
   */
  public static final class ProtocolConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProtocolConfigServiceBlockingStub> {
    private ProtocolConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtocolConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtocolConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * UpdateConfig updates the protocol configuration
     * </pre>
     */
    public atomix.protocol.Protocol.UpdateConfigResponse updateConfig(atomix.protocol.Protocol.UpdateConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Atomix protocol configuration service
   * </pre>
   */
  public static final class ProtocolConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProtocolConfigServiceFutureStub> {
    private ProtocolConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProtocolConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProtocolConfigServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * UpdateConfig updates the protocol configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.protocol.Protocol.UpdateConfigResponse> updateConfig(
        atomix.protocol.Protocol.UpdateConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_CONFIG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProtocolConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProtocolConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_CONFIG:
          serviceImpl.updateConfig((atomix.protocol.Protocol.UpdateConfigRequest) request,
              (io.grpc.stub.StreamObserver<atomix.protocol.Protocol.UpdateConfigResponse>) responseObserver);
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

  private static abstract class ProtocolConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProtocolConfigServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.protocol.Protocol.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProtocolConfigService");
    }
  }

  private static final class ProtocolConfigServiceFileDescriptorSupplier
      extends ProtocolConfigServiceBaseDescriptorSupplier {
    ProtocolConfigServiceFileDescriptorSupplier() {}
  }

  private static final class ProtocolConfigServiceMethodDescriptorSupplier
      extends ProtocolConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProtocolConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProtocolConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProtocolConfigServiceFileDescriptorSupplier())
              .addMethod(getUpdateConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
