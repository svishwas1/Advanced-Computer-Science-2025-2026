public class Unit4Exercises {
    public static boolean matchingEndSequences(int[] arr, int n) {
        if (n == 0) {
            return true;
        }
        int[] forward = new int[n];
        int[] backward = new int[n];
        for (int i = 0; i < n; i++) {
            forward[i] = arr[i];
            backward[i] = arr[arr.length - (n - i)];
        }
        for (int i = 0; i < forward.length; i++) {
            if (!(forward[i] == backward[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean hasThreeConsecutive(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
                if (even == 3) {
                    return true;
                }
            } else {
                even = 0;
                odd++;
                if (odd == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] generateNumberSequence(int start, int end) {
        int[] arr = new int[end - start];
        for (int i = 0; i < (end - start); i++) {
            arr[i] = start + i;
        }
        return arr;
    }

    public static void displayInt(int[] newArr1) {
        System.out.print("[");
        for (int i = 0; i < newArr1.length; i++) {
            if (i == newArr1.length - 1) {
                System.out.print(newArr1[i]);
            } else {
                System.out.print(newArr1[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println(" ");
    }

    public static void displayString(String[] newArr1) {
        System.out.print("[");
        for (int i = 0; i < newArr1.length; i++) {
            if (i == newArr1.length - 1) {
                System.out.print(newArr1[i]);
            } else {
                System.out.print(newArr1[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println(" ");
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];
        for (int i = 1; i < end - start + 1; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    arr[i - 1] = "FizzBuzz";
                } else {
                    arr[i - 1] = "Buzz";
                }
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        return arr;
    }

    public static int[] moveEvenBeforeOdd(int[] arr) {
        int[] sorted = new int[arr.length];
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0 && (arr[j] % 2 == 0)) {
                    sorted[count] = arr[j];
                    count++;
 
                } else if (i == 1 && (arr[j] % 2 != 0)) {
                    sorted[count] = arr[j];
                    count++;
                }
            }
        }
        return sorted;
    }

}