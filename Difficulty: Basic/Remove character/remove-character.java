// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        boolean [] present = new boolean[26];
        
        
        for(char ch: str2.toCharArray()){
            present[ch-'a'] = true;
        }
        
        StringBuilder ans = new StringBuilder();

        
        for(char ch: str1.toCharArray()){
            if(!present[ch-'a']){
                ans.append(ch);
            }
        }
        
        return ans.toString();
    }
}