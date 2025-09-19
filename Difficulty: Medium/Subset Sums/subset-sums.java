// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
       ArrayList<Integer> result = new ArrayList<>();
        dfs(arr, 0, 0, result);
        return result;
    }

    private void dfs(int[] arr, int index, int currSum, ArrayList<Integer> result) {
        if (index == arr.length) {
            result.add(currSum);
            return;
        }

        // choice 1: include current element
        dfs(arr, index + 1, currSum + arr[index], result);

        // choice 2: exclude current element
        dfs(arr, index + 1, currSum, result);
    }
    
}