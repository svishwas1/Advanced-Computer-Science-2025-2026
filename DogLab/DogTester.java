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
        char orionCharacter = PawesomeUtils.generateDogChar(orion.getDogId());
        System.out.println("Orion's dog character " + orionCharacter);

        //Printing kulfi's dog character
        //Dog character is static
        char kulfiCharacter = PawesomeUtils.generateDogChar(kulfi.getDogId());
        System.out.println("Kulfi's dog character " + kulfiCharacter);

        //Printing orion's dog tag
        String orionTag = PawesomeUtils.generateDogTag(orion.getDogId(), orionCharacter);
        System.out.println("Orion's dog tag " + orionTag);

        //Printin kulfi's dog tag
        String kulfiTag = PawesomeUtils.generateDogTag(kulfi.getDogId(), kulfiCharacter);
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
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(456));
        System.out.println(PawesomeUtils.generateDogChar(789));

        //Creating new dog named doggy with following attributes
        Dog doggy = new Dog("Doggy", "Maria", 2, 597);
        
        //Testing static pickup method with doggy should say dog is picked up
        //Also should change in facility to be false
        System.out.println(PawesomeUtils.pickup(doggy, "Maria"));
        System.out.println("Is the dog in the facility? " + doggy.isStillInFacility()); 

        //Testing static pick up method with doggy should not allow pick up
        //Also should change in facility to be true
        System.out.println("\n" + PawesomeUtils.pickup(doggy, "John"));
        System.out.println("Is the dog in the facility? " + doggy.isStillInFacility()); 

        //Creating a new dog object whose attribute still in facility is set to false
        Dog rover = new Dog("Rover", "Britney", 1, 978);
        rover.setStillInFacility(false);
        
        //Testing static method checkIn
        PawesomeUtils.checkIn(rover, "Olivia");

        //Verifying that in facility right now
        System.out.println("\nIs rover in the facility now? " + rover.isStillInFacility());

        //Verifying that the owner name has changed
        System.out.println("The new owner for rover is: " + rover.getOwnerName());

        //Testing validate dog id with valid input
        System.out.println(PawesomeUtils.validateDogId(868));
        //Testing validate dog id with a non valid input, should return valid id #
        System.out.println(PawesomeUtils.validateDogId(78373837));

        //Testing validate dog tag with 3 new dogs
        Dog d1 = new Dog("pupitto", "Shriya", 5, 989);
        PawesomeUtils.validateDogId(d1.getDogId());

        Dog d2 = new Dog("tomato", "potoato", 4, 156);
        PawesomeUtils.validateDogId(d2.getDogId());

        Dog d3 = new Dog("fluffy", "muffy", 3, 321);
        PawesomeUtils.validateDogId(d3.getDogId());

        //Testing converting dog age to human years for 3 new dogs
        Dog doggy1 = new Dog("Doggy1", "Owner1", 1, 749);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(doggy1));

        Dog doggy2 = new Dog("Doggy2", "Owner2", 2, 839);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(doggy2));

        Dog doggy3 = new Dog("Doggy3", "Owner3", 5, 908);
        System.out.println(PawesomeUtils.convertAgeToHumanAge(doggy3));

        //Tetsing converting human age to dog age for 3 human ages
        System.out.println(PawesomeUtils.convertAgeToDogYears(15));
        System.out.println(PawesomeUtils.convertAgeToDogYears(24));
        System.out.println(PawesomeUtils.convertAgeToDogYears(49));
    }
}
