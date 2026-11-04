class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx =1;
        int len = s.length();
        char firstCh = s.charAt(0);
        answer.append(Character.toUpperCase(firstCh));
        while(idx<len){
            char ch = s.charAt(idx);
            if(ch == ' '){
                while(idx<len && s.charAt(idx) ==' '){
                    answer.append(' ');
                    idx++;
                }
                if(idx<len){
                    answer.append(Character.toUpperCase(s.charAt(idx)));
                    idx++;
                }
            }
            else{
                answer.append(Character.toLowerCase(s.charAt(idx)));
                idx++;
            }
        }
        
        return answer.toString();
    }
  
}