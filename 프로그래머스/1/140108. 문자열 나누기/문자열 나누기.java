class Solution {
    public int solution(String s) {
        int answer = 0;
        int mine = 0;
        int other = 0;
        char first = ' ';
        int idx=0;
        boolean isFirst = false;
        while(idx<s.length()){
            if(idx==0 || isFirst){
                first = s.charAt(idx);
                mine++;
                idx++;
                isFirst=false;
            }
            else{
                char ch = s.charAt(idx);
                if(first==ch) mine++;
                else other++;
                idx++;
            }
            if(mine==other){
                answer++;
                isFirst=true;
                mine=0;
                other=0;
            }
            else{
                if(idx==s.length()) answer++;
            }
        }
        return answer;
    }
}
//첫글자 -> 동일한 문자, 다른 문자 나온 횟수 각각 센다.
// 처음으로 횟수 같아지는 순간 멈추고, 지금까지 읽은 문자열 분리
//남은 과정 반복함
//분해한 무자열의 개수