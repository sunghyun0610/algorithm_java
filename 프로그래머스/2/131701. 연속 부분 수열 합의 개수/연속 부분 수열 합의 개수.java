import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        Set<Integer> numList = new HashSet<>();
        for(int i=0;i<len;i++){
            int sum =0;
            for(int j=0;j<len;j++){
                sum+=elements[(i+j)%len];
                    numList.add(sum);
            }
        }
        answer = numList.size();
        return answer;
    }
}