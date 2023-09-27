package operators;

public class PracticeQues {
    public static void main (String args[]){
//question 1:
    int x=2,y=5;
    int exp1=(x*y/x);
    int exp2=(x*(y/x));
    System.out.println(exp1+","+exp2);
//question 2:
    int a=200,b=50,c=100;
    if(a>b && b>c){
        System.out.println("hello");
    }
    if(c>b && c<a){
       System.out.println("java");
    }
    if((b+200)<a && (b+150)<c){
        System.out.println("hello java");
    }
//question 3:
    int p,q,r;
    p=q=r=2;
    p+=q;
    q-=r;
    r/=(p+q);
    System.out.println(p+","+q+","+r);
//question 4:
    int m=9,n=12;
    int e=2,f=4,g=6;
    int exp=4/3*(m+34)+9*(e+f*g)+(3+n*(12+m))/(e+f*n);
    System.out.println(exp);
//question 5:
    int i=10,j=5;
    int exp3=(j*(i/j+i/j));
    int exp4=(j*i/j+j*i/j);
    System.out.println(exp3+","+exp4);
}
}
