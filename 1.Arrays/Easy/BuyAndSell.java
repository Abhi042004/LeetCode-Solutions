public class BuyAndSell {
    public static void main(String[] args) {
        
        // Brute Force
        // int[] prices = {7,1,2,14};

        // int profit = 0;

        // for (int i = 0; i < prices.length; i++) {

        //     for (int j = i+1; j <= prices.length-1; j++) {
        //         profit = Math.max(prices[j]-prices[i], profit);
        //     }
            
        // }

        // System.out.println("This is the maximum profit: "+profit);

        int[] prices = {2,4,1};
        int min = prices[0];
        int cost = 0;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            cost = prices[i] - min;

            profit = Math.max(profit, cost);

            min = Math.min(min, prices[i]);
            
        }

        System.out.println(profit);

    }
}
