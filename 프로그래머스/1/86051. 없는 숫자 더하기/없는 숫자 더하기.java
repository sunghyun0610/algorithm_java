import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=9;i++){
            list.add(i);
        }
        for(int i=0;i<numbers.length;i++){
            int num = numbers[i];
            int idx = list.indexOf(num);
            // System.out.println(idx);
            list.remove(idx);
        }
        for(int k: list) answer+=k;
        return answer;
    }
}