class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;        
        int right=left;
        while(right<nums.length)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k&&left<nums.length)
            {
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            res=Math.max(res,(right-left+1));
            right++;
        }
        return res;
    }
}