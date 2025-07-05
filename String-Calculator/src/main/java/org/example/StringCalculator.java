package org.example;

public class StringCalculator
{
    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;

        // Support both "," and "\n" as delimiters using regex
        String[] parts = numbers.split(",|\n");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }

        return sum;
    }
}