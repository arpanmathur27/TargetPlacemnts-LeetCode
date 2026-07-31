class Solution {
    public int minimumPushes(String word) {
        int []freq= new int[26];
        for(char c:word.toCharArray())
        {
            freq[c-'a']++;
        }

        Arrays.sort(freq);
        int presses=0;
        int loop=0;
        
        for(int i=25;i>=0;i--)
        {
            presses+=((loop/8)+1)*freq[i];
            loop++;
        }
        return presses;        
    }
}