package org.example.jadens_case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

    @Test
    void toJadenCaseWithNullInputString() {
        assertNull(JadenCase.toJadenCase(null));
    }

    @Test
    void toJadenCaseWithEmptyInputString() {
        assertNull(JadenCase.toJadenCase(""));
    }

    @Test
    void toJadenCaseWithValidInputString() {
        assertEquals("My Name Is Bohdan!", JadenCase.toJadenCase("my name is bohdan!"));
    }
}