package org.example.duplicate_encoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {

    @Test
    void encode() {
        assertEquals("))(((((())", DuplicateEncoder.encode("Ppqwertyzz"));
    }
}