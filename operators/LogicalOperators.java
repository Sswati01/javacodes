/*logical operator: 
logical and(&&)- it gives true only when both the statments are true
logical or(||)- it gives true when both or either one of the statements are true
logical not/not operator(!)- it will give true if statement is false and will give false if the statement is true  */
package operators;

public class LogicalOperators {
    public static void main (String args[]){
    int x=34;
    int y=35;
    int z=34;
    System.out.println((x==z)&&(x==34));
    System.out.println((y>z)||(x>y));
    System.out.println(!(x==z));
    }
    
}
