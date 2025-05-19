class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int dis=0;
        int[][] DP= new int[n][m];
        int [][] map = new int[n][m];
        for(int i=0;i<puddles.length;i++){
            int x = puddles[i][0]-1;
            int y = puddles[i][1]-1;
            map[y][x]=1;
        }
        int [] dx ={0,1};
        int[] dy={1,0};
        DP[0][0]=1;
        //오른쪽 or 아래 2방향으로만 움직일 수 있다.
        for(int i=0;i<n;i++){//행
            for(int j=0;j<m;j++){//열
                for(int k=0;k<2;k++){
                    int next_x = i+dx[k];//행
                    int next_y= j+dy[k];
                    if(next_x<n &&next_y<m && map[next_x][next_y]!=1){
                        DP[next_x][next_y] = (DP[i][j] + DP[next_x][next_y]) % 1000000007;
                        
                    }
                }
             }
        }

        answer=DP[n-1][m-1];
        
        return answer;
    }
}
//목표지점까지의 최단거리 경로 개수 == 더 작은 단위의 소목표지점 최단거리 + 소목표지점 최단거리