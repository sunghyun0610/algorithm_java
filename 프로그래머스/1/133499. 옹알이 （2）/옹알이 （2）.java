class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // int[] word = {"aya","ye",""}
        for(int i=0; i<babbling.length;i++){
            String str = babbling[i];
            String lastStr = "";
            while(str.length()>0){
                if(str.startsWith("aya")){
                    if(lastStr.equals("aya")) break;
                    str= str.substring(3);
                    lastStr="aya";
                }else if(str.startsWith("ye")){
                    if(lastStr.equals("ye")) break;
                    str = str.substring(2);
                    lastStr = "ye";
                }
                else if(str.startsWith("woo")){
                    if(lastStr.equals("woo")) break;
                    str = str.substring(3);
                    lastStr="woo";
                }
                else if(str.startsWith("ma")){
                    if(lastStr.equals("ma")) break;
                    str = str.substring(2);
                    lastStr="ma";
                }
                else break;//발음 할 수 없는 거임
            }
            if(str.length()==0) answer++;
        }
        return answer;
    }
}
//연속 같은 발음도 안됨