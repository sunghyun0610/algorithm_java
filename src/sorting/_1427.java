package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1427 {

    public static int[] bubble_sort(int [] num){//static으로 선언한 이유 : 객체를 생성하지 않고도 접근할 수 있게 해야하기 때문. iv를 사용하지 않음.
        //버블 sort 는 한번 루프 돌때마다 마지막 자리가 정렬된다는 포인트 기억할 것!.
        boolean change=false;//
        int tmp=0;
        for(int i=0;i<num.length-1;i++){//인접한 수끼리 비교하며 정렬을 배열의 길이 -1만큼 반복
            for(int j=0;j<num.length-i-1;j++){//인접한 수 끼리 비교하며 정렬 //버블 sort 는 한번 루프 돌때마다 마지막 자리가 정렬된다는 포인트 기억할 것! -> num.length-i-1이 되는 것.
                if(num[j]<num[j+1]){
                    tmp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tmp;
                    change=true;
                }
            }
            if(change==false) break;//swap이 한번도 일어나지 않았다 -> 정렬이 더 이상 필요없다.
    }
        return num;//Java에서 배열은 참조 타입이므로 num 배열 자체가 정렬되며 별도로 복사됨. (주소가 저장됨)
    }

    public static int[] selection_sort(int num []){
        //선택정렬은 for문을 통해 가장 작은(큰) 값을 찾고, 맨 앞자리와 교환->오름차순의 경우, 내림차순은 반대
        for (int i = 0; i < num.length - 1; i++) {
            // 현재 순회에서 가장 큰 값을 찾기 위해 i를 최대값 인덱스로 초기화
            int maxIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                // i+1번째 요소부터 시작하여 배열의 끝까지 최대값을 찾음
                if (num[j] > num[maxIndex]) {
                    maxIndex = j; // 최대값의 인덱스를 갱신
                }
            }
            // 최대값을 현재 순회의 끝부분과 교환
            int temp = num[maxIndex];//최대값
            num[maxIndex] = num[i];//정렬 안된 부분 중 맨앞 값과 최대값 swap
            num[i] = temp;//정렬안된 부분 중 맨 앞에 최대값 삽입
        }
        return num;
    }

    public static int [] insertion_sort(int[]num){

        //삽입정렬 : 현재 정렬되있는 부분 중에서 적절한 위치에 삽입시키는 방법
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];//선택된 숫자
            int j;
            for (j = i; j > 0 && num[j - 1] < temp; j--) {
                num[j] = num[j - 1]; // 현재 요소보다 큰 요소들을 한 칸씩 뒤로 이동
            }
            num[j] = temp; // 적절한 위치에 현재 요소 삽입
        };

        return num;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int []num=new int[str.length()];
        for (int i=0;i<str.length();i++){
            num[i]=Character.getNumericValue(str.charAt(i));// Character,getNumericValue : 단일문자 정수 변환
        }
        insertion_sort(num);
        for(int k : num){
            System.out.print(k);
        }

        //배열 입력까지 받았다.
    }



}
