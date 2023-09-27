//print out the sum of the numbers in the second row 
package TwoDarrays;
import java.util.*;
public class Example2 {
    public static int sum_(int nums[][]){
        int sum=0;
        for(int i=0;i<nums[0].length;i++){
            sum+=nums[1][i];
                }
        return sum;
    }
    public static void main (String args[]){
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sum_(nums));
    }
}
