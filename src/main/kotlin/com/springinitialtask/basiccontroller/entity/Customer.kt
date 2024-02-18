package com.springinitialtask.basiccontroller.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Customer (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val firstName: String = "",
    val lastName: String = ""
)