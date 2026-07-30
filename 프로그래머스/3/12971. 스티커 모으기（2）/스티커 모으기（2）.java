class Solution {
    public int solution(int sticker[]) {
        int answer = 0;
        int stickerNum  = sticker.length;
        boolean[] visited = new boolean[stickerNum];
        //첫번째 스티커를 뜯은 경우
        if(stickerNum==1) return sticker[0];
        int[] dpSticker1 = new int[stickerNum];
        dpSticker1[0]=sticker[0];
        dpSticker1[1] = sticker[0];
        
        //첫번째 스티커를 뜯지 않은 경우
        int[] dpSticker2 = new int[stickerNum];
        dpSticker2[0]=0;
        dpSticker2[1]=sticker[1];
        for(int i=2;i<stickerNum-1;i++){
            dpSticker1[i] = Math.max(dpSticker1[i-1],dpSticker1[i-2]+sticker[i]);//전게 더 큰지 , 내꺼 뽑는게 더큰지
        }
        int max1 = dpSticker1[stickerNum-2];
        for(int j=2;j<stickerNum;j++){
            dpSticker2[j] = Math.max(dpSticker2[j-1],dpSticker2[j-2]+sticker[j]); 
        }
        int max2=dpSticker2[stickerNum-1];
        answer = Math.max(max1,max2);
        return answer;
    }
        
     
}
//첫번 째 원소 뽑으면 마지막 원소 못 뽑는다
//그리디는 아닌듯, 정렬도 아님
//숫자가 중복될 수 도 있다
//dp? -> 아님
//dfs면 시간초과날거같은데