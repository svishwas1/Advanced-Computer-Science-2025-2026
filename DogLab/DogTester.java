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
        char orionCharacter = orion.generateDogChar();
        System.out.println("Orion's dog character " + orionCharacter);

        //Printing kulfi's dog character
        char kulfiCharacter = kulfi.generateDogChar();
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
    }
}
