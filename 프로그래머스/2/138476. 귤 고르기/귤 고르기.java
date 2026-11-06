import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int len = tangerine.length;
        int[] typeArr = new int[10000001];
        for(int i=0;i<len;i++){
            int type = tangerine[i];
            typeArr[type]++;
        }
        Arrays.sort(typeArr);
        int sum=0;
        int idx=10000000;
        while(sum<k){
            sum+=typeArr[idx--];
            answer++;
        }
        
        return answer;
    }
}
//크기별로 귤 구분 -> 서로 다른 종류수 최소화 ( 최대한 같은 종류수 원함 )
