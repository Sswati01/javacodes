package Arrays;
import java.util.*;
public class OperationsOnArray {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
       //creation of array
       //here marks is an empty array
        int marks[]=new int[45];      //size of an array can not be changed once it is declared
        int numbers[]={1,2,3};
        String fruits[]={"apple","mango","banana"};
        //input
        marks[0]=s.nextInt();   //physics
        marks[1]=s.nextInt();   //chemistry
        marks[2]=s.nextInt();   //maths
        //output 
        System.out.println("physics: "+marks[0]);
        System.out.println("chemistry: "+marks[1]);
        System.out.println("maths: "+marks[2]);
        //update
        marks[2]=100;
          System.out.println("updated maths marks: "+marks[2]);
        marks[1]=marks[1]+4;
        System.out.println("updated chemistry marks: "+marks[1]);
        //to find percentage
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage: "+percentage+'%');
        //to find length of an array
       System.out.println("the length of array marks is: "+marks.length);        

    }
}
