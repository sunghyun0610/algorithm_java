import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int [] right = new int[10001];
        int rightKinds = 0;
        for(int i=0;i<topping.length;i++){
            int type = topping[i];
            if(right[type]==0) rightKinds++;
            right[type]++; //개수 저장해야함
        }
        Set<Integer> left = new HashSet<>();
        for(int i=0;i<topping.length;i++){
            int type = topping[i];
            left.add(type);
            right[type]--;
            if(right[type]==0) rightKinds--;
            if(rightKinds == left.size()){
                answer++;
            }
            if(rightKinds<left.size()) break;
        }
        return answer;
    }
}