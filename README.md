# Flexisaf_week1


Here’s a README.md for your project:

PropertyCounter
PropertyCounter is a Java application that provides a generic method to count the number of elements in an array that satisfy a specific property, such as being an odd integer, a prime number, or a palindrome.

Features
Generic Property Checking: Count elements of any type (T) in an array based on a given condition.
Examples Included:
Count odd integers.
Count prime numbers.
Count palindromic strings.
Usage
Prerequisites
Java Development Kit (JDK) 8 or higher.
How to Run
Compile the PropertyCounter class:
bash
Copy
Edit
javac PropertyCounter.java
Run the program:
bash
Copy
Edit
java PropertyCounter
Example Output
For the provided examples, the output will look like this:

yaml
Copy
Edit
Odd numbers count: 5
Prime numbers count: 4
Palindromes count: 3
Code Explanation
Generic Method: countByProperty
The core of the program is a generic method:

java
Copy
Edit
public static <T> int countByProperty(T[] array, Predicate<T> predicate)
Parameters:
T[] array: The array of elements to process.
Predicate<T> predicate: A condition to test each element.
Returns: The count of elements that satisfy the condition.
Helper Methods
isPrime(int n):
Checks if a number is a prime number.
isPalindrome(String s):
Checks if a string is a palindrome.
Example Usage
Odd Numbers:
java
Copy
Edit
int oddCount = countByProperty(numbers, n -> n % 2 != 0);
Prime Numbers:
java
Copy
Edit
int primeCount = countByProperty(numbers, PropertyCounter::isPrime);
Palindromes:
java
Copy
Edit
int palindromeCount = countByProperty(words, PropertyCounter::isPalindrome);
Sample Data
Numbers: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Words: {"madam", "racecar", "hello", "world", "level"}
