import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double V;
        V=(4*3.14*r*r*r)/3;
        System.out.printf("%.2f",V);
    }
}