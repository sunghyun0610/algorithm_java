class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] words = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length;i++){
            String[] split = babbling[i].split("aya|ye|woo|ma");
            for(String str : split){
                System.out.println(str);
            }
            if(split.length==0){//위 4글자로만 이루어졌다는 것 증명 -> 반복되는 문구 걸러야댐
                if(!(babbling[i].contains("ayaaya")) && !(babbling[i].contains("yeye")) &&
                                                         !(babbling[i].contains("woowoo"))&&
                                                          !(babbling[i].contains("mama"))){
                                                             answer++;
                                                         }
            }
            
            }

        return answer;
    }
}
//네 가지 발음 , 연속해서 같은 발음 못함
//4단어의 조합으로 만들어진 단어는 발음 가능하다.