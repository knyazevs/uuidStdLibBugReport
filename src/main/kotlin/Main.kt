package io.github.knyazevs

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@OptIn(ExperimentalUuidApi::class)
fun main() {
    println("Hello World!")
    println(Uuid.random().toString())
}