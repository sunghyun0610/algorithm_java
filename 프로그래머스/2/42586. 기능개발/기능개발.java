import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            queue.add(progresses[i]);
        }
        int time=0;
        int idx =0;
        while(!queue.isEmpty()){
            int temp = queue.peek();
            int currFirstProgress = temp + time*speeds[idx];
            if(currFirstProgress>=100){
                int cnt =1;
                idx++;
                queue.poll();// 작업 하나 뺌
                
                if(!queue.isEmpty()){
                    temp= queue.peek();
                }
                while(!queue.isEmpty() && temp+time*speeds[idx]>=100){
                    queue.poll();
                    idx++;
                    cnt++;
                    if(!queue.isEmpty()){
                        temp = queue.peek();
                    }
                }
                // System.out.println(cnt);
                answer.add(cnt);
            }
            time++;
        }
        return answer;
    }
}
//각 배포마다 몇개의 기능이 배포되는 가
//진도 : progresses
//개발 속도 : speeds