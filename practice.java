import java.util.*;
public class practice{
public static void subarray(int array[]){
    int ts=0;
    for(int i=0;i<array.length;i++){
        for(int j=i;j<array.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(array[k]+" ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total subarrays: "+ts);
}

public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    int array[]={2,4,6,8,10};
   subarray(array);
}  
}