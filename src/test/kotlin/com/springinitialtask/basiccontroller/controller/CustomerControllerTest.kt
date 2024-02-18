package com.springinitialtask.basiccontroller.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `findAll should return OK`() {
        mockMvc.perform(get("/customers/"))
            .andExpect(status().isOk)
    }
}