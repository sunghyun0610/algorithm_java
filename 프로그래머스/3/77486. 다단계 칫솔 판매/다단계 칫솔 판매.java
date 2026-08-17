import java.util.*;
class Solution {
    static class PersonNode{
        int money;
        String sellerName;
        String referralName;
        PersonNode(int money,String sellerName,  String referralName){
            this.money = money;
            this.sellerName = sellerName;
            this.referralName = referralName;
        }
    }
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int peopleCnt = enroll.length; // 판매원 명수
        int[] answer = new int [peopleCnt];
        int sellerCnt = seller.length;
        Map<String,PersonNode> sellerProfitMap = new HashMap<>();
        
        for(int i=0;i<peopleCnt;i++){
            String sellerName = enroll[i];
            String referralName = referral[i];
             // System.out.println("seller : "+sellerName + " referralName: "+referralName);
            sellerProfitMap.put(sellerName, new PersonNode(0,sellerName,referralName));
        }
        // for(String k :sellerProfitMap.keySet()){
        //     PersonNode temp = sellerProfitMap.get(k);
        //     System.out.println("referName : "+ temp.referralName + " key :"+k);
        // }
        
        for(int i=0;i<sellerCnt;i++){
            String sellerName = seller[i];
            int productCnt = amount[i];
            int money = 100*productCnt;
            PersonNode sellerNode = sellerProfitMap.get(sellerName);
            // System.out.println("seller : "+sellerName);
            distributeFunction(sellerProfitMap,sellerNode,money);
            
        }
        for(int i=0;i<peopleCnt;i++){
            String name = enroll[i]; //이 순서 맞춰야함
            PersonNode temp = sellerProfitMap.get(name);
            answer[i] = temp.money;
        }
        return answer;
    }
    static void distributeFunction( Map<String,PersonNode> sellerProfitMap, 
                                   PersonNode sellerNode, int money){
        //수익에대한 분배가 이루어지는 함수 (본인 포함)
        String sellerName = sellerNode.sellerName;
        String referralName = sellerNode.referralName;
        int currMoney = sellerNode.money;
        sellerProfitMap.put(sellerName, new PersonNode(currMoney + (int) (money*0.9),
                                                      sellerName,referralName));
        money=(int) (money*0.1);//자기돈 분배 완료
        while(money>0 ){
                //money가 1원 미만이거나, 추천인이 없는경우 stop
            if (referralName.equals("-")) {
                    return;
                }
        
            PersonNode referalPersonNode = sellerProfitMap.get(referralName);//추천인 노드 찾음
            
            int referralCurrMoney = referalPersonNode.money;
            int referralMoney = (int)(money * 0.1);
        if(referralMoney < 1){
    sellerProfitMap.put(
        referralName,
        new PersonNode(
            referralCurrMoney + money,
            referalPersonNode.sellerName,
            referalPersonNode.referralName
        )
    );
    return;
}
            sellerProfitMap.put(
            referralName,
            new PersonNode(
                referralCurrMoney + (money - referralMoney),
                referalPersonNode.sellerName,
                referalPersonNode.referralName
            )
        );
            money= referralMoney;//자기돈 분배 완료
            referralName = referalPersonNode.referralName;
        }
        return;
    } 
}



// 추천인에 연결되는 구조
// 이익의 10%를 추천인에게 배분
//모든 판매원은 자신의 판매 이익 + 자신이 추천하여 가입시킨 판매원에게서부터 발생하는 이익의10%
//10% 금액이 1원 미민이면 분배 X 자시니 모두 가짐
//이익은 개당 100원
// 각 판매원이 득한 이익금을 나열한 배열 return하라
// 판매원 이름을 담은 배열 enroll(center를 제외한 조직 구성원의 총 수) , 조직에 참여한 순서에 따름
// referral의 길이는 enroll과 같다.
// level1의 조직원들은 추천인이 없으므로 referral배열에 "-"로 기입됨.
//seller는 판매원 이름을 나열한 배열 (seller길이만큼 판매가 이루어진거임), amount