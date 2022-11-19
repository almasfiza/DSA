//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap <Long, Long> hmA = new HashMap<Long, Long> ();
        HashMap <Long, Long> hmB = new HashMap<Long, Long> ();
        
        for(int i = 0; i < N; i ++){
            if(hmA.containsKey(A[i])){
                hmA.put(A[i], hmA.get(A[i])+1L);
            }
            else{
                hmA.put(A[i], 1L);
            }
            if(hmB.containsKey(B[i])){
                hmB.put(B[i], hmB.get(B[i])+1L );
            }
            else{
                hmB.put(B[i], 1L);
            }
        }
        
        return hmA.equals(hmB);
    }
}