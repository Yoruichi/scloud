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
    comments = "Source: Bundle.proto")
public final class BundleServGrpc {

  private BundleServGrpc() {}

  public static final String SERVICE_NAME = "BundleServ";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.redteamobile.scloud.Request2ListBundle,
      com.redteamobile.scloud.Reply2ListBundle> METHOD_LIST_BUNDLE =
      io.grpc.MethodDescriptor.<com.redteamobile.scloud.Request2ListBundle, com.redteamobile.scloud.Reply2ListBundle>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "BundleServ", "ListBundle"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.Request2ListBundle.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.redteamobile.scloud.Reply2ListBundle.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BundleServStub newStub(io.grpc.Channel channel) {
    return new BundleServStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BundleServBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BundleServBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BundleServFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BundleServFutureStub(channel);
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static abstract class BundleServImplBase implements io.grpc.BindableService {

    /**
     */
    public void listBundle(com.redteamobile.scloud.Request2ListBundle request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.Reply2ListBundle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BUNDLE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST_BUNDLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.redteamobile.scloud.Request2ListBundle,
                com.redteamobile.scloud.Reply2ListBundle>(
                  this, METHODID_LIST_BUNDLE)))
          .build();
    }
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static final class BundleServStub extends io.grpc.stub.AbstractStub<BundleServStub> {
    private BundleServStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BundleServStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BundleServStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BundleServStub(channel, callOptions);
    }

    /**
     */
    public void listBundle(com.redteamobile.scloud.Request2ListBundle request,
        io.grpc.stub.StreamObserver<com.redteamobile.scloud.Reply2ListBundle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BUNDLE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static final class BundleServBlockingStub extends io.grpc.stub.AbstractStub<BundleServBlockingStub> {
    private BundleServBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BundleServBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BundleServBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BundleServBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.redteamobile.scloud.Reply2ListBundle listBundle(com.redteamobile.scloud.Request2ListBundle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BUNDLE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Gaga service provider
   * </pre>
   */
  public static final class BundleServFutureStub extends io.grpc.stub.AbstractStub<BundleServFutureStub> {
    private BundleServFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BundleServFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BundleServFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BundleServFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.redteamobile.scloud.Reply2ListBundle> listBundle(
        com.redteamobile.scloud.Request2ListBundle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BUNDLE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_BUNDLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BundleServImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BundleServImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_BUNDLE:
          serviceImpl.listBundle((com.redteamobile.scloud.Request2ListBundle) request,
              (io.grpc.stub.StreamObserver<com.redteamobile.scloud.Reply2ListBundle>) responseObserver);
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

  private static final class BundleServDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.redteamobile.scloud.BundlePb.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BundleServGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BundleServDescriptorSupplier())
              .addMethod(METHOD_LIST_BUNDLE)
              .build();
        }
      }
    }
    return result;
  }
}
