//find the largest number in a given array
package Arrays;
import java.util.*;
public class LargestElement {
    public static int largest_element(int list[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<list.length;i++){
          if(list[i]>largest){
            largest=list[i];
          }  
        }
        return largest;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int list[]={3,64,8,59,65,8};
        System.out.print("the largest element is: ");
        System.out.println(largest_element(list));
    }
}
