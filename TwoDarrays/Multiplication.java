//multiplication of two arrays 
package TwoDarrays;
import java.util.*;
public class Multiplication {
public static void multiplymatrices(int matrix1[][], int matrix2[][]) {
    int rows1 = matrix1.length;
    int cols1 = matrix1[0].length;
    int cols2 = matrix2[0].length;
    if (cols1 != matrix2.length) {
          System.out.println("the dimensions of the matrices are not suitable for multiplication");            }
    int[][] result = new int[rows1][cols2];
    for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < cols2; j++) {
            int sum = 0;
        for (int k = 0; k < cols1; k++) {
            sum += matrix1[i][k] * matrix2[k][j];
                    }
            result[i][j] = sum;
                }
            }
    for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int matrix1[][]={{1,2},{3,4},{5,6}};
        int matrix2[][]={{1,2,3},{4,5,6}};
        multiplymatrices(matrix1,matrix2);
        }    
}
