package datapower.noesis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ===========================
 *         SERVICE
 * ===========================
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: datapower/noesis/v1/connector.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConnectorGrpc {

  private ConnectorGrpc() {}

  public static final String SERVICE_NAME = "datapower.noesis.v1.Connector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.CheckRequest,
      datapower.noesis.v1.CheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = datapower.noesis.v1.CheckRequest.class,
      responseType = datapower.noesis.v1.CheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.CheckRequest,
      datapower.noesis.v1.CheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.CheckRequest, datapower.noesis.v1.CheckResponse> getCheckMethod;
    if ((getCheckMethod = ConnectorGrpc.getCheckMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getCheckMethod = ConnectorGrpc.getCheckMethod) == null) {
          ConnectorGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.CheckRequest, datapower.noesis.v1.CheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.CheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.DiscoverRequest,
      datapower.noesis.v1.DiscoverResponse> getDiscoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Discover",
      requestType = datapower.noesis.v1.DiscoverRequest.class,
      responseType = datapower.noesis.v1.DiscoverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.DiscoverRequest,
      datapower.noesis.v1.DiscoverResponse> getDiscoverMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.DiscoverRequest, datapower.noesis.v1.DiscoverResponse> getDiscoverMethod;
    if ((getDiscoverMethod = ConnectorGrpc.getDiscoverMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getDiscoverMethod = ConnectorGrpc.getDiscoverMethod) == null) {
          ConnectorGrpc.getDiscoverMethod = getDiscoverMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.DiscoverRequest, datapower.noesis.v1.DiscoverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Discover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.DiscoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.DiscoverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("Discover"))
              .build();
        }
      }
    }
    return getDiscoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.PlanExtractionRequest,
      datapower.noesis.v1.PlanExtractionResponse> getPlanExtractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanExtraction",
      requestType = datapower.noesis.v1.PlanExtractionRequest.class,
      responseType = datapower.noesis.v1.PlanExtractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.PlanExtractionRequest,
      datapower.noesis.v1.PlanExtractionResponse> getPlanExtractionMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.PlanExtractionRequest, datapower.noesis.v1.PlanExtractionResponse> getPlanExtractionMethod;
    if ((getPlanExtractionMethod = ConnectorGrpc.getPlanExtractionMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getPlanExtractionMethod = ConnectorGrpc.getPlanExtractionMethod) == null) {
          ConnectorGrpc.getPlanExtractionMethod = getPlanExtractionMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.PlanExtractionRequest, datapower.noesis.v1.PlanExtractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlanExtraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.PlanExtractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.PlanExtractionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("PlanExtraction"))
              .build();
        }
      }
    }
    return getPlanExtractionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.OpenRequest,
      datapower.noesis.v1.OpenResponse> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = datapower.noesis.v1.OpenRequest.class,
      responseType = datapower.noesis.v1.OpenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.OpenRequest,
      datapower.noesis.v1.OpenResponse> getOpenMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.OpenRequest, datapower.noesis.v1.OpenResponse> getOpenMethod;
    if ((getOpenMethod = ConnectorGrpc.getOpenMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getOpenMethod = ConnectorGrpc.getOpenMethod) == null) {
          ConnectorGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.OpenRequest, datapower.noesis.v1.OpenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.OpenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.OpenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("Open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.ReadRequest,
      datapower.noesis.v1.ReadMessage> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = datapower.noesis.v1.ReadRequest.class,
      responseType = datapower.noesis.v1.ReadMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.ReadRequest,
      datapower.noesis.v1.ReadMessage> getReadMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.ReadRequest, datapower.noesis.v1.ReadMessage> getReadMethod;
    if ((getReadMethod = ConnectorGrpc.getReadMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getReadMethod = ConnectorGrpc.getReadMethod) == null) {
          ConnectorGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.ReadRequest, datapower.noesis.v1.ReadMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.ReadMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.ReadSplitRequest,
      datapower.noesis.v1.ReadMessage> getReadSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadSplit",
      requestType = datapower.noesis.v1.ReadSplitRequest.class,
      responseType = datapower.noesis.v1.ReadMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.ReadSplitRequest,
      datapower.noesis.v1.ReadMessage> getReadSplitMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.ReadSplitRequest, datapower.noesis.v1.ReadMessage> getReadSplitMethod;
    if ((getReadSplitMethod = ConnectorGrpc.getReadSplitMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getReadSplitMethod = ConnectorGrpc.getReadSplitMethod) == null) {
          ConnectorGrpc.getReadSplitMethod = getReadSplitMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.ReadSplitRequest, datapower.noesis.v1.ReadMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadSplit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.ReadSplitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.ReadMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("ReadSplit"))
              .build();
        }
      }
    }
    return getReadSplitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.CloseRequest,
      datapower.noesis.v1.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = datapower.noesis.v1.CloseRequest.class,
      responseType = datapower.noesis.v1.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.CloseRequest,
      datapower.noesis.v1.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.CloseRequest, datapower.noesis.v1.CloseResponse> getCloseMethod;
    if ((getCloseMethod = ConnectorGrpc.getCloseMethod) == null) {
      synchronized (ConnectorGrpc.class) {
        if ((getCloseMethod = ConnectorGrpc.getCloseMethod) == null) {
          ConnectorGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.CloseRequest, datapower.noesis.v1.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectorMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorStub>() {
        @java.lang.Override
        public ConnectorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorStub(channel, callOptions);
        }
      };
    return ConnectorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorBlockingStub>() {
        @java.lang.Override
        public ConnectorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorBlockingStub(channel, callOptions);
        }
      };
    return ConnectorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectorFutureStub>() {
        @java.lang.Override
        public ConnectorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectorFutureStub(channel, callOptions);
        }
      };
    return ConnectorFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ===========================
   *         SERVICE
   * ===========================
   * </pre>
   */
  public static abstract class ConnectorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Light-weight connectivity check (auth/scopes/quota/basic latency).
     * </pre>
     */
    public void check(datapower.noesis.v1.CheckRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.CheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * *** Discovery ***: describe the platform and all available entities, their schemas,
     * keys, and which extraction modes each entity supports.
     * </pre>
     */
    public void discover(datapower.noesis.v1.DiscoverRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.DiscoverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDiscoverMethod(), responseObserver);
    }

    /**
     * <pre>
     * *** Plan Extraction ***: generate extraction splits for parallel data extraction.
     * Returns a list of splits that can be processed independently for batch sources.
     * </pre>
     */
    public void planExtraction(datapower.noesis.v1.PlanExtractionRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.PlanExtractionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlanExtractionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open a logical reading session (optional; good place to validate config, pin snapshots, warm caches).
     * </pre>
     */
    public void open(datapower.noesis.v1.OpenRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.OpenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start streaming data according to a plan (full table / change stream / subgraph).
     * </pre>
     */
    public void read(datapower.noesis.v1.ReadRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.ReadMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read a specific extraction split (for parallel batch extraction).
     * </pre>
     */
    public void readSplit(datapower.noesis.v1.ReadSplitRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.ReadMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadSplitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close the session cleanly.
     * </pre>
     */
    public void close(datapower.noesis.v1.CloseRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.CloseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.CheckRequest,
                datapower.noesis.v1.CheckResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getDiscoverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.DiscoverRequest,
                datapower.noesis.v1.DiscoverResponse>(
                  this, METHODID_DISCOVER)))
          .addMethod(
            getPlanExtractionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.PlanExtractionRequest,
                datapower.noesis.v1.PlanExtractionResponse>(
                  this, METHODID_PLAN_EXTRACTION)))
          .addMethod(
            getOpenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.OpenRequest,
                datapower.noesis.v1.OpenResponse>(
                  this, METHODID_OPEN)))
          .addMethod(
            getReadMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                datapower.noesis.v1.ReadRequest,
                datapower.noesis.v1.ReadMessage>(
                  this, METHODID_READ)))
          .addMethod(
            getReadSplitMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                datapower.noesis.v1.ReadSplitRequest,
                datapower.noesis.v1.ReadMessage>(
                  this, METHODID_READ_SPLIT)))
          .addMethod(
            getCloseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.CloseRequest,
                datapower.noesis.v1.CloseResponse>(
                  this, METHODID_CLOSE)))
          .build();
    }
  }

  /**
   * <pre>
   * ===========================
   *         SERVICE
   * ===========================
   * </pre>
   */
  public static final class ConnectorStub extends io.grpc.stub.AbstractAsyncStub<ConnectorStub> {
    private ConnectorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Light-weight connectivity check (auth/scopes/quota/basic latency).
     * </pre>
     */
    public void check(datapower.noesis.v1.CheckRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.CheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * *** Discovery ***: describe the platform and all available entities, their schemas,
     * keys, and which extraction modes each entity supports.
     * </pre>
     */
    public void discover(datapower.noesis.v1.DiscoverRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.DiscoverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDiscoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * *** Plan Extraction ***: generate extraction splits for parallel data extraction.
     * Returns a list of splits that can be processed independently for batch sources.
     * </pre>
     */
    public void planExtraction(datapower.noesis.v1.PlanExtractionRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.PlanExtractionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlanExtractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a logical reading session (optional; good place to validate config, pin snapshots, warm caches).
     * </pre>
     */
    public void open(datapower.noesis.v1.OpenRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.OpenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start streaming data according to a plan (full table / change stream / subgraph).
     * </pre>
     */
    public void read(datapower.noesis.v1.ReadRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.ReadMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read a specific extraction split (for parallel batch extraction).
     * </pre>
     */
    public void readSplit(datapower.noesis.v1.ReadSplitRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.ReadMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadSplitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close the session cleanly.
     * </pre>
     */
    public void close(datapower.noesis.v1.CloseRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.CloseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ===========================
   *         SERVICE
   * ===========================
   * </pre>
   */
  public static final class ConnectorBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConnectorBlockingStub> {
    private ConnectorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Light-weight connectivity check (auth/scopes/quota/basic latency).
     * </pre>
     */
    public datapower.noesis.v1.CheckResponse check(datapower.noesis.v1.CheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * *** Discovery ***: describe the platform and all available entities, their schemas,
     * keys, and which extraction modes each entity supports.
     * </pre>
     */
    public datapower.noesis.v1.DiscoverResponse discover(datapower.noesis.v1.DiscoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDiscoverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * *** Plan Extraction ***: generate extraction splits for parallel data extraction.
     * Returns a list of splits that can be processed independently for batch sources.
     * </pre>
     */
    public datapower.noesis.v1.PlanExtractionResponse planExtraction(datapower.noesis.v1.PlanExtractionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlanExtractionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Open a logical reading session (optional; good place to validate config, pin snapshots, warm caches).
     * </pre>
     */
    public datapower.noesis.v1.OpenResponse open(datapower.noesis.v1.OpenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start streaming data according to a plan (full table / change stream / subgraph).
     * </pre>
     */
    public java.util.Iterator<datapower.noesis.v1.ReadMessage> read(
        datapower.noesis.v1.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read a specific extraction split (for parallel batch extraction).
     * </pre>
     */
    public java.util.Iterator<datapower.noesis.v1.ReadMessage> readSplit(
        datapower.noesis.v1.ReadSplitRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadSplitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close the session cleanly.
     * </pre>
     */
    public datapower.noesis.v1.CloseResponse close(datapower.noesis.v1.CloseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ===========================
   *         SERVICE
   * ===========================
   * </pre>
   */
  public static final class ConnectorFutureStub extends io.grpc.stub.AbstractFutureStub<ConnectorFutureStub> {
    private ConnectorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Light-weight connectivity check (auth/scopes/quota/basic latency).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.CheckResponse> check(
        datapower.noesis.v1.CheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * *** Discovery ***: describe the platform and all available entities, their schemas,
     * keys, and which extraction modes each entity supports.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.DiscoverResponse> discover(
        datapower.noesis.v1.DiscoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDiscoverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * *** Plan Extraction ***: generate extraction splits for parallel data extraction.
     * Returns a list of splits that can be processed independently for batch sources.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.PlanExtractionResponse> planExtraction(
        datapower.noesis.v1.PlanExtractionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlanExtractionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Open a logical reading session (optional; good place to validate config, pin snapshots, warm caches).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.OpenResponse> open(
        datapower.noesis.v1.OpenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close the session cleanly.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.CloseResponse> close(
        datapower.noesis.v1.CloseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_DISCOVER = 1;
  private static final int METHODID_PLAN_EXTRACTION = 2;
  private static final int METHODID_OPEN = 3;
  private static final int METHODID_READ = 4;
  private static final int METHODID_READ_SPLIT = 5;
  private static final int METHODID_CLOSE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          serviceImpl.check((datapower.noesis.v1.CheckRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.CheckResponse>) responseObserver);
          break;
        case METHODID_DISCOVER:
          serviceImpl.discover((datapower.noesis.v1.DiscoverRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.DiscoverResponse>) responseObserver);
          break;
        case METHODID_PLAN_EXTRACTION:
          serviceImpl.planExtraction((datapower.noesis.v1.PlanExtractionRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.PlanExtractionResponse>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((datapower.noesis.v1.OpenRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.OpenResponse>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((datapower.noesis.v1.ReadRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.ReadMessage>) responseObserver);
          break;
        case METHODID_READ_SPLIT:
          serviceImpl.readSplit((datapower.noesis.v1.ReadSplitRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.ReadMessage>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((datapower.noesis.v1.CloseRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.CloseResponse>) responseObserver);
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

  private static abstract class ConnectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return datapower.noesis.v1.ConnectorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Connector");
    }
  }

  private static final class ConnectorFileDescriptorSupplier
      extends ConnectorBaseDescriptorSupplier {
    ConnectorFileDescriptorSupplier() {}
  }

  private static final class ConnectorMethodDescriptorSupplier
      extends ConnectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnectorMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectorFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .addMethod(getDiscoverMethod())
              .addMethod(getPlanExtractionMethod())
              .addMethod(getOpenMethod())
              .addMethod(getReadMethod())
              .addMethod(getReadSplitMethod())
              .addMethod(getCloseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
