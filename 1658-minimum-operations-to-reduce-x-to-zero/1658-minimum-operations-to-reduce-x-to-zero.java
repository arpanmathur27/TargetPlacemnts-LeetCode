class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0,ops=-1,n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int target=sum-x;
        sum=0;
        int left=0;
        for(int right=0;right<n;right++)
        {
            sum+=nums[right];
            while(sum>target && left<=right)
            {
                sum-=nums[left];
                left++;
            }
            if(sum==target)ops=Math.max(right-left+1,ops);
        }
        if(ops==-1)return ops;
        return n-ops;
        
    }
}