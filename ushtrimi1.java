
public class ushtrimi1{
    public static void main(String[] args) {
        System.out.println(average(1,2,3));
        System.out.println(allTheSame(1, 1, 1));
        System.out.println(allDifferent(1, 2, 3));
        System.out.println(sorted(1, 2, 2));
    }
    //a
    public static double average(double x, double y, double z) {
        return (x+y+z)/3;
    }
    //b
    public static boolean allTheSame(double x, double y, double z) {
        if(x==y && y==z) return true;
        else return false;
    }
    //c
    public static boolean allDifferent(double x, double y, double z) {
        if(x!=y && y!=z) return true;
        else return false;
    }
    //d
    public static boolean sorted(double x, double y, double z) {
        if(x<y && y<z) return true;
        return false;
    }
}

