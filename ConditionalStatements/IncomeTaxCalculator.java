package ConditionalStatements;
import java.util.*;
public class IncomeTaxCalculator {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int income=s.nextInt();
    float tax=0f;
    if(income<500000){
        tax=0f;
    }
    else if(income>=500000 && income<=1000000){
        tax=0.2f*income;
    }
    else{
       tax=0.3f*income;
    }
    System.out.println("you tax is: "+tax);
    }
    
}
