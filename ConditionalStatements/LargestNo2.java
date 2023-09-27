package ConditionalStatements;
import java.util.*;
public class LargestNo2 {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    if(a>b && a>c){
    System.out.println("the largest no. is: "+a);
    }
    else if(b>a && b>c){
        System.out.println("the largest no. is: "+b);
    }
    else if(c>a && c>b){
        System.out.println("the largest no. is: "+c);
    }
    else{
        System.out.println("all numbers are equal");
    }
    }
    
}
