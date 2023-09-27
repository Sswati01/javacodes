package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSorting {
    public static void main (String args[]){
        Integer array[]={4,7,1,6,8};
        Integer arr[]={4,6,3,1,2};
        Arrays.sort(array);                       //for ascending order
        for(int i=0;i<array.length;i++){ 
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr,0,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

     Arrays.sort(array,Collections.reverseOrder());             //for decending order
        for(int i=0;i<array.length;i++){                        //reverse function always works on objects
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
