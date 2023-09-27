//floyd's triangle
package AdvancePatterns;
import java.util.*;
public class FloydsTriangle {
    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
        System.out.println(" ");
        }
        return;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n=s.nextInt();
        floyds_triangle(n);
    }
    
}
