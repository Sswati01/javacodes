//butterfly pattern
package AdvancePatterns;
import java.util.*;
public class Butterfly {
    public static void butterfly(int m){
        for(int i=1;i<=m;i++){
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           for(int k=1;k<=2*(m-i);k++){
            System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println(" ");
        }
         for(int i=m;i>=1;i--){
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           for(int k=1;k<=2*(m-i);k++){
            System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println(" ");
        }
     return;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int m=s.nextInt();
        butterfly(m);
    } 
    
}
