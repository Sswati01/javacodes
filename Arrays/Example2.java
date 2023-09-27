//assignment- question1 
package Arrays;
import java.util.*;
public class Example2 {
  public static boolean distinct_(int array[]){
    for(int i=0;i<array.length-1;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]==array[j]){
                return true;
            }
        }
    }
    return false;
  }
    public static void main (String args[]){
        int array1[]={1,2,3,1};
        int array2[]={1,2,3,4};
        int array3[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println("for 1st array: "+distinct_(array1));
        System.out.println("for 2nd array: "+distinct_(array2));
         System.out.println("for 3rd array: "+distinct_(array3));
        }
    }
