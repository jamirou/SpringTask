package com.springinitialtask.basiccontroller.repository

import com.springinitialtask.basiccontroller.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Long> {
}