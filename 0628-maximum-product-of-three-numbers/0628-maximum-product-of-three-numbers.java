class Solution {
    public int maximumProduct(int[] nums) {
        int nmax1=Integer.MAX_VALUE;
        int nmax2=Integer.MAX_VALUE;

        int pmax1=Integer.MIN_VALUE;
        int pmax2=Integer.MIN_VALUE;
        int pmax3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<nmax1)
            {
                nmax2=nmax1;
                nmax1=nums[i];
            }
            else if(nums[i]<nmax2)nmax2=nums[i];
            
            if(nums[i]>pmax1)
            {
                pmax3=pmax2;
                pmax2=pmax1;
                pmax1=nums[i];
            }
            else if(nums[i]>pmax2)
            {
                pmax3=pmax2;
                pmax2=nums[i];
            }
            else if(nums[i]>pmax3)
            {
                pmax3=nums[i];
            }
        }
        return Math.max(Math.max(nmax1 * nmax2 * pmax1, nmax1 * pmax2 * pmax1), pmax1 * pmax2 * pmax3);

        
    }
}