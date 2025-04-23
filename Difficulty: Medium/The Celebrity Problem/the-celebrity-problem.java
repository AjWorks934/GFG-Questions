//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int count=0;
        for(int j=0;j<mat.length;j++){
            count=0;
            for(int i=0;i<mat.length;i++){
                if(mat[i][j]==1)
                    count++;
                else
                    break;
            }
            if(count==mat.length){
                for(int i=0;i<mat.length;i++){
                    if(i!=j && mat[j][i]==0)
                        count--;
                }
                if(count==1)
                    return j;
            }
        }
        return -1;
    }
}