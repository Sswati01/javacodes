//addition of two matrices
package TwoDarrays;
import java.util.*;
public class Addition {
    public static void addition(int matrix1[][], int matrix2[][]){
        int matrix3[][]=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix3.length;i++){
            for(int j=0;j<matrix3[0].length;j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i=0;i<matrix3.length;i++){
            for(int j=0;j<matrix3[0].length;j++){
            System.out.print(matrix3[i][j]+" ");
         }
         System.out.println();
        }
        return;
    }
    public static void main (String args[]){
        int matrix1[][]={{1,5,2},
                         {4,3,6},
                         {7,4,3}};
        int matrix2[][]={{1,8,2},
                         {1,3,9},
                         {7,4,2}};
        addition(matrix1,matrix2);
        }
}
