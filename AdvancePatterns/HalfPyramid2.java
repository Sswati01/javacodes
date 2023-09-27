//inverted half pyramid with numbers
package AdvancePatterns;
import java.util.*;
public class HalfPyramid2 {
    public static void half_pyramid(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print(j);
            }
            // for(int k=1;k<=i;k++){
            //     System.out.print(" ");
            // }
            System.out.println("");
        }
        return;
    }    
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int m=s.nextInt();
    half_pyramid(m);
    }
}
