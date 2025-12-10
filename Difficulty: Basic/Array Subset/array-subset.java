
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(var x:a){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        for(var x:b){
            Integer count = freq.get(x);
            if(count == null || count == 0) return false;
            
            freq.put(x, count -1);
        }
        
        return true;
    }
}
