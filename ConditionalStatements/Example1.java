package ConditionalStatements;
import java.util.*;
public class Example1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        String result=(marks>=33)?"pass":"fail";
        System.out.println("the student is: "+result);
    }
    
}
