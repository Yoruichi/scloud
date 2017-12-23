package com.redteamobile.scloud;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Gaga service provider
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.5.0)",
    comments = "Source: Merchant.proto")
public final class MerchantServGrpc {

  private MerchantServGrpc() {}

  public static final String SERVICE_NAME = "MerchantServ";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.redteamobile.scloud.CheckSignReq,
      com.redteamobile.scloud.CheckSignResp> METHOD_CHECK_SIGN =
      io.grpc.MethodDescriptor.<com.redteamobile.scloud.CheckSignReq, com.redteamobile.scloud.CheckSignResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "MerchantServ", "CheckSign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.CheckSignReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.CheckSignResp.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.redteamobile.scloud.Merchant,
      com.redteamobile.scloud.MerchantInfo> METHOD_SAVE_MERCHANT =
      io.grpc.MethodDescriptor.<com.redteamobile.scloud.Merchant, com.redteamobile.scloud.MerchantInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "MerchantServ", "SaveMerchant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.Merchant.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.MerchantInfo.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.redteamobile.scloud.QueryMerchantReq,
      com.redteamobile.scloud.MerchantInfo> METHOD_QUERY_MERCHANT =
      io.grpc.MethodDescriptor.<com.redteamobile.scloud.QueryMerchantReq, com.redteamobile.scloud.MerchantInfo>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "MerchantServ", "QueryMerchant"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.QueryMerchantReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.MerchantInfo.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MerchantServStub newStub(io.grpc.Channel channel) {
    return new MerchantServStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MerchantServBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MerchantServBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MerchantServFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MerchantServFutureStub(channel);
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static abstract class MerchantServImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkSign(com.redteamobile.scloud.CheckSignReq request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.CheckSignResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_SIGN, responseObserver);
    }

    /**
     */
    public void saveMerchant(com.redteamobile.scloud.Merchant request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.MerchantInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_MERCHANT, responseObserver);
    }

    /**
     */
    public void queryMerchant(com.redteamobile.scloud.QueryMerchantReq request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.MerchantInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_MERCHANT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CHECK_SIGN,
            asyncUnaryCall(
              new MethodHandlers<
                com.redteamobile.scloud.CheckSignReq,
                com.redteamobile.scloud.CheckSignResp>(
                  this, METHODID_CHECK_SIGN)))
          .addMethod(
            METHOD_SAVE_MERCHANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.redteamobile.scloud.Merchant,
                com.redteamobile.scloud.MerchantInfo>(
                  this, METHODID_SAVE_MERCHANT)))
          .addMethod(
            METHOD_QUERY_MERCHANT,
            asyncUnaryCall(
              new MethodHandlers<
                com.redteamobile.scloud.QueryMerchantReq,
                com.redteamobile.scloud.MerchantInfo>(
                  this, METHODID_QUERY_MERCHANT)))
          .build();
    }
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static final class MerchantServStub extends io.grpc.stub.AbstractStub<MerchantServStub> {
    private MerchantServStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MerchantServStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantServStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MerchantServStub(channel, callOptions);
    }

    /**
     */
    public void checkSign(com.redteamobile.scloud.CheckSignReq request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.CheckSignResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_SIGN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveMerchant(com.redteamobile.scloud.Merchant request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.MerchantInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_MERCHANT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryMerchant(com.redteamobile.scloud.QueryMerchantReq request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.MerchantInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_MERCHANT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static final class MerchantServBlockingStub extends io.grpc.stub.AbstractStub<MerchantServBlockingStub> {
    private MerchantServBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MerchantServBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantServBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MerchantServBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.redteamobile.scloud.CheckSignResp checkSign(com.redteamobile.scloud.CheckSignReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_SIGN, getCallOptions(), request);
    }

    /**
     */
    public com.redteamobile.scloud.MerchantInfo saveMerchant(com.redteamobile.scloud.Merchant request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_MERCHANT, getCallOptions(), request);
    }

    /**
     */
    public com.redteamobile.scloud.MerchantInfo queryMerchant(com.redteamobile.scloud.QueryMerchantReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_MERCHANT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static final class MerchantServFutureStub extends io.grpc.stub.AbstractStub<MerchantServFutureStub> {
    private MerchantServFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MerchantServFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantServFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MerchantServFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.redteamobile.scloud.CheckSignResp> checkSign(
        com.redteamobile.scloud.CheckSignReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_SIGN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.redteamobile.scloud.MerchantInfo> saveMerchant(
        com.redteamobile.scloud.Merchant request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_MERCHANT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.redteamobile.scloud.MerchantInfo> queryMerchant(
        com.redteamobile.scloud.QueryMerchantReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_MERCHANT, getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_SIGN = 0;
  private static final int METHODID_SAVE_MERCHANT = 1;
  private static final int METHODID_QUERY_MERCHANT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MerchantServImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MerchantServImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_SIGN:
          serviceImpl.checkSign((com.redteamobile.scloud.CheckSignReq) request,
              (io.grpc.stub.StreamObserver<com.redteamobile.scloud.CheckSignResp>) responseObserver);
          break;
        case METHODID_SAVE_MERCHANT:
          serviceImpl.saveMerchant((com.redteamobile.scloud.Merchant) request,
              (io.grpc.stub.StreamObserver<com.redteamobile.scloud.MerchantInfo>) responseObserver);
          break;
        case METHODID_QUERY_MERCHANT:
          serviceImpl.queryMerchant((com.redteamobile.scloud.QueryMerchantReq) request,
              (io.grpc.stub.StreamObserver<com.redteamobile.scloud.MerchantInfo>) responseObserver);
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

  private static final class MerchantServDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.redteamobile.scloud.MerchantPb.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MerchantServGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MerchantServDescriptorSupplier())
              .addMethod(METHOD_CHECK_SIGN)
              .addMethod(METHOD_SAVE_MERCHANT)
              .addMethod(METHOD_QUERY_MERCHANT)
              .build();
        }
      }
    }
    return result;
  }
}
