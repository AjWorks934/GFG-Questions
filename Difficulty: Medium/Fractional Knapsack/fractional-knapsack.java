class Solution {
    double fractionalKnapsack(int[] val, int[] wt, int W) {
        // code here
        double ans=0.000000d;
        ArrayList<double[]> pairs=new ArrayList<>();
        for(int i=0;i<val.length;i++){
            pairs.add(new double[]{val[i],wt[i]});
        }
        
        pairs.sort((p1,p2)->Double.compare(((double)p2[0]/(double)p2[1]),((double)p1[0]/(double)p1[1])));
        
        for(int i=0;i<val.length;i++){
            if(W>=pairs.get(i)[1]){
                W-=pairs.get(i)[1];
                ans+=pairs.get(i)[0];
            }
            else{
                ans+=((double)pairs.get(i)[0]/(double)pairs.get(i)[1])*(W);
                break;
            }
        }
       return ans; 
    }
}