package com.quo.repository

import com.quo.models.Contact

class ContactRepository : Repository<Contact> {
    override fun get(id: Long): Contact = Contact(
        id = null,
        username = null,
        givenName = null,
        familyName = null,
        phones = mutableListOf(),
        emails = mutableListOf(),
        birthDate = null,
    )

    override fun create(): Contact = Contact(
        id = null,
        username = null,
        givenName = null,
        familyName = null,
        phones = mutableListOf(),
        emails = mutableListOf(),
        birthDate = null,
    )

    override fun update(id: Long): Contact = Contact(
        id = null,
        username = null,
        givenName = null,
        familyName = null,
        phones = mutableListOf(),
        emails = mutableListOf(),
        birthDate = null,
    )

    override fun delete(id: Long): Boolean = true
}