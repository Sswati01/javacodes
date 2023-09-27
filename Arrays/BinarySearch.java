//find the index of an element by using binary search
//prerequisite-sorted arrays wether in increasing order or decreasing order
package Arrays;
import java.util.*;
public class BinarySearch {
    public static int binary_search(int array[],int key){
    int start=0;
    int end=array.length-1;
    while(start<=end){
    int mid=(start+end)/2;
    if(array[mid]==key){
        return mid;
    }
    else if(array[mid]<key){
        start=mid+1;
    }
    else{
        end=mid-1;
    }

    }    
    return -1;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int array[]={2,4,6,8,10,12,14};
        System.out.print("enter the key: ");
        int key=s.nextInt();
         int a=binary_search(array,key);
         if(a==-1){
            System.out.println("key not found");
         }
         else{
            System.out.println("the index number is: "+a);
         }
    }
}
