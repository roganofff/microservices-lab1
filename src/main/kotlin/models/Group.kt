package com.quo.models

data class Group(
    val id: Long,
    val title: String,
    val description: String,
    val contacts: List<Int>
)