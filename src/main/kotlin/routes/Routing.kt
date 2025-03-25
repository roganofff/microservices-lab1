package com.quo.routes

import com.quo.repository.ContactRepository
import com.quo.repository.GroupRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(
    contactRepository: ContactRepository,
    groupRepository: GroupRepository,
) {
    routing {
        route("/api/v1") {
            get("/") {
                call.respondText("Hello World!")
            }
            contactRoutes(contactRepository)
            groupRoutes(groupRepository)
        }
    }
}
