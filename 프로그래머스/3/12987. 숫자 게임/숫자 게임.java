import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int left = 0;
        int right = A.length-1;
        int BIdx=0;
        int AIdx=0;
        
        while(AIdx < A.length && BIdx<A.length){
            int num = A[AIdx];
               if(num>=B[BIdx]){
                   BIdx++;
               } else{
                   BIdx++;
                   AIdx++;
                   answer++;
               }
            
        }
        
        return answer;
    }
}
//A를 정렬한다
//차이가 제일 작은 원소를 선택하여 승부한다