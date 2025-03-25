package com.quo.models

data class Phone(
    val id: Long,
    val countryCode: Int,
    val operator: Int,
    val number: Int,
) {
    override fun toString(): String {
        return """
            id: $id, number: +$countryCode ($operator) $number
        """.trimIndent()
    }
}