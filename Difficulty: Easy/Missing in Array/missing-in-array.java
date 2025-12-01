class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;

        long expected = (long) n * (n + 1) / 2;  // use long for safety

        long actual = 0;
        for (int num : arr) {
            actual += num;
        }

        return (int) (expected - actual);
    }
}
