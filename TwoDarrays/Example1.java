//print number of 7's that are in the 2d array
package TwoDarrays;
import java.util.*;
public class Example1 {
    public static int a(int matrix[][]){
        int num=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==8){
                    num++;
                }
            }
        }
        return num;
    }
    public static void main (String args[]){
        int matrix[][]={{4,7,8},{8,8,7}};
        System.out.println(a(matrix));
    }
}
