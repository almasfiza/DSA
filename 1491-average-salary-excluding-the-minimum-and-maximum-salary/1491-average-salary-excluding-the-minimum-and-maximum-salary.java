/*
1. Sort the array
2. Sum from i=1 to i=len-2
3. Divide sum by len-2

Time complexity - O(nlogn)

Runtime: 1 ms, faster than 39.92% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
Memory Usage: 43 MB, less than 6.94% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
---------------------------

1. Find sum of all elements and max and min elements in one loop
2. Subtract sum - (max+min) / len-2

Time complexity - O(n)

0 ms, faster than 100.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
42MB

-----------------------------

1. Find max min in one loop
2. Find sum in another loop
3. sum - (max+min) / len-2

Time complexity - 2  O(n)
0 ms, faster than 100.00% of Java online submissions for Average Salary Excluding the Minimum and Maximum Salary.
42MB

We will check each of the last two's time.

*/
class Solution {
    public double average(int[] salary) {
        
        int sum = 0;
        
        Arrays.sort(salary);
        for(int i = 1; i < salary.length-1; i++){
            sum += salary[i];
        }
        
        double res = (double) (sum)/(salary.length-2);
        
        return res;
        
    }
}