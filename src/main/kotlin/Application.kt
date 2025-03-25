package com.quo

import com.quo.repository.ContactRepository
import com.quo.repository.GroupRepository
import com.quo.routes.configureRouting
import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureRouting(
        contactRepository = ContactRepository(),
        groupRepository = GroupRepository(),
    )
}
