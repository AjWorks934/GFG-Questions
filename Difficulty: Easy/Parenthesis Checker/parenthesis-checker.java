//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {   
        Stack<Character> st= new Stack<>();
        // add your code here
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            flag=false;
            char c=s.charAt(i);
            if(c!=')'&& c!='}'&& c!=']')
                st.push(c);
            else
            {
                if(st.isEmpty())
                return false;
                    char x=st.pop();
                    if((x=='('&& c!=')')||(x=='['&& c!=']')||(x=='{'&& c!='}'))
                    return false;
                
            }
        }
        return st.isEmpty(); 
}
}
