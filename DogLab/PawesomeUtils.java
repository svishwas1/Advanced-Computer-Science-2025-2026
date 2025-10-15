public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int newId = dogId;
        int num1 = newId % 10;
        newId = newId / 10;
        int num2 = newId % 10;
        newId = newId / 10;
        int num3 = newId % 10;
        int sum = num1 + num2 + num3;
        return (char) ('F' + (sum % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            dog.setStillInFacility(true);
            return "Dog cannot leave because " + personName + " is not the owner.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            System.out.println(dog + " was checked in sucessfully.");
        } else {
            dog.setStillInFacility(false);
            System.out.println(dog + " was denied access due to invalid dog tag.");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId +  "" + dogChar;
    }

    public static int validateDogId(int dogId) {
        String dogStringId = dogId + "";
        if (dogStringId.length() == 3) {
            return dogId;
        } else {
            return (int) (((Math.random()) * 900) + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int id = dog.getDogId();
        char expectedChar = generateDogChar(id);
        String expected = generateDogTag(id, expectedChar);
        return expected.equals(dog.getDogTag());
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return (15);
        } else if (dog.getAge() == 2) {
            return (24);
        } else if (dog.getAge() > 2) {
            int additionalAge = dog.getAge() - 2;
            int newAge = 24 + (5 * additionalAge);
            return (newAge);
        } else {
            return (0);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return (1);
        } else if (humanYears <= 24) {
            return (2);
        } else {
            int additionalAge = humanYears - 24;
            int newAge = 2 + (additionalAge / 5);
            return newAge;
        }
    }
}