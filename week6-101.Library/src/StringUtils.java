public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word.isEmpty() || searched.isEmpty())
            return false;
        return word.toUpperCase().trim().contains(searched.toUpperCase().trim());
    }
}
