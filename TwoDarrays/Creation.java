package TwoDarrays;
import java.util.*;
public class Creation {
    public static void main (String args[]){
        int matrix[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
        //input statements
        int m=matrix.length;           //for rows
        int n=matrix[0].length;        //for columns
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        //output statements
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
