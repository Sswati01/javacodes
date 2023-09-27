//question 2: write a program to get temp. as input and print you have fever if your temp. is above 100 otherwise print you don't have fever
package ConditionalStatements;
import java.util.*;
public class Example3 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        double temp=s.nextDouble();
        if(temp>100){
            System.out.println("you have fever");
        }
        else{
            System.out.println("you don't have fever");
        }
    }
    
}
