import java.util.*;
class Solution {
    public String solution(String s) {
        
        StringBuilder answer = new StringBuilder();
        long max =Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            long temp = Long.parseLong(st.nextToken());
            if(temp>max) max=temp;
            if(temp<min) min=temp;
            System.out.println("max: " +max);
            System.out.println("min :"+ min);
        }
        answer.append(min);
        answer.append(" ");
        answer.append(max);
        return answer.toString();
    }
}