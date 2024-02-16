package com.springinitialtask.basiccontroller.controller

import com.springinitialtask.basiccontroller.entity.Product
import com.springinitialtask.basiccontroller.repository.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val repository: ProductRepository) {

    @GetMapping("/products")
    fun findAllMethod(): MutableList<Product> = repository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)

    @PostMapping
    fun save(@RequestBody product: Product) = repository.save(product)
}