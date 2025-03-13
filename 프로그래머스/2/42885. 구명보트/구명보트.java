import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int tmp=0;
        
        Arrays.sort(people);//오름 차순으로 정렬
        int len = people.length;
        
        
        int start =0;
        int end = len-1;
        while(start<end){
            if(people[start]+people[end]<=limit){
                start++;//두명 태울수 있냐 없냐 판단
                
            }
                end--;//두명 태우든 못태우든 중량 감소
                
            
        }
     

        return len-start;
    }
}
//구명보트 최대 2명탑승 + 무게제한
//구명보트를 최대한 적게 사용하여 모든 사람 구출하고자함 -> 필요한 구명보트 개수 최솟값은?
//정렬 해야겠네
//일단 최대한 limit에 맞춰서 많이 뺴가야되네
//투 포인터