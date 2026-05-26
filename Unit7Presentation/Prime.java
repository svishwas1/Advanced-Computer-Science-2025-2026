import java.util.Scanner;

public class Prime extends GameTask{
    private int[] numbers = {4, 3, 10, 2, 1, 9};
    private int numberOfPrime;
    private int primeKey;

    public void setUp() {
        numberOfPrime = countPrime();
        primeKey = prime();

    }

     public boolean padlock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Padlock:");
        int input = scanner.nextInt();
        if (input == primeKey) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong");
        return false;
    }

    public void play() {
        System.out.println("Congrats! You're almost there, you have entered the third room");
        System.out.println("In this room, there are the control panels for the submarine, each reading a different number");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("This is your final padlock it only requires a " + numberOfPrime + " digit number");
        if (padlock()) {
            return;
        } else {
            padlock();
        }
    }

    public int countPrime() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        return count;
    }

    public int prime() {
        String pnum = "";
        
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                pnum = pnum + numbers[i];
            } 
        }
        System.out.println(pnum);
        return Integer.parseInt(pnum);

    }

    public boolean isPrime(int num) {
        if (num == 1 || num == 2) {
            return true;
        }

        for (int i = 2; i < num; i ++) {
            if (num % i == 0) {
                //System.out.println(num);
                return false;
            }
        }
        return true;
    }

}
