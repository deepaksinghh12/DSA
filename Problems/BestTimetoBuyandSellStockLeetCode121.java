// Declare a public class named 'BestTimetoBuyandSellStockLeetCode121'
// The file name must match this class name
public class BestTimetoBuyandSellStockLeetCode121 {

    // Define a method that calculates the maximum profit
    // from a single buy and sell operation
    public int maxProfit(int[] prices) {
        // Start by setting minPrice to the largest possible value,
        // so any stock price will be smaller initially
        int minPrice = Integer.MAX_VALUE;

        // Initialize maxProfit to 0 (default if no profit is possible)
        int maxProfit = 0;

        // Loop through each price in the prices array
        for (int price : prices) {
            // If the current price is less than the minimum price seen so far,
            // update the minPrice to current price (consider buying here)
            if (price < minPrice) {
                minPrice = price;
            }
            // Else, calculate profit by selling at the current price
            // and check if it's the highest profit seen so far
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        // Return the maximum profit calculated
        return maxProfit;
    }

    // Main method — entry point when you run this Java program
    public static void main(String[] args) {
        // Create an object of the class to call the non-static maxProfit method
        BestTimetoBuyandSellStockLeetCode121 ex = new BestTimetoBuyandSellStockLeetCode121();

        // Define an array of stock prices where prices[i] is the price on day i
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Call the maxProfit method and store the result
        int result = ex.maxProfit(prices);

        // Print the result to the console
        System.out.println("Maximum Profit: " + result); // Output: 5
    }
}
// This code calculates the maximum profit from buying and selling a stock once.
// It iterates through the prices, updating the minimum price seen so far,
