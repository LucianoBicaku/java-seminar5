import java.util.Scanner;

public class ushtrimi11{
    public static void main(String[] args) {
        System.out.println(readDouble("Shkruaj nje nr double:"));
    }

    public static double readDouble(String str) {
        System.out.print(str);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}