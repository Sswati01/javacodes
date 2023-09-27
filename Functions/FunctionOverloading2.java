//function overloading using parameters
package Functions;

public class FunctionOverloading2 {
    public static int sum(int a,int b){             
        int sum=a+b;
        return sum;
    }
    public static float sum(float a,float b){
        float sum=a+b;
        return sum;
    }
    public static void main (String args[]){
        System.out.println(sum(4,5));
        System.out.println(sum(4.5f,4.5f));
    }
    
}
