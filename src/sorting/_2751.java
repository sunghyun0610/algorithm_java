package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(num);
        for(int value : num) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}

//    private static void quickSort(int[] arr){
//        quickSort(arr,0,arr.length-1);
//    }
//    private static void quickSort(int[] arr,int start, int end){
//        int part2=partition(arr, start, end);// 집합 왼쪽 오른쪽으로 나누었을 때 오른쪽 첫번째 인덱스를 구하는 코드
//
//        if(start+1<part2){
//            quickSort(arr,start,part2-1);
//        }
//        if(part2<end){
//            quickSort(arr,part2,end);
//        }
//    }
//
//    private static int partition(int[] arr, int start, int end){
//
//        int pivot=arr[start+(end-start)/2];//중간값을 pivot으로
//
//        while(start<=end){
//            while(arr[start]<pivot) start++;
//            while(arr[end]>pivot) end--;
//            if(start<=end){
//                swap(arr,start,end);
//                start++;
//                end--;
//            }
//        }
//        return start;
//    }
//
//    private static void swap(int[] arr,int x,int y){
//        int tmp=arr[x];
//        arr[x]=arr[y];
//        arr[y]=tmp;
//        //x와 y는 인덱스이다. 그래야 참조형 매개변수로 값이 swap된다.
//    }
//}
//퀵 정렬 시간초과
//Arrays.sort시간초과
