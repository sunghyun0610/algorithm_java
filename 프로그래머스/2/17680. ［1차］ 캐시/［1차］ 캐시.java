import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> cache = new LinkedList<>();
        int len = cities.length;
        if(cacheSize==0){
            return len*5;
        }
        for(int i=0;i<len;i++){
            String tmp = cities[i];
            tmp=tmp.toUpperCase();
            if(cache.contains(tmp)){//캐시에 있는경우
                answer+=1;
                cache.remove(tmp);
                cache.add(tmp);
            }
            else{//캐시에 없는경우
                answer+=5;
                if(cache.size()==cacheSize){//캐시가 꽉찬 경우 제거해야함
                    cache.poll();
                    cache.add(tmp);
                }
                else if(cache.size()<cacheSize){//캐시에 없고 캐시 자리가 여유 있다
                    cache.add(tmp);
                }
            }
        }
        return answer;
    }
}
//캐시 크기에 따른 실행시간 측정 프로그램
//LRU == LEAST RECENTLY USED 가장 오래전에 사용한거 제거 -> 선입선출 -> 큐 자료구조 사용해야함
//아 가장 오래전에 사용된거가 가장 오래전에 들어온거랑은 다르겠네.