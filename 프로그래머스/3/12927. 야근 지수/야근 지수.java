import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        int workCnt = works.length; // 일의 개수
        int [] dp = new int[workCnt];
        int sum=0;
        for(int i=0;i<workCnt;i++){
            sum+=works[i];
        }
        if(sum<=n) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //내림차순
        for(int i=0;i<workCnt;i++){
            pq.offer(works[i]);
        }
        for(int i=0;i<n;i++){
            //제일 큰값 줄여주는게 맞네
            int max = pq.poll();
            pq.offer(max-1);
        }
        
        while(!pq.isEmpty()){
            answer+= (int)Math.pow(pq.poll(),2);
        }
        return answer;
    }
}
//이건 선택이 영향을 미쳐.
//1 씩뺴고 각 횟수별로 제일 작은 값이 dp[] 가 된다