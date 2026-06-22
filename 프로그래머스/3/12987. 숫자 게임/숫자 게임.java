import java.util.*;
class Solution {
    public int solution(int [] A, int[] B) {
        int answer = 0;
        Arrays.sort(B);
        TreeMap<Integer,Integer> map = new TreeMap<>();

        int len = B.length;
        for(int i=0;i<len;i++){
            int key = B[i];
            
            
            if(map.get(key)!=null){
                int value = map.get(key);
                map.put(key,value+1);
            }
            else{
                map.put(key,1);
            }

        }
        for(int i=0;i<len;i++){
            int a = A[i];
            Integer result = map.higherKey(a);
            if(result == null) continue;
            int value = map.get(result);
            if(value >0){
                answer++;
                map.put(result,value-1);
                if(value-1 ==0){
                    map.remove(result);
                }
                
            }
        }
        return answer;
    }
}