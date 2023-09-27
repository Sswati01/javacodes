//sort array in decending order using insertion sort
package Sorting;
import java.util.*;
public class InsertionSort2 {
    public static void insertion_sort(int array[]){
        for(int i=1;i<=array.length-1;i++){
            int current=array[i];
            int prev=i-1;
            while(prev>=0 && array[prev]<current){
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=current;
                }
                return;
    }
    public static void print_array(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main (String args[]){
        int array[]={5,7,1,9,4};
        insertion_sort(array);
        print_array(array);
    }
}
