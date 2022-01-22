package com.example.routes

import com.example.data.model.Food
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.0.103:8080"

private val food = listOf(
    Food("Chicken", "A chicken wing drenched in delicious sauce", "$BASE_URL/food/chicken.jpeg"),
    Food("Cheese", "Parmesan Cheese", "$BASE_URL/food/cheese.jpeg"),
    Food("Chocolate", "Come on! who does not like chocolate", "$BASE_URL/food/chocolate.jpeg"),
    Food("Coffee", "Coffee helps you defeat sleep and increases productivity", "$BASE_URL/food/coffee.jpeg"),
    Food("Donuts", "Different flavours of donut", "$BASE_URL/food/donut.jpg"),
    Food("Pizza", "Can't say no to pizza", "$BASE_URL/food/pizza.jpeg")
)

fun Route.randomFood() {
    get("/randomfood") {
        call.respond(
            HttpStatusCode.OK,
            food.random()
        )
    }
}
