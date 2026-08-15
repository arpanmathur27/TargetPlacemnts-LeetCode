class Solution {
    public int longestSubsequence(int[] nums) {
        int xora=0;
        for(int i:nums)
        {
            xora^=i;
        }
        if(xora!=0)return nums.length;
        for(int i:nums)
        {
            if((xora^=i)!=0)return nums.length-1;
        }
        return 0;
    }
}