package com.okuzawats.jacoco

import org.junit.Assert.assertEquals

import org.junit.Test

class SumTest {

    @Test
    fun test_sum() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_invoke() {
        val target = Sum()
        assertEquals(4, target(2, 2))
    }
}
