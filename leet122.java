public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int store = 0;
        int length = prices.length;
        int price = 0;
        int profit = 0;
        for(int i = 0; i < length; i++) {
        	if(store == 0) {
        		if(i < length - 1) {
        			if(prices[i+1] > prices[i]) {
        				store = 1;
        				price = prices[i];
        			}
        		}
        	} else{
        		if(i < length - 1) {
        			if(prices[i+1] < prices[i]) {
        				store = 0;
        				profit += prices[i] - price;
        				price = 0;
        			}
        		} else {
        			store = 0;
    				profit += prices[i] - price;
    				price = 0; 
        		}
        	}
        }
        return profit;
    }
}


public class Solution {
public int maxProfit(int[] prices) {
    int total = 0;
    for (int i=0; i< prices.length-1; i++) {
        if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
    }
    
    return total;
}