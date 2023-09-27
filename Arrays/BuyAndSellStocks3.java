package Arrays;
import java.util.*;
public class BuyAndSellStocks3 {
    public static int stocks_(int prices[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyprice){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main (String args[]){
        int prices[]={7,6,4,9,3};
        System.out.println("maximum profit: "+stocks_(prices));
    }
    
}
