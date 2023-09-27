//best time to buy and sell stocks
package Arrays;
import java.util.*;
public class BuyAndSellStocks {
    public static int stocks_(int  prices[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;
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
        int prices[]={7,1,5,6,4};
        System.out.println("maximum profit: "+stocks_(prices));
    }
}
