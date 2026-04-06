import java.util.ArrayList;

public class Word {
    private String originalWord;
    private String sortedWord;
    
    public Word(String originalWord) {
        this.originalWord = originalWord;
    }

    public boolean validate(String word) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < word.length(); i++) {
        }
    }

    public String getOriginalWord() {
        return originalWord;
    }
    
    public String getSortedWord() {
        return sortedWord;
    }

    public void sorted() {
        String lowerWord = originalWord.toLowerCase();
        for (int i = 0; i < lowerWord.length(); i++) {
            
        }

    }
}
