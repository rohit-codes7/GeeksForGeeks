
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int n = arr.size();
        int leftIndex = k-1;
        int rightIndex = n-k;
        
        int temp = arr.get(leftIndex);
        arr.set(leftIndex, arr.get(rightIndex));
        arr.set(rightIndex, temp);
    }
}
