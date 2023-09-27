package AdvancePatterns;
import java.util.*;
public class HollowRectangle {
    public static void hollow_rectangle(int m,int n){
        //outer loop for rows(m)
        for(int i=1;i<=m;i++){
            //inner loop for columns(n)
            for(int j=1;j<=n;j++){
                //cell(i,j)
                if(i==1||i==m||j==1||j==n){     //condition for boundary cells
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        return;
    }
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("enter number of rows: ");
    int m=s.nextInt();
    System.out.print("enter number of columns: ");
    int n=s.nextInt();
    hollow_rectangle(m,n);
    }
    
}
