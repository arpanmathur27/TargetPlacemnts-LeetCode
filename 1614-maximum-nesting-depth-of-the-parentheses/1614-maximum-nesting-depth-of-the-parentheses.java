class Solution {
    public int maxDepth(String s) {
        Stack<Character>stack=new Stack<>();
        int depth=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')stack.push(c);
            depth=Math.max(depth,stack.size());
            if(c==')')stack.pop();
        }
        return depth;
        
    }
}