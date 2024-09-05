class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;//받은 콜라병 개수
        int cur_bottle=n;//보유중인 빈병
        while(cur_bottle>=a){
            System.out.println("answer : "+ answer);
            int get_coke=(cur_bottle/a)*b;//받은 콜라병 수
           answer+=get_coke;
            cur_bottle=cur_bottle-(cur_bottle/a)*a;//보유중인 빈병 구하는 식
            cur_bottle+=get_coke;//이상 보유중인 빈병 구하는 식
            System.out.println("cur_bottle : "+cur_bottle);
        }
        return answer;
    }
}
//빈병 a개를 가져다주면 b개 준다. n개 가져갔을 때 몇병 받을 수 있나