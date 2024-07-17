package day01;

import java.util.Scanner;

/*윤년 판단 기준
- 년도를 4로 나누어떨어지면서 100으로는 나누어 떨어지면 안된다
- 다만 400으로 나누어 떨어지면 윤년
*
* */
public class DayOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 각 달의 일수를 저장하는 2차원 배열
        int[][] daysInMonth = {
                { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },     // 평년
                { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }      // 윤년
        };

        System.out.println("년 : ");
        int year = sc.nextInt();
        System.out.println("월 : ");
        int month = sc.nextInt();
        System.out.println("일 : ");
        int day = sc.nextInt();

        // 윤년 여부 계산
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int leap = isLeap ? 1 : 0;

        int dayCounts = 0;
        for (int i = 0; i < month - 1; i++) {
            System.out.println((i + 1) + "월: " + daysInMonth[leap][i] + "일");
            dayCounts += daysInMonth[leap][i];
        }
        System.out.println(month + "월: " + day + "일");
        dayCounts += day;

        System.out.println("total: " + dayCounts);
        System.out.println(year + "년 " + dayCounts + "일째 입니다.");
    }
}