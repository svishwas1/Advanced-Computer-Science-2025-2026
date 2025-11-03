public class WorksheetOne {
    /*

     || is the or operator 
     && is the and operator

     If it asks to check a condition when it gives you a boolean in the condition follow these rules
     
     true && false = false
     false && true = false
     false && false = false
     true && true = true

     true || true = true
     true || false = true
     false || true = true
     false || false = false

     Also remember that if you have a loop and you have a variable globally declared, it can be updated within the loop
     Although if you have a loop and you create a variable inside the loop, this variable will delete istelf after the loop finishes.

     *Just keep in mind as a note that if there is an else statement not connected through brackets:
     it will be connected to the previous if statement (floating else statement)


    
     */
    public static void main(String[] args) {
        int x = 5;
        if ((x > 0 && x < 4) || x % 2 == 1)
            x++;
        if ((x < 6 || x > 0) && true)
            x++;
        else
            x += 3;
        System.out.println(x);

        int a = 10;
        int b = 5;
        if ((a < b) && (b >= 5 || a <= 10)) 
            System.out.println("Condition 1");
        else if ((a > b && a % 2 == 0) || (b < 8 && b % 2 != 0))
            System.out.println("Condition 2");
        else
            System.out.println("Condition 3");
        
        boolean m = true;
        boolean y = false;
        boolean z = true;
        if ((m && y) || (!z && m))
            System.out.println("First");
        else if ((m || y) && (z || !m))
            System.out.println("Second");
        else
            System.out.println("Third");
        
        int num = 15;
        if ((num > 10 && num < 20) || (num % 3 == 0 && num % 5 == 0))
            System.out.println("Multiple of both 3 and 5");
        else if (num > 0 && (num % 2 == 0 || num % 3 == 0))
            System.out.println("Positive and divisible by 2 or 3");
        else
            System.out.println("None of the above");

        int value = 25;

        boolean flag = true;
        if (value % 5 == 0 && !flag)
            System.out.println("Path A");
        else if (value > 20 || (flag && value < 30))
            System.out.println("Path B");
        else if (value % 2 == 1)
            System.out.println("Path C");
        else
            System.out.println("Path D");
    }
}
