import java.util.Scanner;

public class ushtrimi9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(eshtepolidrom(in.next()));

        in .close();
    }

    static boolean isPalRec(String str,int s, int e) {
        // If there is only one character 
        if (s == e)
            return true;

        // If first and last  
        // characters do not match 
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // If there are more than  
        // two characters, check if 
        // middle substring is also 
        // palindrome or not. 
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean eshtepolidrom(String str) {
        int n = str.length();

        // An empty string is  
        // considered as palindrome 
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
}