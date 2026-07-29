class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        int currIndex=1;
        int range =2*w+1;        
        for(int station : stations){
            int leftLen = station-w-currIndex; // station 전 왼쪽 처리
            if(leftLen>0){
                answer+= (leftLen+range-1)/range;
            }
          
            currIndex=station+w+1;
        }
        
        if(currIndex<=n){
            int rightLen = n-currIndex+1;
            answer += (rightLen+range-1) / range;
        }


        return answer;
    }
}