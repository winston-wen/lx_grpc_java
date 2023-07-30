package lx.protogen.xw;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: xw.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class XuanwuShardHostingGrpc {

  private XuanwuShardHostingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "xw.XuanwuShardHosting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lx.protogen.xw.Xw.AuditorVoteRequest,
      lx.protogen.lbm.Lbm.Void> getAuditorVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuditorVote",
      requestType = lx.protogen.xw.Xw.AuditorVoteRequest.class,
      responseType = lx.protogen.lbm.Lbm.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lx.protogen.xw.Xw.AuditorVoteRequest,
      lx.protogen.lbm.Lbm.Void> getAuditorVoteMethod() {
    io.grpc.MethodDescriptor<lx.protogen.xw.Xw.AuditorVoteRequest, lx.protogen.lbm.Lbm.Void> getAuditorVoteMethod;
    if ((getAuditorVoteMethod = XuanwuShardHostingGrpc.getAuditorVoteMethod) == null) {
      synchronized (XuanwuShardHostingGrpc.class) {
        if ((getAuditorVoteMethod = XuanwuShardHostingGrpc.getAuditorVoteMethod) == null) {
          XuanwuShardHostingGrpc.getAuditorVoteMethod = getAuditorVoteMethod =
              io.grpc.MethodDescriptor.<lx.protogen.xw.Xw.AuditorVoteRequest, lx.protogen.lbm.Lbm.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuditorVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lx.protogen.xw.Xw.AuditorVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lx.protogen.lbm.Lbm.Void.getDefaultInstance()))
              .setSchemaDescriptor(new XuanwuShardHostingMethodDescriptorSupplier("AuditorVote"))
              .build();
        }
      }
    }
    return getAuditorVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lx.protogen.xw.Xw.AuditionRule,
      lx.protogen.lbm.Lbm.Void> getBizBindAuditionRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BizBindAuditionRule",
      requestType = lx.protogen.xw.Xw.AuditionRule.class,
      responseType = lx.protogen.lbm.Lbm.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lx.protogen.xw.Xw.AuditionRule,
      lx.protogen.lbm.Lbm.Void> getBizBindAuditionRuleMethod() {
    io.grpc.MethodDescriptor<lx.protogen.xw.Xw.AuditionRule, lx.protogen.lbm.Lbm.Void> getBizBindAuditionRuleMethod;
    if ((getBizBindAuditionRuleMethod = XuanwuShardHostingGrpc.getBizBindAuditionRuleMethod) == null) {
      synchronized (XuanwuShardHostingGrpc.class) {
        if ((getBizBindAuditionRuleMethod = XuanwuShardHostingGrpc.getBizBindAuditionRuleMethod) == null) {
          XuanwuShardHostingGrpc.getBizBindAuditionRuleMethod = getBizBindAuditionRuleMethod =
              io.grpc.MethodDescriptor.<lx.protogen.xw.Xw.AuditionRule, lx.protogen.lbm.Lbm.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BizBindAuditionRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lx.protogen.xw.Xw.AuditionRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lx.protogen.lbm.Lbm.Void.getDefaultInstance()))
              .setSchemaDescriptor(new XuanwuShardHostingMethodDescriptorSupplier("BizBindAuditionRule"))
              .build();
        }
      }
    }
    return getBizBindAuditionRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lx.protogen.xw.Xw.SignSessionId,
      lx.protogen.xw.Xw.AuditionStatus> getBizPollAuditionProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BizPollAuditionProgress",
      requestType = lx.protogen.xw.Xw.SignSessionId.class,
      responseType = lx.protogen.xw.Xw.AuditionStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lx.protogen.xw.Xw.SignSessionId,
      lx.protogen.xw.Xw.AuditionStatus> getBizPollAuditionProgressMethod() {
    io.grpc.MethodDescriptor<lx.protogen.xw.Xw.SignSessionId, lx.protogen.xw.Xw.AuditionStatus> getBizPollAuditionProgressMethod;
    if ((getBizPollAuditionProgressMethod = XuanwuShardHostingGrpc.getBizPollAuditionProgressMethod) == null) {
      synchronized (XuanwuShardHostingGrpc.class) {
        if ((getBizPollAuditionProgressMethod = XuanwuShardHostingGrpc.getBizPollAuditionProgressMethod) == null) {
          XuanwuShardHostingGrpc.getBizPollAuditionProgressMethod = getBizPollAuditionProgressMethod =
              io.grpc.MethodDescriptor.<lx.protogen.xw.Xw.SignSessionId, lx.protogen.xw.Xw.AuditionStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BizPollAuditionProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lx.protogen.xw.Xw.SignSessionId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lx.protogen.xw.Xw.AuditionStatus.getDefaultInstance()))
              .setSchemaDescriptor(new XuanwuShardHostingMethodDescriptorSupplier("BizPollAuditionProgress"))
              .build();
        }
      }
    }
    return getBizPollAuditionProgressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static XuanwuShardHostingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XuanwuShardHostingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XuanwuShardHostingStub>() {
        @java.lang.Override
        public XuanwuShardHostingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XuanwuShardHostingStub(channel, callOptions);
        }
      };
    return XuanwuShardHostingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static XuanwuShardHostingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XuanwuShardHostingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XuanwuShardHostingBlockingStub>() {
        @java.lang.Override
        public XuanwuShardHostingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XuanwuShardHostingBlockingStub(channel, callOptions);
        }
      };
    return XuanwuShardHostingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static XuanwuShardHostingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<XuanwuShardHostingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<XuanwuShardHostingFutureStub>() {
        @java.lang.Override
        public XuanwuShardHostingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new XuanwuShardHostingFutureStub(channel, callOptions);
        }
      };
    return XuanwuShardHostingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void auditorVote(lx.protogen.xw.Xw.AuditorVoteRequest request,
        io.grpc.stub.StreamObserver<lx.protogen.lbm.Lbm.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuditorVoteMethod(), responseObserver);
    }

    /**
     */
    default void bizBindAuditionRule(lx.protogen.xw.Xw.AuditionRule request,
        io.grpc.stub.StreamObserver<lx.protogen.lbm.Lbm.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBizBindAuditionRuleMethod(), responseObserver);
    }

    /**
     */
    default void bizPollAuditionProgress(lx.protogen.xw.Xw.SignSessionId request,
        io.grpc.stub.StreamObserver<lx.protogen.xw.Xw.AuditionStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBizPollAuditionProgressMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service XuanwuShardHosting.
   */
  public static abstract class XuanwuShardHostingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return XuanwuShardHostingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service XuanwuShardHosting.
   */
  public static final class XuanwuShardHostingStub
      extends io.grpc.stub.AbstractAsyncStub<XuanwuShardHostingStub> {
    private XuanwuShardHostingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XuanwuShardHostingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XuanwuShardHostingStub(channel, callOptions);
    }

    /**
     */
    public void auditorVote(lx.protogen.xw.Xw.AuditorVoteRequest request,
        io.grpc.stub.StreamObserver<lx.protogen.lbm.Lbm.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuditorVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bizBindAuditionRule(lx.protogen.xw.Xw.AuditionRule request,
        io.grpc.stub.StreamObserver<lx.protogen.lbm.Lbm.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBizBindAuditionRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bizPollAuditionProgress(lx.protogen.xw.Xw.SignSessionId request,
        io.grpc.stub.StreamObserver<lx.protogen.xw.Xw.AuditionStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBizPollAuditionProgressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service XuanwuShardHosting.
   */
  public static final class XuanwuShardHostingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<XuanwuShardHostingBlockingStub> {
    private XuanwuShardHostingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XuanwuShardHostingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XuanwuShardHostingBlockingStub(channel, callOptions);
    }

    /**
     */
    public lx.protogen.lbm.Lbm.Void auditorVote(lx.protogen.xw.Xw.AuditorVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuditorVoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public lx.protogen.lbm.Lbm.Void bizBindAuditionRule(lx.protogen.xw.Xw.AuditionRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBizBindAuditionRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public lx.protogen.xw.Xw.AuditionStatus bizPollAuditionProgress(lx.protogen.xw.Xw.SignSessionId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBizPollAuditionProgressMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service XuanwuShardHosting.
   */
  public static final class XuanwuShardHostingFutureStub
      extends io.grpc.stub.AbstractFutureStub<XuanwuShardHostingFutureStub> {
    private XuanwuShardHostingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected XuanwuShardHostingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new XuanwuShardHostingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lx.protogen.lbm.Lbm.Void> auditorVote(
        lx.protogen.xw.Xw.AuditorVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuditorVoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lx.protogen.lbm.Lbm.Void> bizBindAuditionRule(
        lx.protogen.xw.Xw.AuditionRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBizBindAuditionRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lx.protogen.xw.Xw.AuditionStatus> bizPollAuditionProgress(
        lx.protogen.xw.Xw.SignSessionId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBizPollAuditionProgressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUDITOR_VOTE = 0;
  private static final int METHODID_BIZ_BIND_AUDITION_RULE = 1;
  private static final int METHODID_BIZ_POLL_AUDITION_PROGRESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUDITOR_VOTE:
          serviceImpl.auditorVote((lx.protogen.xw.Xw.AuditorVoteRequest) request,
              (io.grpc.stub.StreamObserver<lx.protogen.lbm.Lbm.Void>) responseObserver);
          break;
        case METHODID_BIZ_BIND_AUDITION_RULE:
          serviceImpl.bizBindAuditionRule((lx.protogen.xw.Xw.AuditionRule) request,
              (io.grpc.stub.StreamObserver<lx.protogen.lbm.Lbm.Void>) responseObserver);
          break;
        case METHODID_BIZ_POLL_AUDITION_PROGRESS:
          serviceImpl.bizPollAuditionProgress((lx.protogen.xw.Xw.SignSessionId) request,
              (io.grpc.stub.StreamObserver<lx.protogen.xw.Xw.AuditionStatus>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAuditorVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lx.protogen.xw.Xw.AuditorVoteRequest,
              lx.protogen.lbm.Lbm.Void>(
                service, METHODID_AUDITOR_VOTE)))
        .addMethod(
          getBizBindAuditionRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lx.protogen.xw.Xw.AuditionRule,
              lx.protogen.lbm.Lbm.Void>(
                service, METHODID_BIZ_BIND_AUDITION_RULE)))
        .addMethod(
          getBizPollAuditionProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lx.protogen.xw.Xw.SignSessionId,
              lx.protogen.xw.Xw.AuditionStatus>(
                service, METHODID_BIZ_POLL_AUDITION_PROGRESS)))
        .build();
  }

  private static abstract class XuanwuShardHostingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    XuanwuShardHostingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lx.protogen.xw.Xw.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("XuanwuShardHosting");
    }
  }

  private static final class XuanwuShardHostingFileDescriptorSupplier
      extends XuanwuShardHostingBaseDescriptorSupplier {
    XuanwuShardHostingFileDescriptorSupplier() {}
  }

  private static final class XuanwuShardHostingMethodDescriptorSupplier
      extends XuanwuShardHostingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    XuanwuShardHostingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (XuanwuShardHostingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new XuanwuShardHostingFileDescriptorSupplier())
              .addMethod(getAuditorVoteMethod())
              .addMethod(getBizBindAuditionRuleMethod())
              .addMethod(getBizPollAuditionProgressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
