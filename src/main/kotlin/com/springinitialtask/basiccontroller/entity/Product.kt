package com.springinitialtask.basiccontroller.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity //JPA
data class Product (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val name: String = "",
    val price: Double = 0.0
)