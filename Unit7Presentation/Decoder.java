import java.util.ArrayList;
import java.util.Scanner;

public class Decoder extends GameTask{
    private  String originalWord = "tides";
    private  int numVowels = 0;
    private  String key1 = "";
    private String decodedWord = "";

    public Decoder() {

    }

    public void setUp() {
        decodedWord = decode();
    }

    public boolean padlock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Packlock:");
        String input = scanner.nextLine();
        if (input.equals(key1)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong");
        return false;
    }

    public void play() {
        System.out.println("You are still in the first room where you found the blue prints");
        System.out.println("But you notice a letter on the desk and it has only one thing written on it: ");
        System.out.print(decodedWord);
        System.out.println("You also see a padlock on the door that needs" + numVowels + "letters");
        if (padlock()) {
            return;
        } else {
            padlock();
        }
    }


    public String decode() {
        String decoded = "";
        String key = "";
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < originalWord.length(); i++) {
            if (vowels.contains(originalWord.charAt(i))) {
                decoded = decoded + "🔺";
                numVowels++;
                key = key + originalWord.charAt(i);
            } else {
                decoded = decoded + originalWord.charAt(i);
            }

        }
        setKey1(key);
        return decoded;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }
    
    public int getNumVowels() {
        return numVowels;
    }

    public void setNumVowels(int numVowels) {
        this.numVowels = numVowels;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }
}
