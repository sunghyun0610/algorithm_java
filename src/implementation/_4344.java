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
