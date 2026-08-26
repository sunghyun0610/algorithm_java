import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        //중복 제거위해 합을 set에 저장
        Set<Long> resultSet = new HashSet<>();
        int len = elements.length; //수열 전체의 길이
        for(int i=1;i<=len;i++){
            comb(i,elements,resultSet);
        }
        answer = resultSet.size();
        return answer;
    }
    private void comb(int len, int[]elements, Set<Long> resultSet){
        int start = 0;
        int elementLen = elements.length; // 배열의 길이
        int end = (len+start-1)%elementLen; //원형 수열이기때문에 인덱스 계산 이렇게 해줘야함
        
        long sum =0;
        for(int i=start;i<=end;i++){
            sum+=elements[i];
        }
        // System.out.println("길이가 len인 연속 부분수열 :" +len + " 합계 : "+sum);
        resultSet.add(sum);//첫번째 계산
        start++;
        while(start<=elementLen){
            end = (len+start-1)%elementLen;
            sum-=elements[start-1];
            sum+=elements[end];
            resultSet.add(sum);
            start+=1;
            // System.out.println("start" +start);
            // System.out.println("길이가 len인 연속 부분수열 :" +len + " 합계 : "+sum);
        }
       
    }
}
//연속 부분 수열 합
//원소가 중복될 수 있음
//조합을 만드는데 연속이어야함