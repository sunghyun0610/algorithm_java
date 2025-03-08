class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int len = s.length();
        boolean first = true;
        for(int i=0;i <len;i++){
            char ch = s.charAt(i);
            
            if(ch==' '){
                first = true;
                answer.append(ch);
                continue;
            }
            
            if(first){//첫글자인지 아닌지
               
                    char big = Character.toUpperCase(ch);
                    answer.append(big);
                
                first= false;
            }
            else{//첫번째 문자가 아닌경우
                answer.append(Character.toLowerCase(ch));
            }
            
            
         }
        

        return answer.toString();
    }
}