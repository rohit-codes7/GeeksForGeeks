class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        
        for(int i  = 0 ; i <s.length();i++){
        if(freq.get(s.charAt(i))==1) return s.charAt(i);
        
        }
        return '$';
    }
}
