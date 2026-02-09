public class AnimalTester {
    public static void main(String[] args) {
        Dolphin dolphy = new Dolphin("Dolphy", "Ocean", "Seaweed", 100, true, 300, false, true);
        System.out.println(dolphy.toString());
        dolphy.needsFood();

        Lion lion = new Lion();
        System.out.println(lion.toString());
        lion.saveLions();
         
    }


}
