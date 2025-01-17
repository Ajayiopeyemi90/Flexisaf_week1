# Flexisaf_week1
---

# PropertyCounter

**PropertyCounter** is a Java application that provides a generic method to count the number of elements in an array that satisfy a specific property, such as being an odd integer, a prime number, or a palindrome.

## Features

- **Generic Property Checking**: Count elements of any type (`T`) in an array based on a given condition.
- **Examples Included**:
  - Count odd integers.
  - Count prime numbers.
  - Count palindromic strings.

## Usage

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

### How to Run
1. Compile the `PropertyCounter` class:
   ```bash
   javac PropertyCounter.java
   ```
2. Run the program:
   ```bash
   java PropertyCounter
   ```

### Example Output
For the provided examples, the output will look like this:
```
Odd numbers count: 5
Prime numbers count: 4
Palindromes count: 3
```

## Code Explanation

### Generic Method: `countByProperty`
The core of the program is a generic method:
```java
public static <T> int countByProperty(T[] array, Predicate<T> predicate)
```
- **Parameters**:
  - `T[] array`: The array of elements to process.
  - `Predicate<T> predicate`: A condition to test each element.
- **Returns**: The count of elements that satisfy the condition.

### Helper Methods
1. **`isPrime(int n)`**:
   - Checks if a number is a prime number.
2. **`isPalindrome(String s)`**:
   - Checks if a string is a palindrome.

### Example Usage
1. **Odd Numbers**:
   ```java
   int oddCount = countByProperty(numbers, n -> n % 2 != 0);
   ```
2. **Prime Numbers**:
   ```java
   int primeCount = countByProperty(numbers, PropertyCounter::isPrime);
   ```
3. **Palindromes**:
   ```java
   int palindromeCount = countByProperty(words, PropertyCounter::isPalindrome);
   ```

## Sample Data
- Numbers: `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}`
- Words: `{"madam", "racecar", "121", "101", "level"}`

## Contributing
Contributions are welcome! If you'd like to improve the program or add new features, feel free to submit a pull request.

