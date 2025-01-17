# Flexisaf_week1
---

# PropertyCounter

**PropertyCounter** is a Java utility that provides a generic method to count the number of elements in an array that satisfy a specific property. The properties are defined using predicates and can include conditions such as being an odd number, a prime number, or a numerical palindrome.

## Features

- **Generic Method**: Works with any type extending `Number`.
- **Custom Conditions**: Supports user-defined properties via Java's `Predicate` functional interface.
- **Example Properties**:
  - Odd numbers.
  - Prime numbers.
  - Numerical palindromes.

## Prerequisites

- **Java Version**: Java Development Kit (JDK) 8 or higher.

## Usage

### Compilation

To compile the program, run:
```bash
javac PropertyCounter.java
```

### Running the Program

Run the program with:
```bash
java PropertyCounter
```

### Example Output

For the included examples in the `main` method, the output will be:
```
Odd numbers count: 5
Prime numbers count: 4
Palindromes count: 4
```

## Code Structure

### Generic Method: `countByProperty`
```java
public static <T extends Number> int countByProperty(T[] array, Predicate<T> predicate)
```
- **Type Parameter**: `<T extends Number>` ensures the type `T` is numerical (e.g., `Integer`, `Double`, `Float`).
- **Parameters**:
  - `T[] array`: The array of elements to process.
  - `Predicate<T> predicate`: A condition to test each element.
- **Returns**: The count of elements satisfying the condition.

### Helper Methods

#### `isPrime`
```java
private static boolean isPrime(int n)
```
Checks whether a number is a prime number.

#### `isPalindrome`
```java
private static boolean isPalindrome(Number n)
```
Checks whether a number is a palindrome by converting it to a string and checking equality with its reverse.

## Examples

### Example 1: Counting Odd Numbers
Input:
```java
Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int oddCount = countByProperty(numbers, n -> n % 2 != 0);
```
Output:
```
Odd numbers count: 5
```

### Example 2: Counting Prime Numbers
Input:
```java
int primeCount = countByProperty(numbers, PropertyCounter::isPrime);
```
Output:
```
Prime numbers count: 4
```

### Example 3: Counting Palindromes
Input:
```java
Integer[] palindromes = {131, 141, 121, 101};
int palindromeCount = countByProperty(palindromes, PropertyCounter::isPalindrome);
```
Output:
```
Palindromes count: 4
```
