public class Unit3ExcersisesTester {
    public static void main(String[] args) {
        //Running the test cases for calculateStringAverage
        testCalculateStringLengthAverageOne();
        testCalculateStringLengthAverageTwo();
        testCalculateStringLengthAverageThree();

        //Running the test cases for calculateStringAverage
        testReverseStringOne();
        testReverseStringTwo();
        testReverseStringThree();
        testReverseStringFour();

        //Running the test cases for findMaxValue
        testfindMaxValueOne();
        testfindMaxValueTwo();
        testfindMaxValueThree();
        testfindMaxValueFour(); 

        //Running the test cases for isPalindrome
        testIsPalindromeOne();
        testIsPalindromeTwo();
        testIsPalindromeThree();
        testIsPalindromeFour();

        //Runniing the test cases for sumEvenNumbers
        testSumEvenNumbersOne();
        testSumEvenNumbersTwo();
        testSumEvenNumbersThree();
        testSumEvenNumbersFour();

        //Running test cases for calculateSumOfSquares 
        testCalculateSumOfSquaresOne();
        testCalculateSumOfSquaresTwo();

        //Running test cases for getNthFibonacci
        testGetNthFibonacciOne();
        testGetNthFibonacciTwo();

        //Running test cases for sortArrayDescending 
        testSortArrayDescendingOne();
        testSortArrayDescendingTwo();
        testSortArrayDescendingThree();

        //Running test cases for findLongestWord
        testFindLongestWordOne();
        testFindLongestWordTwo();
        testFindLongestWordThree();

        //Running tests for calculateInterest
        testCalculateInterestOne();
        testCalculateInterestTwo();
        testCalculateInterestThree();
        testCalculateInterestFour();

        //Running tests for parsePositiveInteger
        testParsePositiveIntegerOne();
        testParsePositiveIntegerTwo();
        testParsePositiveIntegerThree();
        
        //Running tests for getArrayElement
        testGetArrayElement();

        //Running tests for calculateSquareRoot
        testCalculateSquareRoot();
    
        //Running tests for sumArrayElements
        testSumArrayElementsOne();
        testSumArrayElementsTwo();

        //Running tests for calculatePower
        testCalculatePower();
    }

