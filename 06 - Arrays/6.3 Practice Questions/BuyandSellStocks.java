public class BuyandSellStocks {
    public static int predict_max_profit(int prices[]) {
        int buying_price = Integer.MAX_VALUE, max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int selling_price = prices[i]; // today's price

            if (buying_price < selling_price) { // profit
                int profit = selling_price - buying_price; // today's profit
                max_profit = Math.max(max_profit, profit);
            } else {
                buying_price = prices[i];
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(predict_max_profit(prices));
    }
}
