package com.springinitialtask.basiccontroller.controller

import com.springinitialtask.basiccontroller.repository.ProductRepository
import com.springinitialtask.basiccontroller.service.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/greetings")
//private val productRepository: ProductRepository
class GreetingController(val greetingService: GreetingService)  {
    @GetMapping("/{name}")
    fun retrieveGreeting(@PathVariable("name") name: String) : String {
        return greetingService.retrieveGreeting(name)
    }

}