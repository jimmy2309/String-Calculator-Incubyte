# String Calculator – TDD Kata in Java

This project is a clean implementation of the **String Calculator Kata** using **pure Java** and **JUnit 5** in a test-driven development (TDD) approach.

##  Objective

Build a simple string-based calculator that can:

- Parse comma- or newline-separated numbers
- Handle custom and multi-character delimiters
- Throw exceptions for negative numbers
- Ignore numbers greater than 1000
- Track how many times the calculator is used
- Be built incrementally using TDD

##  Technologies Used

- Java 17+
- JUnit 5
- Maven


##  Features (Implemented with TDD)

1. `Add("")` → `0`
2. `Add("1")` → `1`
3. `Add("1,2")` → `3`
4. Support unknown number of arguments
5. Support newlines: `Add("1\n2,3")` → `6`
6. Support custom delimiters: `//;\n1;2` → `3`
7. Throw exception on negative numbers with list: `-1, -3`
8. Ignore numbers > 1000: `Add("2,1001")` → `2`
9. Support any-length delimiters: `Add("//[***]\n1***2***3")` → `6`
10. Support multiple delimiters: `Add("//[*][%]\n1*2%3")` → `6`
11. Support multiple delimiters with length > 1: `Add("//[**][%%]\n1**2%%3")` → `6`



