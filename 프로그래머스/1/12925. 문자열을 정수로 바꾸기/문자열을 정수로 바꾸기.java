class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        boolean bool =false;//true면 - 라는 것
        int idx=0;
        if(s.charAt(0)=='-'){
            bool=true;
            idx++;
        }
        if(s.charAt(0)=='+'){
            idx++;
        }
        while(idx<len){
            
            int tmp = Character.getNumericValue(s.charAt(idx));
            answer += tmp * (int)(Math.pow(10,len-idx-1));
            idx++;
            
        }
        if(bool==true) answer*=-1;
        return answer;
    }
}