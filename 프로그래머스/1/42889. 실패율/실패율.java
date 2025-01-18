import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 각 스테이지에 멈춰있는 사용자 수 카운팅을 위한 배열
        // 예) count[3] = 스테이지 3에서 멈춰있는 사용자 수
        // N+1 사용 가능 (N+1번째 스테이지 = "모두 클리어한 상태")
        int[] count = new int[N + 2];

        // 입력 배열(stages) 기반으로 몇 명이 어느 스테이지에 머무는지 계산
        for (int s : stages) {
            count[s]++;
        }

        // 실패율 계산 배열 (인덱스 1~N 사용)
        double[] failRate = new double[N + 1];

        int totalPlayers = stages.length; // 현재 스테이지에 도달한 플레이어 수 (초기: 전체 유저 수)

        // 스테이지 1부터 N까지 순회
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                // 더 이상 도달한 유저가 없다면, 실패율 0
                failRate[i] = 0.0;
            } else {
                // i번 스테이지 실패율 = 머무는 사람 수 / 도달한 사람 수
                failRate[i] = (double) count[i] / totalPlayers;
            }
            // i번 스테이지에서 멈춘 인원은 다음 스테이지 도전자에서 제외
            totalPlayers -= count[i];
        }

        // (스테이지 번호, 실패율)을 묶어 정렬하기 위해 리스트 생성
        List<Stage> stageList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stageList.add(new Stage(i, failRate[i]));
        }

        // **정렬**: 1) 실패율 내림차순, 2) 스테이지 번호 오름차순
        stageList.sort((o1, o2) -> {
            if (o1.rate == o2.rate) {
                // 실패율 같으면 스테이지 번호가 작은 순
                return Integer.compare(o1.stageNum, o2.stageNum);
            }
            // 실패율 다르면 내림차순 (큰 값이 더 앞)
            // Double.compare(a, b)는 a < b 이면 음수, a == b 이면 0, a > b 이면 양수
            // 내림차순을 위해서는 비교 순서를 바꾼다.
            return Double.compare(o2.rate, o1.rate);
        });

        // 정렬된 결과에서 스테이지 번호만 뽑아 반환
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageList.get(i).stageNum;
        }

        return answer;
    }

    // 스테이지 번호와 실패율을 담을 간단한 클래스
    static class Stage {
        int stageNum;
        double rate;

        Stage(int stageNum, double rate) {
            this.stageNum = stageNum;
            this.rate = rate;
        }
    }
}
