public class Unit2ExercisesTester {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1};
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }
        System.out.println(" ");
        int[] zeros = (Unit2Exercises.zeroFront(nums));
        for (int i = 0; i < zeros.length; i++) {
            System.out.println(zeros[i]);
        }
        String[] words = {"hi", "bye", "hi"};
        String target = "bye";
        String[] wordsWithout = (Unit2Exercises.wordsWithout(words, target));
        for (String wordsWithout1 : wordsWithout) {
            System.out.println(wordsWithout1);
        }
        int[] threes = {3, 1, 3, 1, 3};
        System.out.println(Unit2Exercises.haveThree(threes));

        int[] scores = {100, 50};
        System.out.println(Unit2Exercises.scoresAverage(scores));
    }
}
