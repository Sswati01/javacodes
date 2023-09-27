//print largest of two numbers:
package ConditionalStatements;
import java.util.*;
public class LargestNo {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    if(a>=b){
        System.out.println("the larger number is: "+a);
    }
    else{
        System.out.println("the larger number is: "+b);
    }
    }
    
}
