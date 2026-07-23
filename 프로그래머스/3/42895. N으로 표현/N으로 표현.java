import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        
        String[] calculateType ={"plus","minus","multiple","divide","join"};
        Set<Integer>[] resultSet = new HashSet[9]; //모든 결과값을 set에 추가해서 원하는 타겟 포함되면 종료
        for(int i=0;i<9;i++){
            resultSet[i] = new HashSet<>();
        }
        
        int joinedNumber = 0;
        
        for(int cnt=1;cnt<=8;cnt++){
            joinedNumber = joinedNumber*10+N;
            resultSet[cnt].add(joinedNumber);
            
            for(int left=1; left<cnt; left++){
                int right = cnt-left;
                
                for(int a : resultSet[left]){
                    for(int b: resultSet[right]){
                        resultSet[cnt].add(a+b);
                        resultSet[cnt].add(a-b);
                        resultSet[cnt].add(a*b);
                        if(b==0) continue;
                        resultSet[cnt].add(a/b);
                    }
                }
            }
            if(resultSet[cnt].contains(number)) return cnt;
        }
        
        return -1;
    }
   
}
// 경우의수
// 숫자 붙여쓰는경우
// 더하는경우, 뺴는경우, 나누는경우, 곱하는경우
// 연산결과를 다 저장해볼까?
// N1개써서 만들수있는값들.. N2개써서 만들수있는 값들..
