package datapower.noesis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for enriching records (Flink-specific implementation)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: datapower/noesis/v1/enrichment_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlinkEnrichmentServiceGrpc {

  private FlinkEnrichmentServiceGrpc() {}

  public static final String SERVICE_NAME = "datapower.noesis.v1.FlinkEnrichmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.EnrichmentRequest,
      datapower.noesis.v1.FlinkEnrichmentResponse> getEnrichRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnrichRecord",
      requestType = datapower.noesis.v1.EnrichmentRequest.class,
      responseType = datapower.noesis.v1.FlinkEnrichmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.EnrichmentRequest,
      datapower.noesis.v1.FlinkEnrichmentResponse> getEnrichRecordMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.EnrichmentRequest, datapower.noesis.v1.FlinkEnrichmentResponse> getEnrichRecordMethod;
    if ((getEnrichRecordMethod = FlinkEnrichmentServiceGrpc.getEnrichRecordMethod) == null) {
      synchronized (FlinkEnrichmentServiceGrpc.class) {
        if ((getEnrichRecordMethod = FlinkEnrichmentServiceGrpc.getEnrichRecordMethod) == null) {
          FlinkEnrichmentServiceGrpc.getEnrichRecordMethod = getEnrichRecordMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.EnrichmentRequest, datapower.noesis.v1.FlinkEnrichmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnrichRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.EnrichmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.FlinkEnrichmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkEnrichmentServiceMethodDescriptorSupplier("EnrichRecord"))
              .build();
        }
      }
    }
    return getEnrichRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.BatchFlinkEnrichmentRequest,
      datapower.noesis.v1.BatchFlinkEnrichmentResponse> getBatchEnrichRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchEnrichRecords",
      requestType = datapower.noesis.v1.BatchFlinkEnrichmentRequest.class,
      responseType = datapower.noesis.v1.BatchFlinkEnrichmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.BatchFlinkEnrichmentRequest,
      datapower.noesis.v1.BatchFlinkEnrichmentResponse> getBatchEnrichRecordsMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.BatchFlinkEnrichmentRequest, datapower.noesis.v1.BatchFlinkEnrichmentResponse> getBatchEnrichRecordsMethod;
    if ((getBatchEnrichRecordsMethod = FlinkEnrichmentServiceGrpc.getBatchEnrichRecordsMethod) == null) {
      synchronized (FlinkEnrichmentServiceGrpc.class) {
        if ((getBatchEnrichRecordsMethod = FlinkEnrichmentServiceGrpc.getBatchEnrichRecordsMethod) == null) {
          FlinkEnrichmentServiceGrpc.getBatchEnrichRecordsMethod = getBatchEnrichRecordsMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.BatchFlinkEnrichmentRequest, datapower.noesis.v1.BatchFlinkEnrichmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchEnrichRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.BatchFlinkEnrichmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.BatchFlinkEnrichmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkEnrichmentServiceMethodDescriptorSupplier("BatchEnrichRecords"))
              .build();
        }
      }
    }
    return getBatchEnrichRecordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlinkEnrichmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkEnrichmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkEnrichmentServiceStub>() {
        @java.lang.Override
        public FlinkEnrichmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkEnrichmentServiceStub(channel, callOptions);
        }
      };
    return FlinkEnrichmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlinkEnrichmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkEnrichmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkEnrichmentServiceBlockingStub>() {
        @java.lang.Override
        public FlinkEnrichmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkEnrichmentServiceBlockingStub(channel, callOptions);
        }
      };
    return FlinkEnrichmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlinkEnrichmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkEnrichmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkEnrichmentServiceFutureStub>() {
        @java.lang.Override
        public FlinkEnrichmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkEnrichmentServiceFutureStub(channel, callOptions);
        }
      };
    return FlinkEnrichmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for enriching records (Flink-specific implementation)
   * </pre>
   */
  public static abstract class FlinkEnrichmentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enrich a single record
     * </pre>
     */
    public void enrichRecord(datapower.noesis.v1.EnrichmentRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.FlinkEnrichmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnrichRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch enrich multiple records
     * </pre>
     */
    public void batchEnrichRecords(datapower.noesis.v1.BatchFlinkEnrichmentRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.BatchFlinkEnrichmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchEnrichRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnrichRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.EnrichmentRequest,
                datapower.noesis.v1.FlinkEnrichmentResponse>(
                  this, METHODID_ENRICH_RECORD)))
          .addMethod(
            getBatchEnrichRecordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.BatchFlinkEnrichmentRequest,
                datapower.noesis.v1.BatchFlinkEnrichmentResponse>(
                  this, METHODID_BATCH_ENRICH_RECORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for enriching records (Flink-specific implementation)
   * </pre>
   */
  public static final class FlinkEnrichmentServiceStub extends io.grpc.stub.AbstractAsyncStub<FlinkEnrichmentServiceStub> {
    private FlinkEnrichmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkEnrichmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkEnrichmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enrich a single record
     * </pre>
     */
    public void enrichRecord(datapower.noesis.v1.EnrichmentRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.FlinkEnrichmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnrichRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch enrich multiple records
     * </pre>
     */
    public void batchEnrichRecords(datapower.noesis.v1.BatchFlinkEnrichmentRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.BatchFlinkEnrichmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchEnrichRecordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for enriching records (Flink-specific implementation)
   * </pre>
   */
  public static final class FlinkEnrichmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FlinkEnrichmentServiceBlockingStub> {
    private FlinkEnrichmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkEnrichmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkEnrichmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enrich a single record
     * </pre>
     */
    public datapower.noesis.v1.FlinkEnrichmentResponse enrichRecord(datapower.noesis.v1.EnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnrichRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch enrich multiple records
     * </pre>
     */
    public datapower.noesis.v1.BatchFlinkEnrichmentResponse batchEnrichRecords(datapower.noesis.v1.BatchFlinkEnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchEnrichRecordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for enriching records (Flink-specific implementation)
   * </pre>
   */
  public static final class FlinkEnrichmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FlinkEnrichmentServiceFutureStub> {
    private FlinkEnrichmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkEnrichmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkEnrichmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enrich a single record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.FlinkEnrichmentResponse> enrichRecord(
        datapower.noesis.v1.EnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnrichRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch enrich multiple records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.BatchFlinkEnrichmentResponse> batchEnrichRecords(
        datapower.noesis.v1.BatchFlinkEnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchEnrichRecordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENRICH_RECORD = 0;
  private static final int METHODID_BATCH_ENRICH_RECORDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FlinkEnrichmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FlinkEnrichmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENRICH_RECORD:
          serviceImpl.enrichRecord((datapower.noesis.v1.EnrichmentRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.FlinkEnrichmentResponse>) responseObserver);
          break;
        case METHODID_BATCH_ENRICH_RECORDS:
          serviceImpl.batchEnrichRecords((datapower.noesis.v1.BatchFlinkEnrichmentRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.BatchFlinkEnrichmentResponse>) responseObserver);
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

  private static abstract class FlinkEnrichmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlinkEnrichmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return datapower.noesis.v1.FlinkEnrichmentServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlinkEnrichmentService");
    }
  }

  private static final class FlinkEnrichmentServiceFileDescriptorSupplier
      extends FlinkEnrichmentServiceBaseDescriptorSupplier {
    FlinkEnrichmentServiceFileDescriptorSupplier() {}
  }

  private static final class FlinkEnrichmentServiceMethodDescriptorSupplier
      extends FlinkEnrichmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlinkEnrichmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlinkEnrichmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlinkEnrichmentServiceFileDescriptorSupplier())
              .addMethod(getEnrichRecordMethod())
              .addMethod(getBatchEnrichRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
