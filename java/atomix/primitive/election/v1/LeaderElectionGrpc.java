package atomix.primitive.election.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * LeaderElection is a service for a leader election primitive
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.1)",
    comments = "Source: atomix/primitive/election/v1/primitive.proto")
public final class LeaderElectionGrpc {

  private LeaderElectionGrpc() {}

  public static final String SERVICE_NAME = "atomix.primitive.election.v1.LeaderElection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EnterRequest,
      atomix.primitive.election.v1.Primitive.EnterResponse> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enter",
      requestType = atomix.primitive.election.v1.Primitive.EnterRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.EnterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EnterRequest,
      atomix.primitive.election.v1.Primitive.EnterResponse> getEnterMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EnterRequest, atomix.primitive.election.v1.Primitive.EnterResponse> getEnterMethod;
    if ((getEnterMethod = LeaderElectionGrpc.getEnterMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getEnterMethod = LeaderElectionGrpc.getEnterMethod) == null) {
          LeaderElectionGrpc.getEnterMethod = getEnterMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.EnterRequest, atomix.primitive.election.v1.Primitive.EnterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.EnterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.EnterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("Enter"))
              .build();
        }
      }
    }
    return getEnterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.WithdrawRequest,
      atomix.primitive.election.v1.Primitive.WithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = atomix.primitive.election.v1.Primitive.WithdrawRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.WithdrawRequest,
      atomix.primitive.election.v1.Primitive.WithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.WithdrawRequest, atomix.primitive.election.v1.Primitive.WithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = LeaderElectionGrpc.getWithdrawMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getWithdrawMethod = LeaderElectionGrpc.getWithdrawMethod) == null) {
          LeaderElectionGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.WithdrawRequest, atomix.primitive.election.v1.Primitive.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.WithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.AnointRequest,
      atomix.primitive.election.v1.Primitive.AnointResponse> getAnointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Anoint",
      requestType = atomix.primitive.election.v1.Primitive.AnointRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.AnointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.AnointRequest,
      atomix.primitive.election.v1.Primitive.AnointResponse> getAnointMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.AnointRequest, atomix.primitive.election.v1.Primitive.AnointResponse> getAnointMethod;
    if ((getAnointMethod = LeaderElectionGrpc.getAnointMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getAnointMethod = LeaderElectionGrpc.getAnointMethod) == null) {
          LeaderElectionGrpc.getAnointMethod = getAnointMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.AnointRequest, atomix.primitive.election.v1.Primitive.AnointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Anoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.AnointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.AnointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("Anoint"))
              .build();
        }
      }
    }
    return getAnointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.PromoteRequest,
      atomix.primitive.election.v1.Primitive.PromoteResponse> getPromoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Promote",
      requestType = atomix.primitive.election.v1.Primitive.PromoteRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.PromoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.PromoteRequest,
      atomix.primitive.election.v1.Primitive.PromoteResponse> getPromoteMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.PromoteRequest, atomix.primitive.election.v1.Primitive.PromoteResponse> getPromoteMethod;
    if ((getPromoteMethod = LeaderElectionGrpc.getPromoteMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getPromoteMethod = LeaderElectionGrpc.getPromoteMethod) == null) {
          LeaderElectionGrpc.getPromoteMethod = getPromoteMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.PromoteRequest, atomix.primitive.election.v1.Primitive.PromoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Promote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.PromoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.PromoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("Promote"))
              .build();
        }
      }
    }
    return getPromoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EvictRequest,
      atomix.primitive.election.v1.Primitive.EvictResponse> getEvictMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Evict",
      requestType = atomix.primitive.election.v1.Primitive.EvictRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.EvictResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EvictRequest,
      atomix.primitive.election.v1.Primitive.EvictResponse> getEvictMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EvictRequest, atomix.primitive.election.v1.Primitive.EvictResponse> getEvictMethod;
    if ((getEvictMethod = LeaderElectionGrpc.getEvictMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getEvictMethod = LeaderElectionGrpc.getEvictMethod) == null) {
          LeaderElectionGrpc.getEvictMethod = getEvictMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.EvictRequest, atomix.primitive.election.v1.Primitive.EvictResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Evict"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.EvictRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.EvictResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("Evict"))
              .build();
        }
      }
    }
    return getEvictMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.GetTermRequest,
      atomix.primitive.election.v1.Primitive.GetTermResponse> getGetTermMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTerm",
      requestType = atomix.primitive.election.v1.Primitive.GetTermRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.GetTermResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.GetTermRequest,
      atomix.primitive.election.v1.Primitive.GetTermResponse> getGetTermMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.GetTermRequest, atomix.primitive.election.v1.Primitive.GetTermResponse> getGetTermMethod;
    if ((getGetTermMethod = LeaderElectionGrpc.getGetTermMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getGetTermMethod = LeaderElectionGrpc.getGetTermMethod) == null) {
          LeaderElectionGrpc.getGetTermMethod = getGetTermMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.GetTermRequest, atomix.primitive.election.v1.Primitive.GetTermResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTerm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.GetTermRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.GetTermResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("GetTerm"))
              .build();
        }
      }
    }
    return getGetTermMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EventsRequest,
      atomix.primitive.election.v1.Primitive.EventsResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.primitive.election.v1.Primitive.EventsRequest.class,
      responseType = atomix.primitive.election.v1.Primitive.EventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EventsRequest,
      atomix.primitive.election.v1.Primitive.EventsResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.primitive.election.v1.Primitive.EventsRequest, atomix.primitive.election.v1.Primitive.EventsResponse> getEventsMethod;
    if ((getEventsMethod = LeaderElectionGrpc.getEventsMethod) == null) {
      synchronized (LeaderElectionGrpc.class) {
        if ((getEventsMethod = LeaderElectionGrpc.getEventsMethod) == null) {
          LeaderElectionGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.primitive.election.v1.Primitive.EventsRequest, atomix.primitive.election.v1.Primitive.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.EventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.primitive.election.v1.Primitive.EventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeaderElectionMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeaderElectionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionStub>() {
        @java.lang.Override
        public LeaderElectionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionStub(channel, callOptions);
        }
      };
    return LeaderElectionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeaderElectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionBlockingStub>() {
        @java.lang.Override
        public LeaderElectionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionBlockingStub(channel, callOptions);
        }
      };
    return LeaderElectionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeaderElectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeaderElectionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeaderElectionFutureStub>() {
        @java.lang.Override
        public LeaderElectionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeaderElectionFutureStub(channel, callOptions);
        }
      };
    return LeaderElectionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LeaderElection is a service for a leader election primitive
   * </pre>
   */
  public static abstract class LeaderElectionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public void enter(atomix.primitive.election.v1.Primitive.EnterRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EnterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public void withdraw(atomix.primitive.election.v1.Primitive.WithdrawRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.WithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public void anoint(atomix.primitive.election.v1.Primitive.AnointRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.AnointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public void promote(atomix.primitive.election.v1.Primitive.PromoteRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.PromoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPromoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public void evict(atomix.primitive.election.v1.Primitive.EvictRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EvictResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvictMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public void getTerm(atomix.primitive.election.v1.Primitive.GetTermRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.GetTermResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTermMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public void events(atomix.primitive.election.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.EnterRequest,
                atomix.primitive.election.v1.Primitive.EnterResponse>(
                  this, METHODID_ENTER)))
          .addMethod(
            getWithdrawMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.WithdrawRequest,
                atomix.primitive.election.v1.Primitive.WithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getAnointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.AnointRequest,
                atomix.primitive.election.v1.Primitive.AnointResponse>(
                  this, METHODID_ANOINT)))
          .addMethod(
            getPromoteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.PromoteRequest,
                atomix.primitive.election.v1.Primitive.PromoteResponse>(
                  this, METHODID_PROMOTE)))
          .addMethod(
            getEvictMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.EvictRequest,
                atomix.primitive.election.v1.Primitive.EvictResponse>(
                  this, METHODID_EVICT)))
          .addMethod(
            getGetTermMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.GetTermRequest,
                atomix.primitive.election.v1.Primitive.GetTermResponse>(
                  this, METHODID_GET_TERM)))
          .addMethod(
            getEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                atomix.primitive.election.v1.Primitive.EventsRequest,
                atomix.primitive.election.v1.Primitive.EventsResponse>(
                  this, METHODID_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * LeaderElection is a service for a leader election primitive
   * </pre>
   */
  public static final class LeaderElectionStub extends io.grpc.stub.AbstractAsyncStub<LeaderElectionStub> {
    private LeaderElectionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public void enter(atomix.primitive.election.v1.Primitive.EnterRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EnterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public void withdraw(atomix.primitive.election.v1.Primitive.WithdrawRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.WithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public void anoint(atomix.primitive.election.v1.Primitive.AnointRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.AnointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public void promote(atomix.primitive.election.v1.Primitive.PromoteRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.PromoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPromoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public void evict(atomix.primitive.election.v1.Primitive.EvictRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EvictResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvictMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public void getTerm(atomix.primitive.election.v1.Primitive.GetTermRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.GetTermResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTermMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public void events(atomix.primitive.election.v1.Primitive.EventsRequest request,
        io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LeaderElection is a service for a leader election primitive
   * </pre>
   */
  public static final class LeaderElectionBlockingStub extends io.grpc.stub.AbstractBlockingStub<LeaderElectionBlockingStub> {
    private LeaderElectionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public atomix.primitive.election.v1.Primitive.EnterResponse enter(atomix.primitive.election.v1.Primitive.EnterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public atomix.primitive.election.v1.Primitive.WithdrawResponse withdraw(atomix.primitive.election.v1.Primitive.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public atomix.primitive.election.v1.Primitive.AnointResponse anoint(atomix.primitive.election.v1.Primitive.AnointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public atomix.primitive.election.v1.Primitive.PromoteResponse promote(atomix.primitive.election.v1.Primitive.PromoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPromoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public atomix.primitive.election.v1.Primitive.EvictResponse evict(atomix.primitive.election.v1.Primitive.EvictRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvictMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public atomix.primitive.election.v1.Primitive.GetTermResponse getTerm(atomix.primitive.election.v1.Primitive.GetTermRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTermMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for leadership events
     * </pre>
     */
    public java.util.Iterator<atomix.primitive.election.v1.Primitive.EventsResponse> events(
        atomix.primitive.election.v1.Primitive.EventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LeaderElection is a service for a leader election primitive
   * </pre>
   */
  public static final class LeaderElectionFutureStub extends io.grpc.stub.AbstractFutureStub<LeaderElectionFutureStub> {
    private LeaderElectionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeaderElectionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeaderElectionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enter enters the leader election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Primitive.EnterResponse> enter(
        atomix.primitive.election.v1.Primitive.EnterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw withdraws a candidate from the leader election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Primitive.WithdrawResponse> withdraw(
        atomix.primitive.election.v1.Primitive.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Anoint anoints a candidate leader
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Primitive.AnointResponse> anoint(
        atomix.primitive.election.v1.Primitive.AnointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promote promotes a candidate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Primitive.PromoteResponse> promote(
        atomix.primitive.election.v1.Primitive.PromoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPromoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Evict evicts a candidate from the election
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Primitive.EvictResponse> evict(
        atomix.primitive.election.v1.Primitive.EvictRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvictMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTerm gets the current leadership term
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.primitive.election.v1.Primitive.GetTermResponse> getTerm(
        atomix.primitive.election.v1.Primitive.GetTermRequest request) {
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
    private final LeaderElectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LeaderElectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER:
          serviceImpl.enter((atomix.primitive.election.v1.Primitive.EnterRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EnterResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((atomix.primitive.election.v1.Primitive.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.WithdrawResponse>) responseObserver);
          break;
        case METHODID_ANOINT:
          serviceImpl.anoint((atomix.primitive.election.v1.Primitive.AnointRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.AnointResponse>) responseObserver);
          break;
        case METHODID_PROMOTE:
          serviceImpl.promote((atomix.primitive.election.v1.Primitive.PromoteRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.PromoteResponse>) responseObserver);
          break;
        case METHODID_EVICT:
          serviceImpl.evict((atomix.primitive.election.v1.Primitive.EvictRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EvictResponse>) responseObserver);
          break;
        case METHODID_GET_TERM:
          serviceImpl.getTerm((atomix.primitive.election.v1.Primitive.GetTermRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.GetTermResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.primitive.election.v1.Primitive.EventsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.primitive.election.v1.Primitive.EventsResponse>) responseObserver);
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

  private static abstract class LeaderElectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeaderElectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.primitive.election.v1.Primitive.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeaderElection");
    }
  }

  private static final class LeaderElectionFileDescriptorSupplier
      extends LeaderElectionBaseDescriptorSupplier {
    LeaderElectionFileDescriptorSupplier() {}
  }

  private static final class LeaderElectionMethodDescriptorSupplier
      extends LeaderElectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LeaderElectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (LeaderElectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeaderElectionFileDescriptorSupplier())
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
