import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int a=sc.nextInt(),b=sc.nextInt(),T,d;
            if(a<b)
            {
                System.out.println(a);
            }
            else{
                d=a/b;
                T=a%b;
                System.out.println(d+T);
            }
            t--;
        }
    }
}