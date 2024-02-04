import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),y,w;
        y=n/365;
        w=Math.abs((n-(y*365))/7);
        System.out.println(y);
        System.out.println(w);
    }
}