package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator
{
    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = ",|\n";

        if (numbers.startsWith("//")) {
            int index = numbers.indexOf("\n");
            String delimiterPart = numbers.substring(2, index);
            numbers = numbers.substring(index + 1);

            if (delimiterPart.startsWith("[") && delimiterPart.endsWith("]")) {
                StringBuilder regexBuilder = new StringBuilder();
                Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterPart);
                while (matcher.find()) {
                    if (regexBuilder.length() > 0) regexBuilder.append("|");
                    regexBuilder.append(Pattern.quote(matcher.group(1)));
                }
                delimiter = regexBuilder.toString();
            } else {
                delimiter = Pattern.quote(delimiterPart);
            }
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String part : parts) {
            if (part.isEmpty()) continue;
            int num = Integer.parseInt(part);
            if (num < 0) {
                if (negatives.length() > 0) negatives.append(", ");
                negatives.append(num);
            } else if (num <= 1000) {
                sum += num;
            }
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + negatives);
        }

        return sum;
    }
}