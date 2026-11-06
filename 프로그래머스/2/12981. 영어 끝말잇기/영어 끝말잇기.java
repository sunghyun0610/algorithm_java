import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> usedList = new ArrayList<>();
        usedList.add(words[0]);
        int len2 = words[0].length();
        char lastCh = words[0].charAt(len2-1);
        for(int i=1;i<words.length;i++){
            String str = words[i];
            int len = str.length();
            if(lastCh!=str.charAt(0)){
                //규칙 1 위해
                answer[0] = (i%n) +1;
                answer[1] = (i/n) +1;
                break;
            }
            if(usedList.contains(str)){
                //규칙 2 위배
                answer[0] = (i+1)%n;
                if((i+1) % n==0) answer[0] = n;
                answer[1] = (i+1)/n +1;
                if((i+1)%n==0) answer[1] = (i+1)/n;
                break;
            }
            usedList.add(str);//썻으니까 저장
            lastCh = str.charAt(len-1);
        }

        return answer;
    }
}
//끝말잇기
//규칙 1 : 끝에 나온 단어로 시작하는 단어인가?
//규칙 2 : 앞에 나온 단어 중복됐나?
// 우린 언제 누가 틀렸냐만 보면되는거임. 이미 게임은 했음
//n명이서 했음