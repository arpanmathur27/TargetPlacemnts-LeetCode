class Solution {
    public int findNumbers(int[] nums) 
    {
        
        int ecount=0;
        for(int i:nums)
        {
            int count=0;
            while(i!=0)
            {
                count++;
                i/=10;
            }
            if(count%2==0)
            {
                ecount++;
            }
        }
        
      return ecount;  
    }
}    
