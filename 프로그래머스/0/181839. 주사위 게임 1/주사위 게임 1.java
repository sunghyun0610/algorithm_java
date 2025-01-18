class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int rest1= a%2;
        int rest2 = b%2;
        if(rest1==1 && rest2==1){
            answer = (a*a) + (b*b);
        }
        else if(rest1==0 && rest2==0){
            answer = Math.abs(a-b);
        }
        else{
            answer =2*(a+b);
        }
        return answer;
    }
}