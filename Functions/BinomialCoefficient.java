package Functions;
import java.util.*;
public class BinomialCoefficient {
    public static int f(int a){
        int fact=1;
            for(int i=1;i<=a;i++){
               fact=fact*i;
            }
        return fact;
    }
    public static int bc(int n,int r){
        int fact_n=f(n);
        int fact_r=f(r);
        int fact_nr=f(n-r);
        int binomial_coefficient=fact_n/(fact_r*fact_nr);
        return binomial_coefficient;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=s.nextInt();
        System.out.print("enter value of r: ");
        int r=s.nextInt();
        // int binomial_coeffiecient=f(n)/(f(r)*f(n-r));
        // System.out.println("binomial coefficient is: "+binomial_coeffiecient);
        System.out.println("binomial coefficient is: "+bc(n,r));
    }
}
