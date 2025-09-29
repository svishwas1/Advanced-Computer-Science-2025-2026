public class practice {
    private int one = 4, two = 3, total;


    public static void main(String args[]) {
        practice test = new practice();
        test.add();
        test.print();
        int a = 5;
        int b = 2;
        System.out.println('a' * (a+b));
        System.out.println(1%5);
        System.out.println('a'/5);
        double x = 7;
        System.out.println(a/x);
        double z = 123.456;
        System.out.println(z % 120);
        double k;
        int v = 5;
        int y = 2;
        k = v/y;
        System.out.println(k);
    }

    public void add() {
        int total = one + two;
    }

    public void print() {
        System.out.println(total);
    }
}
