package atomix.indexedmap;

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
 * IndexedMap service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: atomix/indexedmap/indexedmap.proto")
public final class IndexedMapServiceGrpc {

  private IndexedMapServiceGrpc() {}

  public static final String SERVICE_NAME = "atomix.indexedmap.IndexedMapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.CreateRequest,
      atomix.indexedmap.Indexedmap.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = atomix.indexedmap.Indexedmap.CreateRequest.class,
      responseType = atomix.indexedmap.Indexedmap.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.CreateRequest,
      atomix.indexedmap.Indexedmap.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.CreateRequest, atomix.indexedmap.Indexedmap.CreateResponse> getCreateMethod;
    if ((getCreateMethod = IndexedMapServiceGrpc.getCreateMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getCreateMethod = IndexedMapServiceGrpc.getCreateMethod) == null) {
          IndexedMapServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.CreateRequest, atomix.indexedmap.Indexedmap.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.CloseRequest,
      atomix.indexedmap.Indexedmap.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = atomix.indexedmap.Indexedmap.CloseRequest.class,
      responseType = atomix.indexedmap.Indexedmap.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.CloseRequest,
      atomix.indexedmap.Indexedmap.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.CloseRequest, atomix.indexedmap.Indexedmap.CloseResponse> getCloseMethod;
    if ((getCloseMethod = IndexedMapServiceGrpc.getCloseMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getCloseMethod = IndexedMapServiceGrpc.getCloseMethod) == null) {
          IndexedMapServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.CloseRequest, atomix.indexedmap.Indexedmap.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.SizeRequest,
      atomix.indexedmap.Indexedmap.SizeResponse> getSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Size",
      requestType = atomix.indexedmap.Indexedmap.SizeRequest.class,
      responseType = atomix.indexedmap.Indexedmap.SizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.SizeRequest,
      atomix.indexedmap.Indexedmap.SizeResponse> getSizeMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.SizeRequest, atomix.indexedmap.Indexedmap.SizeResponse> getSizeMethod;
    if ((getSizeMethod = IndexedMapServiceGrpc.getSizeMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getSizeMethod = IndexedMapServiceGrpc.getSizeMethod) == null) {
          IndexedMapServiceGrpc.getSizeMethod = getSizeMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.SizeRequest, atomix.indexedmap.Indexedmap.SizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Size"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.SizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.SizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Size"))
              .build();
        }
      }
    }
    return getSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ExistsRequest,
      atomix.indexedmap.Indexedmap.ExistsResponse> getExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exists",
      requestType = atomix.indexedmap.Indexedmap.ExistsRequest.class,
      responseType = atomix.indexedmap.Indexedmap.ExistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ExistsRequest,
      atomix.indexedmap.Indexedmap.ExistsResponse> getExistsMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ExistsRequest, atomix.indexedmap.Indexedmap.ExistsResponse> getExistsMethod;
    if ((getExistsMethod = IndexedMapServiceGrpc.getExistsMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getExistsMethod = IndexedMapServiceGrpc.getExistsMethod) == null) {
          IndexedMapServiceGrpc.getExistsMethod = getExistsMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.ExistsRequest, atomix.indexedmap.Indexedmap.ExistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.ExistsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.ExistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Exists"))
              .build();
        }
      }
    }
    return getExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.PutRequest,
      atomix.indexedmap.Indexedmap.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = atomix.indexedmap.Indexedmap.PutRequest.class,
      responseType = atomix.indexedmap.Indexedmap.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.PutRequest,
      atomix.indexedmap.Indexedmap.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.PutRequest, atomix.indexedmap.Indexedmap.PutResponse> getPutMethod;
    if ((getPutMethod = IndexedMapServiceGrpc.getPutMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getPutMethod = IndexedMapServiceGrpc.getPutMethod) == null) {
          IndexedMapServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.PutRequest, atomix.indexedmap.Indexedmap.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ReplaceRequest,
      atomix.indexedmap.Indexedmap.ReplaceResponse> getReplaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Replace",
      requestType = atomix.indexedmap.Indexedmap.ReplaceRequest.class,
      responseType = atomix.indexedmap.Indexedmap.ReplaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ReplaceRequest,
      atomix.indexedmap.Indexedmap.ReplaceResponse> getReplaceMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ReplaceRequest, atomix.indexedmap.Indexedmap.ReplaceResponse> getReplaceMethod;
    if ((getReplaceMethod = IndexedMapServiceGrpc.getReplaceMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getReplaceMethod = IndexedMapServiceGrpc.getReplaceMethod) == null) {
          IndexedMapServiceGrpc.getReplaceMethod = getReplaceMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.ReplaceRequest, atomix.indexedmap.Indexedmap.ReplaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Replace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.ReplaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.ReplaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Replace"))
              .build();
        }
      }
    }
    return getReplaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.GetRequest,
      atomix.indexedmap.Indexedmap.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = atomix.indexedmap.Indexedmap.GetRequest.class,
      responseType = atomix.indexedmap.Indexedmap.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.GetRequest,
      atomix.indexedmap.Indexedmap.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.GetRequest, atomix.indexedmap.Indexedmap.GetResponse> getGetMethod;
    if ((getGetMethod = IndexedMapServiceGrpc.getGetMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getGetMethod = IndexedMapServiceGrpc.getGetMethod) == null) {
          IndexedMapServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.GetRequest, atomix.indexedmap.Indexedmap.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.FirstEntryRequest,
      atomix.indexedmap.Indexedmap.FirstEntryResponse> getFirstEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FirstEntry",
      requestType = atomix.indexedmap.Indexedmap.FirstEntryRequest.class,
      responseType = atomix.indexedmap.Indexedmap.FirstEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.FirstEntryRequest,
      atomix.indexedmap.Indexedmap.FirstEntryResponse> getFirstEntryMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.FirstEntryRequest, atomix.indexedmap.Indexedmap.FirstEntryResponse> getFirstEntryMethod;
    if ((getFirstEntryMethod = IndexedMapServiceGrpc.getFirstEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getFirstEntryMethod = IndexedMapServiceGrpc.getFirstEntryMethod) == null) {
          IndexedMapServiceGrpc.getFirstEntryMethod = getFirstEntryMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.FirstEntryRequest, atomix.indexedmap.Indexedmap.FirstEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FirstEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.FirstEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.FirstEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("FirstEntry"))
              .build();
        }
      }
    }
    return getFirstEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.LastEntryRequest,
      atomix.indexedmap.Indexedmap.LastEntryResponse> getLastEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEntry",
      requestType = atomix.indexedmap.Indexedmap.LastEntryRequest.class,
      responseType = atomix.indexedmap.Indexedmap.LastEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.LastEntryRequest,
      atomix.indexedmap.Indexedmap.LastEntryResponse> getLastEntryMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.LastEntryRequest, atomix.indexedmap.Indexedmap.LastEntryResponse> getLastEntryMethod;
    if ((getLastEntryMethod = IndexedMapServiceGrpc.getLastEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getLastEntryMethod = IndexedMapServiceGrpc.getLastEntryMethod) == null) {
          IndexedMapServiceGrpc.getLastEntryMethod = getLastEntryMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.LastEntryRequest, atomix.indexedmap.Indexedmap.LastEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.LastEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.LastEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("LastEntry"))
              .build();
        }
      }
    }
    return getLastEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.PrevEntryRequest,
      atomix.indexedmap.Indexedmap.PrevEntryResponse> getPrevEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrevEntry",
      requestType = atomix.indexedmap.Indexedmap.PrevEntryRequest.class,
      responseType = atomix.indexedmap.Indexedmap.PrevEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.PrevEntryRequest,
      atomix.indexedmap.Indexedmap.PrevEntryResponse> getPrevEntryMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.PrevEntryRequest, atomix.indexedmap.Indexedmap.PrevEntryResponse> getPrevEntryMethod;
    if ((getPrevEntryMethod = IndexedMapServiceGrpc.getPrevEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getPrevEntryMethod = IndexedMapServiceGrpc.getPrevEntryMethod) == null) {
          IndexedMapServiceGrpc.getPrevEntryMethod = getPrevEntryMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.PrevEntryRequest, atomix.indexedmap.Indexedmap.PrevEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrevEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.PrevEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.PrevEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("PrevEntry"))
              .build();
        }
      }
    }
    return getPrevEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.NextEntryRequest,
      atomix.indexedmap.Indexedmap.NextEntryResponse> getNextEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextEntry",
      requestType = atomix.indexedmap.Indexedmap.NextEntryRequest.class,
      responseType = atomix.indexedmap.Indexedmap.NextEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.NextEntryRequest,
      atomix.indexedmap.Indexedmap.NextEntryResponse> getNextEntryMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.NextEntryRequest, atomix.indexedmap.Indexedmap.NextEntryResponse> getNextEntryMethod;
    if ((getNextEntryMethod = IndexedMapServiceGrpc.getNextEntryMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getNextEntryMethod = IndexedMapServiceGrpc.getNextEntryMethod) == null) {
          IndexedMapServiceGrpc.getNextEntryMethod = getNextEntryMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.NextEntryRequest, atomix.indexedmap.Indexedmap.NextEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.NextEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.NextEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("NextEntry"))
              .build();
        }
      }
    }
    return getNextEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.RemoveRequest,
      atomix.indexedmap.Indexedmap.RemoveResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = atomix.indexedmap.Indexedmap.RemoveRequest.class,
      responseType = atomix.indexedmap.Indexedmap.RemoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.RemoveRequest,
      atomix.indexedmap.Indexedmap.RemoveResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.RemoveRequest, atomix.indexedmap.Indexedmap.RemoveResponse> getRemoveMethod;
    if ((getRemoveMethod = IndexedMapServiceGrpc.getRemoveMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getRemoveMethod = IndexedMapServiceGrpc.getRemoveMethod) == null) {
          IndexedMapServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.RemoveRequest, atomix.indexedmap.Indexedmap.RemoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.RemoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.RemoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ClearRequest,
      atomix.indexedmap.Indexedmap.ClearResponse> getClearMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Clear",
      requestType = atomix.indexedmap.Indexedmap.ClearRequest.class,
      responseType = atomix.indexedmap.Indexedmap.ClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ClearRequest,
      atomix.indexedmap.Indexedmap.ClearResponse> getClearMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.ClearRequest, atomix.indexedmap.Indexedmap.ClearResponse> getClearMethod;
    if ((getClearMethod = IndexedMapServiceGrpc.getClearMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getClearMethod = IndexedMapServiceGrpc.getClearMethod) == null) {
          IndexedMapServiceGrpc.getClearMethod = getClearMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.ClearRequest, atomix.indexedmap.Indexedmap.ClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Clear"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.ClearRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.ClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Clear"))
              .build();
        }
      }
    }
    return getClearMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.EventRequest,
      atomix.indexedmap.Indexedmap.EventResponse> getEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Events",
      requestType = atomix.indexedmap.Indexedmap.EventRequest.class,
      responseType = atomix.indexedmap.Indexedmap.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.EventRequest,
      atomix.indexedmap.Indexedmap.EventResponse> getEventsMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.EventRequest, atomix.indexedmap.Indexedmap.EventResponse> getEventsMethod;
    if ((getEventsMethod = IndexedMapServiceGrpc.getEventsMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getEventsMethod = IndexedMapServiceGrpc.getEventsMethod) == null) {
          IndexedMapServiceGrpc.getEventsMethod = getEventsMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.EventRequest, atomix.indexedmap.Indexedmap.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Events"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Events"))
              .build();
        }
      }
    }
    return getEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.EntriesRequest,
      atomix.indexedmap.Indexedmap.EntriesResponse> getEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Entries",
      requestType = atomix.indexedmap.Indexedmap.EntriesRequest.class,
      responseType = atomix.indexedmap.Indexedmap.EntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.EntriesRequest,
      atomix.indexedmap.Indexedmap.EntriesResponse> getEntriesMethod() {
    io.grpc.MethodDescriptor<atomix.indexedmap.Indexedmap.EntriesRequest, atomix.indexedmap.Indexedmap.EntriesResponse> getEntriesMethod;
    if ((getEntriesMethod = IndexedMapServiceGrpc.getEntriesMethod) == null) {
      synchronized (IndexedMapServiceGrpc.class) {
        if ((getEntriesMethod = IndexedMapServiceGrpc.getEntriesMethod) == null) {
          IndexedMapServiceGrpc.getEntriesMethod = getEntriesMethod =
              io.grpc.MethodDescriptor.<atomix.indexedmap.Indexedmap.EntriesRequest, atomix.indexedmap.Indexedmap.EntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Entries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.EntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  atomix.indexedmap.Indexedmap.EntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IndexedMapServiceMethodDescriptorSupplier("Entries"))
              .build();
        }
      }
    }
    return getEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IndexedMapServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceStub>() {
        @java.lang.Override
        public IndexedMapServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapServiceStub(channel, callOptions);
        }
      };
    return IndexedMapServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IndexedMapServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceBlockingStub>() {
        @java.lang.Override
        public IndexedMapServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapServiceBlockingStub(channel, callOptions);
        }
      };
    return IndexedMapServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IndexedMapServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IndexedMapServiceFutureStub>() {
        @java.lang.Override
        public IndexedMapServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IndexedMapServiceFutureStub(channel, callOptions);
        }
      };
    return IndexedMapServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static abstract class IndexedMapServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create creates an indexed map
     * </pre>
     */
    public void create(atomix.indexedmap.Indexedmap.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public void close(atomix.indexedmap.Indexedmap.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.indexedmap.Indexedmap.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.SizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public void exists(atomix.indexedmap.Indexedmap.ExistsRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.indexedmap.Indexedmap.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public void replace(atomix.indexedmap.Indexedmap.ReplaceRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ReplaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReplaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.indexedmap.Indexedmap.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public void firstEntry(atomix.indexedmap.Indexedmap.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.FirstEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFirstEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public void lastEntry(atomix.indexedmap.Indexedmap.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.LastEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLastEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public void prevEntry(atomix.indexedmap.Indexedmap.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.PrevEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrevEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public void nextEntry(atomix.indexedmap.Indexedmap.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.NextEntryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNextEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.indexedmap.Indexedmap.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.RemoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.indexedmap.Indexedmap.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ClearResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearMethod(), responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.indexedmap.Indexedmap.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.indexedmap.Indexedmap.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.EntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.CreateRequest,
                atomix.indexedmap.Indexedmap.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.CloseRequest,
                atomix.indexedmap.Indexedmap.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.SizeRequest,
                atomix.indexedmap.Indexedmap.SizeResponse>(
                  this, METHODID_SIZE)))
          .addMethod(
            getExistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.ExistsRequest,
                atomix.indexedmap.Indexedmap.ExistsResponse>(
                  this, METHODID_EXISTS)))
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.PutRequest,
                atomix.indexedmap.Indexedmap.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getReplaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.ReplaceRequest,
                atomix.indexedmap.Indexedmap.ReplaceResponse>(
                  this, METHODID_REPLACE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.GetRequest,
                atomix.indexedmap.Indexedmap.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getFirstEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.FirstEntryRequest,
                atomix.indexedmap.Indexedmap.FirstEntryResponse>(
                  this, METHODID_FIRST_ENTRY)))
          .addMethod(
            getLastEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.LastEntryRequest,
                atomix.indexedmap.Indexedmap.LastEntryResponse>(
                  this, METHODID_LAST_ENTRY)))
          .addMethod(
            getPrevEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.PrevEntryRequest,
                atomix.indexedmap.Indexedmap.PrevEntryResponse>(
                  this, METHODID_PREV_ENTRY)))
          .addMethod(
            getNextEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.NextEntryRequest,
                atomix.indexedmap.Indexedmap.NextEntryResponse>(
                  this, METHODID_NEXT_ENTRY)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.RemoveRequest,
                atomix.indexedmap.Indexedmap.RemoveResponse>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getClearMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.ClearRequest,
                atomix.indexedmap.Indexedmap.ClearResponse>(
                  this, METHODID_CLEAR)))
          .addMethod(
            getEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.EventRequest,
                atomix.indexedmap.Indexedmap.EventResponse>(
                  this, METHODID_EVENTS)))
          .addMethod(
            getEntriesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                atomix.indexedmap.Indexedmap.EntriesRequest,
                atomix.indexedmap.Indexedmap.EntriesResponse>(
                  this, METHODID_ENTRIES)))
          .build();
    }
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static final class IndexedMapServiceStub extends io.grpc.stub.AbstractAsyncStub<IndexedMapServiceStub> {
    private IndexedMapServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates an indexed map
     * </pre>
     */
    public void create(atomix.indexedmap.Indexedmap.CreateRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public void close(atomix.indexedmap.Indexedmap.CloseRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public void size(atomix.indexedmap.Indexedmap.SizeRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.SizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public void exists(atomix.indexedmap.Indexedmap.ExistsRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public void put(atomix.indexedmap.Indexedmap.PutRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public void replace(atomix.indexedmap.Indexedmap.ReplaceRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ReplaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReplaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public void get(atomix.indexedmap.Indexedmap.GetRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public void firstEntry(atomix.indexedmap.Indexedmap.FirstEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.FirstEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public void lastEntry(atomix.indexedmap.Indexedmap.LastEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.LastEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public void prevEntry(atomix.indexedmap.Indexedmap.PrevEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.PrevEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public void nextEntry(atomix.indexedmap.Indexedmap.NextEntryRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.NextEntryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public void remove(atomix.indexedmap.Indexedmap.RemoveRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.RemoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public void clear(atomix.indexedmap.Indexedmap.ClearRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ClearResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public void events(atomix.indexedmap.Indexedmap.EventRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public void entries(atomix.indexedmap.Indexedmap.EntriesRequest request,
        io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.EntriesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static final class IndexedMapServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IndexedMapServiceBlockingStub> {
    private IndexedMapServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates an indexed map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.CreateResponse create(atomix.indexedmap.Indexedmap.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.CloseResponse close(atomix.indexedmap.Indexedmap.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.SizeResponse size(atomix.indexedmap.Indexedmap.SizeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.ExistsResponse exists(atomix.indexedmap.Indexedmap.ExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), getExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.PutResponse put(atomix.indexedmap.Indexedmap.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.ReplaceResponse replace(atomix.indexedmap.Indexedmap.ReplaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getReplaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.GetResponse get(atomix.indexedmap.Indexedmap.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.FirstEntryResponse firstEntry(atomix.indexedmap.Indexedmap.FirstEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getFirstEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.LastEntryResponse lastEntry(atomix.indexedmap.Indexedmap.LastEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getLastEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.PrevEntryResponse prevEntry(atomix.indexedmap.Indexedmap.PrevEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrevEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.NextEntryResponse nextEntry(atomix.indexedmap.Indexedmap.NextEntryRequest request) {
      return blockingUnaryCall(
          getChannel(), getNextEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.RemoveResponse remove(atomix.indexedmap.Indexedmap.RemoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public atomix.indexedmap.Indexedmap.ClearResponse clear(atomix.indexedmap.Indexedmap.ClearRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Events listens for change events
     * </pre>
     */
    public java.util.Iterator<atomix.indexedmap.Indexedmap.EventResponse> events(
        atomix.indexedmap.Indexedmap.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Entries lists all entries in the map
     * </pre>
     */
    public java.util.Iterator<atomix.indexedmap.Indexedmap.EntriesResponse> entries(
        atomix.indexedmap.Indexedmap.EntriesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IndexedMap service
   * </pre>
   */
  public static final class IndexedMapServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IndexedMapServiceFutureStub> {
    private IndexedMapServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IndexedMapServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IndexedMapServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create creates an indexed map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.CreateResponse> create(
        atomix.indexedmap.Indexedmap.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close closes an indexed map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.CloseResponse> close(
        atomix.indexedmap.Indexedmap.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Size returns the size of the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.SizeResponse> size(
        atomix.indexedmap.Indexedmap.SizeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exists checks whether a key exists in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.ExistsResponse> exists(
        atomix.indexedmap.Indexedmap.ExistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts an entry into the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.PutResponse> put(
        atomix.indexedmap.Indexedmap.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replace performs a check-and-set operation on an entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.ReplaceResponse> replace(
        atomix.indexedmap.Indexedmap.ReplaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReplaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get gets the entry for a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.GetResponse> get(
        atomix.indexedmap.Indexedmap.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FirstEntry gets the first entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.FirstEntryResponse> firstEntry(
        atomix.indexedmap.Indexedmap.FirstEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFirstEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LastEntry gets the last entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.LastEntryResponse> lastEntry(
        atomix.indexedmap.Indexedmap.LastEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLastEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrevEntry gets the previous entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.PrevEntryResponse> prevEntry(
        atomix.indexedmap.Indexedmap.PrevEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrevEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextEntry gets the next entry in the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.NextEntryResponse> nextEntry(
        atomix.indexedmap.Indexedmap.NextEntryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNextEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove removes an entry from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.RemoveResponse> remove(
        atomix.indexedmap.Indexedmap.RemoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear removes all entries from the map
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<atomix.indexedmap.Indexedmap.ClearResponse> clear(
        atomix.indexedmap.Indexedmap.ClearRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_CLOSE = 1;
  private static final int METHODID_SIZE = 2;
  private static final int METHODID_EXISTS = 3;
  private static final int METHODID_PUT = 4;
  private static final int METHODID_REPLACE = 5;
  private static final int METHODID_GET = 6;
  private static final int METHODID_FIRST_ENTRY = 7;
  private static final int METHODID_LAST_ENTRY = 8;
  private static final int METHODID_PREV_ENTRY = 9;
  private static final int METHODID_NEXT_ENTRY = 10;
  private static final int METHODID_REMOVE = 11;
  private static final int METHODID_CLEAR = 12;
  private static final int METHODID_EVENTS = 13;
  private static final int METHODID_ENTRIES = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IndexedMapServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IndexedMapServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((atomix.indexedmap.Indexedmap.CreateRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.CreateResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((atomix.indexedmap.Indexedmap.CloseRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.CloseResponse>) responseObserver);
          break;
        case METHODID_SIZE:
          serviceImpl.size((atomix.indexedmap.Indexedmap.SizeRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.SizeResponse>) responseObserver);
          break;
        case METHODID_EXISTS:
          serviceImpl.exists((atomix.indexedmap.Indexedmap.ExistsRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ExistsResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((atomix.indexedmap.Indexedmap.PutRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.PutResponse>) responseObserver);
          break;
        case METHODID_REPLACE:
          serviceImpl.replace((atomix.indexedmap.Indexedmap.ReplaceRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ReplaceResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((atomix.indexedmap.Indexedmap.GetRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.GetResponse>) responseObserver);
          break;
        case METHODID_FIRST_ENTRY:
          serviceImpl.firstEntry((atomix.indexedmap.Indexedmap.FirstEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.FirstEntryResponse>) responseObserver);
          break;
        case METHODID_LAST_ENTRY:
          serviceImpl.lastEntry((atomix.indexedmap.Indexedmap.LastEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.LastEntryResponse>) responseObserver);
          break;
        case METHODID_PREV_ENTRY:
          serviceImpl.prevEntry((atomix.indexedmap.Indexedmap.PrevEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.PrevEntryResponse>) responseObserver);
          break;
        case METHODID_NEXT_ENTRY:
          serviceImpl.nextEntry((atomix.indexedmap.Indexedmap.NextEntryRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.NextEntryResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((atomix.indexedmap.Indexedmap.RemoveRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.RemoveResponse>) responseObserver);
          break;
        case METHODID_CLEAR:
          serviceImpl.clear((atomix.indexedmap.Indexedmap.ClearRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.ClearResponse>) responseObserver);
          break;
        case METHODID_EVENTS:
          serviceImpl.events((atomix.indexedmap.Indexedmap.EventRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.EventResponse>) responseObserver);
          break;
        case METHODID_ENTRIES:
          serviceImpl.entries((atomix.indexedmap.Indexedmap.EntriesRequest) request,
              (io.grpc.stub.StreamObserver<atomix.indexedmap.Indexedmap.EntriesResponse>) responseObserver);
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

  private static abstract class IndexedMapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IndexedMapServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return atomix.indexedmap.Indexedmap.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IndexedMapService");
    }
  }

  private static final class IndexedMapServiceFileDescriptorSupplier
      extends IndexedMapServiceBaseDescriptorSupplier {
    IndexedMapServiceFileDescriptorSupplier() {}
  }

  private static final class IndexedMapServiceMethodDescriptorSupplier
      extends IndexedMapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IndexedMapServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IndexedMapServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IndexedMapServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getCloseMethod())
              .addMethod(getSizeMethod())
              .addMethod(getExistsMethod())
              .addMethod(getPutMethod())
              .addMethod(getReplaceMethod())
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
