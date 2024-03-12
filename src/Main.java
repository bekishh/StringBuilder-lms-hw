// Тема: I/O Files, String, StringBuilder
// 11-02-2024

public class Main {
    public static void main(String[] args) {
        // 1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
        System.out.println(getReversedWord("Java-13"));

        // 2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
        System.out.println(getAllWords(new String[]{"Java", "Python"}, new String[]{"JS", "ReactJS"}));

        // 3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
        System.out.println(getAllConsonants("StringBuilder"));

        // 4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
        System.out.println(getPalindromeCheck("level"));

        // 5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.
        System.out.println(getWordWithCapitalLetter("java"));

        // 6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
        System.out.println(getWordsLength("Java — строго типизированный объектно-ориентированный язык программирования"));

        // 7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
        System.out.println(getASCIICode("SQL"));

        // 8. StringBuilder аркылуу суйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.
        System.out.println(getSentenceWithoutSpaces("Java — строго типизированный объектно-ориентированный язык программирования"));
    }

    // 1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
    public static String getReversedWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        return reversedWord + "";
    }

    // 2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
    public static String getAllWords(String[]... words) {
        StringBuilder allWords = new StringBuilder();

        for (String[] word : words) {
            for (String string : word) {
                allWords.append(string).append(" ");
            }
        }
        return allWords + "";
    }

    // 3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
    public static String getAllConsonants(String word) {
        int vowelsCount = 0;
        String allVowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (allVowels.indexOf(ch) != -1) {
                vowelsCount++;
            }
        }
        return "В слове " + vowelsCount + " гласных букв";
    }


    // 4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
    public static String getPalindromeCheck(String word) {
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        if (word.equals(reversedWord.toString())) {
            return "Слово является палиндромом";
        } else {
            return "Слово не является палиндромом";
        }
    }

    // 5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.
    public static String getWordWithCapitalLetter(String word) {
        StringBuilder wordWithCapitalLetter = new StringBuilder(word);

        return wordWithCapitalLetter.substring(0, 1).toUpperCase() + wordWithCapitalLetter.substring(1);
    }

    // 6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
    public static String getWordsLength(String string) {
        StringBuilder text = new StringBuilder(string);

        String sentence = text.toString();
        String[] words = sentence.split("\\s+");

        int wordCount = words.length;

        return "Количество слов в строке: " + wordCount;
    }

    // 7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
    public static String getASCIICode(String word) {
        StringBuilder ASCIICode = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            ASCIICode.append((int) letter);
        }
        return "ASCII код слова «" + word + "» это - " + Integer.parseInt(ASCIICode + "");
    }

    // 8. StringBuilder аркылуу суйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.
    public static String getSentenceWithoutSpaces(String string) {
        StringBuilder sentence = new StringBuilder(string);

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                sentence.delete(i, i + 1);
            }
        }
        return sentence + "";
    }
}