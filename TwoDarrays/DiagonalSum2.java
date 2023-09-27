//optimized way to calculate diagonal sum
package TwoDarrays;
import java.util.*;
public class DiagonalSum2 {
    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i !=matrix.length-i-1){
            sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main (String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       System.out.println("the sum of diagonal elements is: "+diagonal_sum(matrix));
        }
}
