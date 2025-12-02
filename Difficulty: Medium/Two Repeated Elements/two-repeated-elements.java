class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        int[] ans = new int[2];
        for(var x: arr){
            if(set.contains(x)){
                ans[idx++] = x;
            }
            else{
                set.add(x);
            }
        }
        
        return ans;
    }
}