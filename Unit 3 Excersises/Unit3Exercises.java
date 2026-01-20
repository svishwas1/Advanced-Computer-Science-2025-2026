public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) {
            throw new NullPointerException("Cannot input null array");
        }
        int sum = 0;
        int lengthSubtract = 0;
        // < strs.length does not go all the way through the array
        for (int i = 1; i <= strs.length; i++) {
            //Failed to check for a null value
            if (strs[i - 1] == null) {
                //Incorrectly adds the null value as part of strs.length
                lengthSubtract++;
            } else {
                sum += strs[i - 1].length();
                //If statement here should not be subtracting the sum
            }
        }
        //Should not be strs.length + 1 just strs.length 
        //Now if strs.length is 0 there is nothing fixing the edge case 
        if ((strs.length - lengthSubtract) <= 0) {
            return 0.0;
        } else {
            return sum / (strs.length - lengthSubtract);
        }
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) {
            throw new NullPointerException("Cannot input null");
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            //Incorrectly sets the position directly to the right of chars to be the the left 
            //Instead should be setting just the right position to temp
            chars[right] = temp;
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]); 
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        //Does not check for null values 
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
        }
        int max = numbers[0];
        //The loop stops one before the end
        for (int i = 1; i <= numbers.length; i++) {
             //The loop starts with 1 not 0 so should be checked for numbers[i - 1]
            if (numbers[i - 1] > max) {
                max = numbers[i - 1];
            //Don't even need last if else statement
            } 
        }
        return max;
    }

     // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        //Does not check for null cases 
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            //Already subtracted 1 in the beggining for the right position incorrect index 
            char b = str.charAt(right);
            if (a != b) {
                //Do not need to check if the left value is even just return false
                return false;
            }
            left++;
            right--;
        }
        //Do not need to check if the length is divisible by three just return true
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        //Have to check for null values 
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        //Loop does not go all the way to the end
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                //Incorrectly adds the number of the one next to the even number 
                sum += numbers[i];
            //Do not need else statement because if it is not an even number don't do anything
            }
        }
        //Do not need this if statement - if teh sum is 0 then it is just 0
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        //There is no null case
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        //Loop incorrectly starts at the second item in the array
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        //Need a test cases for negative values 
        if (n <= 0) {
            throw new IllegalArgumentException("Cannot input negative numbers.");
        }
        if (n <= 1 && n > 0) {
            //Incorrectly returns n if the n is negative
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void sortArrayDescending(int[] arr) {
        //Need a null case 
        if (arr == null) {
            throw new NullPointerException("Cannot input null array");

        }
        for (int i = 0; i < arr.length; i++) {
            //Previously did not check the last value of the array 
            for (int j = i + 1; j < arr.length; j++) {
                //< has to be flipped around
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    //needs to set j to i value not the other way around
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        //Need to throw an exception if null
        if (sentence == null) {
            throw new NullPointerException("Cannot have null string as input");
        } 
        String[] words = sentence.split(" ");
        String longestWord = "";
        //Can simplify into a for each loop
        for (String word : words) {
            //Should be greater than not greater than or equals to 
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        //need to check for negative principal amounts, inerest rate and years
        if (principal < 0 || rate < 0 || years <= 0) {
            throw new IllegalArgumentException("Values cannot be negative");
        }
        for (int i = 0; i < years; i++) {

            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        //Need an if statement to check for and throw the exception
        if (number <= 0) {
            throw new NumberFormatException("1");
        }
        return number;
    }

    public static String getArrayElement(String[] arr, int index) {

        return arr[index];
    }

    public static double calculateSquareRoot(int number) {
        double sqrt =  Math.sqrt(number);
        return sqrt;
    }

    public static int sumArrayElements(int[] array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (NullPointerException e) {
            System.out.println(e.toString());
            return 0;
        }  
    }

    public static double calculatePower(double base, int exponent) {
         if (exponent < 0) {
                return 1;
            }
        return Math.pow(base, exponent);
    }
}
