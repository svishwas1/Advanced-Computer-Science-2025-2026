import java.util.ArrayList;

public class AnagramTester {
    public static void main(String[] args) {

        AnagramList a = new AnagramList();
        //Word w1 = new Word("bac");
       // Word w2 = new Word("abc");
        Word w3 = new Word("cool");
       // Word w4 = new Word("cab");
       // Word w5 = new Word("sofa");
        
        //a.wordList.add(w1);
        //a.wordList.add(w2);
        a.wordList.add(w3);
        //a.wordList.add(w4);
        //a.wordList.add(w5);

        //System.out.println(a.checkAnagram(w1, w2));
        //System.out.println(w1.getSortedWord());
        ArrayList<Word> anagrams = a.searchAnagrams("looc");
        for (Word ana : anagrams) {
            System.out.println(ana.getOriginalWord());
        }
    


        
    }
}
