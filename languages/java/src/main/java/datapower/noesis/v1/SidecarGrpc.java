package datapower.noesis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: datapower/noesis/v1/sidecar.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SidecarGrpc {

  private SidecarGrpc() {}

  public static final String SERVICE_NAME = "datapower.noesis.v1.Sidecar";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.InitSessionRequest,
      datapower.noesis.v1.InitSessionResponse> getInitSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitSession",
      requestType = datapower.noesis.v1.InitSessionRequest.class,
      responseType = datapower.noesis.v1.InitSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.InitSessionRequest,
      datapower.noesis.v1.InitSessionResponse> getInitSessionMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.InitSessionRequest, datapower.noesis.v1.InitSessionResponse> getInitSessionMethod;
    if ((getInitSessionMethod = SidecarGrpc.getInitSessionMethod) == null) {
      synchronized (SidecarGrpc.class) {
        if ((getInitSessionMethod = SidecarGrpc.getInitSessionMethod) == null) {
          SidecarGrpc.getInitSessionMethod = getInitSessionMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.InitSessionRequest, datapower.noesis.v1.InitSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.InitSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.InitSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SidecarMethodDescriptorSupplier("InitSession"))
              .build();
        }
      }
    }
    return getInitSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.DataBatch,
      datapower.noesis.v1.StreamDataResponse> getStreamDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamData",
      requestType = datapower.noesis.v1.DataBatch.class,
      responseType = datapower.noesis.v1.StreamDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.DataBatch,
      datapower.noesis.v1.StreamDataResponse> getStreamDataMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.DataBatch, datapower.noesis.v1.StreamDataResponse> getStreamDataMethod;
    if ((getStreamDataMethod = SidecarGrpc.getStreamDataMethod) == null) {
      synchronized (SidecarGrpc.class) {
        if ((getStreamDataMethod = SidecarGrpc.getStreamDataMethod) == null) {
          SidecarGrpc.getStreamDataMethod = getStreamDataMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.DataBatch, datapower.noesis.v1.StreamDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.DataBatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.StreamDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SidecarMethodDescriptorSupplier("StreamData"))
              .build();
        }
      }
    }
    return getStreamDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.FinalizeSessionRequest,
      datapower.noesis.v1.FinalizeSessionResponse> getFinalizeSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizeSession",
      requestType = datapower.noesis.v1.FinalizeSessionRequest.class,
      responseType = datapower.noesis.v1.FinalizeSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.FinalizeSessionRequest,
      datapower.noesis.v1.FinalizeSessionResponse> getFinalizeSessionMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.FinalizeSessionRequest, datapower.noesis.v1.FinalizeSessionResponse> getFinalizeSessionMethod;
    if ((getFinalizeSessionMethod = SidecarGrpc.getFinalizeSessionMethod) == null) {
      synchronized (SidecarGrpc.class) {
        if ((getFinalizeSessionMethod = SidecarGrpc.getFinalizeSessionMethod) == null) {
          SidecarGrpc.getFinalizeSessionMethod = getFinalizeSessionMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.FinalizeSessionRequest, datapower.noesis.v1.FinalizeSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizeSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.FinalizeSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.FinalizeSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SidecarMethodDescriptorSupplier("FinalizeSession"))
              .build();
        }
      }
    }
    return getFinalizeSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.GetSessionStatusRequest,
      datapower.noesis.v1.GetSessionStatusResponse> getGetSessionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionStatus",
      requestType = datapower.noesis.v1.GetSessionStatusRequest.class,
      responseType = datapower.noesis.v1.GetSessionStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.GetSessionStatusRequest,
      datapower.noesis.v1.GetSessionStatusResponse> getGetSessionStatusMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.GetSessionStatusRequest, datapower.noesis.v1.GetSessionStatusResponse> getGetSessionStatusMethod;
    if ((getGetSessionStatusMethod = SidecarGrpc.getGetSessionStatusMethod) == null) {
      synchronized (SidecarGrpc.class) {
        if ((getGetSessionStatusMethod = SidecarGrpc.getGetSessionStatusMethod) == null) {
          SidecarGrpc.getGetSessionStatusMethod = getGetSessionStatusMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.GetSessionStatusRequest, datapower.noesis.v1.GetSessionStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSessionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.GetSessionStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.GetSessionStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SidecarMethodDescriptorSupplier("GetSessionStatus"))
              .build();
        }
      }
    }
    return getGetSessionStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SidecarStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SidecarStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SidecarStub>() {
        @java.lang.Override
        public SidecarStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SidecarStub(channel, callOptions);
        }
      };
    return SidecarStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SidecarBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SidecarBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SidecarBlockingStub>() {
        @java.lang.Override
        public SidecarBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SidecarBlockingStub(channel, callOptions);
        }
      };
    return SidecarBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SidecarFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SidecarFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SidecarFutureStub>() {
        @java.lang.Override
        public SidecarFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SidecarFutureStub(channel, callOptions);
        }
      };
    return SidecarFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SidecarImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Initialize a new extraction session with schema and output configuration.
     * </pre>
     */
    public void initSession(datapower.noesis.v1.InitSessionRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.InitSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream data records to be written to the configured storage format.
     * The connector calls this repeatedly with batches of records.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<datapower.noesis.v1.DataBatch> streamData(
        io.grpc.stub.StreamObserver<datapower.noesis.v1.StreamDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finalize the session and trigger final file uploads.
     * </pre>
     */
    public void finalizeSession(datapower.noesis.v1.FinalizeSessionRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.FinalizeSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinalizeSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get current session status and statistics.
     * </pre>
     */
    public void getSessionStatus(datapower.noesis.v1.GetSessionStatusRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.GetSessionStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSessionStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.InitSessionRequest,
                datapower.noesis.v1.InitSessionResponse>(
                  this, METHODID_INIT_SESSION)))
          .addMethod(
            getStreamDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                datapower.noesis.v1.DataBatch,
                datapower.noesis.v1.StreamDataResponse>(
                  this, METHODID_STREAM_DATA)))
          .addMethod(
            getFinalizeSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.FinalizeSessionRequest,
                datapower.noesis.v1.FinalizeSessionResponse>(
                  this, METHODID_FINALIZE_SESSION)))
          .addMethod(
            getGetSessionStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.GetSessionStatusRequest,
                datapower.noesis.v1.GetSessionStatusResponse>(
                  this, METHODID_GET_SESSION_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class SidecarStub extends io.grpc.stub.AbstractAsyncStub<SidecarStub> {
    private SidecarStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SidecarStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SidecarStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initialize a new extraction session with schema and output configuration.
     * </pre>
     */
    public void initSession(datapower.noesis.v1.InitSessionRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.InitSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream data records to be written to the configured storage format.
     * The connector calls this repeatedly with batches of records.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<datapower.noesis.v1.DataBatch> streamData(
        io.grpc.stub.StreamObserver<datapower.noesis.v1.StreamDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamDataMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Finalize the session and trigger final file uploads.
     * </pre>
     */
    public void finalizeSession(datapower.noesis.v1.FinalizeSessionRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.FinalizeSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinalizeSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get current session status and statistics.
     * </pre>
     */
    public void getSessionStatus(datapower.noesis.v1.GetSessionStatusRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.GetSessionStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSessionStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SidecarBlockingStub extends io.grpc.stub.AbstractBlockingStub<SidecarBlockingStub> {
    private SidecarBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SidecarBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SidecarBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initialize a new extraction session with schema and output configuration.
     * </pre>
     */
    public datapower.noesis.v1.InitSessionResponse initSession(datapower.noesis.v1.InitSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finalize the session and trigger final file uploads.
     * </pre>
     */
    public datapower.noesis.v1.FinalizeSessionResponse finalizeSession(datapower.noesis.v1.FinalizeSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinalizeSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get current session status and statistics.
     * </pre>
     */
    public datapower.noesis.v1.GetSessionStatusResponse getSessionStatus(datapower.noesis.v1.GetSessionStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSessionStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SidecarFutureStub extends io.grpc.stub.AbstractFutureStub<SidecarFutureStub> {
    private SidecarFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SidecarFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SidecarFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initialize a new extraction session with schema and output configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.InitSessionResponse> initSession(
        datapower.noesis.v1.InitSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finalize the session and trigger final file uploads.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.FinalizeSessionResponse> finalizeSession(
        datapower.noesis.v1.FinalizeSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinalizeSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get current session status and statistics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.GetSessionStatusResponse> getSessionStatus(
        datapower.noesis.v1.GetSessionStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSessionStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT_SESSION = 0;
  private static final int METHODID_FINALIZE_SESSION = 1;
  private static final int METHODID_GET_SESSION_STATUS = 2;
  private static final int METHODID_STREAM_DATA = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SidecarImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SidecarImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT_SESSION:
          serviceImpl.initSession((datapower.noesis.v1.InitSessionRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.InitSessionResponse>) responseObserver);
          break;
        case METHODID_FINALIZE_SESSION:
          serviceImpl.finalizeSession((datapower.noesis.v1.FinalizeSessionRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.FinalizeSessionResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_STATUS:
          serviceImpl.getSessionStatus((datapower.noesis.v1.GetSessionStatusRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.GetSessionStatusResponse>) responseObserver);
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
        case METHODID_STREAM_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamData(
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.StreamDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SidecarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SidecarBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return datapower.noesis.v1.SidecarOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sidecar");
    }
  }

  private static final class SidecarFileDescriptorSupplier
      extends SidecarBaseDescriptorSupplier {
    SidecarFileDescriptorSupplier() {}
  }

  private static final class SidecarMethodDescriptorSupplier
      extends SidecarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SidecarMethodDescriptorSupplier(String methodName) {
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
      synchronized (SidecarGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SidecarFileDescriptorSupplier())
              .addMethod(getInitSessionMethod())
              .addMethod(getStreamDataMethod())
              .addMethod(getFinalizeSessionMethod())
              .addMethod(getGetSessionStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
