// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        
        int place =0;
        int r = b.length()-1;
        
        int decimal = 0;
        while(r>=0){
            int bit= b.charAt(r)-'0';
            decimal += bit* Math.pow(2,place);
            place++;
            r--;
        }
        return decimal;
    }
}