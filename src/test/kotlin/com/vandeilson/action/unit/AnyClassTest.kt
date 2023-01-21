package com.vandeilson.action.unit

import org.junit.jupiter.api.Test
import org.springframework.test.util.AssertionErrors.assertNotNull

class AnyClassTest {

    @Test
    fun `print with success`() {
        print("This is my Unit Test")
    }

    @Test
    fun `unit test for envs`() {
        val testValue = System.getenv("UNIT_TEST")
        assertNotNull(testValue!!, "TEST env variable should not be null")
        println(testValue)
        println(System.getenv("GLOBAL_TEST"))
    }
}