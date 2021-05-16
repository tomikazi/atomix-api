package atomix.primitive.election;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderElectionService implements a distributed leader election
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/election/election.proto")
public final class LeaderElectionServiceGrpc {

  private LeaderElectionServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.election.LeaderElectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.EnterRequest,
      atomix.primitive.election.Election.EnterResponse> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enter",
      requestType = atomix.primitive.election.Election.EnterRequest.class,
      responseType = atomix.primitive.election.Election.EnterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.EnterRequest,
      atomix.primitive.election.Election.EnterResponse> getEnterMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.EnterRequest, atomix.primitive.election.Election.EnterResponse> getEnterMethod;
    if ((getEnterMethod = LeaderElectionServiceGrpc.getEnterMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getEnterMethod = LeaderElectionServiceGrpc.getEnterMethod) == null) {
          LeaderElectionServiceGrpc.getEnterMethod = getEnterMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.EnterRequest, atomix.primitive.election.Election.EnterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.EnterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.EnterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Enter"))
              .build();
        }
      }
    }
    return getEnterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.WithdrawRequest,
      atomix.primitive.election.Election.WithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = atomix.primitive.election.Election.WithdrawRequest.class,
      responseType = atomix.primitive.election.Election.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.WithdrawRequest,
      atomix.primitive.election.Election.WithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.WithdrawRequest, atomix.primitive.election.Election.WithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = LeaderElectionServiceGrpc.getWithdrawMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getWithdrawMethod = LeaderElectionServiceGrpc.getWithdrawMethod) == null) {
          LeaderElectionServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.WithdrawRequest, atomix.primitive.election.Election.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.WithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.AnointRequest,
      atomix.primitive.election.Election.AnointResponse> getAnointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Anoint",
      requestType = atomix.primitive.election.Election.AnointRequest.class,
      responseType = atomix.primitive.election.Election.AnointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.AnointRequest,
      atomix.primitive.election.Election.AnointResponse> getAnointMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.AnointRequest, atomix.primitive.election.Election.AnointResponse> getAnointMethod;
    if ((getAnointMethod = LeaderElectionServiceGrpc.getAnointMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getAnointMethod = LeaderElectionServiceGrpc.getAnointMethod) == null) {
          LeaderElectionServiceGrpc.getAnointMethod = getAnointMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.AnointRequest, atomix.primitive.election.Election.AnointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Anoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.AnointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.AnointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Anoint"))
              .build();
        }
      }
    }
    return getAnointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.PromoteRequest,
      atomix.primitive.election.Election.PromoteResponse> getPromoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Promote",
      requestType = atomix.primitive.election.Election.PromoteRequest.class,
      responseType = atomix.primitive.election.Election.PromoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.PromoteRequest,
      atomix.primitive.election.Election.PromoteResponse> getPromoteMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.PromoteRequest, atomix.primitive.election.Election.PromoteResponse> getPromoteMethod;
    if ((getPromoteMethod = LeaderElectionServiceGrpc.getPromoteMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getPromoteMethod = LeaderElectionServiceGrpc.getPromoteMethod) == null) {
          LeaderElectionServiceGrpc.getPromoteMethod = getPromoteMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.PromoteRequest, atomix.primitive.election.Election.PromoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Promote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.PromoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.PromoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Promote"))
              .build();
        }
      }
    }
    return getPromoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.EvictRequest,
      atomix.primitive.election.Election.EvictResponse> getEvictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Evict",
      requestType = atomix.primitive.election.Election.EvictRequest.class,
      responseType = atomix.primitive.election.Election.EvictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.EvictRequest,
      atomix.primitive.election.Election.EvictResponse> getEvictMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.EvictRequest, atomix.primitive.election.Election.EvictResponse> getEvictMethod;
    if ((getEvictMethod = LeaderElectionServiceGrpc.getEvictMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getEvictMethod = LeaderElectionServiceGrpc.getEvictMethod) == null) {
          LeaderElectionServiceGrpc.getEvictMethod = getEvictMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.EvictRequest, atomix.primitive.election.Election.EvictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Evict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.EvictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.EvictResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("Evict"))
              .build();
        }
      }
    }
    return getEvictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.GetTermRequest,
      atomix.primitive.election.Election.GetTermResponse> getGetTermMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTerm",
      requestType = atomix.primitive.election.Election.GetTermRequest.class,
      responseType = atomix.primitive.election.Election.GetTermResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.GetTermRequest,
      atomix.primitive.election.Election.GetTermResponse> getGetTermMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.GetTermRequest, atomix.primitive.election.Election.GetTermResponse> getGetTermMethod;
    if ((getGetTermMethod = LeaderElectionServiceGrpc.getGetTermMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getGetTermMethod = LeaderElectionServiceGrpc.getGetTermMethod) == null) {
          LeaderElectionServiceGrpc.getGetTermMethod = getGetTermMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.GetTermRequest, atomix.primitive.election.Election.GetTermResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTerm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.GetTermRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.GetTermResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionServiceMethodDescriptorSupplier("GetTerm"))
              .build();
        }
      }
    }
    return getGetTermMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.Election.EventsRequest,
      atomix.primitive.election.Election.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.election.Election.EventsRequest.class,
      responseType = atomix.primitive.election.Election.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.Election.EventsRequest,
      atomix.primitive.election.Election.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.Election.EventsRequest, atomix.primitive.election.Election.EventsResponse> getEventsMethod;
    if ((getEventsMethod = LeaderElectionServiceGrpc.getEventsMethod) == null) {
      synchronized (LeaderElectionServiceGrpc.class) {
        if ((getEventsMethod = LeaderElectionServiceGrpc.getEventsMethod) == null) {
          LeaderElectionServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.Election.EventsRequest, atomix.primitive.election.Election.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.Election.EventsResponse.getDefaultInstance()))
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
     * Enter enters the leader election
     * </pre>
     */
    public void enter(atomix.primitive.election.Election.EnterRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EnterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public void withdraw(atomix.primitive.election.Election.WithdrawRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.WithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public void anoint(atomix.primitive.election.Election.AnointRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.AnointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public void promote(atomix.primitive.election.Election.PromoteRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.PromoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public void evict(atomix.primitive.election.Election.EvictRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EvictResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvictMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public void getTerm(atomix.primitive.election.Election.GetTermRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.GetTermResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTermMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public void events(atomix.primitive.election.Election.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.Election.EnterRequest,
                atomix.primitive.election.Election.EnterResponse>(
                  this, METHODID_ENTER)))
          .addMethod(
            getWithdrawMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.Election.WithdrawRequest,
                atomix.primitive.election.Election.WithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getAnointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.Election.AnointRequest,
                atomix.primitive.election.Election.AnointResponse>(
                  this, METHODID_ANOINT)))
          .addMethod(
            getPromoteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.Election.PromoteRequest,
                atomix.primitive.election.Election.PromoteResponse>(
                  this, METHODID_PROMOTE)))
          .addMethod(
            getEvictMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.Election.EvictRequest,
                atomix.primitive.election.Election.EvictResponse>(
                  this, METHODID_EVICT)))
          .addMethod(
            getGetTermMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.Election.GetTermRequest,
                atomix.primitive.election.Election.GetTermResponse>(
                  this, METHODID_GET_TERM)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.election.Election.EventsRequest,
                atomix.primitive.election.Election.EventsResponse>(
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
     * Enter enters the leader election
     * </pre>
     */
    public void enter(atomix.primitive.election.Election.EnterRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EnterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public void withdraw(atomix.primitive.election.Election.WithdrawRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.WithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public void anoint(atomix.primitive.election.Election.AnointRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.AnointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public void promote(atomix.primitive.election.Election.PromoteRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.PromoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPromoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public void evict(atomix.primitive.election.Election.EvictRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EvictResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvictMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public void getTerm(atomix.primitive.election.Election.GetTermRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.GetTermResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTermMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public void events(atomix.primitive.election.Election.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
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
     * Enter enters the leader election
     * </pre>
     */
    public atomix.primitive.election.Election.EnterResponse enter(atomix.primitive.election.Election.EnterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public atomix.primitive.election.Election.WithdrawResponse withdraw(atomix.primitive.election.Election.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public atomix.primitive.election.Election.AnointResponse anoint(atomix.primitive.election.Election.AnointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public atomix.primitive.election.Election.PromoteResponse promote(atomix.primitive.election.Election.PromoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPromoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public atomix.primitive.election.Election.EvictResponse evict(atomix.primitive.election.Election.EvictRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvictMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public atomix.primitive.election.Election.GetTermResponse getTerm(atomix.primitive.election.Election.GetTermRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTermMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.election.Election.EventsResponse> events(
        atomix.primitive.election.Election.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
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
     * Enter enters the leader election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.Election.EnterResponse> enter(
        atomix.primitive.election.Election.EnterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.Election.WithdrawResponse> withdraw(
        atomix.primitive.election.Election.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.Election.AnointResponse> anoint(
        atomix.primitive.election.Election.AnointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.Election.PromoteResponse> promote(
        atomix.primitive.election.Election.PromoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPromoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.Election.EvictResponse> evict(
        atomix.primitive.election.Election.EvictRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvictMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.Election.GetTermResponse> getTerm(
        atomix.primitive.election.Election.GetTermRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTermMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTER = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_ANOINT = 2;
  private static final int METHODID_PROMOTE = 3;
  private static final int METHODID_EVICT = 4;
  private static final int METHODID_GET_TERM = 5;
  private static final int METHODID_EVENTS = 6;

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
        case METHODID_ENTER:
          serviceImpl.enter((atomix.primitive.election.Election.EnterRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EnterResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((atomix.primitive.election.Election.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.WithdrawResponse>) responseObserver);
          break;
        case METHODID_ANOINT:
          serviceImpl.anoint((atomix.primitive.election.Election.AnointRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.AnointResponse>) responseObserver);
          break;
        case METHODID_PROMOTE:
          serviceImpl.promote((atomix.primitive.election.Election.PromoteRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.PromoteResponse>) responseObserver);
          break;
        case METHODID_EVICT:
          serviceImpl.evict((atomix.primitive.election.Election.EvictRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EvictResponse>) responseObserver);
          break;
        case METHODID_GET_TERM:
          serviceImpl.getTerm((atomix.primitive.election.Election.GetTermRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.GetTermResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.election.Election.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.Election.EventsResponse>) responseObserver);
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
      return atomix.primitive.election.Election.getDescriptor();
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
