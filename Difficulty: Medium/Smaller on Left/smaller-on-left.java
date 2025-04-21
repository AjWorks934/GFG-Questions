//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int ar[]=new int[n];
        st.push(-1);
        for(int i=0;i<n;i++){
            while(st.peek()>=arr[i]){
                st.pop();
            }
            //if(!st.isEmpty()){
                ar[i]=st.peek();
            st.push(arr[i]);
        }
        return ar;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String input = sc.nextLine();
            String[] tokens = input.trim().split("\\s+");

            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.leftSmaller(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends