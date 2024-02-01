import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int a=sc.nextInt(),b=sc.nextInt(),c;
            c=b/2;
            if(a%b==0)
            {
                System.out.println("YES");
            }
            else if(a>c){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}