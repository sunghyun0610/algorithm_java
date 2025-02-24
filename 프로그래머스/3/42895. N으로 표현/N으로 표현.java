import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        List<Set<Integer>> numList = new ArrayList<>();
    
        for(int i=0;i<=8;i++){
            numList.add(new HashSet<>());
        }
        numList.get(1).add(N);// 1개 사용해서 만들 수 있는건 자기자신 뿐
        if(numList.get(1).contains(number)) return 1;
        for(int i=2;i<=8;i++){
            StringBuilder sb = new StringBuilder();
            for(int l=0;l<i;l++){
                sb.append(N);
            }
            int repeat = Integer.parseInt(sb.toString());
            
            numList.get(i).add(repeat);
            for(int j=1;j<i;j++){
                for(int k=1;k<i;k++){
                    if(j+k==i){
                        for(Integer a : numList.get(j)){
                            for(Integer b : numList.get(k)){
                                numList.get(i).add(a+b);
                                numList.get(i).add(a-b);
                                if(b!=0){
                                    numList.get(i).add(a/b);
                                }
                                numList.get(i).add(a*b);
                            }
                        }
                    }
                    if(numList.get(i).contains(number)){
                        return i;
                    }
                }
            }
        }
        
        
        answer=-1;
        return answer;
    }
}