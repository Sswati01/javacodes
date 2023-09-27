package loops;
import java.util.*;
public class ContinueStatement2 {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    do{
        System.out.print("enter your number: ");
        int i=s.nextInt();
        if(i%10==0){
            continue;
        }
        System.out.println(i);

    }
        while(true);

} 
}

