package atomix.database;

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
 * Atomix database service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/database/database.proto")
public final class DatabaseServiceGrpc {

  private DatabaseServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.database.DatabaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.database.DatabaseOuterClass.GetDatabaseRequest,
      atomix.database.DatabaseOuterClass.GetDatabaseResponse> getGetDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatabase",
      requestType = atomix.database.DatabaseOuterClass.GetDatabaseRequest.class,
      responseType = atomix.database.DatabaseOuterClass.GetDatabaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.database.DatabaseOuterClass.GetDatabaseRequest,
      atomix.database.DatabaseOuterClass.GetDatabaseResponse> getGetDatabaseMethod() {
    io.grpc.MethodDescriptor<atomix.database.DatabaseOuterClass.GetDatabaseRequest, atomix.database.DatabaseOuterClass.GetDatabaseResponse> getGetDatabaseMethod;
    if ((getGetDatabaseMethod = DatabaseServiceGrpc.getGetDatabaseMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getGetDatabaseMethod = DatabaseServiceGrpc.getGetDatabaseMethod) == null) {
          DatabaseServiceGrpc.getGetDatabaseMethod = getGetDatabaseMethod =
              io.grpc.MethodDescriptor.<atomix.database.DatabaseOuterClass.GetDatabaseRequest, atomix.database.DatabaseOuterClass.GetDatabaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.database.DatabaseOuterClass.GetDatabaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.database.DatabaseOuterClass.GetDatabaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("GetDatabase"))
              .build();
        }
      }
    }
    return getGetDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.database.DatabaseOuterClass.GetDatabasesRequest,
      atomix.database.DatabaseOuterClass.GetDatabasesResponse> getGetDatabasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatabases",
      requestType = atomix.database.DatabaseOuterClass.GetDatabasesRequest.class,
      responseType = atomix.database.DatabaseOuterClass.GetDatabasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.database.DatabaseOuterClass.GetDatabasesRequest,
      atomix.database.DatabaseOuterClass.GetDatabasesResponse> getGetDatabasesMethod() {
    io.grpc.MethodDescriptor<atomix.database.DatabaseOuterClass.GetDatabasesRequest, atomix.database.DatabaseOuterClass.GetDatabasesResponse> getGetDatabasesMethod;
    if ((getGetDatabasesMethod = DatabaseServiceGrpc.getGetDatabasesMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getGetDatabasesMethod = DatabaseServiceGrpc.getGetDatabasesMethod) == null) {
          DatabaseServiceGrpc.getGetDatabasesMethod = getGetDatabasesMethod =
              io.grpc.MethodDescriptor.<atomix.database.DatabaseOuterClass.GetDatabasesRequest, atomix.database.DatabaseOuterClass.GetDatabasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatabases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.database.DatabaseOuterClass.GetDatabasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.database.DatabaseOuterClass.GetDatabasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("GetDatabases"))
              .build();
        }
      }
    }
    return getGetDatabasesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceStub>() {
        @java.lang.Override
        public DatabaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceStub(channel, callOptions);
        }
      };
    return DatabaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceBlockingStub>() {
        @java.lang.Override
        public DatabaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceBlockingStub(channel, callOptions);
        }
      };
    return DatabaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceFutureStub>() {
        @java.lang.Override
        public DatabaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceFutureStub(channel, callOptions);
        }
      };
    return DatabaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Atomix database service
   * </pre>
   */
  public static abstract class DatabaseServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetDatabase gets a database controlled by the controller
     * </pre>
     */
    public void getDatabase(atomix.database.DatabaseOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<atomix.database.DatabaseOuterClass.GetDatabaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatabaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDatabases gets a list of databases controlled by the controller
     * </pre>
     */
    public void getDatabases(atomix.database.DatabaseOuterClass.GetDatabasesRequest request,
        io.grpc.stub.StreamObserver<atomix.database.DatabaseOuterClass.GetDatabasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatabasesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDatabaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.database.DatabaseOuterClass.GetDatabaseRequest,
                atomix.database.DatabaseOuterClass.GetDatabaseResponse>(
                  this, METHODID_GET_DATABASE)))
          .addMethod(
            getGetDatabasesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.database.DatabaseOuterClass.GetDatabasesRequest,
                atomix.database.DatabaseOuterClass.GetDatabasesResponse>(
                  this, METHODID_GET_DATABASES)))
          .build();
    }
  }

  /**
   * <pre>
   * Atomix database service
   * </pre>
   */
  public static final class DatabaseServiceStub extends io.grpc.stub.AbstractAsyncStub<DatabaseServiceStub> {
    private DatabaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDatabase gets a database controlled by the controller
     * </pre>
     */
    public void getDatabase(atomix.database.DatabaseOuterClass.GetDatabaseRequest request,
        io.grpc.stub.StreamObserver<atomix.database.DatabaseOuterClass.GetDatabaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDatabases gets a list of databases controlled by the controller
     * </pre>
     */
    public void getDatabases(atomix.database.DatabaseOuterClass.GetDatabasesRequest request,
        io.grpc.stub.StreamObserver<atomix.database.DatabaseOuterClass.GetDatabasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatabasesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Atomix database service
   * </pre>
   */
  public static final class DatabaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DatabaseServiceBlockingStub> {
    private DatabaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDatabase gets a database controlled by the controller
     * </pre>
     */
    public atomix.database.DatabaseOuterClass.GetDatabaseResponse getDatabase(atomix.database.DatabaseOuterClass.GetDatabaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatabaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDatabases gets a list of databases controlled by the controller
     * </pre>
     */
    public atomix.database.DatabaseOuterClass.GetDatabasesResponse getDatabases(atomix.database.DatabaseOuterClass.GetDatabasesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatabasesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Atomix database service
   * </pre>
   */
  public static final class DatabaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DatabaseServiceFutureStub> {
    private DatabaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetDatabase gets a database controlled by the controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.database.DatabaseOuterClass.GetDatabaseResponse> getDatabase(
        atomix.database.DatabaseOuterClass.GetDatabaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatabaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDatabases gets a list of databases controlled by the controller
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.database.DatabaseOuterClass.GetDatabasesResponse> getDatabases(
        atomix.database.DatabaseOuterClass.GetDatabasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatabasesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATABASE = 0;
  private static final int METHODID_GET_DATABASES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DatabaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DatabaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATABASE:
          serviceImpl.getDatabase((atomix.database.DatabaseOuterClass.GetDatabaseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.database.DatabaseOuterClass.GetDatabaseResponse>) responseObserver);
          break;
        case METHODID_GET_DATABASES:
          serviceImpl.getDatabases((atomix.database.DatabaseOuterClass.GetDatabasesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.database.DatabaseOuterClass.GetDatabasesResponse>) responseObserver);
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

  private static abstract class DatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatabaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.database.DatabaseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatabaseService");
    }
  }

  private static final class DatabaseServiceFileDescriptorSupplier
      extends DatabaseServiceBaseDescriptorSupplier {
    DatabaseServiceFileDescriptorSupplier() {}
  }

  private static final class DatabaseServiceMethodDescriptorSupplier
      extends DatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatabaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatabaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseServiceFileDescriptorSupplier())
              .addMethod(getGetDatabaseMethod())
              .addMethod(getGetDatabasesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
