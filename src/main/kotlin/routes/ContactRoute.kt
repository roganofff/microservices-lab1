package com.quo.routes

import com.quo.repository.ContactRepository
import com.quo.util.getId
import io.ktor.http.*
import io.ktor.server.plugins.BadRequestException
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.contactRoutes(contactRepository: ContactRepository) {
    route("/contact") {
        get {
            try {
                val id = call.getId()
                call.respondText(contactRepository.get(id).toString())
            } catch (e: BadRequestException) {
                call.respondText(e.message ?: "Bad Request", status = HttpStatusCode.BadRequest)
            }
        }
        post {
            call.respondText(contactRepository.create().toString())
        }
        put {
            try {
                val id = call.getId()
                call.respondText(contactRepository.update(id).toString())
            } catch (e: BadRequestException) {
                call.respondText(e.message ?: "Bad Request", status = HttpStatusCode.BadRequest)
            }
        }
        delete {
            try {
                val id = call.getId()
                call.respondText(contactRepository.delete(id).toString())
            } catch (e: BadRequestException) {
                call.respondText(e.message ?: "Bad Request", status = HttpStatusCode.BadRequest)
            }
        }
    }
}
