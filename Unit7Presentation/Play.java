
import java.util.ArrayList;

public class Play {
    public static void main(String[] args) {
        StartRoom.intro();
        ArrayList<GameTask> tasks = new ArrayList<> ();
        Decoder decode = new Decoder();
        tasks.add(decode);
        Anagram anagram = new Anagram();
        tasks.add(anagram);
        Prime prime = new Prime();
        tasks.add(prime);

        for (GameTask task : tasks) {
            task.setUp();
            task.play();
        }
        System.out.println("You have escaped!");
    }
}
