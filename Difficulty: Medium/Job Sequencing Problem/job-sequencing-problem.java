class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<int[]> pairs=new ArrayList<>();
        for(int i=0;i<deadline.length;i++){
            pairs.add(new int[]{deadline[i],profit[i]});
        }
        pairs.sort((p1,p2)->Integer.compare(p2[1],p1[1]));
        int maxd=0;
        for(int i=0;i<deadline.length;i++){
            maxd=Math.max(maxd,deadline[i]);
        }
        int pos[]=new int[maxd+1];
        int cj=0;int tpf=0;
        for(int i=0;i<deadline.length;i++){
            int pf=pairs.get(i)[1];
            int d=pairs.get(i)[0];
            for(int j=d;j>=1;j--){
                if(pos[j]==0){
                    pos[j]=pf;
                    tpf+=pf;
                    cj++;
                    break;
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(cj);
        ans.add(tpf);
        return ans;
    }
}