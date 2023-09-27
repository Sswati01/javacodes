//inverted and rotated half pyramid
//stars=i and spaces=m-i
package AdvancePatterns;
import java.util.*;
public class HalfPyramid {
    public static void inverted_rotated_half_pyramid(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
      return;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        inverted_rotated_half_pyramid(m);
    }
    
}
