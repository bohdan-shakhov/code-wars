package org.example.who_likes_it;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.who_likes_it.WhoLikesIt.whoLikesIt;
import static org.junit.jupiter.api.Assertions.*;

class WhoLikesItTest {

    @Test
    void whoLikesItWithoutNamesInList() {
        assertEquals("no one likes this", whoLikesIt());
    }

    @Test
    void whoLikesItWithOneName() {
        assertEquals("Peter likes this", whoLikesIt("Peter"));
    }

    @Test
    void whoLikesItWithTwoNames() {
        assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
    }

    @Test void whoLikesItWithThreeNames() {
        assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
    }

    @Test void whoLikesItWithMoreThanThreeNames() {
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}