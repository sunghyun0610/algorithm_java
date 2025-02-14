class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int [] alphabets = new int[26];
        alphabets[0]=0;//A는 A와 동일
        for(int i=1;i<=13;i++){
            alphabets[i]=i;
            if(i!=13){
                alphabets[26-i]=i;
            }
        }//알파벳 별 A와의 거리 입력 완료
        int idx=0;//문자열 위치
        int cnt =0; //A가 연속으로 나온개수
        boolean bool =false;
        int cursor=0;
        int max=0;
        while(idx<len){
            char ch = name.charAt(idx);
            int tmp = (int)ch -65;//알파벳 구함
            answer+= alphabets[tmp];
            idx++;
        }
        
        
        int move = len - 1; // 오른쪽으로 쭉간 횟수
        for (int i = 0; i < len; i++) {
        int next = i + 1;
        while (next < len && name.charAt(next) == 'A') {
            next++;
        }
        // i까지 오른쪽으로 갔다가 왼쪽으로 돌아가는 경우, 혹은 반대로 계산
        move = Math.min(move, i + i + len - next);
        move = Math.min(move, 2* (len-next) + i);
        }
        answer += move;
       
        return answer;
    }
}//A가 기준이다
//N이 13으로 A와 거리가 가장 멀다
//2번쨰 문자가 A여서 변동이 필요없는경우 아니면 그냥 오른쪽으로 한칸씩 이동하는게 편함
//아스키코드로 문자 파악하자 65~90
//제일 긴 A연속구간 찾아보기
//제일 긴 연속구간이 여러개인 경우
