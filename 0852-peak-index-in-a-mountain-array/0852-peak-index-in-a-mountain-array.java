class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int midx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[midx]<arr[i])
            {
                midx=i;
            }
        }
        return midx;
        
    }
}