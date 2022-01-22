package com.example.plugins

import com.example.routes.randomFood
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    

    routing {
        randomFood()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
