import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> size = new ArrayList<>();
        Arrays.sort(tangerine);//일단 정렬해주고
        int len = tangerine.length;
        int start=0;
        int end=start;
        while(end<len){
            if(tangerine[start]==tangerine[end]){
                end++;
                if(end==len){
                    size.add(end-start);
                    break;
                }
                
            }
            else{
                int cnt = end-start;//동일한게 몇개 있었는지
                size.add(cnt);//사이즈에대한 정보는 필요가없음 사실
                start=end;
            }
        }
        Collections.sort(size,Collections.reverseOrder());
        int sum=0;
        int idx=0;
        while(sum<k){
            sum+=size.get(idx++);
            answer++;
        }
        return answer;
    }
}
//서로 다른 종류의 수를 최소화 하고 싶다
// 귤 k개 고를 때 서로 다른 종류의 수의 최솟값을 return