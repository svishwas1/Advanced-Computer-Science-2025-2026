import java.util.Scanner;

//import java.util.Timer;

public class StartRoom {
    //Timer timer = new Timer();
    public static void intro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the escape room");
        System.out.println("Type \"More\" to find out the full story");
        System.out.println("Background: ");
        System.out.print("While scubadiving off the coast of california when you see an old abandoned submarine");
        System.out.println("You go inside the submarine to look inside, but the door locks behind you.");
        String input = scanner.nextLine();
        if (input.equals("more")) {
            System.out.println("Luckily you spot the blueprint of the submarine lying on the table.");
            System.out.println("It shows an escape jet at the back of three rooms");
            System.out.println("Now you have 10 minutes to get to the esape jet before your oxygen runs out");
            System.out.println("good luck!");
        }
    } 


}
