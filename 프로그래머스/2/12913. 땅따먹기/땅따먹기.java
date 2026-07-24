class Solution {
    int solution(int[][] land) {
        int answer = 0;

        int row = land.length; //행 개수
        int cnt=0; //지금 몇행인지
        int [][] dp = new int[row][4];
        for(int i=0;i<row;i++){
            if(i==0){
                for(int j=0;j<4;j++){
                    dp[i][j]=land[i][j];
                }
            }
            else{//1행 이상일 때
                for(int j=0;j<4;j++){
                    if(j==0){
                        dp[i][j] = land[i][j]+( Math.max(dp[i-1][1],Math.max(dp[i-1][2],dp[i-1][3])));
                    }
                    if(j==1){
                        dp[i][j] = land[i][j]+( Math.max(dp[i-1][0],Math.max(dp[i-1][2],dp[i-1][3])));
                    }
                    if(j==2){
                        dp[i][j] =land[i][j]+ (Math.max(dp[i-1][1],Math.max(dp[i-1][0],dp[i-1][3])));
                    }
                    if(j==3){
                        dp[i][j] = land[i][j]+( Math.max(dp[i-1][1],Math.max(dp[i-1][2],dp[i-1][0])));
                    }
                }
            }
            
        }
        for(int K : dp[row-1]){
            // System.out.println("K : "+K);
            answer = Math.max(K,answer);
        }
        

        return answer;
    }
}