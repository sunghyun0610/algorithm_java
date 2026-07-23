class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int [][] maps = new int[n+1][m+1];//인덱스랑 좌표값 맞춰주기위해 +1
        boolean [][] puddle = new boolean[n+1][m+1];
        for(int i=0;i<puddles.length;i++){
            int x = puddles[i][0];
            int y = puddles[i][1];
            puddle[y][x] = true;//웅덩이라는 뜻
        }
        maps[1][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(puddle[i][j]) {
                    maps[i][j]=0;
                    continue;
                }
                if(i==1&&j==1) continue;
                if(j==1){ //맨 옆줄임
                    maps[i][j]=maps[i-1][j];
                }
                else if(i==1){
                    maps[i][j] = maps[i][j-1]; // 유지
                }
                else{
                    if(puddle[i][j-1] && !puddle[i-1][j]){
                        maps[i][j] = maps[i-1][j];
                    }
                    else if(!puddle[i][j-1] && puddle[i-1][j]){
                        maps[i][j] = maps[i][j-1];
                    }else{
                        maps[i][j] = (maps[i][j-1] + maps[i-1][j]) % 1000000007;
                    }
                }
        
                
            }
        }
//         for(int[] k :maps){
            
//                 System.out.println(k[4]);
            
//         }
        answer = maps[n][m];
        return answer;
    }
}