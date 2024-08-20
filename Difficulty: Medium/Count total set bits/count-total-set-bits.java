//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    static int largestPowerOf2(int n) {
    int x = 0;
    while ((1 << x) <= n) {
        x++;
    }
    return x - 1;
}
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
         /*We calculate the bits from 1 to 2^x - 1.
      The no. of 1s is = x*2^(x-1).where x is the largest power of 2 fr which 
      2^x is smaller than n*/
     /* then we calculate no. of MSb 1s from 2^x to n
     which is n - 2^x + 1*/
     /*then we calculate the remaining part of the 2^x to n i.e 
     is bits other than msb which can be done by taking them as from 1 to n-2^x */
   if(n==0)
   return 0;
    int x=largestPowerOf2(n);
    int bit2x= x<<(x-1);
    int msb2xtn=n-(1<<x)+1;
    int rem= n-(1<<x);
    return bit2x+msb2xtn+countSetBits(rem);
    }
}
        



// User function Template for Java



//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends