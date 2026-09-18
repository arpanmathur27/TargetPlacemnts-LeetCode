class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        else
        {
        int count=0;
        for(char a:Integer.toBinaryString(n).toCharArray())
        {
            if(a=='1')count++;
            if(count>1)return false;
        }
        return true;
        }
        
    }
}