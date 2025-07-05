package org.example;

public class StringCalculator
{
    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            delimiter = java.util.regex.Pattern.quote(numbers.substring(2, index));
            numbers = numbers.substring(index + 1); // strip off delimiter declaration
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }

        return sum;
    }
}