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
        /* 
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
        for(int i = 1; i < 15; i = i+3) {      
            System.out.println(i);
        }
        for(int j = 11; j > -2; j = j-2) {      
            System.out.println(j);
        }

        for(int s = 20; s < 40; s = s+3) {      
            System.out.println(s);
        }

        for(int k = 30; k > 0; k -= 4) {      
            System.out.println(k);
        }

        int total=0;
        for(int c = 1; c < 15; c++) {      
            total = total+c;
        } 
        System.out.println(total);

        for(int v = 1; v <= 2; v++)
            for(int g = 1; g < 4; g++)
                System.out.println(g + v);

        int complete = 0;
        for(int h = 1; h < 5; h++) {
        for(int f = 1; f <= h; f++)
            complete = complete + f;
        }
        System.out.println(complete);

        String s = "toad";
        for(int e = 0; e < s.length(); e++) { 
            for(int f = 0;f <= e;f++) {
                        char c = s.charAt(f);
                System.out.print(c);
            }
        System.out.println();
        }

        int size = 5;
        for(int x = 0; x <= size; x++ ) {
            for(int y = x; y <= size; y++ )
                System.out.print(" ");				
            for(int z = x; z >= 0; z--)
                System.out.print("#");
            System.out.println();   
        }
        */

        double x = 0.1;
		double y = 0.2;
		double z = 0.3;

		double sum;
        boolean result;

        sum = x + y;
        System.out.println("Line 1: " + sum);

        sum = x + y;
        result = (sum == z);
        System.out.println("Line 2: " + result);

        sum = 0.1 + 0.2;
        System.out.println("Line 4: " + sum);

        sum = 2.0 / 3.0;
        sum *= 3.0;
        System.out.println("Line 7: " + sum);

    }
}
