// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: todo.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Com.Github.Jmlb23.Todo.Server.Codegen {
  public static partial class TodoService
  {
    static readonly string __ServiceName = "com.github.jmlb23.todo.server.codegen.TodoService";

    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest> __Marshaller_com_github_jmlb23_todo_server_codegen_GetTodoRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse> __Marshaller_com_github_jmlb23_todo_server_codegen_GetTodoResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest> __Marshaller_com_github_jmlb23_todo_server_codegen_GetAllTodosRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse> __Marshaller_com_github_jmlb23_todo_server_codegen_GetAllTodosResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest> __Marshaller_com_github_jmlb23_todo_server_codegen_UpdateTodoRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse> __Marshaller_com_github_jmlb23_todo_server_codegen_UpdateTodoResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest> __Marshaller_com_github_jmlb23_todo_server_codegen_RemoveTodoRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse> __Marshaller_com_github_jmlb23_todo_server_codegen_RemoveTodoResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest> __Marshaller_com_github_jmlb23_todo_server_codegen_CreateTodoRequest = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest.Parser.ParseFrom);
    static readonly grpc::Marshaller<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse> __Marshaller_com_github_jmlb23_todo_server_codegen_CreateTodoResponse = grpc::Marshallers.Create((arg) => global::Google.Protobuf.MessageExtensions.ToByteArray(arg), global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse.Parser.ParseFrom);

    static readonly grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse> __Method_GetTodo = new grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetTodo",
        __Marshaller_com_github_jmlb23_todo_server_codegen_GetTodoRequest,
        __Marshaller_com_github_jmlb23_todo_server_codegen_GetTodoResponse);

    static readonly grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse> __Method_GetAllTodos = new grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetAllTodos",
        __Marshaller_com_github_jmlb23_todo_server_codegen_GetAllTodosRequest,
        __Marshaller_com_github_jmlb23_todo_server_codegen_GetAllTodosResponse);

    static readonly grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse> __Method_UpdateTodo = new grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "UpdateTodo",
        __Marshaller_com_github_jmlb23_todo_server_codegen_UpdateTodoRequest,
        __Marshaller_com_github_jmlb23_todo_server_codegen_UpdateTodoResponse);

    static readonly grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse> __Method_RemoveTodo = new grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "RemoveTodo",
        __Marshaller_com_github_jmlb23_todo_server_codegen_RemoveTodoRequest,
        __Marshaller_com_github_jmlb23_todo_server_codegen_RemoveTodoResponse);

    static readonly grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse> __Method_CreateTodo = new grpc::Method<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest, global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "CreateTodo",
        __Marshaller_com_github_jmlb23_todo_server_codegen_CreateTodoRequest,
        __Marshaller_com_github_jmlb23_todo_server_codegen_CreateTodoResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Com.Github.Jmlb23.Todo.Server.Codegen.TodoReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of TodoService</summary>
    public abstract partial class TodoServiceBase
    {
      public virtual global::System.Threading.Tasks.Task<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse> GetTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      public virtual global::System.Threading.Tasks.Task<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse> GetAllTodos(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      public virtual global::System.Threading.Tasks.Task<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse> UpdateTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      public virtual global::System.Threading.Tasks.Task<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse> RemoveTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      public virtual global::System.Threading.Tasks.Task<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse> CreateTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for TodoService</summary>
    public partial class TodoServiceClient : grpc::ClientBase<TodoServiceClient>
    {
      /// <summary>Creates a new client for TodoService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public TodoServiceClient(grpc::Channel channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for TodoService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public TodoServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected TodoServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected TodoServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse GetTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetTodo(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse GetTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetTodo, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse> GetTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetTodoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoResponse> GetTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetTodo, null, options, request);
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse GetAllTodos(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetAllTodos(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse GetAllTodos(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetAllTodos, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse> GetAllTodosAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetAllTodosAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosResponse> GetAllTodosAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.GetAllTodosRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetAllTodos, null, options, request);
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse UpdateTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdateTodo(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse UpdateTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_UpdateTodo, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse> UpdateTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return UpdateTodoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoResponse> UpdateTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.UpdateTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_UpdateTodo, null, options, request);
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse RemoveTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RemoveTodo(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse RemoveTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_RemoveTodo, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse> RemoveTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return RemoveTodoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoResponse> RemoveTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.RemoveTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_RemoveTodo, null, options, request);
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse CreateTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateTodo(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse CreateTodo(global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_CreateTodo, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse> CreateTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return CreateTodoAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoResponse> CreateTodoAsync(global::Com.Github.Jmlb23.Todo.Server.Codegen.CreateTodoRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_CreateTodo, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override TodoServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new TodoServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static grpc::ServerServiceDefinition BindService(TodoServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_GetTodo, serviceImpl.GetTodo)
          .AddMethod(__Method_GetAllTodos, serviceImpl.GetAllTodos)
          .AddMethod(__Method_UpdateTodo, serviceImpl.UpdateTodo)
          .AddMethod(__Method_RemoveTodo, serviceImpl.RemoveTodo)
          .AddMethod(__Method_CreateTodo, serviceImpl.CreateTodo).Build();
    }

    /// <summary>Register service method implementations with a service binder. Useful when customizing the service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    public static void BindService(grpc::ServiceBinderBase serviceBinder, TodoServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_GetTodo, serviceImpl.GetTodo);
      serviceBinder.AddMethod(__Method_GetAllTodos, serviceImpl.GetAllTodos);
      serviceBinder.AddMethod(__Method_UpdateTodo, serviceImpl.UpdateTodo);
      serviceBinder.AddMethod(__Method_RemoveTodo, serviceImpl.RemoveTodo);
      serviceBinder.AddMethod(__Method_CreateTodo, serviceImpl.CreateTodo);
    }

  }
}
#endregion