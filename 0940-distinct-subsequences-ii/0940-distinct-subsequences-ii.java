class Solution {
    public int distinctSubseqII(String s) {
        int total=0;
        int dp[]= new int[26];
        int MOD = 1000000007;

        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i)-'a';
            int add=(total - dp[c] + MOD) % MOD;

            dp[c]=total+1;
            total=(dp[c] + add) % MOD;
        }
        return total;

        
    }
}