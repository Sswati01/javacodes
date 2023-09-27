package JavaBasics;
import java.util.*;
public class AreaofCircle {
    public static void main (String args[]){
        float pie=3.14f; 
        Scanner s=new Scanner(System.in);
        float radius=s.nextFloat();
        float area=(pie*radius*radius);
        System.out.println(area);

    }
    
}
