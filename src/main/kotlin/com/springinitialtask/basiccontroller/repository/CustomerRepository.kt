package com.springinitialtask.basiccontroller.repository

import com.springinitialtask.basiccontroller.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long> 