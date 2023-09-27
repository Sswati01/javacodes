//question 1: write java program to get a number from user and print whether it is positive or negative.
package ConditionalStatements;
import java.util.*;
public class Example2 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0){
            System.out.println("the number is negative");
        }
        else if(a==0){
            System.out.println("the number is zero");
        }
        else{
            System.out.println("the number is positive");
        }
    }
    
}
