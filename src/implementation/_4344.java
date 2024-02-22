package implementation;
import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 테스트 케이스의 수

        for (int i = 0; i < C; i++) {
            int N = sc.nextInt(); // 학생 수
            int[] scores = new int[N];
            int sum = 0;

            for (int j = 0; j < N; j++) {
                scores[j] = sc.nextInt(); // 점수 입력
                sum += scores[j]; // 점수 합계
            }

            double average = (double) sum / N; // 평균 계산
            int count = 0; // 평균을 넘는 학생 수

            for (int score : scores) {
                if (score > average) {
                    count++;
                }
            }

            double percentage = (double) count / N * 100; // 평균을 넘는 학생의 비율
            System.out.printf("%.3f%%\n", percentage); // 결과 출력
        }
        sc.close();
    }
}
//신기하다 한번에 입력-> 한번에 출력이 가능하구나 내가 로직을 각 테스트 케이스에 따라 입력1->출력1->입력2->출력2 이렇게 짜도, 한번에 입력값 모두 입력 후 모두 출력이 가능하다.
//시각적으로는  "전체 입력 후 전체 출력"처럼 보이지만, 실제로는 프로그램 내부에서는 "입력 → 처리 → 출력"의 순환 과정이 각 테스트 케이스마다 반복되고 있는 것
//한번에 입력받은 경우 버퍼에 저장해놓은 후  사용자는 실행 시작 시 모든 입력(nextInt() 또는 nextLine() 메서드 호출 시)을 한 번에 제공할 수 있으며, 프로그램은 이를 순차적으로 처리하여 결과를 출력