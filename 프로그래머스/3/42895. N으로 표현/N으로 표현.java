import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        int cnt=0;
        Set<Integer>[] resultSet = new HashSet[9];
        for(int i=0;i<9;i++){
            resultSet[i] = new HashSet<>();
        }//dp배열 초기화 완료
        resultSet[1].add(N);
        cnt++;
        while(cnt<=8){
            //cnt-1 개수만큼은 저장된 상태임
            //연속된 숫자 계산
            String joinNum ="";
            for(int i=0;i<cnt;i++){
                joinNum +=String.valueOf(N); 
            }
            int joinNumber = Integer.parseInt(joinNum);
            resultSet[cnt].add(joinNumber);
            
            for(int left=1; left<cnt; left++){
                int right = cnt-left;
                for(int a :resultSet[left]){
                    for(int b: resultSet[right]){
                        resultSet[cnt].add(a+b);
                        resultSet[cnt].add(a-b);
                        resultSet[cnt].add(a*b);
                        if(b!=0) resultSet[cnt].add(a/b);
                    }
                }
            }
            if(resultSet[cnt].contains(number)) return cnt;
            cnt++;
        }
        
        return -1;
    }
}