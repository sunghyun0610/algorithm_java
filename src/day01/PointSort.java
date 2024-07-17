package day01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PointSort {
    public static void main(String[] args) {
        System.out.println("입력받을 좌표 개수 : ");

        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int [][]point=new int[size][2];//좌표이므로
        for(int i=0;i<size;i++){
            point[i][0]=scanner.nextInt();//x
            point[i][1]=scanner.nextInt();//y
        }
        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // x 좌표 기준 내림차순
                if (o1[0] != o2[0]) {
                    return Integer.compare(o2[0], o1[0]);
                }
                // x 좌표가 동일할 경우 y 좌표 기준 내림차순
                else {
                    return Integer.compare(o2[1], o1[1]);
                }
            }
        });

        for(int i=0;i<size;i++){
            System.out.println(point[i][0] + " "+point[i][1]);
        }

    }

}
