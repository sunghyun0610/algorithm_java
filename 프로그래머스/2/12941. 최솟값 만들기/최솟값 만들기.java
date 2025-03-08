import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int len = A.length;
        
        for(int i=0;i<len;i++){
            answer+= A[i] * B[len-i-1];
        }

        return answer;
    }
}
//두 배열의 길이는 같음
//곱해서 최소가 되려면 최대값 * 최소값이 되어야한다