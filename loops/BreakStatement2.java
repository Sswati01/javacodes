package loops;
import java.util.*;
public class BreakStatement2 {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    
    do{
        System.out.print("enter your number: ");
         int i=s.nextInt();
          if(i%10==0){
        break;
    }
            System.out.println(i);

        }
            while(true);

    }    
}
    

