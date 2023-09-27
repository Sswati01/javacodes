//finding maximum value of subarrays using kadane's algorithm
package Arrays;
import java.util.*;
public class kadanes {
    public static void kadanes_(int array[]){
        int largest=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<array.length;i++){
                    sum+=array[i];
                    if(sum<0){
                        sum=0;
                    }
                        if(sum>largest){
                            largest=sum;
                        }
                     }
            System.out.println("maximum value: "+largest);
        return;
         }
    public static void main (String args[]){
    int array[]={-2,-3,4,-1,-2,1,5,-3};
kadanes_(array);
    }
    
}
