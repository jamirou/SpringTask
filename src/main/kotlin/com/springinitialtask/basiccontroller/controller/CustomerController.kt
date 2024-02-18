package com.springinitialtask.basiccontroller.controller

import com.springinitialtask.basiccontroller.entity.Customer
import com.springinitialtask.basiccontroller.repository.CustomerRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val repository: CustomerRepository) {

    @GetMapping
    fun findAll(): MutableList<Customer> = repository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)

    @PostMapping
    fun save(@RequestBody customer: Customer) = repository.save(customer)
}