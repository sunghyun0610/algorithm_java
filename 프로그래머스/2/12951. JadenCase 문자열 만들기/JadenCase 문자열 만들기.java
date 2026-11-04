class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx=0;
        int len = s.length();
        while(idx<len){
            char ch = s.charAt(idx);
            if(idx==0){
                sb.append(Character.toUpperCase(ch));
            }
            else if(s.charAt(idx-1)==' '){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }
            idx++;
        }
        return sb.toString();
    }
}