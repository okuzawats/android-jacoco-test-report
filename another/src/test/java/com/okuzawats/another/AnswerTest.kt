package com.okuzawats.another

import org.junit.Assert.*

import org.junit.Test

class AnswerTest {

    @Test
    fun isAnswer_if42() {
        assertEquals(true, Answer().isAnswer(42))
    }

    @Test
    fun isNotAnswer_ifUnder42() {
        assertEquals(false, Answer().isAnswer(41))
    }

    @Test
    fun isNotAnswer_ifOver42() {
        assertEquals(false, Answer().isAnswer(43))
    }
}
