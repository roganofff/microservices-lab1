package com.quo.repository

interface Repository<T> {
    fun get(id: Long) : T
    fun create() : T
    fun update(id: Long) : T
    fun delete(id: Long) : Boolean
}