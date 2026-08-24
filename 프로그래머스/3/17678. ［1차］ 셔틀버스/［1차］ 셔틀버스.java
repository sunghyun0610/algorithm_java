import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        int[] timeTable = new int[timetable.length];

        // 크루 도착 시간을 분으로 변환
        for (int i = 0; i < timetable.length; i++) {
            String[] crew = timetable[i].split(":");
            timeTable[i] = Integer.parseInt(crew[0]) * 60
                         + Integer.parseInt(crew[1]);
        }

        // 도착 시간이 빠른 순서대로 정렬
        Arrays.sort(timeTable);

        int idx = 0;
        int answer = 0;

        // 09:00 셔틀부터 순서대로 확인
        for (int i = 0; i < n; i++) {
            int shuttleTime = 540 + i * t;
            int peopleCnt = 0;

            // 현재 셔틀에 탈 수 있는 크루를 앞에서부터 태움
            while (idx < timeTable.length
                    && timeTable[idx] <= shuttleTime
                    && peopleCnt < m) {
                idx++;
                peopleCnt++;
            }

            // 마지막 셔틀인 경우 콘의 탑승 시간을 결정
            if (i == n - 1) {
                if (peopleCnt < m) {
                    // 자리가 남으면 셔틀 도착 시간에 와도 됨
                    answer = shuttleTime;
                } else {
                    // 꽉 찼으면 마지막 탑승자보다 1분 일찍
                    answer = timeTable[idx - 1] - 1;
                }
            }
        }

        int hour = answer / 60;
        int minute = answer % 60;

        return String.format("%02d:%02d", hour, minute);
    }
}