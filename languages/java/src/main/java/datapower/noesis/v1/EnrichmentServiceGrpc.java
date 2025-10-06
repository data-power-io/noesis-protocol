package datapower.noesis.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EnrichmentService provides custom business logic enrichment
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: datapower/noesis/v1/services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnrichmentServiceGrpc {

  private EnrichmentServiceGrpc() {}

  public static final String SERVICE_NAME = "datapower.noesis.v1.EnrichmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.EnrichmentRequest,
      datapower.noesis.v1.EnrichmentResponse> getEnrichRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnrichRecord",
      requestType = datapower.noesis.v1.EnrichmentRequest.class,
      responseType = datapower.noesis.v1.EnrichmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.EnrichmentRequest,
      datapower.noesis.v1.EnrichmentResponse> getEnrichRecordMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.EnrichmentRequest, datapower.noesis.v1.EnrichmentResponse> getEnrichRecordMethod;
    if ((getEnrichRecordMethod = EnrichmentServiceGrpc.getEnrichRecordMethod) == null) {
      synchronized (EnrichmentServiceGrpc.class) {
        if ((getEnrichRecordMethod = EnrichmentServiceGrpc.getEnrichRecordMethod) == null) {
          EnrichmentServiceGrpc.getEnrichRecordMethod = getEnrichRecordMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.EnrichmentRequest, datapower.noesis.v1.EnrichmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnrichRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.EnrichmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.EnrichmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrichmentServiceMethodDescriptorSupplier("EnrichRecord"))
              .build();
        }
      }
    }
    return getEnrichRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<datapower.noesis.v1.ValidationRequest,
      datapower.noesis.v1.ValidationResponse> getValidateRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateRecord",
      requestType = datapower.noesis.v1.ValidationRequest.class,
      responseType = datapower.noesis.v1.ValidationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<datapower.noesis.v1.ValidationRequest,
      datapower.noesis.v1.ValidationResponse> getValidateRecordMethod() {
    io.grpc.MethodDescriptor<datapower.noesis.v1.ValidationRequest, datapower.noesis.v1.ValidationResponse> getValidateRecordMethod;
    if ((getValidateRecordMethod = EnrichmentServiceGrpc.getValidateRecordMethod) == null) {
      synchronized (EnrichmentServiceGrpc.class) {
        if ((getValidateRecordMethod = EnrichmentServiceGrpc.getValidateRecordMethod) == null) {
          EnrichmentServiceGrpc.getValidateRecordMethod = getValidateRecordMethod =
              io.grpc.MethodDescriptor.<datapower.noesis.v1.ValidationRequest, datapower.noesis.v1.ValidationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.ValidationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  datapower.noesis.v1.ValidationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrichmentServiceMethodDescriptorSupplier("ValidateRecord"))
              .build();
        }
      }
    }
    return getValidateRecordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnrichmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrichmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrichmentServiceStub>() {
        @java.lang.Override
        public EnrichmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrichmentServiceStub(channel, callOptions);
        }
      };
    return EnrichmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnrichmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrichmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrichmentServiceBlockingStub>() {
        @java.lang.Override
        public EnrichmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrichmentServiceBlockingStub(channel, callOptions);
        }
      };
    return EnrichmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnrichmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrichmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrichmentServiceFutureStub>() {
        @java.lang.Override
        public EnrichmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrichmentServiceFutureStub(channel, callOptions);
        }
      };
    return EnrichmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * EnrichmentService provides custom business logic enrichment
   * </pre>
   */
  public static abstract class EnrichmentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * EnrichRecord applies business rules and enrichment logic
     * </pre>
     */
    public void enrichRecord(datapower.noesis.v1.EnrichmentRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.EnrichmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnrichRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateRecord performs validation checks
     * </pre>
     */
    public void validateRecord(datapower.noesis.v1.ValidationRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.ValidationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnrichRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.EnrichmentRequest,
                datapower.noesis.v1.EnrichmentResponse>(
                  this, METHODID_ENRICH_RECORD)))
          .addMethod(
            getValidateRecordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                datapower.noesis.v1.ValidationRequest,
                datapower.noesis.v1.ValidationResponse>(
                  this, METHODID_VALIDATE_RECORD)))
          .build();
    }
  }

  /**
   * <pre>
   * EnrichmentService provides custom business logic enrichment
   * </pre>
   */
  public static final class EnrichmentServiceStub extends io.grpc.stub.AbstractAsyncStub<EnrichmentServiceStub> {
    private EnrichmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrichmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrichmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnrichRecord applies business rules and enrichment logic
     * </pre>
     */
    public void enrichRecord(datapower.noesis.v1.EnrichmentRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.EnrichmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnrichRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateRecord performs validation checks
     * </pre>
     */
    public void validateRecord(datapower.noesis.v1.ValidationRequest request,
        io.grpc.stub.StreamObserver<datapower.noesis.v1.ValidationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateRecordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * EnrichmentService provides custom business logic enrichment
   * </pre>
   */
  public static final class EnrichmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnrichmentServiceBlockingStub> {
    private EnrichmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrichmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrichmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnrichRecord applies business rules and enrichment logic
     * </pre>
     */
    public datapower.noesis.v1.EnrichmentResponse enrichRecord(datapower.noesis.v1.EnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnrichRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateRecord performs validation checks
     * </pre>
     */
    public datapower.noesis.v1.ValidationResponse validateRecord(datapower.noesis.v1.ValidationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateRecordMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * EnrichmentService provides custom business logic enrichment
   * </pre>
   */
  public static final class EnrichmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnrichmentServiceFutureStub> {
    private EnrichmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrichmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrichmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * EnrichRecord applies business rules and enrichment logic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.EnrichmentResponse> enrichRecord(
        datapower.noesis.v1.EnrichmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnrichRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateRecord performs validation checks
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<datapower.noesis.v1.ValidationResponse> validateRecord(
        datapower.noesis.v1.ValidationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENRICH_RECORD = 0;
  private static final int METHODID_VALIDATE_RECORD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnrichmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnrichmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENRICH_RECORD:
          serviceImpl.enrichRecord((datapower.noesis.v1.EnrichmentRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.EnrichmentResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_RECORD:
          serviceImpl.validateRecord((datapower.noesis.v1.ValidationRequest) request,
              (io.grpc.stub.StreamObserver<datapower.noesis.v1.ValidationResponse>) responseObserver);
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

  private static abstract class EnrichmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnrichmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return datapower.noesis.v1.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnrichmentService");
    }
  }

  private static final class EnrichmentServiceFileDescriptorSupplier
      extends EnrichmentServiceBaseDescriptorSupplier {
    EnrichmentServiceFileDescriptorSupplier() {}
  }

  private static final class EnrichmentServiceMethodDescriptorSupplier
      extends EnrichmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnrichmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnrichmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnrichmentServiceFileDescriptorSupplier())
              .addMethod(getEnrichRecordMethod())
              .addMethod(getValidateRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
