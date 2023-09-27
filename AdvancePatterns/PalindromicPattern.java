//palindromic pattern with numbers
package AdvancePatterns;
import java.util.*;
public class PalindromicPattern {
    public static void palindromic_pattern(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println(" ");
        }
        return;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int m=s.nextInt();
        palindromic_pattern(m);
    }
}
