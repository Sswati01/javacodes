//insertion sort
package Sorting;
import java.util.*;
public class InsertionSort {
    public static void insertion_sort(int array[]){
    for(int i=1;i<=array.length-1;i++){
        int curr=array[i];                      //first element of unsorted part
        int prev=i-1;                           //index of last element of sorted part
        while(prev>=0 && array[prev]>curr){
            array[prev+1]=array[prev];
            prev--;

        }
        //insertion 
        array[prev+1]=curr;
    }
    }
    public static void print_array(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main (String args[]){
        int array[]={5,4,1,3,2};
        insertion_sort(array);
        print_array(array);

        
    }
}
