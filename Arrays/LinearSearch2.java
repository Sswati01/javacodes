package Arrays;
import java.util.*;
public class LinearSearch2 {
    public static int linear_search(String fruits[],String key){
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(key)){        //.equals is use in case of strings
              return i;
            }
        }
        return -1;

    }

    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter your key: ");
        String key=s.nextLine();
        String fruits[]={"apple","banana","mango","orange","pomegranate"};
        int index=linear_search(fruits,key);
    if(index==-1){
        System.out.println("key is not found");
    }
    else{
        System.out.println("the key is: "+index);
    }
    }
}
