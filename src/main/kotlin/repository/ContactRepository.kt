package com.quo.repository

import com.quo.models.Contact
import com.quo.models.Phone
import java.time.Instant
import java.util.Date
import kotlin.random.Random

class ContactRepository : Repository<Contact> {
    override fun get(id: Long): Contact = Contact(
        id = id,
        username = "quoVadis",
        givenName = "Yegor",
        familyName = "Roganov",
        phones = mutableListOf(
            Phone(
                id = 1,
                countryCode = 7,
                operator = 949,
                number = 4321567,
            ),
        ),
        emails = mutableListOf("yroganov@gmail.com"),
        birthDate = Date.from(Instant.now()),
    )

    override fun create(): Contact = Contact(
        id = Random.nextLong(),
        username = "UserName",
        givenName = "Yegor",
        familyName = "Roganov",
        phones = mutableListOf(
            Phone(
                id = 1,
                countryCode = 7,
                operator = 949,
                number = 4321567,
            ),
        ),
        emails = mutableListOf("yroganov@gmail.com"),
        birthDate = Date.from(Instant.now()),
    )

    override fun update(id: Long): Contact = Contact(
        id = id,
        username = "wizoyd",
        givenName = "Yegor",
        familyName = "Roganov",
        phones = mutableListOf(
            Phone(
                id = 1,
                countryCode = 7,
                operator = 918,
                number = 1234567,
            ),
        ),
        emails = mutableListOf("wizoyd@mail.ru"),
        birthDate = Date.from(Instant.now()),
    )

    override fun delete(id: Long): Boolean = true
}