package com.quo.util

import io.ktor.server.plugins.BadRequestException
import io.ktor.server.routing.RoutingCall


fun RoutingCall.getId() : Long {
    val id = queryParameters["id"]?.toLongOrNull()
    if (id == null) {
        throw BadRequestException("Missing id.")
    }

    return id
}
