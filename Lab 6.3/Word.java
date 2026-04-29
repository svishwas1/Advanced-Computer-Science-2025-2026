import java.util.ArrayList;

public class Word {
    private String originalWord;
    private String sortedWord;
    
    public Word(String originalWord) {
        if (validate(originalWord)) {
            this.originalWord = originalWord;
        } else {
            throw new IllegalArgumentException("Invalid word");
        }
        sortedWord = sorted();
    }

    public boolean validate(String word) {
        String lowerWord = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (lowerWord.charAt(i) < 'a' && lowerWord.charAt(i) > 'z' ) {
                return false;
            }
        }
        return true;
    }

    public String getOriginalWord() {
        return originalWord;
    }
    
    public String getSortedWord() {
        return sortedWord;
    }

    public String sorted() {
        String lowerWord = originalWord.toLowerCase();
        ArrayList<Character> letters = new ArrayList<>();
        for (int j = 0; j < lowerWord.length(); j++) {
            letters.add(lowerWord.charAt(j));
        }
        for (int i = 0; i < letters.size(); i++) {
            int lowerIndex = i; 
            for (int j = i+1; j < letters.size(); j++) {
                if (letters.get(j) < letters.get(lowerIndex)) {
                    lowerIndex = j;
                }
            }
            char holder = letters.get(lowerIndex);
            letters.set(lowerIndex, letters.get(i));
            letters.set(i, holder);
        }
        
        String sorted = "";
        for (int k = 0; k < letters.size(); k++) {
            sorted = sorted + letters.get(k);
        }
        return sorted;

    }
}
