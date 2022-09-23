package org.example.duplicate_encoder;

public class DuplicateEncoder {

    public static String encode(String word) {
        StringBuilder result = new StringBuilder();
        String lowerCaseWord = word.toLowerCase();
        for (char c : lowerCaseWord.toCharArray()) {
            c = lowerCaseWord.indexOf(c) != lowerCaseWord.lastIndexOf(c) ? ')' : '(';
            result.append(c);
        }
        return result.toString();
    }
}
