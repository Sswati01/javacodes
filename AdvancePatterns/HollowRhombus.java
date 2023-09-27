//hollow rhombus
package AdvancePatterns;
import java.util.*;
public class HollowRhombus {
    public static void hollow_rhombus(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=m;k++){
                if(i==1||k==1||i==m||k==m){
                System.out.print("*");
            }
               else{
            System.out.print(" ");
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
        hollow_rhombus(m);
    }
    
}
