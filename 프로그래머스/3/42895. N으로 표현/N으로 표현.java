import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        boolean bool = false;
        List<Set<Integer>> numList = new ArrayList<>();//set을 담고있는 리스트
        for(int i=0;i<9;i++){
            numList.add(new HashSet<Integer>());
        }//리스트를 set으로 초기화
        numList.get(1).add(N);//첫번쨰는 자기자신 뿐
        if(N==number){
            return 1;
        }
        for(int i=2;i<9;i++){
            int idx=i;
            for(int j=1;j<i;j++){
                for(int k=1;k<i;k++){
                    if(j+k==i){
                        for(int a : numList.get(j)){
                            for(int b: numList.get(k)){
                                numList.get(i).add(a+b);
                                numList.get(i).add(a-b);
                                numList.get(i).add(a*b);
                                if(a!=0 && b!=0){
                                    numList.get(i).add(a/b);
                                }
                            }
                        }
                    }
            
                }
            }
            int tmp=0;
            while(idx>0){
                tmp +=N*Math.pow(10,idx-1);
                idx--;
            }
            numList.get(i).add(tmp);
            if(numList.get(i).contains(number)){
                answer=i;
                bool = true;
                break;
            }
        }
        
        if(!bool) answer=-1;
        return answer;
    }
}
//N과 사칙연산만 사용하여 number를 만들어야함
//최솟값이 8보다 크면 -1 return
//사칙연산 + - * / 없음 5가지가 있네
//결국 1이 몇개쓰이냐네