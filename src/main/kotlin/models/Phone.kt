package com.quo.models

data class Phone(
    val id: Long,
    val countryCode: Int,
    val operator: Int,
    val number: Int,
)