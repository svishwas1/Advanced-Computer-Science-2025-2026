public class Cipher {

    public static String encode(String message) {
        if (message == "") {
            return "";
        }
        if (message == null) {
            throw new IllegalArgumentException();
        }
        String encoded = "";
        for (int i = 0; i < message.length(); i++) {
            encoded = encoded + encodeChar(message.charAt(i));
        }
        return encoded;
    }

    private static char encodeChar(char c) {
        if (((int) c >= 88 && (int) c <= 90) || ((int) c >= 120 && (int) c <= 122)) {
            c = (char) (c - 23);
        } else if (((int) c >= 65 && (int) c <= 87) || ((int) c >= 97 && (int) c <= 119)) {
            c = (char)(c + 3);
        }
        return c;
    }

    public static String decode(String encodedMessage) {
        if (encodedMessage == "") {
            return "";
        }
        if (encodedMessage == null) {
            throw new IllegalArgumentException();
        }
        String decoded = "";
        for (int i = 0; i < encodedMessage.length(); i++) {
            decoded = decoded + decodeChar(encodedMessage.charAt(i));
        }
        return decoded;
    }

    private static char decodeChar(char c) {
        if (((int) c >= 97 && (int) c <= 99) || ((int) c >= 65 && (int) c <= 67)) {
            c = (char) (c + 23);
        } else if (((int) c >= 68 && (int) c <= 90) || ((int) c >= 100 && (int) c <= 122)){
            c = (char)(c - 3);
        }
        return c;
    }

    public static String compress(String message) {
        String compressed = "";
        if (message == "") {
            return "";
        }
        if (message == null) {
            throw new IllegalArgumentException();
        }
        int original = 0;
        int check = 0;
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            while (message.charAt(original) == message.charAt(check)) {
                count++;
                check++;
                if (check == message.length()) {
                    if (check > 9) {
                    compressed = compressed + message.charAt(check) + count;
                    return compressed;
                } 
            }
            }
            if (message.charAt(original) != message.charAt(check)){ 
                    compressed = compressed + message.charAt(original) + count;
                    i = check;
                    original = i;
                    count = 0;
                    if (check == message.length() - 1) {
                        compressed = compressed + message.charAt(check);
                        return compressed;
                    }

            }
        }
        return compressed;
    }

    public static String decompress(String compressedMessage) {
        if (compressedMessage == "") {
            return "";
        }
        if (compressedMessage == null) {
            throw new IllegalArgumentException();
        }
        if (compressedMessage.length() == 1) {
            return compressedMessage;
        }
        String uncompressed = "";
        for (int i = 0; i < compressedMessage.length() - 1; i++) {
            int num = Integer.parseInt(compressedMessage.substring(i + 1, i + 2));
            char c = compressedMessage.charAt(i);
            for (int j = 0; j < num; j++) {
                uncompressed = uncompressed + c;
            }
        }
        return uncompressed;
    }

}
