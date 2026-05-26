import java.util.ArrayList;
import java.util.Scanner;

public class Anagram extends GameTask{
    private String [] anagrams1 = {"edits", "diets", "deist", "paper", "sited", "bite"};
    private String correct = "tides";
    private int num;


    public void setUp() {
        num = numAnagrams();
    }
    
    public boolean padlock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Padlock:");
        int input = scanner.nextInt();
        if (input == num) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong");
        return false;
    }

    public void play() {
        System.out.println("You have made it to the second room but theres still two to go");
        System.out.println("In this room you notice on the wall a list of words: ");
        
        for (int i = 0; i < anagrams1.length; i++) {
            System.out.println(anagrams1[i]);
        }
        System.out.println("You have another padlock here, but this one only requires one number: ");
        if (padlock()) {
            return;
        } else {
            padlock();
        }
    }

    public int numAnagrams() {
        int numAnagrams = 0;
        for (int i = 0; i < anagrams1.length; i++) {
            String sorted = sort(anagrams1[i]);
            if (sorted.equals(sort(correct))) {
                numAnagrams++;
            }
        }
        return numAnagrams;

    }

    public static String sort(String unsorted) {
        String lowerWord = unsorted.toLowerCase();
        ArrayList<Character> letters = new ArrayList<>();
        for (int j = 0; j < lowerWord.length(); j++) {
            letters.add(lowerWord.charAt(j));
        }

        for (int i = 0; i < letters.size(); i++) {
            int lowerIndex = i;
            for (int k = i+1; k < letters.size(); k++) {
                if (letters.get(k) < letters.get(lowerIndex)) {
                    lowerIndex = k;
                }
            }
            char holder = letters.get(lowerIndex);
            letters.set(lowerIndex, letters.get(i));
            letters.set(i, holder);
        }
        
        String sorted = "";
        for (int m = 0; m < letters.size(); m++) {
            sorted = sorted + letters.get(m);
        }
        return sorted;
    }
    
}
