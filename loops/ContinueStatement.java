package loops;

public class ContinueStatement {
    public static void main (String args[]){
        int i=0;
        while(i<5){
            i++;
            if(i==3){
            continue;
            }
        System.out.println(i);
     }
// for(int i=1;i<=10;i++){
//     if(i==3){
//         continue;
//     }
//     System.out.println(i);

// }
    }
}