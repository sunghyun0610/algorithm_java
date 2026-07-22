import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;// n-lost길이
        List<Integer> lostList = new ArrayList<>();
        for(int i=0;i<lost.length;i++){
            lostList.add(lost[i]);
        }

     List<Integer> reserveList = new ArrayList<>();
        for(int i=0;i<reserve.length;i++){
            reserveList.add(reserve[i]);
        }
        List reserveAndLostList = new ArrayList<>();
        for(int i=0;i<reserveList.size();i++){
            Integer reserveStudent = reserveList.get(i);
            if(lostList.contains(reserveStudent)){
                reserveAndLostList.add(reserveStudent); // 여벌있는 사람 중 도난 당한 사람은 제거해주기.
            }
        }
        for(int i=0;i<reserveAndLostList.size();i++){
            reserveList.remove(reserveAndLostList.get(i));
            lostList.remove(reserveAndLostList.get(i));
        }
        // for(Integer k : reserveList){
        //     System.out.println(k);
        // }
        //제거는 잘됐음
        Collections.sort(lostList);
        Collections.sort(reserveList);
        int borrow=0;
        for(int j=0;j<lostList.size();j++){
            Integer lostStudent = lostList.get(j);
            if(reserveList.contains(lostStudent-1)){
                borrow++;
                
                reserveList.remove(Integer.valueOf(lostStudent-1));
                continue;
            }
            if(reserveList.contains(lostStudent+1)){
                borrow++;
                
                reserveList.remove(Integer.valueOf(lostStudent+1));
                continue;
            }
        }
        
        return n-lostList.size()+borrow;
    }
}
//학생의 번호 체격순 -> 정렬되있네
// 체육복 최대한 많이 있게하라 즉, 학생 수만 구하면되긴함.
// 여벌 체육복 있는 학생이 도난당한 경우도 있음 -> reserve에서 삭제해야함.
