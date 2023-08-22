//https://leetcode.com/problems/remove-outermost-parentheses/description/
public class Solution {
    public String removeOuterParentheses(String s) {
        int mark=1;
        int j=1;
        String str="";
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            mark++;
            else
            mark--;
            if(mark==0)
            {
                str=str+s.substring(j,i);
                i++;
                mark=1;
                j=i+1;
            }
        }
        return str;
    }
}{

}
