package com.quo.repository

import com.quo.models.Group
import kotlin.random.Random

class GroupRepository : Repository<Group> {
    override fun get(id: Long): Group = Group(
        id = id,
        title = "K0709-22",
        description = "Программисты",
        contacts = (1..34).map { it },
    )

    override fun create(): Group = Group(
        id = Random.nextLong(),
        title = "K0709-25",
        description = "Программисты новые",
        contacts = (1..30).map { it },
    )

    override fun update(id: Long): Group = Group(
        id = id,
        title = "K0709-22",
        description = "Сис. админы",
        contacts = (1..17).map { it },
    )

    override fun delete(id: Long): Boolean = true
}