import java.util.Scanner;

public class ushtrimi3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(charMes(in.next()));

        in.close();
    }

    public static String charMes(String str) {
        int gjatsi=str.length();
        if(gjatsi%2==1){
            return str.substring((gjatsi-1)/2,(gjatsi+1)/2);
        }
        else return str.substring((gjatsi/2)-1,(gjatsi/2)+1);    
    }

}