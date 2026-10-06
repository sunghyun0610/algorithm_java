class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb;
        int zeroCnt = 0;
        int loopCnt = 0;
        while(!s.equals("1")){
            sb = new StringBuilder();
            for(int i=0; i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='0') {
                    zeroCnt++;
                    continue;
                }
                else if(ch=='1') sb.append(ch);
            }
            int len = sb.length();
            s = Integer.toString(len,2);
            loopCnt++;
        }
        // System.out.println(str);
        answer[0] = loopCnt;
        answer[1] = zeroCnt;
        return answer;
    }
}