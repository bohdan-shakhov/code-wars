package org.example.duplicate_encoder;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("Pp"));
        System.out.println(encode("   ()(   "));
    }

    static String encode(String word) {
        StringBuilder result = new StringBuilder();
        String lowerCaseWord = word.toLowerCase();
        for (char c : lowerCaseWord.toCharArray()) {
            c = lowerCaseWord.indexOf(c) != lowerCaseWord.lastIndexOf(c) ? ')' : '(';
            result.append(c);
        }
        return result.toString();
    }
}
