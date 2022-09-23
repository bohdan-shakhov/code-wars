package org.example.troll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrollTest {

    @Test
    void disemvowel() {
        assertEquals("ths wbst yyy!", Troll.disemvowel("this website yayaya!"));
    }
}