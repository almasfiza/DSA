class Solution {
    public int fib(int N) {
        if (N <= 1) return N;
        
        int a = 0, b = 1;
        while (--N > 0) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        
        return b;
    }
}