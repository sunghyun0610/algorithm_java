class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneCnt = findOneCnt(n);
        // System.out.println(oneCnt);
        int temp = n+1;
        while(true){
            if(findOneCnt(temp)==oneCnt){
                answer=temp;
                break;
            }
            temp++;
        }
        return answer;
    }
    public int findOneCnt(int num){
        int cnt=0;
        while(num>0){
            if(num%2==1) cnt++;
            num/=2;
        }
        return cnt;
    }
}
//n의 다음 큰 숫자를 구하가