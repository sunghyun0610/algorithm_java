import java.util.PriorityQueue;
import java.util.LinkedList;

class Solution {
    static class Task{
        int id;
        int requestTime;
        int proccessTime;
        int endTime;
        Task(int id, int requestTime, int proccessTime){
            this.id = id;
            this.requestTime = requestTime;
            this.proccessTime = proccessTime;
        }
    }
    
    public int solution(int[][] jobs) {
        int answer = 0;
        int sum = 0;
        PriorityQueue<Task> allQueue = new PriorityQueue<>(
            (a,b) -> {
                if(a.requestTime != b.requestTime){
                    return Integer.compare(a.requestTime,b.requestTime);
                }
                if(a.proccessTime != b.proccessTime){
                    return Integer.compare(a.proccessTime, b.proccessTime); //왼쪽 숫자가 크면 1
                }
                return Integer.compare(a.id,b.id);
            }
        );
        
        PriorityQueue<Task> waitQueue = new PriorityQueue<>(
            (a,b) -> {
                if(a.proccessTime != b.proccessTime){
                    return Integer.compare(a.proccessTime, b.proccessTime); //왼쪽 숫자가 크면 1
                }
                if(a.requestTime != b.requestTime){
                    return Integer.compare(a.requestTime,b.requestTime);
                }
                return Integer.compare(a.id,b.id);
            }
        );
            
        for(int i=0;i<jobs.length;i++){
            int rTime = jobs[i][0];
            int pTime = jobs[i][1];
            Task task = new Task(i+1,rTime,pTime);
            allQueue.offer(task); // 모든 작업 대기큐에 삽입
        } // allQueue에 배열의 모든 task일단 집어넣기 -> 조건에 맞게 대기큐로 보내기
        
        //Queue<Task> hardDisk = new LinkedList<>(); //실제 작업한는 디스크
        
        int time = 0;//현재 시간
        while(!allQueue.isEmpty() || !waitQueue.isEmpty()){
           while(!allQueue.isEmpty()){
               Task task = allQueue.peek();
               if(task.requestTime <=time){
                    waitQueue.offer(allQueue.poll());// 해당 시간대에 가능한 작업 후보 대기큐에 모두 옮김
               }
               else{
                   break;
               }
           }
            
            if(!waitQueue.isEmpty()){
                Task nextTask = waitQueue.poll();
                time+=nextTask.proccessTime;
                sum+=time-nextTask.requestTime;
            }
            else{
                time++;
            }
            
        }
        answer = sum/jobs.length;
        return answer;
    }
}
//jobs[0] : 작업이 요청되는 시점 
// jobs[1] : 작업의 소요시간