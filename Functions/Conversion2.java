//conversion of decimal to binary number
package Functions;
import java.util.*;
public class Conversion2 {
    public static void d_to_b(int n){
        int a=0;
        int i=0;
        while(n>0){
        int rem=n%2;
        a+=rem*(int)Math.pow(10,i);
        i++;
        n=n/2;
        }
        System.out.println(a);
    }
    public static void main (String  args[]){
        Scanner s=new Scanner(System.in);
       System.out.print("enter decimal number: ");
       int n=s.nextInt();
       d_to_b(n);
    }
    
}
