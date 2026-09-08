class Solution {
    public int countCommas(int n) {
        if(n<999)return 0;
        int c= n-1000;
        return c+1;
        
    }
}