import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(answer,-1);
        for(int i=0;i<numbers.length;i++){
            while(!stack.isEmpty() && numbers[stack.peek()]<numbers[i]){
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }
            stack.push(i);
        }
        return answer;
    }
}
//순서가 근접해야하고, 큰수여야한다 -> 정렬하면 안됨
//가장 근접한 최대값이 아님, 그냥 크기만 하면 되는거임