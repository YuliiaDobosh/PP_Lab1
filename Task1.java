import java.util.*;
public class Task1 {
    public static void main(final String[] args) {
        final String str = "cba bcc aba";
        System.out.println("String before replacing = \"" + str +"\"");
        final String str_2 = sort_by_a(str);
        System.out.println("String after replacing = \"" + str_2 +"\"");

    }
    public static String sort_by_a (final String str){
        final String[] result = str.split(" ");
        final Comparator<String> comp = Comparator.comparing(letter -> count_a(letter));
        Arrays.sort(result, comp.reversed());
        return Arrays.toString(result);
    }
    public static int count_a (final String letter){
        final char ch = 'a';
        int b = 0;
        for(int i = 0; i < letter.length(); i++){
            if (letter.charAt(i) == ch)
            {
                b++;
            }
        }return b;
    }
}
