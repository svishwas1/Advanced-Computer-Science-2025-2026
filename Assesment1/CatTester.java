public class CatTester {
    public static void main(String[] args) {
        //Added new Cat(String, String) for next two lines instead of just Cat(String, String)
        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        //Added System.out.println here
        System.out.println("My Cat's Name: " + myCat.getName());

        //Changed from return to System.out.println
        System.out.println("Are the cat's equal? " + myCat.equals(otherCat));

        //changed print to System.out.println
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());

        String firstName = "Tiger";
        //Changed lastName == "Beast" to = "Beast"
        String lastName = "Beast";
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}