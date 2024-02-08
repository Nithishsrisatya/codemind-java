import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%100<10)
        {
            System.out.print("0"+(n%100));
        }
        else{
            System.out.print(n%100);
        }
    }
}