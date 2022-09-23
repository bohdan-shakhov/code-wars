package org.example.string_end_with;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void solutionTest() {
        assertTrue(Kata.solution("abc", "c"));
        assertFalse(Kata.solution("qwe", "ewq"));
    }

}