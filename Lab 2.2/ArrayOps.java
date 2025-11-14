public class ArrayOps {
    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String individual = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                individual = individual + array[i];
            } else {
                individual = individual + array[i] + ", ";
            }
        }
        return "[" + individual + "]"; 
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String contents = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                contents = contents + array[i];
            } else {
                contents = contents + array[i] + ", ";
            }   
        }
        return "[" + contents + "]";
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        int i = 0;
        while (array[i] == null && i < array.length) {
            i++;
        }
        String highestStarting = array[i];
        for (int m = 0; m < array.length; m++) {
            if (array[m] != null) {
                if (array[m].length() > highestStarting.length()) {
                    highestStarting = array[m];
                }
            }
        }
        return highestStarting;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        int nullElements = 0;
        if (array == null) {
            //return 0.0;
        }
        int totalLength = 0;
        int numOfItems = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                totalLength += array[i].length();
                numOfItems++;
            } else {
                nullElements++;
                totalLength += 0;
            }
        }
        if (nullElements == array.length) {
            numOfItems = array.length;
        }
        double average = (double) totalLength / numOfItems;
        return average;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        if (input == null) {
            int[] emptyArray = new int[0];
            return emptyArray;
        }
        int[] frequencies = new int[26];
        int occurences = 0;
        int counter = 0;
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < input.length(); j++) {
                int charValue = (int) input.charAt(j);
                if (charValue == i || charValue == i - 32) {
                    occurences++;
                }
            }
            frequencies[counter] = occurences;
            occurences = 0;
            counter++;
        }
        return frequencies;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i >= index && i != array.length - 1) {
                newArray[i] = array[i + 1];
            } else {
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            int[] emptyArray = new int[0];
            return emptyArray;
        }
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            String[] empty = new String[0];
            return empty;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i] = "#" + i + " " + array[i];
            }
        }
        return array;
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            int[] nothingArray = new int[0];
            return nothingArray;
        }
        int counter = 0;
        int[] newArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[counter] = array[i];
            counter++;
        }
        return newArray;
    }

}
