//sort array in decending order using bubble sort
package Sorting;
import java.util.*;
public class BubbleSort3 {
    public static void bubble_sort(int array[]){
        for(int i=0;i<=array.length-2;i++){
            for(int j=0
            ;j<=array.length-2-i;j++){
               if(array[j]<array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
               }
            }
        }
        return;
    }
    public static void print_array(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main (String args[]){
        int array[]={5,7,4,8,3};
        bubble_sort(array);
        print_array(array);
    }
}
