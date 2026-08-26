import java.util.*;

class Solution {
    static int countComb;

    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0;
        countComb = 0;
        
        makeComb(n,1,new ArrayList<>(),q,ans);
        return countComb;
   
    }
   private void makeComb(int n, int start, List<Integer> currList ,
                        int[][] q, int[] ans){
       if(currList.size() == 5){
           if(check(currList,q,ans)){
               countComb++;
           }
       }
       for(int i=start;i<=n;i++){
           currList.add(i);
           makeComb(n,i+1,currList,q,ans);
           currList.remove(currList.size()-1);
       }
       
   }
   private boolean check(List<Integer> currList, int[][] q, int[] ans){
       int currCorrect = 0;
       for(int i=0;i<q.length;i++){
           int correctNum = ans[i];
           currCorrect = 0;
           for(int j=0;j<5;j++){
               if(currList.contains(q[i][j])){
                   currCorrect++;
               }
           }
           if(currCorrect!=correctNum) return false;
       }
       return true;
   }
       
    
    
}
//1~n까지 서로 다른 정수 5개 (오름차순)인 비밀코드를 맞춰야함 , 10<= n<=30
//m번 암호 분석 도구 사용
//m번 시도한후 비밀코드로 가능한 정수조합이 몇개인지 구하여라
//전체 가능한 숫자 모두구하고, 이중 5개뽑으면서 분석에 가능한경우만 남긴다