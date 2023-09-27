//write a program to find the factorail of a number
package loops;
import java.util.*;
public class factorial {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter your number: ");
        int num=s.nextInt();
        int fact=1;
        if(num<0){
            System.out.println("factorial is not defined for negative numbers");
        }
        else if(num==0){
            System.out.println("factorial is 1");
        }
        else{
            for(int i=1;i<=num;i++){
                fact=fact*i;
           
            }
                 System.out.print("factorial is ");
                System.out.println(fact);
        }

    }
    
}
