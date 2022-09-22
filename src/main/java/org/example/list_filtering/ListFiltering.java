package org.example.list_filtering;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(o -> o instanceof Number)
                .collect(Collectors.toList());
    }
}
