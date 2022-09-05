import java.util.*;

public class Task1 {
    public static void main(final String[] args) {
        final String str = "cba bcc aba";
        System.out.println("String before replacing = \"" + str + "\"");
        final char symbol = 'a';
        final String str2 = sortBySymbol(str, symbol);
        System.out.println("String after replacing = \"" + str2 + "\"");

    }

    public static String sortBySymbol(final String str, final char symbol) {

        final String[] result = str.split(" ");
        final Comparator<String> comp = Comparator.comparing(letter -> countBySymbol(letter, symbol));
        Arrays.sort(result, comp.reversed());
        return Arrays.toString(result);
    }

    public static int countBySymbol(final String letter, final char symbol) {
        int count = 0;
        final char[] charArray = letter.toCharArray();
        for (final char ch : charArray) {
            if (ch == symbol) {
                count++;
            }
        }
        return count;
    }
}
