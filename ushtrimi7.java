import java.util.Scanner;

public class ushtrimi7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        reverse( in .next()); 
        in.close();
    }

    public static void reverse(String str) {
        if (str.length() == 0) {
            return;
        }
        reverse(str.substring(1));
        System.out.print(str.charAt(0));
    }
}