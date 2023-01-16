package com.vandeilson.action.integration

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AnyIT {

    @Test
    fun `print with success IT`() {
        print("This is my Integration Test")
    }
}