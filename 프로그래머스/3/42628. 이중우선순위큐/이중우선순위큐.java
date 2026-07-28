import java.util.PriorityQueue;
import java.util.Comparator;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        for(int i=0;i<operations.length;i++){
            char str = operations[i].charAt(0);
            int value = Integer.valueOf(operations[i].substring(2));
            if(str=='I'){
                // System.out.println("I " + value);
                maxQueue.offer(value);
                minQueue.offer(value);
            }
            else if(!maxQueue.isEmpty() && str=='D' && value==1){
                Integer max = maxQueue.peek();
                //System.out.println("D1 : " + max);
                maxQueue.poll();
                minQueue.remove(max);
            }
            else if(!maxQueue.isEmpty()&& str=='D' && value==-1){
                Integer min = minQueue.peek();
                //System.out.println("D-1 : " + min);
                minQueue.poll();
                maxQueue.remove(min);
            }
            
        }
        if(maxQueue.isEmpty() || minQueue.isEmpty()) return new int[]{0,0};
        answer[0] = maxQueue.poll();
        answer[1] = minQueue.poll();
        
        return answer;
    }
}