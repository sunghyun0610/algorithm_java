import java.util.*;

class Solution {
    public List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String,Integer> dictionary = new HashMap<>();//사전임
        int len = msg.length();//문자열의 길이
        char alpha = 'A';
        for(int i=1;i<=26;i++){
            char ch = (char)(alpha +i-1);
            String str = String.valueOf(ch);
            dictionary.put(str,i);
        }//사전 초기화 완료
        
        
        
        int idx=0;
        int addCnt=1;
        while(idx<len){
            int nextIdx = findStr(idx,dictionary,msg);//일치하는 가장 긴 문자열 찾는다
            String str = msg.substring(idx,nextIdx);
            answer.add(dictionary.get(str));//출력함
            if(nextIdx<len-1){
                String nextStr = msg.substring(idx,nextIdx+1);
                // System.out.println(nextStr);
                dictionary.put(nextStr,26+addCnt);
                addCnt++;
            }
            idx=nextIdx;
           
            
        }
        return answer;
    }
    private int findStr (int startIdx, Map<String,Integer> dictionary ,String msg){
        int temp =startIdx+1;
        int len = msg.length();
        while(temp <= msg.length() &&
              dictionary.containsKey(msg.substring(startIdx,temp))){
            temp++;
        }
        // System.out.println("temp : "+temp);
        return temp-1;
    }
}
//1. 현재 입력과 일치하는 가장 긴 문자열w찾는다
//2. w에 해당하는 사전의 색인 번호 출력하고 ,입력에서 w제거한다
//3. 입력에서 처리되지 않은 다음글자가 남아있다면 w+c에 해당하는 단어를 사전에 등록한다