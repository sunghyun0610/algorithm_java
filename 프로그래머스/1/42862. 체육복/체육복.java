import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for (int l : lost) {
            lostList.add(l);
        }
        for (int r : reserve) {
            reserveList.add(r);
        }
        Collections.sort(lostList);
        Collections.sort(reserveList);
        // 여벌 체육복이 있지만 체육복을 도난당한 학생 제거
        lostList.removeIf(lostStudent -> reserveList.remove(Integer.valueOf(lostStudent)));

        // 남은 lostList에 대해서 체육복 빌려주기 로직
        Iterator<Integer> it = lostList.iterator();
        while (it.hasNext()) {
            int lostStudent = it.next();
            if (reserveList.contains(lostStudent - 1)) {
                reserveList.remove(Integer.valueOf(lostStudent - 1));
                it.remove();
            } else if (reserveList.contains(lostStudent + 1)) {
                reserveList.remove(Integer.valueOf(lostStudent + 1));
                it.remove();
            }
        }

        return n - lostList.size();
    }
}
