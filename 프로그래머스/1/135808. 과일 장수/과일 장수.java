import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int len = score.length;
        int idx=len-1;
        int cnt = len/m;//상자 개수다
        while(cnt>0){
            //거꾸로 박스 만들어야겠네
            int min = score[idx-m+1];
            // System.out.println(min);
            answer+=min*m;
            idx-=m;
            cnt--;
        }
        return answer;
    }
}
//가격 결정
// 1. 사과m개씩 담아 포장
// 2. 가장 낮은 점수가 p인 경우 p*m이다.
// 얻을 수 있는 최대 이익 ( 상자 안된 사과는 버린다)
//최소값부터 다 써라
//1상자만 만들면 얘기 달라지네