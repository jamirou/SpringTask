package com.springinitialtask.basiccontroller.service

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun retrieveGreeting(name: String) = "Hello $name"
}