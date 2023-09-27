package ConditionalStatements;
import java.util.*;
public class ElseIf {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int age=s.nextInt();
    if(age>13 && age<18){
        System.out.println("you are a teenager");
    }
    else if(age>=18){
      System.out.println("you are an adult");
    }

    else{
        System.out.println("you are not an adult");
    }
    }
    
}
