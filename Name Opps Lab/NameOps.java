public class NameOps{
    public static void printMethodCall(String method, String name) {
        System.out.println(method + "(\"" +  name + "\"):");
    }

    public static String whoIsAwesome(String name) {
        return ("\"" + name + "\"" + " is awesome");
    }

    public static int indexOfFirstSpace(String name) {
        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                index = i;
            }
        }
        return index;
    }
    
    public 


}