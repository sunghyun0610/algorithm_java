package implementation;

import java.io.*;

public class _4344_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine()); // 테스트 케이스의 수 -> bufferedreader는 모두 String으로 반환하믈 parseInt로 형 변환

        for (int i = 0; i < C; i++) {
            String[] input = br.readLine().split(" ");//공백으로 입력 구분 by split(" ")/or/ StringTokenizer
            int N = Integer.parseInt(input[0]); // 학생 수
            int[] scores = new int[N];
            int sum = 0;

            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(input[j + 1]); // 점수 입력
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
            bw.write(String.format("%.3f%%\n", percentage)); // 결과 값을 buffer에 저장
        }
        bw.flush(); // 남아있는 데이터를 모두 출력

    }
}
