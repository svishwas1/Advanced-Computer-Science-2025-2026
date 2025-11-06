public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (0 <= cleanlinessLevel && cleanlinessLevel <= 10) {
            return cleanlinessLevel;
        } else if (cleanlinessLevel < 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static String generateUsername(String name) {
        int indexFirstSpace = name.charAt(' ');
        String firstName = name.substring(0, indexFirstSpace);
        String lastName = name.substring(indexFirstSpace + 1);
        String lowerFirst = firstName.toLowerCase();
        String lowerLast = lastName.toLowerCase();
        int randomNum = (int) (Math.random() * (2050 - 1950) + 1950);
        return "@" + lowerFirst + "_" + lowerLast + "_" + randomNum;
 
    }

    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel(pool.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        int indexOfSpace = trimmedName.indexOf(' ');
        int numSpaces = 0;
        while (name.charAt(indexOfSpace) == ' ') {
            numSpaces++;
            indexOfSpace++;
        }
        String firstName = name.substring(0, indexOfSpace);
        String lastName = name.substring(indexOfSpace + numSpaces);
        return firstName + " " + lastName;
    }
}
