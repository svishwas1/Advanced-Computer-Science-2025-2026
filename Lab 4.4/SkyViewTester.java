public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = new double[] {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
        SkyView sv = new SkyView(3, 2, scanned);
        
        //Testing toString
        System.out.println(sv.toString());

        //Testing equals method
        SkyView sv2 = new SkyView(3, 2, scanned);
        System.out.println(sv.equals(sv2));

        //Testing getAverage 
        System.out.println(sv2.getAverage(1, 2, 0, 1));
    }
}
