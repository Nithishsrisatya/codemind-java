import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextDouble();
        double hra=sc.nextDouble();
        double da=sc.nextDouble();
        double pf,gs;
        pf=(bs*0.12);
        gs=bs+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
    }
}