package implementation;

public class Test {
    public static int[] solution(int[][] arr) {
        int n = arr[0].length; // arr의 가로(열) 길이
        int m = arr.length; // arr의 세로(행) 길이

        int[] result = new int[n]; // 각 숫자별 이동거리를 저장할 배열

        // 숫자별로 시작점에서 이동 거리 계산
        for (int num = 0; num < n; num++) {
            int totalDistance = 0; // num 숫자의 총 이동 거리
            int currentColumn = -1;

            // 0행에서 num의 위치 찾기
            for (int col = 0; col < n; col++) {
                if (arr[0][col] == num) {
                    currentColumn = col;
                    break;
                }
            }

            // 각 행을 따라 num의 위치를 찾고 이동거리 계산
            for (int row = 0; row < m - 1; row++) {
                int nextColumn = -1;
                for (int col = 0; col < n; col++) {
                    if (arr[row + 1][col] == num) {
                        nextColumn = col;
                        break;
                    }
                }
                totalDistance += Math.abs(nextColumn - currentColumn);
                currentColumn = nextColumn; // 다음 행으로 이동
            }

            result[num] = totalDistance;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2},
                {0,1,2},

        };
        int[] result = solution(arr);
        for (int distance : result) {
            System.out.print(distance + " ");
        }
        // Expected output: [3, 4, 3, 2]
    }
}
