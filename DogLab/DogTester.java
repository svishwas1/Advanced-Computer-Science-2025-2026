public class DogTester {
    public static void main(String[] args) {
        Dog snoopy = new Dog();
        Dog orion = new Dog("Orion", "MushMush", 7, 369);
        Dog kulfi = new Dog("Kulfi", "Nidhi", 5, 487);
        
        //Testing getters on snoopy
        snoopy.getName();
        snoopy.getOwnerName();
        snoopy.getAge();
        snoopy.getDogId();
        snoopy.isStillInFacility();

        //Testing setters on snoopy
        snoopy.setName("Snoopy");
        snoopy.setAge(2);
        System.out.println("New name is " + snoopy.getName());
        System.out.println("New age is " + snoopy.getAge());

        //Testing getters on Orion
        orion.getName();
        orion.getOwnerName();
        orion.getAge();
        orion.getDogId();
        orion.isStillInFacility();

        //Testing setters on orion
        orion.setOwnerName("Mushi");
        orion.setDogId(123);
        System.out.println("New name is " + orion.getOwnerName());
        System.out.println("New dog id " + orion.getDogId());

        //Testing getters on kulfi 
        kulfi.getName();
        kulfi.getOwnerName();
        kulfi.getAge();
        kulfi.getDogId();
        kulfi.isStillInFacility();

        //Testing setters on kulfi
        kulfi.setDogId(693);
        kulfi.setAge(6);
        
        //Printing orion's dog character
        //Dog character is static
        char orionCharacter = Dog.generateDogChar(orion.getDogId());
        System.out.println("Orion's dog character " + orionCharacter);

        //Printing kulfi's dog character
        //Dog character is static
        char kulfiCharacter = Dog.generateDogChar(kulfi.getDogId());
        System.out.println("Kulfi's dog character " + kulfiCharacter);

        //Printing orion's dog tag
        String orionTag = orion.generateDogTag();
        System.out.println("Orion's dog tag " + orionTag);

        //Printin kulfi's dog tag
        String kulfiTag = kulfi.generateDogTag();
        System.out.println("Kulfi's dog tag " + kulfiTag);

        //Calling to string for each dog 
        System.out.println(orion.toString());
        System.out.println(snoopy.toString());
        System.out.println(kulfi.toString());

        //Testing equals method should return (false)
        System.out.println("Does Orion equal Snoopy? " + orion.equals(snoopy));

        //Testing equals method should return (true)
        Dog copySnoopy = new Dog("Snoopy", "Shriya", 2, 156);
        System.out.println("Does Snoopy copy equal snoopy? " + snoopy.equals(copySnoopy));

        //Testing to string when not in facility
        kulfi.setStillInFacility(false);
        System.out.println("Kulfi's New To String\n" + kulfi.toString());


        System.out.println("\n");


        //Testing out out static method generate Dog Character
        //Should return 'L' for first one
        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.generateDogChar(456));
        System.out.println(Dog.generateDogChar(789));

        //Creating new dog named doggy with following attributes
        Dog doggy = new Dog("Doggy", "Maria", 2, 597);
        
        //Testing static pickup method with doggy should say dog is picked up
        //Also should change in facility to be false
        System.out.println(Dog.pickup(doggy, "Maria"));
        System.out.println("Is the dog in the facility? " + doggy.isStillInFacility()); 

        //Testing static pick up method with doggy should not allow pick up
        //Also should change in facility to be true
        System.out.println("\n" + Dog.pickup(doggy, "John"));
        System.out.println("Is the dog in the facility? " + doggy.isStillInFacility()); 

        //Creating a new dog object whose attribute still in facility is set to false
        Dog rover = new Dog("Rover", "Britney", 1, 978);
        rover.setStillInFacility(false);
        
        //Testing static method checkIn
        Dog.checkIn(rover, "Olivia");

        //Verifying that in facility right now
        System.out.println("\nIs rover in the facility now? " + rover.isStillInFacility());

        //Verifying that the owner name has changed
        System.out.println("The new owner for rover is: " + rover.getOwnerName());
    }
}
