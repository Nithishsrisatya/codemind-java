import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat(),y=sc.nextFloat();
        float F;
        F=Math.abs(x-y)/x;
        System.out.printf("%.2f",F*100);
    }
}