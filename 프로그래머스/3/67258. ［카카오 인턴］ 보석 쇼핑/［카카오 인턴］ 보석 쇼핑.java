import java.util.Set;
import java.util.HashSet;
import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        Map<String,Integer> gemsMap = new HashMap<>();// (종류고 마지막 인덱스임)
        Set<String> gemsSet = new HashSet<>();
        Set<String> newGemsSet = new HashSet<>();
        
        for(String gem: gems){
            gemsSet.add(gem);
        } // 보석 종류 다 get
     
        int gemType = gemsSet.size();
        //이 크기로 슬라이딩 윈도우 탐색 가자
       
        int cnt=0;
        int windowSize = gemType;
        
        int left = 0;
        int bestStart = 0;
        int bestend = gems.length-1;
        int minLength = gems.length;
        
        for(int right=0; right<gems.length;right++){
            gemsMap.put(gems[right], gemsMap.getOrDefault(gems[right],0)+1);
        
        //모든 종류가 포함된 상태라면 왼쪽을 최대한 줄인다
        while(gemsMap.size()==gemType){
            int currentLength = right-left+1;
            if (currentLength < minLength) {
                    minLength = currentLength;
                    bestStart = left;
                    bestend = right;
            }
            //left 보석 제거
             String leftGem = gems[left];
            gemsMap.put(leftGem, gemsMap.get(leftGem) - 1);
            
             // 해당 보석이 구간에 하나도 없다면 Map에서 제거
            if (gemsMap.get(leftGem) == 0) {
             gemsMap.remove(leftGem);
            }
            left++;
        }
    }
        
       

        
        return new int[]{bestStart + 1, bestend + 1};
    }
}
//연속적인 범위 탐색이네 -> 투 포인터
//gems의 크기 100000이하
// 문자열 포함여부 -> 해시 써야겠다
// 정렬도 못한다
