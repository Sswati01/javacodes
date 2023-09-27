/*Assignment operators:
 "=" : the value of variable written in the left is assigned to the variable written in the right
 "+=" : (a=a+10) and (a+=10) are equal
 "-=" : (a=a-2) and (a-=2) are equal
 "*=" : (a=a*2) and (a*=2) are equal
 "/=" : (a=a/2) and (a/=2) are equal 
 "%=" : (a=a%2) and (a%=2) are equal*/
package operators;

public class AssignmentOperators {
    public static void main (String args[]){
    int a=10;
    int b=20;
    int c=a;
    System.out.println(c);
    System.out.println(a+=2);
    System.out.println(b-=10);
    System.out.println(c*=5);
    System.out.println(b/=5);
    System.out.println(a%=5);
    }
    
}
