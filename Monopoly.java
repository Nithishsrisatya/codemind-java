import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=0,e;
            if((a+b<c)|| (a+c<b) || (b+c<a))
            {
                d=1;
            }
            if(d==1)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}