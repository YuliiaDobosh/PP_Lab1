
public class Task2 {
    public static void main(String[] args) {
        final char ch = '8';
        final String str = "yu2lia4do8bosh";
        System.out.println("String before deleting =\"" +str+"\"");
        System.out.println("String after deleting =\"" +deleteSymbolFromString(str , ch)  +"\"");
    }
    public static String deleteSymbolFromString(String str ,char ch){
        return str.replace(ch+"" , "");
    }
}
