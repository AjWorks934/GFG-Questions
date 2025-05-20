//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }

            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            n = a2.length;
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(a2[i]);
            }

            int ans = new Solution().maxMeetings(a, b);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code heres
        ArrayList<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            pairs.add(new int[]{start[i], end[i]});
        }
        
        pairs.sort((pair1,pair2) ->Integer.compare(pair1[1],pair2[1]));
        int prev=-1;int count=1;
        for(int i=0;i<start.length;i++){
            if(prev<pairs.get(i)[0]){
            prev=pairs.get(i)[1];
            count++;
            }
        }
        return count-1;
    }
}
