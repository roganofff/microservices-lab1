package com.quo.repository

import com.quo.models.Group

class GroupRepository : Repository<Group> {
    override fun get(id: Long): Group = Group(
        id = null,
        title = null,
        description = null,
        contacts = listOf(),
    )

    override fun create(): Group = Group(
        id = null,
        title = null,
        description = null,
        contacts = listOf(),
    )

    override fun update(id: Long): Group = Group(
        id = null,
        title = null,
        description = null,
        contacts = listOf(),
    )

    override fun delete(id: Long): Boolean = true
}