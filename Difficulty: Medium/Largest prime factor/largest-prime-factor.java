// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        
        if(isPrime(n)) return n;
        // code here
        // first calculate the factors of n
        int max = -1;
        for(int i = 2;i<=Math.sqrt(n);i++){
            
            if(n%i==0){
                if(isPrime(i)) max = Math.max(max,i);
                if(isPrime(n/i)) max = Math.max(max, n/i);
            }
        }
        return max;
        
    }
    private static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        
        for(int i = 3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}