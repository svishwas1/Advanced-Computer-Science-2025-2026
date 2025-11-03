public class Unit1Excersises {
    public String helloName(String name) {
        return ("\"Hello " + name + "!\"");
    }

    public String makeOutWord(String s1, String s2) {
        String s1Start= s1.substring(0,2);
        String s1End = s1.substring(2, 4);
        String newString = s1Start + s2 + s1End;
        return newString;
    }

    public String withoutEnd(String s1) {
        String substring = s1.substring(1, s1.length() - 1);
        return substring;
    }

    public String left2(String s1) {
        String firstTwoChars = s1.substring(0, 2);
        String beginString = s1.substring(2);
        String newString = beginString + firstTwoChars;
        return newString;
    }

    public String middleThree(String s1) {
        int amountSubstring = (s1.length() - 3)/2;
        String substring = s1.substring(amountSubstring, amountSubstring + 3);
        return substring;
    }

    public String withoutEnd2(String s1) {  
        if (s1.length() <= 1) {
            return "";
        }
        String sub = s1.substring(1, s1.length() - 1);
        return sub;
    }

    public String stringEnds(String s1, int i) {
        String beginSub = s1.substring(0, i);
        int start = s1.length() - i;
        String endSub = s1.substring(start);
        return beginSub + endSub;
    }

    public boolean hasBad(String s1) { 
        int indexFirstB = s1.indexOf("b");
        return (s1.substring(indexFirstB, indexFirstB + 3).equals("bad")) && (indexFirstB == 0 || indexFirstB == 1);
    }

    public int countVowels(String s1) {
        int count = 0;
        if (s1.equals("")) {
            return 0;
        }
        for (int i = 0; i <= s1.length()-1; i++) {
            if (s1.charAt(i) == ('a') 
                || s1.charAt(i) == ('e') 
                || s1.charAt(i) == ('i') 
                || s1.charAt(i) == ('o') 
                || s1.charAt(i) == ('u')) {
                count++;
            }
        }
        return count;
    }

    public int countCode(String s1) {
        int count = 0;
        for (int i = 0; i <= s1.length() - 1; i++) {
            if (s1.charAt(i) == 'c') {
                if (s1.substring(i, i + 2).equals("co") && s1.charAt(i + 3) == 'e') {
                    count++;
                }
            }
        }
        return count;
    }
}