class Solution {
    
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        
        int temp = n;
        
        while(temp > 0){
            int lastDig = temp % 10;
            sum += lastDig;
            prod *= lastDig;
            temp = temp / 10;
        }
        
        return (prod - sum);
        
    }
}