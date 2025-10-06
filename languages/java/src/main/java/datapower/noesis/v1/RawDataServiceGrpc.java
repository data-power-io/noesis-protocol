package datapower.noesis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * RawDataService provides access to RAW zone data for enrichment
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: datapower/noesis/v1/services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RawDataServiceGrpc {

  private RawDataServiceGrpc() {}

  public static final String SERVICE_NAME = "datapower.noesis.v1.RawDataService";

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
    if ((getGetRowByIdMethod = RawDataServiceGrpc.getGetRowByIdMethod) == null) {
      synchronized (RawDataServiceGrpc.class) {
        if ((getGetRowByIdMethod = RawDataServiceGrpc.getGetRowByIdMethod) == null) {
          RawDataServiceGrpc.getGetRowByIdMethod = getGetRowByIdMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.RowLookupRequest, datapower.noesis.v1.RowLookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRowById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.RowLookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.RowLookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawDataServiceMethodDescriptorSupplier("GetRowById"))
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
    if ((getSearchMethod = RawDataServiceGrpc.getSearchMethod) == null) {
      synchronized (RawDataServiceGrpc.class) {
        if ((getSearchMethod = RawDataServiceGrpc.getSearchMethod) == null) {
          RawDataServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.SearchRequest, datapower.noesis.v1.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawDataServiceMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.BatchLookupRequest,
      datapower.noesis.v1.BatchLookupResponse> getBatchLookupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchLookup",
      requestType = datapower.noesis.v1.BatchLookupRequest.class,
      responseType = datapower.noesis.v1.BatchLookupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.BatchLookupRequest,
      datapower.noesis.v1.BatchLookupResponse> getBatchLookupMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.BatchLookupRequest, datapower.noesis.v1.BatchLookupResponse> getBatchLookupMethod;
    if ((getBatchLookupMethod = RawDataServiceGrpc.getBatchLookupMethod) == null) {
      synchronized (RawDataServiceGrpc.class) {
        if ((getBatchLookupMethod = RawDataServiceGrpc.getBatchLookupMethod) == null) {
          RawDataServiceGrpc.getBatchLookupMethod = getBatchLookupMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.BatchLookupRequest, datapower.noesis.v1.BatchLookupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchLookup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.BatchLookupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.BatchLookupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawDataServiceMethodDescriptorSupplier("BatchLookup"))
              .build();
        }
      }
    }
    return getBatchLookupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RawDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawDataServiceStub>() {
        @java.lang.Override
        public RawDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawDataServiceStub(channel, callOptions);
        }
      };
    return RawDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RawDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawDataServiceBlockingStub>() {
        @java.lang.Override
        public RawDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawDataServiceBlockingStub(channel, callOptions);
        }
      };
    return RawDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RawDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawDataServiceFutureStub>() {
        @java.lang.Override
        public RawDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawDataServiceFutureStub(channel, callOptions);
        }
      };
    return RawDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * RawDataService provides access to RAW zone data for enrichment
   * </pre>
   */
  public static abstract class RawDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetRowById retrieves a specific row by ID
     * </pre>
     */
    public void getRowById(datapower.noesis.v1.RowLookupRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.RowLookupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRowByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search performs a search query on RAW data
     * </pre>
     */
    public void search(datapower.noesis.v1.SearchRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchLookup retrieves multiple rows in a single request
     * </pre>
     */
    public void batchLookup(datapower.noesis.v1.BatchLookupRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.BatchLookupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchLookupMethod(), responseObserver);
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
            getBatchLookupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.BatchLookupRequest,
                datapower.noesis.v1.BatchLookupResponse>(
                  this, METHODID_BATCH_LOOKUP)))
          .build();
    }
  }

  /**
   * <pre>
   * RawDataService provides access to RAW zone data for enrichment
   * </pre>
   */
  public static final class RawDataServiceStub extends io.grpc.stub.AbstractAsyncStub<RawDataServiceStub> {
    private RawDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetRowById retrieves a specific row by ID
     * </pre>
     */
    public void getRowById(datapower.noesis.v1.RowLookupRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.RowLookupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRowByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search performs a search query on RAW data
     * </pre>
     */
    public void search(datapower.noesis.v1.SearchRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchLookup retrieves multiple rows in a single request
     * </pre>
     */
    public void batchLookup(datapower.noesis.v1.BatchLookupRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.BatchLookupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchLookupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RawDataService provides access to RAW zone data for enrichment
   * </pre>
   */
  public static final class RawDataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RawDataServiceBlockingStub> {
    private RawDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetRowById retrieves a specific row by ID
     * </pre>
     */
    public datapower.noesis.v1.RowLookupResponse getRowById(datapower.noesis.v1.RowLookupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRowByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search performs a search query on RAW data
     * </pre>
     */
    public datapower.noesis.v1.SearchResponse search(datapower.noesis.v1.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchLookup retrieves multiple rows in a single request
     * </pre>
     */
    public datapower.noesis.v1.BatchLookupResponse batchLookup(datapower.noesis.v1.BatchLookupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchLookupMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RawDataService provides access to RAW zone data for enrichment
   * </pre>
   */
  public static final class RawDataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RawDataServiceFutureStub> {
    private RawDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetRowById retrieves a specific row by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.RowLookupResponse> getRowById(
        datapower.noesis.v1.RowLookupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRowByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search performs a search query on RAW data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.SearchResponse> search(
        datapower.noesis.v1.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchLookup retrieves multiple rows in a single request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.BatchLookupResponse> batchLookup(
        datapower.noesis.v1.BatchLookupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchLookupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROW_BY_ID = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_BATCH_LOOKUP = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RawDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RawDataServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_BATCH_LOOKUP:
          serviceImpl.batchLookup((datapower.noesis.v1.BatchLookupRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.BatchLookupResponse>) responseObserver);
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

  private static abstract class RawDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RawDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return datapower.noesis.v1.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RawDataService");
    }
  }

  private static final class RawDataServiceFileDescriptorSupplier
      extends RawDataServiceBaseDescriptorSupplier {
    RawDataServiceFileDescriptorSupplier() {}
  }

  private static final class RawDataServiceMethodDescriptorSupplier
      extends RawDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RawDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RawDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RawDataServiceFileDescriptorSupplier())
              .addMethod(getGetRowByIdMethod())
              .addMethod(getSearchMethod())
              .addMethod(getBatchLookupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
