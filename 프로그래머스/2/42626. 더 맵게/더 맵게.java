import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int len = scoville.length;
        for(int i=0;i<len;i++){
            pq.add(scoville[i]);
        }
        if(K==0) return 0;
        
        while(pq.peek()<K){
            if(pq.size()==1){
                return -1;
            }
            int x = pq.poll();
            int y= pq.poll();
            if(x==0 && y==0){
                return -1;
            }
            int newNum = x+ (2*y);
            pq.add(newNum);
            answer++;
        }
        
        
        return answer;
    }
}
//우선순위 큐 -> 작은게 우선순위 높음