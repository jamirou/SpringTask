package com.springinitialtask.basiccontroller

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasicControllerApplication

fun main(args: Array<String>) {
	runApplication<BasicControllerApplication>(*args)
	var newBadge: String? = "Still don't know how it works"
}
