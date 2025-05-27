class Solution {
    // Function to find all possible paths
    ArrayList<String> ans=new ArrayList<>();
    void solve(int i,int j,int [][]maze,String temp,int n){
        if(i<0 || i>n-1 || j<0 || j>n-1 || maze[i][j]==0){
            return;
        }
        if(i==n-1&&j==n-1){
            ans.add(temp);
            return;
        }
        maze[i][j]=0;
        //D
        solve(i+1,j,maze,temp+'D',n);
        //L
        solve(i,j-1,maze,temp+'L',n);
        //R
        solve(i,j+1,maze,temp+'R',n);
        //U
        solve(i-1,j,maze,temp+'U',n);
        
        maze[i][j]=1;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        String temp="";
        solve(0,0,maze,temp,maze.length);
        return ans;
    }
}