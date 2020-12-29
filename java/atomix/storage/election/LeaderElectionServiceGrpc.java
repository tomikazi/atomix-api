package atomix.storage.election;

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
 * LeaderElectionService implements a distributed leader election
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/election/election.proto")
public final class LeaderElectionServiceGrpc {

  private LeaderElectionServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.election.LeaderElectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.CreateRequest,
      atomix.storage.election.Election.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.storage.election.Election.CreateRequest.class,
      responseType = atomix.storage.election.Election.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.CreateRequest,
      atomix.storage.election.Election.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.CreateRequest, atomix.storage.election.Election.CreateResponse> getCreateMethod;
    if ((getCreateMethod = LeaderElectionServiceGrpc.getCreateMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getCreateMethod = LeaderElectionServiceGrpc.getCreateMethod) == null) {
          LeaderElectionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.CreateRequest, atomix.storage.election.Election.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.CloseRequest,
      atomix.storage.election.Election.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.storage.election.Election.CloseRequest.class,
      responseType = atomix.storage.election.Election.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.CloseRequest,
      atomix.storage.election.Election.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.CloseRequest, atomix.storage.election.Election.CloseResponse> getCloseMethod;
    if ((getCloseMethod = LeaderElectionServiceGrpc.getCloseMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getCloseMethod = LeaderElectionServiceGrpc.getCloseMethod) == null) {
          LeaderElectionServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.CloseRequest, atomix.storage.election.Election.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.EnterRequest,
      atomix.storage.election.Election.EnterResponse> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enter",
      requestType = atomix.storage.election.Election.EnterRequest.class,
      responseType = atomix.storage.election.Election.EnterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.EnterRequest,
      atomix.storage.election.Election.EnterResponse> getEnterMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.EnterRequest, atomix.storage.election.Election.EnterResponse> getEnterMethod;
    if ((getEnterMethod = LeaderElectionServiceGrpc.getEnterMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getEnterMethod = LeaderElectionServiceGrpc.getEnterMethod) == null) {
          LeaderElectionServiceGrpc.getEnterMethod = getEnterMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.EnterRequest, atomix.storage.election.Election.EnterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.EnterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.EnterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Enter"))
              .build();
        }
      }
    }
    return getEnterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.WithdrawRequest,
      atomix.storage.election.Election.WithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = atomix.storage.election.Election.WithdrawRequest.class,
      responseType = atomix.storage.election.Election.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.WithdrawRequest,
      atomix.storage.election.Election.WithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.WithdrawRequest, atomix.storage.election.Election.WithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = LeaderElectionServiceGrpc.getWithdrawMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getWithdrawMethod = LeaderElectionServiceGrpc.getWithdrawMethod) == null) {
          LeaderElectionServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.WithdrawRequest, atomix.storage.election.Election.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.WithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.AnointRequest,
      atomix.storage.election.Election.AnointResponse> getAnointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Anoint",
      requestType = atomix.storage.election.Election.AnointRequest.class,
      responseType = atomix.storage.election.Election.AnointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.AnointRequest,
      atomix.storage.election.Election.AnointResponse> getAnointMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.AnointRequest, atomix.storage.election.Election.AnointResponse> getAnointMethod;
    if ((getAnointMethod = LeaderElectionServiceGrpc.getAnointMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getAnointMethod = LeaderElectionServiceGrpc.getAnointMethod) == null) {
          LeaderElectionServiceGrpc.getAnointMethod = getAnointMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.AnointRequest, atomix.storage.election.Election.AnointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Anoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.AnointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.AnointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Anoint"))
              .build();
        }
      }
    }
    return getAnointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.PromoteRequest,
      atomix.storage.election.Election.PromoteResponse> getPromoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Promote",
      requestType = atomix.storage.election.Election.PromoteRequest.class,
      responseType = atomix.storage.election.Election.PromoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.PromoteRequest,
      atomix.storage.election.Election.PromoteResponse> getPromoteMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.PromoteRequest, atomix.storage.election.Election.PromoteResponse> getPromoteMethod;
    if ((getPromoteMethod = LeaderElectionServiceGrpc.getPromoteMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getPromoteMethod = LeaderElectionServiceGrpc.getPromoteMethod) == null) {
          LeaderElectionServiceGrpc.getPromoteMethod = getPromoteMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.PromoteRequest, atomix.storage.election.Election.PromoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Promote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.PromoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.PromoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Promote"))
              .build();
        }
      }
    }
    return getPromoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.EvictRequest,
      atomix.storage.election.Election.EvictResponse> getEvictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Evict",
      requestType = atomix.storage.election.Election.EvictRequest.class,
      responseType = atomix.storage.election.Election.EvictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.EvictRequest,
      atomix.storage.election.Election.EvictResponse> getEvictMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.EvictRequest, atomix.storage.election.Election.EvictResponse> getEvictMethod;
    if ((getEvictMethod = LeaderElectionServiceGrpc.getEvictMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getEvictMethod = LeaderElectionServiceGrpc.getEvictMethod) == null) {
          LeaderElectionServiceGrpc.getEvictMethod = getEvictMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.EvictRequest, atomix.storage.election.Election.EvictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Evict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.EvictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.EvictResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Evict"))
              .build();
        }
      }
    }
    return getEvictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.GetTermRequest,
      atomix.storage.election.Election.GetTermResponse> getGetTermMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTerm",
      requestType = atomix.storage.election.Election.GetTermRequest.class,
      responseType = atomix.storage.election.Election.GetTermResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.GetTermRequest,
      atomix.storage.election.Election.GetTermResponse> getGetTermMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.GetTermRequest, atomix.storage.election.Election.GetTermResponse> getGetTermMethod;
    if ((getGetTermMethod = LeaderElectionServiceGrpc.getGetTermMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getGetTermMethod = LeaderElectionServiceGrpc.getGetTermMethod) == null) {
          LeaderElectionServiceGrpc.getGetTermMethod = getGetTermMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.GetTermRequest, atomix.storage.election.Election.GetTermResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTerm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.GetTermRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.GetTermResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("GetTerm"))
              .build();
        }
      }
    }
    return getGetTermMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.election.Election.EventRequest,
      atomix.storage.election.Election.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.storage.election.Election.EventRequest.class,
      responseType = atomix.storage.election.Election.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.election.Election.EventRequest,
      atomix.storage.election.Election.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.election.Election.EventRequest, atomix.storage.election.Election.EventResponse> getEventsMethod;
    if ((getEventsMethod = LeaderElectionServiceGrpc.getEventsMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getEventsMethod = LeaderElectionServiceGrpc.getEventsMethod) == null) {
          LeaderElectionServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.election.Election.EventRequest, atomix.storage.election.Election.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.election.Election.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderElectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionServiceStub>() {
        @java.lang.Override
        public LeaderElectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionServiceStub(channel, callOptions);
        }
      };
    return LeaderElectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderElectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionServiceBlockingStub>() {
        @java.lang.Override
        public LeaderElectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionServiceBlockingStub(channel, callOptions);
        }
      };
    return LeaderElectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderElectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionServiceFutureStub>() {
        @java.lang.Override
        public LeaderElectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionServiceFutureStub(channel, callOptions);
        }
      };
    return LeaderElectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderElectionService implements a distributed leader election
   * </pre>
   */
  public static abstract class LeaderElectionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a LeaderElection instance
     * </pre>
     */
    public void create(atomix.storage.election.Election.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a LeaderElection instance
     * </pre>
     */
    public void close(atomix.storage.election.Election.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public void enter(atomix.storage.election.Election.EnterRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.EnterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public void withdraw(atomix.storage.election.Election.WithdrawRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.WithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public void anoint(atomix.storage.election.Election.AnointRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.AnointResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAnointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public void promote(atomix.storage.election.Election.PromoteRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.PromoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPromoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public void evict(atomix.storage.election.Election.EvictRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.EvictResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEvictMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public void getTerm(atomix.storage.election.Election.GetTermRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.GetTermResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTermMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public void events(atomix.storage.election.Election.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.CreateRequest,
                atomix.storage.election.Election.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.CloseRequest,
                atomix.storage.election.Election.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getEnterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.EnterRequest,
                atomix.storage.election.Election.EnterResponse>(
                  this, METHODID_ENTER)))
          .addMethod(
            getWithdrawMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.WithdrawRequest,
                atomix.storage.election.Election.WithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getAnointMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.AnointRequest,
                atomix.storage.election.Election.AnointResponse>(
                  this, METHODID_ANOINT)))
          .addMethod(
            getPromoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.PromoteRequest,
                atomix.storage.election.Election.PromoteResponse>(
                  this, METHODID_PROMOTE)))
          .addMethod(
            getEvictMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.EvictRequest,
                atomix.storage.election.Election.EvictResponse>(
                  this, METHODID_EVICT)))
          .addMethod(
            getGetTermMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.election.Election.GetTermRequest,
                atomix.storage.election.Election.GetTermResponse>(
                  this, METHODID_GET_TERM)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.election.Election.EventRequest,
                atomix.storage.election.Election.EventResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderElectionService implements a distributed leader election
   * </pre>
   */
  public static final class LeaderElectionServiceStub extends io.grpc.stub.AbstractAsyncStub<LeaderElectionServiceStub> {
    private LeaderElectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a LeaderElection instance
     * </pre>
     */
    public void create(atomix.storage.election.Election.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a LeaderElection instance
     * </pre>
     */
    public void close(atomix.storage.election.Election.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public void enter(atomix.storage.election.Election.EnterRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.EnterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public void withdraw(atomix.storage.election.Election.WithdrawRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.WithdrawResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public void anoint(atomix.storage.election.Election.AnointRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.AnointResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public void promote(atomix.storage.election.Election.PromoteRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.PromoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPromoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public void evict(atomix.storage.election.Election.EvictRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.EvictResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEvictMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public void getTerm(atomix.storage.election.Election.GetTermRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.GetTermResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTermMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public void events(atomix.storage.election.Election.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.election.Election.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderElectionService implements a distributed leader election
   * </pre>
   */
  public static final class LeaderElectionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderElectionServiceBlockingStub> {
    private LeaderElectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a LeaderElection instance
     * </pre>
     */
    public atomix.storage.election.Election.CreateResponse create(atomix.storage.election.Election.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a LeaderElection instance
     * </pre>
     */
    public atomix.storage.election.Election.CloseResponse close(atomix.storage.election.Election.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public atomix.storage.election.Election.EnterResponse enter(atomix.storage.election.Election.EnterRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public atomix.storage.election.Election.WithdrawResponse withdraw(atomix.storage.election.Election.WithdrawRequest request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public atomix.storage.election.Election.AnointResponse anoint(atomix.storage.election.Election.AnointRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public atomix.storage.election.Election.PromoteResponse promote(atomix.storage.election.Election.PromoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getPromoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public atomix.storage.election.Election.EvictResponse evict(atomix.storage.election.Election.EvictRequest request) {
      return blockingUnaryCall(
          getChannel(), getEvictMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public atomix.storage.election.Election.GetTermResponse getTerm(atomix.storage.election.Election.GetTermRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTermMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public java.util.Iterator<atomix.storage.election.Election.EventResponse> events(
        atomix.storage.election.Election.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderElectionService implements a distributed leader election
   * </pre>
   */
  public static final class LeaderElectionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderElectionServiceFutureStub> {
    private LeaderElectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a LeaderElection instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.CreateResponse> create(
        atomix.storage.election.Election.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a LeaderElection instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.CloseResponse> close(
        atomix.storage.election.Election.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.EnterResponse> enter(
        atomix.storage.election.Election.EnterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.WithdrawResponse> withdraw(
        atomix.storage.election.Election.WithdrawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.AnointResponse> anoint(
        atomix.storage.election.Election.AnointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.PromoteResponse> promote(
        atomix.storage.election.Election.PromoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPromoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.EvictResponse> evict(
        atomix.storage.election.Election.EvictRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEvictMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.election.Election.GetTermResponse> getTerm(
        atomix.storage.election.Election.GetTermRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTermMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_ENTER = 2;
  private static final int METHODID_WITHDRAW = 3;
  private static final int METHODID_ANOINT = 4;
  private static final int METHODID_PROMOTE = 5;
  private static final int METHODID_EVICT = 6;
  private static final int METHODID_GET_TERM = 7;
  private static final int METHODID_EVENTS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LeaderElectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderElectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.storage.election.Election.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.storage.election.Election.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.CloseResponse>) responseObserver);
          break;
        case METHODID_ENTER:
          serviceImpl.enter((atomix.storage.election.Election.EnterRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.EnterResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((atomix.storage.election.Election.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.WithdrawResponse>) responseObserver);
          break;
        case METHODID_ANOINT:
          serviceImpl.anoint((atomix.storage.election.Election.AnointRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.AnointResponse>) responseObserver);
          break;
        case METHODID_PROMOTE:
          serviceImpl.promote((atomix.storage.election.Election.PromoteRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.PromoteResponse>) responseObserver);
          break;
        case METHODID_EVICT:
          serviceImpl.evict((atomix.storage.election.Election.EvictRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.EvictResponse>) responseObserver);
          break;
        case METHODID_GET_TERM:
          serviceImpl.getTerm((atomix.storage.election.Election.GetTermRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.GetTermResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.storage.election.Election.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.election.Election.EventResponse>) responseObserver);
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

  private static abstract class LeaderElectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderElectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.storage.election.Election.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderElectionService");
    }
  }

  private static final class LeaderElectionServiceFileDescriptorSupplier
      extends LeaderElectionServiceBaseDescriptorSupplier {
    LeaderElectionServiceFileDescriptorSupplier() {}
  }

  private static final class LeaderElectionServiceMethodDescriptorSupplier
      extends LeaderElectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderElectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderElectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderElectionServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getEnterMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getAnointMethod())
              .addMethod(getPromoteMethod())
              .addMethod(getEvictMethod())
              .addMethod(getGetTermMethod())
              .addMethod(getEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
