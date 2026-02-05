
import java.util.ArrayList;

public class Unit4 {
    public static void main(String[] args) {
        int[][] numbers = new int[][] {{1, 2, 3}, {1, 2, 3}};
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[0].length; c++) {
                System.out.print(numbers[r][c] + " ");
            }
            System.out.println();
        }

        ArrayList<String> trial = new ArrayList<>();
        trial.add("Shriya");
        trial.add("Grace");
        trial.add("Nicole");

       
        for (int i = 0; i < trial.size(); i++) {
            System.out.println(trial.get(i));
        }

        for (String name: trial) {
            System.out.println(name);
        }

        ArrayList<String> trial2;
        trial2 = trial;
        for (String thing : trial2) {
            System.out.println(thing);
        }

    }


}