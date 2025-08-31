
public class MaximumWealth {

    // Problem: 1672. Richest Customer Wealth
    // Source: LeetCode
    // Approach: Sum each customer's account wealth and track the maximum

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                wealth += accounts[row][col];
            }
            if (max < wealth) {
                max = wealth;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Example Test Case
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Output: " + maximumWealth(accounts));  // Output: 6

        /*
        Other Test Cases:
        Input: accounts = {{1,5},{7,3},{3,5}}
        Output: 10

        Input: accounts = {{2,8,7},{7,1,3},{1,9,5}}
        Output: 17
        */
    }
}
