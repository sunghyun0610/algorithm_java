class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean minus= false;
        int length = s.length();
        for(int i=0;i<length;i++){
            char ch = s.charAt(i);
            int tmp = length - i-1;
            if(ch == '-'){
                minus = true;
            }
            else if(ch == '+'){
                minus = false;
            }
            else{
                answer+= Character.getNumericValue(ch) * Math.pow(10,tmp);
            }
        }
        if(minus == true){
            answer *=-1;
        }
        
        return answer;
    }
}