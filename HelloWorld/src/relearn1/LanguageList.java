package relearn1;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Please implement the isEmpty() method");
        if (languages.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addLanguage(String language) {
        //throw new UnsupportedOperationException("Please implement the addLanguage() method");
        languages.add(language);
    }

    public void removeLanguage(String language) {
        //throw new UnsupportedOperationException("Please implement the removeLanguage() method");
        languages.remove(language);
    }

    public String firstLanguage() {
        //throw new UnsupportedOperationException("Please implement the firstLanguage() method");
        String answer = languages.get(0);
        return answer;
    }

    public int count() {
        //throw new UnsupportedOperationException("Please implement the count() method");
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        //throw new UnsupportedOperationException("Please implement the containsLanguage() method");
        return languages.contains(language);
    }

    public boolean isExciting() {
        //throw new UnsupportedOperationException("Please implement the isExciting() method");
        if (languages.contains("Java") || languages.contains("Kotlin")) {
            return true;
        } else {
            return false;
        }
    }
}
