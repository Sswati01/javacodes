//finding maximum and minimum sum of sub arrays using brute force
package Arrays;
import java.util.*;
public class BruteForce {
    public static void brute_force(int array[]){
        int ts=0;
        int sum=0;
        int maxvalue=Integer.MIN_VALUE;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                sum=0;
                 for(int k=i;k<=j;k++){
                  sum+=array[k];
                 }
        System.out.println("sum of current subarray: "+sum);

                 if(sum>maxvalue){
                    maxvalue=sum;
                 }
                 if(sum<minvalue){
                    minvalue=sum;
                 }
                 ts++;
            }
        }    
        System.out.println("total subarrays: "+ts);
        System.out.println("maximum value is: "+maxvalue);
        System.out.println("minimum value is: "+minvalue);
       return;
    }
    public static void main (String args[]){
    int array[]={2,4,6,7};
    brute_force(array);
    }
}
