// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum+= Math.pow(digits,3);
            n/=10;
        }
        return sum==original?true:false;
    }
}