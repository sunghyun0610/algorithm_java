class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            int p = countNum(i);
            // System.out.println(p);
            if(p>limit) answer+=power;
            else answer+=p;
        }
        return answer;
    }
    int countNum(int num){//약수 개수 구하는 함수
        int sqrt = (int)Math.sqrt(num);
        int count=0;
        for(int i=1;i<=sqrt;i++){
            if(num%i==0) count++;
        }
        if(sqrt*sqrt == num){
            count=count*2 -1;
        }
        else count*=2;
        return count;
    }
}
//자신의 기사 번호 약수 개수에 해당하는 공격력을 가진 무기 구매한다
//제한수치보다 큰 공격력 구매해야하는 기사는 협약기관에서 정한 공격력 가지는 무기로 구매해야함
//필요한 철의 무게
//약수의 개수 구하는 함수