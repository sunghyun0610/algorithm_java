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
                if(num[j]<num[j+1]){//여기선 내림차순 알고리즘
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
        //다음 for문에선 맨 앞자리값을 제외한 값 중 가장 작은 값을 찾고, 두번째 앞자리와 교환
        for (int i = 0; i < num.length - 1; i++) {
            // 현재 순회에서 가장 큰 값을 찾기 위해 i를 최대값 인덱스로 초기화
            int maxIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                // i+1번째 요소부터 시작하여 배열의 끝까지 최대값을 찾음
                if (num[j] > num[maxIndex]) {//첫번째 요소보다 num[j]가 더 클경우 -> 내림차순이므로 swap해야댐.
                    maxIndex = j; // 최대값의 인덱스를 갱신
                }
            }
            // 최대값을 현재 순회의 끝부분과 교환
            int temp = num[maxIndex];//최대값 발견한 인덱스(maxIndex)
            num[maxIndex] = num[i];//정렬 안된 부분 중 맨앞 값과 최대값 swap
            num[i] = temp;//정렬안된 부분 중 맨 앞에 최대값 삽입 ->이러면 swap완료
        }
        return num;
    }

    public static int [] insertion_sort(int[]num){

        //삽입정렬 : 현재 정렬되있는 부분 중에서 적절한 위치에 삽입시키는 방법
        for (int i = 1; i < num.length; i++) {//1부터 시작이유 : 정렬되어있다고 가정하고 시작하기 때문.
            int temp = num[i];//선택된 숫자
            int j;
            for (j = i; j > 0 && num[j - 1] < temp; j--) {
                num[j] = num[j - 1]; // 현재 요소보다 작은 요소들을 한 칸씩 뒤로 이동(내림차순)
            }
            num[j] = temp; // 적절한 위치에 현재 요소 삽입
        };

        return num;
    }
public class QuickSort{//pivot이 중간값
        //메서드 오버로딩
//        첫 번째 quickSort 메소드는 사용자가 배열만 넘겨주면 전체 배열을 정렬할 수 있도록 설계되었습니다. 이 메소드는 내부적으로 배열의 시작 인덱스와 끝 인덱스를 매개변수로 하는 두 번째 quickSort 메소드를 호출합니다.
//    두 번째 quickSort 메소드는 실제 퀵 정렬 로직을 수행합니다. 이 메소드는 배열, 시작 인덱스, 끝 인덱스를 매개변수로 받아, 지정된 범위 내에서 배열을 정렬합니다.

    public static void quickSort(int [] arr){
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int[] arr, int start, int end){
        int part2=partition(arr, start,end);//return된 start값이 저장됨.
        //양쪽 파티션의 크기가 1이되면 더 이상 재귀 호출 X
        if(start<part2-1){//pivot보다 작은그룹
            quickSort(arr,start,part2-1);
        }
        if(part2<end){//pivot보다 큰 그룹
            quickSort(arr,part2,end);
        }
    }
    private static int partition(int[] arr, int start,int end){
        int pivot= arr[(start+end)/2];
        while(start<=end){
            while(arr[start]<pivot) start++;//왼쪽에서부터 기준값보다 작은 값은 무시
            while (arr[end]>pivot) end--;//오른쪽에서부터 기준값보다 큰값들은 무시
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;//start가 가리키고 있는 배열 방이 바로 두 번째 파티션에 첫밴째 배열방 인덱스이다.
    }
    private static void swap(int[]arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }



}

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int []num=new int[str.length()];
        for (int i=0;i<str.length();i++){
            num[i]=Character.getNumericValue(str.charAt(i));// Character,getNumericValue : 단일문자 정수 변환
        }
        QuickSort.quickSort(num);//클래스 이름. 메서드이름() -> why? static 메서드 즉, 클래스 메서드이기 때문.

        for(int k : num){
            System.out.print(k);
        }

        //배열 입력까지 받았다.
    }



}
