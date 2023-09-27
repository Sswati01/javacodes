//bubble sort
package Sorting;
import java.util.*;
public class BubbleSort {
    public static void bubble_sort(int array[]){
        for(int i=0;i<=array.length-2;i++){                   //outer loop for number of turns
           for(int j=0;j<=array.length-2-i;j++){              //inner loop for number of comparisons
            if(array[j]>array[j+1]){
              int temp=array[j];
              array[j]=array[j+1];
              array[j+1]=temp;
            }
           }
        }
    }
    public static void print_array(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main (String args[]){
        int array[]={5,4,1,3,2};
        bubble_sort(array);
        print_array(array);
    }
}
