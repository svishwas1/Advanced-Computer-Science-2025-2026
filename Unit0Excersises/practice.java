public class practice {
    private int one = 4, two = 3, total;

    public static void main(String args[]) {
        practice test = new practice();
        test.add();
        test.print();
    }

    public void add() {
        int total = one + two;
    }

    public void print() {
        System.out.println(total);
    }
}
