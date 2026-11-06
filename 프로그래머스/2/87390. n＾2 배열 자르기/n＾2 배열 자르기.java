import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int len =(int)(right-left+1);
        int[] answer = new int[len];
        int idx=0;
        for(long i=left; i<=right; i++){
            int row = (int)(i/n);
            int col = (int)(i%n);
            answer[idx++] = Math.max(row,col)+1;
            
        }
        return answer;
    }
}
//n*n 2차원배열