class Solution {
    public int minimumPushes(String word) {
        int presses=1;
        int keypad=0;
        int minp=0;
        for(char c:word.toCharArray())
        {
            minp+=presses;
            keypad++;
            if(keypad==8)
            {
                keypad=0;
                presses+=1;
            }
        }
        return minp;
        
    }
}