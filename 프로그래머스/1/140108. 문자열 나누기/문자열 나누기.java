class Solution {
    public int solution(String s) {
        int answer = 0;
        int i=0;
        int [] cnt = new int[2];
        while(i< s.length()){
            cnt[0]=0;
            cnt[1]=0;
            char ch = s.charAt(i);
            cnt[0]++;
            i++;
            while(i<s.length() && cnt[0]!=cnt[1]){
                if(ch == s.charAt(i)) cnt[0]++;
                else cnt[1]++;
                i++;
            }
            answer++;
            
        }
        return answer;
    }
}
//첫글자 읽음 , 이글자와 다른 글자들이 나온 횟수가 처음으로 같아지는 순간 멈춰라 -> 여기까지를 원래문자열과 분리하라