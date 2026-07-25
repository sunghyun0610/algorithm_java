class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int minPeople = 0;
        int maxPeople = Integer.MAX_VALUE;
        for(int a:stones){
            maxPeople = Math.max(a,maxPeople);
        }
       // int midPeople = minPeople + (maxPeople-minPeople)/2; //이분 탐색의 기준점
        
        while(minPeople<=maxPeople){
            int midPeople = minPeople + (maxPeople-minPeople)/2;
            if(canCross(stones,k,midPeople)){//이정도는 다 건널 수 있다
                // System.out.println("통과 : "+midPeople);
                minPeople = midPeople+1; 
                answer=midPeople;
            }
            else{
                // System.out.println("실패 : "+midPeople);
                maxPeople = midPeople-1;
            }
            
        }
       
        return answer;
    }
    public static boolean canCross(int[] stones, int k,int point){
       // point미만인 요소가 k개 연속으로 나오면 안됨
            int cnt=0;
            for(int i=0;i<stones.length;i++){
                if(stones[i]<point){
                    while(i<stones.length&&stones[i]<point){
                        cnt++;
                        i++;
                    }
                    if(cnt>=k){
                        return false;
                    }
                    cnt=0;
                }
            }
        return true;
    }
}