import java.util.Scanner;

public class ushtrimi12 {
    public static void main(String[] args) {

        kontrollStr("Shkruaj fjalkalimin: ");

    }

    public static void kontrollStr(String str1) {
        Scanner in = new Scanner(System.in);
        System.out.print(str1);
        String str = in.next(); 
        if (gjatsi(str) && shMadhe(str) && shVogel(str) && kaNum(str)) {
            System.out.println("success!!");
            return;
        }
        System.out.println("Shkruani perseri te dhenat.");
    }

    public static boolean gjatsi(String str) {
        if (str.length() >= 8) return true;
        return false;
    }
    public static boolean shMadhe(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean shVogel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean kaNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) return true;
        }
        return false;
    }

}