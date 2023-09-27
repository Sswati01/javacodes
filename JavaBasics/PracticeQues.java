package JavaBasics;
import java.util.*;
public class PracticeQues {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    
//average of three numbers:
float a=s.nextFloat();
float b=s.nextFloat();
float c=s.nextFloat();
float average=(a+b+c)/3;
System.out.println("the average is: "+average);

//area of square:
float side=s.nextFloat();
float area=side*side;
System.out.println("the area of the square is: "+area);

//bill:
float pen=s.nextFloat();
float pencil=s.nextFloat();
float eraser=s.nextFloat();
float price=pen+pencil+eraser;
float gst=0.18f*price;
float bill=pen+pencil+eraser+gst;
System.out.println("you total bill is: "+bill);

    }
    
}
