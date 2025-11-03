

public class Unit1ExcersisesTester {
    public static void main(String[] args) {
        Unit1Excersises object1 = new Unit1Excersises();
        
        System.out.println("*******************");
        System.out.println(object1.helloName("Shriya"));

        System.out.println("*******************");
        System.out.println(object1.makeOutWord("Cool", "Awesome"));

        System.out.println("*******************");
        System.out.println(object1.withoutEnd("Hello"));

        System.out.println("*******************");
        System.out.println(object1.left2("Hello"));
        System.out.println(object1.left2("He"));

        System.out.println("*******************");
        System.out.println(object1.middleThree("Solving"));
        System.out.println(object1.middleThree("and"));

        System.out.println("*******************");
        System.out.println(object1.withoutEnd2("hello"));
        System.out.println(object1.withoutEnd2("and"));
        System.out.println(object1.withoutEnd2("an"));
        System.out.println(object1.withoutEnd2("a"));

        System.out.println("*******************");
        System.out.println(object1.stringEnds("Chocolate", 3));
        System.out.println(object1.stringEnds("Rose", 4));

        System.out.println("*******************");
        System.out.println(object1.hasBad("badxx"));
        System.out.println(object1.hasBad("xbadxx"));
        System.out.println(object1.hasBad("xxbadxx"));

        System.out.println("*******************");
        System.out.println(object1.countVowels("Hello"));
        System.out.println(object1.countVowels("abc"));
        System.out.println(object1.countVowels(""));

        System.out.println("*******************");
        System.out.println(object1.countCode("aaacodebbb"));
        System.out.println(object1.countCode("codexxcode"));
        System.out.println(object1.countCode("cozexxcope"));
    }
}
