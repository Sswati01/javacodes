//count sort
package Sorting;
import java.util.*;
public class CountSort {
    public static void count_array(int array[]){
        int largest=Integer.MIN_VALUE;
        //loop for finding largest value in the array
        for(int i=0;i<array.length;i++){
            largest=Math.max(largest,array[i]);
        }
        //loop for building cound array;
        int countarr[]=new int[largest+1];
        for(int i=0;i<array.length;i++){
            countarr[array[i]]++;
        }
        //loop for modifying original array
        int j=0;
        for(int i=0;i<countarr.length;i++){
            while(countarr[i]>0){
                array[j]=i;
                j++;
                countarr[i]--;
            }
        }
    }
    public static void print_array(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main (String args[]){
        int array[]={1,4,1,3,2,4,3,7};
        count_array(array);
        print_array(array);
    }
}
