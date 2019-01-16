package com.github.jmlb23.todo.server.impl

import com.github.jmlb23.todo.server.codegen.TodoOuterClass
import com.github.jmlb23.todo.server.codegen.TodoServiceGrpc
import com.github.jmlb23.todo.server.repositories.Repository
import io.grpc.stub.StreamObserver

class TodoService(val repository: Repository<TodoOuterClass.Todo>) : TodoServiceGrpc.TodoServiceImplBase(){

    override fun getTodo(request: TodoOuterClass.GetTodoRequest?, responseObserver: StreamObserver<TodoOuterClass.GetTodoResponse>?) {
        repository
                .getElement(request!!.id)
                .fold({responseObserver?.onError(it)},{
                    responseObserver?.onNext(TodoOuterClass.GetTodoResponse.newBuilder().setTodo(it).build())
                    responseObserver?.onCompleted()
                })
    }

    override fun getAllTodos(request: TodoOuterClass.GetAllTodosRequest?, responseObserver: StreamObserver<TodoOuterClass.GetAllTodosResponse>?) {
        repository
                .getAll()
                .fold({ responseObserver?.onError(it)},{
                    responseObserver?.onNext(TodoOuterClass.GetAllTodosResponse.newBuilder().addAllTodo(it.asIterable()).build())
                    responseObserver?.onCompleted()
                    })
    }

    override fun createTodo(request: TodoOuterClass.CreateTodoRequest?, responseObserver: StreamObserver<TodoOuterClass.CreateTodoResponse>?) {
        repository
                .add(request!!.todo)
                .fold({responseObserver?.onError(it)},{
                    responseObserver?.onNext(TodoOuterClass.CreateTodoResponse.newBuilder().setSuccess(TodoOuterClass.Success.newBuilder().setMessage("Success")).build())
                    responseObserver?.onCompleted()
                    })
    }

    override fun removeTodo(request: TodoOuterClass.RemoveTodoRequest?, responseObserver: StreamObserver<TodoOuterClass.RemoveTodoResponse>?) {
        repository
                .remove(request!!.todoId)
                .fold({responseObserver?.onError(it)},{
                    responseObserver?.onNext(TodoOuterClass.RemoveTodoResponse.newBuilder().setSuccess(TodoOuterClass.Success.newBuilder().setMessage("Success")).build())
                    responseObserver?.onCompleted()
                    })
    }

    override fun updateTodo(request: TodoOuterClass.UpdateTodoRequest?, responseObserver: StreamObserver<TodoOuterClass.UpdateTodoResponse>?) {
        repository
                .replace(request!!.todoId,request.todoUpdated)
                .fold({responseObserver?.onError(it)},{
                    responseObserver?.onNext(TodoOuterClass.UpdateTodoResponse.newBuilder().setSuccess(TodoOuterClass.Success.newBuilder().setMessage("Success")).build())
                    responseObserver?.onCompleted()
                    })
    }
}