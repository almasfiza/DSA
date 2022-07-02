class Solution {
    public int maxArea(int h, int w, int[] x, int[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        int maxX = x[0], maxY = y[0];
        for (int i = 1; i < x.length; i++) {
            maxX = Math.max(maxX, x[i] - x[i - 1]);
        }
        maxX = Math.max(maxX, h - x[x.length - 1]);
        for (int i = 1; i < y.length; i++) {
            maxY = Math.max(maxY, y[i] - y[i - 1]);
        }
        maxY = Math.max(maxY, w - y[y.length - 1]);
        return (int) ((long) maxX * (long)maxY % 1000000007L);
    }
}
/***
class Solution {
    public long maxDiff(int n, int arr[]){
        long res = 0;
        for(int i = 1; i < arr.length; i++){
            res = Math.max(res, arr[i]-arr[i-1]);
        }
        return Math.max(n-arr[arr.length-1], res);
    }
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        //following the hints
        long mod = (long)1e9+7;
        //1. Sort the arrays
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        //2. Finding the max diff bw the two consecutive elements for both the arrays.
        //max difference
        long maxH_diff = maxDiff(h, horizontalCuts);
        long maxV_diff = maxDiff(w, verticalCuts);
        
        //3. Product of the two maxH_diff and maxV_diff is the answer.
        return  (int) ((maxH_diff*maxV_diff)%mod);
        
    }
}


***/
