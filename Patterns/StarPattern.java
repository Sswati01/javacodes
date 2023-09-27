//nested loops                             //outer loop- no. of lines
package Patterns;                          //number of times character is printed-inner loop-i timmes
import java.util.*;
public class StarPattern {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();   
             }

    
    }
    
}
