import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int height = 0;
        int yw = 0;//노란색 가로
        int yh = 0;//노란색 세로
        int sqrt = (int)Math.sqrt(yellow);
        for(int i=1; i<=sqrt;i++){
            if(yellow%i==0){
                yw=yellow/i;
                yh = i;
                 int sum = 2*(yh+2) + 2*(yw+2)-4;
                if(sum==brown){
                    answer[0] = yw+2;
                    answer[1] = yh+2;
                    break;
                }
            }
           
        }
        return answer;
    }
}