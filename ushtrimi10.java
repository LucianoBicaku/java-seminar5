import java.util.Scanner;

public class ushtrimi10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();


        ndryshoFjal(str);


        in .close();
    }

    public static int nrRandom(String str) {
        int num1 = (int)Math.floor(Math.random() * str.length());
        if (num1 !=  0 && num1!= str.length()-1){
            return num1;
        }
        return nrRandom(str);
    }

    public static void ndryshoFjal(String str) {
        int num1 = nrRandom(str),num2=nrRandom(str);
        if(num1 != num2){
            char c1 = str.charAt(num1);
            char c2 = str.charAt(num2);
            str = str.substring(0, num1) + c2 + str.substring(num1 + 1); 
            str = str.substring(0, num2) + c1 + str.substring(num2 + 1); 
            System.out.println(str);
            return;
        }
        ndryshoFjal(str);

    }


}