package org.example.who_likes_it;

import java.util.ArrayList;
import java.util.List;

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        List<String> namesList = new ArrayList<>(List.of(names));
        int listSize = namesList.size();
        if (listSize == 0) {
            return "no one likes this";
        } else if (listSize == 1) {
            return namesList.get(0) + " likes this";
        } else if (listSize == 2) {
            return namesList.get(0) + " and " + namesList.get(1) + " like this";
        } else if (listSize == 3) {
            return namesList.get(0) + ", " + namesList.get(1) + " and " + namesList.get(2) + " like this";
        }
        return namesList.get(0) + ", " + namesList.get(1) + " and " + (namesList.size() - 2) + " others like this";
    }
}
