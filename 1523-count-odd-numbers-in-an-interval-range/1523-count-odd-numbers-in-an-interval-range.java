/*
Naive solution - for loop
num[i] % 2 != 0, count ++
O(n)

----------------------------
3,4,5,6,7 > 3
1,2,3 > 2 
8 9 10 > 1






*/
class Solution {
    public int countOdds(int low, int high) {
        int range = high - low;
       
        if(low % 2 == 0 && high % 2 == 0){
            return range/2; 
        }
        else{
            return range/2 + 1;
        }
        
    }
}