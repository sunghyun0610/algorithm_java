import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //사과 최고점 k , 한 상자 구성 개수 m
        //선 정렬을 해야겠네
        Arrays.sort(score);//여기까니 오케이
        reverse(score);
        int idx = m-1;
        int size = score.length;
        while(size>=m){
            answer+=score[idx] * m;
            idx+=m;
            size-=m;
            
        }
        return answer;
    }
    
    private static void reverse(int [] score){
        int left =0;
        int right = score.length-1;
        while(left<right){
            int temp = score[left];
            score[left] = score[right];
            score[right] = temp;
            left++;
            right--;
        }
    }
}
//사과 상자 가격은 최하점 *개수이다 .
//박스화 되지 못한 사과는 버려짐