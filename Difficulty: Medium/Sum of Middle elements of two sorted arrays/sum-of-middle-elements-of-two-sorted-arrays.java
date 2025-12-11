class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] ans = new int[n + n];

        int i = 0, j = 0, k = 0;

        // Proper merge of two sorted arrays
        while (i < n && j < n) {
            if (arr1[i] < arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }

        while (i < n) ans[k++] = arr1[i++];
        while (j < n) ans[k++] = arr2[j++];

        int mid = ans.length / 2;
        return ans[mid - 1] + ans[mid];
    }
}
