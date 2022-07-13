/*
1. Sort the array
2. Sum from i=1 to i=len-2
3. Divide sum by len-2

Time complexity - O(nlogn)
---------------------------

1. Find sum of all elements and max and min elements in one loop
2. Subtract sum - (max+min) / len-2

Time complexity - O(n)

-----------------------------

1. Find max min in one loop
2. Find sum in another loop
3. sum - (max+min) / len-2

Time complexity - 2  O(n)

We will check each of the last two's time.

*/
class Solution {
    public double average(int[] salary) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
            if(salary[i] > max) max = salary[i];
            if(salary[i] < min) min = salary[i];
        }
        
        double res = (double) (sum - (max+min))/(salary.length-2);
        
        return res;
        
    }
}