class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>s=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums[0];
        int m=nums[nums.length-1];
        for(int i=n;i<m;i++)
        {
            s.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
            {
                s.remove(Integer.valueOf(nums[i]));
            }
        }
        return s;
    }
}