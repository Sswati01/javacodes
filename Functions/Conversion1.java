//convert a number from binary to decimal
package Functions;
import java.util.*;

public class Conversion1 {
    public static void b_to_d(int n){
        int i=0;
        int a=0;
    while(n>0){
        int lastdigit=n%10;
        a+=lastdigit*(int)Math.pow(2,i);
        i++;
        n=n/10;
}
    System.out.println(a);
    
}
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("enter binary number: ");
    int n=s.nextInt();
    b_to_d(n);
    }
    
}
