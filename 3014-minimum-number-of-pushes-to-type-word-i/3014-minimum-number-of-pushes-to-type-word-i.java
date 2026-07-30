class Solution {
    public int minimumPushes(String word) {
        int n= word.length();
        int presses=0;
        int loop=1+n/8;
        for(int i=1;i<loop;i++)
        {
            presses+=i*8;
        }
        presses+=loop*(n%8);

        return presses;
        
    }
}