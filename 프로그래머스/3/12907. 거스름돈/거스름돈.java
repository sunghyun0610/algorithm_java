class Solution {
    public int solution(int n, int[] money) {

        
        long [] dp = new long[n+1]; //dp[i] = i원을 만들 수 있는 가지수
        dp[0] = 1;
        for(int coin : money){
            for(int i=coin;i<=n;i++){
                dp[i] += dp[i-coin];
                dp[i] %= 1000000007;
            }
        }
       
        return (int)dp[n];
    }
}
//DP로풀자
// 동전 개수로 만들수있는 최대값?