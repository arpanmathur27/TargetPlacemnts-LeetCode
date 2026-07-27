class Solution {
    public int threeSumClosest(int[] nums, int target) {
        quickSort(nums,0,nums.length-1);
        int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                if(Math.abs(sum-target)<Math.abs(closestSum-target))closestSum=sum;
                if(sum>target)right--;
                else left++;
                
            }

        }
        return closestSum;
        
    }
    private void quickSort(int[] nums,int start,int end)
    { if(start>=end)
            return;
        int pivot = nums[end];
        int i=start;
        for(int j=i;j<end;j++)
        {
            if(nums[j]<=pivot)
                {
                    swap(nums,i,j);
                    i++;
                }
        }
        swap(nums,i, end);
        quickSort(nums,start,i-1);
        quickSort(nums,i+1,end);

    }
    private static void swap(int[] nums,int i , int j)
    {
        int c= nums[i];
        nums[i]=nums[j];
        nums[j]=c;
        return;
    }
}