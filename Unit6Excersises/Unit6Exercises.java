public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static int factorialRecursive(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        int firstNum = 0;
        int secondNum = 1;
        if (n == firstNum) {
            return firstNum;
        }
        if (n == secondNum) {
            return secondNum;
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return sum;
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n >= 10) {
            sum = sum + (n % 10);
            n = n/10;
        }
        return sum + n;
    }

    public static int sumDigitsRecursive(int n) {
        if (n < 10) {
            return n;
        } 
        return (n % 10) + sumDigitsRecursive(n/10);
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                sum++;
            }
        }
        return sum;
    }

    public static int countXRecursive(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int sum = 0;
        if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (str.charAt(0) == 'x') {
                sum = 1 + countXRecursive(str.substring(1));

            } else {
                sum = countXRecursive(str.substring(1));
            }
        }
        return sum;
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringRecursive(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseStringRecursive(str.substring(0, str.length() - 1));
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */

    public static int power(int base, int exponent) {
        int sum = 1;
        for (int i = 1; i <= exponent; i++) {
            sum = sum * base;
        }
        return sum;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        if (exponent == 1) {
            return base;
        }
        return base * powerRecursive(base, exponent - 1);
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - 1 - i))) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return (isPalindromeRecursive(str.substring(1, str.length() - 1)));
            } else {
                return false;
            }
        }
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        return -1;
        
    }

    public static int gcdRecursive(int a, int b) {
        return 0;
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */
    public static int bunnyEars(int bunnies) {
        int sum = 0;
        for (int i = 0; i < bunnies; i++) {
            if (i % 2 == 0) {
                sum = sum + 3;
            } else {
                sum = sum + 2;
            }
        }
        return sum;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        int sum = 0;
        if (bunnies == 1) {
            return 2;
        }
        if (bunnies % 2 == 0) {
            sum = 3 + bunnyEarsRecursive(bunnies - 1);
        } else {
            sum = 2 + bunnyEarsRecursive(bunnies - 1);
        }
        return sum;
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        if (high < low) {
            return - 1;
        }

        int middle = (low + high) / 2;
        if (arr[middle] == key) {
            return middle;
        }
        if (key > arr[middle]) {
            return binarySearchRecursiveHelper(arr, key, middle + 1, high);
        } else {
            return binarySearchRecursiveHelper(arr, key, low , middle - 1); 
        }
    }

     // DO NOT EDIT! Work on the helper version above this method. This method is to be used for testing purposes only.
     public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length-1); // Element not found
    }
}
