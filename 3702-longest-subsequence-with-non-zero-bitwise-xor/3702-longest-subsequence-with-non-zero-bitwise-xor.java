class Solution {
    public int longestSubsequence(int[] nums) {
        int xora=0,count=0;
        for(int i:nums)
        {
            xora^=i;
            if(i==0)count++;
        }
        
       if(xora != 0) return nums.length;
       else
       {
            if(count==nums.length) return 0;
       }
       return nums.length-1;
    }
}