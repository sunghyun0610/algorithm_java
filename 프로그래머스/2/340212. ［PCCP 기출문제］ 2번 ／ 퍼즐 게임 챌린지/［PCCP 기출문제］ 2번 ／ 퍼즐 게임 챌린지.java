import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int maxLevel=0;
        for(int i=0;i<diffs.length;i++){
            maxLevel = Math.max(maxLevel,diffs[i]);
        }
        int minLevel = 1;
        int mid = (minLevel+maxLevel)/2;
        while(minLevel<=maxLevel){
            mid = (minLevel+maxLevel)/2;
            long sum=times[0];
            for(int i=1;i<diffs.length;i++){
                sum+=completeTime(diffs[i],mid,times[i],times[i-1]);
            }
            if(sum>limit){//level올려야함
                minLevel = mid+1;
            }else if(sum==limit){
                answer = mid;
                break;
            }
            else{ // level 내려도됨
                maxLevel = mid-1;
                answer = mid;            }
        }
        
        return answer;
    }
    private long completeTime(int diff, int level, int currTime, int prevTime){
        if(diff<=level) return currTime;
        else{
            int sum=0;
            int retryCnt = diff-level;
            sum = (currTime + prevTime) * retryCnt + currTime;
            return sum;
        }
    }
}
//현재 퍼즐 난이도 diff, 나의 숙련도 level
//diff <=level 이면 time만큼 시간써서 해결
//diff > level이면, diff-level만큼 틀리고,
//  (틀릴때마다 time_cur만큼 사용 + 이전문제 풀고와야함) * 틀린횟수 + time_curr
//제한 시간내에 모두 해결하기 위한 level 최솟값