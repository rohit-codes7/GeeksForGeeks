// User function Template for Java

class Solution {
    static int[] getAreas(int L, int W, int B, int H, int R) {
        // code here
        int areaRect =  L * W;
        int areaTri = (int)(0.5*B*H);
        int areaCircle = (int)(3.14*R*R);
        
        
        return new int[]{areaRect,areaTri,areaCircle};
    }
};