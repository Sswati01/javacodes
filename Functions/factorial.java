package Functions;
import java.util.*;
public class factorial {
    public static int f(int n){
        int fact=1;
            for(int i=1;i<=n;i++){
               fact=fact*i;
            }
        return fact;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter your number: ");
        int n=s.nextInt();
        System.out.println("factorial is: "+f(n));

    }

    
}
