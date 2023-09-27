//parameters-also known as formal parameters
//arguments/actual parameters-the values which are passed to functions during calling it.

package Functions;
import java.util.*;
public class parameteres {
    public static int calculatesum(int a,int b){        //function definition.here a and b are parameters
     
     int sum=a+b;
     return sum;
    }
    public static void main (String args[]){
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int sum=calculatesum(a,b);          //here a and b are arguments
    System.out.println("the sum is: "+sum);

    }
    
}
