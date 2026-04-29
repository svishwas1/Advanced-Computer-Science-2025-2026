import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {

    public ArrayList<Word> wordList;

    public AnagramList() {
        wordList = new ArrayList<> ();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1.getSortedWord().equals(word2.getSortedWord())) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Word> searchAnagrams(String key) {
        Word keyWord = new Word(key);
        ArrayList<Word> anagrams = new ArrayList<> ();
        for (Word w : wordList) {
            if (w.getSortedWord().equals(keyWord.getSortedWord())) {
                anagrams.add(w);
            }
        }
        return anagrams;
    }

    @Override
    public Word get(int index) {
        return wordList.get(index);
    }

    @Override
    public int size() {
        return wordList.size();
    }
}