package ConditionalStatements;
import java.util.*;
public class DaysOfWeek1 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        if(number==1){
            System.out.println("monday");
        }
        else if(number==2){
            System.out.println("tuesday");
        }
        else if(number==3){
            System.out.println("wednesday");
        }
        else if(number==4){
            System.out.println("thursday");
        }
        else if(number==5){
            System.out.println("friday");
        }
        else if(number==6){
            System.out.println("saturday");
        }
        else if(number==7){
            System.out.println("sunday");
        }
        else{
            System.out.println("enter a valid number");
        }
    }
    
}
