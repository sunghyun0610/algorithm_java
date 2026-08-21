class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = Integer.MAX_VALUE;
        long solveTime = 0;//걸리는 총 시간
        //무조건 통과하는 숙련도 부터 줄여나가야겠네.
        //정렬은 안됨.
        int maxLevel = 0; //무조건 통과하는 레벨임
        for(int i=0;i<diffs.length;i++){
            maxLevel = Math.max(maxLevel,diffs[i]);
        }
        int minLevel = 1;
        int midLevel = 0;
        while(minLevel<=maxLevel){
            solveTime = times[0];//초기화
            midLevel = (maxLevel+minLevel)/2;

            for(int i=1;i<diffs.length;i++){
                solveTime+= getSolveTime(diffs[i],midLevel,times[i-1],times[i]);
            }

            if(solveTime>limit){
                minLevel = midLevel+1;
                
            }
            else if(solveTime<=limit){
                maxLevel=midLevel-1;
                answer = Math.min(answer,midLevel);
            }

        }
        return answer;
    }
    private static long getSolveTime(int diff, int level, int prevTime, int currTime){
        long sum=0;
        if(diff<=level) return currTime;
        else{
            int wrongTime = diff-level;
            sum = (long)((currTime+prevTime) * wrongTime)+currTime;
        }
        return sum;
    }//퍼즐 1개푸는데 시간 구하기
}
//n개의 퍼즐 시간 내에 풀어야함
// 퍼즐 = 난이도 / 소요시간 정해져있음
// 내 숙련도에 따라 퍼즐을 풀 때 틀리는 횟수가 바뀜
// 퍼즐 난이도 diffs, 소요시간 times , 제한시간 limit
//퍼즐 틀리는경우( diff >level) time_cur만큼 시간 사용 + time+prev만큼 시간 사용해서 이전퍼즐 풀고와야함(실패는 안함)
//제한시간내에 퍼즐 모두 해결하기 휘안 숙련도의 최솟값 필요함
//이분탐색으로 갈까