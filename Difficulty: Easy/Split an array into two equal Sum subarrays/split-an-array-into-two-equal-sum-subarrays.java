//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length;
        if(n==1)
        return false;
        int pre[]=new int[n];
        pre[0]=0;
        int suf[]=new int[n];
        suf[n-1]=0;
        for(int i =1;i<n;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        for(int i =n-2;i>=0;i--){
            suf[i]=suf[i+1]+arr[i+1];
        }
        for(int i =0;i<n;i++){
            suf[i]-=arr[i];
            if(pre[i]==suf[i])
                return true;
        }
        return false;
    }
}