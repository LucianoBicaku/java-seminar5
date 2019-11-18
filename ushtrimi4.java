import java.util.Scanner;

public class ushtrimi4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(strNhere(in.next(), 3));

        in .close();
    }
    public static String strNhere(String str, int n) {
        String shtim = str;
        for (int i = 0; i < n-1; i++) {
            str+=" "+shtim+" ";
        }
        return str;
    }
}