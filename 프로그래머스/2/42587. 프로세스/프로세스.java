import java.util.*;
class Solution {
    static class Process{
        int id;
        int priority;
        // int time;
        Process(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Process> waitQueue = new PriorityQueue<>(
            (a, b) ->  Integer.compare(b.priority, a.priority));
        Queue<Process> queue = new LinkedList<>();
        for(int i=0;i<priorities.length;i++){
            waitQueue.add(new Process(i,priorities[i]));//우선순위 기반
            queue.add(new Process(i,priorities[i]));//순서 확인용
        }
        int cnt = 1;
        while(!waitQueue.isEmpty()){
            Process tmp = queue.peek();
            Process waitTmp = waitQueue.peek();
            if(tmp.priority == waitTmp.priority){//나올 차례가 맞음
                queue.poll();
                waitQueue.poll();

                if (tmp.id == location) return cnt;
                cnt++;
            }
            else{
                queue.poll();
                queue.add(tmp);//순서 바꾸기
            }
        }
        
        
        return answer;
    }
}
//프로세스 관리 규칙
// 1. 실행 대기 큐에서 대기중인 프로세스 꺼낸다
// 2. 큐에 대기중인 프로세스중 우선순위가 더 높은 프로세스가 있다면 다시 넣는다
// 3. 만약 없다면 방금 꺼낸 프로세스 실행
// 우선순위큐
// 몇번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location
//해당 프로세스가 몇번째로 실행되는지?