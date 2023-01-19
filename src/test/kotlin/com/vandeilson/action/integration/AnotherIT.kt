package com.vandeilson.action.integration

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import org.springframework.test.util.AssertionErrors

@SpringBootTest
class AnotherIT {

    @Autowired
    private lateinit var environment: Environment

    @Test
    fun `another integration test`() {
        print("My second Integration Test")
    }

    @Test
    fun `integration test for envs`() {
        val testValue = environment.getProperty("INTEGRATION_TEST")
        AssertionErrors.assertNotNull(testValue!!, "TEST env variable should not be null")
        println(testValue)
        println(System.getenv("GLOBAL_TEST"))

    }
}