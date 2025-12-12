class Solution {
    public int findSum(String s) {
        long current = 0;
        long sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                current = current * 10 + (ch - '0');
            } else {
                sum += current;
                current = 0; // ← You missed this!
            }
        }

        sum += current; // last number
        return (int) sum;
    }
}
