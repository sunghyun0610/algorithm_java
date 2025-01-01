class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n+1];//1부터 시작하므로
        // for(int i=0;i<section.length;i++){
        //     wall[section[i]]=1;//색칠 해야할 곳 표시
        // }
        int tmp=0;
        for(int i=0;i<section.length;i++){
            if(tmp<=section[i]){
                answer++;
                tmp = section[i] + m;
            }
        }
    
        // int start = section[0];//인덱스 1부터 시작하기 때문
        // for(int j = start; j<wall.length;j+=m){
        //     if(wall[j] == 1){
        //         for(int k=0;k<m;k++){
        //             if((j+k)<wall.length){
        //              wall[j+k]=0;   
        //             }
        //             else{
        //                 break;
        //             }
        //         }
        //         answer++;
        //     }
        // }
        return answer;
    }
}
//벽을 1미터 길이의 구역 N개로 나눔 -> 배열의 크기
//롤러의 길이는 m미터
//숫자 0 : 색칠된 것 숫자 1 : 색칠 해야할 곳