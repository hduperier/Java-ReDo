package relearn1;

import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        return Pattern
                .compile("-(.)") // basically taking first char after hyphen to change kebab-case to camelCase
                .matcher(
                    identifier
                        .replaceAll("\\p{IsControl}", "CTRL") //replacing Control characters
                        .replaceAll("\\p{IsWhite_Space}", "_") //replaceing white space with underscore
                        .replaceAll("[\\P{IsL}&&[^-_]]", "") //removing non-letters except _ and -
                        .replaceAll("[\\p{InGreek}&&[^\\p{Lu}]]", "") // remove lowercase Greek letters
                )
            .replaceAll(m -> m.group(1).toUpperCase()); //replace match with uppcase first char after hyphen
    }
}
