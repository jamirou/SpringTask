package com.springinitialtask.basiccontroller.controller

import com.springinitialtask.basiccontroller.repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greetings")
class GreetingController(private val productRepository: ProductRepository) {

    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name: String) : String {
        return "Hello $name"
    }

}