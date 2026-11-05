import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> conveyBelt = new Stack<>();
        int box=1;
        for(int i=0;i<order.length;i++){
            while(box<=order.length && box<=order[i]){
                conveyBelt.push(box++);
            }
            if(!conveyBelt.isEmpty() && conveyBelt.peek()==order[i]){
                conveyBelt.pop();
                answer++;
            }
            else{
                break;
            }
        }
        return answer;
    }
}