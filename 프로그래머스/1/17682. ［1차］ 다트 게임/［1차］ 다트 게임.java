class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int length = dartResult.length();
        int idx=0;//score 인덱스 기억하기 위해
        for(int i=0;i<length;i++){
            
            if(dartResult.charAt(i)=='S'){
                if(i!=length-1 && dartResult.charAt(i+1)== '*'){
                    if(idx==0){
                        score[0]*=2;
                    }
                    else{
                        score[idx]*=2;
                        score[idx-1]*=2;
                    }
                }
                else if(i!=length-1 && dartResult.charAt(i+1)== '#'){
                    score[idx] = -score[idx];
                }
                idx++;
            }
            else if(dartResult.charAt(i) == 'D'){
                score[idx] = score[idx] * score[idx];
                if(i!=length-1 && dartResult.charAt(i+1) =='*'){
                    if(idx==0){
                        score[idx]*=2;
                    }
                    else{
                        score[idx]*=2;
                        score[idx-1]*=2;
                    }
                }
                else if(i!=length-1 && dartResult.charAt(i+1) == '#'){
                    score[idx] = -score[idx];
                }
                idx++;
                
            }
            else if(i!=length && dartResult.charAt(i) == 'T'){
                score[idx]= score[idx] * score[idx] * score[idx];
                System.out.println(score[idx]);
                
                if(i!=length-1 && dartResult.charAt(i+1) == '*'){
                    if(idx==0){
                        score[idx]*=2;
                    }
                    else{
                        score[idx]*=2;
                        score[idx-1]*=2;
                    }
                }
                else if(i!=length-1 &&  dartResult.charAt(i+1) == '#'){
                    score[idx] = -score[idx];
                }
                idx++;
                
            }
            else if(dartResult.charAt(i) == '*'){
                continue;
                
            }
            else if(dartResult.charAt(i) == '#'){
                continue;
            }
            else{
                int num = Character.getNumericValue(dartResult.charAt(i));
                if(num == 0){
                     if(i>=1 && Character.getNumericValue(dartResult.charAt(i-1)) == 1){
                        num = 10;
                    }
                    else{
                        num = 0;
                    }
                    
                }
                
                score[idx] = num;
                System.out.println(score[idx]);
            }
            
            
            
        }
        for(int k : score){
            //System.out.println(k);
            answer += k;
        }
        return answer;
    }
}
//다트는 총 3번의 기회
//한 번에 0~10점
//1제곱,2제곱,3제곱 영역이 존재
//*스타상 : 해당점수와 바로 전에 얻은 점수를 2배로만듬 (전에 얻은 점수가 없으면 해당점수만 2배로) -> 중첩가능
//# 아차상 : 해당 점수는 마이너스된다.
//1 +4 -> 2+8 +27 = 37
// 1+(-2)+10=9
//1 +2
//1->1*2 +8->1*2*2+8*2+3=23
//1->1*(-1) +2 -> 1*(-1)*2+2*2+3=5
//S,D,T 문자 바로 앞에 숫자가 나온다
