public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] price) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        for(int i=0;i<price.length;i++){
            minprice = Math.min(minprice,price[i]);
            maxprofit = Math.max(maxprofit,price[i]-minprice);
        }
        return maxprofit;
    }
}
