//pairs in an array
package Arrays;
import java.util.*;
public class PairsInArrays {
    public static void pairs_in_array(int array[]){
        int tp=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+")");
                tp++;
            }
            System.out.println(" ");
        }
        System.out.println("total number of pairs are: "+tp);    //tp=n(n-1)/2
        return;
    }
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int array[]={4,7,6,8,9,3};
    pairs_in_array(array);
    }
}
