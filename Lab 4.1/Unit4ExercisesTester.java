public class Unit4ExercisesTester {
    public static void main(String[] args) {
        
        //Testing matchEndSequences
        int[] a1 = new int[] {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(a1, 1));
        int[] a2 = new int[] {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(a2, 2));
        int[] a3 = new int[] {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Unit4Exercises.matchingEndSequences(a3, 3));

        //Testing hasThreeConsecutive
        int[] arr1 = new int[] {2, 1, 3, 5};
        System.out.println(Unit4Exercises.hasThreeConsecutive(arr1));
        int[] arr2 = new int[] {2, 1, 2, 5};
        System.out.println(Unit4Exercises.hasThreeConsecutive(arr2));
        int[] arr3 = new int[] {2, 4, 2, 5};
        System.out.println(Unit4Exercises.hasThreeConsecutive(arr3));

        //Testing generateNumberSequence
        int[] newArr1 = Unit4Exercises.generateNumberSequence(5, 10);
        Unit4Exercises.displayInt(newArr1);
        int[] newArr2 = Unit4Exercises.generateNumberSequence(11, 18);
        Unit4Exercises.displayInt(newArr2);
        int[] newArr3 = Unit4Exercises.generateNumberSequence(1, 3);
        Unit4Exercises.displayInt(newArr3);

        //Testing fizzBuzz
        String[] newArr4 = Unit4Exercises.fizzBuzz(1, 6);
        Unit4Exercises.displayString(newArr4);
        String[] newArr5 = Unit4Exercises.fizzBuzz(1, 8);
        Unit4Exercises.displayString(newArr5);
        String[] newArr6 = Unit4Exercises.fizzBuzz(1, 11);
        Unit4Exercises.displayString(newArr6);

        //Testing moveEvenBeforeOdd
        int[] newArr7 = new int[] {1, 0, 1, 0, 0, 3, 1};
        int[] formatted = Unit4Exercises.moveEvenBeforeOdd(newArr7);
        Unit4Exercises.displayInt(formatted);

        int[] newArr8 = new int[] {3, 3, 2};
        int[] formatted1 = Unit4Exercises.moveEvenBeforeOdd(newArr8);
        Unit4Exercises.displayInt(formatted1);

        int[] newArr9 = new int[] {2, 2, 2};
        int[] formatted2 = Unit4Exercises.moveEvenBeforeOdd(newArr9);
        Unit4Exercises.displayInt(formatted2);
    }

}
