//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    static void sortedins(Stack<Integer> s,int x)
    {  if(s.isEmpty()||s.peek()<x){
        s.push(x);
        return;
    }
         
        int y=s.pop();
        sortedins(s, x);
        s.push(y);
            
        
}
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        // add your code here
        if(s.isEmpty()){
            return s;
        }
        int x =s.pop();
        sort(s);
        sortedins(s,x);
        return s;
    }
}