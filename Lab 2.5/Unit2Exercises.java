public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        // to-do: implement this method
        if (day != 6 && day != 0) {
            if (vacation) {
                return "10:00";
            } else {
                return "7:00";
            }
        } else {
            if (vacation) {
                return "off";
            } else {
                return "10:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.equals("")) {
            return str;
        }
        int endNum = str.length() - 1;
        if (str.charAt(0) == 'f') {
            if (str.charAt(endNum) == 'b') {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (str.charAt(endNum) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String doubleString = "";
        for (int i = 0; i < str.length(); i++) {
            doubleString = doubleString + str.charAt(i) + str.charAt(i);
        }
        return doubleString;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h') {
                if (str.charAt(i + 1) == 'i') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                cat++;
            }
            if (sub.equals("dog")) {
                dog++;
            }
        }
        return (cat == dog);
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        int alength = a.length();
        int blength = b.length();
        String bigString = "";
        if (alength <= blength) {
            for (int i = 0; i < alength; i++) {
                bigString = bigString + a.charAt(i);
                bigString = bigString + b.charAt(i);
            }
            if (alength != blength) {
                String restOfLetters = b.substring(blength - (blength - alength));
                bigString = bigString + restOfLetters;
            }
        } else {
            for (int i = 0; i < blength; i++) {
                bigString = bigString + a.charAt(i);
                bigString = bigString + b.charAt(i);
            }
            if (alength != blength) {
                String restOfLetters = a.substring(alength - (alength - blength));
                bigString = bigString + restOfLetters;
            }
        }
        return bigString;
    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        String sub = str.substring(str.length() - n);
        String totalSubs = "";
        for (int i = 0; i < n; i++) {
            totalSubs = totalSubs + sub;
        }
        return totalSubs;
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        if (a.length() <= b.length()) {
            String endingB = lowerB.substring(b.length() - a.length());
            if (endingB.equals(lowerA)) {
                return true;
            }
        }
        if (b.length() < a.length()) {
            String endingA = lowerA.substring(a.length() - b.length());
            if (endingA.equals(lowerB)) {
                return true;
            }
        }
        return false;
    }

    public static int countCode(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c') {
                String sub = str.substring(i, i + 2);
                char checkE = str.charAt(i + 3);
                if (sub.equals("co") && checkE == 'e') {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int large = Math.max(nums[i], nums[i + 1]);
            if (large > max) {
                max = large;
            }
            int small = Math.min(nums[i], nums[i + 1]);
            if (small < min) {
                min = small;
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i = nums.length;
            } else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        if (n == 0) {
            return new int[0];
        }
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
    
    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (i == 0) {
                    if (nums[i + 1] == 3) {
                        return false;
                    } else {
                        count++;
                    }
                } else if (i != 0 && i != nums.length - 1) {
                    if (nums[i - 1] == 3 || nums[i + 1] == 3) {
                        return false;
                    } else {
                        count++;
                    }
                } else {
                    if (nums[i - 1] == 3) {
                        return false;
                    } else {
                        count++;
                    }
                }
            }
        }
        return count == 3;
    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        if (n == 0) {
            return new String[0];
        }
        String[] newArray = new String[n];
        for (int i = 0; i < n; i++) {
            String stringOfInt = String.valueOf(i);
            newArray[i] = stringOfInt;
        }
        return newArray;
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
        }
        int[] nonZeros = new int[nums.length - zeros];
        int m = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                nonZeros[m] = nums[k];
                m++;
            }
        }
        int s = 0;
        int[] correctArray = new int[nums.length];
        for (int n = 0; n < correctArray.length; n++) {
            if (n < zeros) {
                correctArray[n] = 0;
            } else {
                correctArray[n] = nonZeros[s];
                s++;
            }
        }
        return correctArray;

    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        int num = 0;
        for (String word : words) {
            if (word.equals(target)) {
                num++;
            }
        }
        String[] nonTargetWords = new String[words.length - num];
        int m = 0;
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].equals(target))) {
                nonTargetWords[m] = words[i];
                m++;
            }
        }
        return nonTargetWords;
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        int average = sum / (scores.length / 2);
        return average;
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int firstAverage = average(scores, 0, scores.length / 2);
        int secondAverage = average(scores, scores.length / 2, scores.length);
        if (firstAverage > secondAverage) {
            return firstAverage;
        } else {
            return secondAverage;
        }
    }


    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        boolean isIncreasing = false;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i + 1]) {
                isIncreasing = true;
            } else {
                isIncreasing = false;
                break;
            }
        }
        return isIncreasing;
        
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        int firstMax = findSpecialScore(a);
        int secondMax = findSpecialScore(b);
        return (firstMax + secondMax);
    }

    public static int findSpecialScore(int[] scores) {
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0) {
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
        }
        return max;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        if (str.length() == 0) {
            return ("**");
        } else if (str.length() == 1) {
            return (str + "*");
        } else {
            return str.substring(0, 2);
        }
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        if (a >= b && b != 0) {
            return (double) a / b;
        } else if (b > a && a != 0) {
            return (double) b / a;
        } else {
            return 0.0;
        }
    }
}
