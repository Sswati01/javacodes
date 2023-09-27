//linear search-find the index of an element of a given array
package Arrays;
import java.util.*;
public class LinearSearch {
    public static int linear_search(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
    }
    return -1;
    }
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int numbers[]={2,4,6,8,10,12,14,16,18,20};
    int key=10;
    int index=linear_search(numbers,key);
    if(index==-1){
        System.out.println("key is not found");
    }
    else{
    System.out.println("key is at index: "+index);
    }
}
}
