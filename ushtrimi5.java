import java.util.Scanner;

public class ushtrimi5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(nrZanore(in.next()));

        in .close();
    }

    public static int nrZanore(String str) {
        int n = str.length(),counter=0;
        for (int i = 0; i < n; i++) {
            char karakter = str.charAt(i);
            if(karakter == 'a' || karakter == 'e' || karakter =='i' || karakter == 'o' || karakter =='u' || karakter=='y'){
                counter++;
            }
        }
        return counter;
    }
}