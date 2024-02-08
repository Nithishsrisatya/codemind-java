import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt(),s;
        s=(x+y+z)/2;
        double A;
        A=s*(s-x)*(s-y)*(s-z);
        double a=Math.sqrt(A);
        System.out.printf("%.2f",a);
    }
}