

public class Practice {
    int value;

    public Practice(int v) {
        this.value=v;
    }
    
    public static void main(String[] args) {
        int i = 10;
        String name = "364684";
        Integer integer = Integer.valueOf(i);
        System.out.println(integer);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf(5);

        int x = num1.intValue();
        Integer y = Integer.parseInt("500");

        System.out.println(num1.compareTo(num2));
        System.out.println(num2.compareTo(num1));
        System.out.println(num3.compareTo(num2));

        System.out.println(Integer.parseInt(name));
        String intToString = y.toString();
        System.out.println(intToString);

        System.out.println(num1.compareTo(8));
        
        int j = 0;
        do {
            System.out.println("Yay");

        } while (j != 0);

        while (j < 1) {
            System.out.println("Good");
            j++;
        }
    }
}