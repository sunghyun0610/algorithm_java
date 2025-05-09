class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; // 가로, 세로
        int width =0;//가로
        int height =0;//세로
        if(yellow==1){
            answer[0]=3;
            answer[1]=3;
            return answer;
        }
        
        int idx=2;
        int quot=0;
        while(idx<=yellow){
            quot=0;
            if(yellow%idx==0){
                quot = yellow/idx;
                int sum = 2*(quot+2) + 2*(idx+2)-4;
                System.out.println(sum);
                if(sum==brown){
                    if(quot>idx){
                        width=quot+2;
                        height=idx+2;
                        break;
                    }
                    else{
                        width=idx+2;
                        height=quot+2;
                        break;
                    }
                }
                
             }
            idx++;
        }
        answer[0]=width;
        answer[1]=height;
        return answer;
    }
}
//가로 길이가 세로길이보다 무조건 크거나 같다.
//brown + yellow = 전체 세로 * 가로이다
//그럼이제 전체 세로 혹은 가로만 안다면 완성 가능인데.
//어쨋든 가로세로는 일정해야하므로 나누어 떨어지는 수이다