// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum =0;
        while(n>0){
            int digits = n%10;
            sum += digits;
            n/=10;
        }
        return isPalindrome(sum);
    }
    
    boolean isPalindrome (int n){
        int original = n;
        
        int reverse =0;
        while(n>0){
            int digits = n%10;
            reverse = reverse * 10+ digits;
            n/=10;
        }
        return  reverse==original?true:false;
    }
}