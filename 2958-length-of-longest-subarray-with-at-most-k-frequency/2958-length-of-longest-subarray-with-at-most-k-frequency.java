class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;        
        int right=left;
        while(right<nums.length)
        {
            if(map.containsKey(nums[right])&&(map.get(nums[right])+1>k))            {
                res=Math.max(res,(right-left));
                while(map.get(nums[right])+1>k&&left<nums.length)
                {
                    map.put(nums[left],map.get(nums[left])-1);
                    left++;
                }
                continue;
            }
            else
            {
                map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            }
            right++;
        }  
        res=Math.max(res,(right-left)); 
        return res;
    }
}