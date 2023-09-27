//write a program to read a set of intergers and then prints the sum of the even and odd integers
package loops;
import java.util.*;
public class Example1 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int num;
        int choice;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.print("enter your number: ");
            num=s.nextInt();
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
        System.out.println("do you wanna continue.if yes press 1 and if no press 0");
        System.out.print("enter your choice: ");
        choice=s.nextInt();
}
         while(choice==1);
         System.out.println("the sum of odd numbers is: "+oddsum);
         System.out.println("the sum of even numbers is: "+evensum);
    }
    
}
