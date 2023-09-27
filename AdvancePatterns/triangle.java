//0-1 traingle
package AdvancePatterns;
import java.util.*;
public class triangle {
    public static void triangle(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println(" ");
        }
        return;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int m=s.nextInt();
    triangle(m);
    }
    
}
