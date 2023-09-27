/*write a program that accepts int arguments.the method should return true if number is even.ot false otherwise
 also write a program to test your method */
package Functions;
import java.util.*;
public class IsEven {
    public static boolean iseven(int n){
        boolean ans=true;
        if(n%2!=0){
            ans=false;
        }
        return ans;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter your number: ");
        int n=s.nextInt();
    System.out.println(iseven(n));
    if(iseven(n)){
        System.out.println("the number is even");
    }
    else{
        System.out.println("the number is odd");
    }
    }
    
}
