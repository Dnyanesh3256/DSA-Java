// Q. Richest Customer Wealth - (Leetcode - 1672)

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int currWealth = 0;
            for(int j=0; j<accounts[i].length; j++){
                currWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int accounts[][] = {
            {1, 5},
            {7, 3},
            {3, 5}
        };

        System.out.println(maximumWealth(accounts));
    }
}
