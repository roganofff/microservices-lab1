package com.quo.routes

import com.quo.repository.GroupRepository
import com.quo.util.getId
import io.ktor.http.*
import io.ktor.server.plugins.BadRequestException
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.groupRoutes(groupRepository: GroupRepository) {
    route("/group") {
        get {
            try {
                val id = call.getId()
                call.respondText(groupRepository.get(id).toString())
            } catch (e: BadRequestException) {
                call.respondText(e.message ?: "Bad Request", status = HttpStatusCode.BadRequest)
            }
        }
        post {
            call.respondText(groupRepository.create().toString())
        }
        put {
            try {
                val id = call.getId()
                call.respondText(groupRepository.update(id).toString())
            } catch (e: BadRequestException) {
                call.respondText(e.message ?: "Bad Request", status = HttpStatusCode.BadRequest)
            }
        }
        delete {
            try {
                val id = call.getId()
                call.respondText(groupRepository.delete(id).toString())
            } catch (e: BadRequestException) {
                call.respondText(e.message ?: "Bad Request", status = HttpStatusCode.BadRequest)
            }
        }
    }
}