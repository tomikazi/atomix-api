package atomix.storage.log;

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
 * LogService log service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/storage/log/log.proto")
public final class LogServiceGrpc {

  private LogServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.storage.log.LogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.CreateRequest,
      atomix.storage.log.Log.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.storage.log.Log.CreateRequest.class,
      responseType = atomix.storage.log.Log.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.CreateRequest,
      atomix.storage.log.Log.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.CreateRequest, atomix.storage.log.Log.CreateResponse> getCreateMethod;
    if ((getCreateMethod = LogServiceGrpc.getCreateMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getCreateMethod = LogServiceGrpc.getCreateMethod) == null) {
          LogServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.CreateRequest, atomix.storage.log.Log.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.CloseRequest,
      atomix.storage.log.Log.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.storage.log.Log.CloseRequest.class,
      responseType = atomix.storage.log.Log.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.CloseRequest,
      atomix.storage.log.Log.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.CloseRequest, atomix.storage.log.Log.CloseResponse> getCloseMethod;
    if ((getCloseMethod = LogServiceGrpc.getCloseMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getCloseMethod = LogServiceGrpc.getCloseMethod) == null) {
          LogServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.CloseRequest, atomix.storage.log.Log.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.SizeRequest,
      atomix.storage.log.Log.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.storage.log.Log.SizeRequest.class,
      responseType = atomix.storage.log.Log.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.SizeRequest,
      atomix.storage.log.Log.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.SizeRequest, atomix.storage.log.Log.SizeResponse> getSizeMethod;
    if ((getSizeMethod = LogServiceGrpc.getSizeMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getSizeMethod = LogServiceGrpc.getSizeMethod) == null) {
          LogServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.SizeRequest, atomix.storage.log.Log.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.ExistsRequest,
      atomix.storage.log.Log.ExistsResponse> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = atomix.storage.log.Log.ExistsRequest.class,
      responseType = atomix.storage.log.Log.ExistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.ExistsRequest,
      atomix.storage.log.Log.ExistsResponse> getExistsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.ExistsRequest, atomix.storage.log.Log.ExistsResponse> getExistsMethod;
    if ((getExistsMethod = LogServiceGrpc.getExistsMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getExistsMethod = LogServiceGrpc.getExistsMethod) == null) {
          LogServiceGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.ExistsRequest, atomix.storage.log.Log.ExistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.ExistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.ExistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.AppendRequest,
      atomix.storage.log.Log.AppendResponse> getAppendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Append",
      requestType = atomix.storage.log.Log.AppendRequest.class,
      responseType = atomix.storage.log.Log.AppendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.AppendRequest,
      atomix.storage.log.Log.AppendResponse> getAppendMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.AppendRequest, atomix.storage.log.Log.AppendResponse> getAppendMethod;
    if ((getAppendMethod = LogServiceGrpc.getAppendMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getAppendMethod = LogServiceGrpc.getAppendMethod) == null) {
          LogServiceGrpc.getAppendMethod = getAppendMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.AppendRequest, atomix.storage.log.Log.AppendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Append"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.AppendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.AppendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Append"))
              .build();
        }
      }
    }
    return getAppendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.GetRequest,
      atomix.storage.log.Log.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.storage.log.Log.GetRequest.class,
      responseType = atomix.storage.log.Log.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.GetRequest,
      atomix.storage.log.Log.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.GetRequest, atomix.storage.log.Log.GetResponse> getGetMethod;
    if ((getGetMethod = LogServiceGrpc.getGetMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getGetMethod = LogServiceGrpc.getGetMethod) == null) {
          LogServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.GetRequest, atomix.storage.log.Log.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.FirstEntryRequest,
      atomix.storage.log.Log.FirstEntryResponse> getFirstEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FirstEntry",
      requestType = atomix.storage.log.Log.FirstEntryRequest.class,
      responseType = atomix.storage.log.Log.FirstEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.FirstEntryRequest,
      atomix.storage.log.Log.FirstEntryResponse> getFirstEntryMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.FirstEntryRequest, atomix.storage.log.Log.FirstEntryResponse> getFirstEntryMethod;
    if ((getFirstEntryMethod = LogServiceGrpc.getFirstEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getFirstEntryMethod = LogServiceGrpc.getFirstEntryMethod) == null) {
          LogServiceGrpc.getFirstEntryMethod = getFirstEntryMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.FirstEntryRequest, atomix.storage.log.Log.FirstEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FirstEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.FirstEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.FirstEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("FirstEntry"))
              .build();
        }
      }
    }
    return getFirstEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.LastEntryRequest,
      atomix.storage.log.Log.LastEntryResponse> getLastEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEntry",
      requestType = atomix.storage.log.Log.LastEntryRequest.class,
      responseType = atomix.storage.log.Log.LastEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.LastEntryRequest,
      atomix.storage.log.Log.LastEntryResponse> getLastEntryMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.LastEntryRequest, atomix.storage.log.Log.LastEntryResponse> getLastEntryMethod;
    if ((getLastEntryMethod = LogServiceGrpc.getLastEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLastEntryMethod = LogServiceGrpc.getLastEntryMethod) == null) {
          LogServiceGrpc.getLastEntryMethod = getLastEntryMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.LastEntryRequest, atomix.storage.log.Log.LastEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.LastEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.LastEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("LastEntry"))
              .build();
        }
      }
    }
    return getLastEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.PrevEntryRequest,
      atomix.storage.log.Log.PrevEntryResponse> getPrevEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevEntry",
      requestType = atomix.storage.log.Log.PrevEntryRequest.class,
      responseType = atomix.storage.log.Log.PrevEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.PrevEntryRequest,
      atomix.storage.log.Log.PrevEntryResponse> getPrevEntryMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.PrevEntryRequest, atomix.storage.log.Log.PrevEntryResponse> getPrevEntryMethod;
    if ((getPrevEntryMethod = LogServiceGrpc.getPrevEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getPrevEntryMethod = LogServiceGrpc.getPrevEntryMethod) == null) {
          LogServiceGrpc.getPrevEntryMethod = getPrevEntryMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.PrevEntryRequest, atomix.storage.log.Log.PrevEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.PrevEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.PrevEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("PrevEntry"))
              .build();
        }
      }
    }
    return getPrevEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.NextEntryRequest,
      atomix.storage.log.Log.NextEntryResponse> getNextEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextEntry",
      requestType = atomix.storage.log.Log.NextEntryRequest.class,
      responseType = atomix.storage.log.Log.NextEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.NextEntryRequest,
      atomix.storage.log.Log.NextEntryResponse> getNextEntryMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.NextEntryRequest, atomix.storage.log.Log.NextEntryResponse> getNextEntryMethod;
    if ((getNextEntryMethod = LogServiceGrpc.getNextEntryMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getNextEntryMethod = LogServiceGrpc.getNextEntryMethod) == null) {
          LogServiceGrpc.getNextEntryMethod = getNextEntryMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.NextEntryRequest, atomix.storage.log.Log.NextEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.NextEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.NextEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("NextEntry"))
              .build();
        }
      }
    }
    return getNextEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.RemoveRequest,
      atomix.storage.log.Log.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.storage.log.Log.RemoveRequest.class,
      responseType = atomix.storage.log.Log.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.RemoveRequest,
      atomix.storage.log.Log.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.RemoveRequest, atomix.storage.log.Log.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = LogServiceGrpc.getRemoveMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getRemoveMethod = LogServiceGrpc.getRemoveMethod) == null) {
          LogServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.RemoveRequest, atomix.storage.log.Log.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.ClearRequest,
      atomix.storage.log.Log.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.storage.log.Log.ClearRequest.class,
      responseType = atomix.storage.log.Log.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.ClearRequest,
      atomix.storage.log.Log.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.ClearRequest, atomix.storage.log.Log.ClearResponse> getClearMethod;
    if ((getClearMethod = LogServiceGrpc.getClearMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getClearMethod = LogServiceGrpc.getClearMethod) == null) {
          LogServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.ClearRequest, atomix.storage.log.Log.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.EventRequest,
      atomix.storage.log.Log.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.storage.log.Log.EventRequest.class,
      responseType = atomix.storage.log.Log.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.EventRequest,
      atomix.storage.log.Log.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.EventRequest, atomix.storage.log.Log.EventResponse> getEventsMethod;
    if ((getEventsMethod = LogServiceGrpc.getEventsMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getEventsMethod = LogServiceGrpc.getEventsMethod) == null) {
          LogServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.EventRequest, atomix.storage.log.Log.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.storage.log.Log.EntriesRequest,
      atomix.storage.log.Log.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.storage.log.Log.EntriesRequest.class,
      responseType = atomix.storage.log.Log.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.storage.log.Log.EntriesRequest,
      atomix.storage.log.Log.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.storage.log.Log.EntriesRequest, atomix.storage.log.Log.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = LogServiceGrpc.getEntriesMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getEntriesMethod = LogServiceGrpc.getEntriesMethod) == null) {
          LogServiceGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.storage.log.Log.EntriesRequest, atomix.storage.log.Log.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.storage.log.Log.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceStub>() {
        @java.lang.Override
        public LogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceStub(channel, callOptions);
        }
      };
    return LogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub>() {
        @java.lang.Override
        public LogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceBlockingStub(channel, callOptions);
        }
      };
    return LogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub>() {
        @java.lang.Override
        public LogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceFutureStub(channel, callOptions);
        }
      };
    return LogServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static abstract class LogServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates a log
     * </pre>
     */
    public void create(atomix.storage.log.Log.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes a log
     * </pre>
     */
    public void close(atomix.storage.log.Log.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public void size(atomix.storage.log.Log.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.SizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exists checks whether an index exists in the log
     * </pre>
     */
    public void exists(atomix.storage.log.Log.ExistsRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.ExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public void append(atomix.storage.log.Log.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.AppendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAppendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public void get(atomix.storage.log.Log.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public void firstEntry(atomix.storage.log.Log.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.FirstEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFirstEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public void lastEntry(atomix.storage.log.Log.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.LastEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLastEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public void prevEntry(atomix.storage.log.Log.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.PrevEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrevEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public void nextEntry(atomix.storage.log.Log.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.NextEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNextEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public void remove(atomix.storage.log.Log.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.RemoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public void clear(atomix.storage.log.Log.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.ClearResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.storage.log.Log.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public void entries(atomix.storage.log.Log.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.EntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.CreateRequest,
                atomix.storage.log.Log.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.CloseRequest,
                atomix.storage.log.Log.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.SizeRequest,
                atomix.storage.log.Log.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getExistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.ExistsRequest,
                atomix.storage.log.Log.ExistsResponse>(
                  this, METHODID_EXISTS)))
          .addMethod(
            getAppendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.AppendRequest,
                atomix.storage.log.Log.AppendResponse>(
                  this, METHODID_APPEND)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.GetRequest,
                atomix.storage.log.Log.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getFirstEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.FirstEntryRequest,
                atomix.storage.log.Log.FirstEntryResponse>(
                  this, METHODID_FIRST_ENTRY)))
          .addMethod(
            getLastEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.LastEntryRequest,
                atomix.storage.log.Log.LastEntryResponse>(
                  this, METHODID_LAST_ENTRY)))
          .addMethod(
            getPrevEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.PrevEntryRequest,
                atomix.storage.log.Log.PrevEntryResponse>(
                  this, METHODID_PREV_ENTRY)))
          .addMethod(
            getNextEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.NextEntryRequest,
                atomix.storage.log.Log.NextEntryResponse>(
                  this, METHODID_NEXT_ENTRY)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.RemoveRequest,
                atomix.storage.log.Log.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.storage.log.Log.ClearRequest,
                atomix.storage.log.Log.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.log.Log.EventRequest,
                atomix.storage.log.Log.EventResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.storage.log.Log.EntriesRequest,
                atomix.storage.log.Log.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static final class LogServiceStub extends io.grpc.stub.AbstractAsyncStub<LogServiceStub> {
    private LogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a log
     * </pre>
     */
    public void create(atomix.storage.log.Log.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes a log
     * </pre>
     */
    public void close(atomix.storage.log.Log.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public void size(atomix.storage.log.Log.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.SizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exists checks whether an index exists in the log
     * </pre>
     */
    public void exists(atomix.storage.log.Log.ExistsRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.ExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public void append(atomix.storage.log.Log.AppendRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.AppendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public void get(atomix.storage.log.Log.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public void firstEntry(atomix.storage.log.Log.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.FirstEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public void lastEntry(atomix.storage.log.Log.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.LastEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public void prevEntry(atomix.storage.log.Log.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.PrevEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public void nextEntry(atomix.storage.log.Log.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.NextEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public void remove(atomix.storage.log.Log.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.RemoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public void clear(atomix.storage.log.Log.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.ClearResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.storage.log.Log.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public void entries(atomix.storage.log.Log.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.storage.log.Log.EntriesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static final class LogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogServiceBlockingStub> {
    private LogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a log
     * </pre>
     */
    public atomix.storage.log.Log.CreateResponse create(atomix.storage.log.Log.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes a log
     * </pre>
     */
    public atomix.storage.log.Log.CloseResponse close(atomix.storage.log.Log.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public atomix.storage.log.Log.SizeResponse size(atomix.storage.log.Log.SizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exists checks whether an index exists in the log
     * </pre>
     */
    public atomix.storage.log.Log.ExistsResponse exists(atomix.storage.log.Log.ExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public atomix.storage.log.Log.AppendResponse append(atomix.storage.log.Log.AppendRequest request) {
      return blockingUnaryCall(
          getChannel(), getAppendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public atomix.storage.log.Log.GetResponse get(atomix.storage.log.Log.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public atomix.storage.log.Log.FirstEntryResponse firstEntry(atomix.storage.log.Log.FirstEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getFirstEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public atomix.storage.log.Log.LastEntryResponse lastEntry(atomix.storage.log.Log.LastEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getLastEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public atomix.storage.log.Log.PrevEntryResponse prevEntry(atomix.storage.log.Log.PrevEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrevEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public atomix.storage.log.Log.NextEntryResponse nextEntry(atomix.storage.log.Log.NextEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getNextEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public atomix.storage.log.Log.RemoveResponse remove(atomix.storage.log.Log.RemoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public atomix.storage.log.Log.ClearResponse clear(atomix.storage.log.Log.ClearRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.storage.log.Log.EventResponse> events(
        atomix.storage.log.Log.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the log
     * </pre>
     */
    public java.util.Iterator<atomix.storage.log.Log.EntriesResponse> entries(
        atomix.storage.log.Log.EntriesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * LogService log service
   * </pre>
   */
  public static final class LogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LogServiceFutureStub> {
    private LogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates a log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.CreateResponse> create(
        atomix.storage.log.Log.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes a log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.CloseResponse> close(
        atomix.storage.log.Log.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Size returns the size of the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.SizeResponse> size(
        atomix.storage.log.Log.SizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exists checks whether an index exists in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.ExistsResponse> exists(
        atomix.storage.log.Log.ExistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Appends appends an entry into the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.AppendResponse> append(
        atomix.storage.log.Log.AppendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAppendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for an index
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.GetResponse> get(
        atomix.storage.log.Log.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.FirstEntryResponse> firstEntry(
        atomix.storage.log.Log.FirstEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.LastEntryResponse> lastEntry(
        atomix.storage.log.Log.LastEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.PrevEntryResponse> prevEntry(
        atomix.storage.log.Log.PrevEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.NextEntryResponse> nextEntry(
        atomix.storage.log.Log.NextEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.RemoveResponse> remove(
        atomix.storage.log.Log.RemoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.storage.log.Log.ClearResponse> clear(
        atomix.storage.log.Log.ClearRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SIZE = 2;
  private static final int METHODID_EXISTS = 3;
  private static final int METHODID_APPEND = 4;
  private static final int METHODID_GET = 5;
  private static final int METHODID_FIRST_ENTRY = 6;
  private static final int METHODID_LAST_ENTRY = 7;
  private static final int METHODID_PREV_ENTRY = 8;
  private static final int METHODID_NEXT_ENTRY = 9;
  private static final int METHODID_REMOVE = 10;
  private static final int METHODID_CLEAR = 11;
  private static final int METHODID_EVENTS = 12;
  private static final int METHODID_ENTRIES = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.storage.log.Log.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.storage.log.Log.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.CloseResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((atomix.storage.log.Log.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.SizeResponse>) responseObserver);
          break;
        case METHODID_EXISTS:
          serviceImpl.exists((atomix.storage.log.Log.ExistsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.ExistsResponse>) responseObserver);
          break;
        case METHODID_APPEND:
          serviceImpl.append((atomix.storage.log.Log.AppendRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.AppendResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.storage.log.Log.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.GetResponse>) responseObserver);
          break;
        case METHODID_FIRST_ENTRY:
          serviceImpl.firstEntry((atomix.storage.log.Log.FirstEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.FirstEntryResponse>) responseObserver);
          break;
        case METHODID_LAST_ENTRY:
          serviceImpl.lastEntry((atomix.storage.log.Log.LastEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.LastEntryResponse>) responseObserver);
          break;
        case METHODID_PREV_ENTRY:
          serviceImpl.prevEntry((atomix.storage.log.Log.PrevEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.PrevEntryResponse>) responseObserver);
          break;
        case METHODID_NEXT_ENTRY:
          serviceImpl.nextEntry((atomix.storage.log.Log.NextEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.NextEntryResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.storage.log.Log.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.storage.log.Log.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.storage.log.Log.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.EventResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.storage.log.Log.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.storage.log.Log.EntriesResponse>) responseObserver);
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

  private static abstract class LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.storage.log.Log.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogService");
    }
  }

  private static final class LogServiceFileDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier {
    LogServiceFileDescriptorSupplier() {}
  }

  private static final class LogServiceMethodDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSizeMethod())
              .addMethod(getExistsMethod())
              .addMethod(getAppendMethod())
              .addMethod(getGetMethod())
              .addMethod(getFirstEntryMethod())
              .addMethod(getLastEntryMethod())
              .addMethod(getPrevEntryMethod())
              .addMethod(getNextEntryMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getClearMethod())
              .addMethod(getEventsMethod())
              .addMethod(getEntriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
