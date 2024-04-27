package org.example;

public class StringProcessor {

    private static String content;

    public StringProcessor(String string) {
        content = string;
    }

    public String getContent() {
        return content;
    }

    public String getSecretPlaceholder() {
        StringBuilder secretPlaceholder = new StringBuilder();

        // Add characters to the string until it reaches the desired length
        while (secretPlaceholder.length() < content.length()) {
            secretPlaceholder.append('*'); // You can change 'a' to any character you want
        }
        return secretPlaceholder.toString();
    }

    public void removeNonAlphabeticalCharacters() {
        String firstChar = content.substring(0, 1).replaceAll("[^a-zA-Z]", "");
        String lastChar = content.substring(content.length() - 1).replaceAll("[^a-zA-Z]", "");
        content = firstChar + content.substring(1, content.length() - 1) + lastChar;
    }
}
