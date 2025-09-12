public class Unit0Exercises {
    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        // sleepIn(true, false) -> true
        System.out.println(obj.sleepIn(true, false));
        // sleepIn(false, true) -> true
        System.out.println(obj.sleepIn(false, true));

        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
        // diff21(10) -> 11
        System.out.println(obj.diff21(10));
        // diff21(21) -> 0
        System.out.println(obj.diff21(21));

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        // flooringCalculator(0, 3.0) -> 0.0
        System.out.println(obj.flooringCalculator(0, 3.0));
        // flooringCalculator(100, -1.5) -> 0.0
        System.out.println(obj.flooringCalculator(100, -1.5));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;
        } else if (weekday) {
            return false;
        } else {
            return true;
        }
    }

    public int diff21(int n) {
        if (n <= 21) {
            return Math.abs(n - 21);
        } else {
            return 2 * (Math.abs(n - 21));
        }
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        if (sqft <= 0 || pricePerSqft <= 0) {
            return 0.0;
        } else {
            return (sqft * pricePerSqft);
        }
    }

}
