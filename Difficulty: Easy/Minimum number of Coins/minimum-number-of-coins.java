class Solution {
    public int findMin(int n) {
        int[] coins = {10, 5, 2, 1};  // denominations
        int count = 0;

        for (int coin : coins) {
            if (n == 0) break;
            count += n / coin;   // take as many as possible of this coin
            n = n % coin;        // reduce remaining amount
        }

        return count;
    }
}
