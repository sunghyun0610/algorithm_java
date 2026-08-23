class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int attackCnt = 0;//현재 공격 인덱스
        int currHealth = health;
        int time=0;//현재시간
        int consequenceTime = 0;
        int lastAttack = attacks[attacks.length-1][0];//마지막 공격 시간
        int nextAttackTime = attacks[attackCnt][0];
        // System.out.println("last : "+lastAttack + "nextAttackTime : "+nextAttackTime);
        while(time<=lastAttack){
            if(time==0){
                time++;
                consequenceTime++;
                continue;
            }
            if(time==nextAttackTime){
                // System.out.println("time : "+time + "공격받음");
                currHealth-=attacks[attackCnt][1];//체력 깍아야댐
                if(currHealth<=0) return -1; //사망
                if(nextAttackTime==lastAttack) {
                    System.out.println("마지막 공격" +currHealth);
                    return currHealth;
                }
                time++;
                attackCnt+=1;
                nextAttackTime = attacks[attackCnt][0];
                
                consequenceTime=1;
                
            }
            else{//공격 아닌경우
                if(consequenceTime==bandage[0]){//연속 회복성공한경우
                    // System.out.println("time : "+time + "연속 회복");
                        time++;
                        consequenceTime=1;
                        currHealth += bandage[1] + bandage[2];
                        if(currHealth>=health) currHealth = health;

                }
                else{//연속 회복은 아닌 경우
                    // System.out.println("time : "+time +" 현제 체력 : "+currHealth);
                    time++;
                    consequenceTime++;
                    currHealth +=bandage[1];
                    if(currHealth>=health) currHealth = health;
                    
                }
            }
            
        }
        return currHealth;
    }
}
//t초동안 붕대 감으면 1초마다 x만큼 회복 , t초연속 붕대 감으면, y만큼 체력 추가회복
//최대체력 존재
//공격당하면 붕대감기 취소, 당하는 순간  회복 못함 -> 그 즉시 다시 붕대감기 시전, 연속 성공시간 0으로 초기화
//체력 0이하면 죽음
//캐릭터가 끝까지 생존할 수 있는지 여부 궁금함 (모든 공격이 끝난 후 남은 체력 return)
// bandage [시전 시간, 초당 회복량, 추가 회복량]
// attacks [공격시간 , 피해량];