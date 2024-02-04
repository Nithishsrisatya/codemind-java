import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),A=sc.nextInt(),z;
        z=Math.abs(3*x-(A+y));
        System.out.print(z);
    }
}