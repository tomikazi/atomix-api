package atomix.membership;

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
 * Atomix membership service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/membership/membership.proto")
public final class MembershipServiceGrpc {

  private MembershipServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.membership.MembershipService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.membership.Membership.JoinGroupRequest,
      atomix.membership.Membership.JoinGroupResponse> getJoinGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinGroup",
      requestType = atomix.membership.Membership.JoinGroupRequest.class,
      responseType = atomix.membership.Membership.JoinGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.membership.Membership.JoinGroupRequest,
      atomix.membership.Membership.JoinGroupResponse> getJoinGroupMethod() {
    io.grpc.MethodDescriptor<atomix.membership.Membership.JoinGroupRequest, atomix.membership.Membership.JoinGroupResponse> getJoinGroupMethod;
    if ((getJoinGroupMethod = MembershipServiceGrpc.getJoinGroupMethod) == null) {
      synchronized (MembershipServiceGrpc.class) {
        if ((getJoinGroupMethod = MembershipServiceGrpc.getJoinGroupMethod) == null) {
          MembershipServiceGrpc.getJoinGroupMethod = getJoinGroupMethod =
              io.grpc.MethodDescriptor.<atomix.membership.Membership.JoinGroupRequest, atomix.membership.Membership.JoinGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.membership.Membership.JoinGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.membership.Membership.JoinGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MembershipServiceMethodDescriptorSupplier("JoinGroup"))
              .build();
        }
      }
    }
    return getJoinGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MembershipServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembershipServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembershipServiceStub>() {
        @java.lang.Override
        public MembershipServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembershipServiceStub(channel, callOptions);
        }
      };
    return MembershipServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MembershipServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembershipServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembershipServiceBlockingStub>() {
        @java.lang.Override
        public MembershipServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembershipServiceBlockingStub(channel, callOptions);
        }
      };
    return MembershipServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MembershipServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembershipServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembershipServiceFutureStub>() {
        @java.lang.Override
        public MembershipServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembershipServiceFutureStub(channel, callOptions);
        }
      };
    return MembershipServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Atomix membership service
   * </pre>
   */
  public static abstract class MembershipServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Joins a member to a cluster
     * </pre>
     */
    public void joinGroup(atomix.membership.Membership.JoinGroupRequest request,
        io.grpc.stub.StreamObserver<atomix.membership.Membership.JoinGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJoinGroupMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.membership.Membership.JoinGroupRequest,
                atomix.membership.Membership.JoinGroupResponse>(
                  this, METHODID_JOIN_GROUP)))
          .build();
    }
  }

  /**
   * <pre>
   * Atomix membership service
   * </pre>
   */
  public static final class MembershipServiceStub extends io.grpc.stub.AbstractAsyncStub<MembershipServiceStub> {
    private MembershipServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembershipServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembershipServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Joins a member to a cluster
     * </pre>
     */
    public void joinGroup(atomix.membership.Membership.JoinGroupRequest request,
        io.grpc.stub.StreamObserver<atomix.membership.Membership.JoinGroupResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getJoinGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Atomix membership service
   * </pre>
   */
  public static final class MembershipServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MembershipServiceBlockingStub> {
    private MembershipServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembershipServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembershipServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Joins a member to a cluster
     * </pre>
     */
    public java.util.Iterator<atomix.membership.Membership.JoinGroupResponse> joinGroup(
        atomix.membership.Membership.JoinGroupRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getJoinGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Atomix membership service
   * </pre>
   */
  public static final class MembershipServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MembershipServiceFutureStub> {
    private MembershipServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembershipServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembershipServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_JOIN_GROUP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MembershipServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MembershipServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOIN_GROUP:
          serviceImpl.joinGroup((atomix.membership.Membership.JoinGroupRequest) request,
              (io.grpc.stub.StreamObserver<atomix.membership.Membership.JoinGroupResponse>) responseObserver);
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

  private static abstract class MembershipServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MembershipServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.membership.Membership.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MembershipService");
    }
  }

  private static final class MembershipServiceFileDescriptorSupplier
      extends MembershipServiceBaseDescriptorSupplier {
    MembershipServiceFileDescriptorSupplier() {}
  }

  private static final class MembershipServiceMethodDescriptorSupplier
      extends MembershipServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MembershipServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MembershipServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MembershipServiceFileDescriptorSupplier())
              .addMethod(getJoinGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
