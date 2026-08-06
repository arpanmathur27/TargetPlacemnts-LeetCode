class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<Integer.MAX_VALUE;i++)
        {
            int prod=1;
            int loda=i;
            while(loda>0)
            {
                int digit=loda%10;
                prod*=digit;
                loda=loda/10;

            }
            if(prod%t==0)return i;
        }
        return t;
    }
}