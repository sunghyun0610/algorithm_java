import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int tmp=0;
        
        Arrays.sort(people);//오름 차순으로 정렬
        int len = people.length;
        
        boolean[] visited = new boolean[len];//탈출 여부 체크배열
        
        int idx=0;
        while(idx<len && people[idx]<=limit/2){
            idx++;
        }
        //idx넘어가는 순간 자기보다 더 가벼운 사람 태워야하는 거임
        // if(idx==len) return len/2;
        
        int last=len-1;
        for(int i=0;i<idx;i++){
            int start =i;
            int end = last;
      
            if(visited[start]) continue;//이미 태워서 보낸거임
           
            while(end>start && !visited[end] && people[start]+people[end]>limit){
                end--;
            }
            visited[start]=true;
            visited[end]=true;
            last = end-1;
            answer++;
            
            
        }
        
        for(int i=idx;i<len;i++){
            if(!visited[i]) answer++;
        }
        return answer;
    }
}
//구명보트 최대 2명탑승 + 무게제한
//구명보트를 최대한 적게 사용하여 모든 사람 구출하고자함 -> 필요한 구명보트 개수 최솟값은?
//정렬 해야겠네
//일단 최대한 limit에 맞춰서 많이 뺴가야되네
//투 포인터