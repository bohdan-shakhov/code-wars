package org.example.list_filtering;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFilteringTest {

    @Test
    void filterList() {
        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of("s", 1, 2, "e")));
    }
}