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
)