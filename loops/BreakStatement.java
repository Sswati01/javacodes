//break- to exit a loop
package loops;

public class BreakStatement {
    public static void main (String args[]){
    int i=0;
    while(i<5){
        System.out.println(i);
        i++;
        if(i==3){
            break;
        }
    }
    System.out.println("i'm out of the loop");
    }
    
}
