import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] value = new int[N];
        int[] result = new int[2];
        for (int i = 0; i < N; i++) {
            value[i] = sc.nextInt();
        }//용액 입력완료 이건 자동 정렬된상태
        int start = 0;
        int end = N - 1;
        int min = Integer.MAX_VALUE;
        while (start < end) {
            int sum = value[start] + value[end];
            int absSum = Math.abs(sum);
            if (sum < 0) {
                if (min > absSum) {
                    min = absSum;
                    result[0] = value[start];
                    result[1] =value[end];
                }
                start++;

            } else if (sum > 0) {
                if (min > absSum) {
                    min = absSum;
                    result[0] = value[start];
                    result[1] =value[end];
                }
                end--;
            } else if (sum == 0) {
                System.out.print(value[start] + " ");
                System.out.print(value[end]);
                return;
            }//합이 0이 되는경우
        }

        System.out.print(result[0] +" ");
        System.out.print(result[1]);
    }
}
//투포인터 느낌? 근데 크기 2로 고정 되어있다.
