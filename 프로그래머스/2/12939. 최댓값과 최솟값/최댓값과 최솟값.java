class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int len = s.length();
        String[] str = s.split(" ");//띄어쓰기로 나눠서 저장
     
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num =0;
        for(int i=0;i<str.length;i++){
            String tmp = str[i];
            
            if(tmp.charAt(0)=='-'){//음수인 경우
                num = Integer.parseInt(tmp);
                
            }
            else{
                num = Integer.parseInt(tmp);
            }
            
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        answer.append(min+" ");
        answer.append(max);
        
        return answer.toString();
    }
}