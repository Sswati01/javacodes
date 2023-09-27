package JavaBasics;
import java.util.*;
public class input {
    public static void main (String args[]){              //.next() function captures the value until any space comes
        Scanner s = new Scanner(System.in);               //we can use anything in place of this s. it's an object
        String name=s.nextLine();                        //this .nextLine() function captures the value after space also
        System.out.println(name);                
        int number=s.nextInt();                           //this .nextInt() function takes integer as input
        System.out.println(number);
        float love=s.nextFloat();                        //this .nextFloat() function takes float value as input
        System.out.println(love);
        boolean my=s.nextBoolean();
        System.out.print(my); 
        
    }
    
}
//inputs-next,nextLine,nextInt,nextFloat,nextByte,nextDouble,nextBoolean,nextShort,nextLong