//unary- ++,--        in unary only one operand is required
/* increment operator-post(a++) or pre(++a) increment   
*/
//(a=a-1),(a--),(--a),all are same   (decrement operator)
package operators;

public class UnaryOperators {
    public static void main (String args[]){
//pre incrementor
    int a=10;
    int b= ++a;                //firstly value a is changed and then it is used
    System.out.println(a);
    System.out.println(b);
//post incrementor
    int x=11;
    int y= x++;              //firstly value of x is used and then it is changed
    System.out.println(x);
    System.out.println(y);    
//pre decrementor
    int p=10;
    int q= --p;                //firstly value p is changed and then it is used
    System.out.println(p);
    System.out.println(q);
//post decrementor
    int m=11;
    int n= m--;              //firstly value of m is used and then it is changed
    System.out.println(m);
    System.out.println(n);  
}
    
}
