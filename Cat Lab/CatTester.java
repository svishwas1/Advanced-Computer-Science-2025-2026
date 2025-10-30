public class CatTester {
    public static void main(String[] args) {
        Cat newCat = new Cat("Kitty", "Chetana", 8, "7890");

        //Printing all the values of instance variables
        System.out.println(newCat.getName()
            + newCat.getOwnerName()
            + "\n" + newCat.getMoodLevel()
            + "\n" + newCat.getCatId()
            + "\n" + newCat.getCatChar()
            + "\n" + newCat.isHungry());
        //Finding Cat Char
        System.out.println(newCat.getCatChar());
        
        //Updating all instance variables with setters
        newCat.setName("Kit Kat");
        newCat.setOwnerName("Shriya");
        newCat.setMoodLevel(2);
        newCat.setCatId("1873");
        newCat.setCatChar('S');
        newCat.setHungry(false);

        //Reprinting all the values of instance variables
        System.out.println(newCat.getName()
            + "\n" + newCat.getOwnerName()
            + "\n" + newCat.getMoodLevel()
            + "\n" + newCat.getCatId()
            + "\n" + newCat.getCatChar()
            + "\n" + newCat.isHungry());
        //Printing new Cat Char
        System.out.println(newCat.getCatChar());
        
        //Creating new cat object
        Cat secondCat = new Cat("Kitty", "Chetana", 8, "7890");
        
        //Checking if the first cat object equals the second cat object
        System.out.println(newCat.equals(secondCat));

        //Verifying bootUp method with the cat object
        PurrfectUtils.bootUp(secondCat);

        //Testing pet method with the cat object
        PurrfectUtils.pet(secondCat);

        //Using a for loop to loop 4 times and test trim claws
        for (int i = 1; i <= 4; i++) {
            PurrfectUtils.trimClaws(secondCat);
        }

        //Testing cleanlitterBox method
        PurrfectUtils.cleanLitterBox(secondCat);

        //Testing feed method
        PurrfectUtils.feed(secondCat);

        //Creating a new object with a no parameter constructor and calling its toString
        Cat thirdCat = new Cat();
        System.out.println(thirdCat.toString());
        
    }
}
