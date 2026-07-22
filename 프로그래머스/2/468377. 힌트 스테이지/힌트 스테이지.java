class Solution {
    static int minMoney = Integer.MAX_VALUE;
    public int solution(int[][] cost, int[][] hint) {
        int answer = 0;
        int stageCnt = cost.length;
        int [] hintCount = new int[stageCnt+1];
        dfs(0,0,cost,hint,hintCount);
        answer=minMoney;
        return answer;
    }
    static void dfs(int stage, int money,int[][] cost, int[][] hint, int[] hintCount ){
        if(money>minMoney) return;
        if(stage==0){
            dfs(stage+1, money+cost[stage][0],cost,hint,hintCount);
        }
        if(stage==cost.length){
            minMoney = Math.min(money,minMoney);
            return;
        }
        
        //힌트 있는건 일단 다 써야함
        int stageHint = hintCount[stage+1];//힌트 카운트는 stage+1인덱스이다
        stageHint = Math.min(stageHint, cost[stage].length-1);
        
        int clearCost = cost[stage][stageHint];
        
    // 마지막 스테이지에는 구매할 힌트 번들이 없음
        if (stage == cost.length - 1) {
            dfs(
                stage + 1,
                money + clearCost,
                cost,
                hint,
                hintCount
            );
            return;
        }

        
        //힌트를 안산경우
        dfs(stage+1,money+cost[stage][stageHint],cost,hint,hintCount);
        
        //힌트번들 산경우
        for(int i=1;i<hint[stage].length;i++){
            int hintIndex = hint[stage][i];
            hintCount[hintIndex] ++;
        }
        dfs(stage+1,money+hint[stage][0]+cost[stage][stageHint], cost,hint, hintCount);
        
        for(int i=1;i<hint[stage].length;i++){
            int hintIndex = hint[stage][i];
            hintCount[hintIndex] --;
        }
        
    }
}