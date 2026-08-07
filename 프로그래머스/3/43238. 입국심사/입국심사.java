import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long minTime = 1; //최소 시간
        long maxTime = (long) times[times.length-1] * n; //최대 시간
        long mid = 0;
        
        while(minTime<=maxTime){
            long people = 0;
            mid = ( minTime+maxTime ) / 2;
            for(int time : times){
                people += mid/time;
            }
            if(people<n){ //아직 처리해야할 사람 남았음 -> 시간 더 필요함
                minTime = mid+1;
            }
            
            else{//처리할 사람이 초과함
                answer = mid;
                maxTime=mid-1;
            }
        }
        
        
        return answer;
    }
}
//시간 t가 주어졌을 때 몇명 처리할 수 있나?