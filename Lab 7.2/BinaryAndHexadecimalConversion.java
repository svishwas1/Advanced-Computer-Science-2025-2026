
public class BinaryAndHexadecimalConversion {

	// Given an int, returns the binary representation of that int as a String
	// Precondition: num >= 0
	public static String convertIntToBinary(int num) {
		String reverseOrder = "";
        while (num > 0) {
			reverseOrder = reverseOrder + num % 2;
			num = num / 2;   
        }
		String correct = "";
		for (int i = reverseOrder.length() - 1; i >= 0; i--) {
			correct = correct + reverseOrder.charAt(i);
		}
		return correct;
		
	}

	// Given a String of a binary representation of an int, returns that int
	// Precondition: binary string is not negative
	public static int convertBinaryToInt(String binary) {
		int sum = 0;
		int power = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			int value = Integer.parseInt(binary.substring(i, i+1));
			sum = sum + (int) (value * Math.pow(2, power));
			power++;
		}
		return sum;
	}

	// Given an int, returns the hexadecimal representation of that int as a String
	// Precondition: num >= 0
	public static String convertIntToHexadecimal(int num) {
		String reverseOrder = "";
		while (num > 0) {
			int value = num % 16;
			num = num / 16;
			if (value == 10) {
				reverseOrder = reverseOrder + "a";
			} else if (value == 11) {
				reverseOrder = reverseOrder + "b";
			} else if (value == 12) {
				reverseOrder = reverseOrder + "c";
			} else if (value == 13) {
				reverseOrder = reverseOrder + "d";
			} else if (value == 14) {
				reverseOrder = reverseOrder + "e";
			} else if (value == 15) {
				reverseOrder = reverseOrder + "f";
			} else {
				reverseOrder = reverseOrder + value;
			}
		} 
		String correct = "";
		for (int i = reverseOrder.length() - 1; i >= 0; i--) {
			correct = correct + reverseOrder.charAt(i);
		}
		return correct;
	}

	// Given a String of a hexadecimal representation of an int, returns that int
	// Precondition: hexadecimal string is not negative
	public static int convertHexadecimalToInt(String hex) {
		int sum = 0;
		int power = 0;
		for (int i = hex.length() - 1; i >= 0; i--) {
			String letter = hex.substring(i, i+1);
			if (letter.equals("a")) {
				sum = sum + (int) (10 * Math.pow(16, power));
			} else if (letter.equals("b")) {
				sum = sum + (int) (11 * Math.pow(16, power));
			} else if (letter.equals("c")) {
				sum = sum + (int) (12 * Math.pow(16, power));
			} else if (letter.equals("d")) {
				sum = sum + (int) (13 * Math.pow(16, power));
			} else if (letter.equals("e")) {
				sum = sum + (int) (14 * Math.pow(16, power));
			} else if (letter.equals("f")) {
				sum = sum + (int) (15 * Math.pow(16, power));
			} else {
				sum = sum + (int) (Integer.parseInt(letter) * Math.pow(16, power));
			}
			power++;
		}
		return sum;
	}

	// Given a String of a hexadecimal representation of an int,
	// returns the String of the binary representation
	// Precondition: hexadecimal string is not negative
	public static String convertHexadecimalToBinary(String hex) {
		int regularNum = convertHexadecimalToInt(hex);
		String binaryNum = convertIntToBinary(regularNum);
		return binaryNum;
	}

	// Given a String of a binary representation of an int,
	// returns the String of the hexadecimal representation
	// Precondition: hexadecimal string is not negative
	public static String convertBinaryToHexadecimal(String binary) {
		int regularNum = convertBinaryToInt(binary);
		String hexNum = convertIntToHexadecimal(regularNum);
		return hexNum;
	}

	// Converts the String representation of the number to an int.
	// If the String starts with 0b, then convert the rest of the String as if it
	// were binary.
	// If the String starts with 0x, then convert the rest of the String as if it
	// were hexadecimal.
	// If the String starts with neither, then convert the rest of the String as if
	// it were decimal.
	public static int convertStringToInt(String numString) {
		numString = numString.toLowerCase();
		String substring = numString.substring(0, 2);
		String sub = numString.substring(2);
		if (substring.equals("0b")) {
			return convertBinaryToInt(sub);
		} else if (substring.equals("0x")) {
			return convertHexadecimalToInt(sub);
		} else {
			return Integer.parseInt(sub);
		}
	}
}
