//question 5: write a java progam that takes a year from the user and print whether the year is leap year or not
//conditions for leap year: multiple of 400,multiple of 4 and not a multiple of 100
package ConditionalStatements;
import java.util.*;
public class Example5 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=(year%100)==0 && (year%400)==0;
        if(x && (y||z)){
            System.out.println("it's a leap year");
        }
        else{
            System.out.println("it's not a leap year");
        }
    }
    
}
