package com.github.jmlb23.todo.server.impl

import com.github.jmlb23.todo.server.repositories.InMemoryTodoRepository
import org.junit.Assert
import kotlin.test.Test

class TestInMemoryRepo {
    @Test
    fun testInMemoryRepoHasElements() {
        val repo = InMemoryTodoRepository()
        repo.add(TodoOuterClass.Todo.newBuilder().setId(1).setContent("A mock Todo").setDone(false).build())
        repo.add(TodoOuterClass.Todo.newBuilder().setId(2).setContent("A mock Todo 2").setDone(true).build())
        repo.add(TodoOuterClass.Todo.newBuilder().setId(3).setContent("A mock Todo 3").setDone(false).build())

        repo.getAll().fold({Assert.fail()},{ s -> Assert.assertEquals(3,s.count())})
    }
}
