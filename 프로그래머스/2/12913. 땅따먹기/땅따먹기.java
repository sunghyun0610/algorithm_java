class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int row = land.length;
        
        int[][] DP = new int[row][4];
        for(int i=0;i<4;i++){
            DP[0][i]=land[0][i];
        }
        
        for(int i=1;i<row;i++){
            land[i][0]+=Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][3]);
            land[i][1]+=Math.max(Math.max(land[i-1][0],land[i-1][2]),land[i-1][3]);
            land[i][2]+=Math.max(Math.max(land[i-1][1],land[i-1][0]),land[i-1][3]);
            land[i][3]+=Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][0]);
        }
        
        // for(int k : DP[3]){
        //     System.out.println(k);
        // }
        
        for(int i=0;i<4;i++){
            answer = Math.max(answer, land[row-1][i]);
        }

        return answer;
    }
}
//dfs는 O(4^N) 이므로 시간복잡도 초과한다
//항상 최대값 고르는게 아니네. 선택이 그 다음 선택에 영향을 주니까
//지금 작은거 골라도 다음 합까지한 결과값이 더 크다면 작은거 골라야함