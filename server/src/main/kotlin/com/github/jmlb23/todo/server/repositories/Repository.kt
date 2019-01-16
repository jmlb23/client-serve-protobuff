package com.github.jmlb23.todo.server.repositories

import arrow.core.Try

interface Repository<E> {
    fun getElement(id: Long): Try<E>
    fun getAll(): Try<Sequence<E>>
    fun add(e: E): Try<Boolean>
    fun remove(id: Long): Try<Boolean>
    fun replace(id: Long, e: E): Try<Boolean>
}