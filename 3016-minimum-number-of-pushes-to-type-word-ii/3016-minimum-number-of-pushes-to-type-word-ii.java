class Solution {
    public int minimumPushes(String word) {
        int [][]freq= new int[26][2];
        for(int i = 0; i < 26; i++) 
        {
            freq[i][0] = i; 
        }
        for(char c:word.toCharArray())
        {
            freq[c-'a'][1]++;
        }
        Arrays.sort(freq,(a,b)->Integer.compare(b[1],a[1]));
        int presses=0;
        
        for(int i=0;i<26;i++)
        {
            int loop=(i/8)+1;
            presses+=loop*freq[i][1];
        }
        return presses;        
    }
}