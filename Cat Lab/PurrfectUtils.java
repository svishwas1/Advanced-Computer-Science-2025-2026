public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        if (7 < cat.getMoodLevel() && cat.getMoodLevel() <=10) {
            return ("Curretly, Cookie is in a great mood."
                + " Petting is appreciated.");
        } 
        else if (3 < cat.getMoodLevel() && cat.getMoodLevel() <= 7) {
            return ("Currently, Cookie is reminiscing of a past life."
                + " Petting is acceptable.");
        }
        else {
            return ("Currentlu, Cookie is plotting revengeance." 
                + " Petting is extremely risky.");
        }
    }

    public static char generateCatChar(String catId) {
        int characterValues = 0;
        for (int i = 0; i <= catId.length()-1; i++) {
            String letter = catId.substring(i, i+1);
            int numOfLetter = Integer.parseInt(letter);
            characterValues = characterValues + numOfLetter;
        }
        int catCharNumber = (characterValues % 26) + 'A';
        return (char) catCharNumber;
    }

    public static int generateRandomNumber(int low, int high) {
        if (high < low) {
            int holder;
            holder = high;
            high = low;
            low = holder;
        }
        int randomNumber = (int) ((Math.random()) * (high - low) + low);
        return randomNumber;
    }

    public static String validateCatId(String catId) {
        if (catId.length() == 4) {
            return catId;
        } else {
            String newCatId = "" + generateRandomNumber(1000, 10000);
            return newCatId;
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            return moodLevel;
        } else if (moodLevel < 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
        } else if (cat.getMoodLevel() < 2) {
            if (cat.isHungry()) {
                cat.setMoodLevel(cat.getMoodLevel() - 1 );
            } else {
                cat.setMoodLevel(cat.getMoodLevel() + 1);
            }
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int decrease = generateRandomNumber(1, 3);
        if (decrease == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Cookie did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() -2);
            System.out.println("Cookie really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() - 1);
        cat.setHungry(true);
        System.out.println("Cleaning the ltter box...");
        System.out.println("Done!\nCookie appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up Cookie's bowl...");
        System.out.println("Done!");
        System.out.println("Cookie is eating...");
        System.out.println("Cookie is full!");
    }
}
