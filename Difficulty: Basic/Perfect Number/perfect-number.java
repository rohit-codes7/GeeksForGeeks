// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
        int original =N;
        int sum  = 0;
        while(N>0){
            int digits = N%10;
            sum+= fact(digits);
            N/=10;
        }
        
        return sum==original?1:0;
    }
    
    
    private static int fact(int n){
        if(n<=1) return 1; // for 0 and 1 its always 1
        
        return n* fact(n-1);
    }
}