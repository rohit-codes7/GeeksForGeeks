// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] ans = s.toCharArray();
        
       int start  = 0;
       int end = ans.length-1;
       
       while(start<end){
           char temp = ans[start];
           ans[start] = ans[end];
           ans[end] = temp;
           start++;
           end--;
       }
       
       return new String(ans);
    }
}