
import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        intro();
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

    public static void intro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the escape room");
        System.out.println("Type \"More\" to find out the full story");
        System.out.println("\nBackground: While scubadiving off the coast of california when you see an old abandoned submarine");
        System.out.println("You go inside the submarine to look around, but the door locks behind you.");
        String input = scanner.nextLine();
        if (input.equals("More")) {
            System.out.println("Luckily you spot the blueprint of the submarine lying on the table.");
            System.out.println("It shows an escape jet at the back of three rooms");
            System.out.println("You have 10 minutes to get through each room to the esape jet before your oxygen runs out");
            System.out.println("good luck!");
        }
    } 

}
