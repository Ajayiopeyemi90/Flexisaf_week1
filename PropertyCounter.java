import java.util.function.Predicate;

public class PropertyCounter {
    public static <T> int countByProperty(T[] array, Predicate<T> predicate) {
        if (array == null || predicate == null) {
            throw new IllegalArgumentException("Array and predicate must not be null");
        }

        int count = 0;
        for (T element : array) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage with arrays
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int oddCount = countByProperty(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers count: " + oddCount);

        int primeCount = countByProperty(numbers, PropertyCounter::isPrime);
        System.out.println("Prime numbers count: " + primeCount);

        String[] words = {"madam", "racecar", "121", "101", "level"};
        int palindromeCount = countByProperty(words, PropertyCounter::isPalindrome);
        System.out.println("Palindromes count: " + palindromeCount);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(String s) {
        if (s == null) return false;
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}