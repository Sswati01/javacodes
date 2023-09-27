//program to print all prime numbers in a range
package Functions;
import java.util.*;
public class PrimeInRange {
    public static boolean checkprime(int n){
        if(n==2){
        return true;
        }
        else{
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){                  
            if(n%i==0){
                return false;
            }
        }
            return true;
    }
        }

    public static void printprime(int n){
        for(int i=2;i<=n;i++){
                if(checkprime(i)){
                    System.out.print(i+" ");
                }
             }
             System.out.println();
        return;
    }
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("enter your range: ");
    int n=s.nextInt();
    printprime(n);
    }
    }
