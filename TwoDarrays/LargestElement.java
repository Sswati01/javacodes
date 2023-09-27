//finding largest element in 2D array
package TwoDarrays;
import java.util.*;
public class LargestElement {
    int largest=Integer.MIN_VALUE;
    public static int largest_element(int matrix[][]){
            int largest=Integer.MIN_VALUE;
for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]>largest){
                largest=matrix[i][j];
            }
        }
     }
     return largest;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("the largest element is: "+largest_element(matrix));
    }
}
