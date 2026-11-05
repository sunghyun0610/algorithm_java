import java.util.*;

class Solution {
    static class Process {
        int id;
        int priority;

        Process(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();

        // 1. 프로세스 Queue에 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i]));
        }

        int cnt = 0;

        // 2. Queue가 빌 때까지 반복
        while (!queue.isEmpty()) {
            Process tmp = queue.poll();

            boolean higher = false;

            // 3. 현재 프로세스보다 우선순위가 높은 프로세스가 있는지 확인
            for (Process p : queue) {
                if (p.priority > tmp.priority) {
                    higher = true;
                    break;
                }
            }

            // 4. 우선순위가 높은 프로세스가 있으면 뒤로 이동
            if (higher) {
                queue.add(tmp);
            } 
            // 5. 없으면 실행
            else {
                cnt++;

                if (tmp.id == location) {
                    return cnt;
                }
            }
        }

        return cnt;
    }
}