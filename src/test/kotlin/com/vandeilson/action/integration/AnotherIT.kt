package com.vandeilson.action.integration

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AnotherIT {

    @Test
    fun `another intergration test`() {
        print("My second Integration Test")
    }
}