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