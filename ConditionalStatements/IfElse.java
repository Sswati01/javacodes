//conditional statements-if else, else if, ternary operator, switch
package ConditionalStatements;
import java.util.*;
public class IfElse {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int age=s.nextInt();                           //this is the first if statement
    if(age>13 && age<18){
        System.out.println("you are a teenager");
    }
    if(age>=18){                                   //this is the first if-else statement
      System.out.println("you are an adult");
    }

    else{
        System.out.println("you are not an adult");
    }
    }
   
}
