class Solution {
    public long solution(int n) {
        long[]dp = new long[n+1];
        dp[1] = 1;
        if(n==1) return 1;
        dp[2] = 2;
        if(n==2) return 2;
        for(int i=3; i<=n;i++){
            dp[i] = (dp[i-1]+dp[i-2]) % 1234567;
        }
        return dp[n];
    }
    
}
//1칸 , 2칸뛸수있다
//n칸 가는데 방법의 수