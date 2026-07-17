class Solution {
    public int maxArea(int[] height) {
        int left=0;int right =height.length-1;
        int max=0;
        while(left<=right)
        {
            int currMax=(Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right])left++;
            else right--;
            max=Math.max(max,currMax);
        }
        return max;
        
    }
}