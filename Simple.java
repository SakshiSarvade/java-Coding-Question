import java.util.*;
public class Simple
{
    public static void main(String args[])
    {
        int n;
        float p,r,si;
        System.out.println("Enter p,n,r");
        Scanner sc= new Scanner (System.in);
        p = sc.nextFloat();
        r = sc.nextFloat();
        n = sc.nextInt();
        si = (p*r*n)/100;
        System.out.println("Interest= "+si);
    }
}