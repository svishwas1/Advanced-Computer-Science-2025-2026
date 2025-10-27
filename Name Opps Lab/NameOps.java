public class NameOps {
    public static String printMethodCall(String method, String name) {
        return (method + "(\"" +  name + "\"): ");
    }

    public static String whoIsAwesome(String name) {
        return (name + " is awesome!");
    }

    public static int indexOfFirstSpace(String name) {
        int index = name.indexOf(" ");
        return index;
    }

    public static int indexOfSecondSpace(String name) {
        int firstIndex = indexOfFirstSpace(name) + 1;
        String shortenedName = name.substring(firstIndex);
        int secondIndex = shortenedName.indexOf(" ");
        if (secondIndex == -1) {
            return -1;
        } else {
            return firstIndex + secondIndex;
        }
    }

    public static String findFirstName(String name) {
        int stringIndex = name.indexOf(" ");
        if (stringIndex == -1) {
            return name;
        }
        String firstName = name.substring(0, stringIndex);
        return firstName;
    }

    public static String findLastName(String name) {
        int index = name.indexOf(" ");
        if (index == -1) {
            return "";
        }
        String newName = name.substring(index + 1);
        int newNameIndex = newName.indexOf(" ");
        if (newNameIndex == -1) {
            return newName;
        } else {
            String lastName = newName.substring(newNameIndex + 1);
            return lastName;
        }
    }

    public static String findMiddleName(String name) {
        int startIndex = name.indexOf(" ");
        if (startIndex == -1) {
            return "";
        }
        String middleLastName = name.substring(startIndex + 1);
        int endIndex = middleLastName.indexOf(" ");
        if (endIndex == -1) {
            return "";
        }
        String middle = middleLastName.substring(0, endIndex);
        return middle;

    }

    public static String generateLastFirstMidInitial(String name) {
        int firstSpaceIndex = name.indexOf(" ");
        if (firstSpaceIndex == -1) {
            return name;
        }
        String firstName = name.substring(0, firstSpaceIndex);
        String secondPartOfName = name.substring(firstSpaceIndex + 1);
        int secondSpaceIndex = secondPartOfName.indexOf(" ");
        if (secondSpaceIndex == -1) {
            return (secondPartOfName + ", " + firstName);
        }
        String middleInitial = secondPartOfName.substring(0, 1);
        String lastName = secondPartOfName.substring(secondSpaceIndex + 1);
        return (lastName + ", " + firstName + " " + middleInitial + ".");

    }
}