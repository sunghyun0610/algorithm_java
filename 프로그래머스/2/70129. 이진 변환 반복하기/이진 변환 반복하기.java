import java.util.*;
class Solution {
    static int cnt=0;
    public int[] solution(String s) {
        
        int len=s.length();
        int[] answer = new int[2];
        int cntZero=0;
        while(!("1".equals(s))){
            s = s.replaceAll("0", "");//0 remove
            int c = s.length();
            cntZero+=len-c;
            //System.out.println(cntZero);
            s=toBinary(c);
            len = s.length();
        }
        answer[1]=cntZero;
        answer[0]=cnt;
        return answer;
    }
    static String toBinary(int c){
        cnt++;
        StringBuilder sb = new StringBuilder();
        while(c>0){
            sb.append(c%2);
            
            c/=2;
        }
    
        
        return sb.reverse().toString();
    }
}
//x의 모든 0을 제거하기
//재거한 문자열 x를 길이 c를 2진법으로 다시 표현