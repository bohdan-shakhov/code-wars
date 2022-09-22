package org.example.jadens_case;

public class JadenCase {
    public static void main(String[] args) {

    }

    public static String toJadenCase(String phrase) {
        StringBuilder result = new StringBuilder();
        if (phrase == null || phrase.length() == 0)
            return null;

        for (String s : phrase.split(" ")) {
            String replace = s.replace(s.charAt(0), Character.toUpperCase(s.charAt(0)));
            result.append(replace).append(" ");
        }
        return result.toString().trim();
    }
}
