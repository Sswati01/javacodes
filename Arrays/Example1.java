//assignment- question 2
//array={4,5,6,7,0,1,2}
//target=0,3
package Arrays;
import java.util.*;
public class Example1 {
    public static int search_index(int nums[],int target){
    for(int i=0;i<nums.length;i++){
        if(target==nums[i]){
            return i;
        }
    }
    return -1;
}
    public static void main (String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=3;
        int index=search_index(nums,target);
        if(index==-1){
            System.out.println("key not found");
            }
            else{
            System.out.print("the index of given key is: "+index);
            }
            }
        }
    
    

