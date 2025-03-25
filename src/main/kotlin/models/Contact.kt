package com.quo.models

import java.util.Date

data class Contact(
    val id: Long,
    var username: String,
    var givenName: String,
    var familyName: String,
    var phones: MutableList<Phone>,
    var emails: MutableList<String>,
    val birthDate: Date,
) {
    override fun toString(): String {
        return """
            id: $id,
            username: $username,
            givenName: $givenName,
            familyName: $familyName,
            phones: ${phones.joinToString(prefix = "[", postfix = "]", separator = ", ")},
            emails: ${emails.joinToString(prefix = "[", postfix = "]", separator = ", ")},
            birthDate: $birthDate
        """.trimIndent()
    }
}