package ConditionalStatements;
import java.util.*;
public class calculator {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    char operator=s.next().charAt(0);     //.next().charAt(0) is used for taking characters as input
    switch(operator){
        case '+':
        System.out.println("sum is: "+(a+b));
        break;
        case '-':
        System.out.println("difference is: "+(a-b));
        break;
        case '*':
        System.out.println("product is: "+(a*b));
        break;
        case '/':
        System.out.println("quotient is: "+(a/b));        break;
        case '%':
        System.out.println("reminder is: "+(a%b));
        break;
        default :
        System.out.println("enter a valid operator");
        
    }    
}
    
}
