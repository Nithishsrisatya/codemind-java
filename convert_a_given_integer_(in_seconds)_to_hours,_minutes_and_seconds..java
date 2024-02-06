import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),h,m,s;
        h=(n/60);
        s=n%60;
        m=h%60;
        h=h/60;
        System.out.print("H:M:S-"+h+":"+m+":"+s);
    }
}