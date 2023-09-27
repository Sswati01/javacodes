//passing arrays as arguments
package Arrays;
import java.util.*;
public class ArraysAsArguments {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){            //this for loop is used to go every elements of an array
             marks[i]=marks[i]+1;
        }
        return;
    } 

    public static void  main (String args[]){
        Scanner s=new Scanner(System.in);
        int marks[]={23,76,98,65};
    update(marks);
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
    }
    System.out.println(" ");
    }
    
}
