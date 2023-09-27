//Question 3: write a java program to input a week number and print day of week name using switch case
package ConditionalStatements;
import java.util.*;
public class DaysOfWeek2 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        switch(number){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default :
            System.out.println("enter a valid number");
        }
    }
    
}
