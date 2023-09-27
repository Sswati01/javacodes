//finding maximum and minimum sum of subarrays using prefix sum method
package Arrays;
import java.util.*;
public class PrefixSum {
    public static void prefix_sum(int array[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int sum=0;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<=prefix.length-1;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<=array.length-1;i++){
            for(int j=i;j<=array.length-1;j++){
                 sum= i==0?prefix[j]:prefix[j]-prefix[i-1];
                 if(sum>largest){
                    largest=sum;
                 }
                 if(sum<smallest){
                    smallest=sum;           
                      }
            }
        }
        System.out.println("maxvalue: "+largest);
        System.out.println("minvalue: "+smallest);
        
    }
    public static void main (String args[]){
    int array[]={1,5,1,0};
    prefix_sum(array);
    }
    
}
