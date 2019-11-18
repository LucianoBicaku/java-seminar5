//import java.util.Scanner;

public class ushtrimi8 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        System.out.println(find("Mississippi","sippqq"));

        // in .close();
    }
    public static boolean find(String text, String match) {
        if (text == null || match == null) {
            return false;
        } 
        if (match.length() > text.length()) {
            return false;
        }
        if (text.length() == match.length()) {
            return text.equals(match);
        }
        return text.startsWith(match) || find(text.substring(1), match);
    }
}