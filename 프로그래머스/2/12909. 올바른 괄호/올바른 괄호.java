import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Queue<Character> queue = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            queue.add(s.charAt(i));
        }//queue에 모두 집어넣기 완료
        int cnt1=0;
        int cnt2=0;
        
        while(!queue.isEmpty()){
            char ch = queue.poll();
            if(ch=='('){
                cnt1++;
            }
            else if(ch==')'){
                cnt2++;
            }
            if(cnt1<cnt2){
                answer=false;
                break;
            }
        }
        if(cnt1==cnt2) answer=true;
        else{
            answer=false;
        }
        

        return answer;
    }
}
//열렸으면 닫혀야함
//먼저 닫히고 열리는거 없음
//문자하나하나 큐에 넣고 ( 가나올때마다 count, )도 카운트하면서 )가 (보다많아지면 false