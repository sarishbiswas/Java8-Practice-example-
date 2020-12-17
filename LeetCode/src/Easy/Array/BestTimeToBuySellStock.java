package Easy.Array;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(minValue>prices[i])
                minValue = prices[i];
            else if(prices[i]-minValue>maxProfit)
                maxProfit = prices[i]-minValue;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
