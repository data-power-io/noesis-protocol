package datapower.noesis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for accessing RAW data (Flink-specific implementation)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: datapower/noesis/v1/enrichment_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlinkRawDataServiceGrpc {

  private FlinkRawDataServiceGrpc() {}

  public static final String SERVICE_NAME = "datapower.noesis.v1.FlinkRawDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.RowLookupRequest,
      datapower.noesis.v1.RowLookupResponse> getGetRowByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRowById",
      requestType = datapower.noesis.v1.RowLookupRequest.class,
      responseType = datapower.noesis.v1.RowLookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.RowLookupRequest,
      datapower.noesis.v1.RowLookupResponse> getGetRowByIdMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.RowLookupRequest, datapower.noesis.v1.RowLookupResponse> getGetRowByIdMethod;
    if ((getGetRowByIdMethod = FlinkRawDataServiceGrpc.getGetRowByIdMethod) == null) {
      synchronized (FlinkRawDataServiceGrpc.class) {
        if ((getGetRowByIdMethod = FlinkRawDataServiceGrpc.getGetRowByIdMethod) == null) {
          FlinkRawDataServiceGrpc.getGetRowByIdMethod = getGetRowByIdMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.RowLookupRequest, datapower.noesis.v1.RowLookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRowById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.RowLookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.RowLookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkRawDataServiceMethodDescriptorSupplier("GetRowById"))
              .build();
        }
      }
    }
    return getGetRowByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.SearchRequest,
      datapower.noesis.v1.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = datapower.noesis.v1.SearchRequest.class,
      responseType = datapower.noesis.v1.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.SearchRequest,
      datapower.noesis.v1.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.SearchRequest, datapower.noesis.v1.SearchResponse> getSearchMethod;
    if ((getSearchMethod = FlinkRawDataServiceGrpc.getSearchMethod) == null) {
      synchronized (FlinkRawDataServiceGrpc.class) {
        if ((getSearchMethod = FlinkRawDataServiceGrpc.getSearchMethod) == null) {
          FlinkRawDataServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.SearchRequest, datapower.noesis.v1.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkRawDataServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.FlinkHistoryRequest,
      datapower.noesis.v1.FlinkHistoryResponse> getGetHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHistory",
      requestType = datapower.noesis.v1.FlinkHistoryRequest.class,
      responseType = datapower.noesis.v1.FlinkHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.FlinkHistoryRequest,
      datapower.noesis.v1.FlinkHistoryResponse> getGetHistoryMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.FlinkHistoryRequest, datapower.noesis.v1.FlinkHistoryResponse> getGetHistoryMethod;
    if ((getGetHistoryMethod = FlinkRawDataServiceGrpc.getGetHistoryMethod) == null) {
      synchronized (FlinkRawDataServiceGrpc.class) {
        if ((getGetHistoryMethod = FlinkRawDataServiceGrpc.getGetHistoryMethod) == null) {
          FlinkRawDataServiceGrpc.getGetHistoryMethod = getGetHistoryMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.FlinkHistoryRequest, datapower.noesis.v1.FlinkHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.FlinkHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.FlinkHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkRawDataServiceMethodDescriptorSupplier("GetHistory"))
              .build();
        }
      }
    }
    return getGetHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlinkRawDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkRawDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkRawDataServiceStub>() {
        @java.lang.Override
        public FlinkRawDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkRawDataServiceStub(channel, callOptions);
        }
      };
    return FlinkRawDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlinkRawDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkRawDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkRawDataServiceBlockingStub>() {
        @java.lang.Override
        public FlinkRawDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkRawDataServiceBlockingStub(channel, callOptions);
        }
      };
    return FlinkRawDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlinkRawDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkRawDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkRawDataServiceFutureStub>() {
        @java.lang.Override
        public FlinkRawDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkRawDataServiceFutureStub(channel, callOptions);
        }
      };
    return FlinkRawDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for accessing RAW data (Flink-specific implementation)
   * </pre>
   */
  public static abstract class FlinkRawDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get a row by ID from RAW storage
     * </pre>
     */
    public void getRowById(datapower.noesis.v1.RowLookupRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.RowLookupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRowByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search for rows in RAW storage
     * </pre>
     */
    public void search(datapower.noesis.v1.SearchRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get historical data for a record
     * </pre>
     */
    public void getHistory(datapower.noesis.v1.FlinkHistoryRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.FlinkHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRowByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.RowLookupRequest,
                datapower.noesis.v1.RowLookupResponse>(
                  this, METHODID_GET_ROW_BY_ID)))
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.SearchRequest,
                datapower.noesis.v1.SearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getGetHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.FlinkHistoryRequest,
                datapower.noesis.v1.FlinkHistoryResponse>(
                  this, METHODID_GET_HISTORY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for accessing RAW data (Flink-specific implementation)
   * </pre>
   */
  public static final class FlinkRawDataServiceStub extends io.grpc.stub.AbstractAsyncStub<FlinkRawDataServiceStub> {
    private FlinkRawDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkRawDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkRawDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a row by ID from RAW storage
     * </pre>
     */
    public void getRowById(datapower.noesis.v1.RowLookupRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.RowLookupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRowByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search for rows in RAW storage
     * </pre>
     */
    public void search(datapower.noesis.v1.SearchRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get historical data for a record
     * </pre>
     */
    public void getHistory(datapower.noesis.v1.FlinkHistoryRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.FlinkHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for accessing RAW data (Flink-specific implementation)
   * </pre>
   */
  public static final class FlinkRawDataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FlinkRawDataServiceBlockingStub> {
    private FlinkRawDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkRawDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkRawDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a row by ID from RAW storage
     * </pre>
     */
    public datapower.noesis.v1.RowLookupResponse getRowById(datapower.noesis.v1.RowLookupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRowByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search for rows in RAW storage
     * </pre>
     */
    public datapower.noesis.v1.SearchResponse search(datapower.noesis.v1.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get historical data for a record
     * </pre>
     */
    public datapower.noesis.v1.FlinkHistoryResponse getHistory(datapower.noesis.v1.FlinkHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for accessing RAW data (Flink-specific implementation)
   * </pre>
   */
  public static final class FlinkRawDataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FlinkRawDataServiceFutureStub> {
    private FlinkRawDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkRawDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkRawDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get a row by ID from RAW storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.RowLookupResponse> getRowById(
        datapower.noesis.v1.RowLookupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRowByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search for rows in RAW storage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.SearchResponse> search(
        datapower.noesis.v1.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get historical data for a record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.FlinkHistoryResponse> getHistory(
        datapower.noesis.v1.FlinkHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROW_BY_ID = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_GET_HISTORY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FlinkRawDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FlinkRawDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROW_BY_ID:
          serviceImpl.getRowById((datapower.noesis.v1.RowLookupRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.RowLookupResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((datapower.noesis.v1.SearchRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.SearchResponse>) responseObserver);
          break;
        case METHODID_GET_HISTORY:
          serviceImpl.getHistory((datapower.noesis.v1.FlinkHistoryRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.FlinkHistoryResponse>) responseObserver);
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

  private static abstract class FlinkRawDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlinkRawDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return datapower.noesis.v1.FlinkEnrichmentServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlinkRawDataService");
    }
  }

  private static final class FlinkRawDataServiceFileDescriptorSupplier
      extends FlinkRawDataServiceBaseDescriptorSupplier {
    FlinkRawDataServiceFileDescriptorSupplier() {}
  }

  private static final class FlinkRawDataServiceMethodDescriptorSupplier
      extends FlinkRawDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlinkRawDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlinkRawDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlinkRawDataServiceFileDescriptorSupplier())
              .addMethod(getGetRowByIdMethod())
              .addMethod(getSearchMethod())
              .addMethod(getGetHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
