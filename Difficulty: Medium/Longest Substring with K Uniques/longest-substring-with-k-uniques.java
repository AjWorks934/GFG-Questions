//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> mp=new HashMap<>();
        int l=0;int r=0;int n=s.length();int len=-1;
        while(r<n){
            char ch=s.charAt(r);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.size()>k){
                char left=s.charAt(l);
                mp.put(left,mp.get(left)-1);
                if(mp.get(left)==0)
                mp.remove(left);
                l++;
            }
            if(mp.size()==k)
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}