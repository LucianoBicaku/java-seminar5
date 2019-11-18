import java.util.Scanner;

public class ushtrimi2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(shifraPare(num));
        System.out.println(shifraFundit(num));
        System.out.println(length(num));
        in.close();
    }

    public static char shifraPare(int num) {
        String str = Integer.toString(num);
        return str.charAt(0);
    }
    public static char shifraFundit(int num) {
        String str = Integer.toString(num);
        return str.charAt(str.length()-1);
    }
    public static int length(int num) {
        String str = Integer.toString(num);
        return str.length();
    }
}