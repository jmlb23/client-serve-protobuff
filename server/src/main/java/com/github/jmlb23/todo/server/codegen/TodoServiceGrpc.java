package com.github.jmlb23.todo.server.codegen;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0-SNAPSHOT)",
    comments = "Source: todo.proto")
public final class TodoServiceGrpc {

  private TodoServiceGrpc() {}

  public static final String SERVICE_NAME = "com.github.jmlb23.todo.server.codegen.TodoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse> getGetTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTodo",
      requestType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest.class,
      responseType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse> getGetTodoMethod() {
    io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse> getGetTodoMethod;
    if ((getGetTodoMethod = TodoServiceGrpc.getGetTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getGetTodoMethod = TodoServiceGrpc.getGetTodoMethod) == null) {
          TodoServiceGrpc.getGetTodoMethod = getGetTodoMethod = 
              io.grpc.MethodDescriptor.<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.jmlb23.todo.server.codegen.TodoService", "GetTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("GetTodo"))
                  .build();
          }
        }
     }
     return getGetTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse> getGetAllTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllTodos",
      requestType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest.class,
      responseType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse> getGetAllTodosMethod() {
    io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse> getGetAllTodosMethod;
    if ((getGetAllTodosMethod = TodoServiceGrpc.getGetAllTodosMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getGetAllTodosMethod = TodoServiceGrpc.getGetAllTodosMethod) == null) {
          TodoServiceGrpc.getGetAllTodosMethod = getGetAllTodosMethod = 
              io.grpc.MethodDescriptor.<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.jmlb23.todo.server.codegen.TodoService", "GetAllTodos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("GetAllTodos"))
                  .build();
          }
        }
     }
     return getGetAllTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse> getUpdateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTodo",
      requestType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest.class,
      responseType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse> getUpdateTodoMethod() {
    io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse> getUpdateTodoMethod;
    if ((getUpdateTodoMethod = TodoServiceGrpc.getUpdateTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getUpdateTodoMethod = TodoServiceGrpc.getUpdateTodoMethod) == null) {
          TodoServiceGrpc.getUpdateTodoMethod = getUpdateTodoMethod = 
              io.grpc.MethodDescriptor.<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.jmlb23.todo.server.codegen.TodoService", "UpdateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("UpdateTodo"))
                  .build();
          }
        }
     }
     return getUpdateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse> getRemoveTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTodo",
      requestType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest.class,
      responseType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse> getRemoveTodoMethod() {
    io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse> getRemoveTodoMethod;
    if ((getRemoveTodoMethod = TodoServiceGrpc.getRemoveTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getRemoveTodoMethod = TodoServiceGrpc.getRemoveTodoMethod) == null) {
          TodoServiceGrpc.getRemoveTodoMethod = getRemoveTodoMethod = 
              io.grpc.MethodDescriptor.<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.jmlb23.todo.server.codegen.TodoService", "RemoveTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("RemoveTodo"))
                  .build();
          }
        }
     }
     return getRemoveTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse> getCreateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTodo",
      requestType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest.class,
      responseType = com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest,
      com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse> getCreateTodoMethod() {
    io.grpc.MethodDescriptor<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse> getCreateTodoMethod;
    if ((getCreateTodoMethod = TodoServiceGrpc.getCreateTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getCreateTodoMethod = TodoServiceGrpc.getCreateTodoMethod) == null) {
          TodoServiceGrpc.getCreateTodoMethod = getCreateTodoMethod = 
              io.grpc.MethodDescriptor.<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest, com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.github.jmlb23.todo.server.codegen.TodoService", "CreateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("CreateTodo"))
                  .build();
          }
        }
     }
     return getCreateTodoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoServiceStub newStub(io.grpc.Channel channel) {
    return new TodoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TodoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TodoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TodoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTodoMethod(), responseObserver);
    }

    /**
     */
    public void getAllTodos(com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTodosMethod(), responseObserver);
    }

    /**
     */
    public void updateTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTodoMethod(), responseObserver);
    }

    /**
     */
    public void removeTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTodoMethod(), responseObserver);
    }

    /**
     */
    public void createTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTodoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest,
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse>(
                  this, METHODID_GET_TODO)))
          .addMethod(
            getGetAllTodosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest,
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse>(
                  this, METHODID_GET_ALL_TODOS)))
          .addMethod(
            getUpdateTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest,
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse>(
                  this, METHODID_UPDATE_TODO)))
          .addMethod(
            getRemoveTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest,
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse>(
                  this, METHODID_REMOVE_TODO)))
          .addMethod(
            getCreateTodoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest,
                com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse>(
                  this, METHODID_CREATE_TODO)))
          .build();
    }
  }

  /**
   */
  public static final class TodoServiceStub extends io.grpc.stub.AbstractStub<TodoServiceStub> {
    private TodoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TodoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TodoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTodos(com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest request,
        io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTodoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TodoServiceBlockingStub extends io.grpc.stub.AbstractStub<TodoServiceBlockingStub> {
    private TodoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TodoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TodoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse getTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse getAllTodos(com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse updateTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse removeTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse createTodo(com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTodoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TodoServiceFutureStub extends io.grpc.stub.AbstractStub<TodoServiceFutureStub> {
    private TodoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TodoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TodoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse> getTodo(
        com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse> getAllTodos(
        com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse> updateTodo(
        com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse> removeTodo(
        com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse> createTodo(
        com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTodoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TODO = 0;
  private static final int METHODID_GET_ALL_TODOS = 1;
  private static final int METHODID_UPDATE_TODO = 2;
  private static final int METHODID_REMOVE_TODO = 3;
  private static final int METHODID_CREATE_TODO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TodoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TodoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TODO:
          serviceImpl.getTodo((com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetTodoResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_TODOS:
          serviceImpl.getAllTodos((com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosRequest) request,
              (io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.GetAllTodosResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TODO:
          serviceImpl.updateTodo((com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.UpdateTodoResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TODO:
          serviceImpl.removeTodo((com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.RemoveTodoResponse>) responseObserver);
          break;
        case METHODID_CREATE_TODO:
          serviceImpl.createTodo((com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoRequest) request,
              (io.grpc.stub.StreamObserver<com.github.jmlb23.todo.server.codegen.TodoOuterClass.CreateTodoResponse>) responseObserver);
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

  private static abstract class TodoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TodoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.jmlb23.todo.server.codegen.TodoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TodoService");
    }
  }

  private static final class TodoServiceFileDescriptorSupplier
      extends TodoServiceBaseDescriptorSupplier {
    TodoServiceFileDescriptorSupplier() {}
  }

  private static final class TodoServiceMethodDescriptorSupplier
      extends TodoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TodoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TodoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoServiceFileDescriptorSupplier())
              .addMethod(getGetTodoMethod())
              .addMethod(getGetAllTodosMethod())
              .addMethod(getUpdateTodoMethod())
              .addMethod(getRemoveTodoMethod())
              .addMethod(getCreateTodoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
