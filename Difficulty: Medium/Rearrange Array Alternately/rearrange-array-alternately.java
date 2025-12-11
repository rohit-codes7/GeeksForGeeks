class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int r = 0;
int l = arr.length - 1;
int i = 0;

int[] ans = new int[arr.length];

while (r <= l) {
    if (i < arr.length) ans[i++] = arr[l--];
    if (i < arr.length) ans[i++] = arr[r++];
}

for (int k = 0; k < arr.length; k++) {
    arr[k] = ans[k];
}
        
    }
}
