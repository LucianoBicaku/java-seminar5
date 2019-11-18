import java.util.Scanner;
public class ushtrimi6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //System.out.println(nrFjalesh(in.next()));
        System.out.println(nrFjalesh(in.nextLine()));
        in.close();
    }

    public static int nrFjalesh(String str) {
      	str=str.trim();
        str = str.replaceAll("\\s+", " ");
        int n=str.length();
        int counter=1;
        if(str.isEmpty()){
            return 0;
        }
        for(int i=0; i<n;i++){
            if(str.charAt(i)==' '){
                counter++;
            }
        }
        return counter;
    }
}