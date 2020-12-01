/**
 * @author libingc
 * @date 2020/12/01
 */
public class sellStock {

    public int maxProfit(int[] prices) {
        int money =0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i+1]>prices[i]){
                money += prices[i+1]-prices[i];
            }
        }
        return money;
    }

}
