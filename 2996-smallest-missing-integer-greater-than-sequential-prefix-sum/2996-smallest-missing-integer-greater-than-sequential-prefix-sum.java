class Solution {
    public int missingInteger(int[] nums) {
        int lsp=nums[0];
        Set<Integer>set=new HashSet<>();
        for (int i=1;i<nums.length;i++)
        {

            if(nums[i]!=nums[i-1]+1)break;
            else
            {
                lsp+=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        while(set.contains(lsp))
        {
            lsp++;
        }
        return lsp;
        
    }
}