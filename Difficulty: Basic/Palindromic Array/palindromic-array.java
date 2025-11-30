/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(var num:arr){
            if(!palindrome(num)) return false;
            
        }
        return true;
    }
    static boolean palindrome(int n){
        
        int original = n;
        int reverse = 0;
        
        while(n>0){
        int digit = n%10;
        reverse = reverse*10 + digit;
        n/=10;
        }
        return original == reverse;
    }
}