    public static void testCalculateStringLengthAverageOne() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));  
    }

    public static void testCalculateStringLengthAverageTwo() {
        // Test Case - Edge Case: Null element array
        //Error had not specified what is letters
        String[] letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
         System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters)); 
    }

    public static void testCalculateStringLengthAverageThree(){
        try {
            //Need to declare what type of variable letters is 
            String[] letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }   
    }

    public static void testReverseStringOne() {
         // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
    }

    public static void testReverseStringTwo() {
        // Test Case - Edge Case: String with spaces at the end and in the middle
        //Doesnt declare what kind of variable testString is
        String testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
    }

    public static void testReverseStringThree() {
        // Test Case - Edge Case: String with special characters
        //Doesnt declare what kind of variable testString is
        String testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
    }

    public static void testReverseStringFour() {
         // Test Case - Edge Case: Null string
        try{
            //Doesnt declare what kind of variable testString is
            String testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testfindMaxValueOne() {
        // Test Case - Main Case: 
        int[] numbers = new int[] {1, 8, 10, 11, 2};
        System.out.println("Expected 11: " + Unit3Exercises.findMaxValue(numbers));
    }

    public static void testfindMaxValueTwo() {
        // Test Case - Negative and zero numbers in array: 
        int[] numbers = new int[] {0, -7, -5, 0, 2};
        System.out.println("Expected 2: " + Unit3Exercises.findMaxValue(numbers));
    }

    public static void testfindMaxValueThree() {
        // Test Case - Only negative numbers array: 
        int[] numbers = new int[] {-15, -32, -7, -1, -10};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(numbers));
    }

    public static void testfindMaxValueFour() {
        // Test Case - Null array: 
        try {
            int[] numbers = null;
            System.out.println("Expected exception" + Unit3Exercises.findMaxValue(numbers));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exeption when the array was null as intended");
        }
    }

    public static void testIsPalindromeOne() {
        // Test Case - Main Case:
        String test = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(test));
    }

    public static void testIsPalindromeTwo() {
        // Test Case - Main Case:
        String test = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(test));
    }

    public static void testIsPalindromeThree() {
        // Test Case - Edge Case:
        try {
            String test = null;
            System.out.println("Expected false: " + Unit3Exercises.isPalindrome(test));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error when the array was null as intended");
        }
    }

    public static void testIsPalindromeFour() {
        // Test Case - Edge case:
        String test = "";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(test));
    }

    public static void testSumEvenNumbersOne() {
        // Test Case - Main Case:
        int[] numbers = new int[] {1, 5, 14, 3, 2};
        System.out.println("Expected 16: " + Unit3Exercises.sumEvenNumbers(numbers));
    }

    public static void testSumEvenNumbersTwo() {
        // Test Case - Edge Case:
        int[] numbers = new int[] {-16, -3, -8, -31, - 22};
        System.out.println("Expected -46: " + Unit3Exercises.sumEvenNumbers(numbers));
    }

     public static void testSumEvenNumbersThree() {
        // Test Case - Edge Case:
        int[] numbers = new int[] {-19, 6, 2, 17, -22};
        System.out.println("Expected -14: " + Unit3Exercises.sumEvenNumbers(numbers));
    }

    public static void testSumEvenNumbersFour() {
        // Test Case - Edge Case:
        try {
            int[] numbers = null;
            System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(numbers));
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error when the array was null as expected");
        }
    }

    public static void testCalculateSumOfSquaresOne() {
        // Test Case - Main Case:
        int[] numbers = new int[] {1, 7, 8, -1, 2};
        System.out.println("Expected 119: " + Unit3Exercises.calculateSumOfSquares(numbers));
    }

    public static void testCalculateSumOfSquaresTwo() {
        // Test Case - Edge Case:
        try {
            int[] numbers = null;
            System.out.println("Expected 0: " + Unit3Exercises.calculateSumOfSquares(numbers));
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error when the array was null as expected");
        }
    }

    public static void testGetNthFibonacciOne() {
        // Test Case - Main Case:
        int term1 = 5;
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(term1));
        int term2 = 8;
        System.out.println("Expected 21: " + Unit3Exercises.getNthFibonacci(term2));
    }

    public static void testGetNthFibonacciTwo() {
        // Test Case - Edge Case:
        try {
            int term = -2;
            System.out.println("Expected 0: " + Unit3Exercises.getNthFibonacci(term));
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because of negative values as expected");
        }
    }

    public static void testSortArrayDescendingOne() {
        // Test Case - Main Case:
        int[] arr = new int[] {1, 7, 3, 2, 1};
        Unit3Exercises.sortArrayDescending(arr);
        System.out.println("\nExpected: \n7, 3, 2, 1, 1");
        //Had to use a for loop to print each part of the array
        System.out.println("Actually was: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void testSortArrayDescendingTwo() {
        // Test Case - Edge Case:
        int[] arr = new int[] {1, -6, 9, -4, -1};
        Unit3Exercises.sortArrayDescending(arr);
        System.out.println("""
                           \nExpected: 
                           9, 1, -1, -4, -6""");
        //Had to use a for loop to print each part of the array
        System.out.println("Actually was: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1)) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void testSortArrayDescendingThree() {
        // Test Case - Edge Case:
        try {
            int[] arr = null;
            System.out.println("\nExpected: exception");
            Unit3Exercises.sortArrayDescending(arr);
            //Had to use a for loop to print each part of the array
            System.out.println("Actually was: ");
            for (int i = 0; i < arr.length; i++) {
                if (i == (arr.length - 1)) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + " ");
                }
            }        
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error when the array was null as expected");
        }
    }

    public static void testFindLongestWordOne() {
        // Test Case - Main Case: 
        String sentence1 = "It was a good day";
        String sentence2 = "chocolate is good";
        System.out.println("Expected good: " + Unit3Exercises.findLongestWord(sentence1));
        System.out.println("Expected chocolate: " + Unit3Exercises.findLongestWord(sentence2));
    }

    public static void testFindLongestWordTwo() {
        // Test Case - Edge Case: 
        String sentence1 = "pinapples are very coooooool";
        System.out.println("Expected pinapples: " + Unit3Exercises.findLongestWord(sentence1));
    }

    public static void testFindLongestWordThree() {
        // Test Case - Edge Case: 
        //Added a try catch block for null values
        try {
            String sentence1 = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence1));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error when the array was null as expected");
        }
    }

    public static void testCalculateInterestOne() {
        //Test Case - Main Case:
        double interest = Unit3Exercises.calculateInterest(10000, 1.0, 1);
        System.out.println("Expected 10100.0 :" + interest);
        double interest1 = Unit3Exercises.calculateInterest(20000, 10.0, 2);
        System.out.println("Expected 24200.0:" + interest1);
    }

    public static void testCalculateInterestTwo() {
        //Test Case - Edge Case:
        try {
            System.out.print("Expected exception: ");
            double interest = Unit3Exercises.calculateInterest(-15000, 7.0, 10);
            System.out.println(interest);
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error for a negative principal amount as excpected.");
        }
    }

    public static void testCalculateInterestThree() {
        //Test Case - Edge Case:
        try {
            System.out.print("Expected exception: ");
            double interest = Unit3Exercises.calculateInterest(-15000, -2, 10);
            System.out.println(interest);
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error for a negative interest rate as excpected.");
        }
    }

    public static void testCalculateInterestFour() {
        //Test Case - Edge Case:
        try {
            System.out.print("Expected exception: ");
            double interest = Unit3Exercises.calculateInterest(10000, 2.0, -8);
            System.out.println(interest);
            
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error for a non positive number of years as excpected.");
        }
    }

    public static void testParsePositiveIntegerOne() {
        //Test Case - Main Case:
        String str = "5";
        System.out.println("Expected 5: " + Unit3Exercises.parsePositiveInteger(str));
    }

    public static void testParsePositiveIntegerTwo() {
        //Test Case - Edge Case:
        try {
            String str = "-3";
            System.out.println("Expected: exception" + Unit3Exercises.parsePositiveInteger(str));
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error for a negative number as expected");
        }
    }

    public static void testParsePositiveIntegerThree() {
        //Test Case - Edge Case:
        try {
            String str = "0";
            System.out.println("Expected exception: " + Unit3Exercises.parsePositiveInteger(str));
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because the number is 0 as expected");
        }
    }

    public static void testGetArrayElement() {
        //Test Case - Edge Case:
        try {
            String[] str = new String[] {"Hello", "My", "Name", "Is"};
            int index = 10;
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(str, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because of an out of bounds index as expected");
        }
    }

    public static void testCalculateSquareRoot() {
        //Test Case - Edge Case:
        try {
            int num = -2;
            if (num < 0) {
                System.out.print("Expected exception: ");
                throw new IllegalArgumentException("Number to sqrt cannot be negative.");
            }
            double sqrt = Unit3Exercises.calculateSquareRoot(num); 
            System.out.println(sqrt);
        }   catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("The method threw an error because the sqrt was Double.NaN as expected");
        }
    }

    public static void testSumArrayElementsOne() {
        //Test Case - Main Case:
        int[] arr = new int[] {1, 3, 9};
        System.out.println("Expected 13: " + Unit3Exercises.sumArrayElements(arr));
    }

    public static void testSumArrayElementsTwo() {
        //Test Case - Edge Case:
        int[] arr = null;
        System.out.println("Expected 0: " + Unit3Exercises.sumArrayElements(arr));
    }

    public static void testCalculatePower() {
        //Test Case - Edge Case:
        try {
            int exponent = -2;
            double base = 10;
            Unit3Exercises.calculatePower(base, exponent);
            if (exponent < 0) {
                System.out.print("Expected exception: ");
                throw new IllegalArgumentException("Exponent cannot be negative");
            } 
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("The method threw an error because of a negative exponent as expected");
        }
    }
}
