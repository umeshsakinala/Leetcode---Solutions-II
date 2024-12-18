class Solution {
    public int[] finalPrices(int[] prices) {
        int i=0;
        while(i < prices.length) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
            i++;
        }
        return prices;
    }
}