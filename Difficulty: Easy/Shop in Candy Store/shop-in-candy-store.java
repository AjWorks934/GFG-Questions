// User function Template for Java

class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(candies);
        //min cost
        int i=0;int j=N-1; int minp=0;
        while(i<=j){
            minp+=candies[i];
            j=j-K;
            i++;
        }
        ans.add(minp);
        i=0;j=N-1;int maxp=0;
        while(i<=j){
            maxp+=candies[j];
            i=i+K;
            j--;
        }
        ans.add(maxp);
        return ans;
    }
}