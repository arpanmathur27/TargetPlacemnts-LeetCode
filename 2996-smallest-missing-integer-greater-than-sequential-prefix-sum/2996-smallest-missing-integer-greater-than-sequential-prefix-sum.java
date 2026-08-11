class Solution {
    public int missingInteger(int[] nums) {
        int lsp=nums[0];
        
        for (int i=1;i<nums.length;i++)
        {

            if(nums[i]!=nums[i-1]+1)break;
            else
            {
                lsp+=nums[i];
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(lsp==nums[i])
            {
                lsp++;
                System.out.println(lsp);
            }
        }
        return lsp;
        
    }
}