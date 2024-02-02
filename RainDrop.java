import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a="";
        if(n%3==0)
        {
            a+="Pling";
        }
        if(n%5==0)
        {
            a+="Plang";
        }
        if(n%7==0)
        {
            a+="Plong";
        }
        if(n%3==0||n%5==0||n%7==0)
        {
            System.out.print(a);
        }
        else{
            System.out.print(n);
        }
    }
}