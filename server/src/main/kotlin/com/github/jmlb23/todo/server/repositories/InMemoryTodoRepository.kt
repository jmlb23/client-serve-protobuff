package com.github.jmlb23.todo.server.repositories

import arrow.core.Try
import com.github.jmlb23.todo.server.codegen.TodoOuterClass

class InMemoryTodoRepository : Repository<TodoOuterClass.Todo>{

    val mock = mutableSetOf<TodoOuterClass.Todo>()

    override fun getElement(id: Long): Try<TodoOuterClass.Todo> = Try{ mock.first { it.id == id}}

    override fun getAll(): Try<Sequence<TodoOuterClass.Todo>> = Try{ mock.asSequence()}

    override fun add(e: TodoOuterClass.Todo): Try<Boolean> = Try{mock.add(e)}

    override fun remove(id: Long): Try<Boolean> = Try{mock.removeIf{ it.id == id }}

    override fun replace(id: Long, e: TodoOuterClass.Todo): Try<Boolean> = remove(id).flatMap { add(e) }

}
