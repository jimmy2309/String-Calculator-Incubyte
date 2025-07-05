package org.example;

public class StringCalculator
{
    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            delimiter = java.util.regex.Pattern.quote(numbers.substring(2, index));
            numbers = numbers.substring(index + 1);
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < 0) {
                if (negatives.length() > 0) negatives.append(", ");
                negatives.append(num);
            }
            sum += num;
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + negatives);
        }

        return sum;
    }
}