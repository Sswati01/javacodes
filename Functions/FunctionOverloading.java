//function overloading using parameters
//function overloading depends upon parameters not on return type
package Functions;

public class FunctionOverloading {
    public static int multiply(int a,int b){             
        int product=a*b;
        return product;
    }
    public static int multiply(int a,int b,int c){
        int product=a*b*c;
        return product;
    }
    public static void main (String args[]){
    int a=4;
    int b=5;
    int c=6;
    int d=multiply(a,b);
    int e=multiply(a,b,c);
    System.out.println(d);
    System.out.println(e);
    }
    
}
